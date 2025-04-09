// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.CompoundAggregationService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of all CompoundAggregations.
 *
 * This endpoint retrieves a list of CompoundAggregations associated with a specific organization.
 * CompoundAggregations enable you to define numerical measures based on simple Aggregations of
 * usage data. It supports pagination, and includes various query parameters to filter the
 * CompoundAggregations based on Product, CompoundAggregation IDs or short codes.
 */
class CompoundAggregationListPage
private constructor(
    private val compoundAggregationsService: CompoundAggregationService,
    private val params: CompoundAggregationListParams,
    private val response: CompoundAggregationListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CompoundAggregationListPageResponse = response

    /**
     * Delegates to [CompoundAggregationListPageResponse], but gracefully handles missing data.
     *
     * @see [CompoundAggregationListPageResponse.data]
     */
    fun data(): List<CompoundAggregationResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CompoundAggregationListPageResponse], but gracefully handles missing data.
     *
     * @see [CompoundAggregationListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CompoundAggregationListPage && compoundAggregationsService == other.compoundAggregationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(compoundAggregationsService, params, response) /* spotless:on */

    override fun toString() =
        "CompoundAggregationListPage{compoundAggregationsService=$compoundAggregationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CompoundAggregationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CompoundAggregationListPage> {
        return getNextPageParams().map { compoundAggregationsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            compoundAggregationsService: CompoundAggregationService,
            params: CompoundAggregationListParams,
            response: CompoundAggregationListPageResponse,
        ) = CompoundAggregationListPage(compoundAggregationsService, params, response)
    }

    class AutoPager(private val firstPage: CompoundAggregationListPage) :
        Iterable<CompoundAggregationResponse> {

        override fun iterator(): Iterator<CompoundAggregationResponse> = iterator {
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

        fun stream(): Stream<CompoundAggregationResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
