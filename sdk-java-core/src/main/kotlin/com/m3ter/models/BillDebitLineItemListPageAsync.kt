// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.bills.DebitLineItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List the Debit line items for the given bill. */
class BillDebitLineItemListPageAsync
private constructor(
    private val debitLineItemsService: DebitLineItemServiceAsync,
    private val params: BillDebitLineItemListParams,
    private val response: BillDebitLineItemListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): BillDebitLineItemListPageResponse = response

    /**
     * Delegates to [BillDebitLineItemListPageResponse], but gracefully handles missing data.
     *
     * @see [BillDebitLineItemListPageResponse.data]
     */
    fun data(): List<DebitLineItemResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillDebitLineItemListPageResponse], but gracefully handles missing data.
     *
     * @see [BillDebitLineItemListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillDebitLineItemListPageAsync && debitLineItemsService == other.debitLineItemsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(debitLineItemsService, params, response) /* spotless:on */

    override fun toString() =
        "BillDebitLineItemListPageAsync{debitLineItemsService=$debitLineItemsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BillDebitLineItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<BillDebitLineItemListPageAsync>> {
        return getNextPageParams()
            .map { debitLineItemsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            debitLineItemsService: DebitLineItemServiceAsync,
            params: BillDebitLineItemListParams,
            response: BillDebitLineItemListPageResponse,
        ) = BillDebitLineItemListPageAsync(debitLineItemsService, params, response)
    }

    class AutoPager(private val firstPage: BillDebitLineItemListPageAsync) {

        fun forEach(
            action: Predicate<DebitLineItemResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BillDebitLineItemListPageAsync>>.forEach(
                action: (DebitLineItemResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<DebitLineItemResponse>> {
            val values = mutableListOf<DebitLineItemResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
