// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.TransactionTypeService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieves a list of TransactionType entities for the specified Organization. The list can be
 * paginated for easier management, and supports filtering by various parameters.
 */
class TransactionTypeListPage
private constructor(
    private val transactionTypesService: TransactionTypeService,
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

        return /* spotless:off */ other is TransactionTypeListPage && transactionTypesService == other.transactionTypesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(transactionTypesService, params, response) /* spotless:on */

    override fun toString() =
        "TransactionTypeListPage{transactionTypesService=$transactionTypesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<TransactionTypeListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<TransactionTypeListPage> {
        return getNextPageParams().map { transactionTypesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            transactionTypesService: TransactionTypeService,
            params: TransactionTypeListParams,
            response: TransactionTypeListPageResponse,
        ) = TransactionTypeListPage(transactionTypesService, params, response)
    }

    class AutoPager(private val firstPage: TransactionTypeListPage) :
        Iterable<TransactionTypeResponse> {

        override fun iterator(): Iterator<TransactionTypeResponse> = iterator {
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

        fun stream(): Stream<TransactionTypeResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
