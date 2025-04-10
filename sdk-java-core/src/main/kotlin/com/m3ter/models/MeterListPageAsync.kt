// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.MeterServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [MeterServiceAsync.list] */
class MeterListPageAsync
private constructor(
    private val service: MeterServiceAsync,
    private val params: MeterListParams,
    private val response: MeterListPageResponse,
) {

    /**
     * Delegates to [MeterListPageResponse], but gracefully handles missing data.
     *
     * @see [MeterListPageResponse.data]
     */
    fun data(): List<MeterResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MeterListPageResponse], but gracefully handles missing data.
     *
     * @see [MeterListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<MeterListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<MeterListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): MeterListParams = params

    /** The response that this page was parsed from. */
    fun response(): MeterListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MeterListPageAsync].
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

    /** A builder for [MeterListPageAsync]. */
    class Builder internal constructor() {

        private var service: MeterServiceAsync? = null
        private var params: MeterListParams? = null
        private var response: MeterListPageResponse? = null

        @JvmSynthetic
        internal fun from(meterListPageAsync: MeterListPageAsync) = apply {
            service = meterListPageAsync.service
            params = meterListPageAsync.params
            response = meterListPageAsync.response
        }

        fun service(service: MeterServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MeterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MeterListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MeterListPageAsync].
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
        fun build(): MeterListPageAsync =
            MeterListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: MeterListPageAsync) {

        fun forEach(action: Predicate<MeterResponse>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<MeterListPageAsync>>.forEach(
                action: (MeterResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<MeterResponse>> {
            val values = mutableListOf<MeterResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MeterListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "MeterListPageAsync{service=$service, params=$params, response=$response}"
}
