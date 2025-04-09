// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.CreditReasonServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [CreditReasonServiceAsync.list] */
class CreditReasonListPageAsync
private constructor(
    private val service: CreditReasonServiceAsync,
    private val params: CreditReasonListParams,
    private val response: CreditReasonListPageResponse,
) {

    /**
     * Delegates to [CreditReasonListPageResponse], but gracefully handles missing data.
     *
     * @see [CreditReasonListPageResponse.data]
     */
    fun data(): List<CreditReasonResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CreditReasonListPageResponse], but gracefully handles missing data.
     *
     * @see [CreditReasonListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CreditReasonListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<CreditReasonListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CreditReasonListParams = params

    /** The response that this page was parsed from. */
    fun response(): CreditReasonListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditReasonListPageAsync].
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

    /** A builder for [CreditReasonListPageAsync]. */
    class Builder internal constructor() {

        private var service: CreditReasonServiceAsync? = null
        private var params: CreditReasonListParams? = null
        private var response: CreditReasonListPageResponse? = null

        @JvmSynthetic
        internal fun from(creditReasonListPageAsync: CreditReasonListPageAsync) = apply {
            service = creditReasonListPageAsync.service
            params = creditReasonListPageAsync.params
            response = creditReasonListPageAsync.response
        }

        fun service(service: CreditReasonServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CreditReasonListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CreditReasonListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CreditReasonListPageAsync].
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
        fun build(): CreditReasonListPageAsync =
            CreditReasonListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CreditReasonListPageAsync) {

        fun forEach(
            action: Predicate<CreditReasonResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CreditReasonListPageAsync>>.forEach(
                action: (CreditReasonResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<CreditReasonResponse>> {
            val values = mutableListOf<CreditReasonResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditReasonListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CreditReasonListPageAsync{service=$service, params=$params, response=$response}"
}
