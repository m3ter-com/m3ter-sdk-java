// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.NoAutoDetect
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional

/**
 * Retrieve a list of all Balances for your Organization.
 *
 * This endpoint returns a list of all Balances associated with your organization. You can filter
 * the Balances by the end customer's Account UUID and end dates, and paginate through them using
 * the `pageSize` and `nextToken` parameters.
 */
class BalanceListParams
private constructor(
    private val orgId: String,
    private val accountId: String?,
    private val endDateEnd: String?,
    private val endDateStart: String?,
    private val nextToken: String?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /** The unique identifier (UUID) for the end customer's account. */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId)

    /** Only include Balances with end dates earlier than this date. */
    fun endDateEnd(): Optional<String> = Optional.ofNullable(endDateEnd)

    /** Only include Balances with end dates equal to or later than this date. */
    fun endDateStart(): Optional<String> = Optional.ofNullable(endDateStart)

    /**
     * The `nextToken` for retrieving the next page of Balances. It is used to fetch the next page
     * of Balances in a paginated list.
     */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** The maximum number of Balances to return per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.accountId?.let { queryParams.put("accountId", listOf(it.toString())) }
        this.endDateEnd?.let { queryParams.put("endDateEnd", listOf(it.toString())) }
        this.endDateStart?.let { queryParams.put("endDateStart", listOf(it.toString())) }
        this.nextToken?.let { queryParams.put("nextToken", listOf(it.toString())) }
        this.pageSize?.let { queryParams.put("pageSize", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> orgId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BalanceListParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var accountId: String? = null
        private var endDateEnd: String? = null
        private var endDateStart: String? = null
        private var nextToken: String? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(balanceListParams: BalanceListParams) = apply {
            orgId = balanceListParams.orgId
            accountId = balanceListParams.accountId
            endDateEnd = balanceListParams.endDateEnd
            endDateStart = balanceListParams.endDateStart
            nextToken = balanceListParams.nextToken
            pageSize = balanceListParams.pageSize
            additionalHeaders = balanceListParams.additionalHeaders.toBuilder()
            additionalQueryParams = balanceListParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /** The unique identifier (UUID) for the end customer's account. */
        fun accountId(accountId: String?) = apply { this.accountId = accountId }

        /** The unique identifier (UUID) for the end customer's account. */
        fun accountId(accountId: Optional<String>) = accountId(accountId.orElse(null))

        /** Only include Balances with end dates earlier than this date. */
        fun endDateEnd(endDateEnd: String?) = apply { this.endDateEnd = endDateEnd }

        /** Only include Balances with end dates earlier than this date. */
        fun endDateEnd(endDateEnd: Optional<String>) = endDateEnd(endDateEnd.orElse(null))

        /** Only include Balances with end dates equal to or later than this date. */
        fun endDateStart(endDateStart: String?) = apply { this.endDateStart = endDateStart }

        /** Only include Balances with end dates equal to or later than this date. */
        fun endDateStart(endDateStart: Optional<String>) = endDateStart(endDateStart.orElse(null))

        /**
         * The `nextToken` for retrieving the next page of Balances. It is used to fetch the next
         * page of Balances in a paginated list.
         */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /**
         * The `nextToken` for retrieving the next page of Balances. It is used to fetch the next
         * page of Balances in a paginated list.
         */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.orElse(null))

        /** The maximum number of Balances to return per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /** The maximum number of Balances to return per page. */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** The maximum number of Balances to return per page. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.orElse(null) as Long?)

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

        fun build(): BalanceListParams =
            BalanceListParams(
                checkRequired("orgId", orgId),
                accountId,
                endDateEnd,
                endDateStart,
                nextToken,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceListParams && orgId == other.orgId && accountId == other.accountId && endDateEnd == other.endDateEnd && endDateStart == other.endDateStart && nextToken == other.nextToken && pageSize == other.pageSize && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, accountId, endDateEnd, endDateStart, nextToken, pageSize, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BalanceListParams{orgId=$orgId, accountId=$accountId, endDateEnd=$endDateEnd, endDateStart=$endDateStart, nextToken=$nextToken, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
