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
 * Retrieve all Transactions for a specific Balance.
 *
 * This endpoint returns a list of all Transactions associated with a specific Balance. You can
 * paginate through the Transactions by using the `pageSize` and `nextToken` parameters.
 */
class BalanceTransactionListParams
private constructor(
    private val orgId: String,
    private val balanceId: String,
    private val nextToken: String?,
    private val pageSize: Long?,
    private val transactionTypeId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    fun balanceId(): String = balanceId

    /**
     * `nextToken` for multi page retrievals. A token for retrieving the next page of transactions.
     * You'll get this from the response to your request.
     */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** The maximum number of transactions to return per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun transactionTypeId(): Optional<String> = Optional.ofNullable(transactionTypeId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.nextToken?.let { queryParams.put("nextToken", listOf(it.toString())) }
        this.pageSize?.let { queryParams.put("pageSize", listOf(it.toString())) }
        this.transactionTypeId?.let { queryParams.put("transactionTypeId", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> orgId
            1 -> balanceId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BalanceTransactionListParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .balanceId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceTransactionListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var balanceId: String? = null
        private var nextToken: String? = null
        private var pageSize: Long? = null
        private var transactionTypeId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(balanceTransactionListParams: BalanceTransactionListParams) = apply {
            orgId = balanceTransactionListParams.orgId
            balanceId = balanceTransactionListParams.balanceId
            nextToken = balanceTransactionListParams.nextToken
            pageSize = balanceTransactionListParams.pageSize
            transactionTypeId = balanceTransactionListParams.transactionTypeId
            additionalHeaders = balanceTransactionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = balanceTransactionListParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        fun balanceId(balanceId: String) = apply { this.balanceId = balanceId }

        /**
         * `nextToken` for multi page retrievals. A token for retrieving the next page of
         * transactions. You'll get this from the response to your request.
         */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /**
         * `nextToken` for multi page retrievals. A token for retrieving the next page of
         * transactions. You'll get this from the response to your request.
         */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.orElse(null))

        /** The maximum number of transactions to return per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /** The maximum number of transactions to return per page. */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** The maximum number of transactions to return per page. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.orElse(null) as Long?)

        fun transactionTypeId(transactionTypeId: String?) = apply {
            this.transactionTypeId = transactionTypeId
        }

        fun transactionTypeId(transactionTypeId: Optional<String>) =
            transactionTypeId(transactionTypeId.orElse(null))

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

        fun build(): BalanceTransactionListParams =
            BalanceTransactionListParams(
                checkRequired("orgId", orgId),
                checkRequired("balanceId", balanceId),
                nextToken,
                pageSize,
                transactionTypeId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceTransactionListParams && orgId == other.orgId && balanceId == other.balanceId && nextToken == other.nextToken && pageSize == other.pageSize && transactionTypeId == other.transactionTypeId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, balanceId, nextToken, pageSize, transactionTypeId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BalanceTransactionListParams{orgId=$orgId, balanceId=$balanceId, nextToken=$nextToken, pageSize=$pageSize, transactionTypeId=$transactionTypeId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
