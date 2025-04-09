// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.bills.LineItemService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Lists all the line items for a specific Bill.
 *
 * This endpoint retrieves a list of line items for the given Bill within the specified
 * Organization. The list can also be paginated for easier management. The line items returned in
 * the list include individual charges, discounts, or adjustments within a Bill.
 */
class BillLineItemListPage
private constructor(
    private val lineItemsService: LineItemService,
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

        return /* spotless:off */ other is BillLineItemListPage && lineItemsService == other.lineItemsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(lineItemsService, params, response) /* spotless:on */

    override fun toString() =
        "BillLineItemListPage{lineItemsService=$lineItemsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BillLineItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<BillLineItemListPage> {
        return getNextPageParams().map { lineItemsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            lineItemsService: LineItemService,
            params: BillLineItemListParams,
            response: BillLineItemListPageResponse,
        ) = BillLineItemListPage(lineItemsService, params, response)
    }

    class AutoPager(private val firstPage: BillLineItemListPage) : Iterable<LineItemResponse> {

        override fun iterator(): Iterator<LineItemResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<LineItemResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
