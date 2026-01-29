// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.ResourceGroupServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ResourceGroupServiceAsync.list */
class ResourceGroupListPageAsync
private constructor(
    private val service: ResourceGroupServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ResourceGroupListParams,
    private val response: ResourceGroupListPageResponse,
) : PageAsync<ResourceGroupResponse> {

    /**
     * Delegates to [ResourceGroupListPageResponse], but gracefully handles missing data.
     *
     * @see ResourceGroupListPageResponse.data
     */
    fun data(): List<ResourceGroupResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ResourceGroupListPageResponse], but gracefully handles missing data.
     *
     * @see ResourceGroupListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<ResourceGroupResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): ResourceGroupListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ResourceGroupListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ResourceGroupResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ResourceGroupListParams = params

    /** The response that this page was parsed from. */
    fun response(): ResourceGroupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ResourceGroupListPageAsync].
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

    /** A builder for [ResourceGroupListPageAsync]. */
    class Builder internal constructor() {

        private var service: ResourceGroupServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ResourceGroupListParams? = null
        private var response: ResourceGroupListPageResponse? = null

        @JvmSynthetic
        internal fun from(resourceGroupListPageAsync: ResourceGroupListPageAsync) = apply {
            service = resourceGroupListPageAsync.service
            streamHandlerExecutor = resourceGroupListPageAsync.streamHandlerExecutor
            params = resourceGroupListPageAsync.params
            response = resourceGroupListPageAsync.response
        }

        fun service(service: ResourceGroupServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ResourceGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ResourceGroupListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ResourceGroupListPageAsync].
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
        fun build(): ResourceGroupListPageAsync =
            ResourceGroupListPageAsync(
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

        return other is ResourceGroupListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ResourceGroupListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
