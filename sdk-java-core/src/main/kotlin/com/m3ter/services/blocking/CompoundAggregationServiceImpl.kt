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
import com.m3ter.models.AggregationResponse
import com.m3ter.models.CompoundAggregationCreateParams
import com.m3ter.models.CompoundAggregationDeleteParams
import com.m3ter.models.CompoundAggregationListPage
import com.m3ter.models.CompoundAggregationListPageResponse
import com.m3ter.models.CompoundAggregationListParams
import com.m3ter.models.CompoundAggregationResponse
import com.m3ter.models.CompoundAggregationRetrieveParams
import com.m3ter.models.CompoundAggregationUpdateParams

class CompoundAggregationServiceImpl
internal constructor(private val clientOptions: ClientOptions) : CompoundAggregationService {

    private val withRawResponse: CompoundAggregationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CompoundAggregationService.WithRawResponse = withRawResponse

    override fun create(
        params: CompoundAggregationCreateParams,
        requestOptions: RequestOptions,
    ): AggregationResponse =
        // post /organizations/{orgId}/compoundaggregations
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CompoundAggregationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompoundAggregationResponse =
        // get /organizations/{orgId}/compoundaggregations/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CompoundAggregationUpdateParams,
        requestOptions: RequestOptions,
    ): AggregationResponse =
        // put /organizations/{orgId}/compoundaggregations/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CompoundAggregationListParams,
        requestOptions: RequestOptions,
    ): CompoundAggregationListPage =
        // get /organizations/{orgId}/compoundaggregations
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: CompoundAggregationDeleteParams,
        requestOptions: RequestOptions,
    ): CompoundAggregationResponse =
        // delete /organizations/{orgId}/compoundaggregations/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CompoundAggregationService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AggregationResponse> =
            jsonHandler<AggregationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: CompoundAggregationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AggregationResponse> {
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

        private val retrieveHandler: Handler<CompoundAggregationResponse> =
            jsonHandler<CompoundAggregationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: CompoundAggregationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompoundAggregationResponse> {
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
            params: CompoundAggregationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AggregationResponse> {
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

        private val listHandler: Handler<CompoundAggregationListPageResponse> =
            jsonHandler<CompoundAggregationListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CompoundAggregationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompoundAggregationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "compoundaggregations",
                    )
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
                        CompoundAggregationListPage.of(
                            CompoundAggregationServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val deleteHandler: Handler<CompoundAggregationResponse> =
            jsonHandler<CompoundAggregationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: CompoundAggregationDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompoundAggregationResponse> {
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
