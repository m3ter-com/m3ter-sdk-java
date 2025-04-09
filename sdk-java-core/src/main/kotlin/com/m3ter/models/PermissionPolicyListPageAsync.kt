// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.PermissionPolicyServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of PermissionPolicy entities */
class PermissionPolicyListPageAsync
private constructor(
    private val permissionPoliciesService: PermissionPolicyServiceAsync,
    private val params: PermissionPolicyListParams,
    private val response: PermissionPolicyListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PermissionPolicyListPageResponse = response

    /**
     * Delegates to [PermissionPolicyListPageResponse], but gracefully handles missing data.
     *
     * @see [PermissionPolicyListPageResponse.data]
     */
    fun data(): List<PermissionPolicyResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PermissionPolicyListPageResponse], but gracefully handles missing data.
     *
     * @see [PermissionPolicyListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PermissionPolicyListPageAsync && permissionPoliciesService == other.permissionPoliciesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(permissionPoliciesService, params, response) /* spotless:on */

    override fun toString() =
        "PermissionPolicyListPageAsync{permissionPoliciesService=$permissionPoliciesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<PermissionPolicyListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PermissionPolicyListPageAsync>> {
        return getNextPageParams()
            .map { permissionPoliciesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            permissionPoliciesService: PermissionPolicyServiceAsync,
            params: PermissionPolicyListParams,
            response: PermissionPolicyListPageResponse,
        ) = PermissionPolicyListPageAsync(permissionPoliciesService, params, response)
    }

    class AutoPager(private val firstPage: PermissionPolicyListPageAsync) {

        fun forEach(
            action: Predicate<PermissionPolicyResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PermissionPolicyListPageAsync>>.forEach(
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
