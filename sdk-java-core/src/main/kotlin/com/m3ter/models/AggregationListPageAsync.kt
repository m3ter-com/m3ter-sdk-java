// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.AggregationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [AggregationServiceAsync.list] */
class AggregationListPageAsync
private constructor(
    private val service: AggregationServiceAsync,
    private val params: AggregationListParams,
    private val response: AggregationListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<AggregationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<AggregationListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): AggregationListParams = params

    /** The response that this page was parsed from. */
    fun response(): AggregationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AggregationListPageAsync].
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

    /** A builder for [AggregationListPageAsync]. */
    class Builder internal constructor() {

        private var service: AggregationServiceAsync? = null
        private var params: AggregationListParams? = null
        private var response: AggregationListPageResponse? = null

        @JvmSynthetic
        internal fun from(aggregationListPageAsync: AggregationListPageAsync) = apply {
            service = aggregationListPageAsync.service
            params = aggregationListPageAsync.params
            response = aggregationListPageAsync.response
        }

        fun service(service: AggregationServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AggregationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AggregationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AggregationListPageAsync].
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
        fun build(): AggregationListPageAsync =
            AggregationListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AggregationListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AggregationListPageAsync{service=$service, params=$params, response=$response}"
}
