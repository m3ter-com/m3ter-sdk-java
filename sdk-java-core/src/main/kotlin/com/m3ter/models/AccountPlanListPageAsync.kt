// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.AccountPlanServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AccountPlanServiceAsync.list */
class AccountPlanListPageAsync
private constructor(
    private val service: AccountPlanServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AccountPlanListParams,
    private val response: AccountPlanListPageResponse,
) : PageAsync<AccountPlanResponse> {

    /**
     * Delegates to [AccountPlanListPageResponse], but gracefully handles missing data.
     *
     * @see AccountPlanListPageResponse.data
     */
    fun data(): List<AccountPlanResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountPlanListPageResponse], but gracefully handles missing data.
     *
     * @see AccountPlanListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<AccountPlanResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): AccountPlanListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<AccountPlanListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AccountPlanResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountPlanListPageAsync]. */
    class Builder internal constructor() {

        private var service: AccountPlanServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AccountPlanListParams? = null
        private var response: AccountPlanListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountPlanListPageAsync: AccountPlanListPageAsync) = apply {
            service = accountPlanListPageAsync.service
            streamHandlerExecutor = accountPlanListPageAsync.streamHandlerExecutor
            params = accountPlanListPageAsync.params
            response = accountPlanListPageAsync.response
        }

        fun service(service: AccountPlanServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountPlanListPageAsync =
            AccountPlanListPageAsync(
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

        return /* spotless:off */ other is AccountPlanListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "AccountPlanListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
