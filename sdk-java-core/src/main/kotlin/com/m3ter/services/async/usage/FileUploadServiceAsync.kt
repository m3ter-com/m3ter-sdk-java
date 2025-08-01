// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.usage

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.UsageFileUploadGenerateUploadUrlParams
import com.m3ter.models.UsageFileUploadGenerateUploadUrlResponse
import com.m3ter.services.async.usage.fileUploads.JobServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FileUploadServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileUploadServiceAsync

    fun jobs(): JobServiceAsync

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
    ): CompletableFuture<UsageFileUploadGenerateUploadUrlResponse> =
        generateUploadUrl(params, RequestOptions.none())

    /** @see generateUploadUrl */
    fun generateUploadUrl(
        params: UsageFileUploadGenerateUploadUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageFileUploadGenerateUploadUrlResponse>

    /**
     * A view of [FileUploadServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FileUploadServiceAsync.WithRawResponse

        fun jobs(): JobServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/fileuploads/measurements/generateUploadUrl`, but is otherwise the
         * same as [FileUploadServiceAsync.generateUploadUrl].
         */
        fun generateUploadUrl(
            params: UsageFileUploadGenerateUploadUrlParams
        ): CompletableFuture<HttpResponseFor<UsageFileUploadGenerateUploadUrlResponse>> =
            generateUploadUrl(params, RequestOptions.none())

        /** @see generateUploadUrl */
        fun generateUploadUrl(
            params: UsageFileUploadGenerateUploadUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageFileUploadGenerateUploadUrlResponse>>
    }
}
