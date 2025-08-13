// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.IntegrationConfigurationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see IntegrationConfigurationServiceAsync.list */
class IntegrationConfigurationListPageAsync
private constructor(
    private val service: IntegrationConfigurationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: IntegrationConfigurationListParams,
    private val response: IntegrationConfigurationListPageResponse,
) : PageAsync<IntegrationConfigurationListResponse> {

    /**
     * Delegates to [IntegrationConfigurationListPageResponse], but gracefully handles missing data.
     *
     * @see IntegrationConfigurationListPageResponse.data
     */
    fun data(): List<IntegrationConfigurationListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [IntegrationConfigurationListPageResponse], but gracefully handles missing data.
     *
     * @see IntegrationConfigurationListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<IntegrationConfigurationListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): IntegrationConfigurationListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<IntegrationConfigurationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<IntegrationConfigurationListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntegrationConfigurationListPageAsync]. */
    class Builder internal constructor() {

        private var service: IntegrationConfigurationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: IntegrationConfigurationListParams? = null
        private var response: IntegrationConfigurationListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            integrationConfigurationListPageAsync: IntegrationConfigurationListPageAsync
        ) = apply {
            service = integrationConfigurationListPageAsync.service
            streamHandlerExecutor = integrationConfigurationListPageAsync.streamHandlerExecutor
            params = integrationConfigurationListPageAsync.params
            response = integrationConfigurationListPageAsync.response
        }

        fun service(service: IntegrationConfigurationServiceAsync) = apply {
            this.service = service
        }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IntegrationConfigurationListPageAsync =
            IntegrationConfigurationListPageAsync(
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

        return other is IntegrationConfigurationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "IntegrationConfigurationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
