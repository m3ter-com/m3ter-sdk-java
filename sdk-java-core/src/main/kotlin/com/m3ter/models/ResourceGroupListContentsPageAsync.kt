// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.ResourceGroupServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of items for a ResourceGroup */
class ResourceGroupListContentsPageAsync
private constructor(
    private val resourceGroupsService: ResourceGroupServiceAsync,
    private val params: ResourceGroupListContentsParams,
    private val response: ResourceGroupListContentsPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ResourceGroupListContentsPageResponse = response

    /**
     * Delegates to [ResourceGroupListContentsPageResponse], but gracefully handles missing data.
     *
     * @see [ResourceGroupListContentsPageResponse.data]
     */
    fun data(): List<ResourceGroupListContentsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ResourceGroupListContentsPageResponse], but gracefully handles missing data.
     *
     * @see [ResourceGroupListContentsPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResourceGroupListContentsPageAsync && resourceGroupsService == other.resourceGroupsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(resourceGroupsService, params, response) /* spotless:on */

    override fun toString() =
        "ResourceGroupListContentsPageAsync{resourceGroupsService=$resourceGroupsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ResourceGroupListContentsParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ResourceGroupListContentsPageAsync>> {
        return getNextPageParams()
            .map { resourceGroupsService.listContents(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            resourceGroupsService: ResourceGroupServiceAsync,
            params: ResourceGroupListContentsParams,
            response: ResourceGroupListContentsPageResponse,
        ) = ResourceGroupListContentsPageAsync(resourceGroupsService, params, response)
    }

    class AutoPager(private val firstPage: ResourceGroupListContentsPageAsync) {

        fun forEach(
            action: Predicate<ResourceGroupListContentsResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ResourceGroupListContentsPageAsync>>.forEach(
                action: (ResourceGroupListContentsResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ResourceGroupListContentsResponse>> {
            val values = mutableListOf<ResourceGroupListContentsResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
