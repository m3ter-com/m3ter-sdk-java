// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.CompoundAggregationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of all CompoundAggregations.
 *
 * This endpoint retrieves a list of CompoundAggregations associated with a specific organization.
 * CompoundAggregations enable you to define numerical measures based on simple Aggregations of
 * usage data. It supports pagination, and includes various query parameters to filter the
 * CompoundAggregations based on Product, CompoundAggregation IDs or short codes.
 */
class CompoundAggregationListPageAsync
private constructor(
    private val compoundAggregationsService: CompoundAggregationServiceAsync,
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

        return /* spotless:off */ other is CompoundAggregationListPageAsync && compoundAggregationsService == other.compoundAggregationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(compoundAggregationsService, params, response) /* spotless:on */

    override fun toString() =
        "CompoundAggregationListPageAsync{compoundAggregationsService=$compoundAggregationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CompoundAggregationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CompoundAggregationListPageAsync>> {
        return getNextPageParams()
            .map { compoundAggregationsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            compoundAggregationsService: CompoundAggregationServiceAsync,
            params: CompoundAggregationListParams,
            response: CompoundAggregationListPageResponse,
        ) = CompoundAggregationListPageAsync(compoundAggregationsService, params, response)
    }

    class AutoPager(private val firstPage: CompoundAggregationListPageAsync) {

        fun forEach(
            action: Predicate<CompoundAggregationResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CompoundAggregationListPageAsync>>.forEach(
                action: (CompoundAggregationResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<CompoundAggregationResponse>> {
            val values = mutableListOf<CompoundAggregationResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
