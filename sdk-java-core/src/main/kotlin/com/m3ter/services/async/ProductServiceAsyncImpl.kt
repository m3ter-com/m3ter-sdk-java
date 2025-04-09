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
import com.m3ter.models.ProductCreateParams
import com.m3ter.models.ProductDeleteParams
import com.m3ter.models.ProductListPageAsync
import com.m3ter.models.ProductListPageResponse
import com.m3ter.models.ProductListParams
import com.m3ter.models.ProductResponse
import com.m3ter.models.ProductRetrieveParams
import com.m3ter.models.ProductUpdateParams
import java.util.concurrent.CompletableFuture

class ProductServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ProductServiceAsync {

    private val withRawResponse: ProductServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProductServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: ProductCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProductResponse> =
        // post /organizations/{orgId}/products
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProductResponse> =
        // get /organizations/{orgId}/products/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: ProductUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProductResponse> =
        // put /organizations/{orgId}/products/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ProductListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProductListPageAsync> =
        // get /organizations/{orgId}/products
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: ProductDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProductResponse> =
        // delete /organizations/{orgId}/products/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProductServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ProductResponse> =
            jsonHandler<ProductResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: ProductCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProductResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "products",
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

        private val retrieveHandler: Handler<ProductResponse> =
            jsonHandler<ProductResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: ProductRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProductResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "products",
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

        private val updateHandler: Handler<ProductResponse> =
            jsonHandler<ProductResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: ProductUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProductResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "products",
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

        private val listHandler: Handler<ProductListPageResponse> =
            jsonHandler<ProductListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ProductListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProductListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "products",
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
                                ProductListPageAsync.of(
                                    ProductServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<ProductResponse> =
            jsonHandler<ProductResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: ProductDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProductResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "products",
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
