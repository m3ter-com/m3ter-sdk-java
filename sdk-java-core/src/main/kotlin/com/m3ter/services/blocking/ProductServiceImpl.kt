// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

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
import com.m3ter.core.prepare
import com.m3ter.models.ProductCreateParams
import com.m3ter.models.ProductDeleteParams
import com.m3ter.models.ProductListPage
import com.m3ter.models.ProductListParams
import com.m3ter.models.ProductResponse
import com.m3ter.models.ProductRetrieveParams
import com.m3ter.models.ProductUpdateParams

class ProductServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProductService {

    private val withRawResponse: ProductService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProductService.WithRawResponse = withRawResponse

    override fun create(
        params: ProductCreateParams,
        requestOptions: RequestOptions,
    ): ProductResponse =
        // post /organizations/{orgId}/products
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions,
    ): ProductResponse =
        // get /organizations/{orgId}/products/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ProductUpdateParams,
        requestOptions: RequestOptions,
    ): ProductResponse =
        // put /organizations/{orgId}/products/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: ProductListParams, requestOptions: RequestOptions): ProductListPage =
        // get /organizations/{orgId}/products
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ProductDeleteParams,
        requestOptions: RequestOptions,
    ): ProductResponse =
        // delete /organizations/{orgId}/products/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProductService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ProductResponse> =
            jsonHandler<ProductResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: ProductCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params._pathParam(0), "products")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<ProductResponse> =
            jsonHandler<ProductResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: ProductRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "products",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<ProductResponse> =
            jsonHandler<ProductResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: ProductUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "products",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<ProductListPage.Response> =
            jsonHandler<ProductListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ProductListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params._pathParam(0), "products")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let { ProductListPage.of(ProductServiceImpl(clientOptions), params, it) }
            }
        }

        private val deleteHandler: Handler<ProductResponse> =
            jsonHandler<ProductResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: ProductDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProductResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "products",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
