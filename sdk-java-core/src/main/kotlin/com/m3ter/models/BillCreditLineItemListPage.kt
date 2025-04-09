// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.bills.CreditLineItemService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List the Credit line items for the given Bill. */
class BillCreditLineItemListPage
private constructor(
    private val creditLineItemsService: CreditLineItemService,
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

        return /* spotless:off */ other is BillCreditLineItemListPage && creditLineItemsService == other.creditLineItemsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(creditLineItemsService, params, response) /* spotless:on */

    override fun toString() =
        "BillCreditLineItemListPage{creditLineItemsService=$creditLineItemsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BillCreditLineItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<BillCreditLineItemListPage> {
        return getNextPageParams().map { creditLineItemsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            creditLineItemsService: CreditLineItemService,
            params: BillCreditLineItemListParams,
            response: BillCreditLineItemListPageResponse,
        ) = BillCreditLineItemListPage(creditLineItemsService, params, response)
    }

    class AutoPager(private val firstPage: BillCreditLineItemListPage) :
        Iterable<CreditLineItemResponse> {

        override fun iterator(): Iterator<CreditLineItemResponse> = iterator {
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

        fun stream(): Stream<CreditLineItemResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
