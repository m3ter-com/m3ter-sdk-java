// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.NoAutoDetect
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of Commitments.
 *
 * Retrieves a list of all Commitments associated with an Organization. This endpoint supports
 * pagination and includes various query parameters to filter the Commitments based on Account,
 * Product, date, and end dates.
 */
class CommitmentListParams
private constructor(
    private val orgId: String,
    private val accountId: String?,
    private val contractId: String?,
    private val date: String?,
    private val endDateEnd: String?,
    private val endDateStart: String?,
    private val ids: List<String>?,
    private val nextToken: String?,
    private val pageSize: Long?,
    private val productId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /**
     * The unique identifier (UUID) for the Account. This parameter helps filter the Commitments
     * related to a specific end-customer Account.
     */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId)

    fun contractId(): Optional<String> = Optional.ofNullable(contractId)

    /**
     * A date _(in ISO-8601 format)_ to filter Commitments which are active on this specific date.
     */
    fun date(): Optional<String> = Optional.ofNullable(date)

    /**
     * A date _(in ISO-8601 format)_ used to filter Commitments. Only Commitments with end dates
     * before this date will be included.
     */
    fun endDateEnd(): Optional<String> = Optional.ofNullable(endDateEnd)

    /**
     * A date _(in ISO-8601 format)_ used to filter Commitments. Only Commitments with end dates on
     * or after this date will be included.
     */
    fun endDateStart(): Optional<String> = Optional.ofNullable(endDateStart)

    /**
     * A list of unique identifiers (UUIDs) for the Commitments to retrieve. Use this to fetch
     * specific Commitments in a single request.
     */
    fun ids(): Optional<List<String>> = Optional.ofNullable(ids)

    /**
     * The `nextToken` for multi-page retrievals. It is used to fetch the next page of Commitments
     * in a paginated list.
     */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** Specifies the maximum number of Commitments to retrieve per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * The unique identifier (UUID) for the Product. This parameter helps filter the Commitments
     * related to a specific Product.
     */
    fun productId(): Optional<String> = Optional.ofNullable(productId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.accountId?.let { queryParams.put("accountId", listOf(it.toString())) }
        this.contractId?.let { queryParams.put("contractId", listOf(it.toString())) }
        this.date?.let { queryParams.put("date", listOf(it.toString())) }
        this.endDateEnd?.let { queryParams.put("endDateEnd", listOf(it.toString())) }
        this.endDateStart?.let { queryParams.put("endDateStart", listOf(it.toString())) }
        this.ids?.let { queryParams.put("ids", listOf(it.joinToString(separator = ","))) }
        this.nextToken?.let { queryParams.put("nextToken", listOf(it.toString())) }
        this.pageSize?.let { queryParams.put("pageSize", listOf(it.toString())) }
        this.productId?.let { queryParams.put("productId", listOf(it.toString())) }
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
         * Returns a mutable builder for constructing an instance of [CommitmentListParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitmentListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var accountId: String? = null
        private var contractId: String? = null
        private var date: String? = null
        private var endDateEnd: String? = null
        private var endDateStart: String? = null
        private var ids: MutableList<String>? = null
        private var nextToken: String? = null
        private var pageSize: Long? = null
        private var productId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(commitmentListParams: CommitmentListParams) = apply {
            orgId = commitmentListParams.orgId
            accountId = commitmentListParams.accountId
            contractId = commitmentListParams.contractId
            date = commitmentListParams.date
            endDateEnd = commitmentListParams.endDateEnd
            endDateStart = commitmentListParams.endDateStart
            ids = commitmentListParams.ids?.toMutableList()
            nextToken = commitmentListParams.nextToken
            pageSize = commitmentListParams.pageSize
            productId = commitmentListParams.productId
            additionalHeaders = commitmentListParams.additionalHeaders.toBuilder()
            additionalQueryParams = commitmentListParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /**
         * The unique identifier (UUID) for the Account. This parameter helps filter the Commitments
         * related to a specific end-customer Account.
         */
        fun accountId(accountId: String?) = apply { this.accountId = accountId }

        /**
         * The unique identifier (UUID) for the Account. This parameter helps filter the Commitments
         * related to a specific end-customer Account.
         */
        fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

        fun contractId(contractId: String?) = apply { this.contractId = contractId }

        fun contractId(contractId: Optional<String>) = contractId(contractId.getOrNull())

        /**
         * A date _(in ISO-8601 format)_ to filter Commitments which are active on this specific
         * date.
         */
        fun date(date: String?) = apply { this.date = date }

        /**
         * A date _(in ISO-8601 format)_ to filter Commitments which are active on this specific
         * date.
         */
        fun date(date: Optional<String>) = date(date.getOrNull())

        /**
         * A date _(in ISO-8601 format)_ used to filter Commitments. Only Commitments with end dates
         * before this date will be included.
         */
        fun endDateEnd(endDateEnd: String?) = apply { this.endDateEnd = endDateEnd }

        /**
         * A date _(in ISO-8601 format)_ used to filter Commitments. Only Commitments with end dates
         * before this date will be included.
         */
        fun endDateEnd(endDateEnd: Optional<String>) = endDateEnd(endDateEnd.getOrNull())

        /**
         * A date _(in ISO-8601 format)_ used to filter Commitments. Only Commitments with end dates
         * on or after this date will be included.
         */
        fun endDateStart(endDateStart: String?) = apply { this.endDateStart = endDateStart }

        /**
         * A date _(in ISO-8601 format)_ used to filter Commitments. Only Commitments with end dates
         * on or after this date will be included.
         */
        fun endDateStart(endDateStart: Optional<String>) = endDateStart(endDateStart.getOrNull())

        /**
         * A list of unique identifiers (UUIDs) for the Commitments to retrieve. Use this to fetch
         * specific Commitments in a single request.
         */
        fun ids(ids: List<String>?) = apply { this.ids = ids?.toMutableList() }

        /**
         * A list of unique identifiers (UUIDs) for the Commitments to retrieve. Use this to fetch
         * specific Commitments in a single request.
         */
        fun ids(ids: Optional<List<String>>) = ids(ids.getOrNull())

        /**
         * A list of unique identifiers (UUIDs) for the Commitments to retrieve. Use this to fetch
         * specific Commitments in a single request.
         */
        fun addId(id: String) = apply { ids = (ids ?: mutableListOf()).apply { add(id) } }

        /**
         * The `nextToken` for multi-page retrievals. It is used to fetch the next page of
         * Commitments in a paginated list.
         */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /**
         * The `nextToken` for multi-page retrievals. It is used to fetch the next page of
         * Commitments in a paginated list.
         */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** Specifies the maximum number of Commitments to retrieve per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /** Specifies the maximum number of Commitments to retrieve per page. */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Specifies the maximum number of Commitments to retrieve per page. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /**
         * The unique identifier (UUID) for the Product. This parameter helps filter the Commitments
         * related to a specific Product.
         */
        fun productId(productId: String?) = apply { this.productId = productId }

        /**
         * The unique identifier (UUID) for the Product. This parameter helps filter the Commitments
         * related to a specific Product.
         */
        fun productId(productId: Optional<String>) = productId(productId.getOrNull())

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

        fun build(): CommitmentListParams =
            CommitmentListParams(
                checkRequired("orgId", orgId),
                accountId,
                contractId,
                date,
                endDateEnd,
                endDateStart,
                ids?.toImmutable(),
                nextToken,
                pageSize,
                productId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CommitmentListParams && orgId == other.orgId && accountId == other.accountId && contractId == other.contractId && date == other.date && endDateEnd == other.endDateEnd && endDateStart == other.endDateStart && ids == other.ids && nextToken == other.nextToken && pageSize == other.pageSize && productId == other.productId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, accountId, contractId, date, endDateEnd, endDateStart, ids, nextToken, pageSize, productId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CommitmentListParams{orgId=$orgId, accountId=$accountId, contractId=$contractId, date=$date, endDateEnd=$endDateEnd, endDateStart=$endDateStart, ids=$ids, nextToken=$nextToken, pageSize=$pageSize, productId=$productId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
