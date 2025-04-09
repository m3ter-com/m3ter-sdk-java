// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.dataExports

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
import com.m3ter.models.DataExportScheduleCreateParams
import com.m3ter.models.DataExportScheduleCreateResponse
import com.m3ter.models.DataExportScheduleDeleteParams
import com.m3ter.models.DataExportScheduleDeleteResponse
import com.m3ter.models.DataExportScheduleListPage
import com.m3ter.models.DataExportScheduleListPageResponse
import com.m3ter.models.DataExportScheduleListParams
import com.m3ter.models.DataExportScheduleRetrieveParams
import com.m3ter.models.DataExportScheduleRetrieveResponse
import com.m3ter.models.DataExportScheduleUpdateParams
import com.m3ter.models.DataExportScheduleUpdateResponse

class ScheduleServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ScheduleService {

    private val withRawResponse: ScheduleService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ScheduleService.WithRawResponse = withRawResponse

    override fun create(
        params: DataExportScheduleCreateParams,
        requestOptions: RequestOptions,
    ): DataExportScheduleCreateResponse =
        // post /organizations/{orgId}/dataexports/schedules
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: DataExportScheduleRetrieveParams,
        requestOptions: RequestOptions,
    ): DataExportScheduleRetrieveResponse =
        // get /organizations/{orgId}/dataexports/schedules/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: DataExportScheduleUpdateParams,
        requestOptions: RequestOptions,
    ): DataExportScheduleUpdateResponse =
        // put /organizations/{orgId}/dataexports/schedules/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: DataExportScheduleListParams,
        requestOptions: RequestOptions,
    ): DataExportScheduleListPage =
        // get /organizations/{orgId}/dataexports/schedules
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: DataExportScheduleDeleteParams,
        requestOptions: RequestOptions,
    ): DataExportScheduleDeleteResponse =
        // delete /organizations/{orgId}/dataexports/schedules/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ScheduleService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<DataExportScheduleCreateResponse> =
            jsonHandler<DataExportScheduleCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: DataExportScheduleCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportScheduleCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "dataexports",
                        "schedules",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<DataExportScheduleRetrieveResponse> =
            jsonHandler<DataExportScheduleRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: DataExportScheduleRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportScheduleRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "dataexports",
                        "schedules",
                        params._pathParam(1),
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

        private val updateHandler: Handler<DataExportScheduleUpdateResponse> =
            jsonHandler<DataExportScheduleUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: DataExportScheduleUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportScheduleUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "dataexports",
                        "schedules",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<DataExportScheduleListPageResponse> =
            jsonHandler<DataExportScheduleListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DataExportScheduleListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportScheduleListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "dataexports",
                        "schedules",
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
                        DataExportScheduleListPage.builder()
                            .service(ScheduleServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<DataExportScheduleDeleteResponse> =
            jsonHandler<DataExportScheduleDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: DataExportScheduleDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportScheduleDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "dataexports",
                        "schedules",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
