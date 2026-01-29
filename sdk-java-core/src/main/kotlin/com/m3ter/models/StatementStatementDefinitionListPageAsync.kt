// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.statements.StatementDefinitionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see StatementDefinitionServiceAsync.list */
class StatementStatementDefinitionListPageAsync
private constructor(
    private val service: StatementDefinitionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: StatementStatementDefinitionListParams,
    private val response: StatementStatementDefinitionListPageResponse,
) : PageAsync<StatementDefinitionResponse> {

    /**
     * Delegates to [StatementStatementDefinitionListPageResponse], but gracefully handles missing
     * data.
     *
     * @see StatementStatementDefinitionListPageResponse.data
     */
    fun data(): List<StatementDefinitionResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [StatementStatementDefinitionListPageResponse], but gracefully handles missing
     * data.
     *
     * @see StatementStatementDefinitionListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<StatementDefinitionResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): StatementStatementDefinitionListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<StatementStatementDefinitionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<StatementDefinitionResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): StatementStatementDefinitionListParams = params

    /** The response that this page was parsed from. */
    fun response(): StatementStatementDefinitionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [StatementStatementDefinitionListPageAsync].
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

    /** A builder for [StatementStatementDefinitionListPageAsync]. */
    class Builder internal constructor() {

        private var service: StatementDefinitionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: StatementStatementDefinitionListParams? = null
        private var response: StatementStatementDefinitionListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            statementStatementDefinitionListPageAsync: StatementStatementDefinitionListPageAsync
        ) = apply {
            service = statementStatementDefinitionListPageAsync.service
            streamHandlerExecutor = statementStatementDefinitionListPageAsync.streamHandlerExecutor
            params = statementStatementDefinitionListPageAsync.params
            response = statementStatementDefinitionListPageAsync.response
        }

        fun service(service: StatementDefinitionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: StatementStatementDefinitionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: StatementStatementDefinitionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [StatementStatementDefinitionListPageAsync].
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
        fun build(): StatementStatementDefinitionListPageAsync =
            StatementStatementDefinitionListPageAsync(
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

        return other is StatementStatementDefinitionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "StatementStatementDefinitionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
