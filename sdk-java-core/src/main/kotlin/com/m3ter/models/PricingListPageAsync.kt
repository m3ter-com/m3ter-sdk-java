// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.PricingServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [PricingServiceAsync.list] */
class PricingListPageAsync
private constructor(
    private val service: PricingServiceAsync,
    private val params: PricingListParams,
    private val response: PricingListPageResponse,
) {

    /**
     * Delegates to [PricingListPageResponse], but gracefully handles missing data.
     *
     * @see [PricingListPageResponse.data]
     */
    fun data(): List<PricingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PricingListPageResponse], but gracefully handles missing data.
     *
     * @see [PricingListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<PricingListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<PricingListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): PricingListParams = params

    /** The response that this page was parsed from. */
    fun response(): PricingListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PricingListPageAsync].
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

    /** A builder for [PricingListPageAsync]. */
    class Builder internal constructor() {

        private var service: PricingServiceAsync? = null
        private var params: PricingListParams? = null
        private var response: PricingListPageResponse? = null

        @JvmSynthetic
        internal fun from(pricingListPageAsync: PricingListPageAsync) = apply {
            service = pricingListPageAsync.service
            params = pricingListPageAsync.params
            response = pricingListPageAsync.response
        }

        fun service(service: PricingServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PricingListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PricingListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PricingListPageAsync].
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
        fun build(): PricingListPageAsync =
            PricingListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: PricingListPageAsync) {

        fun forEach(
            action: Predicate<PricingResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PricingListPageAsync>>.forEach(
                action: (PricingResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<PricingResponse>> {
            val values = mutableListOf<PricingResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PricingListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PricingListPageAsync{service=$service, params=$params, response=$response}"
}
