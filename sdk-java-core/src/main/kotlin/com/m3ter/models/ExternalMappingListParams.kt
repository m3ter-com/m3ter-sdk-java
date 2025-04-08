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
 * Retrieve a list of all External Mapping entities.
 *
 * This endpoint retrieves a list of all External Mapping entities for a specific Organization. The
 * list can be paginated for better management, and supports filtering using the external system.
 */
class ExternalMappingListParams
private constructor(
    private val orgId: String?,
    private val externalSystemId: String?,
    private val integrationConfigId: String?,
    private val m3terIds: List<String>?,
    private val nextToken: String?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

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

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ExternalMappingListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ExternalMappingListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalMappingListParams]. */
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

        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

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

        /** Alias for calling [Builder.externalSystemId] with `externalSystemId.orElse(null)`. */
        fun externalSystemId(externalSystemId: Optional<String>) =
            externalSystemId(externalSystemId.getOrNull())

        /** ID of the integration config */
        fun integrationConfigId(integrationConfigId: String?) = apply {
            this.integrationConfigId = integrationConfigId
        }

        /**
         * Alias for calling [Builder.integrationConfigId] with `integrationConfigId.orElse(null)`.
         */
        fun integrationConfigId(integrationConfigId: Optional<String>) =
            integrationConfigId(integrationConfigId.getOrNull())

        /** IDs for m3ter entities */
        fun m3terIds(m3terIds: List<String>?) = apply { this.m3terIds = m3terIds?.toMutableList() }

        /** Alias for calling [Builder.m3terIds] with `m3terIds.orElse(null)`. */
        fun m3terIds(m3terIds: Optional<List<String>>) = m3terIds(m3terIds.getOrNull())

        /**
         * Adds a single [String] to [m3terIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addM3terId(m3terId: String) = apply {
            m3terIds = (m3terIds ?: mutableListOf()).apply { add(m3terId) }
        }

        /**
         * The `nextToken` for multi-page retrievals. It is used to fetch the next page of External
         * Mappings in a paginated list.
         */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** Specifies the maximum number of External Mappings to retrieve per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

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
         * Returns an immutable instance of [ExternalMappingListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExternalMappingListParams =
            ExternalMappingListParams(
                orgId,
                externalSystemId,
                integrationConfigId,
                m3terIds?.toImmutable(),
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
                externalSystemId?.let { put("externalSystemId", it) }
                integrationConfigId?.let { put("integrationConfigId", it) }
                m3terIds?.let { put("m3terIds", it.joinToString(",")) }
                nextToken?.let { put("nextToken", it) }
                pageSize?.let { put("pageSize", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

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
