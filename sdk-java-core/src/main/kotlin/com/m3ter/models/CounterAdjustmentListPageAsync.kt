// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.CounterAdjustmentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CounterAdjustmentServiceAsync.list */
class CounterAdjustmentListPageAsync
private constructor(
    private val service: CounterAdjustmentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CounterAdjustmentListParams,
    private val response: CounterAdjustmentListPageResponse,
) : PageAsync<CounterAdjustmentResponse> {

    /**
     * Delegates to [CounterAdjustmentListPageResponse], but gracefully handles missing data.
     *
     * @see CounterAdjustmentListPageResponse.data
     */
    fun data(): List<CounterAdjustmentResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CounterAdjustmentListPageResponse], but gracefully handles missing data.
     *
     * @see CounterAdjustmentListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<CounterAdjustmentResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): CounterAdjustmentListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CounterAdjustmentListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CounterAdjustmentResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CounterAdjustmentListParams = params

    /** The response that this page was parsed from. */
    fun response(): CounterAdjustmentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CounterAdjustmentListPageAsync].
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

    /** A builder for [CounterAdjustmentListPageAsync]. */
    class Builder internal constructor() {

        private var service: CounterAdjustmentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CounterAdjustmentListParams? = null
        private var response: CounterAdjustmentListPageResponse? = null

        @JvmSynthetic
        internal fun from(counterAdjustmentListPageAsync: CounterAdjustmentListPageAsync) = apply {
            service = counterAdjustmentListPageAsync.service
            streamHandlerExecutor = counterAdjustmentListPageAsync.streamHandlerExecutor
            params = counterAdjustmentListPageAsync.params
            response = counterAdjustmentListPageAsync.response
        }

        fun service(service: CounterAdjustmentServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CounterAdjustmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CounterAdjustmentListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CounterAdjustmentListPageAsync].
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
        fun build(): CounterAdjustmentListPageAsync =
            CounterAdjustmentListPageAsync(
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

        return other is CounterAdjustmentListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CounterAdjustmentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
