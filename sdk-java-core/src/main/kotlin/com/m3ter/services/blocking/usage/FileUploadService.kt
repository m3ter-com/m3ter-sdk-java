// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.usage

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.UsageFileUploadGenerateUploadUrlParams
import com.m3ter.models.UsageFileUploadGenerateUploadUrlResponse
import com.m3ter.services.blocking.usage.fileUploads.JobService

interface FileUploadService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun jobs(): JobService

    /**
     * Generate a URL for uploading a file containing measurements to the platform in preparation
     * for the measurements it contains to be ingested:
     * - An upload URL is returned together with an upload job id:
     * - You can then upload your data measurements file using a `PUT` request using the returned
     *   upload URL as the endpoint.
     * - You can use the returned upload job id with other calls to the File Upload Service for any
     *   follow-up or troubleshooting.
     *
     * **Important:**
     * - The `contentLength` request parameter is required.
     * - The upload URL is time limited - it is valid for **_one_** minute.
     *
     * Part of the file upload service for submitting measurements data files.
     */
    fun generateUploadUrl(
        params: UsageFileUploadGenerateUploadUrlParams
    ): UsageFileUploadGenerateUploadUrlResponse = generateUploadUrl(params, RequestOptions.none())

    /** @see [generateUploadUrl] */
    fun generateUploadUrl(
        params: UsageFileUploadGenerateUploadUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageFileUploadGenerateUploadUrlResponse

    /** A view of [FileUploadService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun jobs(): JobService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/fileuploads/measurements/generateUploadUrl`, but is otherwise the
         * same as [FileUploadService.generateUploadUrl].
         */
        @MustBeClosed
        fun generateUploadUrl(
            params: UsageFileUploadGenerateUploadUrlParams
        ): HttpResponseFor<UsageFileUploadGenerateUploadUrlResponse> =
            generateUploadUrl(params, RequestOptions.none())

        /** @see [generateUploadUrl] */
        @MustBeClosed
        fun generateUploadUrl(
            params: UsageFileUploadGenerateUploadUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageFileUploadGenerateUploadUrlResponse>
    }
}
