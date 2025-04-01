// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.JsonValue
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
import com.m3ter.sdk.models.PlanCreateParams
import com.m3ter.sdk.models.PlanDeleteParams
import com.m3ter.sdk.models.PlanListPage
import com.m3ter.sdk.models.PlanListParams
import com.m3ter.sdk.models.PlanResponse
import com.m3ter.sdk.models.PlanRetrieveParams
import com.m3ter.sdk.models.PlanUpdateParams

class PlanServiceImpl internal constructor(private val clientOptions: ClientOptions) : PlanService {

    private val withRawResponse: PlanService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlanService.WithRawResponse = withRawResponse

    override fun create(params: PlanCreateParams, requestOptions: RequestOptions): PlanResponse =
        // post /organizations/{orgId}/plans
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PlanRetrieveParams,
        requestOptions: RequestOptions,
    ): PlanResponse =
        // get /organizations/{orgId}/plans/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: PlanUpdateParams, requestOptions: RequestOptions): PlanResponse =
        // put /organizations/{orgId}/plans/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: PlanListParams, requestOptions: RequestOptions): PlanListPage =
        // get /organizations/{orgId}/plans
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: PlanDeleteParams, requestOptions: RequestOptions): PlanResponse =
        // delete /organizations/{orgId}/plans/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlanService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PlanResponse> =
            jsonHandler<PlanResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: PlanCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params._pathParam(0), "plans")
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

        private val retrieveHandler: Handler<PlanResponse> =
            jsonHandler<PlanResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PlanRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "plans",
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

        private val updateHandler: Handler<PlanResponse> =
            jsonHandler<PlanResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: PlanUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "plans",
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

        private val listHandler: Handler<PlanListPage.Response> =
            jsonHandler<PlanListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PlanListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params._pathParam(0), "plans")
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
                    .let { PlanListPage.of(PlanServiceImpl(clientOptions), params, it) }
            }
        }

        private val deleteHandler: Handler<PlanResponse> =
            jsonHandler<PlanResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: PlanDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "plans",
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
