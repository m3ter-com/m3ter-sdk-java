// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.CounterPricingService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CounterPricingService.list */
class CounterPricingListPage
private constructor(
    private val service: CounterPricingService,
    private val params: CounterPricingListParams,
    private val response: CounterPricingListPageResponse,
) : Page<CounterPricingResponse> {

    /**
     * Delegates to [CounterPricingListPageResponse], but gracefully handles missing data.
     *
     * @see CounterPricingListPageResponse.data
     */
    fun data(): List<CounterPricingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CounterPricingListPageResponse], but gracefully handles missing data.
     *
     * @see CounterPricingListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<CounterPricingResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): CounterPricingListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CounterPricingListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CounterPricingResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CounterPricingListParams = params

    /** The response that this page was parsed from. */
    fun response(): CounterPricingListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CounterPricingListPage].
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

    /** A builder for [CounterPricingListPage]. */
    class Builder internal constructor() {

        private var service: CounterPricingService? = null
        private var params: CounterPricingListParams? = null
        private var response: CounterPricingListPageResponse? = null

        @JvmSynthetic
        internal fun from(counterPricingListPage: CounterPricingListPage) = apply {
            service = counterPricingListPage.service
            params = counterPricingListPage.params
            response = counterPricingListPage.response
        }

        fun service(service: CounterPricingService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CounterPricingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CounterPricingListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CounterPricingListPage].
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
        fun build(): CounterPricingListPage =
            CounterPricingListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CounterPricingListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CounterPricingListPage{service=$service, params=$params, response=$response}"
}
