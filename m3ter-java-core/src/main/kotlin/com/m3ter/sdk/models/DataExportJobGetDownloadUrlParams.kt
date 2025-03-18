// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.NoAutoDetect
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import java.util.Objects

/**
 * Returns a presigned download URL for data export file download based on the `jobId` provided.
 *
 * If you omit `destinationIds` when setting up your
 * [Ad-Hoc data exports](https://www.m3ter.com/docs/api#tag/ExportAdHoc) or
 * [Scheduled data exports](https://www.m3ter.com/docs/api#tag/ExportSchedule), then the data is not
 * copied to a destination but is available for you to download using the returned download URL.
 *
 * **Constraints:**
 * - Only valid for Export jobs ran in the past 24 hours.
 * - The download URL is time-bound and is only valid for 15 minutes.
 *
 * **NOTE!** This ExportDestination endpoint is available in Beta release version. Beta release
 * features are functional but may be incomplete, and there is no commitment at this stage to
 * particular functionality or timelines.
 */
class DataExportJobGetDownloadUrlParams
private constructor(
    private val orgId: String,
    private val jobId: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    fun jobId(): String = jobId

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId
            1 -> jobId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DataExportJobGetDownloadUrlParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .jobId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExportJobGetDownloadUrlParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var jobId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dataExportJobGetDownloadUrlParams: DataExportJobGetDownloadUrlParams) =
            apply {
                orgId = dataExportJobGetDownloadUrlParams.orgId
                jobId = dataExportJobGetDownloadUrlParams.jobId
                additionalHeaders = dataExportJobGetDownloadUrlParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    dataExportJobGetDownloadUrlParams.additionalQueryParams.toBuilder()
            }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        fun jobId(jobId: String) = apply { this.jobId = jobId }

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
         * Returns an immutable instance of [DataExportJobGetDownloadUrlParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .jobId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataExportJobGetDownloadUrlParams =
            DataExportJobGetDownloadUrlParams(
                checkRequired("orgId", orgId),
                checkRequired("jobId", jobId),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportJobGetDownloadUrlParams && orgId == other.orgId && jobId == other.jobId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, jobId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DataExportJobGetDownloadUrlParams{orgId=$orgId, jobId=$jobId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
