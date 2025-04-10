// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.ResourceGroupServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [ResourceGroupServiceAsync.listPermissions] */
class ResourceGroupListPermissionsPageAsync
private constructor(
    private val service: ResourceGroupServiceAsync,
    private val params: ResourceGroupListPermissionsParams,
    private val response: ResourceGroupListPermissionsPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ResourceGroupListPermissionsParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ResourceGroupListPermissionsPageAsync>> =
        getNextPageParams()
            .map { service.listPermissions(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ResourceGroupListPermissionsParams = params

    /** The response that this page was parsed from. */
    fun response(): ResourceGroupListPermissionsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ResourceGroupListPermissionsPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ResourceGroupListPermissionsPageAsync]. */
    class Builder internal constructor() {

        private var service: ResourceGroupServiceAsync? = null
        private var params: ResourceGroupListPermissionsParams? = null
        private var response: ResourceGroupListPermissionsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            resourceGroupListPermissionsPageAsync: ResourceGroupListPermissionsPageAsync
        ) = apply {
            service = resourceGroupListPermissionsPageAsync.service
            params = resourceGroupListPermissionsPageAsync.params
            response = resourceGroupListPermissionsPageAsync.response
        }

        fun service(service: ResourceGroupServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ResourceGroupListPermissionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ResourceGroupListPermissionsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ResourceGroupListPermissionsPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ResourceGroupListPermissionsPageAsync =
            ResourceGroupListPermissionsPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResourceGroupListPermissionsPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ResourceGroupListPermissionsPageAsync{service=$service, params=$params, response=$response}"
}
