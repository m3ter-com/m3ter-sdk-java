// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.bills.DebitLineItemService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see DebitLineItemService.list */
class BillDebitLineItemListPage
private constructor(
    private val service: DebitLineItemService,
    private val params: BillDebitLineItemListParams,
    private val response: BillDebitLineItemListPageResponse,
) : Page<DebitLineItemResponse> {

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

    override fun nextPage(): BillDebitLineItemListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DebitLineItemResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BillDebitLineItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillDebitLineItemListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillDebitLineItemListPage].
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

    /** A builder for [BillDebitLineItemListPage]. */
    class Builder internal constructor() {

        private var service: DebitLineItemService? = null
        private var params: BillDebitLineItemListParams? = null
        private var response: BillDebitLineItemListPageResponse? = null

        @JvmSynthetic
        internal fun from(billDebitLineItemListPage: BillDebitLineItemListPage) = apply {
            service = billDebitLineItemListPage.service
            params = billDebitLineItemListPage.params
            response = billDebitLineItemListPage.response
        }

        fun service(service: DebitLineItemService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BillDebitLineItemListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillDebitLineItemListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BillDebitLineItemListPage].
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
        fun build(): BillDebitLineItemListPage =
            BillDebitLineItemListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BillDebitLineItemListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BillDebitLineItemListPage{service=$service, params=$params, response=$response}"
}
