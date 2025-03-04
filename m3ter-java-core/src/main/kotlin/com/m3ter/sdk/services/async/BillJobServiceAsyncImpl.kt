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
import com.m3ter.sdk.models.BillJob
import com.m3ter.sdk.models.BillJobCancelParams
import com.m3ter.sdk.models.BillJobCreateParams
import com.m3ter.sdk.models.BillJobListPageAsync
import com.m3ter.sdk.models.BillJobListParams
import com.m3ter.sdk.models.BillJobRecalculateParams
import com.m3ter.sdk.models.BillJobRetrieveParams
import java.util.concurrent.CompletableFuture

class BillJobServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BillJobServiceAsync {

    private val withRawResponse: BillJobServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BillJobServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: BillJobCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillJob> =
        // post /organizations/{orgId}/billjobs
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: BillJobRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillJob> =
        // get /organizations/{orgId}/billjobs/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BillJobListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillJobListPageAsync> =
        // get /organizations/{orgId}/billjobs
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun cancel(
        params: BillJobCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillJob> =
        // post /organizations/{orgId}/billjobs/{id}/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    override fun recalculate(
        params: BillJobRecalculateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillJob> =
        // post /organizations/{orgId}/billjobs/recalculate
        withRawResponse().recalculate(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BillJobServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<BillJob> =
            jsonHandler<BillJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: BillJobCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillJob>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "billjobs")
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

        private val retrieveHandler: Handler<BillJob> =
            jsonHandler<BillJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: BillJobRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillJob>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "billjobs",
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

        private val listHandler: Handler<BillJobListPageAsync.Response> =
            jsonHandler<BillJobListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: BillJobListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillJobListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "billjobs")
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
                                BillJobListPageAsync.of(
                                    BillJobServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val cancelHandler: Handler<BillJob> =
            jsonHandler<BillJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun cancel(
            params: BillJobCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillJob>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "billjobs",
                        params.getPathParam(1),
                        "cancel",
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
                            .use { cancelHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val recalculateHandler: Handler<BillJob> =
            jsonHandler<BillJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun recalculate(
            params: BillJobRecalculateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillJob>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "billjobs",
                        "recalculate",
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
                            .use { recalculateHandler.handle(it) }
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
