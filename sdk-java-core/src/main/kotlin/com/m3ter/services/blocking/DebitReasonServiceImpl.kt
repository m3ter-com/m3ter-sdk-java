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
import com.m3ter.models.DebitReasonCreateParams
import com.m3ter.models.DebitReasonDeleteParams
import com.m3ter.models.DebitReasonListPage
import com.m3ter.models.DebitReasonListPageResponse
import com.m3ter.models.DebitReasonListParams
import com.m3ter.models.DebitReasonResponse
import com.m3ter.models.DebitReasonRetrieveParams
import com.m3ter.models.DebitReasonUpdateParams

class DebitReasonServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DebitReasonService {

    private val withRawResponse: DebitReasonService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DebitReasonService.WithRawResponse = withRawResponse

    override fun create(
        params: DebitReasonCreateParams,
        requestOptions: RequestOptions,
    ): DebitReasonResponse =
        // post /organizations/{orgId}/picklists/debitreasons
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: DebitReasonRetrieveParams,
        requestOptions: RequestOptions,
    ): DebitReasonResponse =
        // get /organizations/{orgId}/picklists/debitreasons/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: DebitReasonUpdateParams,
        requestOptions: RequestOptions,
    ): DebitReasonResponse =
        // put /organizations/{orgId}/picklists/debitreasons/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: DebitReasonListParams,
        requestOptions: RequestOptions,
    ): DebitReasonListPage =
        // get /organizations/{orgId}/picklists/debitreasons
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: DebitReasonDeleteParams,
        requestOptions: RequestOptions,
    ): DebitReasonResponse =
        // delete /organizations/{orgId}/picklists/debitreasons/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DebitReasonService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<DebitReasonResponse> =
            jsonHandler<DebitReasonResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: DebitReasonCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DebitReasonResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "picklists",
                        "debitreasons",
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

        private val retrieveHandler: Handler<DebitReasonResponse> =
            jsonHandler<DebitReasonResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: DebitReasonRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DebitReasonResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "picklists",
                        "debitreasons",
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

        private val updateHandler: Handler<DebitReasonResponse> =
            jsonHandler<DebitReasonResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: DebitReasonUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DebitReasonResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "picklists",
                        "debitreasons",
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

        private val listHandler: Handler<DebitReasonListPageResponse> =
            jsonHandler<DebitReasonListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: DebitReasonListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DebitReasonListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "picklists",
                        "debitreasons",
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
                        DebitReasonListPage.builder()
                            .service(DebitReasonServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<DebitReasonResponse> =
            jsonHandler<DebitReasonResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: DebitReasonDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DebitReasonResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "picklists",
                        "debitreasons",
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
