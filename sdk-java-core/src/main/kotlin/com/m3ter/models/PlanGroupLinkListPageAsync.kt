// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.PlanGroupLinkServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PlanGroupLinkServiceAsync.list */
class PlanGroupLinkListPageAsync
private constructor(
    private val service: PlanGroupLinkServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PlanGroupLinkListParams,
    private val response: PlanGroupLinkListPageResponse,
) : PageAsync<PlanGroupLinkResponse> {

    /**
     * Delegates to [PlanGroupLinkListPageResponse], but gracefully handles missing data.
     *
     * @see PlanGroupLinkListPageResponse.data
     */
    fun data(): List<PlanGroupLinkResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanGroupLinkListPageResponse], but gracefully handles missing data.
     *
     * @see PlanGroupLinkListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<PlanGroupLinkResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): PlanGroupLinkListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PlanGroupLinkListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PlanGroupLinkResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PlanGroupLinkListParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanGroupLinkListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanGroupLinkListPageAsync].
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

    /** A builder for [PlanGroupLinkListPageAsync]. */
    class Builder internal constructor() {

        private var service: PlanGroupLinkServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PlanGroupLinkListParams? = null
        private var response: PlanGroupLinkListPageResponse? = null

        @JvmSynthetic
        internal fun from(planGroupLinkListPageAsync: PlanGroupLinkListPageAsync) = apply {
            service = planGroupLinkListPageAsync.service
            streamHandlerExecutor = planGroupLinkListPageAsync.streamHandlerExecutor
            params = planGroupLinkListPageAsync.params
            response = planGroupLinkListPageAsync.response
        }

        fun service(service: PlanGroupLinkServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PlanGroupLinkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanGroupLinkListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanGroupLinkListPageAsync].
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
        fun build(): PlanGroupLinkListPageAsync =
            PlanGroupLinkListPageAsync(
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

        return other is PlanGroupLinkListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PlanGroupLinkListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
