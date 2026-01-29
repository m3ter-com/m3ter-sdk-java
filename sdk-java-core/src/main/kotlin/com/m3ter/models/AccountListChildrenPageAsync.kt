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

/** @see AccountServiceAsync.listChildren */
class AccountListChildrenPageAsync
private constructor(
    private val service: AccountServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AccountListChildrenParams,
    private val response: AccountListChildrenPageResponse,
) : PageAsync<AccountResponse> {

    /**
     * Delegates to [AccountListChildrenPageResponse], but gracefully handles missing data.
     *
     * @see AccountListChildrenPageResponse.data
     */
    fun data(): List<AccountResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountListChildrenPageResponse], but gracefully handles missing data.
     *
     * @see AccountListChildrenPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<AccountResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): AccountListChildrenParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<AccountListChildrenPageAsync> =
        service.listChildren(nextPageParams())

    fun autoPager(): AutoPagerAsync<AccountResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AccountListChildrenParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountListChildrenPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountListChildrenPageAsync].
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

    /** A builder for [AccountListChildrenPageAsync]. */
    class Builder internal constructor() {

        private var service: AccountServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AccountListChildrenParams? = null
        private var response: AccountListChildrenPageResponse? = null

        @JvmSynthetic
        internal fun from(accountListChildrenPageAsync: AccountListChildrenPageAsync) = apply {
            service = accountListChildrenPageAsync.service
            streamHandlerExecutor = accountListChildrenPageAsync.streamHandlerExecutor
            params = accountListChildrenPageAsync.params
            response = accountListChildrenPageAsync.response
        }

        fun service(service: AccountServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AccountListChildrenParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountListChildrenPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountListChildrenPageAsync].
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
        fun build(): AccountListChildrenPageAsync =
            AccountListChildrenPageAsync(
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

        return other is AccountListChildrenPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AccountListChildrenPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
