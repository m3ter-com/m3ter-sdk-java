// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.AccountService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AccountService.listChildren */
class AccountListChildrenPage
private constructor(
    private val service: AccountService,
    private val params: AccountListChildrenParams,
    private val response: AccountListChildrenPageResponse,
) : Page<AccountResponse> {

    /**
     * Delegates to [AccountListChildrenPageResponse], but gracefully handles missing data.
     *
     * @see AccountListChildrenPageResponse.data
     */
    fun data(): List<AccountResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountListChildrenPageResponse], but gracefully handles missing data.
     *
     * @see AccountListChildrenPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<AccountResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): AccountListChildrenParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): AccountListChildrenPage = service.listChildren(nextPageParams())

    fun autoPager(): AutoPager<AccountResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountListChildrenParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountListChildrenPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountListChildrenPage].
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

    /** A builder for [AccountListChildrenPage]. */
    class Builder internal constructor() {

        private var service: AccountService? = null
        private var params: AccountListChildrenParams? = null
        private var response: AccountListChildrenPageResponse? = null

        @JvmSynthetic
        internal fun from(accountListChildrenPage: AccountListChildrenPage) = apply {
            service = accountListChildrenPage.service
            params = accountListChildrenPage.params
            response = accountListChildrenPage.response
        }

        fun service(service: AccountService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountListChildrenParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountListChildrenPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountListChildrenPage].
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
        fun build(): AccountListChildrenPage =
            AccountListChildrenPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountListChildrenPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AccountListChildrenPage{service=$service, params=$params, response=$response}"
}
