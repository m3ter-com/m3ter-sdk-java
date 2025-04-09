// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.bills.LineItemService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [LineItemService.list] */
class BillLineItemListPage
private constructor(
    private val service: LineItemService,
    private val params: BillLineItemListParams,
    private val response: BillLineItemListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BillLineItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<BillLineItemListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): BillLineItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillLineItemListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillLineItemListPage].
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

    /** A builder for [BillLineItemListPage]. */
    class Builder internal constructor() {

        private var service: LineItemService? = null
        private var params: BillLineItemListParams? = null
        private var response: BillLineItemListPageResponse? = null

        @JvmSynthetic
        internal fun from(billLineItemListPage: BillLineItemListPage) = apply {
            service = billLineItemListPage.service
            params = billLineItemListPage.params
            response = billLineItemListPage.response
        }

        fun service(service: LineItemService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BillLineItemListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillLineItemListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BillLineItemListPage].
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
        fun build(): BillLineItemListPage =
            BillLineItemListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: BillLineItemListPage) : Iterable<LineItemResponse> {

        override fun iterator(): Iterator<LineItemResponse> = iterator {
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

        fun stream(): Stream<LineItemResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillLineItemListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "BillLineItemListPage{service=$service, params=$params, response=$response}"
}
