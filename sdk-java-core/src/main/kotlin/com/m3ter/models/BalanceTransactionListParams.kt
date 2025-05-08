// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.Params
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve all Transactions for a specific Balance.
 *
 * This endpoint returns a list of all Transactions associated with a specific Balance. You can
 * paginate through the Transactions by using the `pageSize` and `nextToken` parameters.
 */
class BalanceTransactionListParams
private constructor(
    private val orgId: String?,
    private val balanceId: String?,
    private val nextToken: String?,
    private val pageSize: Long?,
    private val scheduleId: String?,
    private val transactionTypeId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun balanceId(): Optional<String> = Optional.ofNullable(balanceId)

    /**
     * `nextToken` for multi page retrievals. A token for retrieving the next page of transactions.
     * You'll get this from the response to your request.
     */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** The maximum number of transactions to return per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun scheduleId(): Optional<String> = Optional.ofNullable(scheduleId)

    fun transactionTypeId(): Optional<String> = Optional.ofNullable(transactionTypeId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BalanceTransactionListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [BalanceTransactionListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceTransactionListParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var balanceId: String? = null
        private var nextToken: String? = null
        private var pageSize: Long? = null
        private var scheduleId: String? = null
        private var transactionTypeId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(balanceTransactionListParams: BalanceTransactionListParams) = apply {
            orgId = balanceTransactionListParams.orgId
            balanceId = balanceTransactionListParams.balanceId
            nextToken = balanceTransactionListParams.nextToken
            pageSize = balanceTransactionListParams.pageSize
            scheduleId = balanceTransactionListParams.scheduleId
            transactionTypeId = balanceTransactionListParams.transactionTypeId
            additionalHeaders = balanceTransactionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = balanceTransactionListParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun balanceId(balanceId: String?) = apply { this.balanceId = balanceId }

        /** Alias for calling [Builder.balanceId] with `balanceId.orElse(null)`. */
        fun balanceId(balanceId: Optional<String>) = balanceId(balanceId.getOrNull())

        /**
         * `nextToken` for multi page retrievals. A token for retrieving the next page of
         * transactions. You'll get this from the response to your request.
         */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** The maximum number of transactions to return per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        fun scheduleId(scheduleId: String?) = apply { this.scheduleId = scheduleId }

        /** Alias for calling [Builder.scheduleId] with `scheduleId.orElse(null)`. */
        fun scheduleId(scheduleId: Optional<String>) = scheduleId(scheduleId.getOrNull())

        fun transactionTypeId(transactionTypeId: String?) = apply {
            this.transactionTypeId = transactionTypeId
        }

        /** Alias for calling [Builder.transactionTypeId] with `transactionTypeId.orElse(null)`. */
        fun transactionTypeId(transactionTypeId: Optional<String>) =
            transactionTypeId(transactionTypeId.getOrNull())

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
         * Returns an immutable instance of [BalanceTransactionListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BalanceTransactionListParams =
            BalanceTransactionListParams(
                orgId,
                balanceId,
                nextToken,
                pageSize,
                scheduleId,
                transactionTypeId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            1 -> balanceId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                nextToken?.let { put("nextToken", it) }
                pageSize?.let { put("pageSize", it.toString()) }
                scheduleId?.let { put("scheduleId", it) }
                transactionTypeId?.let { put("transactionTypeId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceTransactionListParams && orgId == other.orgId && balanceId == other.balanceId && nextToken == other.nextToken && pageSize == other.pageSize && scheduleId == other.scheduleId && transactionTypeId == other.transactionTypeId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, balanceId, nextToken, pageSize, scheduleId, transactionTypeId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BalanceTransactionListParams{orgId=$orgId, balanceId=$balanceId, nextToken=$nextToken, pageSize=$pageSize, scheduleId=$scheduleId, transactionTypeId=$transactionTypeId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
