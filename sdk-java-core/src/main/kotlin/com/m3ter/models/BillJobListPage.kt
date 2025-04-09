// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.BillJobService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of BillJobs.
 *
 * This endpoint retrieves a list of BillJobs for a specified organization. The list can be
 * paginated for easier management, and allows you to query and filter based on various parameters,
 * such as BillJob `status` and whether or not BillJob remains `active`.
 */
class BillJobListPage
private constructor(
    private val billJobsService: BillJobService,
    private val params: BillJobListParams,
    private val response: BillJobListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): BillJobListPageResponse = response

    /**
     * Delegates to [BillJobListPageResponse], but gracefully handles missing data.
     *
     * @see [BillJobListPageResponse.data]
     */
    fun data(): List<BillJobResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillJobListPageResponse], but gracefully handles missing data.
     *
     * @see [BillJobListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillJobListPage && billJobsService == other.billJobsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(billJobsService, params, response) /* spotless:on */

    override fun toString() =
        "BillJobListPage{billJobsService=$billJobsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BillJobListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<BillJobListPage> {
        return getNextPageParams().map { billJobsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            billJobsService: BillJobService,
            params: BillJobListParams,
            response: BillJobListPageResponse,
        ) = BillJobListPage(billJobsService, params, response)
    }

    class AutoPager(private val firstPage: BillJobListPage) : Iterable<BillJobResponse> {

        override fun iterator(): Iterator<BillJobResponse> = iterator {
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

        fun stream(): Stream<BillJobResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
