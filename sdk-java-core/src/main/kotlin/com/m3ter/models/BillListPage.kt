// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.BillService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of Bills.
 *
 * This endpoint retrieves a list of all Bills for the given Account within the specified
 * Organization. Optional filters can be applied such as by date range, lock status, or other
 * attributes. The list can also be paginated for easier management.
 */
class BillListPage
private constructor(
    private val billsService: BillService,
    private val params: BillListParams,
    private val response: BillListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): BillListPageResponse = response

    /**
     * Delegates to [BillListPageResponse], but gracefully handles missing data.
     *
     * @see [BillListPageResponse.data]
     */
    fun data(): List<BillResponse> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillListPageResponse], but gracefully handles missing data.
     *
     * @see [BillListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillListPage && billsService == other.billsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(billsService, params, response) /* spotless:on */

    override fun toString() =
        "BillListPage{billsService=$billsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BillListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<BillListPage> {
        return getNextPageParams().map { billsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(billsService: BillService, params: BillListParams, response: BillListPageResponse) =
            BillListPage(billsService, params, response)
    }

    class AutoPager(private val firstPage: BillListPage) : Iterable<BillResponse> {

        override fun iterator(): Iterator<BillResponse> = iterator {
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

        fun stream(): Stream<BillResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
