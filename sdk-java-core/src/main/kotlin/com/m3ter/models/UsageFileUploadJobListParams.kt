// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.Params
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Lists the File Upload jobs. Part of the File Upload service for measurements ingest:
 * - You can use the `dateCreatedStart` and `dateCreatedEnd` optional Query parameters to define a
 *   date range to filter the File Uploads jobs returned for this call.
 * - If `dateCreatedStart` and `dateCreatedEnd` Query parameters are not used, then all File Upload
 *   jobs are returned.
 */
class UsageFileUploadJobListParams
private constructor(
    private val orgId: String?,
    private val dateCreatedEnd: String?,
    private val dateCreatedStart: String?,
    private val fileKey: String?,
    private val nextToken: String?,
    private val pageSize: Int?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

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
    fun pageSize(): Optional<Int> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): UsageFileUploadJobListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [UsageFileUploadJobListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageFileUploadJobListParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var dateCreatedEnd: String? = null
        private var dateCreatedStart: String? = null
        private var fileKey: String? = null
        private var nextToken: String? = null
        private var pageSize: Int? = null
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

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /**
         * Include only File Upload jobs created before this date. Required format is ISO-8601:
         * yyyy-MM-dd'T'HH:mm:ss'Z'
         */
        fun dateCreatedEnd(dateCreatedEnd: String?) = apply { this.dateCreatedEnd = dateCreatedEnd }

        /** Alias for calling [Builder.dateCreatedEnd] with `dateCreatedEnd.orElse(null)`. */
        fun dateCreatedEnd(dateCreatedEnd: Optional<String>) =
            dateCreatedEnd(dateCreatedEnd.getOrNull())

        /**
         * Include only File Upload jobs created on or after this date. Required format is ISO-8601:
         * yyyy-MM-dd'T'HH:mm:ss'Z'
         */
        fun dateCreatedStart(dateCreatedStart: String?) = apply {
            this.dateCreatedStart = dateCreatedStart
        }

        /** Alias for calling [Builder.dateCreatedStart] with `dateCreatedStart.orElse(null)`. */
        fun dateCreatedStart(dateCreatedStart: Optional<String>) =
            dateCreatedStart(dateCreatedStart.getOrNull())

        /** <<deprecated>> */
        fun fileKey(fileKey: String?) = apply { this.fileKey = fileKey }

        /** Alias for calling [Builder.fileKey] with `fileKey.orElse(null)`. */
        fun fileKey(fileKey: Optional<String>) = fileKey(fileKey.getOrNull())

        /** `nextToken` for multi page retrievals. */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** Number of File Upload jobs to retrieve per page. */
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
         * Returns an immutable instance of [UsageFileUploadJobListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UsageFileUploadJobListParams =
            UsageFileUploadJobListParams(
                orgId,
                dateCreatedEnd,
                dateCreatedStart,
                fileKey,
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
                dateCreatedEnd?.let { put("dateCreatedEnd", it) }
                dateCreatedStart?.let { put("dateCreatedStart", it) }
                fileKey?.let { put("fileKey", it) }
                nextToken?.let { put("nextToken", it) }
                pageSize?.let { put("pageSize", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

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
