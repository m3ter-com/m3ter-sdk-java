// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.handlers.errorHandler
import com.m3ter.sdk.core.handlers.jsonHandler
import com.m3ter.sdk.core.handlers.withErrorHandler
import com.m3ter.sdk.core.http.HttpMethod
import com.m3ter.sdk.core.http.HttpRequest
import com.m3ter.sdk.core.http.HttpResponse.Handler
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.Product
import com.m3ter.sdk.models.ProductCreateParams
import com.m3ter.sdk.models.ProductListPage
import com.m3ter.sdk.models.ProductListParams
import com.m3ter.sdk.models.ProductRetrieveParams
import com.m3ter.sdk.models.ProductUpdateParams

class ProductServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ProductService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Product> =
        jsonHandler<Product>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new Product.
     *
     * This endpoint creates a new Product within the specified Organization. The details of the
     * Product are provided in the request body.
     */
    override fun create(params: ProductCreateParams, requestOptions: RequestOptions): Product {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "products")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
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
    override fun retrieve(params: ProductRetrieveParams, requestOptions: RequestOptions): Product {
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
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
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
    override fun update(params: ProductUpdateParams, requestOptions: RequestOptions): Product {
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
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<ProductListPage.Response> =
        jsonHandler<ProductListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve a list of Products.
     *
     * This endpoint retrieves a list of all the Products within a specified Organization. The list
     * can be paginated, and supports filtering by specific Product IDs.
     */
    override fun list(params: ProductListParams, requestOptions: RequestOptions): ProductListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "products")
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { ProductListPage.of(this, params, it) }
        }
    }
}
