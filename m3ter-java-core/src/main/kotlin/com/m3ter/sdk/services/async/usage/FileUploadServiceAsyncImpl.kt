// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async.usage

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
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.UsageFileUploadGenerateUploadUrlParams
import com.m3ter.sdk.models.UsageFileUploadGenerateUploadUrlResponse
import com.m3ter.sdk.services.async.usage.fileUploads.JobServiceAsync
import com.m3ter.sdk.services.async.usage.fileUploads.JobServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class FileUploadServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    FileUploadServiceAsync {

    private val withRawResponse: FileUploadServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val jobs: JobServiceAsync by lazy { JobServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): FileUploadServiceAsync.WithRawResponse = withRawResponse

    override fun jobs(): JobServiceAsync = jobs

    override fun generateUploadUrl(
        params: UsageFileUploadGenerateUploadUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UsageFileUploadGenerateUploadUrlResponse> =
        // post /organizations/{orgId}/fileuploads/measurements/generateUploadUrl
        withRawResponse().generateUploadUrl(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileUploadServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val jobs: JobServiceAsync.WithRawResponse by lazy {
            JobServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun jobs(): JobServiceAsync.WithRawResponse = jobs

        private val generateUploadUrlHandler: Handler<UsageFileUploadGenerateUploadUrlResponse> =
            jsonHandler<UsageFileUploadGenerateUploadUrlResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun generateUploadUrl(
            params: UsageFileUploadGenerateUploadUrlParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UsageFileUploadGenerateUploadUrlResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "fileuploads",
                        "measurements",
                        "generateUploadUrl",
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
                            .use { generateUploadUrlHandler.handle(it) }
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
