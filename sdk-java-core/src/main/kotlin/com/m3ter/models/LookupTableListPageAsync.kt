// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.LookupTableServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see LookupTableServiceAsync.list */
class LookupTableListPageAsync
private constructor(
    private val service: LookupTableServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LookupTableListParams,
    private val response: LookupTableListPageResponse,
) : PageAsync<LookupTableResponse> {

    /**
     * Delegates to [LookupTableListPageResponse], but gracefully handles missing data.
     *
     * @see LookupTableListPageResponse.data
     */
    fun data(): List<LookupTableResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [LookupTableListPageResponse], but gracefully handles missing data.
     *
     * @see LookupTableListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<LookupTableResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): LookupTableListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<LookupTableListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LookupTableResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LookupTableListParams = params

    /** The response that this page was parsed from. */
    fun response(): LookupTableListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LookupTableListPageAsync].
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

    /** A builder for [LookupTableListPageAsync]. */
    class Builder internal constructor() {

        private var service: LookupTableServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LookupTableListParams? = null
        private var response: LookupTableListPageResponse? = null

        @JvmSynthetic
        internal fun from(lookupTableListPageAsync: LookupTableListPageAsync) = apply {
            service = lookupTableListPageAsync.service
            streamHandlerExecutor = lookupTableListPageAsync.streamHandlerExecutor
            params = lookupTableListPageAsync.params
            response = lookupTableListPageAsync.response
        }

        fun service(service: LookupTableServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LookupTableListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LookupTableListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LookupTableListPageAsync].
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
        fun build(): LookupTableListPageAsync =
            LookupTableListPageAsync(
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

        return other is LookupTableListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "LookupTableListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
