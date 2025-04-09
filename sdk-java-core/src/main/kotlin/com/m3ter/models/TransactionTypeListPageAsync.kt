// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.TransactionTypeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves a list of TransactionType entities for the specified Organization. The list can be
 * paginated for easier management, and supports filtering by various parameters.
 */
class TransactionTypeListPageAsync
private constructor(
    private val transactionTypesService: TransactionTypeServiceAsync,
    private val params: TransactionTypeListParams,
    private val response: TransactionTypeListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): TransactionTypeListPageResponse = response

    /**
     * Delegates to [TransactionTypeListPageResponse], but gracefully handles missing data.
     *
     * @see [TransactionTypeListPageResponse.data]
     */
    fun data(): List<TransactionTypeResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TransactionTypeListPageResponse], but gracefully handles missing data.
     *
     * @see [TransactionTypeListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionTypeListPageAsync && transactionTypesService == other.transactionTypesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(transactionTypesService, params, response) /* spotless:on */

    override fun toString() =
        "TransactionTypeListPageAsync{transactionTypesService=$transactionTypesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<TransactionTypeListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<TransactionTypeListPageAsync>> {
        return getNextPageParams()
            .map { transactionTypesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            transactionTypesService: TransactionTypeServiceAsync,
            params: TransactionTypeListParams,
            response: TransactionTypeListPageResponse,
        ) = TransactionTypeListPageAsync(transactionTypesService, params, response)
    }

    class AutoPager(private val firstPage: TransactionTypeListPageAsync) {

        fun forEach(
            action: Predicate<TransactionTypeResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<TransactionTypeListPageAsync>>.forEach(
                action: (TransactionTypeResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<TransactionTypeResponse>> {
            val values = mutableListOf<TransactionTypeResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
