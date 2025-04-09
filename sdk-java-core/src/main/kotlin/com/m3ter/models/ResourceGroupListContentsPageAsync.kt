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

/** @see [ResourceGroupServiceAsync.listContents] */
class ResourceGroupListContentsPageAsync
private constructor(
    private val service: ResourceGroupServiceAsync,
    private val params: ResourceGroupListContentsParams,
    private val response: ResourceGroupListContentsPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ResourceGroupListContentsParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ResourceGroupListContentsPageAsync>> =
        getNextPageParams()
            .map { service.listContents(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ResourceGroupListContentsParams = params

    /** The response that this page was parsed from. */
    fun response(): ResourceGroupListContentsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ResourceGroupListContentsPageAsync].
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

    /** A builder for [ResourceGroupListContentsPageAsync]. */
    class Builder internal constructor() {

        private var service: ResourceGroupServiceAsync? = null
        private var params: ResourceGroupListContentsParams? = null
        private var response: ResourceGroupListContentsPageResponse? = null

        @JvmSynthetic
        internal fun from(resourceGroupListContentsPageAsync: ResourceGroupListContentsPageAsync) =
            apply {
                service = resourceGroupListContentsPageAsync.service
                params = resourceGroupListContentsPageAsync.params
                response = resourceGroupListContentsPageAsync.response
            }

        fun service(service: ResourceGroupServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ResourceGroupListContentsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ResourceGroupListContentsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ResourceGroupListContentsPageAsync].
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
        fun build(): ResourceGroupListContentsPageAsync =
            ResourceGroupListContentsPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResourceGroupListContentsPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ResourceGroupListContentsPageAsync{service=$service, params=$params, response=$response}"
}
