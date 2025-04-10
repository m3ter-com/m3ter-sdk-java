// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.bills.CreditLineItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [CreditLineItemServiceAsync.list] */
class BillCreditLineItemListPageAsync
private constructor(
    private val service: CreditLineItemServiceAsync,
    private val params: BillCreditLineItemListParams,
    private val response: BillCreditLineItemListPageResponse,
) {

    /**
     * Delegates to [BillCreditLineItemListPageResponse], but gracefully handles missing data.
     *
     * @see [BillCreditLineItemListPageResponse.data]
     */
    fun data(): List<CreditLineItemResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BillCreditLineItemListPageResponse], but gracefully handles missing data.
     *
     * @see [BillCreditLineItemListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<BillCreditLineItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<BillCreditLineItemListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): BillCreditLineItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): BillCreditLineItemListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BillCreditLineItemListPageAsync].
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

    /** A builder for [BillCreditLineItemListPageAsync]. */
    class Builder internal constructor() {

        private var service: CreditLineItemServiceAsync? = null
        private var params: BillCreditLineItemListParams? = null
        private var response: BillCreditLineItemListPageResponse? = null

        @JvmSynthetic
        internal fun from(billCreditLineItemListPageAsync: BillCreditLineItemListPageAsync) =
            apply {
                service = billCreditLineItemListPageAsync.service
                params = billCreditLineItemListPageAsync.params
                response = billCreditLineItemListPageAsync.response
            }

        fun service(service: CreditLineItemServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BillCreditLineItemListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BillCreditLineItemListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BillCreditLineItemListPageAsync].
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
        fun build(): BillCreditLineItemListPageAsync =
            BillCreditLineItemListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: BillCreditLineItemListPageAsync) {

        fun forEach(
            action: Predicate<CreditLineItemResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BillCreditLineItemListPageAsync>>.forEach(
                action: (CreditLineItemResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<CreditLineItemResponse>> {
            val values = mutableListOf<CreditLineItemResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillCreditLineItemListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "BillCreditLineItemListPageAsync{service=$service, params=$params, response=$response}"
}
