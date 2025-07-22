// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.handlers.errorBodyHandler
import com.m3ter.core.handlers.errorHandler
import com.m3ter.core.handlers.jsonHandler
import com.m3ter.core.http.HttpMethod
import com.m3ter.core.http.HttpRequest
import com.m3ter.core.http.HttpResponse
import com.m3ter.core.http.HttpResponse.Handler
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.core.http.json
import com.m3ter.core.http.parseable
import com.m3ter.core.prepare
import com.m3ter.models.DownloadUrlResponse
import com.m3ter.models.SubmitMeasurementsResponse
import com.m3ter.models.UsageGetFailedIngestDownloadUrlParams
import com.m3ter.models.UsageQueryParams
import com.m3ter.models.UsageQueryResponse
import com.m3ter.models.UsageSubmitParams
import com.m3ter.services.blocking.usage.FileUploadService
import com.m3ter.services.blocking.usage.FileUploadServiceImpl
import java.util.function.Consumer

class UsageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    UsageService {

    private val withRawResponse: UsageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val fileUploads: FileUploadService by lazy { FileUploadServiceImpl(clientOptions) }

    override fun withRawResponse(): UsageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageService =
        UsageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun fileUploads(): FileUploadService = fileUploads

    override fun getFailedIngestDownloadUrl(
        params: UsageGetFailedIngestDownloadUrlParams,
        requestOptions: RequestOptions,
    ): DownloadUrlResponse =
        // get /organizations/{orgId}/measurements/failedIngest/getDownloadUrl
        withRawResponse().getFailedIngestDownloadUrl(params, requestOptions).parse()

    override fun query(
        params: UsageQueryParams,
        requestOptions: RequestOptions,
    ): UsageQueryResponse =
        // post /organizations/{orgId}/usage/query
        withRawResponse().query(params, requestOptions).parse()

    override fun submit(
        params: UsageSubmitParams,
        requestOptions: RequestOptions,
    ): SubmitMeasurementsResponse =
        // post /organizations/{orgId}/measurements
        withRawResponse().submit(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val fileUploads: FileUploadService.WithRawResponse by lazy {
            FileUploadServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UsageService.WithRawResponse =
            UsageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun fileUploads(): FileUploadService.WithRawResponse = fileUploads

        private val getFailedIngestDownloadUrlHandler: Handler<DownloadUrlResponse> =
            jsonHandler<DownloadUrlResponse>(clientOptions.jsonMapper)

        override fun getFailedIngestDownloadUrl(
            params: UsageGetFailedIngestDownloadUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DownloadUrlResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "measurements",
                        "failedIngest",
                        "getDownloadUrl",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getFailedIngestDownloadUrlHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val queryHandler: Handler<UsageQueryResponse> =
            jsonHandler<UsageQueryResponse>(clientOptions.jsonMapper)

        override fun query(
            params: UsageQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageQueryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "usage",
                        "query",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { queryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val submitHandler: Handler<SubmitMeasurementsResponse> =
            jsonHandler<SubmitMeasurementsResponse>(clientOptions.jsonMapper)

        override fun submit(
            params: UsageSubmitParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubmitMeasurementsResponse> {
            var ingestUrl = clientOptions.baseUrl()
            if (!ingestUrl.startsWith("http://localhost")) {
                ingestUrl = ingestUrl.replace("api.", "ingest.")
            }

            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(ingestUrl)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "measurements",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { submitHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
