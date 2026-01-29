// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.Params
import com.m3ter.core.checkRequired
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List the Lookup Table Revision Data job Responses for the given Lookup Table Revision.
 *
 * There are four types of Revision Data jobs:
 * * **COPY**. Job runs when you use the
 *   [Copy LookupTableRevisionData](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/CopyLookupTableRevisionData)
 *   endpoint which returns the `jobId`.
 * * **UPLOAD**. Job runs when you use the
 *   [Generate LookupTableRevisionData Upload URL](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/GenerateLookupTableDataUploadUrl)
 *   endpoint which returns the `jobId`.
 * * **DOWNLOAD**. Job runs when you use the
 *   [](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/TriggerLookupTableRevisionDataDownloadJob)
 *   endpoint which returns the `jobId`.
 * * **ARCHIVE**. Job runs when you either manually change a DRAFT Revision to PUBLISHED using the
 *   [Update LookupTableRevision Status](https://www.m3ter.com/docs/api#tag/LookupTableRevision/operation/UpdateLookupTableRevisionStatus)
 *   endpoint or you publish a DRAFT Revision and the existing PUBLISHED Revision is archived.
 *
 * **NOTE:** This endpoint returns the id of each Data job. You then use:
 * * The [Get LookupTableRevisionData Job Response](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/GetLookupTableRevisionDataJobResponse)
 *   endpoint to retrieve a specific Data job Response.
 * * The [Delete LookupTableRevisionData Job Response](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/DeleteLookupTableRevisionDataJobResponse)
 *   to delete a specific Data job Response.
 */
class LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams
private constructor(
    private val orgId: String?,
    private val lookupTableId: String,
    private val lookupTableRevisionId: String?,
    private val nextToken: String?,
    private val pageSize: Int?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun lookupTableId(): String = lookupTableId

    fun lookupTableRevisionId(): Optional<String> = Optional.ofNullable(lookupTableRevisionId)

    /** The nextToken for multi page retrievals */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** The number of Lookup Table Revision Data Job Responses to retrieve per page. */
    fun pageSize(): Optional<Int> = Optional.ofNullable(pageSize)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams].
         *
         * The following fields are required:
         * ```java
         * .lookupTableId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var lookupTableId: String? = null
        private var lookupTableRevisionId: String? = null
        private var nextToken: String? = null
        private var pageSize: Int? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams:
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams
        ) = apply {
            orgId = lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams.orgId
            lookupTableId =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams.lookupTableId
            lookupTableRevisionId =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams
                    .lookupTableRevisionId
            nextToken =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams.nextToken
            pageSize =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams.pageSize
            additionalHeaders =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams
                    .additionalHeaders
                    .toBuilder()
            additionalQueryParams =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams
                    .additionalQueryParams
                    .toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun lookupTableId(lookupTableId: String) = apply { this.lookupTableId = lookupTableId }

        fun lookupTableRevisionId(lookupTableRevisionId: String?) = apply {
            this.lookupTableRevisionId = lookupTableRevisionId
        }

        /**
         * Alias for calling [Builder.lookupTableRevisionId] with
         * `lookupTableRevisionId.orElse(null)`.
         */
        fun lookupTableRevisionId(lookupTableRevisionId: Optional<String>) =
            lookupTableRevisionId(lookupTableRevisionId.getOrNull())

        /** The nextToken for multi page retrievals */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** The number of Lookup Table Revision Data Job Responses to retrieve per page. */
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
         * Returns an immutable instance of
         * [LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .lookupTableId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams =
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams(
                orgId,
                checkRequired("lookupTableId", lookupTableId),
                lookupTableRevisionId,
                nextToken,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            1 -> lookupTableId
            2 -> lookupTableRevisionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                nextToken?.let { put("nextToken", it) }
                pageSize?.let { put("pageSize", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams &&
            orgId == other.orgId &&
            lookupTableId == other.lookupTableId &&
            lookupTableRevisionId == other.lookupTableRevisionId &&
            nextToken == other.nextToken &&
            pageSize == other.pageSize &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            orgId,
            lookupTableId,
            lookupTableRevisionId,
            nextToken,
            pageSize,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams{orgId=$orgId, lookupTableId=$lookupTableId, lookupTableRevisionId=$lookupTableRevisionId, nextToken=$nextToken, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
