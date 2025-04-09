// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.ScheduledEventConfigurationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [ScheduledEventConfigurationServiceAsync.list] */
class ScheduledEventConfigurationListPageAsync
private constructor(
    private val service: ScheduledEventConfigurationServiceAsync,
    private val params: ScheduledEventConfigurationListParams,
    private val response: ScheduledEventConfigurationListPageResponse,
) {

    /**
     * Delegates to [ScheduledEventConfigurationListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ScheduledEventConfigurationListPageResponse.data]
     */
    fun data(): List<ScheduledEventConfigurationResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ScheduledEventConfigurationListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ScheduledEventConfigurationListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ScheduledEventConfigurationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ScheduledEventConfigurationListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ScheduledEventConfigurationListParams = params

    /** The response that this page was parsed from. */
    fun response(): ScheduledEventConfigurationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ScheduledEventConfigurationListPageAsync].
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

    /** A builder for [ScheduledEventConfigurationListPageAsync]. */
    class Builder internal constructor() {

        private var service: ScheduledEventConfigurationServiceAsync? = null
        private var params: ScheduledEventConfigurationListParams? = null
        private var response: ScheduledEventConfigurationListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            scheduledEventConfigurationListPageAsync: ScheduledEventConfigurationListPageAsync
        ) = apply {
            service = scheduledEventConfigurationListPageAsync.service
            params = scheduledEventConfigurationListPageAsync.params
            response = scheduledEventConfigurationListPageAsync.response
        }

        fun service(service: ScheduledEventConfigurationServiceAsync) = apply {
            this.service = service
        }

        /** The parameters that were used to request this page. */
        fun params(params: ScheduledEventConfigurationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ScheduledEventConfigurationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ScheduledEventConfigurationListPageAsync].
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
        fun build(): ScheduledEventConfigurationListPageAsync =
            ScheduledEventConfigurationListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ScheduledEventConfigurationListPageAsync) {

        fun forEach(
            action: Predicate<ScheduledEventConfigurationResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ScheduledEventConfigurationListPageAsync>>.forEach(
                action: (ScheduledEventConfigurationResponse) -> Boolean,
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
        ): CompletableFuture<List<ScheduledEventConfigurationResponse>> {
            val values = mutableListOf<ScheduledEventConfigurationResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScheduledEventConfigurationListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ScheduledEventConfigurationListPageAsync{service=$service, params=$params, response=$response}"
}
