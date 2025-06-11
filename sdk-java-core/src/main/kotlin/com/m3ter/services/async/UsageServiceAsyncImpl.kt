// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

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
import com.m3ter.core.http.json
import com.m3ter.core.http.parseable
import com.m3ter.core.prepareAsync
import com.m3ter.models.DownloadUrlResponse
import com.m3ter.models.SubmitMeasurementsResponse
import com.m3ter.models.UsageGetFailedIngestDownloadUrlParams
import com.m3ter.models.UsageQueryParams
import com.m3ter.models.UsageQueryResponse
import com.m3ter.models.UsageSubmitParams
import com.m3ter.services.async.usage.FileUploadServiceAsync
import com.m3ter.services.async.usage.FileUploadServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class UsageServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UsageServiceAsync {

    private val withRawResponse: UsageServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val fileUploads: FileUploadServiceAsync by lazy {
        FileUploadServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): UsageServiceAsync.WithRawResponse = withRawResponse

    override fun fileUploads(): FileUploadServiceAsync = fileUploads

    override fun getFailedIngestDownloadUrl(
        params: UsageGetFailedIngestDownloadUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DownloadUrlResponse> =
        // get /organizations/{orgId}/measurements/failedIngest/getDownloadUrl
        withRawResponse().getFailedIngestDownloadUrl(params, requestOptions).thenApply {
            it.parse()
        }

    override fun query(
        params: UsageQueryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageQueryResponse> =
        // post /organizations/{orgId}/usage/query
        withRawResponse().query(params, requestOptions).thenApply { it.parse() }

    override fun submit(
        params: UsageSubmitParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SubmitMeasurementsResponse> =
        // post /organizations/{orgId}/measurements
        withRawResponse().submit(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UsageServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val fileUploads: FileUploadServiceAsync.WithRawResponse by lazy {
            FileUploadServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun fileUploads(): FileUploadServiceAsync.WithRawResponse = fileUploads

        private val getFailedIngestDownloadUrlHandler: Handler<DownloadUrlResponse> =
            jsonHandler<DownloadUrlResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getFailedIngestDownloadUrl(
            params: UsageGetFailedIngestDownloadUrlParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DownloadUrlResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { getFailedIngestDownloadUrlHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val queryHandler: Handler<UsageQueryResponse> =
            jsonHandler<UsageQueryResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun query(
            params: UsageQueryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageQueryResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { queryHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val submitHandler: Handler<SubmitMeasurementsResponse> =
            jsonHandler<SubmitMeasurementsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun submit(
            params: UsageSubmitParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SubmitMeasurementsResponse>> {
            var ingestUrl = clientOptions.baseUrl
            if (!ingestUrl.startsWith("http://localhost")) {
                ingestUrl = ingestUrl.replace("api.", "ingest.")
            }

            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(
                        if (clientOptions.baseUrlOverridden()) clientOptions.baseUrl()
                        else "https://ingest.m3ter.com"
                    )
                    .url(ingestUrl)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "measurements",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
}
