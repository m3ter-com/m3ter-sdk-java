// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.CounterAdjustmentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of CounterAdjustments created for Accounts in your Organization. You can filter
 * the list returned by date, Account ID, or Counter ID.
 *
 * **CONSTRAINTS:**
 * - The `counterId` query parameter is always required when calling this endpoint, used either as a
 *   single query parameter or in combination with any of the other query parameters.
 * - If you want to use the `date`, `dateStart`, or `dateEnd` query parameters, you must also use
 *   the `accountId` query parameter.
 */
class CounterAdjustmentListPageAsync
private constructor(
    private val counterAdjustmentsService: CounterAdjustmentServiceAsync,
    private val params: CounterAdjustmentListParams,
    private val response: CounterAdjustmentListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CounterAdjustmentListPageResponse = response

    /**
     * Delegates to [CounterAdjustmentListPageResponse], but gracefully handles missing data.
     *
     * @see [CounterAdjustmentListPageResponse.data]
     */
    fun data(): List<CounterAdjustmentResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CounterAdjustmentListPageResponse], but gracefully handles missing data.
     *
     * @see [CounterAdjustmentListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterAdjustmentListPageAsync && counterAdjustmentsService == other.counterAdjustmentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(counterAdjustmentsService, params, response) /* spotless:on */

    override fun toString() =
        "CounterAdjustmentListPageAsync{counterAdjustmentsService=$counterAdjustmentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CounterAdjustmentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CounterAdjustmentListPageAsync>> {
        return getNextPageParams()
            .map { counterAdjustmentsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            counterAdjustmentsService: CounterAdjustmentServiceAsync,
            params: CounterAdjustmentListParams,
            response: CounterAdjustmentListPageResponse,
        ) = CounterAdjustmentListPageAsync(counterAdjustmentsService, params, response)
    }

    class AutoPager(private val firstPage: CounterAdjustmentListPageAsync) {

        fun forEach(
            action: Predicate<CounterAdjustmentResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CounterAdjustmentListPageAsync>>.forEach(
                action: (CounterAdjustmentResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<CounterAdjustmentResponse>> {
            val values = mutableListOf<CounterAdjustmentResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
