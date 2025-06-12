// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.usage.fileUploads

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.FileUploadJobResponse
import com.m3ter.models.UsageFileUploadJobGetOriginalDownloadUrlParams
import com.m3ter.models.UsageFileUploadJobGetOriginalDownloadUrlResponse
import com.m3ter.models.UsageFileUploadJobListPage
import com.m3ter.models.UsageFileUploadJobListParams
import com.m3ter.models.UsageFileUploadJobRetrieveParams
import java.util.function.Consumer

interface JobService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobService

    /**
     * Get the file upload job response using the UUID of the file upload job.
     *
     * Part of the file upload service for measurements ingest.
     */
    fun retrieve(id: String): FileUploadJobResponse =
        retrieve(id, UsageFileUploadJobRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: UsageFileUploadJobRetrieveParams = UsageFileUploadJobRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileUploadJobResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: UsageFileUploadJobRetrieveParams = UsageFileUploadJobRetrieveParams.none(),
    ): FileUploadJobResponse = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: UsageFileUploadJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileUploadJobResponse

    /** @see [retrieve] */
    fun retrieve(params: UsageFileUploadJobRetrieveParams): FileUploadJobResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): FileUploadJobResponse =
        retrieve(id, UsageFileUploadJobRetrieveParams.none(), requestOptions)

    /**
     * Lists the File Upload jobs. Part of the File Upload service for measurements ingest:
     * - You can use the `dateCreatedStart` and `dateCreatedEnd` optional Query parameters to define
     *   a date range to filter the File Uploads jobs returned for this call.
     * - If `dateCreatedStart` and `dateCreatedEnd` Query parameters are not used, then all File
     *   Upload jobs are returned.
     */
    fun list(): UsageFileUploadJobListPage = list(UsageFileUploadJobListParams.none())

    /** @see [list] */
    fun list(
        params: UsageFileUploadJobListParams = UsageFileUploadJobListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageFileUploadJobListPage

    /** @see [list] */
    fun list(
        params: UsageFileUploadJobListParams = UsageFileUploadJobListParams.none()
    ): UsageFileUploadJobListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): UsageFileUploadJobListPage =
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
    fun getOriginalDownloadUrl(id: String): UsageFileUploadJobGetOriginalDownloadUrlResponse =
        getOriginalDownloadUrl(id, UsageFileUploadJobGetOriginalDownloadUrlParams.none())

    /** @see [getOriginalDownloadUrl] */
    fun getOriginalDownloadUrl(
        id: String,
        params: UsageFileUploadJobGetOriginalDownloadUrlParams =
            UsageFileUploadJobGetOriginalDownloadUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageFileUploadJobGetOriginalDownloadUrlResponse =
        getOriginalDownloadUrl(params.toBuilder().id(id).build(), requestOptions)

    /** @see [getOriginalDownloadUrl] */
    fun getOriginalDownloadUrl(
        id: String,
        params: UsageFileUploadJobGetOriginalDownloadUrlParams =
            UsageFileUploadJobGetOriginalDownloadUrlParams.none(),
    ): UsageFileUploadJobGetOriginalDownloadUrlResponse =
        getOriginalDownloadUrl(id, params, RequestOptions.none())

    /** @see [getOriginalDownloadUrl] */
    fun getOriginalDownloadUrl(
        params: UsageFileUploadJobGetOriginalDownloadUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UsageFileUploadJobGetOriginalDownloadUrlResponse

    /** @see [getOriginalDownloadUrl] */
    fun getOriginalDownloadUrl(
        params: UsageFileUploadJobGetOriginalDownloadUrlParams
    ): UsageFileUploadJobGetOriginalDownloadUrlResponse =
        getOriginalDownloadUrl(params, RequestOptions.none())

    /** @see [getOriginalDownloadUrl] */
    fun getOriginalDownloadUrl(
        id: String,
        requestOptions: RequestOptions,
    ): UsageFileUploadJobGetOriginalDownloadUrlResponse =
        getOriginalDownloadUrl(
            id,
            UsageFileUploadJobGetOriginalDownloadUrlParams.none(),
            requestOptions,
        )

    /** A view of [JobService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/fileuploads/measurements/jobs/{id}`, but is otherwise the same as
         * [JobService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<FileUploadJobResponse> =
            retrieve(id, UsageFileUploadJobRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: UsageFileUploadJobRetrieveParams = UsageFileUploadJobRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileUploadJobResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: UsageFileUploadJobRetrieveParams = UsageFileUploadJobRetrieveParams.none(),
        ): HttpResponseFor<FileUploadJobResponse> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: UsageFileUploadJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileUploadJobResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: UsageFileUploadJobRetrieveParams
        ): HttpResponseFor<FileUploadJobResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileUploadJobResponse> =
            retrieve(id, UsageFileUploadJobRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/fileuploads/measurements/jobs`, but is otherwise the same as
         * [JobService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<UsageFileUploadJobListPage> =
            list(UsageFileUploadJobListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: UsageFileUploadJobListParams = UsageFileUploadJobListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageFileUploadJobListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: UsageFileUploadJobListParams = UsageFileUploadJobListParams.none()
        ): HttpResponseFor<UsageFileUploadJobListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<UsageFileUploadJobListPage> =
            list(UsageFileUploadJobListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/fileuploads/measurements/jobs/{id}/original`, but is otherwise the
         * same as [JobService.getOriginalDownloadUrl].
         */
        @MustBeClosed
        fun getOriginalDownloadUrl(
            id: String
        ): HttpResponseFor<UsageFileUploadJobGetOriginalDownloadUrlResponse> =
            getOriginalDownloadUrl(id, UsageFileUploadJobGetOriginalDownloadUrlParams.none())

        /** @see [getOriginalDownloadUrl] */
        @MustBeClosed
        fun getOriginalDownloadUrl(
            id: String,
            params: UsageFileUploadJobGetOriginalDownloadUrlParams =
                UsageFileUploadJobGetOriginalDownloadUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageFileUploadJobGetOriginalDownloadUrlResponse> =
            getOriginalDownloadUrl(params.toBuilder().id(id).build(), requestOptions)

        /** @see [getOriginalDownloadUrl] */
        @MustBeClosed
        fun getOriginalDownloadUrl(
            id: String,
            params: UsageFileUploadJobGetOriginalDownloadUrlParams =
                UsageFileUploadJobGetOriginalDownloadUrlParams.none(),
        ): HttpResponseFor<UsageFileUploadJobGetOriginalDownloadUrlResponse> =
            getOriginalDownloadUrl(id, params, RequestOptions.none())

        /** @see [getOriginalDownloadUrl] */
        @MustBeClosed
        fun getOriginalDownloadUrl(
            params: UsageFileUploadJobGetOriginalDownloadUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UsageFileUploadJobGetOriginalDownloadUrlResponse>

        /** @see [getOriginalDownloadUrl] */
        @MustBeClosed
        fun getOriginalDownloadUrl(
            params: UsageFileUploadJobGetOriginalDownloadUrlParams
        ): HttpResponseFor<UsageFileUploadJobGetOriginalDownloadUrlResponse> =
            getOriginalDownloadUrl(params, RequestOptions.none())

        /** @see [getOriginalDownloadUrl] */
        @MustBeClosed
        fun getOriginalDownloadUrl(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageFileUploadJobGetOriginalDownloadUrlResponse> =
            getOriginalDownloadUrl(
                id,
                UsageFileUploadJobGetOriginalDownloadUrlParams.none(),
                requestOptions,
            )
    }
}
