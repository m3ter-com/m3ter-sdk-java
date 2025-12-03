// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.Params
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of all Balances for your Organization.
 *
 * This endpoint returns a list of all Balances associated with your organization. You can filter
 * the Balances by the end customer's Account UUID and end dates, and paginate through them using
 * the `pageSize` and `nextToken` parameters.
 *
 * **NOTE:** If a Balance has a rollover amount configured and you want to use the `endDateStart` or
 * `endDateEnd` query parameters, the `rolloverEndDate` is used as the end date for the Balance.
 */
class BalanceListParams
private constructor(
    private val orgId: String?,
    private val accountId: String?,
    private val contract: String?,
    private val contractId: String?,
    private val endDateEnd: String?,
    private val endDateStart: String?,
    private val ids: List<String>?,
    private val nextToken: String?,
    private val pageSize: Int?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /** The unique identifier (UUID) for the end customer's account. */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId)

    fun contract(): Optional<String> = Optional.ofNullable(contract)

    /** Filter Balances by contract id. Use '' with accountId to fetch unlinked balances. */
    fun contractId(): Optional<String> = Optional.ofNullable(contractId)

    /**
     * Only include Balances with end dates earlier than this date. If a Balance has a rollover
     * amount configured, then the `rolloverEndDate` will be used as the end date.
     */
    fun endDateEnd(): Optional<String> = Optional.ofNullable(endDateEnd)

    /**
     * Only include Balances with end dates equal to or later than this date. If a Balance has a
     * rollover amount configured, then the `rolloverEndDate` will be used as the end date.
     */
    fun endDateStart(): Optional<String> = Optional.ofNullable(endDateStart)

    /** A list of unique identifiers (UUIDs) for specific Balances to retrieve. */
    fun ids(): Optional<List<String>> = Optional.ofNullable(ids)

    /**
     * The `nextToken` for retrieving the next page of Balances. It is used to fetch the next page
     * of Balances in a paginated list.
     */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** The maximum number of Balances to return per page. */
    fun pageSize(): Optional<Int> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BalanceListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [BalanceListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceListParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var accountId: String? = null
        private var contract: String? = null
        private var contractId: String? = null
        private var endDateEnd: String? = null
        private var endDateStart: String? = null
        private var ids: MutableList<String>? = null
        private var nextToken: String? = null
        private var pageSize: Int? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(balanceListParams: BalanceListParams) = apply {
            orgId = balanceListParams.orgId
            accountId = balanceListParams.accountId
            contract = balanceListParams.contract
            contractId = balanceListParams.contractId
            endDateEnd = balanceListParams.endDateEnd
            endDateStart = balanceListParams.endDateStart
            ids = balanceListParams.ids?.toMutableList()
            nextToken = balanceListParams.nextToken
            pageSize = balanceListParams.pageSize
            additionalHeaders = balanceListParams.additionalHeaders.toBuilder()
            additionalQueryParams = balanceListParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /** The unique identifier (UUID) for the end customer's account. */
        fun accountId(accountId: String?) = apply { this.accountId = accountId }

        /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
        fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

        fun contract(contract: String?) = apply { this.contract = contract }

        /** Alias for calling [Builder.contract] with `contract.orElse(null)`. */
        fun contract(contract: Optional<String>) = contract(contract.getOrNull())

        /** Filter Balances by contract id. Use '' with accountId to fetch unlinked balances. */
        fun contractId(contractId: String?) = apply { this.contractId = contractId }

        /** Alias for calling [Builder.contractId] with `contractId.orElse(null)`. */
        fun contractId(contractId: Optional<String>) = contractId(contractId.getOrNull())

        /**
         * Only include Balances with end dates earlier than this date. If a Balance has a rollover
         * amount configured, then the `rolloverEndDate` will be used as the end date.
         */
        fun endDateEnd(endDateEnd: String?) = apply { this.endDateEnd = endDateEnd }

        /** Alias for calling [Builder.endDateEnd] with `endDateEnd.orElse(null)`. */
        fun endDateEnd(endDateEnd: Optional<String>) = endDateEnd(endDateEnd.getOrNull())

        /**
         * Only include Balances with end dates equal to or later than this date. If a Balance has a
         * rollover amount configured, then the `rolloverEndDate` will be used as the end date.
         */
        fun endDateStart(endDateStart: String?) = apply { this.endDateStart = endDateStart }

        /** Alias for calling [Builder.endDateStart] with `endDateStart.orElse(null)`. */
        fun endDateStart(endDateStart: Optional<String>) = endDateStart(endDateStart.getOrNull())

        /** A list of unique identifiers (UUIDs) for specific Balances to retrieve. */
        fun ids(ids: List<String>?) = apply { this.ids = ids?.toMutableList() }

        /** Alias for calling [Builder.ids] with `ids.orElse(null)`. */
        fun ids(ids: Optional<List<String>>) = ids(ids.getOrNull())

        /**
         * Adds a single [String] to [ids].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { ids = (ids ?: mutableListOf()).apply { add(id) } }

        /**
         * The `nextToken` for retrieving the next page of Balances. It is used to fetch the next
         * page of Balances in a paginated list.
         */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** The maximum number of Balances to return per page. */
        fun pageSize(pageSize: Int?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Int) = pageSize(pageSize as Int?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Int>) = pageSize(pageSize.getOrNull())

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
         * Returns an immutable instance of [BalanceListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BalanceListParams =
            BalanceListParams(
                orgId,
                accountId,
                contract,
                contractId,
                endDateEnd,
                endDateStart,
                ids?.toImmutable(),
                nextToken,
                pageSize,
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
                accountId?.let { put("accountId", it) }
                contract?.let { put("contract", it) }
                contractId?.let { put("contractId", it) }
                endDateEnd?.let { put("endDateEnd", it) }
                endDateStart?.let { put("endDateStart", it) }
                ids?.let { put("ids", it.joinToString(",")) }
                nextToken?.let { put("nextToken", it) }
                pageSize?.let { put("pageSize", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceListParams &&
            orgId == other.orgId &&
            accountId == other.accountId &&
            contract == other.contract &&
            contractId == other.contractId &&
            endDateEnd == other.endDateEnd &&
            endDateStart == other.endDateStart &&
            ids == other.ids &&
            nextToken == other.nextToken &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            orgId,
            accountId,
            contract,
            contractId,
            endDateEnd,
            endDateStart,
            ids,
            nextToken,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BalanceListParams{orgId=$orgId, accountId=$accountId, contract=$contract, contractId=$contractId, endDateEnd=$endDateEnd, endDateStart=$endDateStart, ids=$ids, nextToken=$nextToken, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
