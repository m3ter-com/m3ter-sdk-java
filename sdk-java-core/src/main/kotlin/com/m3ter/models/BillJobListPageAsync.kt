// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.BillJobServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [BillJobServiceAsync.list] */
class BillJobListPageAsync
private constructor(
    private val service: BillJobServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BillJobListParams,
    private val response: BillJobListPageResponse,
) : PageAsync<BillJobResponse> {

    /**
     * Delegates to [BillJobListPageResponse], but gracefully handles missing data.
     *
     * @see [BillJobListPageResponse.data]
     */
    fun data(): List<BillJobResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillJobListPageResponse], but gracefully handles missing data.
     *
     * @see [BillJobListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<BillJobResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): BillJobListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<BillJobListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BillJobResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BillJobListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillJobListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillJobListPageAsync].
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

    /** A builder for [BillJobListPageAsync]. */
    class Builder internal constructor() {

        private var service: BillJobServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BillJobListParams? = null
        private var response: BillJobListPageResponse? = null

        @JvmSynthetic
        internal fun from(billJobListPageAsync: BillJobListPageAsync) = apply {
            service = billJobListPageAsync.service
            streamHandlerExecutor = billJobListPageAsync.streamHandlerExecutor
            params = billJobListPageAsync.params
            response = billJobListPageAsync.response
        }

        fun service(service: BillJobServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BillJobListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillJobListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BillJobListPageAsync].
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
        fun build(): BillJobListPageAsync =
            BillJobListPageAsync(
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

        return /* spotless:off */ other is BillJobListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "BillJobListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
