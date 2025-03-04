// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

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
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.AdhocExport
import com.m3ter.sdk.models.DataExportCreateAdhocParams
import com.m3ter.sdk.services.blocking.dataExports.DestinationService
import com.m3ter.sdk.services.blocking.dataExports.DestinationServiceImpl
import com.m3ter.sdk.services.blocking.dataExports.JobService
import com.m3ter.sdk.services.blocking.dataExports.JobServiceImpl
import com.m3ter.sdk.services.blocking.dataExports.ScheduleService
import com.m3ter.sdk.services.blocking.dataExports.ScheduleServiceImpl

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
    ): AdhocExport =
        // post /organizations/{orgId}/dataexports/adhoc
        withRawResponse().createAdhoc(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DataExportService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

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

        private val createAdhocHandler: Handler<AdhocExport> =
            jsonHandler<AdhocExport>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun createAdhoc(
            params: DataExportCreateAdhocParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AdhocExport> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "dataexports",
                        "adhoc",
                    )
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
