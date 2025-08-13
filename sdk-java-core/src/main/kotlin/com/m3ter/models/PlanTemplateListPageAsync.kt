// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.PlanTemplateServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see PlanTemplateServiceAsync.list */
class PlanTemplateListPageAsync
private constructor(
    private val service: PlanTemplateServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PlanTemplateListParams,
    private val response: PlanTemplateListPageResponse,
) : PageAsync<PlanTemplateResponse> {

    /**
     * Delegates to [PlanTemplateListPageResponse], but gracefully handles missing data.
     *
     * @see PlanTemplateListPageResponse.data
     */
    fun data(): List<PlanTemplateResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanTemplateListPageResponse], but gracefully handles missing data.
     *
     * @see PlanTemplateListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<PlanTemplateResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): PlanTemplateListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<PlanTemplateListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PlanTemplateResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PlanTemplateListParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanTemplateListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanTemplateListPageAsync].
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

    /** A builder for [PlanTemplateListPageAsync]. */
    class Builder internal constructor() {

        private var service: PlanTemplateServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PlanTemplateListParams? = null
        private var response: PlanTemplateListPageResponse? = null

        @JvmSynthetic
        internal fun from(planTemplateListPageAsync: PlanTemplateListPageAsync) = apply {
            service = planTemplateListPageAsync.service
            streamHandlerExecutor = planTemplateListPageAsync.streamHandlerExecutor
            params = planTemplateListPageAsync.params
            response = planTemplateListPageAsync.response
        }

        fun service(service: PlanTemplateServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PlanTemplateListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanTemplateListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanTemplateListPageAsync].
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
        fun build(): PlanTemplateListPageAsync =
            PlanTemplateListPageAsync(
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

        return other is PlanTemplateListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "PlanTemplateListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
