// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.PlanGroupLinkService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of PlanGroupLink entities */
class PlanGroupLinkListPage
private constructor(
    private val planGroupLinksService: PlanGroupLinkService,
    private val params: PlanGroupLinkListParams,
    private val response: PlanGroupLinkListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PlanGroupLinkListPageResponse = response

    /**
     * Delegates to [PlanGroupLinkListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanGroupLinkListPageResponse.data]
     */
    fun data(): List<PlanGroupLinkResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanGroupLinkListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanGroupLinkListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanGroupLinkListPage && planGroupLinksService == other.planGroupLinksService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(planGroupLinksService, params, response) /* spotless:on */

    override fun toString() =
        "PlanGroupLinkListPage{planGroupLinksService=$planGroupLinksService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<PlanGroupLinkListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<PlanGroupLinkListPage> {
        return getNextPageParams().map { planGroupLinksService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            planGroupLinksService: PlanGroupLinkService,
            params: PlanGroupLinkListParams,
            response: PlanGroupLinkListPageResponse,
        ) = PlanGroupLinkListPage(planGroupLinksService, params, response)
    }

    class AutoPager(private val firstPage: PlanGroupLinkListPage) :
        Iterable<PlanGroupLinkResponse> {

        override fun iterator(): Iterator<PlanGroupLinkResponse> = iterator {
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

        fun stream(): Stream<PlanGroupLinkResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
