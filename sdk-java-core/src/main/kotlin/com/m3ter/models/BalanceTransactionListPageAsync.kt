// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.balances.TransactionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve all Transactions for a specific Balance.
 *
 * This endpoint returns a list of all Transactions associated with a specific Balance. You can
 * paginate through the Transactions by using the `pageSize` and `nextToken` parameters.
 */
class BalanceTransactionListPageAsync
private constructor(
    private val transactionsService: TransactionServiceAsync,
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

        return /* spotless:off */ other is BalanceTransactionListPageAsync && transactionsService == other.transactionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(transactionsService, params, response) /* spotless:on */

    override fun toString() =
        "BalanceTransactionListPageAsync{transactionsService=$transactionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BalanceTransactionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<BalanceTransactionListPageAsync>> {
        return getNextPageParams()
            .map { transactionsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            transactionsService: TransactionServiceAsync,
            params: BalanceTransactionListParams,
            response: BalanceTransactionListPageResponse,
        ) = BalanceTransactionListPageAsync(transactionsService, params, response)
    }

    class AutoPager(private val firstPage: BalanceTransactionListPageAsync) {

        fun forEach(
            action: Predicate<TransactionResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BalanceTransactionListPageAsync>>.forEach(
                action: (TransactionResponse) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<TransactionResponse>> {
            val values = mutableListOf<TransactionResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
