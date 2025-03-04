// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking.usage

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.handlers.errorHandler
import com.m3ter.sdk.core.handlers.jsonHandler
import com.m3ter.sdk.core.handlers.withErrorHandler
import com.m3ter.sdk.core.http.HttpMethod
import com.m3ter.sdk.core.http.HttpRequest
import com.m3ter.sdk.core.http.HttpResponse.Handler
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.UsageFileUploadGenerateUploadUrlParams
import com.m3ter.sdk.models.UsageFileUploadGenerateUploadUrlResponse
import com.m3ter.sdk.services.blocking.usage.fileUploads.JobService
import com.m3ter.sdk.services.blocking.usage.fileUploads.JobServiceImpl

class FileUploadServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FileUploadService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val jobs: JobService by lazy { JobServiceImpl(clientOptions) }

    override fun jobs(): JobService = jobs

    private val generateUploadUrlHandler: Handler<UsageFileUploadGenerateUploadUrlResponse> =
        jsonHandler<UsageFileUploadGenerateUploadUrlResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Generate a URL for uploading a file containing measurements to the platform in preparation
     * for the measurements it contains to be ingested:
     * - An upload URL is returned together with an upload job id:
     * - You can then upload your data measurements file using a `PUT` request using the returned
     *   upload URL as the endpoint.
     * - You can use the returned upload job id with other calls to the File Upload Service for any
     *   follow-up or troubleshooting.
     *
     * **Important:**
     * - The `contentLength` request parameter is required.
     * - The upload URL is time limited - it is valid for **_one_** minute.
     *
     * Part of the file upload service for submitting measurements data files.
     */
    override fun generateUploadUrl(
        params: UsageFileUploadGenerateUploadUrlParams,
        requestOptions: RequestOptions,
    ): UsageFileUploadGenerateUploadUrlResponse {
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
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { generateUploadUrlHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
