// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.AggregationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of Aggregations that can be filtered by Product, Aggregation ID, or Code. */
class AggregationListPageAsync
private constructor(
    private val aggregationsService: AggregationServiceAsync,
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

        return /* spotless:off */ other is AggregationListPageAsync && aggregationsService == other.aggregationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(aggregationsService, params, response) /* spotless:on */

    override fun toString() =
        "AggregationListPageAsync{aggregationsService=$aggregationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<AggregationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<AggregationListPageAsync>> {
        return getNextPageParams()
            .map { aggregationsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            aggregationsService: AggregationServiceAsync,
            params: AggregationListParams,
            response: AggregationListPageResponse,
        ) = AggregationListPageAsync(aggregationsService, params, response)
    }

    class AutoPager(private val firstPage: AggregationListPageAsync) {

        fun forEach(
            action: Predicate<AggregationResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AggregationListPageAsync>>.forEach(
                action: (AggregationResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<AggregationResponse>> {
            val values = mutableListOf<AggregationResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
