// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.bills.LineItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Lists all the line items for a specific Bill.
 *
 * This endpoint retrieves a list of line items for the given Bill within the specified
 * Organization. The list can also be paginated for easier management. The line items returned in
 * the list include individual charges, discounts, or adjustments within a Bill.
 */
class BillLineItemListPageAsync
private constructor(
    private val lineItemsService: LineItemServiceAsync,
    private val params: BillLineItemListParams,
    private val response: BillLineItemListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): BillLineItemListPageResponse = response

    /**
     * Delegates to [BillLineItemListPageResponse], but gracefully handles missing data.
     *
     * @see [BillLineItemListPageResponse.data]
     */
    fun data(): List<LineItemResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillLineItemListPageResponse], but gracefully handles missing data.
     *
     * @see [BillLineItemListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillLineItemListPageAsync && lineItemsService == other.lineItemsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(lineItemsService, params, response) /* spotless:on */

    override fun toString() =
        "BillLineItemListPageAsync{lineItemsService=$lineItemsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BillLineItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<BillLineItemListPageAsync>> {
        return getNextPageParams()
            .map { lineItemsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            lineItemsService: LineItemServiceAsync,
            params: BillLineItemListParams,
            response: BillLineItemListPageResponse,
        ) = BillLineItemListPageAsync(lineItemsService, params, response)
    }

    class AutoPager(private val firstPage: BillLineItemListPageAsync) {

        fun forEach(
            action: Predicate<LineItemResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BillLineItemListPageAsync>>.forEach(
                action: (LineItemResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<LineItemResponse>> {
            val values = mutableListOf<LineItemResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
