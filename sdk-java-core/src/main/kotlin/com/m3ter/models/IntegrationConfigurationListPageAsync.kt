// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.IntegrationConfigurationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [IntegrationConfigurationServiceAsync.list] */
class IntegrationConfigurationListPageAsync
private constructor(
    private val service: IntegrationConfigurationServiceAsync,
    private val params: IntegrationConfigurationListParams,
    private val response: IntegrationConfigurationListPageResponse,
) {

    /**
     * Delegates to [IntegrationConfigurationListPageResponse], but gracefully handles missing data.
     *
     * @see [IntegrationConfigurationListPageResponse.data]
     */
    fun data(): List<IntegrationConfigurationListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [IntegrationConfigurationListPageResponse], but gracefully handles missing data.
     *
     * @see [IntegrationConfigurationListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<IntegrationConfigurationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<IntegrationConfigurationListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): IntegrationConfigurationListParams = params

    /** The response that this page was parsed from. */
    fun response(): IntegrationConfigurationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [IntegrationConfigurationListPageAsync].
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

    /** A builder for [IntegrationConfigurationListPageAsync]. */
    class Builder internal constructor() {

        private var service: IntegrationConfigurationServiceAsync? = null
        private var params: IntegrationConfigurationListParams? = null
        private var response: IntegrationConfigurationListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            integrationConfigurationListPageAsync: IntegrationConfigurationListPageAsync
        ) = apply {
            service = integrationConfigurationListPageAsync.service
            params = integrationConfigurationListPageAsync.params
            response = integrationConfigurationListPageAsync.response
        }

        fun service(service: IntegrationConfigurationServiceAsync) = apply {
            this.service = service
        }

        /** The parameters that were used to request this page. */
        fun params(params: IntegrationConfigurationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: IntegrationConfigurationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [IntegrationConfigurationListPageAsync].
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
        fun build(): IntegrationConfigurationListPageAsync =
            IntegrationConfigurationListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: IntegrationConfigurationListPageAsync) {

        fun forEach(
            action: Predicate<IntegrationConfigurationListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<IntegrationConfigurationListPageAsync>>.forEach(
                action: (IntegrationConfigurationListResponse) -> Boolean,
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

        fun toList(
            executor: Executor
        ): CompletableFuture<List<IntegrationConfigurationListResponse>> {
            val values = mutableListOf<IntegrationConfigurationListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IntegrationConfigurationListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "IntegrationConfigurationListPageAsync{service=$service, params=$params, response=$response}"
}
