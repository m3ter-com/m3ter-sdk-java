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
import com.m3ter.models.BillJobCancelParams
import com.m3ter.models.BillJobCreateParams
import com.m3ter.models.BillJobListPage
import com.m3ter.models.BillJobListParams
import com.m3ter.models.BillJobRecalculateParams
import com.m3ter.models.BillJobResponse
import com.m3ter.models.BillJobRetrieveParams

class BillJobServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BillJobService {

    private val withRawResponse: BillJobService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BillJobService.WithRawResponse = withRawResponse

    override fun create(
        params: BillJobCreateParams,
        requestOptions: RequestOptions,
    ): BillJobResponse =
        // post /organizations/{orgId}/billjobs
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: BillJobRetrieveParams,
        requestOptions: RequestOptions,
    ): BillJobResponse =
        // get /organizations/{orgId}/billjobs/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: BillJobListParams, requestOptions: RequestOptions): BillJobListPage =
        // get /organizations/{orgId}/billjobs
        withRawResponse().list(params, requestOptions).parse()

    override fun cancel(
        params: BillJobCancelParams,
        requestOptions: RequestOptions,
    ): BillJobResponse =
        // post /organizations/{orgId}/billjobs/{id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    override fun recalculate(
        params: BillJobRecalculateParams,
        requestOptions: RequestOptions,
    ): BillJobResponse =
        // post /organizations/{orgId}/billjobs/recalculate
        withRawResponse().recalculate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BillJobService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<BillJobResponse> =
            jsonHandler<BillJobResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: BillJobCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillJobResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params._pathParam(0), "billjobs")
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

        private val retrieveHandler: Handler<BillJobResponse> =
            jsonHandler<BillJobResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: BillJobRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillJobResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "billjobs",
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

        private val listHandler: Handler<BillJobListPage.Response> =
            jsonHandler<BillJobListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: BillJobListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillJobListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params._pathParam(0), "billjobs")
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
                    .let { BillJobListPage.of(BillJobServiceImpl(clientOptions), params, it) }
            }
        }

        private val cancelHandler: Handler<BillJobResponse> =
            jsonHandler<BillJobResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun cancel(
            params: BillJobCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillJobResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "billjobs",
                        params._pathParam(1),
                        "cancel",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val recalculateHandler: Handler<BillJobResponse> =
            jsonHandler<BillJobResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun recalculate(
            params: BillJobRecalculateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillJobResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "billjobs",
                        "recalculate",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { recalculateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
