// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.CounterPricingService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of CounterPricing entities filtered by date, Plan ID, Plan Template ID, or
 * CounterPricing ID.
 */
class CounterPricingListPage
private constructor(
    private val counterPricingsService: CounterPricingService,
    private val params: CounterPricingListParams,
    private val response: CounterPricingListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CounterPricingListPageResponse = response

    /**
     * Delegates to [CounterPricingListPageResponse], but gracefully handles missing data.
     *
     * @see [CounterPricingListPageResponse.data]
     */
    fun data(): List<CounterPricingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CounterPricingListPageResponse], but gracefully handles missing data.
     *
     * @see [CounterPricingListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterPricingListPage && counterPricingsService == other.counterPricingsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(counterPricingsService, params, response) /* spotless:on */

    override fun toString() =
        "CounterPricingListPage{counterPricingsService=$counterPricingsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CounterPricingListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CounterPricingListPage> {
        return getNextPageParams().map { counterPricingsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            counterPricingsService: CounterPricingService,
            params: CounterPricingListParams,
            response: CounterPricingListPageResponse,
        ) = CounterPricingListPage(counterPricingsService, params, response)
    }

    class AutoPager(private val firstPage: CounterPricingListPage) :
        Iterable<CounterPricingResponse> {

        override fun iterator(): Iterator<CounterPricingResponse> = iterator {
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

        fun stream(): Stream<CounterPricingResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
