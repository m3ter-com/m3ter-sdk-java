// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.statements.StatementJobService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see StatementJobService.list */
class StatementStatementJobListPage
private constructor(
    private val service: StatementJobService,
    private val params: StatementStatementJobListParams,
    private val response: StatementStatementJobListPageResponse,
) : Page<StatementJobResponse> {

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

    override fun nextPage(): StatementStatementJobListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<StatementJobResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): StatementStatementJobListParams = params

    /** The response that this page was parsed from. */
    fun response(): StatementStatementJobListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [StatementStatementJobListPage].
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

    /** A builder for [StatementStatementJobListPage]. */
    class Builder internal constructor() {

        private var service: StatementJobService? = null
        private var params: StatementStatementJobListParams? = null
        private var response: StatementStatementJobListPageResponse? = null

        @JvmSynthetic
        internal fun from(statementStatementJobListPage: StatementStatementJobListPage) = apply {
            service = statementStatementJobListPage.service
            params = statementStatementJobListPage.params
            response = statementStatementJobListPage.response
        }

        fun service(service: StatementJobService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: StatementStatementJobListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: StatementStatementJobListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [StatementStatementJobListPage].
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
        fun build(): StatementStatementJobListPage =
            StatementStatementJobListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StatementStatementJobListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "StatementStatementJobListPage{service=$service, params=$params, response=$response}"
}
