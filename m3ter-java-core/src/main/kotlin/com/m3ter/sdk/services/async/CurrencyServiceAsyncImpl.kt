// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

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
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.models.CurrencyCreateParams
import com.m3ter.sdk.models.CurrencyDeleteParams
import com.m3ter.sdk.models.CurrencyListPageAsync
import com.m3ter.sdk.models.CurrencyListParams
import com.m3ter.sdk.models.CurrencyResponse
import com.m3ter.sdk.models.CurrencyRetrieveParams
import com.m3ter.sdk.models.CurrencyUpdateParams
import java.util.concurrent.CompletableFuture

class CurrencyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CurrencyServiceAsync {

    private val withRawResponse: CurrencyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CurrencyServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: CurrencyCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CurrencyResponse> =
        // post /organizations/{orgId}/picklists/currency
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CurrencyRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CurrencyResponse> =
        // get /organizations/{orgId}/picklists/currency/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CurrencyUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CurrencyResponse> =
        // put /organizations/{orgId}/picklists/currency/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CurrencyListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CurrencyListPageAsync> =
        // get /organizations/{orgId}/picklists/currency
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CurrencyDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CurrencyResponse> =
        // delete /organizations/{orgId}/picklists/currency/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CurrencyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CurrencyResponse> =
            jsonHandler<CurrencyResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CurrencyCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CurrencyResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params._pathParam(0), "picklists", "currency")
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

        private val retrieveHandler: Handler<CurrencyResponse> =
            jsonHandler<CurrencyResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: CurrencyRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CurrencyResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "picklists",
                        "currency",
                        params._pathParam(1),
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

        private val updateHandler: Handler<CurrencyResponse> =
            jsonHandler<CurrencyResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: CurrencyUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CurrencyResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "picklists",
                        "currency",
                        params._pathParam(1),
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

        private val listHandler: Handler<CurrencyListPageAsync.Response> =
            jsonHandler<CurrencyListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CurrencyListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CurrencyListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params._pathParam(0), "picklists", "currency")
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
                                CurrencyListPageAsync.of(
                                    CurrencyServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<CurrencyResponse> =
            jsonHandler<CurrencyResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: CurrencyDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CurrencyResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "picklists",
                        "currency",
                        params._pathParam(1),
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
