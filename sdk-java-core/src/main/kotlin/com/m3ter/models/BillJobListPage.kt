// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.BillJobService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [BillJobService.list] */
class BillJobListPage
private constructor(
    private val service: BillJobService,
    private val params: BillJobListParams,
    private val response: BillJobListPageResponse,
) : Page<BillJobResponse> {

    /**
     * Delegates to [BillJobListPageResponse], but gracefully handles missing data.
     *
     * @see [BillJobListPageResponse.data]
     */
    fun data(): List<BillJobResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillJobListPageResponse], but gracefully handles missing data.
     *
     * @see [BillJobListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<BillJobResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): BillJobListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): BillJobListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BillJobResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BillJobListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillJobListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillJobListPage].
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

    /** A builder for [BillJobListPage]. */
    class Builder internal constructor() {

        private var service: BillJobService? = null
        private var params: BillJobListParams? = null
        private var response: BillJobListPageResponse? = null

        @JvmSynthetic
        internal fun from(billJobListPage: BillJobListPage) = apply {
            service = billJobListPage.service
            params = billJobListPage.params
            response = billJobListPage.response
        }

        fun service(service: BillJobService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BillJobListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillJobListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BillJobListPage].
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
        fun build(): BillJobListPage =
            BillJobListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillJobListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "BillJobListPage{service=$service, params=$params, response=$response}"
}
