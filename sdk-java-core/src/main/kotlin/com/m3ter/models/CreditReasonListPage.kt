// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.CreditReasonService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of the Credit Reason entities created for your Organization. You can filter the
 * list returned for the call by Credit Reason ID, Credit Reason short code, or by Archive status.
 */
class CreditReasonListPage
private constructor(
    private val creditReasonsService: CreditReasonService,
    private val params: CreditReasonListParams,
    private val response: CreditReasonListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CreditReasonListPageResponse = response

    /**
     * Delegates to [CreditReasonListPageResponse], but gracefully handles missing data.
     *
     * @see [CreditReasonListPageResponse.data]
     */
    fun data(): List<CreditReasonResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CreditReasonListPageResponse], but gracefully handles missing data.
     *
     * @see [CreditReasonListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditReasonListPage && creditReasonsService == other.creditReasonsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(creditReasonsService, params, response) /* spotless:on */

    override fun toString() =
        "CreditReasonListPage{creditReasonsService=$creditReasonsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CreditReasonListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CreditReasonListPage> {
        return getNextPageParams().map { creditReasonsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            creditReasonsService: CreditReasonService,
            params: CreditReasonListParams,
            response: CreditReasonListPageResponse,
        ) = CreditReasonListPage(creditReasonsService, params, response)
    }

    class AutoPager(private val firstPage: CreditReasonListPage) : Iterable<CreditReasonResponse> {

        override fun iterator(): Iterator<CreditReasonResponse> = iterator {
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

        fun stream(): Stream<CreditReasonResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
