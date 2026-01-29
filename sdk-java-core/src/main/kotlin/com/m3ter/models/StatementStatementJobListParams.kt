// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.Params
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of StatementJobs.
 *
 * Retrieves a list of all StatementJobs for a specific Organization. You can filter the results
 * based on:
 * * StatementJob status.
 * * Whether StatementJob is neither completed nor cancelled but remains active.
 * * The ID of the Bill the StatementJob is associated with.
 *
 * You can also paginate the results for easier management.
 *
 * **WARNING!**
 * * You can use only one of the valid Query parameters: `active`, `status`, or `billId` in any
 *   call. If you use more than one of these Query parameters in the same call, then a 400 Bad
 *   Request is returned with an error message.
 */
class StatementStatementJobListParams
private constructor(
    private val orgId: String?,
    private val active: String?,
    private val billId: String?,
    private val nextToken: String?,
    private val pageSize: Int?,
    private val status: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /**
     * Boolean filter on whether to only retrieve active *(i.e. not completed/cancelled)*
     * StatementJobs.
     * * TRUE - only active StatementJobs retrieved.
     * * FALSE - all StatementJobs retrieved.
     */
    fun active(): Optional<String> = Optional.ofNullable(active)

    /** Filter Statement Jobs by billId */
    fun billId(): Optional<String> = Optional.ofNullable(billId)

    /**
     * The `nextToken` for multi-page retrievals. It is used to fetch the next page of StatementJobs
     * in a paginated list.
     */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** Specifies the maximum number of StatementJobs to retrieve per page. */
    fun pageSize(): Optional<Int> = Optional.ofNullable(pageSize)

    /**
     * Filter using the StatementJobs status. Possible values:
     * * `PENDING`
     * * `RUNNING`
     * * `COMPLETE`
     * * `CANCELLED`
     * * `FAILED`
     */
    fun status(): Optional<String> = Optional.ofNullable(status)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): StatementStatementJobListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [StatementStatementJobListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StatementStatementJobListParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var active: String? = null
        private var billId: String? = null
        private var nextToken: String? = null
        private var pageSize: Int? = null
        private var status: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(statementStatementJobListParams: StatementStatementJobListParams) =
            apply {
                orgId = statementStatementJobListParams.orgId
                active = statementStatementJobListParams.active
                billId = statementStatementJobListParams.billId
                nextToken = statementStatementJobListParams.nextToken
                pageSize = statementStatementJobListParams.pageSize
                status = statementStatementJobListParams.status
                additionalHeaders = statementStatementJobListParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    statementStatementJobListParams.additionalQueryParams.toBuilder()
            }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /**
         * Boolean filter on whether to only retrieve active *(i.e. not completed/cancelled)*
         * StatementJobs.
         * * TRUE - only active StatementJobs retrieved.
         * * FALSE - all StatementJobs retrieved.
         */
        fun active(active: String?) = apply { this.active = active }

        /** Alias for calling [Builder.active] with `active.orElse(null)`. */
        fun active(active: Optional<String>) = active(active.getOrNull())

        /** Filter Statement Jobs by billId */
        fun billId(billId: String?) = apply { this.billId = billId }

        /** Alias for calling [Builder.billId] with `billId.orElse(null)`. */
        fun billId(billId: Optional<String>) = billId(billId.getOrNull())

        /**
         * The `nextToken` for multi-page retrievals. It is used to fetch the next page of
         * StatementJobs in a paginated list.
         */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** Specifies the maximum number of StatementJobs to retrieve per page. */
        fun pageSize(pageSize: Int?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Int) = pageSize(pageSize as Int?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Int>) = pageSize(pageSize.getOrNull())

        /**
         * Filter using the StatementJobs status. Possible values:
         * * `PENDING`
         * * `RUNNING`
         * * `COMPLETE`
         * * `CANCELLED`
         * * `FAILED`
         */
        fun status(status: String?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<String>) = status(status.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [StatementStatementJobListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): StatementStatementJobListParams =
            StatementStatementJobListParams(
                orgId,
                active,
                billId,
                nextToken,
                pageSize,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                active?.let { put("active", it) }
                billId?.let { put("billId", it) }
                nextToken?.let { put("nextToken", it) }
                pageSize?.let { put("pageSize", it.toString()) }
                status?.let { put("status", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StatementStatementJobListParams &&
            orgId == other.orgId &&
            active == other.active &&
            billId == other.billId &&
            nextToken == other.nextToken &&
            pageSize == other.pageSize &&
            status == other.status &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            orgId,
            active,
            billId,
            nextToken,
            pageSize,
            status,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "StatementStatementJobListParams{orgId=$orgId, active=$active, billId=$billId, nextToken=$nextToken, pageSize=$pageSize, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
