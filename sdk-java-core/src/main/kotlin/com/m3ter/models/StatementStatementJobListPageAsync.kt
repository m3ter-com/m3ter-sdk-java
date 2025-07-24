// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.statements.StatementJobServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see StatementJobServiceAsync.list */
class StatementStatementJobListPageAsync
private constructor(
    private val service: StatementJobServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: StatementStatementJobListParams,
    private val response: StatementStatementJobListPageResponse,
) : PageAsync<StatementJobResponse> {

    /**
     * Delegates to [StatementStatementJobListPageResponse], but gracefully handles missing data.
     *
     * @see StatementStatementJobListPageResponse.data
     */
    fun data(): List<StatementJobResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [StatementStatementJobListPageResponse], but gracefully handles missing data.
     *
     * @see StatementStatementJobListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<StatementJobResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): StatementStatementJobListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<StatementStatementJobListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<StatementJobResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): StatementStatementJobListParams = params

    /** The response that this page was parsed from. */
    fun response(): StatementStatementJobListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [StatementStatementJobListPageAsync].
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

    /** A builder for [StatementStatementJobListPageAsync]. */
    class Builder internal constructor() {

        private var service: StatementJobServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: StatementStatementJobListParams? = null
        private var response: StatementStatementJobListPageResponse? = null

        @JvmSynthetic
        internal fun from(statementStatementJobListPageAsync: StatementStatementJobListPageAsync) =
            apply {
                service = statementStatementJobListPageAsync.service
                streamHandlerExecutor = statementStatementJobListPageAsync.streamHandlerExecutor
                params = statementStatementJobListPageAsync.params
                response = statementStatementJobListPageAsync.response
            }

        fun service(service: StatementJobServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: StatementStatementJobListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: StatementStatementJobListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [StatementStatementJobListPageAsync].
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
        fun build(): StatementStatementJobListPageAsync =
            StatementStatementJobListPageAsync(
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

        return /* spotless:off */ other is StatementStatementJobListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "StatementStatementJobListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
