// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.lookupTables.LookupTableRevisionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see LookupTableRevisionServiceAsync.list */
class LookupTableLookupTableRevisionListPageAsync
private constructor(
    private val service: LookupTableRevisionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LookupTableLookupTableRevisionListParams,
    private val response: LookupTableLookupTableRevisionListPageResponse,
) : PageAsync<LookupTableRevisionResponse> {

    /**
     * Delegates to [LookupTableLookupTableRevisionListPageResponse], but gracefully handles missing
     * data.
     *
     * @see LookupTableLookupTableRevisionListPageResponse.data
     */
    fun data(): List<LookupTableRevisionResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [LookupTableLookupTableRevisionListPageResponse], but gracefully handles missing
     * data.
     *
     * @see LookupTableLookupTableRevisionListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<LookupTableRevisionResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): LookupTableLookupTableRevisionListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<LookupTableLookupTableRevisionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LookupTableRevisionResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LookupTableLookupTableRevisionListParams = params

    /** The response that this page was parsed from. */
    fun response(): LookupTableLookupTableRevisionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LookupTableLookupTableRevisionListPageAsync].
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

    /** A builder for [LookupTableLookupTableRevisionListPageAsync]. */
    class Builder internal constructor() {

        private var service: LookupTableRevisionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LookupTableLookupTableRevisionListParams? = null
        private var response: LookupTableLookupTableRevisionListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            lookupTableLookupTableRevisionListPageAsync: LookupTableLookupTableRevisionListPageAsync
        ) = apply {
            service = lookupTableLookupTableRevisionListPageAsync.service
            streamHandlerExecutor =
                lookupTableLookupTableRevisionListPageAsync.streamHandlerExecutor
            params = lookupTableLookupTableRevisionListPageAsync.params
            response = lookupTableLookupTableRevisionListPageAsync.response
        }

        fun service(service: LookupTableRevisionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LookupTableLookupTableRevisionListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: LookupTableLookupTableRevisionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [LookupTableLookupTableRevisionListPageAsync].
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
        fun build(): LookupTableLookupTableRevisionListPageAsync =
            LookupTableLookupTableRevisionListPageAsync(
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

        return other is LookupTableLookupTableRevisionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "LookupTableLookupTableRevisionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
