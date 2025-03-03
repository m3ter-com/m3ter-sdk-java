// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking.usage.fileUploads

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.FileUploadJob
import com.m3ter.sdk.models.UsageFileUploadJobGetOriginalDownloadUrlParams
import com.m3ter.sdk.models.UsageFileUploadJobGetOriginalDownloadUrlResponse
import com.m3ter.sdk.models.UsageFileUploadJobListPage
import com.m3ter.sdk.models.UsageFileUploadJobListParams
import com.m3ter.sdk.models.UsageFileUploadJobRetrieveParams

interface JobService {

    /**
     * Get the file upload job response using the UUID of the file upload job.
     *
     * Part of the file upload service for measurements ingest.
     */
    @JvmOverloads
    fun retrieve(
        params: UsageFileUploadJobRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileUploadJob

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
    ): UsageFileUploadJobListPage

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
    ): UsageFileUploadJobGetOriginalDownloadUrlResponse
}
