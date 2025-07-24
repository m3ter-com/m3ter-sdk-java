// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.PlanGroupService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PlanGroupService.list */
class PlanGroupListPage
private constructor(
    private val service: PlanGroupService,
    private val params: PlanGroupListParams,
    private val response: PlanGroupListPageResponse,
) : Page<PlanGroupResponse> {

    /**
     * Delegates to [PlanGroupListPageResponse], but gracefully handles missing data.
     *
     * @see PlanGroupListPageResponse.data
     */
    fun data(): List<PlanGroupResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanGroupListPageResponse], but gracefully handles missing data.
     *
     * @see PlanGroupListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<PlanGroupResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): PlanGroupListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): PlanGroupListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PlanGroupResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PlanGroupListParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanGroupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanGroupListPage].
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

    /** A builder for [PlanGroupListPage]. */
    class Builder internal constructor() {

        private var service: PlanGroupService? = null
        private var params: PlanGroupListParams? = null
        private var response: PlanGroupListPageResponse? = null

        @JvmSynthetic
        internal fun from(planGroupListPage: PlanGroupListPage) = apply {
            service = planGroupListPage.service
            params = planGroupListPage.params
            response = planGroupListPage.response
        }

        fun service(service: PlanGroupService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlanGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanGroupListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanGroupListPage].
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
        fun build(): PlanGroupListPage =
            PlanGroupListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanGroupListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PlanGroupListPage{service=$service, params=$params, response=$response}"
}
