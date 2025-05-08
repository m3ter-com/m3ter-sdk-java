// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.PermissionPolicyServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [PermissionPolicyServiceAsync.list] */
class PermissionPolicyListPageAsync
private constructor(
    private val service: PermissionPolicyServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PermissionPolicyListParams,
    private val response: PermissionPolicyListPageResponse,
) : PageAsync<PermissionPolicyResponse> {

    /**
     * Delegates to [PermissionPolicyListPageResponse], but gracefully handles missing data.
     *
     * @see [PermissionPolicyListPageResponse.data]
     */
    fun data(): List<PermissionPolicyResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PermissionPolicyListPageResponse], but gracefully handles missing data.
     *
     * @see [PermissionPolicyListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<PermissionPolicyResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): PermissionPolicyListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PermissionPolicyListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PermissionPolicyResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PermissionPolicyListParams = params

    /** The response that this page was parsed from. */
    fun response(): PermissionPolicyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PermissionPolicyListPageAsync].
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

    /** A builder for [PermissionPolicyListPageAsync]. */
    class Builder internal constructor() {

        private var service: PermissionPolicyServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PermissionPolicyListParams? = null
        private var response: PermissionPolicyListPageResponse? = null

        @JvmSynthetic
        internal fun from(permissionPolicyListPageAsync: PermissionPolicyListPageAsync) = apply {
            service = permissionPolicyListPageAsync.service
            streamHandlerExecutor = permissionPolicyListPageAsync.streamHandlerExecutor
            params = permissionPolicyListPageAsync.params
            response = permissionPolicyListPageAsync.response
        }

        fun service(service: PermissionPolicyServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PermissionPolicyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PermissionPolicyListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PermissionPolicyListPageAsync].
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
        fun build(): PermissionPolicyListPageAsync =
            PermissionPolicyListPageAsync(
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

        return /* spotless:off */ other is PermissionPolicyListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "PermissionPolicyListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
