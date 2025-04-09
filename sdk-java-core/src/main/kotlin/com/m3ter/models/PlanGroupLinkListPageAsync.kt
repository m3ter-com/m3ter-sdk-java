// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.PlanGroupLinkServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of PlanGroupLink entities */
class PlanGroupLinkListPageAsync
private constructor(
    private val planGroupLinksService: PlanGroupLinkServiceAsync,
    private val params: PlanGroupLinkListParams,
    private val response: PlanGroupLinkListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PlanGroupLinkListPageResponse = response

    /**
     * Delegates to [PlanGroupLinkListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanGroupLinkListPageResponse.data]
     */
    fun data(): List<PlanGroupLinkResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanGroupLinkListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanGroupLinkListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanGroupLinkListPageAsync && planGroupLinksService == other.planGroupLinksService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(planGroupLinksService, params, response) /* spotless:on */

    override fun toString() =
        "PlanGroupLinkListPageAsync{planGroupLinksService=$planGroupLinksService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<PlanGroupLinkListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PlanGroupLinkListPageAsync>> {
        return getNextPageParams()
            .map { planGroupLinksService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            planGroupLinksService: PlanGroupLinkServiceAsync,
            params: PlanGroupLinkListParams,
            response: PlanGroupLinkListPageResponse,
        ) = PlanGroupLinkListPageAsync(planGroupLinksService, params, response)
    }

    class AutoPager(private val firstPage: PlanGroupLinkListPageAsync) {

        fun forEach(
            action: Predicate<PlanGroupLinkResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PlanGroupLinkListPageAsync>>.forEach(
                action: (PlanGroupLinkResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<PlanGroupLinkResponse>> {
            val values = mutableListOf<PlanGroupLinkResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
