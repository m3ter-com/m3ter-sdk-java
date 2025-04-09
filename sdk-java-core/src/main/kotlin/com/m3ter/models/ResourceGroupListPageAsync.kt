// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.ResourceGroupServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of ResourceGroup entities */
class ResourceGroupListPageAsync
private constructor(
    private val resourceGroupsService: ResourceGroupServiceAsync,
    private val params: ResourceGroupListParams,
    private val response: ResourceGroupListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ResourceGroupListPageResponse = response

    /**
     * Delegates to [ResourceGroupListPageResponse], but gracefully handles missing data.
     *
     * @see [ResourceGroupListPageResponse.data]
     */
    fun data(): List<ResourceGroupResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ResourceGroupListPageResponse], but gracefully handles missing data.
     *
     * @see [ResourceGroupListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResourceGroupListPageAsync && resourceGroupsService == other.resourceGroupsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(resourceGroupsService, params, response) /* spotless:on */

    override fun toString() =
        "ResourceGroupListPageAsync{resourceGroupsService=$resourceGroupsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ResourceGroupListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ResourceGroupListPageAsync>> {
        return getNextPageParams()
            .map { resourceGroupsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            resourceGroupsService: ResourceGroupServiceAsync,
            params: ResourceGroupListParams,
            response: ResourceGroupListPageResponse,
        ) = ResourceGroupListPageAsync(resourceGroupsService, params, response)
    }

    class AutoPager(private val firstPage: ResourceGroupListPageAsync) {

        fun forEach(
            action: Predicate<ResourceGroupResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ResourceGroupListPageAsync>>.forEach(
                action: (ResourceGroupResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ResourceGroupResponse>> {
            val values = mutableListOf<ResourceGroupResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
