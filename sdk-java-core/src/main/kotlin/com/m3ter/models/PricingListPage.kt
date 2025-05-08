// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.PricingService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [PricingService.list] */
class PricingListPage
private constructor(
    private val service: PricingService,
    private val params: PricingListParams,
    private val response: PricingListPageResponse,
) : Page<PricingResponse> {

    /**
     * Delegates to [PricingListPageResponse], but gracefully handles missing data.
     *
     * @see [PricingListPageResponse.data]
     */
    fun data(): List<PricingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PricingListPageResponse], but gracefully handles missing data.
     *
     * @see [PricingListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<PricingResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): PricingListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): PricingListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PricingResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PricingListParams = params

    /** The response that this page was parsed from. */
    fun response(): PricingListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PricingListPage].
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

    /** A builder for [PricingListPage]. */
    class Builder internal constructor() {

        private var service: PricingService? = null
        private var params: PricingListParams? = null
        private var response: PricingListPageResponse? = null

        @JvmSynthetic
        internal fun from(pricingListPage: PricingListPage) = apply {
            service = pricingListPage.service
            params = pricingListPage.params
            response = pricingListPage.response
        }

        fun service(service: PricingService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PricingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PricingListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PricingListPage].
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
        fun build(): PricingListPage =
            PricingListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PricingListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PricingListPage{service=$service, params=$params, response=$response}"
}
