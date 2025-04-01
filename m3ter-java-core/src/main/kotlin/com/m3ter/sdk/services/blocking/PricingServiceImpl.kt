// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.JsonValue
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
import com.m3ter.sdk.models.PricingCreateParams
import com.m3ter.sdk.models.PricingDeleteParams
import com.m3ter.sdk.models.PricingListPage
import com.m3ter.sdk.models.PricingListParams
import com.m3ter.sdk.models.PricingResponse
import com.m3ter.sdk.models.PricingRetrieveParams
import com.m3ter.sdk.models.PricingUpdateParams

class PricingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PricingService {

    private val withRawResponse: PricingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PricingService.WithRawResponse = withRawResponse

    override fun create(
        params: PricingCreateParams,
        requestOptions: RequestOptions,
    ): PricingResponse =
        // post /organizations/{orgId}/pricings
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PricingRetrieveParams,
        requestOptions: RequestOptions,
    ): PricingResponse =
        // get /organizations/{orgId}/pricings/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PricingUpdateParams,
        requestOptions: RequestOptions,
    ): PricingResponse =
        // put /organizations/{orgId}/pricings/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: PricingListParams, requestOptions: RequestOptions): PricingListPage =
        // get /organizations/{orgId}/pricings
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: PricingDeleteParams,
        requestOptions: RequestOptions,
    ): PricingResponse =
        // delete /organizations/{orgId}/pricings/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PricingService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PricingResponse> =
            jsonHandler<PricingResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: PricingCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PricingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params._pathParam(0), "pricings")
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

        private val retrieveHandler: Handler<PricingResponse> =
            jsonHandler<PricingResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PricingRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PricingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "pricings",
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

        private val updateHandler: Handler<PricingResponse> =
            jsonHandler<PricingResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: PricingUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PricingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "pricings",
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

        private val listHandler: Handler<PricingListPage.Response> =
            jsonHandler<PricingListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PricingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PricingListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params._pathParam(0), "pricings")
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
                    .let { PricingListPage.of(PricingServiceImpl(clientOptions), params, it) }
            }
        }

        private val deleteHandler: Handler<PricingResponse> =
            jsonHandler<PricingResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: PricingDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PricingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "pricings",
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
