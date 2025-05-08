// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.core.ClientOptions
import com.m3ter.core.JsonValue
import com.m3ter.core.RequestOptions
import com.m3ter.core.checkRequired
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
import com.m3ter.models.MeterCreateParams
import com.m3ter.models.MeterDeleteParams
import com.m3ter.models.MeterListPage
import com.m3ter.models.MeterListPageResponse
import com.m3ter.models.MeterListParams
import com.m3ter.models.MeterResponse
import com.m3ter.models.MeterRetrieveParams
import com.m3ter.models.MeterUpdateParams
import kotlin.jvm.optionals.getOrNull

class MeterServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MeterService {

    private val withRawResponse: MeterService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MeterService.WithRawResponse = withRawResponse

    override fun create(params: MeterCreateParams, requestOptions: RequestOptions): MeterResponse =
        // post /organizations/{orgId}/meters
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: MeterRetrieveParams,
        requestOptions: RequestOptions,
    ): MeterResponse =
        // get /organizations/{orgId}/meters/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: MeterUpdateParams, requestOptions: RequestOptions): MeterResponse =
        // put /organizations/{orgId}/meters/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: MeterListParams, requestOptions: RequestOptions): MeterListPage =
        // get /organizations/{orgId}/meters
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: MeterDeleteParams, requestOptions: RequestOptions): MeterResponse =
        // delete /organizations/{orgId}/meters/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeterService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<MeterResponse> =
            jsonHandler<MeterResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: MeterCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeterResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "meters",
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

        private val retrieveHandler: Handler<MeterResponse> =
            jsonHandler<MeterResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: MeterRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeterResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "meters",
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

        private val updateHandler: Handler<MeterResponse> =
            jsonHandler<MeterResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: MeterUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeterResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "meters",
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

        private val listHandler: Handler<MeterListPageResponse> =
            jsonHandler<MeterListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: MeterListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeterListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "meters",
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
                        MeterListPage.builder()
                            .service(MeterServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<MeterResponse> =
            jsonHandler<MeterResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: MeterDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MeterResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "meters",
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
