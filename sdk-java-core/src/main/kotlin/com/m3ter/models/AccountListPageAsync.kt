// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.AccountServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AccountServiceAsync.list */
class AccountListPageAsync
private constructor(
    private val service: AccountServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AccountListParams,
    private val response: AccountListPageResponse,
) : PageAsync<AccountResponse> {

    /**
     * Delegates to [AccountListPageResponse], but gracefully handles missing data.
     *
     * @see AccountListPageResponse.data
     */
    fun data(): List<AccountResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountListPageResponse], but gracefully handles missing data.
     *
     * @see AccountListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<AccountResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): AccountListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<AccountListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AccountResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountListPageAsync]. */
    class Builder internal constructor() {

        private var service: AccountServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AccountListParams? = null
        private var response: AccountListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountListPageAsync: AccountListPageAsync) = apply {
            service = accountListPageAsync.service
            streamHandlerExecutor = accountListPageAsync.streamHandlerExecutor
            params = accountListPageAsync.params
            response = accountListPageAsync.response
        }

        fun service(service: AccountServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountListPageAsync =
            AccountListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "AccountListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
