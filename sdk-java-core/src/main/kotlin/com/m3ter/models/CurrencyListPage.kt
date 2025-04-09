// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.CurrencyService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of Currencies.
 *
 * Retrieves a list of Currencies for the specified Organization. This endpoint supports pagination
 * and includes various query parameters to filter the Currencies based on Currency ID, and short
 * codes.
 */
class CurrencyListPage
private constructor(
    private val currenciesService: CurrencyService,
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

        return /* spotless:off */ other is CurrencyListPage && currenciesService == other.currenciesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(currenciesService, params, response) /* spotless:on */

    override fun toString() =
        "CurrencyListPage{currenciesService=$currenciesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CurrencyListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CurrencyListPage> {
        return getNextPageParams().map { currenciesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            currenciesService: CurrencyService,
            params: CurrencyListParams,
            response: CurrencyListPageResponse,
        ) = CurrencyListPage(currenciesService, params, response)
    }

    class AutoPager(private val firstPage: CurrencyListPage) : Iterable<CurrencyResponse> {

        override fun iterator(): Iterator<CurrencyResponse> = iterator {
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

        fun stream(): Stream<CurrencyResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
