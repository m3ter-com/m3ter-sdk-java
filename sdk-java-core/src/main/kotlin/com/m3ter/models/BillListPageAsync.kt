// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.BillServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [BillServiceAsync.list] */
class BillListPageAsync
private constructor(
    private val service: BillServiceAsync,
    private val params: BillListParams,
    private val response: BillListPageResponse,
) {

    /**
     * Delegates to [BillListPageResponse], but gracefully handles missing data.
     *
     * @see [BillListPageResponse.data]
     */
    fun data(): List<BillResponse> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillListPageResponse], but gracefully handles missing data.
     *
     * @see [BillListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BillListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<BillListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): BillListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillListPageAsync].
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

    /** A builder for [BillListPageAsync]. */
    class Builder internal constructor() {

        private var service: BillServiceAsync? = null
        private var params: BillListParams? = null
        private var response: BillListPageResponse? = null

        @JvmSynthetic
        internal fun from(billListPageAsync: BillListPageAsync) = apply {
            service = billListPageAsync.service
            params = billListPageAsync.params
            response = billListPageAsync.response
        }

        fun service(service: BillServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BillListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BillListPageAsync].
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
        fun build(): BillListPageAsync =
            BillListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: BillListPageAsync) {

        fun forEach(action: Predicate<BillResponse>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BillListPageAsync>>.forEach(
                action: (BillResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<BillResponse>> {
            val values = mutableListOf<BillResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "BillListPageAsync{service=$service, params=$params, response=$response}"
}
