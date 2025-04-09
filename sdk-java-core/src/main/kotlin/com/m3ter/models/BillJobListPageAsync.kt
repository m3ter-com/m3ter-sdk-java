// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.BillJobServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of BillJobs.
 *
 * This endpoint retrieves a list of BillJobs for a specified organization. The list can be
 * paginated for easier management, and allows you to query and filter based on various parameters,
 * such as BillJob `status` and whether or not BillJob remains `active`.
 */
class BillJobListPageAsync
private constructor(
    private val billJobsService: BillJobServiceAsync,
    private val params: BillJobListParams,
    private val response: BillJobListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): BillJobListPageResponse = response

    /**
     * Delegates to [BillJobListPageResponse], but gracefully handles missing data.
     *
     * @see [BillJobListPageResponse.data]
     */
    fun data(): List<BillJobResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillJobListPageResponse], but gracefully handles missing data.
     *
     * @see [BillJobListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillJobListPageAsync && billJobsService == other.billJobsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(billJobsService, params, response) /* spotless:on */

    override fun toString() =
        "BillJobListPageAsync{billJobsService=$billJobsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BillJobListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<BillJobListPageAsync>> {
        return getNextPageParams()
            .map { billJobsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            billJobsService: BillJobServiceAsync,
            params: BillJobListParams,
            response: BillJobListPageResponse,
        ) = BillJobListPageAsync(billJobsService, params, response)
    }

    class AutoPager(private val firstPage: BillJobListPageAsync) {

        fun forEach(
            action: Predicate<BillJobResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BillJobListPageAsync>>.forEach(
                action: (BillJobResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<BillJobResponse>> {
            val values = mutableListOf<BillJobResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
