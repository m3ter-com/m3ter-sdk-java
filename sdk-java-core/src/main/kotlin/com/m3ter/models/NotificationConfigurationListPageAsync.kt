// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.NotificationConfigurationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see NotificationConfigurationServiceAsync.list */
class NotificationConfigurationListPageAsync
private constructor(
    private val service: NotificationConfigurationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: NotificationConfigurationListParams,
    private val response: NotificationConfigurationListPageResponse,
) : PageAsync<NotificationConfigurationResponse> {

    /**
     * Delegates to [NotificationConfigurationListPageResponse], but gracefully handles missing
     * data.
     *
     * @see NotificationConfigurationListPageResponse.data
     */
    fun data(): List<NotificationConfigurationResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NotificationConfigurationListPageResponse], but gracefully handles missing
     * data.
     *
     * @see NotificationConfigurationListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<NotificationConfigurationResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): NotificationConfigurationListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<NotificationConfigurationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<NotificationConfigurationResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationConfigurationListPageAsync]. */
    class Builder internal constructor() {

        private var service: NotificationConfigurationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: NotificationConfigurationListParams? = null
        private var response: NotificationConfigurationListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            notificationConfigurationListPageAsync: NotificationConfigurationListPageAsync
        ) = apply {
            service = notificationConfigurationListPageAsync.service
            streamHandlerExecutor = notificationConfigurationListPageAsync.streamHandlerExecutor
            params = notificationConfigurationListPageAsync.params
            response = notificationConfigurationListPageAsync.response
        }

        fun service(service: NotificationConfigurationServiceAsync) = apply {
            this.service = service
        }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NotificationConfigurationListPageAsync =
            NotificationConfigurationListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotificationConfigurationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "NotificationConfigurationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
