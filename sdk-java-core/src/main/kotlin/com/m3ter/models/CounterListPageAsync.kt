// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.CounterServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of Counter entities that can be filtered by Product, Counter ID, or Codes. */
class CounterListPageAsync
private constructor(
    private val countersService: CounterServiceAsync,
    private val params: CounterListParams,
    private val response: CounterListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CounterListPageResponse = response

    /**
     * Delegates to [CounterListPageResponse], but gracefully handles missing data.
     *
     * @see [CounterListPageResponse.data]
     */
    fun data(): List<CounterResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CounterListPageResponse], but gracefully handles missing data.
     *
     * @see [CounterListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterListPageAsync && countersService == other.countersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(countersService, params, response) /* spotless:on */

    override fun toString() =
        "CounterListPageAsync{countersService=$countersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CounterListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CounterListPageAsync>> {
        return getNextPageParams()
            .map { countersService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            countersService: CounterServiceAsync,
            params: CounterListParams,
            response: CounterListPageResponse,
        ) = CounterListPageAsync(countersService, params, response)
    }

    class AutoPager(private val firstPage: CounterListPageAsync) {

        fun forEach(
            action: Predicate<CounterResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CounterListPageAsync>>.forEach(
                action: (CounterResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<CounterResponse>> {
            val values = mutableListOf<CounterResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
