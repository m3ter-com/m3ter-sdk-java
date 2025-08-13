// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.AggregationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AggregationService.list */
class AggregationListPage
private constructor(
    private val service: AggregationService,
    private val params: AggregationListParams,
    private val response: AggregationListPageResponse,
) : Page<AggregationResponse> {

    /**
     * Delegates to [AggregationListPageResponse], but gracefully handles missing data.
     *
     * @see AggregationListPageResponse.data
     */
    fun data(): List<AggregationResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AggregationListPageResponse], but gracefully handles missing data.
     *
     * @see AggregationListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<AggregationResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): AggregationListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): AggregationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AggregationResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AggregationListParams = params

    /** The response that this page was parsed from. */
    fun response(): AggregationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AggregationListPage].
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

    /** A builder for [AggregationListPage]. */
    class Builder internal constructor() {

        private var service: AggregationService? = null
        private var params: AggregationListParams? = null
        private var response: AggregationListPageResponse? = null

        @JvmSynthetic
        internal fun from(aggregationListPage: AggregationListPage) = apply {
            service = aggregationListPage.service
            params = aggregationListPage.params
            response = aggregationListPage.response
        }

        fun service(service: AggregationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AggregationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AggregationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AggregationListPage].
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
        fun build(): AggregationListPage =
            AggregationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AggregationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AggregationListPage{service=$service, params=$params, response=$response}"
}
