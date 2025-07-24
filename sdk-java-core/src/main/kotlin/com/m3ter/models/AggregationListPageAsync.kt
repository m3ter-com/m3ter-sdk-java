// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.AggregationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AggregationServiceAsync.list */
class AggregationListPageAsync
private constructor(
    private val service: AggregationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AggregationListParams,
    private val response: AggregationListPageResponse,
) : PageAsync<AggregationResponse> {

    /**
     * Delegates to [AggregationListPageResponse], but gracefully handles missing data.
     *
     * @see AggregationListPageResponse.data
     */
    fun data(): List<AggregationResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AggregationListPageResponse], but gracefully handles missing data.
     *
     * @see AggregationListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<AggregationResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): AggregationListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<AggregationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AggregationResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AggregationListParams = params

    /** The response that this page was parsed from. */
    fun response(): AggregationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AggregationListPageAsync].
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

    /** A builder for [AggregationListPageAsync]. */
    class Builder internal constructor() {

        private var service: AggregationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AggregationListParams? = null
        private var response: AggregationListPageResponse? = null

        @JvmSynthetic
        internal fun from(aggregationListPageAsync: AggregationListPageAsync) = apply {
            service = aggregationListPageAsync.service
            streamHandlerExecutor = aggregationListPageAsync.streamHandlerExecutor
            params = aggregationListPageAsync.params
            response = aggregationListPageAsync.response
        }

        fun service(service: AggregationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AggregationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AggregationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AggregationListPageAsync].
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
        fun build(): AggregationListPageAsync =
            AggregationListPageAsync(
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

        return /* spotless:off */ other is AggregationListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "AggregationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
