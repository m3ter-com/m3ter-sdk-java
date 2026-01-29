// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.lookupTables.lookupTableRevisionData.LookupTableRevisionDataJobServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see LookupTableRevisionDataJobServiceAsync.list */
class LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync
private constructor(
    private val service: LookupTableRevisionDataJobServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams,
    private val response:
        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse,
) : PageAsync<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse> {

    /**
     * Delegates to [LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse],
     * but gracefully handles missing data.
     *
     * @see LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse.data
     */
    fun data(): List<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse],
     * but gracefully handles missing data.
     *
     * @see LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items():
        List<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage():
        CompletableFuture<
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync
        > = service.list(nextPageParams())

    fun autoPager():
        AutoPagerAsync<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams = params

    /** The response that this page was parsed from. */
    fun response(): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse =
        response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync].
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

    /**
     * A builder for [LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync].
     */
    class Builder internal constructor() {

        private var service: LookupTableRevisionDataJobServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params:
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams? =
            null
        private var response:
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse? =
            null

        @JvmSynthetic
        internal fun from(
            lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync:
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync
        ) = apply {
            service =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync.service
            streamHandlerExecutor =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync
                    .streamHandlerExecutor
            params =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync.params
            response =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync.response
        }

        fun service(service: LookupTableRevisionDataJobServiceAsync) = apply {
            this.service = service
        }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun response(
            response: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse
        ) = apply { this.response = response }

        /**
         * Returns an immutable instance of
         * [LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync].
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
        fun build(): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync =
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync(
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

        return other is LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
