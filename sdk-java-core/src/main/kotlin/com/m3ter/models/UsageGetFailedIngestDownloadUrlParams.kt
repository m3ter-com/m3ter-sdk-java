// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.Params
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Returns a presigned download URL for failed ingest file download based on the file path provided.
 *
 * If a usage data ingest measurement you submit to the m3ter platform fails, an
 * `ingest.validation.failure` Event is generated. Use this call to obtain a download URL which you
 * can then use to download a file containing details of what went wrong with the attempted usage
 * data measurement ingest, and allowing you to follow-up and resolve the issue.
 *
 * To obtain the `file` query parameter:
 * - Use the [List Events](https://www.m3ter.com/docs/api#tag/Events/operation/ListEventFields) call
 *   with the `ingest.validation.failure` for the `eventName` query parameter.
 * - The response contains a `getDownloadUrl` response parameter and this contains the file path you
 *   can use to obtain the failed ingest file download URL.
 *
 * **Notes:**
 * - The presigned Url returned to use for failed ingest file download is time-bound and expires
 *   after 5 minutes.
 * - If you make a List Events call for `ingest.validation.failure` Events in your Organization,
 *   then you can perform this **GET** call using the full URL returned for any ingest failure Event
 *   to obtain a failed ingest file download URL for the Event.
 */
class UsageGetFailedIngestDownloadUrlParams
private constructor(
    private val orgId: String?,
    private val file: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /** The file path */
    fun file(): Optional<String> = Optional.ofNullable(file)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): UsageGetFailedIngestDownloadUrlParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [UsageGetFailedIngestDownloadUrlParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageGetFailedIngestDownloadUrlParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var file: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            usageGetFailedIngestDownloadUrlParams: UsageGetFailedIngestDownloadUrlParams
        ) = apply {
            orgId = usageGetFailedIngestDownloadUrlParams.orgId
            file = usageGetFailedIngestDownloadUrlParams.file
            additionalHeaders = usageGetFailedIngestDownloadUrlParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                usageGetFailedIngestDownloadUrlParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /** The file path */
        fun file(file: String?) = apply { this.file = file }

        /** Alias for calling [Builder.file] with `file.orElse(null)`. */
        fun file(file: Optional<String>) = file(file.getOrNull())

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
         * Returns an immutable instance of [UsageGetFailedIngestDownloadUrlParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UsageGetFailedIngestDownloadUrlParams =
            UsageGetFailedIngestDownloadUrlParams(
                orgId,
                file,
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
                file?.let { put("file", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageGetFailedIngestDownloadUrlParams &&
            orgId == other.orgId &&
            file == other.file &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(orgId, file, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UsageGetFailedIngestDownloadUrlParams{orgId=$orgId, file=$file, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
