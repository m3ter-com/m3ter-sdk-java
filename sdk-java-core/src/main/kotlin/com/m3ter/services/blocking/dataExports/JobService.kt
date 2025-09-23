// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.dataExports

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.DataExportJobGetDownloadUrlParams
import com.m3ter.models.DataExportJobGetDownloadUrlResponse
import com.m3ter.models.DataExportJobListPage
import com.m3ter.models.DataExportJobListParams
import com.m3ter.models.DataExportJobResponse
import com.m3ter.models.DataExportJobRetrieveParams
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
     * Retrieve an Export Job for the given UUID.
     *
     * The response returns:
     * * The source type for the data exported by the Export Job: one of USAGE or OPERATIONAL.
     * * The status of the Export Job.
     */
    fun retrieve(id: String): DataExportJobResponse =
        retrieve(id, DataExportJobRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DataExportJobRetrieveParams = DataExportJobRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportJobResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DataExportJobRetrieveParams = DataExportJobRetrieveParams.none(),
    ): DataExportJobResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DataExportJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportJobResponse

    /** @see retrieve */
    fun retrieve(params: DataExportJobRetrieveParams): DataExportJobResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): DataExportJobResponse =
        retrieve(id, DataExportJobRetrieveParams.none(), requestOptions)

    /** Retrieve a list of Export Job entities. */
    fun list(): DataExportJobListPage = list(DataExportJobListParams.none())

    /** @see list */
    fun list(
        params: DataExportJobListParams = DataExportJobListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportJobListPage

    /** @see list */
    fun list(
        params: DataExportJobListParams = DataExportJobListParams.none()
    ): DataExportJobListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DataExportJobListPage =
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
     * * Only valid for Export jobs ran in the past 24 hours.
     * * The download URL is time-bound and is only valid for 15 minutes.
     *
     * **NOTE!** This ExportDestination endpoint is available in Beta release version. See
     * [Feature Release Stages](https://www.m3ter.com/docs/guides/getting-started/feature-release-stages)
     * for Beta release definition.
     */
    fun getDownloadUrl(jobId: String): DataExportJobGetDownloadUrlResponse =
        getDownloadUrl(jobId, DataExportJobGetDownloadUrlParams.none())

    /** @see getDownloadUrl */
    fun getDownloadUrl(
        jobId: String,
        params: DataExportJobGetDownloadUrlParams = DataExportJobGetDownloadUrlParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportJobGetDownloadUrlResponse =
        getDownloadUrl(params.toBuilder().jobId(jobId).build(), requestOptions)

    /** @see getDownloadUrl */
    fun getDownloadUrl(
        jobId: String,
        params: DataExportJobGetDownloadUrlParams = DataExportJobGetDownloadUrlParams.none(),
    ): DataExportJobGetDownloadUrlResponse = getDownloadUrl(jobId, params, RequestOptions.none())

    /** @see getDownloadUrl */
    fun getDownloadUrl(
        params: DataExportJobGetDownloadUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportJobGetDownloadUrlResponse

    /** @see getDownloadUrl */
    fun getDownloadUrl(
        params: DataExportJobGetDownloadUrlParams
    ): DataExportJobGetDownloadUrlResponse = getDownloadUrl(params, RequestOptions.none())

    /** @see getDownloadUrl */
    fun getDownloadUrl(
        jobId: String,
        requestOptions: RequestOptions,
    ): DataExportJobGetDownloadUrlResponse =
        getDownloadUrl(jobId, DataExportJobGetDownloadUrlParams.none(), requestOptions)

    /** A view of [JobService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): JobService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/dataexports/jobs/{id}`, but
         * is otherwise the same as [JobService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<DataExportJobResponse> =
            retrieve(id, DataExportJobRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DataExportJobRetrieveParams = DataExportJobRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportJobResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: DataExportJobRetrieveParams = DataExportJobRetrieveParams.none(),
        ): HttpResponseFor<DataExportJobResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DataExportJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportJobResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DataExportJobRetrieveParams): HttpResponseFor<DataExportJobResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportJobResponse> =
            retrieve(id, DataExportJobRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/dataexports/jobs`, but is
         * otherwise the same as [JobService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DataExportJobListPage> = list(DataExportJobListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DataExportJobListParams = DataExportJobListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportJobListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DataExportJobListParams = DataExportJobListParams.none()
        ): HttpResponseFor<DataExportJobListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DataExportJobListPage> =
            list(DataExportJobListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/dataexports/jobs/{jobId}/getdownloadurl`, but is otherwise the
         * same as [JobService.getDownloadUrl].
         */
        @MustBeClosed
        fun getDownloadUrl(jobId: String): HttpResponseFor<DataExportJobGetDownloadUrlResponse> =
            getDownloadUrl(jobId, DataExportJobGetDownloadUrlParams.none())

        /** @see getDownloadUrl */
        @MustBeClosed
        fun getDownloadUrl(
            jobId: String,
            params: DataExportJobGetDownloadUrlParams = DataExportJobGetDownloadUrlParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportJobGetDownloadUrlResponse> =
            getDownloadUrl(params.toBuilder().jobId(jobId).build(), requestOptions)

        /** @see getDownloadUrl */
        @MustBeClosed
        fun getDownloadUrl(
            jobId: String,
            params: DataExportJobGetDownloadUrlParams = DataExportJobGetDownloadUrlParams.none(),
        ): HttpResponseFor<DataExportJobGetDownloadUrlResponse> =
            getDownloadUrl(jobId, params, RequestOptions.none())

        /** @see getDownloadUrl */
        @MustBeClosed
        fun getDownloadUrl(
            params: DataExportJobGetDownloadUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportJobGetDownloadUrlResponse>

        /** @see getDownloadUrl */
        @MustBeClosed
        fun getDownloadUrl(
            params: DataExportJobGetDownloadUrlParams
        ): HttpResponseFor<DataExportJobGetDownloadUrlResponse> =
            getDownloadUrl(params, RequestOptions.none())

        /** @see getDownloadUrl */
        @MustBeClosed
        fun getDownloadUrl(
            jobId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportJobGetDownloadUrlResponse> =
            getDownloadUrl(jobId, DataExportJobGetDownloadUrlParams.none(), requestOptions)
    }
}
