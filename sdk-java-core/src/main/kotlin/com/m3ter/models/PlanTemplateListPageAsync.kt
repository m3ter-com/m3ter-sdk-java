// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.PlanTemplateServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of PlanTemplates.
 *
 * This endpoint enables you to retrieve a paginated list of PlanTemplates belonging to a specific
 * Organization, identified by its UUID. You can filter the list by PlanTemplate IDs or Product IDs
 * for more focused retrieval.
 */
class PlanTemplateListPageAsync
private constructor(
    private val planTemplatesService: PlanTemplateServiceAsync,
    private val params: PlanTemplateListParams,
    private val response: PlanTemplateListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PlanTemplateListPageResponse = response

    /**
     * Delegates to [PlanTemplateListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanTemplateListPageResponse.data]
     */
    fun data(): List<PlanTemplateResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanTemplateListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanTemplateListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanTemplateListPageAsync && planTemplatesService == other.planTemplatesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(planTemplatesService, params, response) /* spotless:on */

    override fun toString() =
        "PlanTemplateListPageAsync{planTemplatesService=$planTemplatesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<PlanTemplateListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PlanTemplateListPageAsync>> {
        return getNextPageParams()
            .map { planTemplatesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            planTemplatesService: PlanTemplateServiceAsync,
            params: PlanTemplateListParams,
            response: PlanTemplateListPageResponse,
        ) = PlanTemplateListPageAsync(planTemplatesService, params, response)
    }

    class AutoPager(private val firstPage: PlanTemplateListPageAsync) {

        fun forEach(
            action: Predicate<PlanTemplateResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PlanTemplateListPageAsync>>.forEach(
                action: (PlanTemplateResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<PlanTemplateResponse>> {
            val values = mutableListOf<PlanTemplateResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
