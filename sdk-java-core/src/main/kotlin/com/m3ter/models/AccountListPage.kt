// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.AccountService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [AccountService.list] */
class AccountListPage
private constructor(
    private val service: AccountService,
    private val params: AccountListParams,
    private val response: AccountListPageResponse,
) : Page<AccountResponse> {

    /**
     * Delegates to [AccountListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountListPageResponse.data]
     */
    fun data(): List<AccountResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<AccountResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): AccountListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): AccountListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AccountResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountListPage].
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

    /** A builder for [AccountListPage]. */
    class Builder internal constructor() {

        private var service: AccountService? = null
        private var params: AccountListParams? = null
        private var response: AccountListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountListPage: AccountListPage) = apply {
            service = accountListPage.service
            params = accountListPage.params
            response = accountListPage.response
        }

        fun service(service: AccountService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountListPage].
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
        fun build(): AccountListPage =
            AccountListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AccountListPage{service=$service, params=$params, response=$response}"
}
