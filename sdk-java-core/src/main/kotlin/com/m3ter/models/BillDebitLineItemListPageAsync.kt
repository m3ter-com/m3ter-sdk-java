// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.bills.DebitLineItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see DebitLineItemServiceAsync.list */
class BillDebitLineItemListPageAsync
private constructor(
    private val service: DebitLineItemServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BillDebitLineItemListParams,
    private val response: BillDebitLineItemListPageResponse,
) : PageAsync<DebitLineItemResponse> {

    /**
     * Delegates to [BillDebitLineItemListPageResponse], but gracefully handles missing data.
     *
     * @see BillDebitLineItemListPageResponse.data
     */
    fun data(): List<DebitLineItemResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillDebitLineItemListPageResponse], but gracefully handles missing data.
     *
     * @see BillDebitLineItemListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<DebitLineItemResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): BillDebitLineItemListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<BillDebitLineItemListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DebitLineItemResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BillDebitLineItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillDebitLineItemListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BillDebitLineItemListPageAsync].
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

    /** A builder for [BillDebitLineItemListPageAsync]. */
    class Builder internal constructor() {

        private var service: DebitLineItemServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BillDebitLineItemListParams? = null
        private var response: BillDebitLineItemListPageResponse? = null

        @JvmSynthetic
        internal fun from(billDebitLineItemListPageAsync: BillDebitLineItemListPageAsync) = apply {
            service = billDebitLineItemListPageAsync.service
            streamHandlerExecutor = billDebitLineItemListPageAsync.streamHandlerExecutor
            params = billDebitLineItemListPageAsync.params
            response = billDebitLineItemListPageAsync.response
        }

        fun service(service: DebitLineItemServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BillDebitLineItemListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillDebitLineItemListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BillDebitLineItemListPageAsync].
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
        fun build(): BillDebitLineItemListPageAsync =
            BillDebitLineItemListPageAsync(
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

        return /* spotless:off */ other is BillDebitLineItemListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "BillDebitLineItemListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
