// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async.usage.fileUploads

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.FileUploadJobResponse
import com.m3ter.sdk.models.UsageFileUploadJobGetOriginalDownloadUrlParams
import com.m3ter.sdk.models.UsageFileUploadJobGetOriginalDownloadUrlResponse
import com.m3ter.sdk.models.UsageFileUploadJobListPageAsync
import com.m3ter.sdk.models.UsageFileUploadJobListParams
import com.m3ter.sdk.models.UsageFileUploadJobRetrieveParams
import java.util.concurrent.CompletableFuture

interface JobServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get the file upload job response using the UUID of the file upload job.
     *
     * Part of the file upload service for measurements ingest.
     */
    @JvmOverloads
    fun retrieve(
        params: UsageFileUploadJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileUploadJobResponse>

    /**
     * Lists the File Upload jobs. Part of the File Upload service for measurements ingest:
     * - You can use the `dateCreatedStart` and `dateCreatedEnd` optional Query parameters to define
     *   a date range to filter the File Uploads jobs returned for this call.
     * - If `dateCreatedStart` and `dateCreatedEnd` Query parameters are not used, then all File
     *   Upload jobs are returned.
     */
    @JvmOverloads
    fun list(
        params: UsageFileUploadJobListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageFileUploadJobListPageAsync>

    /**
     * Use the original file upload job id to obtain a download URL, which you can then use to
     * retrieve the file you originally uploaded to the file upload service:
     * - A download URL is returned together with a download job id.
     * - You can then use a `GET` using the returned download URL as the endpoint to retrieve the
     *   file you originally uploaded.
     *
     * Part of the file upload service for submitting measurements data files.
     */
    @JvmOverloads
    fun getOriginalDownloadUrl(
        params: UsageFileUploadJobGetOriginalDownloadUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageFileUploadJobGetOriginalDownloadUrlResponse>

    /** A view of [JobServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/fileuploads/measurements/jobs/{id}`, but is otherwise the same as
         * [JobServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: UsageFileUploadJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileUploadJobResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/fileuploads/measurements/jobs`, but is otherwise the same as
         * [JobServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: UsageFileUploadJobListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageFileUploadJobListPageAsync>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/fileuploads/measurements/jobs/{id}/original`, but is otherwise the
         * same as [JobServiceAsync.getOriginalDownloadUrl].
         */
        @JvmOverloads
        @MustBeClosed
        fun getOriginalDownloadUrl(
            params: UsageFileUploadJobGetOriginalDownloadUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageFileUploadJobGetOriginalDownloadUrlResponse>>
    }
}
