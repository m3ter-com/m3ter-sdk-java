// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.CommitmentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [CommitmentServiceAsync.list] */
class CommitmentListPageAsync
private constructor(
    private val service: CommitmentServiceAsync,
    private val params: CommitmentListParams,
    private val response: CommitmentListPageResponse,
) {

    /**
     * Delegates to [CommitmentListPageResponse], but gracefully handles missing data.
     *
     * @see [CommitmentListPageResponse.data]
     */
    fun data(): List<CommitmentResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CommitmentListPageResponse], but gracefully handles missing data.
     *
     * @see [CommitmentListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CommitmentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CommitmentListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CommitmentListParams = params

    /** The response that this page was parsed from. */
    fun response(): CommitmentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CommitmentListPageAsync].
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

    /** A builder for [CommitmentListPageAsync]. */
    class Builder internal constructor() {

        private var service: CommitmentServiceAsync? = null
        private var params: CommitmentListParams? = null
        private var response: CommitmentListPageResponse? = null

        @JvmSynthetic
        internal fun from(commitmentListPageAsync: CommitmentListPageAsync) = apply {
            service = commitmentListPageAsync.service
            params = commitmentListPageAsync.params
            response = commitmentListPageAsync.response
        }

        fun service(service: CommitmentServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CommitmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CommitmentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CommitmentListPageAsync].
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
        fun build(): CommitmentListPageAsync =
            CommitmentListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CommitmentListPageAsync) {

        fun forEach(
            action: Predicate<CommitmentResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CommitmentListPageAsync>>.forEach(
                action: (CommitmentResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<CommitmentResponse>> {
            val values = mutableListOf<CommitmentResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CommitmentListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CommitmentListPageAsync{service=$service, params=$params, response=$response}"
}
