// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.CounterAdjustmentService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [CounterAdjustmentService.list] */
class CounterAdjustmentListPage
private constructor(
    private val service: CounterAdjustmentService,
    private val params: CounterAdjustmentListParams,
    private val response: CounterAdjustmentListPageResponse,
) : Page<CounterAdjustmentResponse> {

    /**
     * Delegates to [CounterAdjustmentListPageResponse], but gracefully handles missing data.
     *
     * @see [CounterAdjustmentListPageResponse.data]
     */
    fun data(): List<CounterAdjustmentResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CounterAdjustmentListPageResponse], but gracefully handles missing data.
     *
     * @see [CounterAdjustmentListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<CounterAdjustmentResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): CounterAdjustmentListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CounterAdjustmentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CounterAdjustmentResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CounterAdjustmentListParams = params

    /** The response that this page was parsed from. */
    fun response(): CounterAdjustmentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CounterAdjustmentListPage].
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

    /** A builder for [CounterAdjustmentListPage]. */
    class Builder internal constructor() {

        private var service: CounterAdjustmentService? = null
        private var params: CounterAdjustmentListParams? = null
        private var response: CounterAdjustmentListPageResponse? = null

        @JvmSynthetic
        internal fun from(counterAdjustmentListPage: CounterAdjustmentListPage) = apply {
            service = counterAdjustmentListPage.service
            params = counterAdjustmentListPage.params
            response = counterAdjustmentListPage.response
        }

        fun service(service: CounterAdjustmentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CounterAdjustmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CounterAdjustmentListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CounterAdjustmentListPage].
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
        fun build(): CounterAdjustmentListPage =
            CounterAdjustmentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterAdjustmentListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CounterAdjustmentListPage{service=$service, params=$params, response=$response}"
}
