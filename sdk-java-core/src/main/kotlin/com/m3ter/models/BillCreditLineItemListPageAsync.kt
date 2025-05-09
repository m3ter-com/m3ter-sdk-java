// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.bills.CreditLineItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [CreditLineItemServiceAsync.list] */
class BillCreditLineItemListPageAsync
private constructor(
    private val service: CreditLineItemServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BillCreditLineItemListParams,
    private val response: BillCreditLineItemListPageResponse,
) : PageAsync<CreditLineItemResponse> {

    /**
     * Delegates to [BillCreditLineItemListPageResponse], but gracefully handles missing data.
     *
     * @see [BillCreditLineItemListPageResponse.data]
     */
    fun data(): List<CreditLineItemResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillCreditLineItemListPageResponse], but gracefully handles missing data.
     *
     * @see [BillCreditLineItemListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<CreditLineItemResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): BillCreditLineItemListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<BillCreditLineItemListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CreditLineItemResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BillCreditLineItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillCreditLineItemListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BillCreditLineItemListPageAsync].
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

    /** A builder for [BillCreditLineItemListPageAsync]. */
    class Builder internal constructor() {

        private var service: CreditLineItemServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BillCreditLineItemListParams? = null
        private var response: BillCreditLineItemListPageResponse? = null

        @JvmSynthetic
        internal fun from(billCreditLineItemListPageAsync: BillCreditLineItemListPageAsync) =
            apply {
                service = billCreditLineItemListPageAsync.service
                streamHandlerExecutor = billCreditLineItemListPageAsync.streamHandlerExecutor
                params = billCreditLineItemListPageAsync.params
                response = billCreditLineItemListPageAsync.response
            }

        fun service(service: CreditLineItemServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BillCreditLineItemListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillCreditLineItemListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BillCreditLineItemListPageAsync].
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
        fun build(): BillCreditLineItemListPageAsync =
            BillCreditLineItemListPageAsync(
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

        return /* spotless:off */ other is BillCreditLineItemListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "BillCreditLineItemListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
