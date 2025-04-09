// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.PlanTemplateService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of PlanTemplates.
 *
 * This endpoint enables you to retrieve a paginated list of PlanTemplates belonging to a specific
 * Organization, identified by its UUID. You can filter the list by PlanTemplate IDs or Product IDs
 * for more focused retrieval.
 */
class PlanTemplateListPage
private constructor(
    private val planTemplatesService: PlanTemplateService,
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

        return /* spotless:off */ other is PlanTemplateListPage && planTemplatesService == other.planTemplatesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(planTemplatesService, params, response) /* spotless:on */

    override fun toString() =
        "PlanTemplateListPage{planTemplatesService=$planTemplatesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<PlanTemplateListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<PlanTemplateListPage> {
        return getNextPageParams().map { planTemplatesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            planTemplatesService: PlanTemplateService,
            params: PlanTemplateListParams,
            response: PlanTemplateListPageResponse,
        ) = PlanTemplateListPage(planTemplatesService, params, response)
    }

    class AutoPager(private val firstPage: PlanTemplateListPage) : Iterable<PlanTemplateResponse> {

        override fun iterator(): Iterator<PlanTemplateResponse> = iterator {
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

        fun stream(): Stream<PlanTemplateResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
