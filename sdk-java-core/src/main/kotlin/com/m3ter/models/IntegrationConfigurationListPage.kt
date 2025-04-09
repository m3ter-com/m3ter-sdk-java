// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.IntegrationConfigurationService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * List all integration configurations.
 *
 * This endpoint retrieves a list of all integration configurations for the specified Organization.
 * The list can be paginated for easier management.
 */
class IntegrationConfigurationListPage
private constructor(
    private val integrationConfigurationsService: IntegrationConfigurationService,
    private val params: IntegrationConfigurationListParams,
    private val response: IntegrationConfigurationListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): IntegrationConfigurationListPageResponse = response

    /**
     * Delegates to [IntegrationConfigurationListPageResponse], but gracefully handles missing data.
     *
     * @see [IntegrationConfigurationListPageResponse.data]
     */
    fun data(): List<IntegrationConfigurationListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [IntegrationConfigurationListPageResponse], but gracefully handles missing data.
     *
     * @see [IntegrationConfigurationListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IntegrationConfigurationListPage && integrationConfigurationsService == other.integrationConfigurationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(integrationConfigurationsService, params, response) /* spotless:on */

    override fun toString() =
        "IntegrationConfigurationListPage{integrationConfigurationsService=$integrationConfigurationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<IntegrationConfigurationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<IntegrationConfigurationListPage> {
        return getNextPageParams().map { integrationConfigurationsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            integrationConfigurationsService: IntegrationConfigurationService,
            params: IntegrationConfigurationListParams,
            response: IntegrationConfigurationListPageResponse,
        ) = IntegrationConfigurationListPage(integrationConfigurationsService, params, response)
    }

    class AutoPager(private val firstPage: IntegrationConfigurationListPage) :
        Iterable<IntegrationConfigurationListResponse> {

        override fun iterator(): Iterator<IntegrationConfigurationListResponse> = iterator {
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

        fun stream(): Stream<IntegrationConfigurationListResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
