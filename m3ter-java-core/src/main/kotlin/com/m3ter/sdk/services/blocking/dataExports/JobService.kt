// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking.dataExports

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.DataExportJob
import com.m3ter.sdk.models.DataExportJobGetDownloadUrlParams
import com.m3ter.sdk.models.DataExportJobGetDownloadUrlResponse
import com.m3ter.sdk.models.DataExportJobListPage
import com.m3ter.sdk.models.DataExportJobListParams
import com.m3ter.sdk.models.DataExportJobRetrieveParams

interface JobService {

    /**
     * Retrieve an Export Job for the given UUID.
     *
     * The response returns:
     * - The source type for the data exported by the Export Job: one of USAGE or OPERATIONAL.
     * - The status of the Export Job.
     */
    @JvmOverloads
    fun retrieve(
        params: DataExportJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportJob

    /** Retrieve a list of Export Job entities. */
    @JvmOverloads
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
    @JvmOverloads
    fun getDownloadUrl(
        params: DataExportJobGetDownloadUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportJobGetDownloadUrlResponse
}
