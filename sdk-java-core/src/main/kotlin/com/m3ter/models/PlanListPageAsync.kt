// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.PlanServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of Plans that can be filtered by Product, Account, or Plan ID. */
class PlanListPageAsync
private constructor(
    private val plansService: PlanServiceAsync,
    private val params: PlanListParams,
    private val response: PlanListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PlanListPageResponse = response

    /**
     * Delegates to [PlanListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanListPageResponse.data]
     */
    fun data(): List<PlanResponse> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanListPageAsync && plansService == other.plansService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(plansService, params, response) /* spotless:on */

    override fun toString() =
        "PlanListPageAsync{plansService=$plansService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<PlanListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PlanListPageAsync>> {
        return getNextPageParams()
            .map { plansService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            plansService: PlanServiceAsync,
            params: PlanListParams,
            response: PlanListPageResponse,
        ) = PlanListPageAsync(plansService, params, response)
    }

    class AutoPager(private val firstPage: PlanListPageAsync) {

        fun forEach(action: Predicate<PlanResponse>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PlanListPageAsync>>.forEach(
                action: (PlanResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<PlanResponse>> {
            val values = mutableListOf<PlanResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
