// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking.dataExports

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.DataExportJobGetDownloadUrlParams
import com.m3ter.sdk.models.DataExportJobGetDownloadUrlResponse
import com.m3ter.sdk.models.DataExportJobListPage
import com.m3ter.sdk.models.DataExportJobListParams
import com.m3ter.sdk.models.DataExportJobResponse
import com.m3ter.sdk.models.DataExportJobRetrieveParams

interface JobService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Retrieve an Export Job for the given UUID.
     *
     * The response returns:
     * - The source type for the data exported by the Export Job: one of USAGE or OPERATIONAL.
     * - The status of the Export Job.
     */
    fun retrieve(params: DataExportJobRetrieveParams): DataExportJobResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DataExportJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportJobResponse

    /** Retrieve a list of Export Job entities. */
    fun list(params: DataExportJobListParams): DataExportJobListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: DataExportJobListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportJobListPage

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
    fun getDownloadUrl(
        params: DataExportJobGetDownloadUrlParams
    ): DataExportJobGetDownloadUrlResponse = getDownloadUrl(params, RequestOptions.none())

    /** @see [getDownloadUrl] */
    fun getDownloadUrl(
        params: DataExportJobGetDownloadUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportJobGetDownloadUrlResponse

    /** A view of [JobService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/dataexports/jobs/{id}`, but
         * is otherwise the same as [JobService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: DataExportJobRetrieveParams): HttpResponseFor<DataExportJobResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DataExportJobRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportJobResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/dataexports/jobs`, but is
         * otherwise the same as [JobService.list].
         */
        @MustBeClosed
        fun list(params: DataExportJobListParams): HttpResponseFor<DataExportJobListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DataExportJobListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportJobListPage>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/dataexports/jobs/{jobId}/getdownloadurl`, but is otherwise the
         * same as [JobService.getDownloadUrl].
         */
        @MustBeClosed
        fun getDownloadUrl(
            params: DataExportJobGetDownloadUrlParams
        ): HttpResponseFor<DataExportJobGetDownloadUrlResponse> =
            getDownloadUrl(params, RequestOptions.none())

        /** @see [getDownloadUrl] */
        @MustBeClosed
        fun getDownloadUrl(
            params: DataExportJobGetDownloadUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportJobGetDownloadUrlResponse>
    }
}
