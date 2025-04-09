// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.PlanGroupServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of PlanGroups.
 *
 * Retrieves a list of PlanGroups within the specified organization. You can optionally filter by
 * Account IDs or PlanGroup IDs, and also paginate the results for easier management.
 */
class PlanGroupListPageAsync
private constructor(
    private val planGroupsService: PlanGroupServiceAsync,
    private val params: PlanGroupListParams,
    private val response: PlanGroupListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PlanGroupListPageResponse = response

    /**
     * Delegates to [PlanGroupListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanGroupListPageResponse.data]
     */
    fun data(): List<PlanGroupResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanGroupListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanGroupListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanGroupListPageAsync && planGroupsService == other.planGroupsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(planGroupsService, params, response) /* spotless:on */

    override fun toString() =
        "PlanGroupListPageAsync{planGroupsService=$planGroupsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<PlanGroupListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PlanGroupListPageAsync>> {
        return getNextPageParams()
            .map { planGroupsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            planGroupsService: PlanGroupServiceAsync,
            params: PlanGroupListParams,
            response: PlanGroupListPageResponse,
        ) = PlanGroupListPageAsync(planGroupsService, params, response)
    }

    class AutoPager(private val firstPage: PlanGroupListPageAsync) {

        fun forEach(
            action: Predicate<PlanGroupResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PlanGroupListPageAsync>>.forEach(
                action: (PlanGroupResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<PlanGroupResponse>> {
            val values = mutableListOf<PlanGroupResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
