// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.handlers.errorHandler
import com.m3ter.sdk.core.handlers.jsonHandler
import com.m3ter.sdk.core.handlers.withErrorHandler
import com.m3ter.sdk.core.http.HttpMethod
import com.m3ter.sdk.core.http.HttpRequest
import com.m3ter.sdk.core.http.HttpResponse.Handler
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.core.http.json
import com.m3ter.sdk.core.http.parseable
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.AdHocResponse
import com.m3ter.sdk.models.DataExportCreateAdhocParams
import com.m3ter.sdk.services.async.dataExports.DestinationServiceAsync
import com.m3ter.sdk.services.async.dataExports.DestinationServiceAsyncImpl
import com.m3ter.sdk.services.async.dataExports.JobServiceAsync
import com.m3ter.sdk.services.async.dataExports.JobServiceAsyncImpl
import com.m3ter.sdk.services.async.dataExports.ScheduleServiceAsync
import com.m3ter.sdk.services.async.dataExports.ScheduleServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class DataExportServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DataExportServiceAsync {

    private val withRawResponse: DataExportServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val destinations: DestinationServiceAsync by lazy {
        DestinationServiceAsyncImpl(clientOptions)
    }

    private val jobs: JobServiceAsync by lazy { JobServiceAsyncImpl(clientOptions) }

    private val schedules: ScheduleServiceAsync by lazy { ScheduleServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): DataExportServiceAsync.WithRawResponse = withRawResponse

    override fun destinations(): DestinationServiceAsync = destinations

    override fun jobs(): JobServiceAsync = jobs

    override fun schedules(): ScheduleServiceAsync = schedules

    override fun createAdhoc(
        params: DataExportCreateAdhocParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AdHocResponse> =
        // post /organizations/{orgId}/dataexports/adhoc
        withRawResponse().createAdhoc(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataExportServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val destinations: DestinationServiceAsync.WithRawResponse by lazy {
            DestinationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val jobs: JobServiceAsync.WithRawResponse by lazy {
            JobServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val schedules: ScheduleServiceAsync.WithRawResponse by lazy {
            ScheduleServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun destinations(): DestinationServiceAsync.WithRawResponse = destinations

        override fun jobs(): JobServiceAsync.WithRawResponse = jobs

        override fun schedules(): ScheduleServiceAsync.WithRawResponse = schedules

        private val createAdhocHandler: Handler<AdHocResponse> =
            jsonHandler<AdHocResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createAdhoc(
            params: DataExportCreateAdhocParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AdHocResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params._pathParam(0), "dataexports", "adhoc")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createAdhocHandler.handle(it) }
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
