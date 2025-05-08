// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.dataExports

import com.m3ter.core.ClientOptions
import com.m3ter.core.JsonValue
import com.m3ter.core.RequestOptions
import com.m3ter.core.checkRequired
import com.m3ter.core.handlers.errorHandler
import com.m3ter.core.handlers.jsonHandler
import com.m3ter.core.handlers.withErrorHandler
import com.m3ter.core.http.HttpMethod
import com.m3ter.core.http.HttpRequest
import com.m3ter.core.http.HttpResponse.Handler
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.core.http.parseable
import com.m3ter.core.prepare
import com.m3ter.models.DataExportJobGetDownloadUrlParams
import com.m3ter.models.DataExportJobGetDownloadUrlResponse
import com.m3ter.models.DataExportJobListPage
import com.m3ter.models.DataExportJobListPageResponse
import com.m3ter.models.DataExportJobListParams
import com.m3ter.models.DataExportJobResponse
import com.m3ter.models.DataExportJobRetrieveParams
import kotlin.jvm.optionals.getOrNull

class JobServiceImpl internal constructor(private val clientOptions: ClientOptions) : JobService {

    private val withRawResponse: JobService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): JobService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: DataExportJobRetrieveParams,
        requestOptions: RequestOptions,
    ): DataExportJobResponse =
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

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<DataExportJobResponse> =
            jsonHandler<DataExportJobResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: DataExportJobRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportJobResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
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

        private val listHandler: Handler<DataExportJobListPageResponse> =
            jsonHandler<DataExportJobListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DataExportJobListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportJobListPage> {
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
                    .let {
                        DataExportJobListPage.builder()
                            .service(JobServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getDownloadUrlHandler: Handler<DataExportJobGetDownloadUrlResponse> =
            jsonHandler<DataExportJobGetDownloadUrlResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getDownloadUrl(
            params: DataExportJobGetDownloadUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportJobGetDownloadUrlResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("jobId", params.jobId().getOrNull())
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
