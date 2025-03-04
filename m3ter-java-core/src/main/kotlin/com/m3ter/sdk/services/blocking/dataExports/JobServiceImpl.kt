// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking.dataExports

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.handlers.errorHandler
import com.m3ter.sdk.core.handlers.jsonHandler
import com.m3ter.sdk.core.handlers.withErrorHandler
import com.m3ter.sdk.core.http.HttpMethod
import com.m3ter.sdk.core.http.HttpRequest
import com.m3ter.sdk.core.http.HttpResponse.Handler
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.core.http.parseable
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.DataExportJob
import com.m3ter.sdk.models.DataExportJobGetDownloadUrlParams
import com.m3ter.sdk.models.DataExportJobGetDownloadUrlResponse
import com.m3ter.sdk.models.DataExportJobListPage
import com.m3ter.sdk.models.DataExportJobListParams
import com.m3ter.sdk.models.DataExportJobRetrieveParams

class JobServiceImpl internal constructor(private val clientOptions: ClientOptions) : JobService {

    private val withRawResponse: JobService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): JobService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: DataExportJobRetrieveParams,
        requestOptions: RequestOptions,
    ): DataExportJob =
        // get /organizations/{orgId}/dataexports/jobs/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: DataExportJobListParams,
        requestOptions: RequestOptions,
    ): DataExportJobListPage =
        // get /organizations/{orgId}/dataexports/jobs
        withRawResponse().list(params, requestOptions).parse()

    override fun getDownloadUrl(
        params: DataExportJobGetDownloadUrlParams,
        requestOptions: RequestOptions,
    ): DataExportJobGetDownloadUrlResponse =
        // get /organizations/{orgId}/dataexports/jobs/{jobId}/getdownloadurl
        withRawResponse().getDownloadUrl(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JobService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<DataExportJob> =
            jsonHandler<DataExportJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: DataExportJobRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportJob> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<DataExportJobListPage.Response> =
            jsonHandler<DataExportJobListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DataExportJobListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportJobListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "dataexports", "jobs")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let { DataExportJobListPage.of(JobServiceImpl(clientOptions), params, it) }
            }
        }

        private val getDownloadUrlHandler: Handler<DataExportJobGetDownloadUrlResponse> =
            jsonHandler<DataExportJobGetDownloadUrlResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getDownloadUrl(
            params: DataExportJobGetDownloadUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportJobGetDownloadUrlResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
