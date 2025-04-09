// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.PlanTemplateServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [PlanTemplateServiceAsync.list] */
class PlanTemplateListPageAsync
private constructor(
    private val service: PlanTemplateServiceAsync,
    private val params: PlanTemplateListParams,
    private val response: PlanTemplateListPageResponse,
) {

    /**
     * Delegates to [PlanTemplateListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanTemplateListPageResponse.data]
     */
    fun data(): List<PlanTemplateResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanTemplateListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanTemplateListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<PlanTemplateListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PlanTemplateListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): PlanTemplateListParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanTemplateListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanTemplateListPageAsync].
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

    /** A builder for [PlanTemplateListPageAsync]. */
    class Builder internal constructor() {

        private var service: PlanTemplateServiceAsync? = null
        private var params: PlanTemplateListParams? = null
        private var response: PlanTemplateListPageResponse? = null

        @JvmSynthetic
        internal fun from(planTemplateListPageAsync: PlanTemplateListPageAsync) = apply {
            service = planTemplateListPageAsync.service
            params = planTemplateListPageAsync.params
            response = planTemplateListPageAsync.response
        }

        fun service(service: PlanTemplateServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlanTemplateListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanTemplateListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanTemplateListPageAsync].
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
        fun build(): PlanTemplateListPageAsync =
            PlanTemplateListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: PlanTemplateListPageAsync) {

        fun forEach(
            action: Predicate<PlanTemplateResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PlanTemplateListPageAsync>>.forEach(
                action: (PlanTemplateResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<PlanTemplateResponse>> {
            val values = mutableListOf<PlanTemplateResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanTemplateListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PlanTemplateListPageAsync{service=$service, params=$params, response=$response}"
}
