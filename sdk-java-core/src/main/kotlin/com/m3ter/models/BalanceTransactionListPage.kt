// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.balances.TransactionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve all Transactions for a specific Balance.
 *
 * This endpoint returns a list of all Transactions associated with a specific Balance. You can
 * paginate through the Transactions by using the `pageSize` and `nextToken` parameters.
 */
class BalanceTransactionListPage
private constructor(
    private val transactionsService: TransactionService,
    private val params: BalanceTransactionListParams,
    private val response: BalanceTransactionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): BalanceTransactionListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceTransactionListPage && transactionsService == other.transactionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(transactionsService, params, response) /* spotless:on */

    override fun toString() =
        "BalanceTransactionListPage{transactionsService=$transactionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BalanceTransactionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<BalanceTransactionListPage> {
        return getNextPageParams().map { transactionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            transactionsService: TransactionService,
            params: BalanceTransactionListParams,
            response: BalanceTransactionListPageResponse,
        ) = BalanceTransactionListPage(transactionsService, params, response)
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
}
