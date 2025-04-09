// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.bills.DebitLineItemService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List the Debit line items for the given bill. */
class BillDebitLineItemListPage
private constructor(
    private val debitLineItemsService: DebitLineItemService,
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

        return /* spotless:off */ other is BillDebitLineItemListPage && debitLineItemsService == other.debitLineItemsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(debitLineItemsService, params, response) /* spotless:on */

    override fun toString() =
        "BillDebitLineItemListPage{debitLineItemsService=$debitLineItemsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BillDebitLineItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<BillDebitLineItemListPage> {
        return getNextPageParams().map { debitLineItemsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            debitLineItemsService: DebitLineItemService,
            params: BillDebitLineItemListParams,
            response: BillDebitLineItemListPageResponse,
        ) = BillDebitLineItemListPage(debitLineItemsService, params, response)
    }

    class AutoPager(private val firstPage: BillDebitLineItemListPage) :
        Iterable<DebitLineItemResponse> {

        override fun iterator(): Iterator<DebitLineItemResponse> = iterator {
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

        fun stream(): Stream<DebitLineItemResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
