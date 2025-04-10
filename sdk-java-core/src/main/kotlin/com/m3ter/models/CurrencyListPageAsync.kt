// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.CurrencyServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [CurrencyServiceAsync.list] */
class CurrencyListPageAsync
private constructor(
    private val service: CurrencyServiceAsync,
    private val params: CurrencyListParams,
    private val response: CurrencyListPageResponse,
) {

    /**
     * Delegates to [CurrencyListPageResponse], but gracefully handles missing data.
     *
     * @see [CurrencyListPageResponse.data]
     */
    fun data(): List<CurrencyResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CurrencyListPageResponse], but gracefully handles missing data.
     *
     * @see [CurrencyListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CurrencyListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CurrencyListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CurrencyListParams = params

    /** The response that this page was parsed from. */
    fun response(): CurrencyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CurrencyListPageAsync].
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

    /** A builder for [CurrencyListPageAsync]. */
    class Builder internal constructor() {

        private var service: CurrencyServiceAsync? = null
        private var params: CurrencyListParams? = null
        private var response: CurrencyListPageResponse? = null

        @JvmSynthetic
        internal fun from(currencyListPageAsync: CurrencyListPageAsync) = apply {
            service = currencyListPageAsync.service
            params = currencyListPageAsync.params
            response = currencyListPageAsync.response
        }

        fun service(service: CurrencyServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CurrencyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CurrencyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CurrencyListPageAsync].
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
        fun build(): CurrencyListPageAsync =
            CurrencyListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CurrencyListPageAsync) {

        fun forEach(
            action: Predicate<CurrencyResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CurrencyListPageAsync>>.forEach(
                action: (CurrencyResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<CurrencyResponse>> {
            val values = mutableListOf<CurrencyResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CurrencyListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CurrencyListPageAsync{service=$service, params=$params, response=$response}"
}
