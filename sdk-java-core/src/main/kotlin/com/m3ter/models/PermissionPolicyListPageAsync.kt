// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.PermissionPolicyServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [PermissionPolicyServiceAsync.list] */
class PermissionPolicyListPageAsync
private constructor(
    private val service: PermissionPolicyServiceAsync,
    private val params: PermissionPolicyListParams,
    private val response: PermissionPolicyListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<PermissionPolicyListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PermissionPolicyListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): PermissionPolicyListParams = params

    /** The response that this page was parsed from. */
    fun response(): PermissionPolicyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PermissionPolicyListPageAsync].
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

    /** A builder for [PermissionPolicyListPageAsync]. */
    class Builder internal constructor() {

        private var service: PermissionPolicyServiceAsync? = null
        private var params: PermissionPolicyListParams? = null
        private var response: PermissionPolicyListPageResponse? = null

        @JvmSynthetic
        internal fun from(permissionPolicyListPageAsync: PermissionPolicyListPageAsync) = apply {
            service = permissionPolicyListPageAsync.service
            params = permissionPolicyListPageAsync.params
            response = permissionPolicyListPageAsync.response
        }

        fun service(service: PermissionPolicyServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PermissionPolicyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PermissionPolicyListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PermissionPolicyListPageAsync].
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
        fun build(): PermissionPolicyListPageAsync =
            PermissionPolicyListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PermissionPolicyListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PermissionPolicyListPageAsync{service=$service, params=$params, response=$response}"
}
