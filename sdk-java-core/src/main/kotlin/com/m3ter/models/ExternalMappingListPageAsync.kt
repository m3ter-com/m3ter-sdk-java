// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.ExternalMappingServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of all External Mapping entities.
 *
 * This endpoint retrieves a list of all External Mapping entities for a specific Organization. The
 * list can be paginated for better management, and supports filtering using the external system.
 */
class ExternalMappingListPageAsync
private constructor(
    private val externalMappingsService: ExternalMappingServiceAsync,
    private val params: ExternalMappingListParams,
    private val response: ExternalMappingListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ExternalMappingListPageResponse = response

    /**
     * Delegates to [ExternalMappingListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalMappingListPageResponse.data]
     */
    fun data(): List<ExternalMappingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalMappingListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalMappingListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalMappingListPageAsync && externalMappingsService == other.externalMappingsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalMappingsService, params, response) /* spotless:on */

    override fun toString() =
        "ExternalMappingListPageAsync{externalMappingsService=$externalMappingsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ExternalMappingListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ExternalMappingListPageAsync>> {
        return getNextPageParams()
            .map { externalMappingsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            externalMappingsService: ExternalMappingServiceAsync,
            params: ExternalMappingListParams,
            response: ExternalMappingListPageResponse,
        ) = ExternalMappingListPageAsync(externalMappingsService, params, response)
    }

    class AutoPager(private val firstPage: ExternalMappingListPageAsync) {

        fun forEach(
            action: Predicate<ExternalMappingResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ExternalMappingListPageAsync>>.forEach(
                action: (ExternalMappingResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ExternalMappingResponse>> {
            val values = mutableListOf<ExternalMappingResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
