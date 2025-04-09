// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.MeterService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of Meters that can be filtered by Product, Meter ID, or Meter short code. */
class MeterListPage
private constructor(
    private val metersService: MeterService,
    private val params: MeterListParams,
    private val response: MeterListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): MeterListPageResponse = response

    /**
     * Delegates to [MeterListPageResponse], but gracefully handles missing data.
     *
     * @see [MeterListPageResponse.data]
     */
    fun data(): List<MeterResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MeterListPageResponse], but gracefully handles missing data.
     *
     * @see [MeterListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MeterListPage && metersService == other.metersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(metersService, params, response) /* spotless:on */

    override fun toString() =
        "MeterListPage{metersService=$metersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<MeterListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<MeterListPage> {
        return getNextPageParams().map { metersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            metersService: MeterService,
            params: MeterListParams,
            response: MeterListPageResponse,
        ) = MeterListPage(metersService, params, response)
    }

    class AutoPager(private val firstPage: MeterListPage) : Iterable<MeterResponse> {

        override fun iterator(): Iterator<MeterResponse> = iterator {
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

        fun stream(): Stream<MeterResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
