// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.dataExports

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.DataExportJobGetDownloadUrlParams
import com.m3ter.models.DataExportJobGetDownloadUrlResponse
import com.m3ter.models.DataExportJobListPageAsync
import com.m3ter.models.DataExportJobListParams
import com.m3ter.models.DataExportJobResponse
import com.m3ter.models.DataExportJobRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface JobServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobServiceAsync

    /**
     * Retrieve an Export Job for the given UUID.
     *
     * The response returns:
     * - The source type for the data exported by the Export Job: one of USAGE or OPERATIONAL.
     * - The status of the Export Job.
     */
    fun retrieve(id: String): CompletableFuture<DataExportJobResponse> =
        retrieve(id, DataExportJobRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: DataExportJobRetrieveParams = DataExportJobRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportJobResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: DataExportJobRetrieveParams = DataExportJobRetrieveParams.none(),
    ): CompletableFuture<DataExportJobResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DataExportJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportJobResponse>

    /** @see [retrieve] */
    fun retrieve(params: DataExportJobRetrieveParams): CompletableFuture<DataExportJobResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportJobResponse> =
        retrieve(id, DataExportJobRetrieveParams.none(), requestOptions)

    /** Retrieve a list of Export Job entities. */
    fun list(): CompletableFuture<DataExportJobListPageAsync> = list(DataExportJobListParams.none())

    /** @see [list] */
    fun list(
        params: DataExportJobListParams = DataExportJobListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportJobListPageAsync>

    /** @see [list] */
    fun list(
        params: DataExportJobListParams = DataExportJobListParams.none()
    ): CompletableFuture<DataExportJobListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<DataExportJobListPageAsync> =
        list(DataExportJobListParams.none(), requestOptions)

    /**
     * Returns a presigned download URL for data export file download based on the `jobId` provided.
     *
     * If you omit `destinationIds` when setting up your
     * [Ad-Hoc data exports](https://www.m3ter.com/docs/api#tag/ExportAdHoc) or
     * [Scheduled data exports](https://www.m3ter.com/docs/api#tag/ExportSchedule), then the data is
     * not copied to a destination but is available for you to download using the returned download
     * URL.
     *
     * **Constraints:**
     * - Only valid for Export jobs ran in the past 24 hours.
     * - The download URL is time-bound and is only valid for 15 minutes.
     *
     * **NOTE!** This ExportDestination endpoint is available in Beta release version. Beta release
     * features are functional but may be incomplete, and there is no commitment at this stage to
     * particular functionality or timelines.
     */
    fun getDownloadUrl(jobId: String): CompletableFuture<DataExportJobGetDownloadUrlResponse> =
        getDownloadUrl(jobId, DataExportJobGetDownloadUrlParams.none())

    /** @see [getDownloadUrl] */
    fun getDownloadUrl(
        jobId: String,
        params: DataExportJobGetDownloadUrlParams = DataExportJobGetDownloadUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportJobGetDownloadUrlResponse> =
        getDownloadUrl(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see [getDownloadUrl] */
    fun getDownloadUrl(
        jobId: String,
        params: DataExportJobGetDownloadUrlParams = DataExportJobGetDownloadUrlParams.none(),
    ): CompletableFuture<DataExportJobGetDownloadUrlResponse> =
        getDownloadUrl(jobId, params, RequestOptions.none())

    /** @see [getDownloadUrl] */
    fun getDownloadUrl(
        params: DataExportJobGetDownloadUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportJobGetDownloadUrlResponse>

    /** @see [getDownloadUrl] */
    fun getDownloadUrl(
        params: DataExportJobGetDownloadUrlParams
    ): CompletableFuture<DataExportJobGetDownloadUrlResponse> =
        getDownloadUrl(params, RequestOptions.none())

    /** @see [getDownloadUrl] */
    fun getDownloadUrl(
        jobId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportJobGetDownloadUrlResponse> =
        getDownloadUrl(jobId, DataExportJobGetDownloadUrlParams.none(), requestOptions)

    /** A view of [JobServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/dataexports/jobs/{id}`, but
         * is otherwise the same as [JobServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<DataExportJobResponse>> =
            retrieve(id, DataExportJobRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: DataExportJobRetrieveParams = DataExportJobRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportJobResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: DataExportJobRetrieveParams = DataExportJobRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DataExportJobResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: DataExportJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportJobResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: DataExportJobRetrieveParams
        ): CompletableFuture<HttpResponseFor<DataExportJobResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataExportJobResponse>> =
            retrieve(id, DataExportJobRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/dataexports/jobs`, but is
         * otherwise the same as [JobServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DataExportJobListPageAsync>> =
            list(DataExportJobListParams.none())

        /** @see [list] */
        fun list(
            params: DataExportJobListParams = DataExportJobListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportJobListPageAsync>>

        /** @see [list] */
        fun list(
            params: DataExportJobListParams = DataExportJobListParams.none()
        ): CompletableFuture<HttpResponseFor<DataExportJobListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DataExportJobListPageAsync>> =
            list(DataExportJobListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/dataexports/jobs/{jobId}/getdownloadurl`, but is otherwise the
         * same as [JobServiceAsync.getDownloadUrl].
         */
        fun getDownloadUrl(
            jobId: String
        ): CompletableFuture<HttpResponseFor<DataExportJobGetDownloadUrlResponse>> =
            getDownloadUrl(jobId, DataExportJobGetDownloadUrlParams.none())

        /** @see [getDownloadUrl] */
        fun getDownloadUrl(
            jobId: String,
            params: DataExportJobGetDownloadUrlParams = DataExportJobGetDownloadUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportJobGetDownloadUrlResponse>> =
            getDownloadUrl(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see [getDownloadUrl] */
        fun getDownloadUrl(
            jobId: String,
            params: DataExportJobGetDownloadUrlParams = DataExportJobGetDownloadUrlParams.none(),
        ): CompletableFuture<HttpResponseFor<DataExportJobGetDownloadUrlResponse>> =
            getDownloadUrl(jobId, params, RequestOptions.none())

        /** @see [getDownloadUrl] */
        fun getDownloadUrl(
            params: DataExportJobGetDownloadUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DataExportJobGetDownloadUrlResponse>>

        /** @see [getDownloadUrl] */
        fun getDownloadUrl(
            params: DataExportJobGetDownloadUrlParams
        ): CompletableFuture<HttpResponseFor<DataExportJobGetDownloadUrlResponse>> =
            getDownloadUrl(params, RequestOptions.none())

        /** @see [getDownloadUrl] */
        fun getDownloadUrl(
            jobId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataExportJobGetDownloadUrlResponse>> =
            getDownloadUrl(jobId, DataExportJobGetDownloadUrlParams.none(), requestOptions)
    }
}
