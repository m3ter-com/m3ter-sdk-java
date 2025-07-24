// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.TransactionTypeService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see TransactionTypeService.list */
class TransactionTypeListPage
private constructor(
    private val service: TransactionTypeService,
    private val params: TransactionTypeListParams,
    private val response: TransactionTypeListPageResponse,
) : Page<TransactionTypeResponse> {

    /**
     * Delegates to [TransactionTypeListPageResponse], but gracefully handles missing data.
     *
     * @see TransactionTypeListPageResponse.data
     */
    fun data(): List<TransactionTypeResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TransactionTypeListPageResponse], but gracefully handles missing data.
     *
     * @see TransactionTypeListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<TransactionTypeResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): TransactionTypeListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): TransactionTypeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TransactionTypeResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TransactionTypeListParams = params

    /** The response that this page was parsed from. */
    fun response(): TransactionTypeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TransactionTypeListPage].
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

    /** A builder for [TransactionTypeListPage]. */
    class Builder internal constructor() {

        private var service: TransactionTypeService? = null
        private var params: TransactionTypeListParams? = null
        private var response: TransactionTypeListPageResponse? = null

        @JvmSynthetic
        internal fun from(transactionTypeListPage: TransactionTypeListPage) = apply {
            service = transactionTypeListPage.service
            params = transactionTypeListPage.params
            response = transactionTypeListPage.response
        }

        fun service(service: TransactionTypeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TransactionTypeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TransactionTypeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TransactionTypeListPage].
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
        fun build(): TransactionTypeListPage =
            TransactionTypeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionTypeListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "TransactionTypeListPage{service=$service, params=$params, response=$response}"
}
