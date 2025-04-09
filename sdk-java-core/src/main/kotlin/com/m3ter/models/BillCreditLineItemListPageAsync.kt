// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.bills.CreditLineItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List the Credit line items for the given Bill. */
class BillCreditLineItemListPageAsync
private constructor(
    private val creditLineItemsService: CreditLineItemServiceAsync,
    private val params: BillCreditLineItemListParams,
    private val response: BillCreditLineItemListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): BillCreditLineItemListPageResponse = response

    /**
     * Delegates to [BillCreditLineItemListPageResponse], but gracefully handles missing data.
     *
     * @see [BillCreditLineItemListPageResponse.data]
     */
    fun data(): List<CreditLineItemResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillCreditLineItemListPageResponse], but gracefully handles missing data.
     *
     * @see [BillCreditLineItemListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillCreditLineItemListPageAsync && creditLineItemsService == other.creditLineItemsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(creditLineItemsService, params, response) /* spotless:on */

    override fun toString() =
        "BillCreditLineItemListPageAsync{creditLineItemsService=$creditLineItemsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BillCreditLineItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<BillCreditLineItemListPageAsync>> {
        return getNextPageParams()
            .map { creditLineItemsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            creditLineItemsService: CreditLineItemServiceAsync,
            params: BillCreditLineItemListParams,
            response: BillCreditLineItemListPageResponse,
        ) = BillCreditLineItemListPageAsync(creditLineItemsService, params, response)
    }

    class AutoPager(private val firstPage: BillCreditLineItemListPageAsync) {

        fun forEach(
            action: Predicate<CreditLineItemResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BillCreditLineItemListPageAsync>>.forEach(
                action: (CreditLineItemResponse) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<CreditLineItemResponse>> {
            val values = mutableListOf<CreditLineItemResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
