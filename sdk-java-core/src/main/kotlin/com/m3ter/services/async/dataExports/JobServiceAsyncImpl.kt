// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.dataExports

import com.m3ter.core.ClientOptions
import com.m3ter.core.JsonValue
import com.m3ter.core.RequestOptions
import com.m3ter.core.handlers.errorHandler
import com.m3ter.core.handlers.jsonHandler
import com.m3ter.core.handlers.withErrorHandler
import com.m3ter.core.http.HttpMethod
import com.m3ter.core.http.HttpRequest
import com.m3ter.core.http.HttpResponse.Handler
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.core.http.parseable
import com.m3ter.core.prepareAsync
import com.m3ter.models.DataExportJobGetDownloadUrlParams
import com.m3ter.models.DataExportJobGetDownloadUrlResponse
import com.m3ter.models.DataExportJobListPageAsync
import com.m3ter.models.DataExportJobListPageResponse
import com.m3ter.models.DataExportJobListParams
import com.m3ter.models.DataExportJobResponse
import com.m3ter.models.DataExportJobRetrieveParams
import java.util.concurrent.CompletableFuture

class JobServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    JobServiceAsync {

    private val withRawResponse: JobServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): JobServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(
        params: DataExportJobRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportJobResponse> =
        // get /organizations/{orgId}/dataexports/jobs/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DataExportJobListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportJobListPageAsync> =
        // get /organizations/{orgId}/dataexports/jobs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun getDownloadUrl(
        params: DataExportJobGetDownloadUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportJobGetDownloadUrlResponse> =
        // get /organizations/{orgId}/dataexports/jobs/{jobId}/getdownloadurl
        withRawResponse().getDownloadUrl(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JobServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<DataExportJobResponse> =
            jsonHandler<DataExportJobResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: DataExportJobRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataExportJobResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "dataexports",
                        "jobs",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<DataExportJobListPageResponse> =
            jsonHandler<DataExportJobListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DataExportJobListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataExportJobListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "dataexports",
                        "jobs",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                DataExportJobListPageAsync.builder()
                                    .service(JobServiceAsyncImpl(clientOptions))
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val getDownloadUrlHandler: Handler<DataExportJobGetDownloadUrlResponse> =
            jsonHandler<DataExportJobGetDownloadUrlResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getDownloadUrl(
            params: DataExportJobGetDownloadUrlParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DataExportJobGetDownloadUrlResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "dataexports",
                        "jobs",
                        params._pathParam(1),
                        "getdownloadurl",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { getDownloadUrlHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
