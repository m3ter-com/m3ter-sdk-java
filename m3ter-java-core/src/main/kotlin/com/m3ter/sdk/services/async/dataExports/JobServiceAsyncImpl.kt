// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async.dataExports

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.handlers.errorHandler
import com.m3ter.sdk.core.handlers.jsonHandler
import com.m3ter.sdk.core.handlers.withErrorHandler
import com.m3ter.sdk.core.http.HttpMethod
import com.m3ter.sdk.core.http.HttpRequest
import com.m3ter.sdk.core.http.HttpResponse.Handler
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.DataExportJob
import com.m3ter.sdk.models.DataExportJobGetDownloadUrlParams
import com.m3ter.sdk.models.DataExportJobGetDownloadUrlResponse
import com.m3ter.sdk.models.DataExportJobListPageAsync
import com.m3ter.sdk.models.DataExportJobListParams
import com.m3ter.sdk.models.DataExportJobRetrieveParams
import java.util.concurrent.CompletableFuture

class JobServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    JobServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<DataExportJob> =
        jsonHandler<DataExportJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve an Export Job for the given UUID.
     *
     * The response returns:
     * - The source type for the data exported by the Export Job: one of USAGE or OPERATIONAL.
     * - The status of the Export Job.
     */
    override fun retrieve(
        params: DataExportJobRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportJob> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "dataexports",
                    "jobs",
                    params.getPathParam(1),
                )
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<DataExportJobListPageAsync.Response> =
        jsonHandler<DataExportJobListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a list of Export Job entities. */
    override fun list(
        params: DataExportJobListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportJobListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "dataexports", "jobs")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { DataExportJobListPageAsync.of(this, params, it) }
            }
    }

    private val getDownloadUrlHandler: Handler<DataExportJobGetDownloadUrlResponse> =
        jsonHandler<DataExportJobGetDownloadUrlResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

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
    override fun getDownloadUrl(
        params: DataExportJobGetDownloadUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportJobGetDownloadUrlResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "dataexports",
                    "jobs",
                    params.getPathParam(1),
                    "getdownloadurl",
                )
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { getDownloadUrlHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
