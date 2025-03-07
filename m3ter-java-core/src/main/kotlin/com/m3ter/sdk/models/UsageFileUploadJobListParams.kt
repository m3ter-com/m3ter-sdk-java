// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.NoAutoDetect
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional

/**
 * Lists the File Upload jobs. Part of the File Upload service for measurements ingest:
 * - You can use the `dateCreatedStart` and `dateCreatedEnd` optional Query parameters to define a
 *   date range to filter the File Uploads jobs returned for this call.
 * - If `dateCreatedStart` and `dateCreatedEnd` Query parameters are not used, then all File Upload
 *   jobs are returned.
 */
class UsageFileUploadJobListParams
private constructor(
    private val orgId: String,
    private val dateCreatedEnd: String?,
    private val dateCreatedStart: String?,
    private val fileKey: String?,
    private val nextToken: String?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /**
     * Include only File Upload jobs created before this date. Required format is ISO-8601:
     * yyyy-MM-dd'T'HH:mm:ss'Z'
     */
    fun dateCreatedEnd(): Optional<String> = Optional.ofNullable(dateCreatedEnd)

    /**
     * Include only File Upload jobs created on or after this date. Required format is ISO-8601:
     * yyyy-MM-dd'T'HH:mm:ss'Z'
     */
    fun dateCreatedStart(): Optional<String> = Optional.ofNullable(dateCreatedStart)

    /** <<deprecated>> */
    fun fileKey(): Optional<String> = Optional.ofNullable(fileKey)

    /** `nextToken` for multi page retrievals. */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** Number of File Upload jobs to retrieve per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.dateCreatedEnd?.let { queryParams.put("dateCreatedEnd", listOf(it.toString())) }
        this.dateCreatedStart?.let { queryParams.put("dateCreatedStart", listOf(it.toString())) }
        this.fileKey?.let { queryParams.put("fileKey", listOf(it.toString())) }
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
         * Returns a mutable builder for constructing an instance of [UsageFileUploadJobListParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageFileUploadJobListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var dateCreatedEnd: String? = null
        private var dateCreatedStart: String? = null
        private var fileKey: String? = null
        private var nextToken: String? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(usageFileUploadJobListParams: UsageFileUploadJobListParams) = apply {
            orgId = usageFileUploadJobListParams.orgId
            dateCreatedEnd = usageFileUploadJobListParams.dateCreatedEnd
            dateCreatedStart = usageFileUploadJobListParams.dateCreatedStart
            fileKey = usageFileUploadJobListParams.fileKey
            nextToken = usageFileUploadJobListParams.nextToken
            pageSize = usageFileUploadJobListParams.pageSize
            additionalHeaders = usageFileUploadJobListParams.additionalHeaders.toBuilder()
            additionalQueryParams = usageFileUploadJobListParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /**
         * Include only File Upload jobs created before this date. Required format is ISO-8601:
         * yyyy-MM-dd'T'HH:mm:ss'Z'
         */
        fun dateCreatedEnd(dateCreatedEnd: String?) = apply { this.dateCreatedEnd = dateCreatedEnd }

        /**
         * Include only File Upload jobs created before this date. Required format is ISO-8601:
         * yyyy-MM-dd'T'HH:mm:ss'Z'
         */
        fun dateCreatedEnd(dateCreatedEnd: Optional<String>) =
            dateCreatedEnd(dateCreatedEnd.orElse(null))

        /**
         * Include only File Upload jobs created on or after this date. Required format is ISO-8601:
         * yyyy-MM-dd'T'HH:mm:ss'Z'
         */
        fun dateCreatedStart(dateCreatedStart: String?) = apply {
            this.dateCreatedStart = dateCreatedStart
        }

        /**
         * Include only File Upload jobs created on or after this date. Required format is ISO-8601:
         * yyyy-MM-dd'T'HH:mm:ss'Z'
         */
        fun dateCreatedStart(dateCreatedStart: Optional<String>) =
            dateCreatedStart(dateCreatedStart.orElse(null))

        /** <<deprecated>> */
        fun fileKey(fileKey: String?) = apply { this.fileKey = fileKey }

        /** <<deprecated>> */
        fun fileKey(fileKey: Optional<String>) = fileKey(fileKey.orElse(null))

        /** `nextToken` for multi page retrievals. */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** `nextToken` for multi page retrievals. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.orElse(null))

        /** Number of File Upload jobs to retrieve per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /** Number of File Upload jobs to retrieve per page. */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Number of File Upload jobs to retrieve per page. */
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

        fun build(): UsageFileUploadJobListParams =
            UsageFileUploadJobListParams(
                checkRequired("orgId", orgId),
                dateCreatedEnd,
                dateCreatedStart,
                fileKey,
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

        return /* spotless:off */ other is UsageFileUploadJobListParams && orgId == other.orgId && dateCreatedEnd == other.dateCreatedEnd && dateCreatedStart == other.dateCreatedStart && fileKey == other.fileKey && nextToken == other.nextToken && pageSize == other.pageSize && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, dateCreatedEnd, dateCreatedStart, fileKey, nextToken, pageSize, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "UsageFileUploadJobListParams{orgId=$orgId, dateCreatedEnd=$dateCreatedEnd, dateCreatedStart=$dateCreatedStart, fileKey=$fileKey, nextToken=$nextToken, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
