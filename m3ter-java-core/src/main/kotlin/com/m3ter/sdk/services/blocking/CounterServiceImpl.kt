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
import com.m3ter.sdk.models.CounterCreateParams
import com.m3ter.sdk.models.CounterDeleteParams
import com.m3ter.sdk.models.CounterListPage
import com.m3ter.sdk.models.CounterListParams
import com.m3ter.sdk.models.CounterResponse
import com.m3ter.sdk.models.CounterRetrieveParams
import com.m3ter.sdk.models.CounterUpdateParams

class CounterServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CounterService {

    private val withRawResponse: CounterService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CounterService.WithRawResponse = withRawResponse

    override fun create(
        params: CounterCreateParams,
        requestOptions: RequestOptions,
    ): CounterResponse =
        // post /organizations/{orgId}/counters
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CounterRetrieveParams,
        requestOptions: RequestOptions,
    ): CounterResponse =
        // get /organizations/{orgId}/counters/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CounterUpdateParams,
        requestOptions: RequestOptions,
    ): CounterResponse =
        // put /organizations/{orgId}/counters/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: CounterListParams, requestOptions: RequestOptions): CounterListPage =
        // get /organizations/{orgId}/counters
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: CounterDeleteParams,
        requestOptions: RequestOptions,
    ): CounterResponse =
        // delete /organizations/{orgId}/counters/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CounterService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CounterResponse> =
            jsonHandler<CounterResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CounterCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params._pathParam(0), "counters")
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

        private val retrieveHandler: Handler<CounterResponse> =
            jsonHandler<CounterResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: CounterRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "counters",
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

        private val updateHandler: Handler<CounterResponse> =
            jsonHandler<CounterResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: CounterUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "counters",
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

        private val listHandler: Handler<CounterListPage.Response> =
            jsonHandler<CounterListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CounterListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params._pathParam(0), "counters")
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
                    .let { CounterListPage.of(CounterServiceImpl(clientOptions), params, it) }
            }
        }

        private val deleteHandler: Handler<CounterResponse> =
            jsonHandler<CounterResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: CounterDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "counters",
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
