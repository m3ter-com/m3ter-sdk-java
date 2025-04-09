// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.TransactionTypeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [TransactionTypeServiceAsync.list] */
class TransactionTypeListPageAsync
private constructor(
    private val service: TransactionTypeServiceAsync,
    private val params: TransactionTypeListParams,
    private val response: TransactionTypeListPageResponse,
) {

    /**
     * Delegates to [TransactionTypeListPageResponse], but gracefully handles missing data.
     *
     * @see [TransactionTypeListPageResponse.data]
     */
    fun data(): List<TransactionTypeResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TransactionTypeListPageResponse], but gracefully handles missing data.
     *
     * @see [TransactionTypeListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<TransactionTypeListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<TransactionTypeListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): TransactionTypeListParams = params

    /** The response that this page was parsed from. */
    fun response(): TransactionTypeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TransactionTypeListPageAsync].
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

    /** A builder for [TransactionTypeListPageAsync]. */
    class Builder internal constructor() {

        private var service: TransactionTypeServiceAsync? = null
        private var params: TransactionTypeListParams? = null
        private var response: TransactionTypeListPageResponse? = null

        @JvmSynthetic
        internal fun from(transactionTypeListPageAsync: TransactionTypeListPageAsync) = apply {
            service = transactionTypeListPageAsync.service
            params = transactionTypeListPageAsync.params
            response = transactionTypeListPageAsync.response
        }

        fun service(service: TransactionTypeServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TransactionTypeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TransactionTypeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TransactionTypeListPageAsync].
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
        fun build(): TransactionTypeListPageAsync =
            TransactionTypeListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: TransactionTypeListPageAsync) {

        fun forEach(
            action: Predicate<TransactionTypeResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<TransactionTypeListPageAsync>>.forEach(
                action: (TransactionTypeResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<TransactionTypeResponse>> {
            val values = mutableListOf<TransactionTypeResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionTypeListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "TransactionTypeListPageAsync{service=$service, params=$params, response=$response}"
}
