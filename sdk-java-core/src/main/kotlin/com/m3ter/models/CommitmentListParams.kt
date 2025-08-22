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
 * Retrieve a list of Commitments.
 *
 * Retrieves a list of all Commitments associated with an Organization. This endpoint supports
 * pagination and includes various query parameters to filter the Commitments based on Account,
 * Product, date, and end dates.
 */
class CommitmentListParams
private constructor(
    private val orgId: String?,
    private val accountId: String?,
    private val contractId: String?,
    private val date: String?,
    private val endDateEnd: String?,
    private val endDateStart: String?,
    private val ids: List<String>?,
    private val nextToken: String?,
    private val pageSize: Int?,
    private val productId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

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
    fun pageSize(): Optional<Int> = Optional.ofNullable(pageSize)

    /**
     * The unique identifier (UUID) for the Product. This parameter helps filter the Commitments
     * related to a specific Product.
     */
    fun productId(): Optional<String> = Optional.ofNullable(productId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CommitmentListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CommitmentListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitmentListParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var accountId: String? = null
        private var contractId: String? = null
        private var date: String? = null
        private var endDateEnd: String? = null
        private var endDateStart: String? = null
        private var ids: MutableList<String>? = null
        private var nextToken: String? = null
        private var pageSize: Int? = null
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

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /**
         * The unique identifier (UUID) for the Account. This parameter helps filter the Commitments
         * related to a specific end-customer Account.
         */
        fun accountId(accountId: String?) = apply { this.accountId = accountId }

        /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
        fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

        fun contractId(contractId: String?) = apply { this.contractId = contractId }

        /** Alias for calling [Builder.contractId] with `contractId.orElse(null)`. */
        fun contractId(contractId: Optional<String>) = contractId(contractId.getOrNull())

        /**
         * A date _(in ISO-8601 format)_ to filter Commitments which are active on this specific
         * date.
         */
        fun date(date: String?) = apply { this.date = date }

        /** Alias for calling [Builder.date] with `date.orElse(null)`. */
        fun date(date: Optional<String>) = date(date.getOrNull())

        /**
         * A date _(in ISO-8601 format)_ used to filter Commitments. Only Commitments with end dates
         * before this date will be included.
         */
        fun endDateEnd(endDateEnd: String?) = apply { this.endDateEnd = endDateEnd }

        /** Alias for calling [Builder.endDateEnd] with `endDateEnd.orElse(null)`. */
        fun endDateEnd(endDateEnd: Optional<String>) = endDateEnd(endDateEnd.getOrNull())

        /**
         * A date _(in ISO-8601 format)_ used to filter Commitments. Only Commitments with end dates
         * on or after this date will be included.
         */
        fun endDateStart(endDateStart: String?) = apply { this.endDateStart = endDateStart }

        /** Alias for calling [Builder.endDateStart] with `endDateStart.orElse(null)`. */
        fun endDateStart(endDateStart: Optional<String>) = endDateStart(endDateStart.getOrNull())

        /**
         * A list of unique identifiers (UUIDs) for the Commitments to retrieve. Use this to fetch
         * specific Commitments in a single request.
         */
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
         * The `nextToken` for multi-page retrievals. It is used to fetch the next page of
         * Commitments in a paginated list.
         */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** Specifies the maximum number of Commitments to retrieve per page. */
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
         * The unique identifier (UUID) for the Product. This parameter helps filter the Commitments
         * related to a specific Product.
         */
        fun productId(productId: String?) = apply { this.productId = productId }

        /** Alias for calling [Builder.productId] with `productId.orElse(null)`. */
        fun productId(productId: Optional<String>) = productId(productId.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CommitmentListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CommitmentListParams =
            CommitmentListParams(
                orgId,
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
                contractId?.let { put("contractId", it) }
                date?.let { put("date", it) }
                endDateEnd?.let { put("endDateEnd", it) }
                endDateStart?.let { put("endDateStart", it) }
                ids?.let { put("ids", it.joinToString(",")) }
                nextToken?.let { put("nextToken", it) }
                pageSize?.let { put("pageSize", it.toString()) }
                productId?.let { put("productId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CommitmentListParams &&
            orgId == other.orgId &&
            accountId == other.accountId &&
            contractId == other.contractId &&
            date == other.date &&
            endDateEnd == other.endDateEnd &&
            endDateStart == other.endDateStart &&
            ids == other.ids &&
            nextToken == other.nextToken &&
            pageSize == other.pageSize &&
            productId == other.productId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            orgId,
            accountId,
            contractId,
            date,
            endDateEnd,
            endDateStart,
            ids,
            nextToken,
            pageSize,
            productId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CommitmentListParams{orgId=$orgId, accountId=$accountId, contractId=$contractId, date=$date, endDateEnd=$endDateEnd, endDateStart=$endDateStart, ids=$ids, nextToken=$nextToken, pageSize=$pageSize, productId=$productId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
