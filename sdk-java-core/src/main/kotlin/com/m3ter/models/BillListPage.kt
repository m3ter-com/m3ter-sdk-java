// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.BillService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [BillService.list] */
class BillListPage
private constructor(
    private val service: BillService,
    private val params: BillListParams,
    private val response: BillListPageResponse,
) : Page<BillResponse> {

    /**
     * Delegates to [BillListPageResponse], but gracefully handles missing data.
     *
     * @see [BillListPageResponse.data]
     */
    fun data(): List<BillResponse> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillListPageResponse], but gracefully handles missing data.
     *
     * @see [BillListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<BillResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): BillListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): BillListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BillResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BillListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillListPage].
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

    /** A builder for [BillListPage]. */
    class Builder internal constructor() {

        private var service: BillService? = null
        private var params: BillListParams? = null
        private var response: BillListPageResponse? = null

        @JvmSynthetic
        internal fun from(billListPage: BillListPage) = apply {
            service = billListPage.service
            params = billListPage.params
            response = billListPage.response
        }

        fun service(service: BillService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BillListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BillListPage].
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
        fun build(): BillListPage =
            BillListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() = "BillListPage{service=$service, params=$params, response=$response}"
}
