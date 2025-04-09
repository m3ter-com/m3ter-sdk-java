// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.CurrencyServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of Currencies.
 *
 * Retrieves a list of Currencies for the specified Organization. This endpoint supports pagination
 * and includes various query parameters to filter the Currencies based on Currency ID, and short
 * codes.
 */
class CurrencyListPageAsync
private constructor(
    private val currenciesService: CurrencyServiceAsync,
    private val params: CurrencyListParams,
    private val response: CurrencyListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CurrencyListPageResponse = response

    /**
     * Delegates to [CurrencyListPageResponse], but gracefully handles missing data.
     *
     * @see [CurrencyListPageResponse.data]
     */
    fun data(): List<CurrencyResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CurrencyListPageResponse], but gracefully handles missing data.
     *
     * @see [CurrencyListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CurrencyListPageAsync && currenciesService == other.currenciesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(currenciesService, params, response) /* spotless:on */

    override fun toString() =
        "CurrencyListPageAsync{currenciesService=$currenciesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CurrencyListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CurrencyListPageAsync>> {
        return getNextPageParams()
            .map { currenciesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            currenciesService: CurrencyServiceAsync,
            params: CurrencyListParams,
            response: CurrencyListPageResponse,
        ) = CurrencyListPageAsync(currenciesService, params, response)
    }

    class AutoPager(private val firstPage: CurrencyListPageAsync) {

        fun forEach(
            action: Predicate<CurrencyResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CurrencyListPageAsync>>.forEach(
                action: (CurrencyResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<CurrencyResponse>> {
            val values = mutableListOf<CurrencyResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
