// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.CounterServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [CounterServiceAsync.list] */
class CounterListPageAsync
private constructor(
    private val service: CounterServiceAsync,
    private val params: CounterListParams,
    private val response: CounterListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CounterListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CounterListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CounterListParams = params

    /** The response that this page was parsed from. */
    fun response(): CounterListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CounterListPageAsync].
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

    /** A builder for [CounterListPageAsync]. */
    class Builder internal constructor() {

        private var service: CounterServiceAsync? = null
        private var params: CounterListParams? = null
        private var response: CounterListPageResponse? = null

        @JvmSynthetic
        internal fun from(counterListPageAsync: CounterListPageAsync) = apply {
            service = counterListPageAsync.service
            params = counterListPageAsync.params
            response = counterListPageAsync.response
        }

        fun service(service: CounterServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CounterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CounterListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CounterListPageAsync].
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
        fun build(): CounterListPageAsync =
            CounterListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CounterListPageAsync{service=$service, params=$params, response=$response}"
}
