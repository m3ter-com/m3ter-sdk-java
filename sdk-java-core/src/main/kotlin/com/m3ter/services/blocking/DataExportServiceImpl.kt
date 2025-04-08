// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

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
import com.m3ter.models.AdHocResponse
import com.m3ter.models.DataExportCreateAdhocParams
import com.m3ter.services.blocking.dataExports.DestinationService
import com.m3ter.services.blocking.dataExports.DestinationServiceImpl
import com.m3ter.services.blocking.dataExports.JobService
import com.m3ter.services.blocking.dataExports.JobServiceImpl
import com.m3ter.services.blocking.dataExports.ScheduleService
import com.m3ter.services.blocking.dataExports.ScheduleServiceImpl

class DataExportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DataExportService {

    private val withRawResponse: DataExportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val destinations: DestinationService by lazy { DestinationServiceImpl(clientOptions) }

    private val jobs: JobService by lazy { JobServiceImpl(clientOptions) }

    private val schedules: ScheduleService by lazy { ScheduleServiceImpl(clientOptions) }

    override fun withRawResponse(): DataExportService.WithRawResponse = withRawResponse

    override fun destinations(): DestinationService = destinations

    override fun jobs(): JobService = jobs

    override fun schedules(): ScheduleService = schedules

    override fun createAdhoc(
        params: DataExportCreateAdhocParams,
        requestOptions: RequestOptions,
    ): AdHocResponse =
        // post /organizations/{orgId}/dataexports/adhoc
        withRawResponse().createAdhoc(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataExportService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val destinations: DestinationService.WithRawResponse by lazy {
            DestinationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val jobs: JobService.WithRawResponse by lazy {
            JobServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val schedules: ScheduleService.WithRawResponse by lazy {
            ScheduleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun destinations(): DestinationService.WithRawResponse = destinations

        override fun jobs(): JobService.WithRawResponse = jobs

        override fun schedules(): ScheduleService.WithRawResponse = schedules

        private val createAdhocHandler: Handler<AdHocResponse> =
            jsonHandler<AdHocResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createAdhoc(
            params: DataExportCreateAdhocParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdHocResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params._pathParam(0), "dataexports", "adhoc")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
