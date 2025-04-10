// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.PlanGroupServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [PlanGroupServiceAsync.list] */
class PlanGroupListPageAsync
private constructor(
    private val service: PlanGroupServiceAsync,
    private val params: PlanGroupListParams,
    private val response: PlanGroupListPageResponse,
) {

    /**
     * Delegates to [PlanGroupListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanGroupListPageResponse.data]
     */
    fun data(): List<PlanGroupResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanGroupListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanGroupListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<PlanGroupListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PlanGroupListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): PlanGroupListParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanGroupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanGroupListPageAsync].
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

    /** A builder for [PlanGroupListPageAsync]. */
    class Builder internal constructor() {

        private var service: PlanGroupServiceAsync? = null
        private var params: PlanGroupListParams? = null
        private var response: PlanGroupListPageResponse? = null

        @JvmSynthetic
        internal fun from(planGroupListPageAsync: PlanGroupListPageAsync) = apply {
            service = planGroupListPageAsync.service
            params = planGroupListPageAsync.params
            response = planGroupListPageAsync.response
        }

        fun service(service: PlanGroupServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlanGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanGroupListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanGroupListPageAsync].
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
        fun build(): PlanGroupListPageAsync =
            PlanGroupListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: PlanGroupListPageAsync) {

        fun forEach(
            action: Predicate<PlanGroupResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PlanGroupListPageAsync>>.forEach(
                action: (PlanGroupResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<PlanGroupResponse>> {
            val values = mutableListOf<PlanGroupResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanGroupListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PlanGroupListPageAsync{service=$service, params=$params, response=$response}"
}
