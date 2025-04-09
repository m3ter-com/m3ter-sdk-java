// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.PricingService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of Pricings filtered by date, Plan ID, PlanTemplate ID, or Pricing ID. */
class PricingListPage
private constructor(
    private val pricingsService: PricingService,
    private val params: PricingListParams,
    private val response: PricingListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PricingListPageResponse = response

    /**
     * Delegates to [PricingListPageResponse], but gracefully handles missing data.
     *
     * @see [PricingListPageResponse.data]
     */
    fun data(): List<PricingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PricingListPageResponse], but gracefully handles missing data.
     *
     * @see [PricingListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PricingListPage && pricingsService == other.pricingsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(pricingsService, params, response) /* spotless:on */

    override fun toString() =
        "PricingListPage{pricingsService=$pricingsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<PricingListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<PricingListPage> {
        return getNextPageParams().map { pricingsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            pricingsService: PricingService,
            params: PricingListParams,
            response: PricingListPageResponse,
        ) = PricingListPage(pricingsService, params, response)
    }

    class AutoPager(private val firstPage: PricingListPage) : Iterable<PricingResponse> {

        override fun iterator(): Iterator<PricingResponse> = iterator {
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

        fun stream(): Stream<PricingResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
