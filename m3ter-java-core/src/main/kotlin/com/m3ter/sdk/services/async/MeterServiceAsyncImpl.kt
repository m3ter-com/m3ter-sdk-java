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
import com.m3ter.sdk.models.Meter
import com.m3ter.sdk.models.MeterCreateParams
import com.m3ter.sdk.models.MeterDeleteParams
import com.m3ter.sdk.models.MeterListPageAsync
import com.m3ter.sdk.models.MeterListParams
import com.m3ter.sdk.models.MeterRetrieveParams
import com.m3ter.sdk.models.MeterUpdateParams
import java.util.concurrent.CompletableFuture

class MeterServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MeterServiceAsync {

    private val withRawResponse: MeterServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MeterServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: MeterCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Meter> =
        // post /organizations/{orgId}/meters
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: MeterRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Meter> =
        // get /organizations/{orgId}/meters/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: MeterUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Meter> =
        // put /organizations/{orgId}/meters/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: MeterListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MeterListPageAsync> =
        // get /organizations/{orgId}/meters
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: MeterDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Meter> =
        // delete /organizations/{orgId}/meters/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MeterServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Meter> =
            jsonHandler<Meter>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: MeterCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Meter>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "meters")
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

        private val retrieveHandler: Handler<Meter> =
            jsonHandler<Meter>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: MeterRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Meter>> {
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

        private val updateHandler: Handler<Meter> =
            jsonHandler<Meter>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: MeterUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Meter>> {
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

        private val listHandler: Handler<MeterListPageAsync.Response> =
            jsonHandler<MeterListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: MeterListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MeterListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "meters")
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
                                MeterListPageAsync.of(
                                    MeterServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Meter> =
            jsonHandler<Meter>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: MeterDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Meter>> {
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
