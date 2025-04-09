// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.CounterPricingServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of CounterPricing entities filtered by date, Plan ID, Plan Template ID, or
 * CounterPricing ID.
 */
class CounterPricingListPageAsync
private constructor(
    private val counterPricingsService: CounterPricingServiceAsync,
    private val params: CounterPricingListParams,
    private val response: CounterPricingListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CounterPricingListPageResponse = response

    /**
     * Delegates to [CounterPricingListPageResponse], but gracefully handles missing data.
     *
     * @see [CounterPricingListPageResponse.data]
     */
    fun data(): List<CounterPricingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CounterPricingListPageResponse], but gracefully handles missing data.
     *
     * @see [CounterPricingListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterPricingListPageAsync && counterPricingsService == other.counterPricingsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(counterPricingsService, params, response) /* spotless:on */

    override fun toString() =
        "CounterPricingListPageAsync{counterPricingsService=$counterPricingsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CounterPricingListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CounterPricingListPageAsync>> {
        return getNextPageParams()
            .map { counterPricingsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            counterPricingsService: CounterPricingServiceAsync,
            params: CounterPricingListParams,
            response: CounterPricingListPageResponse,
        ) = CounterPricingListPageAsync(counterPricingsService, params, response)
    }

    class AutoPager(private val firstPage: CounterPricingListPageAsync) {

        fun forEach(
            action: Predicate<CounterPricingResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CounterPricingListPageAsync>>.forEach(
                action: (CounterPricingResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<CounterPricingResponse>> {
            val values = mutableListOf<CounterPricingResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
