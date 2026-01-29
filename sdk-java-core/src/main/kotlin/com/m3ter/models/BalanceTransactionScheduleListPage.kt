// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.balances.TransactionScheduleService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see TransactionScheduleService.list */
class BalanceTransactionScheduleListPage
private constructor(
    private val service: TransactionScheduleService,
    private val params: BalanceTransactionScheduleListParams,
    private val response: BalanceTransactionScheduleListPageResponse,
) : Page<ScheduleResponse> {

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

    override fun nextPage(): BalanceTransactionScheduleListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ScheduleResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BalanceTransactionScheduleListParams = params

    /** The response that this page was parsed from. */
    fun response(): BalanceTransactionScheduleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BalanceTransactionScheduleListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceTransactionScheduleListPage]. */
    class Builder internal constructor() {

        private var service: TransactionScheduleService? = null
        private var params: BalanceTransactionScheduleListParams? = null
        private var response: BalanceTransactionScheduleListPageResponse? = null

        @JvmSynthetic
        internal fun from(balanceTransactionScheduleListPage: BalanceTransactionScheduleListPage) =
            apply {
                service = balanceTransactionScheduleListPage.service
                params = balanceTransactionScheduleListPage.params
                response = balanceTransactionScheduleListPage.response
            }

        fun service(service: TransactionScheduleService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BalanceTransactionScheduleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BalanceTransactionScheduleListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BalanceTransactionScheduleListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BalanceTransactionScheduleListPage =
            BalanceTransactionScheduleListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceTransactionScheduleListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BalanceTransactionScheduleListPage{service=$service, params=$params, response=$response}"
}
