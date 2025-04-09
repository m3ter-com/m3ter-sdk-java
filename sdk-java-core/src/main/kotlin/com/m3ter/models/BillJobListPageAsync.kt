// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.BillJobServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [BillJobServiceAsync.list] */
class BillJobListPageAsync
private constructor(
    private val service: BillJobServiceAsync,
    private val params: BillJobListParams,
    private val response: BillJobListPageResponse,
) {

    /**
     * Delegates to [BillJobListPageResponse], but gracefully handles missing data.
     *
     * @see [BillJobListPageResponse.data]
     */
    fun data(): List<BillJobResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillJobListPageResponse], but gracefully handles missing data.
     *
     * @see [BillJobListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BillJobListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<BillJobListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): BillJobListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillJobListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillJobListPageAsync].
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

    /** A builder for [BillJobListPageAsync]. */
    class Builder internal constructor() {

        private var service: BillJobServiceAsync? = null
        private var params: BillJobListParams? = null
        private var response: BillJobListPageResponse? = null

        @JvmSynthetic
        internal fun from(billJobListPageAsync: BillJobListPageAsync) = apply {
            service = billJobListPageAsync.service
            params = billJobListPageAsync.params
            response = billJobListPageAsync.response
        }

        fun service(service: BillJobServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BillJobListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillJobListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BillJobListPageAsync].
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
        fun build(): BillJobListPageAsync =
            BillJobListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: BillJobListPageAsync) {

        fun forEach(
            action: Predicate<BillJobResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BillJobListPageAsync>>.forEach(
                action: (BillJobResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<BillJobResponse>> {
            val values = mutableListOf<BillJobResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillJobListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "BillJobListPageAsync{service=$service, params=$params, response=$response}"
}
