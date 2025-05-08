// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.usage.fileUploads

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.FileUploadJobResponse
import com.m3ter.models.UsageFileUploadJobGetOriginalDownloadUrlParams
import com.m3ter.models.UsageFileUploadJobGetOriginalDownloadUrlResponse
import com.m3ter.models.UsageFileUploadJobListPageAsync
import com.m3ter.models.UsageFileUploadJobListParams
import com.m3ter.models.UsageFileUploadJobRetrieveParams
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
    fun retrieve(id: String): CompletableFuture<FileUploadJobResponse> =
        retrieve(id, UsageFileUploadJobRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: UsageFileUploadJobRetrieveParams = UsageFileUploadJobRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileUploadJobResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: UsageFileUploadJobRetrieveParams = UsageFileUploadJobRetrieveParams.none(),
    ): CompletableFuture<FileUploadJobResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: UsageFileUploadJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileUploadJobResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: UsageFileUploadJobRetrieveParams
    ): CompletableFuture<FileUploadJobResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileUploadJobResponse> =
        retrieve(id, UsageFileUploadJobRetrieveParams.none(), requestOptions)

    /**
     * Lists the File Upload jobs. Part of the File Upload service for measurements ingest:
     * - You can use the `dateCreatedStart` and `dateCreatedEnd` optional Query parameters to define
     *   a date range to filter the File Uploads jobs returned for this call.
     * - If `dateCreatedStart` and `dateCreatedEnd` Query parameters are not used, then all File
     *   Upload jobs are returned.
     */
    fun list(): CompletableFuture<UsageFileUploadJobListPageAsync> =
        list(UsageFileUploadJobListParams.none())

    /** @see [list] */
    fun list(
        params: UsageFileUploadJobListParams = UsageFileUploadJobListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageFileUploadJobListPageAsync>

    /** @see [list] */
    fun list(
        params: UsageFileUploadJobListParams = UsageFileUploadJobListParams.none()
    ): CompletableFuture<UsageFileUploadJobListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<UsageFileUploadJobListPageAsync> =
        list(UsageFileUploadJobListParams.none(), requestOptions)

    /**
     * Use the original file upload job id to obtain a download URL, which you can then use to
     * retrieve the file you originally uploaded to the file upload service:
     * - A download URL is returned together with a download job id.
     * - You can then use a `GET` using the returned download URL as the endpoint to retrieve the
     *   file you originally uploaded.
     *
     * Part of the file upload service for submitting measurements data files.
     */
    fun getOriginalDownloadUrl(
        id: String
    ): CompletableFuture<UsageFileUploadJobGetOriginalDownloadUrlResponse> =
        getOriginalDownloadUrl(id, UsageFileUploadJobGetOriginalDownloadUrlParams.none())

    /** @see [getOriginalDownloadUrl] */
    fun getOriginalDownloadUrl(
        id: String,
        params: UsageFileUploadJobGetOriginalDownloadUrlParams =
            UsageFileUploadJobGetOriginalDownloadUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageFileUploadJobGetOriginalDownloadUrlResponse> =
        getOriginalDownloadUrl(params.toBuilder().id(id).build(), requestOptions)

    /** @see [getOriginalDownloadUrl] */
    fun getOriginalDownloadUrl(
        id: String,
        params: UsageFileUploadJobGetOriginalDownloadUrlParams =
            UsageFileUploadJobGetOriginalDownloadUrlParams.none(),
    ): CompletableFuture<UsageFileUploadJobGetOriginalDownloadUrlResponse> =
        getOriginalDownloadUrl(id, params, RequestOptions.none())

    /** @see [getOriginalDownloadUrl] */
    fun getOriginalDownloadUrl(
        params: UsageFileUploadJobGetOriginalDownloadUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageFileUploadJobGetOriginalDownloadUrlResponse>

    /** @see [getOriginalDownloadUrl] */
    fun getOriginalDownloadUrl(
        params: UsageFileUploadJobGetOriginalDownloadUrlParams
    ): CompletableFuture<UsageFileUploadJobGetOriginalDownloadUrlResponse> =
        getOriginalDownloadUrl(params, RequestOptions.none())

    /** @see [getOriginalDownloadUrl] */
    fun getOriginalDownloadUrl(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageFileUploadJobGetOriginalDownloadUrlResponse> =
        getOriginalDownloadUrl(
            id,
            UsageFileUploadJobGetOriginalDownloadUrlParams.none(),
            requestOptions,
        )

    /** A view of [JobServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/fileuploads/measurements/jobs/{id}`, but is otherwise the same as
         * [JobServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<FileUploadJobResponse>> =
            retrieve(id, UsageFileUploadJobRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: UsageFileUploadJobRetrieveParams = UsageFileUploadJobRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileUploadJobResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: UsageFileUploadJobRetrieveParams = UsageFileUploadJobRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<FileUploadJobResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: UsageFileUploadJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileUploadJobResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: UsageFileUploadJobRetrieveParams
        ): CompletableFuture<HttpResponseFor<FileUploadJobResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileUploadJobResponse>> =
            retrieve(id, UsageFileUploadJobRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/fileuploads/measurements/jobs`, but is otherwise the same as
         * [JobServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<UsageFileUploadJobListPageAsync>> =
            list(UsageFileUploadJobListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: UsageFileUploadJobListParams = UsageFileUploadJobListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageFileUploadJobListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: UsageFileUploadJobListParams = UsageFileUploadJobListParams.none()
        ): CompletableFuture<HttpResponseFor<UsageFileUploadJobListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UsageFileUploadJobListPageAsync>> =
            list(UsageFileUploadJobListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/fileuploads/measurements/jobs/{id}/original`, but is otherwise the
         * same as [JobServiceAsync.getOriginalDownloadUrl].
         */
        @MustBeClosed
        fun getOriginalDownloadUrl(
            id: String
        ): CompletableFuture<HttpResponseFor<UsageFileUploadJobGetOriginalDownloadUrlResponse>> =
            getOriginalDownloadUrl(id, UsageFileUploadJobGetOriginalDownloadUrlParams.none())

        /** @see [getOriginalDownloadUrl] */
        @MustBeClosed
        fun getOriginalDownloadUrl(
            id: String,
            params: UsageFileUploadJobGetOriginalDownloadUrlParams =
                UsageFileUploadJobGetOriginalDownloadUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageFileUploadJobGetOriginalDownloadUrlResponse>> =
            getOriginalDownloadUrl(params.toBuilder().id(id).build(), requestOptions)

        /** @see [getOriginalDownloadUrl] */
        @MustBeClosed
        fun getOriginalDownloadUrl(
            id: String,
            params: UsageFileUploadJobGetOriginalDownloadUrlParams =
                UsageFileUploadJobGetOriginalDownloadUrlParams.none(),
        ): CompletableFuture<HttpResponseFor<UsageFileUploadJobGetOriginalDownloadUrlResponse>> =
            getOriginalDownloadUrl(id, params, RequestOptions.none())

        /** @see [getOriginalDownloadUrl] */
        @MustBeClosed
        fun getOriginalDownloadUrl(
            params: UsageFileUploadJobGetOriginalDownloadUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageFileUploadJobGetOriginalDownloadUrlResponse>>

        /** @see [getOriginalDownloadUrl] */
        @MustBeClosed
        fun getOriginalDownloadUrl(
            params: UsageFileUploadJobGetOriginalDownloadUrlParams
        ): CompletableFuture<HttpResponseFor<UsageFileUploadJobGetOriginalDownloadUrlResponse>> =
            getOriginalDownloadUrl(params, RequestOptions.none())

        /** @see [getOriginalDownloadUrl] */
        @MustBeClosed
        fun getOriginalDownloadUrl(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageFileUploadJobGetOriginalDownloadUrlResponse>> =
            getOriginalDownloadUrl(
                id,
                UsageFileUploadJobGetOriginalDownloadUrlParams.none(),
                requestOptions,
            )
    }
}
