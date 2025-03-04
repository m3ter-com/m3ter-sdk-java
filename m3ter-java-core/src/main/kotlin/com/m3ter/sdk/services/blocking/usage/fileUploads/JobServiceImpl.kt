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
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.core.http.parseable
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.FileUploadJob
import com.m3ter.sdk.models.UsageFileUploadJobGetOriginalDownloadUrlParams
import com.m3ter.sdk.models.UsageFileUploadJobGetOriginalDownloadUrlResponse
import com.m3ter.sdk.models.UsageFileUploadJobListPage
import com.m3ter.sdk.models.UsageFileUploadJobListParams
import com.m3ter.sdk.models.UsageFileUploadJobRetrieveParams

class JobServiceImpl internal constructor(private val clientOptions: ClientOptions) : JobService {

    private val withRawResponse: JobService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): JobService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: UsageFileUploadJobRetrieveParams,
        requestOptions: RequestOptions,
    ): FileUploadJob =
        // get /organizations/{orgId}/fileuploads/measurements/jobs/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: UsageFileUploadJobListParams,
        requestOptions: RequestOptions,
    ): UsageFileUploadJobListPage =
        // get /organizations/{orgId}/fileuploads/measurements/jobs
        withRawResponse().list(params, requestOptions).parse()

    override fun getOriginalDownloadUrl(
        params: UsageFileUploadJobGetOriginalDownloadUrlParams,
        requestOptions: RequestOptions,
    ): UsageFileUploadJobGetOriginalDownloadUrlResponse =
        // get /organizations/{orgId}/fileuploads/measurements/jobs/{id}/original
        withRawResponse().getOriginalDownloadUrl(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JobService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<FileUploadJob> =
            jsonHandler<FileUploadJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: UsageFileUploadJobRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileUploadJob> {
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

        private val listHandler: Handler<UsageFileUploadJobListPage.Response> =
            jsonHandler<UsageFileUploadJobListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: UsageFileUploadJobListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageFileUploadJobListPage> {
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
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        UsageFileUploadJobListPage.of(JobServiceImpl(clientOptions), params, it)
                    }
            }
        }

        private val getOriginalDownloadUrlHandler:
            Handler<UsageFileUploadJobGetOriginalDownloadUrlResponse> =
            jsonHandler<UsageFileUploadJobGetOriginalDownloadUrlResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getOriginalDownloadUrl(
            params: UsageFileUploadJobGetOriginalDownloadUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageFileUploadJobGetOriginalDownloadUrlResponse> {
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
            return response.parseable {
                response
                    .use { getOriginalDownloadUrlHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
