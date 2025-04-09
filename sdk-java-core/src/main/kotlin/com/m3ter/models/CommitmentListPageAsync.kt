// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.CommitmentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of Commitments.
 *
 * Retrieves a list of all Commitments associated with an Organization. This endpoint supports
 * pagination and includes various query parameters to filter the Commitments based on Account,
 * Product, date, and end dates.
 */
class CommitmentListPageAsync
private constructor(
    private val commitmentsService: CommitmentServiceAsync,
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

        return /* spotless:off */ other is CommitmentListPageAsync && commitmentsService == other.commitmentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(commitmentsService, params, response) /* spotless:on */

    override fun toString() =
        "CommitmentListPageAsync{commitmentsService=$commitmentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CommitmentListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CommitmentListPageAsync>> {
        return getNextPageParams()
            .map { commitmentsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            commitmentsService: CommitmentServiceAsync,
            params: CommitmentListParams,
            response: CommitmentListPageResponse,
        ) = CommitmentListPageAsync(commitmentsService, params, response)
    }

    class AutoPager(private val firstPage: CommitmentListPageAsync) {

        fun forEach(
            action: Predicate<CommitmentResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CommitmentListPageAsync>>.forEach(
                action: (CommitmentResponse) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<CommitmentResponse>> {
            val values = mutableListOf<CommitmentResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
