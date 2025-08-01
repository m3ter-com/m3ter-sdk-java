// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.ScheduledEventConfigurationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ScheduledEventConfigurationServiceAsync.list */
class ScheduledEventConfigurationListPageAsync
private constructor(
    private val service: ScheduledEventConfigurationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ScheduledEventConfigurationListParams,
    private val response: ScheduledEventConfigurationListPageResponse,
) : PageAsync<ScheduledEventConfigurationResponse> {

    /**
     * Delegates to [ScheduledEventConfigurationListPageResponse], but gracefully handles missing
     * data.
     *
     * @see ScheduledEventConfigurationListPageResponse.data
     */
    fun data(): List<ScheduledEventConfigurationResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ScheduledEventConfigurationListPageResponse], but gracefully handles missing
     * data.
     *
     * @see ScheduledEventConfigurationListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<ScheduledEventConfigurationResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): ScheduledEventConfigurationListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ScheduledEventConfigurationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ScheduledEventConfigurationResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScheduledEventConfigurationListPageAsync]. */
    class Builder internal constructor() {

        private var service: ScheduledEventConfigurationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ScheduledEventConfigurationListParams? = null
        private var response: ScheduledEventConfigurationListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            scheduledEventConfigurationListPageAsync: ScheduledEventConfigurationListPageAsync
        ) = apply {
            service = scheduledEventConfigurationListPageAsync.service
            streamHandlerExecutor = scheduledEventConfigurationListPageAsync.streamHandlerExecutor
            params = scheduledEventConfigurationListPageAsync.params
            response = scheduledEventConfigurationListPageAsync.response
        }

        fun service(service: ScheduledEventConfigurationServiceAsync) = apply {
            this.service = service
        }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ScheduledEventConfigurationListPageAsync =
            ScheduledEventConfigurationListPageAsync(
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

        return /* spotless:off */ other is ScheduledEventConfigurationListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "ScheduledEventConfigurationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
