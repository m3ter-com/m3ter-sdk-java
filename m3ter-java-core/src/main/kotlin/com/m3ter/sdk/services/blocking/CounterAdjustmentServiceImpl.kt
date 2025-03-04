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
import com.m3ter.sdk.models.CounterAdjustment
import com.m3ter.sdk.models.CounterAdjustmentCreateParams
import com.m3ter.sdk.models.CounterAdjustmentDeleteParams
import com.m3ter.sdk.models.CounterAdjustmentListPage
import com.m3ter.sdk.models.CounterAdjustmentListParams
import com.m3ter.sdk.models.CounterAdjustmentRetrieveParams
import com.m3ter.sdk.models.CounterAdjustmentUpdateParams

class CounterAdjustmentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CounterAdjustmentService {

    private val withRawResponse: CounterAdjustmentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CounterAdjustmentService.WithRawResponse = withRawResponse

    override fun create(
        params: CounterAdjustmentCreateParams,
        requestOptions: RequestOptions,
    ): CounterAdjustment =
        // post /organizations/{orgId}/counteradjustments
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CounterAdjustmentRetrieveParams,
        requestOptions: RequestOptions,
    ): CounterAdjustment =
        // get /organizations/{orgId}/counteradjustments/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CounterAdjustmentUpdateParams,
        requestOptions: RequestOptions,
    ): CounterAdjustment =
        // put /organizations/{orgId}/counteradjustments/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CounterAdjustmentListParams,
        requestOptions: RequestOptions,
    ): CounterAdjustmentListPage =
        // get /organizations/{orgId}/counteradjustments
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: CounterAdjustmentDeleteParams,
        requestOptions: RequestOptions,
    ): CounterAdjustment =
        // delete /organizations/{orgId}/counteradjustments/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CounterAdjustmentService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CounterAdjustment> =
            jsonHandler<CounterAdjustment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CounterAdjustmentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterAdjustment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "counteradjustments")
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

        private val retrieveHandler: Handler<CounterAdjustment> =
            jsonHandler<CounterAdjustment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: CounterAdjustmentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterAdjustment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "counteradjustments",
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

        private val updateHandler: Handler<CounterAdjustment> =
            jsonHandler<CounterAdjustment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: CounterAdjustmentUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterAdjustment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "counteradjustments",
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

        private val listHandler: Handler<CounterAdjustmentListPage.Response> =
            jsonHandler<CounterAdjustmentListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CounterAdjustmentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterAdjustmentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "counteradjustments")
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
                        CounterAdjustmentListPage.of(
                            CounterAdjustmentServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val deleteHandler: Handler<CounterAdjustment> =
            jsonHandler<CounterAdjustment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: CounterAdjustmentDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterAdjustment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "counteradjustments",
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
