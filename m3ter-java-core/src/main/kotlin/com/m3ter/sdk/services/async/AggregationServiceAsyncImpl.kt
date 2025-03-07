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
import com.m3ter.sdk.models.AggregationCreateParams
import com.m3ter.sdk.models.AggregationDeleteParams
import com.m3ter.sdk.models.AggregationListPageAsync
import com.m3ter.sdk.models.AggregationListParams
import com.m3ter.sdk.models.AggregationResponse
import com.m3ter.sdk.models.AggregationRetrieveParams
import com.m3ter.sdk.models.AggregationUpdateParams
import java.util.concurrent.CompletableFuture

class AggregationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AggregationServiceAsync {

    private val withRawResponse: AggregationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AggregationServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: AggregationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AggregationResponse> =
        // post /organizations/{orgId}/aggregations
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AggregationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AggregationResponse> =
        // get /organizations/{orgId}/aggregations/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AggregationUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AggregationResponse> =
        // put /organizations/{orgId}/aggregations/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AggregationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AggregationListPageAsync> =
        // get /organizations/{orgId}/aggregations
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AggregationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AggregationResponse> =
        // delete /organizations/{orgId}/aggregations/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AggregationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AggregationResponse> =
            jsonHandler<AggregationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: AggregationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "aggregations")
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

        private val retrieveHandler: Handler<AggregationResponse> =
            jsonHandler<AggregationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: AggregationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "aggregations",
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

        private val updateHandler: Handler<AggregationResponse> =
            jsonHandler<AggregationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: AggregationUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "aggregations",
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

        private val listHandler: Handler<AggregationListPageAsync.Response> =
            jsonHandler<AggregationListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AggregationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AggregationListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "aggregations")
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
                                AggregationListPageAsync.of(
                                    AggregationServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<AggregationResponse> =
            jsonHandler<AggregationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: AggregationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "aggregations",
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
