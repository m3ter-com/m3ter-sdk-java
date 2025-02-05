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
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.Product
import com.m3ter.sdk.models.ProductCreateParams
import com.m3ter.sdk.models.ProductListPageAsync
import com.m3ter.sdk.models.ProductListParams
import com.m3ter.sdk.models.ProductRetrieveParams
import com.m3ter.sdk.models.ProductUpdateParams
import java.util.concurrent.CompletableFuture

class ProductServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ProductServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Product> =
        jsonHandler<Product>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new Product.
     *
     * This endpoint creates a new Product within the specified Organization. The details of the
     * Product are provided in the request body.
     */
    override fun create(
        params: ProductCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Product> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "products")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<Product> =
        jsonHandler<Product>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve a Product with the given UUID.
     *
     * This endpoint retrieves the details of a specific Product within a specified Organization,
     * using the Product UUID.
     */
    override fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Product> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "products",
                    params.getPathParam(1)
                )
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<Product> =
        jsonHandler<Product>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Update a Product with the given UUID.
     *
     * This endpoint updates the details of a specific Product within a specified Organization,
     * using the Product UUID. The updated details are provided in the request body.
     *
     * **Note:** If you have created Custom Fields for a Product, when you use this endpoint to
     * update the Product use the `customFields` parameter to preserve those Custom Fields. If you
     * omit them from the update request, they will be lost.
     */
    override fun update(
        params: ProductUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Product> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "products",
                    params.getPathParam(1)
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<ProductListPageAsync.Response> =
        jsonHandler<ProductListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve a list of Products.
     *
     * This endpoint retrieves a list of all the Products within a specified Organization. The list
     * can be paginated, and supports filtering by specific Product IDs.
     */
    override fun list(
        params: ProductListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ProductListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "products")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { ProductListPageAsync.of(this, params, it) }
            }
    }
}
