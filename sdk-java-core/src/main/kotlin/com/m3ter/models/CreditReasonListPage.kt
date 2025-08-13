// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.CreditReasonService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CreditReasonService.list */
class CreditReasonListPage
private constructor(
    private val service: CreditReasonService,
    private val params: CreditReasonListParams,
    private val response: CreditReasonListPageResponse,
) : Page<CreditReasonResponse> {

    /**
     * Delegates to [CreditReasonListPageResponse], but gracefully handles missing data.
     *
     * @see CreditReasonListPageResponse.data
     */
    fun data(): List<CreditReasonResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CreditReasonListPageResponse], but gracefully handles missing data.
     *
     * @see CreditReasonListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<CreditReasonResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): CreditReasonListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CreditReasonListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CreditReasonResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CreditReasonListParams = params

    /** The response that this page was parsed from. */
    fun response(): CreditReasonListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditReasonListPage].
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

    /** A builder for [CreditReasonListPage]. */
    class Builder internal constructor() {

        private var service: CreditReasonService? = null
        private var params: CreditReasonListParams? = null
        private var response: CreditReasonListPageResponse? = null

        @JvmSynthetic
        internal fun from(creditReasonListPage: CreditReasonListPage) = apply {
            service = creditReasonListPage.service
            params = creditReasonListPage.params
            response = creditReasonListPage.response
        }

        fun service(service: CreditReasonService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CreditReasonListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CreditReasonListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CreditReasonListPage].
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
        fun build(): CreditReasonListPage =
            CreditReasonListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditReasonListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CreditReasonListPage{service=$service, params=$params, response=$response}"
}
