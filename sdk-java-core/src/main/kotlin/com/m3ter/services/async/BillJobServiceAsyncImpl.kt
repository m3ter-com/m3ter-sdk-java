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
import com.m3ter.models.BillJobCancelParams
import com.m3ter.models.BillJobCreateParams
import com.m3ter.models.BillJobListPageAsync
import com.m3ter.models.BillJobListPageResponse
import com.m3ter.models.BillJobListParams
import com.m3ter.models.BillJobRecalculateParams
import com.m3ter.models.BillJobResponse
import com.m3ter.models.BillJobRetrieveParams
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class BillJobServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BillJobServiceAsync {

    private val withRawResponse: BillJobServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BillJobServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: BillJobCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillJobResponse> =
        // post /organizations/{orgId}/billjobs
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: BillJobRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillJobResponse> =
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
    ): CompletableFuture<BillJobResponse> =
        // post /organizations/{orgId}/billjobs/{id}/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    override fun recalculate(
        params: BillJobRecalculateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillJobResponse> =
        // post /organizations/{orgId}/billjobs/recalculate
        withRawResponse().recalculate(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BillJobServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<BillJobResponse> =
            jsonHandler<BillJobResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: BillJobCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillJobResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "billjobs",
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

        private val retrieveHandler: Handler<BillJobResponse> =
            jsonHandler<BillJobResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: BillJobRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillJobResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "billjobs",
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

        private val listHandler: Handler<BillJobListPageResponse> =
            jsonHandler<BillJobListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: BillJobListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillJobListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "billjobs",
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
                                BillJobListPageAsync.builder()
                                    .service(BillJobServiceAsyncImpl(clientOptions))
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val cancelHandler: Handler<BillJobResponse> =
            jsonHandler<BillJobResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun cancel(
            params: BillJobCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillJobResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "billjobs",
                        params._pathParam(1),
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

        private val recalculateHandler: Handler<BillJobResponse> =
            jsonHandler<BillJobResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun recalculate(
            params: BillJobRecalculateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillJobResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
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
