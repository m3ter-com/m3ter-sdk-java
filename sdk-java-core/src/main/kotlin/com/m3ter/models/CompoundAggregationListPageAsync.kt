// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.CompoundAggregationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [CompoundAggregationServiceAsync.list] */
class CompoundAggregationListPageAsync
private constructor(
    private val service: CompoundAggregationServiceAsync,
    private val params: CompoundAggregationListParams,
    private val response: CompoundAggregationListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CompoundAggregationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CompoundAggregationListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CompoundAggregationListParams = params

    /** The response that this page was parsed from. */
    fun response(): CompoundAggregationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CompoundAggregationListPageAsync].
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

    /** A builder for [CompoundAggregationListPageAsync]. */
    class Builder internal constructor() {

        private var service: CompoundAggregationServiceAsync? = null
        private var params: CompoundAggregationListParams? = null
        private var response: CompoundAggregationListPageResponse? = null

        @JvmSynthetic
        internal fun from(compoundAggregationListPageAsync: CompoundAggregationListPageAsync) =
            apply {
                service = compoundAggregationListPageAsync.service
                params = compoundAggregationListPageAsync.params
                response = compoundAggregationListPageAsync.response
            }

        fun service(service: CompoundAggregationServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CompoundAggregationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CompoundAggregationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CompoundAggregationListPageAsync].
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
        fun build(): CompoundAggregationListPageAsync =
            CompoundAggregationListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CompoundAggregationListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CompoundAggregationListPageAsync{service=$service, params=$params, response=$response}"
}
