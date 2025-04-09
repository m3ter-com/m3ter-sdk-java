// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.ContractServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [ContractServiceAsync.list] */
class ContractListPageAsync
private constructor(
    private val service: ContractServiceAsync,
    private val params: ContractListParams,
    private val response: ContractListPageResponse,
) {

    /**
     * Delegates to [ContractListPageResponse], but gracefully handles missing data.
     *
     * @see [ContractListPageResponse.data]
     */
    fun data(): List<ContractResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ContractListPageResponse], but gracefully handles missing data.
     *
     * @see [ContractListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ContractListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<ContractListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ContractListParams = params

    /** The response that this page was parsed from. */
    fun response(): ContractListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ContractListPageAsync].
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

    /** A builder for [ContractListPageAsync]. */
    class Builder internal constructor() {

        private var service: ContractServiceAsync? = null
        private var params: ContractListParams? = null
        private var response: ContractListPageResponse? = null

        @JvmSynthetic
        internal fun from(contractListPageAsync: ContractListPageAsync) = apply {
            service = contractListPageAsync.service
            params = contractListPageAsync.params
            response = contractListPageAsync.response
        }

        fun service(service: ContractServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ContractListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ContractListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ContractListPageAsync].
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
        fun build(): ContractListPageAsync =
            ContractListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ContractListPageAsync) {

        fun forEach(
            action: Predicate<ContractResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ContractListPageAsync>>.forEach(
                action: (ContractResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ContractResponse>> {
            val values = mutableListOf<ContractResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ContractListPageAsync{service=$service, params=$params, response=$response}"
}
