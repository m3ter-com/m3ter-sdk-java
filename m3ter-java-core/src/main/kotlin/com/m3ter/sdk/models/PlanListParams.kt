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

/** Retrieve a list of Plans that can be filtered by Product, Account, or Plan ID. */
class PlanListParams
private constructor(
    private val orgId: String,
    private val accountId: List<String>?,
    private val ids: List<String>?,
    private val nextToken: String?,
    private val pageSize: Long?,
    private val productId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /** List of Account IDs the Plan belongs to. */
    fun accountId(): Optional<List<String>> = Optional.ofNullable(accountId)

    /** List of Plan IDs to retrieve. */
    fun ids(): Optional<List<String>> = Optional.ofNullable(ids)

    /** `nextToken` for multi-page retrievals. */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** Number of Plans to retrieve per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** UUID of the Product to retrieve Plans for. */
    fun productId(): Optional<String> = Optional.ofNullable(productId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.accountId?.let {
            queryParams.put("accountId", listOf(it.joinToString(separator = ",")))
        }
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
         * Returns a mutable builder for constructing an instance of [PlanListParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PlanListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var accountId: MutableList<String>? = null
        private var ids: MutableList<String>? = null
        private var nextToken: String? = null
        private var pageSize: Long? = null
        private var productId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(planListParams: PlanListParams) = apply {
            orgId = planListParams.orgId
            accountId = planListParams.accountId?.toMutableList()
            ids = planListParams.ids?.toMutableList()
            nextToken = planListParams.nextToken
            pageSize = planListParams.pageSize
            productId = planListParams.productId
            additionalHeaders = planListParams.additionalHeaders.toBuilder()
            additionalQueryParams = planListParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /** List of Account IDs the Plan belongs to. */
        fun accountId(accountId: List<String>?) = apply {
            this.accountId = accountId?.toMutableList()
        }

        /** List of Account IDs the Plan belongs to. */
        fun accountId(accountId: Optional<List<String>>) = accountId(accountId.getOrNull())

        /** List of Account IDs the Plan belongs to. */
        fun addAccountId(accountId: String) = apply {
            this.accountId = (this.accountId ?: mutableListOf()).apply { add(accountId) }
        }

        /** List of Plan IDs to retrieve. */
        fun ids(ids: List<String>?) = apply { this.ids = ids?.toMutableList() }

        /** List of Plan IDs to retrieve. */
        fun ids(ids: Optional<List<String>>) = ids(ids.getOrNull())

        /** List of Plan IDs to retrieve. */
        fun addId(id: String) = apply { ids = (ids ?: mutableListOf()).apply { add(id) } }

        /** `nextToken` for multi-page retrievals. */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** `nextToken` for multi-page retrievals. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** Number of Plans to retrieve per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /** Number of Plans to retrieve per page. */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Number of Plans to retrieve per page. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** UUID of the Product to retrieve Plans for. */
        fun productId(productId: String?) = apply { this.productId = productId }

        /** UUID of the Product to retrieve Plans for. */
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

        fun build(): PlanListParams =
            PlanListParams(
                checkRequired("orgId", orgId),
                accountId?.toImmutable(),
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

        return /* spotless:off */ other is PlanListParams && orgId == other.orgId && accountId == other.accountId && ids == other.ids && nextToken == other.nextToken && pageSize == other.pageSize && productId == other.productId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, accountId, ids, nextToken, pageSize, productId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PlanListParams{orgId=$orgId, accountId=$accountId, ids=$ids, nextToken=$nextToken, pageSize=$pageSize, productId=$productId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
