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
import com.m3ter.sdk.core.http.parseable
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.Commitment
import com.m3ter.sdk.models.CommitmentCreateParams
import com.m3ter.sdk.models.CommitmentDeleteParams
import com.m3ter.sdk.models.CommitmentListPageAsync
import com.m3ter.sdk.models.CommitmentListParams
import com.m3ter.sdk.models.CommitmentRetrieveParams
import com.m3ter.sdk.models.CommitmentSearchParams
import com.m3ter.sdk.models.CommitmentSearchResponse
import com.m3ter.sdk.models.CommitmentUpdateParams
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
    ): CompletableFuture<Commitment> =
        // post /organizations/{orgId}/commitments
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CommitmentRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Commitment> =
        // get /organizations/{orgId}/commitments/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CommitmentUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Commitment> =
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
    ): CompletableFuture<Commitment> =
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

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Commitment> =
            jsonHandler<Commitment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CommitmentCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Commitment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "commitments")
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

        private val retrieveHandler: Handler<Commitment> =
            jsonHandler<Commitment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: CommitmentRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Commitment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "commitments",
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

        private val updateHandler: Handler<Commitment> =
            jsonHandler<Commitment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: CommitmentUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Commitment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "commitments",
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
                    .addPathSegments("organizations", params.getPathParam(0), "commitments")
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

        private val deleteHandler: Handler<Commitment> =
            jsonHandler<Commitment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: CommitmentDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Commitment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "commitments",
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
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "commitments",
                        "search",
                    )
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
