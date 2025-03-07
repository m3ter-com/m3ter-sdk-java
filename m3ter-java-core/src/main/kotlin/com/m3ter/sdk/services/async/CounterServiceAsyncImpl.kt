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
import com.m3ter.sdk.models.CounterCreateParams
import com.m3ter.sdk.models.CounterDeleteParams
import com.m3ter.sdk.models.CounterListPageAsync
import com.m3ter.sdk.models.CounterListParams
import com.m3ter.sdk.models.CounterResponse
import com.m3ter.sdk.models.CounterRetrieveParams
import com.m3ter.sdk.models.CounterUpdateParams
import java.util.concurrent.CompletableFuture

class CounterServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CounterServiceAsync {

    private val withRawResponse: CounterServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CounterServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: CounterCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CounterResponse> =
        // post /organizations/{orgId}/counters
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CounterRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CounterResponse> =
        // get /organizations/{orgId}/counters/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CounterUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CounterResponse> =
        // put /organizations/{orgId}/counters/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CounterListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CounterListPageAsync> =
        // get /organizations/{orgId}/counters
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CounterDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CounterResponse> =
        // delete /organizations/{orgId}/counters/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CounterServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CounterResponse> =
            jsonHandler<CounterResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CounterCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CounterResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "counters")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<CounterResponse> =
            jsonHandler<CounterResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: CounterRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CounterResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "counters",
                        params.getPathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<CounterResponse> =
            jsonHandler<CounterResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: CounterUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CounterResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "counters",
                        params.getPathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<CounterListPageAsync.Response> =
            jsonHandler<CounterListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CounterListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CounterListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "counters")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                CounterListPageAsync.of(
                                    CounterServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<CounterResponse> =
            jsonHandler<CounterResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: CounterDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CounterResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "counters",
                        params.getPathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
}
