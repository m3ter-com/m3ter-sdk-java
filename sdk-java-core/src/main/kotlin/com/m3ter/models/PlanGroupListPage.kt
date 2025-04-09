// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.PlanGroupService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of PlanGroups.
 *
 * Retrieves a list of PlanGroups within the specified organization. You can optionally filter by
 * Account IDs or PlanGroup IDs, and also paginate the results for easier management.
 */
class PlanGroupListPage
private constructor(
    private val planGroupsService: PlanGroupService,
    private val params: PlanGroupListParams,
    private val response: PlanGroupListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PlanGroupListPageResponse = response

    /**
     * Delegates to [PlanGroupListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanGroupListPageResponse.data]
     */
    fun data(): List<PlanGroupResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanGroupListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanGroupListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanGroupListPage && planGroupsService == other.planGroupsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(planGroupsService, params, response) /* spotless:on */

    override fun toString() =
        "PlanGroupListPage{planGroupsService=$planGroupsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<PlanGroupListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<PlanGroupListPage> {
        return getNextPageParams().map { planGroupsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            planGroupsService: PlanGroupService,
            params: PlanGroupListParams,
            response: PlanGroupListPageResponse,
        ) = PlanGroupListPage(planGroupsService, params, response)
    }

    class AutoPager(private val firstPage: PlanGroupListPage) : Iterable<PlanGroupResponse> {

        override fun iterator(): Iterator<PlanGroupResponse> = iterator {
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

        fun stream(): Stream<PlanGroupResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
