// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.bills.CreditLineItemService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [CreditLineItemService.list] */
class BillCreditLineItemListPage
private constructor(
    private val service: CreditLineItemService,
    private val params: BillCreditLineItemListParams,
    private val response: BillCreditLineItemListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BillCreditLineItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<BillCreditLineItemListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): BillCreditLineItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillCreditLineItemListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillCreditLineItemListPage].
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

    /** A builder for [BillCreditLineItemListPage]. */
    class Builder internal constructor() {

        private var service: CreditLineItemService? = null
        private var params: BillCreditLineItemListParams? = null
        private var response: BillCreditLineItemListPageResponse? = null

        @JvmSynthetic
        internal fun from(billCreditLineItemListPage: BillCreditLineItemListPage) = apply {
            service = billCreditLineItemListPage.service
            params = billCreditLineItemListPage.params
            response = billCreditLineItemListPage.response
        }

        fun service(service: CreditLineItemService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BillCreditLineItemListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillCreditLineItemListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BillCreditLineItemListPage].
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
        fun build(): BillCreditLineItemListPage =
            BillCreditLineItemListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: BillCreditLineItemListPage) :
        Iterable<CreditLineItemResponse> {

        override fun iterator(): Iterator<CreditLineItemResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<CreditLineItemResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillCreditLineItemListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "BillCreditLineItemListPage{service=$service, params=$params, response=$response}"
}
