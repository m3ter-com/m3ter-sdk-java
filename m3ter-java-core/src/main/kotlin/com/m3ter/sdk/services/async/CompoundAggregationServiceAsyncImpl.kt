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
import com.m3ter.sdk.models.AggregationResponse
import com.m3ter.sdk.models.CompoundAggregation
import com.m3ter.sdk.models.CompoundAggregationCreateParams
import com.m3ter.sdk.models.CompoundAggregationDeleteParams
import com.m3ter.sdk.models.CompoundAggregationListPageAsync
import com.m3ter.sdk.models.CompoundAggregationListParams
import com.m3ter.sdk.models.CompoundAggregationRetrieveParams
import com.m3ter.sdk.models.CompoundAggregationUpdateParams
import java.util.concurrent.CompletableFuture

class CompoundAggregationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : CompoundAggregationServiceAsync {

    private val withRawResponse: CompoundAggregationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CompoundAggregationServiceAsync.WithRawResponse =
        withRawResponse

    override fun create(
        params: CompoundAggregationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AggregationResponse> =
        // post /organizations/{orgId}/compoundaggregations
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CompoundAggregationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CompoundAggregation> =
        // get /organizations/{orgId}/compoundaggregations/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CompoundAggregationUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AggregationResponse> =
        // put /organizations/{orgId}/compoundaggregations/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CompoundAggregationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CompoundAggregationListPageAsync> =
        // get /organizations/{orgId}/compoundaggregations
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CompoundAggregationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CompoundAggregation> =
        // delete /organizations/{orgId}/compoundaggregations/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CompoundAggregationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AggregationResponse> =
            jsonHandler<AggregationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: CompoundAggregationCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "compoundaggregations",
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
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<CompoundAggregation> =
            jsonHandler<CompoundAggregation>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: CompoundAggregationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CompoundAggregation>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "compoundaggregations",
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
            params: CompoundAggregationUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "compoundaggregations",
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

        private val listHandler: Handler<CompoundAggregationListPageAsync.Response> =
            jsonHandler<CompoundAggregationListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CompoundAggregationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CompoundAggregationListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "compoundaggregations",
                    )
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
                                CompoundAggregationListPageAsync.of(
                                    CompoundAggregationServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<CompoundAggregation> =
            jsonHandler<CompoundAggregation>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: CompoundAggregationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CompoundAggregation>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "compoundaggregations",
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
