// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.PlanGroupServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PlanGroupServiceAsync.list */
class PlanGroupListPageAsync
private constructor(
    private val service: PlanGroupServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PlanGroupListParams,
    private val response: PlanGroupListPageResponse,
) : PageAsync<PlanGroupResponse> {

    /**
     * Delegates to [PlanGroupListPageResponse], but gracefully handles missing data.
     *
     * @see PlanGroupListPageResponse.data
     */
    fun data(): List<PlanGroupResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanGroupListPageResponse], but gracefully handles missing data.
     *
     * @see PlanGroupListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<PlanGroupResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): PlanGroupListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PlanGroupListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PlanGroupResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PlanGroupListParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanGroupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanGroupListPageAsync].
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

    /** A builder for [PlanGroupListPageAsync]. */
    class Builder internal constructor() {

        private var service: PlanGroupServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PlanGroupListParams? = null
        private var response: PlanGroupListPageResponse? = null

        @JvmSynthetic
        internal fun from(planGroupListPageAsync: PlanGroupListPageAsync) = apply {
            service = planGroupListPageAsync.service
            streamHandlerExecutor = planGroupListPageAsync.streamHandlerExecutor
            params = planGroupListPageAsync.params
            response = planGroupListPageAsync.response
        }

        fun service(service: PlanGroupServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PlanGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanGroupListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanGroupListPageAsync].
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
        fun build(): PlanGroupListPageAsync =
            PlanGroupListPageAsync(
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

        return /* spotless:off */ other is PlanGroupListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "PlanGroupListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
