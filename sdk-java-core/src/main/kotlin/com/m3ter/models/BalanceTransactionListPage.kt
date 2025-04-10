// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.balances.TransactionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [TransactionService.list] */
class BalanceTransactionListPage
private constructor(
    private val service: TransactionService,
    private val params: BalanceTransactionListParams,
    private val response: BalanceTransactionListPageResponse,
) {

    /**
     * Delegates to [BalanceTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [BalanceTransactionListPageResponse.data]
     */
    fun data(): List<TransactionResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BalanceTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [BalanceTransactionListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BalanceTransactionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<BalanceTransactionListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): BalanceTransactionListParams = params

    /** The response that this page was parsed from. */
    fun response(): BalanceTransactionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BalanceTransactionListPage].
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

    /** A builder for [BalanceTransactionListPage]. */
    class Builder internal constructor() {

        private var service: TransactionService? = null
        private var params: BalanceTransactionListParams? = null
        private var response: BalanceTransactionListPageResponse? = null

        @JvmSynthetic
        internal fun from(balanceTransactionListPage: BalanceTransactionListPage) = apply {
            service = balanceTransactionListPage.service
            params = balanceTransactionListPage.params
            response = balanceTransactionListPage.response
        }

        fun service(service: TransactionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BalanceTransactionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BalanceTransactionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BalanceTransactionListPage].
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
        fun build(): BalanceTransactionListPage =
            BalanceTransactionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: BalanceTransactionListPage) :
        Iterable<TransactionResponse> {

        override fun iterator(): Iterator<TransactionResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<TransactionResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceTransactionListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "BalanceTransactionListPage{service=$service, params=$params, response=$response}"
}
