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
import com.m3ter.sdk.models.Meter
import com.m3ter.sdk.models.MeterCreateParams
import com.m3ter.sdk.models.MeterDeleteParams
import com.m3ter.sdk.models.MeterListPage
import com.m3ter.sdk.models.MeterListParams
import com.m3ter.sdk.models.MeterRetrieveParams
import com.m3ter.sdk.models.MeterUpdateParams

class MeterServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MeterService {

    private val withRawResponse: MeterService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MeterService.WithRawResponse = withRawResponse

    override fun create(params: MeterCreateParams, requestOptions: RequestOptions): Meter =
        // post /organizations/{orgId}/meters
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: MeterRetrieveParams, requestOptions: RequestOptions): Meter =
        // get /organizations/{orgId}/meters/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: MeterUpdateParams, requestOptions: RequestOptions): Meter =
        // put /organizations/{orgId}/meters/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: MeterListParams, requestOptions: RequestOptions): MeterListPage =
        // get /organizations/{orgId}/meters
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: MeterDeleteParams, requestOptions: RequestOptions): Meter =
        // delete /organizations/{orgId}/meters/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeterService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Meter> =
            jsonHandler<Meter>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: MeterCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Meter> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "meters")
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

        private val retrieveHandler: Handler<Meter> =
            jsonHandler<Meter>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: MeterRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Meter> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "meters",
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

        private val updateHandler: Handler<Meter> =
            jsonHandler<Meter>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: MeterUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Meter> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "meters",
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

        private val listHandler: Handler<MeterListPage.Response> =
            jsonHandler<MeterListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: MeterListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeterListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "meters")
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
                    .let { MeterListPage.of(MeterServiceImpl(clientOptions), params, it) }
            }
        }

        private val deleteHandler: Handler<Meter> =
            jsonHandler<Meter>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: MeterDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Meter> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "meters",
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
