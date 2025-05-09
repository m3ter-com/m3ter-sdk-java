// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.CompoundAggregationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [CompoundAggregationServiceAsync.list] */
class CompoundAggregationListPageAsync
private constructor(
    private val service: CompoundAggregationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CompoundAggregationListParams,
    private val response: CompoundAggregationListPageResponse,
) : PageAsync<CompoundAggregationResponse> {

    /**
     * Delegates to [CompoundAggregationListPageResponse], but gracefully handles missing data.
     *
     * @see [CompoundAggregationListPageResponse.data]
     */
    fun data(): List<CompoundAggregationResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CompoundAggregationListPageResponse], but gracefully handles missing data.
     *
     * @see [CompoundAggregationListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<CompoundAggregationResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): CompoundAggregationListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<CompoundAggregationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CompoundAggregationResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CompoundAggregationListParams = params

    /** The response that this page was parsed from. */
    fun response(): CompoundAggregationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CompoundAggregationListPageAsync].
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

    /** A builder for [CompoundAggregationListPageAsync]. */
    class Builder internal constructor() {

        private var service: CompoundAggregationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CompoundAggregationListParams? = null
        private var response: CompoundAggregationListPageResponse? = null

        @JvmSynthetic
        internal fun from(compoundAggregationListPageAsync: CompoundAggregationListPageAsync) =
            apply {
                service = compoundAggregationListPageAsync.service
                streamHandlerExecutor = compoundAggregationListPageAsync.streamHandlerExecutor
                params = compoundAggregationListPageAsync.params
                response = compoundAggregationListPageAsync.response
            }

        fun service(service: CompoundAggregationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CompoundAggregationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CompoundAggregationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CompoundAggregationListPageAsync].
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
        fun build(): CompoundAggregationListPageAsync =
            CompoundAggregationListPageAsync(
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

        return /* spotless:off */ other is CompoundAggregationListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "CompoundAggregationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
