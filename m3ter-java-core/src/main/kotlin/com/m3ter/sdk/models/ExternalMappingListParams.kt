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
 * Retrieve a list of all External Mapping entities.
 *
 * This endpoint retrieves a list of all External Mapping entities for a specific Organization. The
 * list can be paginated for better management, and supports filtering using the external system.
 */
class ExternalMappingListParams
private constructor(
    private val orgId: String,
    private val externalSystemId: String?,
    private val integrationConfigId: String?,
    private val m3terIds: List<String>?,
    private val nextToken: String?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /**
     * The name of the external system to use as a filter.
     *
     * For example, if you want to list only those external mappings created for your Organization
     * for the Salesforce external system, use:
     *
     * `?externalSystemId=Salesforce`
     */
    fun externalSystemId(): Optional<String> = Optional.ofNullable(externalSystemId)

    /** ID of the integration config */
    fun integrationConfigId(): Optional<String> = Optional.ofNullable(integrationConfigId)

    /** IDs for m3ter entities */
    fun m3terIds(): Optional<List<String>> = Optional.ofNullable(m3terIds)

    /**
     * The `nextToken` for multi-page retrievals. It is used to fetch the next page of External
     * Mappings in a paginated list.
     */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** Specifies the maximum number of External Mappings to retrieve per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.externalSystemId?.let { queryParams.put("externalSystemId", listOf(it.toString())) }
        this.integrationConfigId?.let {
            queryParams.put("integrationConfigId", listOf(it.toString()))
        }
        this.m3terIds?.let { queryParams.put("m3terIds", listOf(it.joinToString(separator = ","))) }
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
         * Returns a mutable builder for constructing an instance of [ExternalMappingListParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalMappingListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var externalSystemId: String? = null
        private var integrationConfigId: String? = null
        private var m3terIds: MutableList<String>? = null
        private var nextToken: String? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(externalMappingListParams: ExternalMappingListParams) = apply {
            orgId = externalMappingListParams.orgId
            externalSystemId = externalMappingListParams.externalSystemId
            integrationConfigId = externalMappingListParams.integrationConfigId
            m3terIds = externalMappingListParams.m3terIds?.toMutableList()
            nextToken = externalMappingListParams.nextToken
            pageSize = externalMappingListParams.pageSize
            additionalHeaders = externalMappingListParams.additionalHeaders.toBuilder()
            additionalQueryParams = externalMappingListParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /**
         * The name of the external system to use as a filter.
         *
         * For example, if you want to list only those external mappings created for your
         * Organization for the Salesforce external system, use:
         *
         * `?externalSystemId=Salesforce`
         */
        fun externalSystemId(externalSystemId: String?) = apply {
            this.externalSystemId = externalSystemId
        }

        /**
         * The name of the external system to use as a filter.
         *
         * For example, if you want to list only those external mappings created for your
         * Organization for the Salesforce external system, use:
         *
         * `?externalSystemId=Salesforce`
         */
        fun externalSystemId(externalSystemId: Optional<String>) =
            externalSystemId(externalSystemId.orElse(null))

        /** ID of the integration config */
        fun integrationConfigId(integrationConfigId: String?) = apply {
            this.integrationConfigId = integrationConfigId
        }

        /** ID of the integration config */
        fun integrationConfigId(integrationConfigId: Optional<String>) =
            integrationConfigId(integrationConfigId.orElse(null))

        /** IDs for m3ter entities */
        fun m3terIds(m3terIds: List<String>?) = apply { this.m3terIds = m3terIds?.toMutableList() }

        /** IDs for m3ter entities */
        fun m3terIds(m3terIds: Optional<List<String>>) = m3terIds(m3terIds.orElse(null))

        /** IDs for m3ter entities */
        fun addM3terId(m3terId: String) = apply {
            m3terIds = (m3terIds ?: mutableListOf()).apply { add(m3terId) }
        }

        /**
         * The `nextToken` for multi-page retrievals. It is used to fetch the next page of External
         * Mappings in a paginated list.
         */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /**
         * The `nextToken` for multi-page retrievals. It is used to fetch the next page of External
         * Mappings in a paginated list.
         */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.orElse(null))

        /** Specifies the maximum number of External Mappings to retrieve per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /** Specifies the maximum number of External Mappings to retrieve per page. */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Specifies the maximum number of External Mappings to retrieve per page. */
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

        fun build(): ExternalMappingListParams =
            ExternalMappingListParams(
                checkRequired("orgId", orgId),
                externalSystemId,
                integrationConfigId,
                m3terIds?.toImmutable(),
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

        return /* spotless:off */ other is ExternalMappingListParams && orgId == other.orgId && externalSystemId == other.externalSystemId && integrationConfigId == other.integrationConfigId && m3terIds == other.m3terIds && nextToken == other.nextToken && pageSize == other.pageSize && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, externalSystemId, integrationConfigId, m3terIds, nextToken, pageSize, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExternalMappingListParams{orgId=$orgId, externalSystemId=$externalSystemId, integrationConfigId=$integrationConfigId, m3terIds=$m3terIds, nextToken=$nextToken, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
