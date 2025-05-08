// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.AccountPlanService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [AccountPlanService.list] */
class AccountPlanListPage
private constructor(
    private val service: AccountPlanService,
    private val params: AccountPlanListParams,
    private val response: AccountPlanListPageResponse,
) : Page<AccountPlanResponse> {

    /**
     * Delegates to [AccountPlanListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountPlanListPageResponse.data]
     */
    fun data(): List<AccountPlanResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountPlanListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountPlanListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<AccountPlanResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): AccountPlanListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): AccountPlanListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AccountPlanResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountPlanListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountPlanListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountPlanListPage].
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

    /** A builder for [AccountPlanListPage]. */
    class Builder internal constructor() {

        private var service: AccountPlanService? = null
        private var params: AccountPlanListParams? = null
        private var response: AccountPlanListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountPlanListPage: AccountPlanListPage) = apply {
            service = accountPlanListPage.service
            params = accountPlanListPage.params
            response = accountPlanListPage.response
        }

        fun service(service: AccountPlanService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountPlanListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountPlanListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountPlanListPage].
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
        fun build(): AccountPlanListPage =
            AccountPlanListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountPlanListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AccountPlanListPage{service=$service, params=$params, response=$response}"
}
