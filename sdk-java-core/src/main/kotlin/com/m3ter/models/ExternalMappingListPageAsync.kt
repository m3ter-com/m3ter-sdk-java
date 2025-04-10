// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.ExternalMappingServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [ExternalMappingServiceAsync.list] */
class ExternalMappingListPageAsync
private constructor(
    private val service: ExternalMappingServiceAsync,
    private val params: ExternalMappingListParams,
    private val response: ExternalMappingListPageResponse,
) {

    /**
     * Delegates to [ExternalMappingListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalMappingListPageResponse.data]
     */
    fun data(): List<ExternalMappingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalMappingListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalMappingListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ExternalMappingListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ExternalMappingListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ExternalMappingListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExternalMappingListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalMappingListPageAsync].
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

    /** A builder for [ExternalMappingListPageAsync]. */
    class Builder internal constructor() {

        private var service: ExternalMappingServiceAsync? = null
        private var params: ExternalMappingListParams? = null
        private var response: ExternalMappingListPageResponse? = null

        @JvmSynthetic
        internal fun from(externalMappingListPageAsync: ExternalMappingListPageAsync) = apply {
            service = externalMappingListPageAsync.service
            params = externalMappingListPageAsync.params
            response = externalMappingListPageAsync.response
        }

        fun service(service: ExternalMappingServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExternalMappingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExternalMappingListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExternalMappingListPageAsync].
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
        fun build(): ExternalMappingListPageAsync =
            ExternalMappingListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ExternalMappingListPageAsync) {

        fun forEach(
            action: Predicate<ExternalMappingResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ExternalMappingListPageAsync>>.forEach(
                action: (ExternalMappingResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ExternalMappingResponse>> {
            val values = mutableListOf<ExternalMappingResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalMappingListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ExternalMappingListPageAsync{service=$service, params=$params, response=$response}"
}
