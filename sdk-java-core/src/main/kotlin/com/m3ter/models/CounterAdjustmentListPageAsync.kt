// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.CounterAdjustmentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [CounterAdjustmentServiceAsync.list] */
class CounterAdjustmentListPageAsync
private constructor(
    private val service: CounterAdjustmentServiceAsync,
    private val params: CounterAdjustmentListParams,
    private val response: CounterAdjustmentListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CounterAdjustmentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CounterAdjustmentListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CounterAdjustmentListParams = params

    /** The response that this page was parsed from. */
    fun response(): CounterAdjustmentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CounterAdjustmentListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CounterAdjustmentListPageAsync]. */
    class Builder internal constructor() {

        private var service: CounterAdjustmentServiceAsync? = null
        private var params: CounterAdjustmentListParams? = null
        private var response: CounterAdjustmentListPageResponse? = null

        @JvmSynthetic
        internal fun from(counterAdjustmentListPageAsync: CounterAdjustmentListPageAsync) = apply {
            service = counterAdjustmentListPageAsync.service
            params = counterAdjustmentListPageAsync.params
            response = counterAdjustmentListPageAsync.response
        }

        fun service(service: CounterAdjustmentServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CounterAdjustmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CounterAdjustmentListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CounterAdjustmentListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CounterAdjustmentListPageAsync =
            CounterAdjustmentListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterAdjustmentListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CounterAdjustmentListPageAsync{service=$service, params=$params, response=$response}"
}
