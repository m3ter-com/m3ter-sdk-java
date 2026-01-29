// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.balances.ChargeScheduleService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ChargeScheduleService.list */
class BalanceChargeScheduleListPage
private constructor(
    private val service: ChargeScheduleService,
    private val params: BalanceChargeScheduleListParams,
    private val response: BalanceChargeScheduleListPageResponse,
) : Page<BalanceChargeScheduleListResponse> {

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

    override fun nextPage(): BalanceChargeScheduleListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BalanceChargeScheduleListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BalanceChargeScheduleListParams = params

    /** The response that this page was parsed from. */
    fun response(): BalanceChargeScheduleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BalanceChargeScheduleListPage].
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

    /** A builder for [BalanceChargeScheduleListPage]. */
    class Builder internal constructor() {

        private var service: ChargeScheduleService? = null
        private var params: BalanceChargeScheduleListParams? = null
        private var response: BalanceChargeScheduleListPageResponse? = null

        @JvmSynthetic
        internal fun from(balanceChargeScheduleListPage: BalanceChargeScheduleListPage) = apply {
            service = balanceChargeScheduleListPage.service
            params = balanceChargeScheduleListPage.params
            response = balanceChargeScheduleListPage.response
        }

        fun service(service: ChargeScheduleService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BalanceChargeScheduleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BalanceChargeScheduleListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BalanceChargeScheduleListPage].
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
        fun build(): BalanceChargeScheduleListPage =
            BalanceChargeScheduleListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceChargeScheduleListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BalanceChargeScheduleListPage{service=$service, params=$params, response=$response}"
}
