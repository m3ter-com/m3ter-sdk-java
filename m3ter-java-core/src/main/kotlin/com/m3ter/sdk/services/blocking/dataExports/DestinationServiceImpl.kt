// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking.dataExports

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
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.DataExportDestinationCreateParams
import com.m3ter.sdk.models.DataExportDestinationCreateResponse
import com.m3ter.sdk.models.DataExportDestinationDeleteParams
import com.m3ter.sdk.models.DataExportDestinationDeleteResponse
import com.m3ter.sdk.models.DataExportDestinationListPage
import com.m3ter.sdk.models.DataExportDestinationListParams
import com.m3ter.sdk.models.DataExportDestinationRetrieveParams
import com.m3ter.sdk.models.DataExportDestinationRetrieveResponse
import com.m3ter.sdk.models.DataExportDestinationUpdateParams
import com.m3ter.sdk.models.DataExportDestinationUpdateResponse

class DestinationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DestinationService {

    private val withRawResponse: DestinationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DestinationService.WithRawResponse = withRawResponse

    override fun create(
        params: DataExportDestinationCreateParams,
        requestOptions: RequestOptions,
    ): DataExportDestinationCreateResponse =
        // post /organizations/{orgId}/dataexports/destinations
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: DataExportDestinationRetrieveParams,
        requestOptions: RequestOptions,
    ): DataExportDestinationRetrieveResponse =
        // get /organizations/{orgId}/dataexports/destinations/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: DataExportDestinationUpdateParams,
        requestOptions: RequestOptions,
    ): DataExportDestinationUpdateResponse =
        // put /organizations/{orgId}/dataexports/destinations/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: DataExportDestinationListParams,
        requestOptions: RequestOptions,
    ): DataExportDestinationListPage =
        // get /organizations/{orgId}/dataexports/destinations
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: DataExportDestinationDeleteParams,
        requestOptions: RequestOptions,
    ): DataExportDestinationDeleteResponse =
        // delete /organizations/{orgId}/dataexports/destinations/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DestinationService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<DataExportDestinationCreateResponse> =
            jsonHandler<DataExportDestinationCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: DataExportDestinationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportDestinationCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "dataexports",
                        "destinations",
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

        private val retrieveHandler: Handler<DataExportDestinationRetrieveResponse> =
            jsonHandler<DataExportDestinationRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: DataExportDestinationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportDestinationRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "dataexports",
                        "destinations",
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

        private val updateHandler: Handler<DataExportDestinationUpdateResponse> =
            jsonHandler<DataExportDestinationUpdateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: DataExportDestinationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportDestinationUpdateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "dataexports",
                        "destinations",
                        params.getPathParam(1),
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

        private val listHandler: Handler<DataExportDestinationListPage.Response> =
            jsonHandler<DataExportDestinationListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DataExportDestinationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportDestinationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "dataexports",
                        "destinations",
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
                        DataExportDestinationListPage.of(
                            DestinationServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val deleteHandler: Handler<DataExportDestinationDeleteResponse> =
            jsonHandler<DataExportDestinationDeleteResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: DataExportDestinationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DataExportDestinationDeleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "dataexports",
                        "destinations",
                        params.getPathParam(1),
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
