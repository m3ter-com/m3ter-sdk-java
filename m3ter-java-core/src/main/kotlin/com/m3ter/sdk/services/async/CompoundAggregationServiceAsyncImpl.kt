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
import com.m3ter.sdk.models.Aggregation
import com.m3ter.sdk.models.CompoundAggregation
import com.m3ter.sdk.models.CompoundAggregationCreateParams
import com.m3ter.sdk.models.CompoundAggregationListPageAsync
import com.m3ter.sdk.models.CompoundAggregationListParams
import com.m3ter.sdk.models.CompoundAggregationRetrieveParams
import com.m3ter.sdk.models.CompoundAggregationUpdateParams
import java.util.concurrent.CompletableFuture

class CompoundAggregationServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : CompoundAggregationServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Aggregation> =
        jsonHandler<Aggregation>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new CompoundAggregation.
     *
     * This endpoint allows you to create a new CompoundAggregation for a specific Organization. The
     * request body must include all the necessary details such as the Calculation formula.
     */
    override fun create(
        params: CompoundAggregationCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Aggregation> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "compoundaggregations")
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

    private val retrieveHandler: Handler<CompoundAggregation> =
        jsonHandler<CompoundAggregation>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve a CompoundAggregation using the given UUID.
     *
     * This endpoint returns a specific CompoundAggregation associated with an Organization. It
     * provides detailed information about the CompoundAggregation.
     */
    override fun retrieve(
        params: CompoundAggregationRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CompoundAggregation> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "compoundaggregations",
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

    private val updateHandler: Handler<Aggregation> =
        jsonHandler<Aggregation>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Update the CompoundAggregation with the given UUID.
     *
     * This endpoint allows you to update the details of a specific CompoundAggregation associated
     * with an Organization. Use it to modify details of an existing CompoundAggregation such as the
     * Calculation formula.
     *
     * **Note:** If you have created Custom Fields for a Compound Aggregation, when you use this
     * endpoint to update the Compound Aggregation use the `customFields` parameter to preserve
     * those Custom Fields. If you omit them from the update request, they will be lost.
     */
    override fun update(
        params: CompoundAggregationUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Aggregation> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "compoundaggregations",
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

    private val listHandler: Handler<CompoundAggregationListPageAsync.Response> =
        jsonHandler<CompoundAggregationListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve a list of all CompoundAggregations.
     *
     * This endpoint retrieves a list of CompoundAggregations associated with a specific
     * organization. CompoundAggregations enable you to define numerical measures based on simple
     * Aggregations of usage data. It supports pagination, and includes various query parameters to
     * filter the CompoundAggregations based on Product, CompoundAggregation IDs or short codes.
     */
    override fun list(
        params: CompoundAggregationListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CompoundAggregationListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "compoundaggregations")
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
                    .let { CompoundAggregationListPageAsync.of(this, params, it) }
            }
    }
}
