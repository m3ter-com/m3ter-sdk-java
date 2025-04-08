// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.ClientOptions
import com.m3ter.core.JsonValue
import com.m3ter.core.RequestOptions
import com.m3ter.core.handlers.errorHandler
import com.m3ter.core.handlers.jsonHandler
import com.m3ter.core.handlers.withErrorHandler
import com.m3ter.core.http.HttpMethod
import com.m3ter.core.http.HttpRequest
import com.m3ter.core.http.HttpResponse.Handler
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.core.http.json
import com.m3ter.core.http.parseable
import com.m3ter.core.prepareAsync
import com.m3ter.models.CommitmentCreateParams
import com.m3ter.models.CommitmentDeleteParams
import com.m3ter.models.CommitmentListPageAsync
import com.m3ter.models.CommitmentListParams
import com.m3ter.models.CommitmentResponse
import com.m3ter.models.CommitmentRetrieveParams
import com.m3ter.models.CommitmentSearchParams
import com.m3ter.models.CommitmentSearchResponse
import com.m3ter.models.CommitmentUpdateParams
import java.util.concurrent.CompletableFuture

class CommitmentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CommitmentServiceAsync {

    private val withRawResponse: CommitmentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CommitmentServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: CommitmentCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommitmentResponse> =
        // post /organizations/{orgId}/commitments
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CommitmentRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommitmentResponse> =
        // get /organizations/{orgId}/commitments/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CommitmentUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommitmentResponse> =
        // put /organizations/{orgId}/commitments/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CommitmentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommitmentListPageAsync> =
        // get /organizations/{orgId}/commitments
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CommitmentDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommitmentResponse> =
        // delete /organizations/{orgId}/commitments/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: CommitmentSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CommitmentSearchResponse> =
        // get /organizations/{orgId}/commitments/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommitmentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CommitmentResponse> =
            jsonHandler<CommitmentResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CommitmentCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params._pathParam(0), "commitments")
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

        private val retrieveHandler: Handler<CommitmentResponse> =
            jsonHandler<CommitmentResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: CommitmentRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "commitments",
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

        private val updateHandler: Handler<CommitmentResponse> =
            jsonHandler<CommitmentResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: CommitmentUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "commitments",
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

        private val listHandler: Handler<CommitmentListPageAsync.Response> =
            jsonHandler<CommitmentListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CommitmentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommitmentListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params._pathParam(0), "commitments")
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
                                CommitmentListPageAsync.of(
                                    CommitmentServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<CommitmentResponse> =
            jsonHandler<CommitmentResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: CommitmentDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommitmentResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "commitments",
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

        private val searchHandler: Handler<CommitmentSearchResponse> =
            jsonHandler<CommitmentSearchResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun search(
            params: CommitmentSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CommitmentSearchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params._pathParam(0), "commitments", "search")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { searchHandler.handle(it) }
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
