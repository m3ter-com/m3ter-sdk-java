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
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.Aggregation
import com.m3ter.sdk.models.AggregationCreateParams
import com.m3ter.sdk.models.AggregationListPageAsync
import com.m3ter.sdk.models.AggregationListParams
import com.m3ter.sdk.models.AggregationRetrieveParams
import com.m3ter.sdk.models.AggregationUpdateParams
import java.util.concurrent.CompletableFuture

class AggregationServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : AggregationServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Aggregation> =
        jsonHandler<Aggregation>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new Aggregation. */
    override fun create(
        params: AggregationCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Aggregation> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "aggregations")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<Aggregation> =
        jsonHandler<Aggregation>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve the Aggregation with the given UUID. */
    override fun retrieve(
        params: AggregationRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Aggregation> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "aggregations",
                    params.getPathParam(1)
                )
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<Aggregation> =
        jsonHandler<Aggregation>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Update the Aggregation with the given UUID.
     *
     * **Note:** If you have created Custom Fields for an Aggregation, when you use this endpoint to
     * update the Aggregation use the `customFields` parameter to preserve those Custom Fields. If
     * you omit them from the update request, they will be lost.
     */
    override fun update(
        params: AggregationUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Aggregation> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "aggregations",
                    params.getPathParam(1)
                )
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<AggregationListPageAsync.Response> =
        jsonHandler<AggregationListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a list of Aggregations that can be filtered by Product, Aggregation ID, or Code. */
    override fun list(
        params: AggregationListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AggregationListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "aggregations")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { AggregationListPageAsync.of(this, params, it) }
        }
    }
}
