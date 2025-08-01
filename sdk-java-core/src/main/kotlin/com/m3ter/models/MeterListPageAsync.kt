// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.MeterServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see MeterServiceAsync.list */
class MeterListPageAsync
private constructor(
    private val service: MeterServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MeterListParams,
    private val response: MeterListPageResponse,
) : PageAsync<MeterResponse> {

    /**
     * Delegates to [MeterListPageResponse], but gracefully handles missing data.
     *
     * @see MeterListPageResponse.data
     */
    fun data(): List<MeterResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MeterListPageResponse], but gracefully handles missing data.
     *
     * @see MeterListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<MeterResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): MeterListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<MeterListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MeterResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MeterListParams = params

    /** The response that this page was parsed from. */
    fun response(): MeterListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MeterListPageAsync].
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

    /** A builder for [MeterListPageAsync]. */
    class Builder internal constructor() {

        private var service: MeterServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MeterListParams? = null
        private var response: MeterListPageResponse? = null

        @JvmSynthetic
        internal fun from(meterListPageAsync: MeterListPageAsync) = apply {
            service = meterListPageAsync.service
            streamHandlerExecutor = meterListPageAsync.streamHandlerExecutor
            params = meterListPageAsync.params
            response = meterListPageAsync.response
        }

        fun service(service: MeterServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MeterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MeterListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MeterListPageAsync].
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
        fun build(): MeterListPageAsync =
            MeterListPageAsync(
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

        return /* spotless:off */ other is MeterListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "MeterListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
