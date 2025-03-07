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
import com.m3ter.sdk.models.CounterPricingCreateParams
import com.m3ter.sdk.models.CounterPricingDeleteParams
import com.m3ter.sdk.models.CounterPricingListPage
import com.m3ter.sdk.models.CounterPricingListParams
import com.m3ter.sdk.models.CounterPricingResponse
import com.m3ter.sdk.models.CounterPricingRetrieveParams
import com.m3ter.sdk.models.CounterPricingUpdateParams

class CounterPricingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CounterPricingService {

    private val withRawResponse: CounterPricingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CounterPricingService.WithRawResponse = withRawResponse

    override fun create(
        params: CounterPricingCreateParams,
        requestOptions: RequestOptions,
    ): CounterPricingResponse =
        // post /organizations/{orgId}/counterpricings
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CounterPricingRetrieveParams,
        requestOptions: RequestOptions,
    ): CounterPricingResponse =
        // get /organizations/{orgId}/counterpricings/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CounterPricingUpdateParams,
        requestOptions: RequestOptions,
    ): CounterPricingResponse =
        // put /organizations/{orgId}/counterpricings/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CounterPricingListParams,
        requestOptions: RequestOptions,
    ): CounterPricingListPage =
        // get /organizations/{orgId}/counterpricings
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: CounterPricingDeleteParams,
        requestOptions: RequestOptions,
    ): CounterPricingResponse =
        // delete /organizations/{orgId}/counterpricings/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CounterPricingService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CounterPricingResponse> =
            jsonHandler<CounterPricingResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: CounterPricingCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterPricingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "counterpricings")
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

        private val retrieveHandler: Handler<CounterPricingResponse> =
            jsonHandler<CounterPricingResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: CounterPricingRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterPricingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "counterpricings",
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

        private val updateHandler: Handler<CounterPricingResponse> =
            jsonHandler<CounterPricingResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: CounterPricingUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterPricingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "counterpricings",
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

        private val listHandler: Handler<CounterPricingListPage.Response> =
            jsonHandler<CounterPricingListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CounterPricingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterPricingListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "counterpricings")
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
                        CounterPricingListPage.of(
                            CounterPricingServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val deleteHandler: Handler<CounterPricingResponse> =
            jsonHandler<CounterPricingResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: CounterPricingDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterPricingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "counterpricings",
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
