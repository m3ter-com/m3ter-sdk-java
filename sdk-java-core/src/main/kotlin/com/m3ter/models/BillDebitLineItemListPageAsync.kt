// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.bills.DebitLineItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [DebitLineItemServiceAsync.list] */
class BillDebitLineItemListPageAsync
private constructor(
    private val service: DebitLineItemServiceAsync,
    private val params: BillDebitLineItemListParams,
    private val response: BillDebitLineItemListPageResponse,
) {

    /**
     * Delegates to [BillDebitLineItemListPageResponse], but gracefully handles missing data.
     *
     * @see [BillDebitLineItemListPageResponse.data]
     */
    fun data(): List<DebitLineItemResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillDebitLineItemListPageResponse], but gracefully handles missing data.
     *
     * @see [BillDebitLineItemListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BillDebitLineItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<BillDebitLineItemListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): BillDebitLineItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillDebitLineItemListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BillDebitLineItemListPageAsync].
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

    /** A builder for [BillDebitLineItemListPageAsync]. */
    class Builder internal constructor() {

        private var service: DebitLineItemServiceAsync? = null
        private var params: BillDebitLineItemListParams? = null
        private var response: BillDebitLineItemListPageResponse? = null

        @JvmSynthetic
        internal fun from(billDebitLineItemListPageAsync: BillDebitLineItemListPageAsync) = apply {
            service = billDebitLineItemListPageAsync.service
            params = billDebitLineItemListPageAsync.params
            response = billDebitLineItemListPageAsync.response
        }

        fun service(service: DebitLineItemServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BillDebitLineItemListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillDebitLineItemListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BillDebitLineItemListPageAsync].
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
        fun build(): BillDebitLineItemListPageAsync =
            BillDebitLineItemListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: BillDebitLineItemListPageAsync) {

        fun forEach(
            action: Predicate<DebitLineItemResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BillDebitLineItemListPageAsync>>.forEach(
                action: (DebitLineItemResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<DebitLineItemResponse>> {
            val values = mutableListOf<DebitLineItemResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillDebitLineItemListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "BillDebitLineItemListPageAsync{service=$service, params=$params, response=$response}"
}
