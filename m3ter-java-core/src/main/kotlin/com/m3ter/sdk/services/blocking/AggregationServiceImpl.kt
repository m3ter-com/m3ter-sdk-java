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
import com.m3ter.sdk.models.AggregationCreateParams
import com.m3ter.sdk.models.AggregationDeleteParams
import com.m3ter.sdk.models.AggregationListPage
import com.m3ter.sdk.models.AggregationListParams
import com.m3ter.sdk.models.AggregationResponse
import com.m3ter.sdk.models.AggregationRetrieveParams
import com.m3ter.sdk.models.AggregationUpdateParams

class AggregationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AggregationService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AggregationResponse> =
        jsonHandler<AggregationResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new Aggregation. */
    override fun create(
        params: AggregationCreateParams,
        requestOptions: RequestOptions,
    ): AggregationResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "aggregations")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<AggregationResponse> =
        jsonHandler<AggregationResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve the Aggregation with the given UUID. */
    override fun retrieve(
        params: AggregationRetrieveParams,
        requestOptions: RequestOptions,
    ): AggregationResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "aggregations",
                    params.getPathParam(1),
                )
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<AggregationResponse> =
        jsonHandler<AggregationResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Update the Aggregation with the given UUID.
     *
     * **Note:** If you have created Custom Fields for an Aggregation, when you use this endpoint to
     * update the Aggregation use the `customFields` parameter to preserve those Custom Fields. If
     * you omit them from the update request, they will be lost.
     */
    override fun update(
        params: AggregationUpdateParams,
        requestOptions: RequestOptions,
    ): AggregationResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "aggregations",
                    params.getPathParam(1),
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<AggregationListPage.Response> =
        jsonHandler<AggregationListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a list of Aggregations that can be filtered by Product, Aggregation ID, or Code. */
    override fun list(
        params: AggregationListParams,
        requestOptions: RequestOptions,
    ): AggregationListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "aggregations")
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
            .let { AggregationListPage.of(this, params, it) }
    }

    private val deleteHandler: Handler<AggregationResponse> =
        jsonHandler<AggregationResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete the Aggregation with the given UUID. */
    override fun delete(
        params: AggregationDeleteParams,
        requestOptions: RequestOptions,
    ): AggregationResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "aggregations",
                    params.getPathParam(1),
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { deleteHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }
}
