// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.CounterAdjustmentService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of CounterAdjustments created for Accounts in your Organization. You can filter
 * the list returned by date, Account ID, or Counter ID.
 *
 * **CONSTRAINTS:**
 * - The `counterId` query parameter is always required when calling this endpoint, used either as a
 *   single query parameter or in combination with any of the other query parameters.
 * - If you want to use the `date`, `dateStart`, or `dateEnd` query parameters, you must also use
 *   the `accountId` query parameter.
 */
class CounterAdjustmentListPage
private constructor(
    private val counterAdjustmentsService: CounterAdjustmentService,
    private val params: CounterAdjustmentListParams,
    private val response: CounterAdjustmentListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CounterAdjustmentListPageResponse = response

    /**
     * Delegates to [CounterAdjustmentListPageResponse], but gracefully handles missing data.
     *
     * @see [CounterAdjustmentListPageResponse.data]
     */
    fun data(): List<CounterAdjustmentResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CounterAdjustmentListPageResponse], but gracefully handles missing data.
     *
     * @see [CounterAdjustmentListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterAdjustmentListPage && counterAdjustmentsService == other.counterAdjustmentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(counterAdjustmentsService, params, response) /* spotless:on */

    override fun toString() =
        "CounterAdjustmentListPage{counterAdjustmentsService=$counterAdjustmentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CounterAdjustmentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CounterAdjustmentListPage> {
        return getNextPageParams().map { counterAdjustmentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            counterAdjustmentsService: CounterAdjustmentService,
            params: CounterAdjustmentListParams,
            response: CounterAdjustmentListPageResponse,
        ) = CounterAdjustmentListPage(counterAdjustmentsService, params, response)
    }

    class AutoPager(private val firstPage: CounterAdjustmentListPage) :
        Iterable<CounterAdjustmentResponse> {

        override fun iterator(): Iterator<CounterAdjustmentResponse> = iterator {
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

        fun stream(): Stream<CounterAdjustmentResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
