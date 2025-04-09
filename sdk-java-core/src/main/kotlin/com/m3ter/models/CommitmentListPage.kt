// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.CommitmentService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of Commitments.
 *
 * Retrieves a list of all Commitments associated with an Organization. This endpoint supports
 * pagination and includes various query parameters to filter the Commitments based on Account,
 * Product, date, and end dates.
 */
class CommitmentListPage
private constructor(
    private val commitmentsService: CommitmentService,
    private val params: CommitmentListParams,
    private val response: CommitmentListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CommitmentListPageResponse = response

    /**
     * Delegates to [CommitmentListPageResponse], but gracefully handles missing data.
     *
     * @see [CommitmentListPageResponse.data]
     */
    fun data(): List<CommitmentResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CommitmentListPageResponse], but gracefully handles missing data.
     *
     * @see [CommitmentListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CommitmentListPage && commitmentsService == other.commitmentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(commitmentsService, params, response) /* spotless:on */

    override fun toString() =
        "CommitmentListPage{commitmentsService=$commitmentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CommitmentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CommitmentListPage> {
        return getNextPageParams().map { commitmentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            commitmentsService: CommitmentService,
            params: CommitmentListParams,
            response: CommitmentListPageResponse,
        ) = CommitmentListPage(commitmentsService, params, response)
    }

    class AutoPager(private val firstPage: CommitmentListPage) : Iterable<CommitmentResponse> {

        override fun iterator(): Iterator<CommitmentResponse> = iterator {
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

        fun stream(): Stream<CommitmentResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
