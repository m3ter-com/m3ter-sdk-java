// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.CounterService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of Counter entities that can be filtered by Product, Counter ID, or Codes. */
class CounterListPage
private constructor(
    private val countersService: CounterService,
    private val params: CounterListParams,
    private val response: CounterListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CounterListPageResponse = response

    /**
     * Delegates to [CounterListPageResponse], but gracefully handles missing data.
     *
     * @see [CounterListPageResponse.data]
     */
    fun data(): List<CounterResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CounterListPageResponse], but gracefully handles missing data.
     *
     * @see [CounterListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterListPage && countersService == other.countersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(countersService, params, response) /* spotless:on */

    override fun toString() =
        "CounterListPage{countersService=$countersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CounterListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CounterListPage> {
        return getNextPageParams().map { countersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            countersService: CounterService,
            params: CounterListParams,
            response: CounterListPageResponse,
        ) = CounterListPage(countersService, params, response)
    }

    class AutoPager(private val firstPage: CounterListPage) : Iterable<CounterResponse> {

        override fun iterator(): Iterator<CounterResponse> = iterator {
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

        fun stream(): Stream<CounterResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
