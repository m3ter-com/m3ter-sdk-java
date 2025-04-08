// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.usage

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
import com.m3ter.core.prepare
import com.m3ter.models.UsageFileUploadGenerateUploadUrlParams
import com.m3ter.models.UsageFileUploadGenerateUploadUrlResponse
import com.m3ter.services.blocking.usage.fileUploads.JobService
import com.m3ter.services.blocking.usage.fileUploads.JobServiceImpl

class FileUploadServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FileUploadService {

    private val withRawResponse: FileUploadService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val jobs: JobService by lazy { JobServiceImpl(clientOptions) }

    override fun withRawResponse(): FileUploadService.WithRawResponse = withRawResponse

    override fun jobs(): JobService = jobs

    override fun generateUploadUrl(
        params: UsageFileUploadGenerateUploadUrlParams,
        requestOptions: RequestOptions,
    ): UsageFileUploadGenerateUploadUrlResponse =
        // post /organizations/{orgId}/fileuploads/measurements/generateUploadUrl
        withRawResponse().generateUploadUrl(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileUploadService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val jobs: JobService.WithRawResponse by lazy {
            JobServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun jobs(): JobService.WithRawResponse = jobs

        private val generateUploadUrlHandler: Handler<UsageFileUploadGenerateUploadUrlResponse> =
            jsonHandler<UsageFileUploadGenerateUploadUrlResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun generateUploadUrl(
            params: UsageFileUploadGenerateUploadUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UsageFileUploadGenerateUploadUrlResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "fileuploads",
                        "measurements",
                        "generateUploadUrl",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
