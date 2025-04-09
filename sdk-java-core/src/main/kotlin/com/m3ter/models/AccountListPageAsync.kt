// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.AccountServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [AccountServiceAsync.list] */
class AccountListPageAsync
private constructor(
    private val service: AccountServiceAsync,
    private val params: AccountListParams,
    private val response: AccountListPageResponse,
) {

    /**
     * Delegates to [AccountListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountListPageResponse.data]
     */
    fun data(): List<AccountResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<AccountListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<AccountListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountListPageAsync].
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

    /** A builder for [AccountListPageAsync]. */
    class Builder internal constructor() {

        private var service: AccountServiceAsync? = null
        private var params: AccountListParams? = null
        private var response: AccountListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountListPageAsync: AccountListPageAsync) = apply {
            service = accountListPageAsync.service
            params = accountListPageAsync.params
            response = accountListPageAsync.response
        }

        fun service(service: AccountServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountListPageAsync].
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
        fun build(): AccountListPageAsync =
            AccountListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: AccountListPageAsync) {

        fun forEach(
            action: Predicate<AccountResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AccountListPageAsync>>.forEach(
                action: (AccountResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<AccountResponse>> {
            val values = mutableListOf<AccountResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AccountListPageAsync{service=$service, params=$params, response=$response}"
}
