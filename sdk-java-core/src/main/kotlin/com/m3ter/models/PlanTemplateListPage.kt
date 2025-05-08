// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.PlanTemplateService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [PlanTemplateService.list] */
class PlanTemplateListPage
private constructor(
    private val service: PlanTemplateService,
    private val params: PlanTemplateListParams,
    private val response: PlanTemplateListPageResponse,
) : Page<PlanTemplateResponse> {

    /**
     * Delegates to [PlanTemplateListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanTemplateListPageResponse.data]
     */
    fun data(): List<PlanTemplateResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanTemplateListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanTemplateListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<PlanTemplateResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): PlanTemplateListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): PlanTemplateListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PlanTemplateResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PlanTemplateListParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanTemplateListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanTemplateListPage].
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

    /** A builder for [PlanTemplateListPage]. */
    class Builder internal constructor() {

        private var service: PlanTemplateService? = null
        private var params: PlanTemplateListParams? = null
        private var response: PlanTemplateListPageResponse? = null

        @JvmSynthetic
        internal fun from(planTemplateListPage: PlanTemplateListPage) = apply {
            service = planTemplateListPage.service
            params = planTemplateListPage.params
            response = planTemplateListPage.response
        }

        fun service(service: PlanTemplateService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlanTemplateListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanTemplateListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanTemplateListPage].
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
        fun build(): PlanTemplateListPage =
            PlanTemplateListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanTemplateListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PlanTemplateListPage{service=$service, params=$params, response=$response}"
}
