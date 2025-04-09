// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.ResourceGroupServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of permission policies for a ResourceGroup */
class ResourceGroupListPermissionsPageAsync
private constructor(
    private val resourceGroupsService: ResourceGroupServiceAsync,
    private val params: ResourceGroupListPermissionsParams,
    private val response: ResourceGroupListPermissionsPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ResourceGroupListPermissionsPageResponse = response

    /**
     * Delegates to [ResourceGroupListPermissionsPageResponse], but gracefully handles missing data.
     *
     * @see [ResourceGroupListPermissionsPageResponse.data]
     */
    fun data(): List<PermissionPolicyResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ResourceGroupListPermissionsPageResponse], but gracefully handles missing data.
     *
     * @see [ResourceGroupListPermissionsPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResourceGroupListPermissionsPageAsync && resourceGroupsService == other.resourceGroupsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(resourceGroupsService, params, response) /* spotless:on */

    override fun toString() =
        "ResourceGroupListPermissionsPageAsync{resourceGroupsService=$resourceGroupsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ResourceGroupListPermissionsParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ResourceGroupListPermissionsPageAsync>> {
        return getNextPageParams()
            .map { resourceGroupsService.listPermissions(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            resourceGroupsService: ResourceGroupServiceAsync,
            params: ResourceGroupListPermissionsParams,
            response: ResourceGroupListPermissionsPageResponse,
        ) = ResourceGroupListPermissionsPageAsync(resourceGroupsService, params, response)
    }

    class AutoPager(private val firstPage: ResourceGroupListPermissionsPageAsync) {

        fun forEach(
            action: Predicate<PermissionPolicyResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ResourceGroupListPermissionsPageAsync>>.forEach(
                action: (PermissionPolicyResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<PermissionPolicyResponse>> {
            val values = mutableListOf<PermissionPolicyResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
