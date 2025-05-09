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

/** @see [ResourceGroupServiceAsync.listPermissions] */
class ResourceGroupListPermissionsPageAsync
private constructor(
    private val service: ResourceGroupServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ResourceGroupListPermissionsParams,
    private val response: ResourceGroupListPermissionsPageResponse,
) : PageAsync<PermissionPolicyResponse> {

    /**
     * Delegates to [ResourceGroupListPermissionsPageResponse], but gracefully handles missing data.
     *
     * @see [ResourceGroupListPermissionsPageResponse.data]
     */
    fun data(): List<PermissionPolicyResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ResourceGroupListPermissionsPageResponse], but gracefully handles missing data.
     *
     * @see [ResourceGroupListPermissionsPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<PermissionPolicyResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): ResourceGroupListPermissionsParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<ResourceGroupListPermissionsPageAsync> =
        service.listPermissions(nextPageParams())

    fun autoPager(): AutoPagerAsync<PermissionPolicyResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ResourceGroupListPermissionsParams = params

    /** The response that this page was parsed from. */
    fun response(): ResourceGroupListPermissionsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ResourceGroupListPermissionsPageAsync].
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

    /** A builder for [ResourceGroupListPermissionsPageAsync]. */
    class Builder internal constructor() {

        private var service: ResourceGroupServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ResourceGroupListPermissionsParams? = null
        private var response: ResourceGroupListPermissionsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            resourceGroupListPermissionsPageAsync: ResourceGroupListPermissionsPageAsync
        ) = apply {
            service = resourceGroupListPermissionsPageAsync.service
            streamHandlerExecutor = resourceGroupListPermissionsPageAsync.streamHandlerExecutor
            params = resourceGroupListPermissionsPageAsync.params
            response = resourceGroupListPermissionsPageAsync.response
        }

        fun service(service: ResourceGroupServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ResourceGroupListPermissionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ResourceGroupListPermissionsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ResourceGroupListPermissionsPageAsync].
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
        fun build(): ResourceGroupListPermissionsPageAsync =
            ResourceGroupListPermissionsPageAsync(
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

        return /* spotless:off */ other is ResourceGroupListPermissionsPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "ResourceGroupListPermissionsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
