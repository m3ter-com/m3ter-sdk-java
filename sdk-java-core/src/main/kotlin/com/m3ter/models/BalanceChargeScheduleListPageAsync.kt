// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.balances.ChargeScheduleServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ChargeScheduleServiceAsync.list */
class BalanceChargeScheduleListPageAsync
private constructor(
    private val service: ChargeScheduleServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BalanceChargeScheduleListParams,
    private val response: BalanceChargeScheduleListPageResponse,
) : PageAsync<BalanceChargeScheduleListResponse> {

    /**
     * Delegates to [BalanceChargeScheduleListPageResponse], but gracefully handles missing data.
     *
     * @see BalanceChargeScheduleListPageResponse.data
     */
    fun data(): List<BalanceChargeScheduleListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BalanceChargeScheduleListPageResponse], but gracefully handles missing data.
     *
     * @see BalanceChargeScheduleListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<BalanceChargeScheduleListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): BalanceChargeScheduleListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<BalanceChargeScheduleListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BalanceChargeScheduleListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BalanceChargeScheduleListParams = params

    /** The response that this page was parsed from. */
    fun response(): BalanceChargeScheduleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BalanceChargeScheduleListPageAsync].
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

    /** A builder for [BalanceChargeScheduleListPageAsync]. */
    class Builder internal constructor() {

        private var service: ChargeScheduleServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BalanceChargeScheduleListParams? = null
        private var response: BalanceChargeScheduleListPageResponse? = null

        @JvmSynthetic
        internal fun from(balanceChargeScheduleListPageAsync: BalanceChargeScheduleListPageAsync) =
            apply {
                service = balanceChargeScheduleListPageAsync.service
                streamHandlerExecutor = balanceChargeScheduleListPageAsync.streamHandlerExecutor
                params = balanceChargeScheduleListPageAsync.params
                response = balanceChargeScheduleListPageAsync.response
            }

        fun service(service: ChargeScheduleServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BalanceChargeScheduleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BalanceChargeScheduleListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BalanceChargeScheduleListPageAsync].
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
        fun build(): BalanceChargeScheduleListPageAsync =
            BalanceChargeScheduleListPageAsync(
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

        return other is BalanceChargeScheduleListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "BalanceChargeScheduleListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
