// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.NotificationConfigurationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [NotificationConfigurationServiceAsync.list] */
class NotificationConfigurationListPageAsync
private constructor(
    private val service: NotificationConfigurationServiceAsync,
    private val params: NotificationConfigurationListParams,
    private val response: NotificationConfigurationListPageResponse,
) {

    /**
     * Delegates to [NotificationConfigurationListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [NotificationConfigurationListPageResponse.data]
     */
    fun data(): List<NotificationConfigurationResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NotificationConfigurationListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [NotificationConfigurationListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<NotificationConfigurationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<NotificationConfigurationListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): NotificationConfigurationListParams = params

    /** The response that this page was parsed from. */
    fun response(): NotificationConfigurationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [NotificationConfigurationListPageAsync].
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

    /** A builder for [NotificationConfigurationListPageAsync]. */
    class Builder internal constructor() {

        private var service: NotificationConfigurationServiceAsync? = null
        private var params: NotificationConfigurationListParams? = null
        private var response: NotificationConfigurationListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            notificationConfigurationListPageAsync: NotificationConfigurationListPageAsync
        ) = apply {
            service = notificationConfigurationListPageAsync.service
            params = notificationConfigurationListPageAsync.params
            response = notificationConfigurationListPageAsync.response
        }

        fun service(service: NotificationConfigurationServiceAsync) = apply {
            this.service = service
        }

        /** The parameters that were used to request this page. */
        fun params(params: NotificationConfigurationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NotificationConfigurationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [NotificationConfigurationListPageAsync].
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
        fun build(): NotificationConfigurationListPageAsync =
            NotificationConfigurationListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: NotificationConfigurationListPageAsync) {

        fun forEach(
            action: Predicate<NotificationConfigurationResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<NotificationConfigurationListPageAsync>>.forEach(
                action: (NotificationConfigurationResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<NotificationConfigurationResponse>> {
            val values = mutableListOf<NotificationConfigurationResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NotificationConfigurationListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "NotificationConfigurationListPageAsync{service=$service, params=$params, response=$response}"
}
