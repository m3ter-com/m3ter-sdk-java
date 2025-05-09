// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.bills.LineItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [LineItemServiceAsync.list] */
class BillLineItemListPageAsync
private constructor(
    private val service: LineItemServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BillLineItemListParams,
    private val response: BillLineItemListPageResponse,
) : PageAsync<LineItemResponse> {

    /**
     * Delegates to [BillLineItemListPageResponse], but gracefully handles missing data.
     *
     * @see [BillLineItemListPageResponse.data]
     */
    fun data(): List<LineItemResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillLineItemListPageResponse], but gracefully handles missing data.
     *
     * @see [BillLineItemListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<LineItemResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): BillLineItemListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<BillLineItemListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LineItemResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BillLineItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillLineItemListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillLineItemListPageAsync].
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

    /** A builder for [BillLineItemListPageAsync]. */
    class Builder internal constructor() {

        private var service: LineItemServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BillLineItemListParams? = null
        private var response: BillLineItemListPageResponse? = null

        @JvmSynthetic
        internal fun from(billLineItemListPageAsync: BillLineItemListPageAsync) = apply {
            service = billLineItemListPageAsync.service
            streamHandlerExecutor = billLineItemListPageAsync.streamHandlerExecutor
            params = billLineItemListPageAsync.params
            response = billLineItemListPageAsync.response
        }

        fun service(service: LineItemServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BillLineItemListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillLineItemListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BillLineItemListPageAsync].
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
        fun build(): BillLineItemListPageAsync =
            BillLineItemListPageAsync(
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

        return /* spotless:off */ other is BillLineItemListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "BillLineItemListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
