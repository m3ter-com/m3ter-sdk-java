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
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.core.http.json
import com.m3ter.sdk.core.http.parseable
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

    private val withRawResponse: AggregationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AggregationService.WithRawResponse = withRawResponse

    override fun create(
        params: AggregationCreateParams,
        requestOptions: RequestOptions,
    ): AggregationResponse =
        // post /organizations/{orgId}/aggregations
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AggregationRetrieveParams,
        requestOptions: RequestOptions,
    ): AggregationResponse =
        // get /organizations/{orgId}/aggregations/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AggregationUpdateParams,
        requestOptions: RequestOptions,
    ): AggregationResponse =
        // put /organizations/{orgId}/aggregations/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: AggregationListParams,
        requestOptions: RequestOptions,
    ): AggregationListPage =
        // get /organizations/{orgId}/aggregations
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: AggregationDeleteParams,
        requestOptions: RequestOptions,
    ): AggregationResponse =
        // delete /organizations/{orgId}/aggregations/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AggregationService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AggregationResponse> =
            jsonHandler<AggregationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: AggregationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AggregationResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "aggregations")
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

        private val retrieveHandler: Handler<AggregationResponse> =
            jsonHandler<AggregationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: AggregationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AggregationResponse> {
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

        private val updateHandler: Handler<AggregationResponse> =
            jsonHandler<AggregationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: AggregationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AggregationResponse> {
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

        private val listHandler: Handler<AggregationListPage.Response> =
            jsonHandler<AggregationListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AggregationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AggregationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "aggregations")
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
                    .let {
                        AggregationListPage.of(AggregationServiceImpl(clientOptions), params, it)
                    }
            }
        }

        private val deleteHandler: Handler<AggregationResponse> =
            jsonHandler<AggregationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: AggregationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AggregationResponse> {
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
