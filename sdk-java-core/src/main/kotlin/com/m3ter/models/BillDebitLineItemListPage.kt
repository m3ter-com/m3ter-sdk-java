// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.bills.DebitLineItemService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [DebitLineItemService.list] */
class BillDebitLineItemListPage
private constructor(
    private val service: DebitLineItemService,
    private val params: BillDebitLineItemListParams,
    private val response: BillDebitLineItemListPageResponse,
) {

    /**
     * Delegates to [BillDebitLineItemListPageResponse], but gracefully handles missing data.
     *
     * @see [BillDebitLineItemListPageResponse.data]
     */
    fun data(): List<DebitLineItemResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillDebitLineItemListPageResponse], but gracefully handles missing data.
     *
     * @see [BillDebitLineItemListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BillDebitLineItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<BillDebitLineItemListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

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

    class AutoPager(private val firstPage: BillDebitLineItemListPage) :
        Iterable<DebitLineItemResponse> {

        override fun iterator(): Iterator<DebitLineItemResponse> = iterator {
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

        fun stream(): Stream<DebitLineItemResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillDebitLineItemListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "BillDebitLineItemListPage{service=$service, params=$params, response=$response}"
}
