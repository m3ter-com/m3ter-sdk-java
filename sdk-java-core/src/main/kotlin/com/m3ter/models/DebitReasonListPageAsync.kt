// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.DebitReasonServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [DebitReasonServiceAsync.list] */
class DebitReasonListPageAsync
private constructor(
    private val service: DebitReasonServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DebitReasonListParams,
    private val response: DebitReasonListPageResponse,
) : PageAsync<DebitReasonResponse> {

    /**
     * Delegates to [DebitReasonListPageResponse], but gracefully handles missing data.
     *
     * @see [DebitReasonListPageResponse.data]
     */
    fun data(): List<DebitReasonResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DebitReasonListPageResponse], but gracefully handles missing data.
     *
     * @see [DebitReasonListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<DebitReasonResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): DebitReasonListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<DebitReasonListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DebitReasonResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DebitReasonListParams = params

    /** The response that this page was parsed from. */
    fun response(): DebitReasonListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DebitReasonListPageAsync].
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

    /** A builder for [DebitReasonListPageAsync]. */
    class Builder internal constructor() {

        private var service: DebitReasonServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DebitReasonListParams? = null
        private var response: DebitReasonListPageResponse? = null

        @JvmSynthetic
        internal fun from(debitReasonListPageAsync: DebitReasonListPageAsync) = apply {
            service = debitReasonListPageAsync.service
            streamHandlerExecutor = debitReasonListPageAsync.streamHandlerExecutor
            params = debitReasonListPageAsync.params
            response = debitReasonListPageAsync.response
        }

        fun service(service: DebitReasonServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DebitReasonListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DebitReasonListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DebitReasonListPageAsync].
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
        fun build(): DebitReasonListPageAsync =
            DebitReasonListPageAsync(
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

        return /* spotless:off */ other is DebitReasonListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "DebitReasonListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
