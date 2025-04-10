// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.CounterPricingServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [CounterPricingServiceAsync.list] */
class CounterPricingListPageAsync
private constructor(
    private val service: CounterPricingServiceAsync,
    private val params: CounterPricingListParams,
    private val response: CounterPricingListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CounterPricingListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CounterPricingListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CounterPricingListParams = params

    /** The response that this page was parsed from. */
    fun response(): CounterPricingListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CounterPricingListPageAsync].
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

    /** A builder for [CounterPricingListPageAsync]. */
    class Builder internal constructor() {

        private var service: CounterPricingServiceAsync? = null
        private var params: CounterPricingListParams? = null
        private var response: CounterPricingListPageResponse? = null

        @JvmSynthetic
        internal fun from(counterPricingListPageAsync: CounterPricingListPageAsync) = apply {
            service = counterPricingListPageAsync.service
            params = counterPricingListPageAsync.params
            response = counterPricingListPageAsync.response
        }

        fun service(service: CounterPricingServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CounterPricingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CounterPricingListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CounterPricingListPageAsync].
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
        fun build(): CounterPricingListPageAsync =
            CounterPricingListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterPricingListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CounterPricingListPageAsync{service=$service, params=$params, response=$response}"
}
