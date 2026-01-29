// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.balances.TransactionScheduleServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see TransactionScheduleServiceAsync.list */
class BalanceTransactionScheduleListPageAsync
private constructor(
    private val service: TransactionScheduleServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BalanceTransactionScheduleListParams,
    private val response: BalanceTransactionScheduleListPageResponse,
) : PageAsync<ScheduleResponse> {

    /**
     * Delegates to [BalanceTransactionScheduleListPageResponse], but gracefully handles missing
     * data.
     *
     * @see BalanceTransactionScheduleListPageResponse.data
     */
    fun data(): List<ScheduleResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BalanceTransactionScheduleListPageResponse], but gracefully handles missing
     * data.
     *
     * @see BalanceTransactionScheduleListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<ScheduleResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): BalanceTransactionScheduleListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<BalanceTransactionScheduleListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ScheduleResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BalanceTransactionScheduleListParams = params

    /** The response that this page was parsed from. */
    fun response(): BalanceTransactionScheduleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BalanceTransactionScheduleListPageAsync].
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

    /** A builder for [BalanceTransactionScheduleListPageAsync]. */
    class Builder internal constructor() {

        private var service: TransactionScheduleServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BalanceTransactionScheduleListParams? = null
        private var response: BalanceTransactionScheduleListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            balanceTransactionScheduleListPageAsync: BalanceTransactionScheduleListPageAsync
        ) = apply {
            service = balanceTransactionScheduleListPageAsync.service
            streamHandlerExecutor = balanceTransactionScheduleListPageAsync.streamHandlerExecutor
            params = balanceTransactionScheduleListPageAsync.params
            response = balanceTransactionScheduleListPageAsync.response
        }

        fun service(service: TransactionScheduleServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BalanceTransactionScheduleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BalanceTransactionScheduleListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BalanceTransactionScheduleListPageAsync].
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
        fun build(): BalanceTransactionScheduleListPageAsync =
            BalanceTransactionScheduleListPageAsync(
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

        return other is BalanceTransactionScheduleListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "BalanceTransactionScheduleListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
