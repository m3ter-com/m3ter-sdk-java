// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.IntegrationConfigurationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * List all integration configurations.
 *
 * This endpoint retrieves a list of all integration configurations for the specified Organization.
 * The list can be paginated for easier management.
 */
class IntegrationConfigurationListPageAsync
private constructor(
    private val integrationConfigurationsService: IntegrationConfigurationServiceAsync,
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

        return /* spotless:off */ other is IntegrationConfigurationListPageAsync && integrationConfigurationsService == other.integrationConfigurationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(integrationConfigurationsService, params, response) /* spotless:on */

    override fun toString() =
        "IntegrationConfigurationListPageAsync{integrationConfigurationsService=$integrationConfigurationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<IntegrationConfigurationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<IntegrationConfigurationListPageAsync>> {
        return getNextPageParams()
            .map { integrationConfigurationsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            integrationConfigurationsService: IntegrationConfigurationServiceAsync,
            params: IntegrationConfigurationListParams,
            response: IntegrationConfigurationListPageResponse,
        ) =
            IntegrationConfigurationListPageAsync(
                integrationConfigurationsService,
                params,
                response,
            )
    }

    class AutoPager(private val firstPage: IntegrationConfigurationListPageAsync) {

        fun forEach(
            action: Predicate<IntegrationConfigurationListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<IntegrationConfigurationListPageAsync>>.forEach(
                action: (IntegrationConfigurationListResponse) -> Boolean,
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

        fun toList(
            executor: Executor
        ): CompletableFuture<List<IntegrationConfigurationListResponse>> {
            val values = mutableListOf<IntegrationConfigurationListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
