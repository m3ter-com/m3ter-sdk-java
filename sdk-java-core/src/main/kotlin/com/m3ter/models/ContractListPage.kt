// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.ContractService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ContractService.list */
class ContractListPage
private constructor(
    private val service: ContractService,
    private val params: ContractListParams,
    private val response: ContractListPageResponse,
) : Page<ContractResponse> {

    /**
     * Delegates to [ContractListPageResponse], but gracefully handles missing data.
     *
     * @see ContractListPageResponse.data
     */
    fun data(): List<ContractResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ContractListPageResponse], but gracefully handles missing data.
     *
     * @see ContractListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<ContractResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): ContractListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): ContractListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ContractResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ContractListParams = params

    /** The response that this page was parsed from. */
    fun response(): ContractListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ContractListPage].
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

    /** A builder for [ContractListPage]. */
    class Builder internal constructor() {

        private var service: ContractService? = null
        private var params: ContractListParams? = null
        private var response: ContractListPageResponse? = null

        @JvmSynthetic
        internal fun from(contractListPage: ContractListPage) = apply {
            service = contractListPage.service
            params = contractListPage.params
            response = contractListPage.response
        }

        fun service(service: ContractService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ContractListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ContractListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ContractListPage].
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
        fun build(): ContractListPage =
            ContractListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ContractListPage{service=$service, params=$params, response=$response}"
}
