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
import com.m3ter.sdk.models.TransactionTypeCreateParams
import com.m3ter.sdk.models.TransactionTypeDeleteParams
import com.m3ter.sdk.models.TransactionTypeListPageAsync
import com.m3ter.sdk.models.TransactionTypeListParams
import com.m3ter.sdk.models.TransactionTypeResponse
import com.m3ter.sdk.models.TransactionTypeRetrieveParams
import com.m3ter.sdk.models.TransactionTypeUpdateParams
import java.util.concurrent.CompletableFuture

class TransactionTypeServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : TransactionTypeServiceAsync {

    private val withRawResponse: TransactionTypeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransactionTypeServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: TransactionTypeCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionTypeResponse> =
        // post /organizations/{orgId}/picklists/transactiontypes
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: TransactionTypeRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionTypeResponse> =
        // get /organizations/{orgId}/picklists/transactiontypes/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: TransactionTypeUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionTypeResponse> =
        // put /organizations/{orgId}/picklists/transactiontypes/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TransactionTypeListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionTypeListPageAsync> =
        // get /organizations/{orgId}/picklists/transactiontypes
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TransactionTypeDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionTypeResponse> =
        // delete /organizations/{orgId}/picklists/transactiontypes/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionTypeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<TransactionTypeResponse> =
            jsonHandler<TransactionTypeResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: TransactionTypeCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "picklists",
                        "transactiontypes",
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

        private val retrieveHandler: Handler<TransactionTypeResponse> =
            jsonHandler<TransactionTypeResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: TransactionTypeRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "picklists",
                        "transactiontypes",
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

        private val updateHandler: Handler<TransactionTypeResponse> =
            jsonHandler<TransactionTypeResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: TransactionTypeUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "picklists",
                        "transactiontypes",
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

        private val listHandler: Handler<TransactionTypeListPageAsync.Response> =
            jsonHandler<TransactionTypeListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: TransactionTypeListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionTypeListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "picklists",
                        "transactiontypes",
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
                                TransactionTypeListPageAsync.of(
                                    TransactionTypeServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<TransactionTypeResponse> =
            jsonHandler<TransactionTypeResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: TransactionTypeDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "picklists",
                        "transactiontypes",
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
