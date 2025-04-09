// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.PlanGroupLinkServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [PlanGroupLinkServiceAsync.list] */
class PlanGroupLinkListPageAsync
private constructor(
    private val service: PlanGroupLinkServiceAsync,
    private val params: PlanGroupLinkListParams,
    private val response: PlanGroupLinkListPageResponse,
) {

    /**
     * Delegates to [PlanGroupLinkListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanGroupLinkListPageResponse.data]
     */
    fun data(): List<PlanGroupLinkResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanGroupLinkListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanGroupLinkListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<PlanGroupLinkListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PlanGroupLinkListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): PlanGroupLinkListParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanGroupLinkListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanGroupLinkListPageAsync].
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

    /** A builder for [PlanGroupLinkListPageAsync]. */
    class Builder internal constructor() {

        private var service: PlanGroupLinkServiceAsync? = null
        private var params: PlanGroupLinkListParams? = null
        private var response: PlanGroupLinkListPageResponse? = null

        @JvmSynthetic
        internal fun from(planGroupLinkListPageAsync: PlanGroupLinkListPageAsync) = apply {
            service = planGroupLinkListPageAsync.service
            params = planGroupLinkListPageAsync.params
            response = planGroupLinkListPageAsync.response
        }

        fun service(service: PlanGroupLinkServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlanGroupLinkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanGroupLinkListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanGroupLinkListPageAsync].
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
        fun build(): PlanGroupLinkListPageAsync =
            PlanGroupLinkListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: PlanGroupLinkListPageAsync) {

        fun forEach(
            action: Predicate<PlanGroupLinkResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PlanGroupLinkListPageAsync>>.forEach(
                action: (PlanGroupLinkResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<PlanGroupLinkResponse>> {
            val values = mutableListOf<PlanGroupLinkResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanGroupLinkListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PlanGroupLinkListPageAsync{service=$service, params=$params, response=$response}"
}
