// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.AccountPlanServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [AccountPlanServiceAsync.list] */
class AccountPlanListPageAsync
private constructor(
    private val service: AccountPlanServiceAsync,
    private val params: AccountPlanListParams,
    private val response: AccountPlanListPageResponse,
) {

    /**
     * Delegates to [AccountPlanListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountPlanListPageResponse.data]
     */
    fun data(): List<AccountPlanResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountPlanListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountPlanListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<AccountPlanListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<AccountPlanListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountPlanListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountPlanListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountPlanListPageAsync].
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

    /** A builder for [AccountPlanListPageAsync]. */
    class Builder internal constructor() {

        private var service: AccountPlanServiceAsync? = null
        private var params: AccountPlanListParams? = null
        private var response: AccountPlanListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountPlanListPageAsync: AccountPlanListPageAsync) = apply {
            service = accountPlanListPageAsync.service
            params = accountPlanListPageAsync.params
            response = accountPlanListPageAsync.response
        }

        fun service(service: AccountPlanServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountPlanListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountPlanListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountPlanListPageAsync].
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
        fun build(): AccountPlanListPageAsync =
            AccountPlanListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: AccountPlanListPageAsync) {

        fun forEach(
            action: Predicate<AccountPlanResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AccountPlanListPageAsync>>.forEach(
                action: (AccountPlanResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<AccountPlanResponse>> {
            val values = mutableListOf<AccountPlanResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountPlanListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AccountPlanListPageAsync{service=$service, params=$params, response=$response}"
}
