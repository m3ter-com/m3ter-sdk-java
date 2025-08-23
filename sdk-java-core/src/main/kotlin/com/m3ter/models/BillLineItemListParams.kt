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
 * Lists all the line items for a specific Bill.
 *
 * This endpoint retrieves a list of line items for the given Bill within the specified
 * Organization. The list can also be paginated for easier management. The line items returned in
 * the list include individual charges, discounts, or adjustments within a Bill.
 */
class BillLineItemListParams
private constructor(
    private val orgId: String?,
    private val billId: String?,
    private val additional: List<String>?,
    private val nextToken: String?,
    private val pageSize: Int?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun billId(): Optional<String> = Optional.ofNullable(billId)

    /** Comma separated list of additional fields. */
    fun additional(): Optional<List<String>> = Optional.ofNullable(additional)

    /**
     * The `nextToken` for multi-page retrievals. It is used to fetch the next page of line items in
     * a paginated list.
     */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** Specifies the maximum number of line items to retrieve per page. */
    fun pageSize(): Optional<Int> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BillLineItemListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [BillLineItemListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillLineItemListParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var billId: String? = null
        private var additional: MutableList<String>? = null
        private var nextToken: String? = null
        private var pageSize: Int? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(billLineItemListParams: BillLineItemListParams) = apply {
            orgId = billLineItemListParams.orgId
            billId = billLineItemListParams.billId
            additional = billLineItemListParams.additional?.toMutableList()
            nextToken = billLineItemListParams.nextToken
            pageSize = billLineItemListParams.pageSize
            additionalHeaders = billLineItemListParams.additionalHeaders.toBuilder()
            additionalQueryParams = billLineItemListParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun billId(billId: String?) = apply { this.billId = billId }

        /** Alias for calling [Builder.billId] with `billId.orElse(null)`. */
        fun billId(billId: Optional<String>) = billId(billId.getOrNull())

        /** Comma separated list of additional fields. */
        fun additional(additional: List<String>?) = apply {
            this.additional = additional?.toMutableList()
        }

        /** Alias for calling [Builder.additional] with `additional.orElse(null)`. */
        fun additional(additional: Optional<List<String>>) = additional(additional.getOrNull())

        /**
         * Adds a single [String] to [Builder.additional].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdditional(additional: String) = apply {
            this.additional = (this.additional ?: mutableListOf()).apply { add(additional) }
        }

        /**
         * The `nextToken` for multi-page retrievals. It is used to fetch the next page of line
         * items in a paginated list.
         */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** Specifies the maximum number of line items to retrieve per page. */
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
         * Returns an immutable instance of [BillLineItemListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BillLineItemListParams =
            BillLineItemListParams(
                orgId,
                billId,
                additional?.toImmutable(),
                nextToken,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            1 -> billId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                additional?.let { put("additional", it.joinToString(",")) }
                nextToken?.let { put("nextToken", it) }
                pageSize?.let { put("pageSize", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BillLineItemListParams &&
            orgId == other.orgId &&
            billId == other.billId &&
            additional == other.additional &&
            nextToken == other.nextToken &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            orgId,
            billId,
            additional,
            nextToken,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BillLineItemListParams{orgId=$orgId, billId=$billId, additional=$additional, nextToken=$nextToken, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
