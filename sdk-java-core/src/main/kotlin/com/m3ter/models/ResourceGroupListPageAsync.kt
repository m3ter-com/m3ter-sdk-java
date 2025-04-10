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

/** @see [ResourceGroupServiceAsync.list] */
class ResourceGroupListPageAsync
private constructor(
    private val service: ResourceGroupServiceAsync,
    private val params: ResourceGroupListParams,
    private val response: ResourceGroupListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ResourceGroupListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ResourceGroupListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ResourceGroupListParams = params

    /** The response that this page was parsed from. */
    fun response(): ResourceGroupListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ResourceGroupListPageAsync].
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

    /** A builder for [ResourceGroupListPageAsync]. */
    class Builder internal constructor() {

        private var service: ResourceGroupServiceAsync? = null
        private var params: ResourceGroupListParams? = null
        private var response: ResourceGroupListPageResponse? = null

        @JvmSynthetic
        internal fun from(resourceGroupListPageAsync: ResourceGroupListPageAsync) = apply {
            service = resourceGroupListPageAsync.service
            params = resourceGroupListPageAsync.params
            response = resourceGroupListPageAsync.response
        }

        fun service(service: ResourceGroupServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ResourceGroupListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ResourceGroupListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ResourceGroupListPageAsync].
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
        fun build(): ResourceGroupListPageAsync =
            ResourceGroupListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResourceGroupListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ResourceGroupListPageAsync{service=$service, params=$params, response=$response}"
}
