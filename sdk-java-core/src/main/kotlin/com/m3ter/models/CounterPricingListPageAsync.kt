// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.CounterPricingServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CounterPricingServiceAsync.list */
class CounterPricingListPageAsync
private constructor(
    private val service: CounterPricingServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CounterPricingListParams,
    private val response: CounterPricingListPageResponse,
) : PageAsync<CounterPricingResponse> {

    /**
     * Delegates to [CounterPricingListPageResponse], but gracefully handles missing data.
     *
     * @see CounterPricingListPageResponse.data
     */
    fun data(): List<CounterPricingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CounterPricingListPageResponse], but gracefully handles missing data.
     *
     * @see CounterPricingListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<CounterPricingResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): CounterPricingListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CounterPricingListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CounterPricingResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CounterPricingListParams = params

    /** The response that this page was parsed from. */
    fun response(): CounterPricingListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CounterPricingListPageAsync].
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

    /** A builder for [CounterPricingListPageAsync]. */
    class Builder internal constructor() {

        private var service: CounterPricingServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CounterPricingListParams? = null
        private var response: CounterPricingListPageResponse? = null

        @JvmSynthetic
        internal fun from(counterPricingListPageAsync: CounterPricingListPageAsync) = apply {
            service = counterPricingListPageAsync.service
            streamHandlerExecutor = counterPricingListPageAsync.streamHandlerExecutor
            params = counterPricingListPageAsync.params
            response = counterPricingListPageAsync.response
        }

        fun service(service: CounterPricingServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CounterPricingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CounterPricingListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CounterPricingListPageAsync].
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
        fun build(): CounterPricingListPageAsync =
            CounterPricingListPageAsync(
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

        return other is CounterPricingListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CounterPricingListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
