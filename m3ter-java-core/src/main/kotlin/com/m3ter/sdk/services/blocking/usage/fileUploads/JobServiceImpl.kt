// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking.usage.fileUploads

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.handlers.errorHandler
import com.m3ter.sdk.core.handlers.jsonHandler
import com.m3ter.sdk.core.handlers.withErrorHandler
import com.m3ter.sdk.core.http.HttpMethod
import com.m3ter.sdk.core.http.HttpRequest
import com.m3ter.sdk.core.http.HttpResponse.Handler
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.FileUploadJob
import com.m3ter.sdk.models.UsageFileUploadJobGetOriginalDownloadUrlParams
import com.m3ter.sdk.models.UsageFileUploadJobGetOriginalDownloadUrlResponse
import com.m3ter.sdk.models.UsageFileUploadJobListPage
import com.m3ter.sdk.models.UsageFileUploadJobListParams
import com.m3ter.sdk.models.UsageFileUploadJobRetrieveParams

class JobServiceImpl internal constructor(private val clientOptions: ClientOptions) : JobService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<FileUploadJob> =
        jsonHandler<FileUploadJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Get the file upload job response using the UUID of the file upload job.
     *
     * Part of the file upload service for measurements ingest.
     */
    override fun retrieve(
        params: UsageFileUploadJobRetrieveParams,
        requestOptions: RequestOptions,
    ): FileUploadJob {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "fileuploads",
                    "measurements",
                    "jobs",
                    params.getPathParam(1),
                )
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<UsageFileUploadJobListPage.Response> =
        jsonHandler<UsageFileUploadJobListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Lists the File Upload jobs. Part of the File Upload service for measurements ingest:
     * - You can use the `dateCreatedStart` and `dateCreatedEnd` optional Query parameters to define
     *   a date range to filter the File Uploads jobs returned for this call.
     * - If `dateCreatedStart` and `dateCreatedEnd` Query parameters are not used, then all File
     *   Upload jobs are returned.
     */
    override fun list(
        params: UsageFileUploadJobListParams,
        requestOptions: RequestOptions,
    ): UsageFileUploadJobListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "fileuploads",
                    "measurements",
                    "jobs",
                )
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
            .let { UsageFileUploadJobListPage.of(this, params, it) }
    }

    private val getOriginalDownloadUrlHandler:
        Handler<UsageFileUploadJobGetOriginalDownloadUrlResponse> =
        jsonHandler<UsageFileUploadJobGetOriginalDownloadUrlResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Use the original file upload job id to obtain a download URL, which you can then use to
     * retrieve the file you originally uploaded to the file upload service:
     * - A download URL is returned together with a download job id.
     * - You can then use a `GET` using the returned download URL as the endpoint to retrieve the
     *   file you originally uploaded.
     *
     * Part of the file upload service for submitting measurements data files.
     */
    override fun getOriginalDownloadUrl(
        params: UsageFileUploadJobGetOriginalDownloadUrlParams,
        requestOptions: RequestOptions,
    ): UsageFileUploadJobGetOriginalDownloadUrlResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "fileuploads",
                    "measurements",
                    "jobs",
                    params.getPathParam(1),
                    "original",
                )
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { getOriginalDownloadUrlHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }
}
