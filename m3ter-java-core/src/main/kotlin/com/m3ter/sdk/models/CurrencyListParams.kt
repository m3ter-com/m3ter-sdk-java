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

/**
 * Retrieve a list of Currencies.
 *
 * Retrieves a list of Currencies for the specified Organization. This endpoint supports pagination
 * and includes various query parameters to filter the Currencies based on Currency ID, and short
 * codes.
 */
class CurrencyListParams
private constructor(
    private val orgId: String,
    private val archived: Boolean?,
    private val codes: List<String>?,
    private val ids: List<String>?,
    private val nextToken: String?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /**
     * Filter by archived flag. A True / False flag indicating whether to return Currencies that are
     * archived _(obsolete)_.
     * - TRUE - return archived Currencies.
     * - FALSE - archived Currencies are not returned.
     */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

    /** An optional parameter to retrieve specific Currencies based on their short codes. */
    fun codes(): Optional<List<String>> = Optional.ofNullable(codes)

    /**
     * An optional parameter to filter the list based on specific Currency unique identifiers
     * (UUIDs).
     */
    fun ids(): Optional<List<String>> = Optional.ofNullable(ids)

    /**
     * The `nextToken` for multi-page retrievals. It is used to fetch the next page of Currencies in
     * a paginated list.
     */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** Specifies the maximum number of Currencies to retrieve per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.archived?.let { queryParams.put("archived", listOf(it.toString())) }
        this.codes?.let { queryParams.put("codes", listOf(it.joinToString(separator = ","))) }
        this.ids?.let { queryParams.put("ids", listOf(it.joinToString(separator = ","))) }
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

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CurrencyListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var archived: Boolean? = null
        private var codes: MutableList<String>? = null
        private var ids: MutableList<String>? = null
        private var nextToken: String? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(currencyListParams: CurrencyListParams) = apply {
            orgId = currencyListParams.orgId
            archived = currencyListParams.archived
            codes = currencyListParams.codes?.toMutableList()
            ids = currencyListParams.ids?.toMutableList()
            nextToken = currencyListParams.nextToken
            pageSize = currencyListParams.pageSize
            additionalHeaders = currencyListParams.additionalHeaders.toBuilder()
            additionalQueryParams = currencyListParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /**
         * Filter by archived flag. A True / False flag indicating whether to return Currencies that
         * are archived _(obsolete)_.
         * - TRUE - return archived Currencies.
         * - FALSE - archived Currencies are not returned.
         */
        fun archived(archived: Boolean?) = apply { this.archived = archived }

        /**
         * Filter by archived flag. A True / False flag indicating whether to return Currencies that
         * are archived _(obsolete)_.
         * - TRUE - return archived Currencies.
         * - FALSE - archived Currencies are not returned.
         */
        fun archived(archived: Boolean) = archived(archived as Boolean?)

        /**
         * Filter by archived flag. A True / False flag indicating whether to return Currencies that
         * are archived _(obsolete)_.
         * - TRUE - return archived Currencies.
         * - FALSE - archived Currencies are not returned.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun archived(archived: Optional<Boolean>) = archived(archived.orElse(null) as Boolean?)

        /** An optional parameter to retrieve specific Currencies based on their short codes. */
        fun codes(codes: List<String>?) = apply { this.codes = codes?.toMutableList() }

        /** An optional parameter to retrieve specific Currencies based on their short codes. */
        fun codes(codes: Optional<List<String>>) = codes(codes.orElse(null))

        /** An optional parameter to retrieve specific Currencies based on their short codes. */
        fun addCode(code: String) = apply { codes = (codes ?: mutableListOf()).apply { add(code) } }

        /**
         * An optional parameter to filter the list based on specific Currency unique identifiers
         * (UUIDs).
         */
        fun ids(ids: List<String>?) = apply { this.ids = ids?.toMutableList() }

        /**
         * An optional parameter to filter the list based on specific Currency unique identifiers
         * (UUIDs).
         */
        fun ids(ids: Optional<List<String>>) = ids(ids.orElse(null))

        /**
         * An optional parameter to filter the list based on specific Currency unique identifiers
         * (UUIDs).
         */
        fun addId(id: String) = apply { ids = (ids ?: mutableListOf()).apply { add(id) } }

        /**
         * The `nextToken` for multi-page retrievals. It is used to fetch the next page of
         * Currencies in a paginated list.
         */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /**
         * The `nextToken` for multi-page retrievals. It is used to fetch the next page of
         * Currencies in a paginated list.
         */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.orElse(null))

        /** Specifies the maximum number of Currencies to retrieve per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /** Specifies the maximum number of Currencies to retrieve per page. */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Specifies the maximum number of Currencies to retrieve per page. */
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

        fun build(): CurrencyListParams =
            CurrencyListParams(
                checkRequired("orgId", orgId),
                archived,
                codes?.toImmutable(),
                ids?.toImmutable(),
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

        return /* spotless:off */ other is CurrencyListParams && orgId == other.orgId && archived == other.archived && codes == other.codes && ids == other.ids && nextToken == other.nextToken && pageSize == other.pageSize && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, archived, codes, ids, nextToken, pageSize, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CurrencyListParams{orgId=$orgId, archived=$archived, codes=$codes, ids=$ids, nextToken=$nextToken, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
