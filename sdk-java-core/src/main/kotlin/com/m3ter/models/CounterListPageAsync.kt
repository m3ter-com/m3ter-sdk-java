// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.CounterServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CounterServiceAsync.list */
class CounterListPageAsync
private constructor(
    private val service: CounterServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CounterListParams,
    private val response: CounterListPageResponse,
) : PageAsync<CounterResponse> {

    /**
     * Delegates to [CounterListPageResponse], but gracefully handles missing data.
     *
     * @see CounterListPageResponse.data
     */
    fun data(): List<CounterResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CounterListPageResponse], but gracefully handles missing data.
     *
     * @see CounterListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<CounterResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): CounterListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CounterListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CounterResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CounterListParams = params

    /** The response that this page was parsed from. */
    fun response(): CounterListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CounterListPageAsync].
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

    /** A builder for [CounterListPageAsync]. */
    class Builder internal constructor() {

        private var service: CounterServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CounterListParams? = null
        private var response: CounterListPageResponse? = null

        @JvmSynthetic
        internal fun from(counterListPageAsync: CounterListPageAsync) = apply {
            service = counterListPageAsync.service
            streamHandlerExecutor = counterListPageAsync.streamHandlerExecutor
            params = counterListPageAsync.params
            response = counterListPageAsync.response
        }

        fun service(service: CounterServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CounterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CounterListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CounterListPageAsync].
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
        fun build(): CounterListPageAsync =
            CounterListPageAsync(
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

        return other is CounterListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CounterListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
