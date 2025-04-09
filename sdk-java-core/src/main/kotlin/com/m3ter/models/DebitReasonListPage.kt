// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.DebitReasonService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of the Debit Reason entities created for your Organization. You can filter the
 * list returned for the call by Debit Reason ID, Debit Reason short code, or by Archive status.
 */
class DebitReasonListPage
private constructor(
    private val debitReasonsService: DebitReasonService,
    private val params: DebitReasonListParams,
    private val response: DebitReasonListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DebitReasonListPageResponse = response

    /**
     * Delegates to [DebitReasonListPageResponse], but gracefully handles missing data.
     *
     * @see [DebitReasonListPageResponse.data]
     */
    fun data(): List<DebitReasonResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DebitReasonListPageResponse], but gracefully handles missing data.
     *
     * @see [DebitReasonListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DebitReasonListPage && debitReasonsService == other.debitReasonsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(debitReasonsService, params, response) /* spotless:on */

    override fun toString() =
        "DebitReasonListPage{debitReasonsService=$debitReasonsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<DebitReasonListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<DebitReasonListPage> {
        return getNextPageParams().map { debitReasonsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            debitReasonsService: DebitReasonService,
            params: DebitReasonListParams,
            response: DebitReasonListPageResponse,
        ) = DebitReasonListPage(debitReasonsService, params, response)
    }

    class AutoPager(private val firstPage: DebitReasonListPage) : Iterable<DebitReasonResponse> {

        override fun iterator(): Iterator<DebitReasonResponse> = iterator {
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

        fun stream(): Stream<DebitReasonResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
