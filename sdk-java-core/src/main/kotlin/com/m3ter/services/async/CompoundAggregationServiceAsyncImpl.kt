// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.ClientOptions
import com.m3ter.core.JsonValue
import com.m3ter.core.RequestOptions
import com.m3ter.core.checkRequired
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
import com.m3ter.models.AggregationResponse
import com.m3ter.models.CompoundAggregationCreateParams
import com.m3ter.models.CompoundAggregationDeleteParams
import com.m3ter.models.CompoundAggregationListPageAsync
import com.m3ter.models.CompoundAggregationListPageResponse
import com.m3ter.models.CompoundAggregationListParams
import com.m3ter.models.CompoundAggregationResponse
import com.m3ter.models.CompoundAggregationRetrieveParams
import com.m3ter.models.CompoundAggregationUpdateParams
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

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
    ): CompletableFuture<CompoundAggregationResponse> =
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
    ): CompletableFuture<CompoundAggregationResponse> =
        // delete /organizations/{orgId}/compoundaggregations/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CompoundAggregationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

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
                        params._pathParam(0).ifBlank { clientOptions.orgId },
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

        private val retrieveHandler: Handler<CompoundAggregationResponse> =
            jsonHandler<CompoundAggregationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: CompoundAggregationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CompoundAggregationResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "compoundaggregations",
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

        private val updateHandler: Handler<AggregationResponse> =
            jsonHandler<AggregationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: CompoundAggregationUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "compoundaggregations",
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

        private val listHandler: Handler<CompoundAggregationListPageResponse> =
            jsonHandler<CompoundAggregationListPageResponse>(clientOptions.jsonMapper)
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
                        params._pathParam(0).ifBlank { clientOptions.orgId },
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
                                CompoundAggregationListPageAsync.builder()
                                    .service(CompoundAggregationServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<CompoundAggregationResponse> =
            jsonHandler<CompoundAggregationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: CompoundAggregationDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CompoundAggregationResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "compoundaggregations",
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
