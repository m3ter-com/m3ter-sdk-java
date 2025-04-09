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
 * Retrieve a list of External Mapping entities for a specified m3ter entity.
 *
 * Use this endpoint to retrieve a list of External Mapping entities associated with a specific
 * m3ter entity. The list can be paginated for easier management.
 */
class ExternalMappingListByM3terEntityPageAsync
private constructor(
    private val externalMappingsService: ExternalMappingServiceAsync,
    private val params: ExternalMappingListByM3terEntityParams,
    private val response: ExternalMappingListByM3terEntityPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ExternalMappingListByM3terEntityPageResponse = response

    /**
     * Delegates to [ExternalMappingListByM3terEntityPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ExternalMappingListByM3terEntityPageResponse.data]
     */
    fun data(): List<ExternalMappingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalMappingListByM3terEntityPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ExternalMappingListByM3terEntityPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalMappingListByM3terEntityPageAsync && externalMappingsService == other.externalMappingsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalMappingsService, params, response) /* spotless:on */

    override fun toString() =
        "ExternalMappingListByM3terEntityPageAsync{externalMappingsService=$externalMappingsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ExternalMappingListByM3terEntityParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ExternalMappingListByM3terEntityPageAsync>> {
        return getNextPageParams()
            .map { externalMappingsService.listByM3terEntity(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            externalMappingsService: ExternalMappingServiceAsync,
            params: ExternalMappingListByM3terEntityParams,
            response: ExternalMappingListByM3terEntityPageResponse,
        ) = ExternalMappingListByM3terEntityPageAsync(externalMappingsService, params, response)
    }

    class AutoPager(private val firstPage: ExternalMappingListByM3terEntityPageAsync) {

        fun forEach(
            action: Predicate<ExternalMappingResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ExternalMappingListByM3terEntityPageAsync>>.forEach(
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
