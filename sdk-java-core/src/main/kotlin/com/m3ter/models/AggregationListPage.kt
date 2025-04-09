// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.AggregationService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of Aggregations that can be filtered by Product, Aggregation ID, or Code. */
class AggregationListPage
private constructor(
    private val aggregationsService: AggregationService,
    private val params: AggregationListParams,
    private val response: AggregationListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AggregationListPageResponse = response

    /**
     * Delegates to [AggregationListPageResponse], but gracefully handles missing data.
     *
     * @see [AggregationListPageResponse.data]
     */
    fun data(): List<AggregationResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AggregationListPageResponse], but gracefully handles missing data.
     *
     * @see [AggregationListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AggregationListPage && aggregationsService == other.aggregationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(aggregationsService, params, response) /* spotless:on */

    override fun toString() =
        "AggregationListPage{aggregationsService=$aggregationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<AggregationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<AggregationListPage> {
        return getNextPageParams().map { aggregationsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            aggregationsService: AggregationService,
            params: AggregationListParams,
            response: AggregationListPageResponse,
        ) = AggregationListPage(aggregationsService, params, response)
    }

    class AutoPager(private val firstPage: AggregationListPage) : Iterable<AggregationResponse> {

        override fun iterator(): Iterator<AggregationResponse> = iterator {
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

        fun stream(): Stream<AggregationResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
