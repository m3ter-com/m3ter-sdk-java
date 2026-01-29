// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.PlanGroupLinkService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PlanGroupLinkService.list */
class PlanGroupLinkListPage
private constructor(
    private val service: PlanGroupLinkService,
    private val params: PlanGroupLinkListParams,
    private val response: PlanGroupLinkListPageResponse,
) : Page<PlanGroupLinkResponse> {

    /**
     * Delegates to [PlanGroupLinkListPageResponse], but gracefully handles missing data.
     *
     * @see PlanGroupLinkListPageResponse.data
     */
    fun data(): List<PlanGroupLinkResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanGroupLinkListPageResponse], but gracefully handles missing data.
     *
     * @see PlanGroupLinkListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<PlanGroupLinkResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): PlanGroupLinkListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): PlanGroupLinkListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PlanGroupLinkResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PlanGroupLinkListParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanGroupLinkListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanGroupLinkListPage].
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

    /** A builder for [PlanGroupLinkListPage]. */
    class Builder internal constructor() {

        private var service: PlanGroupLinkService? = null
        private var params: PlanGroupLinkListParams? = null
        private var response: PlanGroupLinkListPageResponse? = null

        @JvmSynthetic
        internal fun from(planGroupLinkListPage: PlanGroupLinkListPage) = apply {
            service = planGroupLinkListPage.service
            params = planGroupLinkListPage.params
            response = planGroupLinkListPage.response
        }

        fun service(service: PlanGroupLinkService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlanGroupLinkListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanGroupLinkListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanGroupLinkListPage].
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
        fun build(): PlanGroupLinkListPage =
            PlanGroupLinkListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanGroupLinkListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PlanGroupLinkListPage{service=$service, params=$params, response=$response}"
}
