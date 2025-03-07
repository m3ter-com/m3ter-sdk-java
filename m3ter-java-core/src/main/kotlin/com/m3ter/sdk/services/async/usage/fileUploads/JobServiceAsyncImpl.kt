// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async.usage.fileUploads

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
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.FileUploadJobResponse
import com.m3ter.sdk.models.UsageFileUploadJobGetOriginalDownloadUrlParams
import com.m3ter.sdk.models.UsageFileUploadJobGetOriginalDownloadUrlResponse
import com.m3ter.sdk.models.UsageFileUploadJobListPageAsync
import com.m3ter.sdk.models.UsageFileUploadJobListParams
import com.m3ter.sdk.models.UsageFileUploadJobRetrieveParams
import java.util.concurrent.CompletableFuture

class JobServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    JobServiceAsync {

    private val withRawResponse: JobServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): JobServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(
        params: UsageFileUploadJobRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileUploadJobResponse> =
        // get /organizations/{orgId}/fileuploads/measurements/jobs/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: UsageFileUploadJobListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageFileUploadJobListPageAsync> =
        // get /organizations/{orgId}/fileuploads/measurements/jobs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun getOriginalDownloadUrl(
        params: UsageFileUploadJobGetOriginalDownloadUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageFileUploadJobGetOriginalDownloadUrlResponse> =
        // get /organizations/{orgId}/fileuploads/measurements/jobs/{id}/original
        withRawResponse().getOriginalDownloadUrl(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        JobServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<FileUploadJobResponse> =
            jsonHandler<FileUploadJobResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: UsageFileUploadJobRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileUploadJobResponse>> {
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

        private val listHandler: Handler<UsageFileUploadJobListPageAsync.Response> =
            jsonHandler<UsageFileUploadJobListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: UsageFileUploadJobListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageFileUploadJobListPageAsync>> {
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
                                UsageFileUploadJobListPageAsync.of(
                                    JobServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
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
        ): CompletableFuture<HttpResponseFor<UsageFileUploadJobGetOriginalDownloadUrlResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
}
