// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.statements.StatementDefinitionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see StatementDefinitionService.list */
class StatementStatementDefinitionListPage
private constructor(
    private val service: StatementDefinitionService,
    private val params: StatementStatementDefinitionListParams,
    private val response: StatementStatementDefinitionListPageResponse,
) : Page<StatementDefinitionResponse> {

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

    override fun nextPage(): StatementStatementDefinitionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<StatementDefinitionResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): StatementStatementDefinitionListParams = params

    /** The response that this page was parsed from. */
    fun response(): StatementStatementDefinitionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [StatementStatementDefinitionListPage].
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

    /** A builder for [StatementStatementDefinitionListPage]. */
    class Builder internal constructor() {

        private var service: StatementDefinitionService? = null
        private var params: StatementStatementDefinitionListParams? = null
        private var response: StatementStatementDefinitionListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            statementStatementDefinitionListPage: StatementStatementDefinitionListPage
        ) = apply {
            service = statementStatementDefinitionListPage.service
            params = statementStatementDefinitionListPage.params
            response = statementStatementDefinitionListPage.response
        }

        fun service(service: StatementDefinitionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: StatementStatementDefinitionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: StatementStatementDefinitionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [StatementStatementDefinitionListPage].
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
        fun build(): StatementStatementDefinitionListPage =
            StatementStatementDefinitionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StatementStatementDefinitionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "StatementStatementDefinitionListPage{service=$service, params=$params, response=$response}"
}
