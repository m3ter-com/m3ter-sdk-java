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
import com.m3ter.sdk.core.http.parseable
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.BillJob
import com.m3ter.sdk.models.BillJobCancelParams
import com.m3ter.sdk.models.BillJobCreateParams
import com.m3ter.sdk.models.BillJobListPage
import com.m3ter.sdk.models.BillJobListParams
import com.m3ter.sdk.models.BillJobRecalculateParams
import com.m3ter.sdk.models.BillJobRetrieveParams

class BillJobServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BillJobService {

    private val withRawResponse: BillJobService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BillJobService.WithRawResponse = withRawResponse

    override fun create(params: BillJobCreateParams, requestOptions: RequestOptions): BillJob =
        // post /organizations/{orgId}/billjobs
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: BillJobRetrieveParams, requestOptions: RequestOptions): BillJob =
        // get /organizations/{orgId}/billjobs/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: BillJobListParams, requestOptions: RequestOptions): BillJobListPage =
        // get /organizations/{orgId}/billjobs
        withRawResponse().list(params, requestOptions).parse()

    override fun cancel(params: BillJobCancelParams, requestOptions: RequestOptions): BillJob =
        // post /organizations/{orgId}/billjobs/{id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    override fun recalculate(
        params: BillJobRecalculateParams,
        requestOptions: RequestOptions,
    ): BillJob =
        // post /organizations/{orgId}/billjobs/recalculate
        withRawResponse().recalculate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BillJobService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<BillJob> =
            jsonHandler<BillJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: BillJobCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillJob> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "billjobs")
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

        private val retrieveHandler: Handler<BillJob> =
            jsonHandler<BillJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: BillJobRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillJob> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "billjobs",
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
                    .addPathSegments("organizations", params.getPathParam(0), "billjobs")
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

        private val cancelHandler: Handler<BillJob> =
            jsonHandler<BillJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun cancel(
            params: BillJobCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillJob> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "billjobs",
                        params.getPathParam(1),
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

        private val recalculateHandler: Handler<BillJob> =
            jsonHandler<BillJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun recalculate(
            params: BillJobRecalculateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillJob> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
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
