// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.PlanService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [PlanService.list] */
class PlanListPage
private constructor(
    private val service: PlanService,
    private val params: PlanListParams,
    private val response: PlanListPageResponse,
) : Page<PlanResponse> {

    /**
     * Delegates to [PlanListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanListPageResponse.data]
     */
    fun data(): List<PlanResponse> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<PlanResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): PlanListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): PlanListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PlanResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PlanListParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanListPage].
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

    /** A builder for [PlanListPage]. */
    class Builder internal constructor() {

        private var service: PlanService? = null
        private var params: PlanListParams? = null
        private var response: PlanListPageResponse? = null

        @JvmSynthetic
        internal fun from(planListPage: PlanListPage) = apply {
            service = planListPage.service
            params = planListPage.params
            response = planListPage.response
        }

        fun service(service: PlanService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlanListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanListPage].
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
        fun build(): PlanListPage =
            PlanListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() = "PlanListPage{service=$service, params=$params, response=$response}"
}
