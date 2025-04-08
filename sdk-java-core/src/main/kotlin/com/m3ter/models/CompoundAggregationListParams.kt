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
 * Retrieve a list of all CompoundAggregations.
 *
 * This endpoint retrieves a list of CompoundAggregations associated with a specific organization.
 * CompoundAggregations enable you to define numerical measures based on simple Aggregations of
 * usage data. It supports pagination, and includes various query parameters to filter the
 * CompoundAggregations based on Product, CompoundAggregation IDs or short codes.
 */
class CompoundAggregationListParams
private constructor(
    private val orgId: String?,
    private val codes: List<String>?,
    private val ids: List<String>?,
    private val nextToken: String?,
    private val pageSize: Long?,
    private val productId: List<String>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /**
     * An optional parameter to retrieve specific CompoundAggregations based on their short codes.
     */
    fun codes(): Optional<List<String>> = Optional.ofNullable(codes)

    /**
     * An optional parameter to retrieve specific CompoundAggregations based on their unique
     * identifiers (UUIDs).
     */
    fun ids(): Optional<List<String>> = Optional.ofNullable(ids)

    /**
     * The `nextToken` for multi-page retrievals. It is used to fetch the next page of
     * CompoundAggregations in a paginated list.
     */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** Specifies the maximum number of CompoundAggregations to retrieve per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /**
     * An optional parameter to filter the CompoundAggregations based on specific Product unique
     * identifiers (UUIDs).
     */
    fun productId(): Optional<List<String>> = Optional.ofNullable(productId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): CompoundAggregationListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [CompoundAggregationListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CompoundAggregationListParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var codes: MutableList<String>? = null
        private var ids: MutableList<String>? = null
        private var nextToken: String? = null
        private var pageSize: Long? = null
        private var productId: MutableList<String>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(compoundAggregationListParams: CompoundAggregationListParams) = apply {
            orgId = compoundAggregationListParams.orgId
            codes = compoundAggregationListParams.codes?.toMutableList()
            ids = compoundAggregationListParams.ids?.toMutableList()
            nextToken = compoundAggregationListParams.nextToken
            pageSize = compoundAggregationListParams.pageSize
            productId = compoundAggregationListParams.productId?.toMutableList()
            additionalHeaders = compoundAggregationListParams.additionalHeaders.toBuilder()
            additionalQueryParams = compoundAggregationListParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /**
         * An optional parameter to retrieve specific CompoundAggregations based on their short
         * codes.
         */
        fun codes(codes: List<String>?) = apply { this.codes = codes?.toMutableList() }

        /** Alias for calling [Builder.codes] with `codes.orElse(null)`. */
        fun codes(codes: Optional<List<String>>) = codes(codes.getOrNull())

        /**
         * Adds a single [String] to [codes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCode(code: String) = apply { codes = (codes ?: mutableListOf()).apply { add(code) } }

        /**
         * An optional parameter to retrieve specific CompoundAggregations based on their unique
         * identifiers (UUIDs).
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
         * CompoundAggregations in a paginated list.
         */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** Specifies the maximum number of CompoundAggregations to retrieve per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /**
         * An optional parameter to filter the CompoundAggregations based on specific Product unique
         * identifiers (UUIDs).
         */
        fun productId(productId: List<String>?) = apply {
            this.productId = productId?.toMutableList()
        }

        /** Alias for calling [Builder.productId] with `productId.orElse(null)`. */
        fun productId(productId: Optional<List<String>>) = productId(productId.getOrNull())

        /**
         * Adds a single [String] to [Builder.productId].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProductId(productId: String) = apply {
            this.productId = (this.productId ?: mutableListOf()).apply { add(productId) }
        }

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
         * Returns an immutable instance of [CompoundAggregationListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CompoundAggregationListParams =
            CompoundAggregationListParams(
                orgId,
                codes?.toImmutable(),
                ids?.toImmutable(),
                nextToken,
                pageSize,
                productId?.toImmutable(),
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
                codes?.let { put("codes", it.joinToString(",")) }
                ids?.let { put("ids", it.joinToString(",")) }
                nextToken?.let { put("nextToken", it) }
                pageSize?.let { put("pageSize", it.toString()) }
                productId?.let { put("productId", it.joinToString(",")) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CompoundAggregationListParams && orgId == other.orgId && codes == other.codes && ids == other.ids && nextToken == other.nextToken && pageSize == other.pageSize && productId == other.productId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, codes, ids, nextToken, pageSize, productId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CompoundAggregationListParams{orgId=$orgId, codes=$codes, ids=$ids, nextToken=$nextToken, pageSize=$pageSize, productId=$productId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
