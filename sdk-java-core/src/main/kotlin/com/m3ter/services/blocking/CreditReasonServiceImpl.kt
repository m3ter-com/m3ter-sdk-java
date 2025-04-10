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
import com.m3ter.models.CreditReasonCreateParams
import com.m3ter.models.CreditReasonDeleteParams
import com.m3ter.models.CreditReasonListPage
import com.m3ter.models.CreditReasonListPageResponse
import com.m3ter.models.CreditReasonListParams
import com.m3ter.models.CreditReasonResponse
import com.m3ter.models.CreditReasonRetrieveParams
import com.m3ter.models.CreditReasonUpdateParams

class CreditReasonServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditReasonService {

    private val withRawResponse: CreditReasonService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CreditReasonService.WithRawResponse = withRawResponse

    override fun create(
        params: CreditReasonCreateParams,
        requestOptions: RequestOptions,
    ): CreditReasonResponse =
        // post /organizations/{orgId}/picklists/creditreasons
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CreditReasonRetrieveParams,
        requestOptions: RequestOptions,
    ): CreditReasonResponse =
        // get /organizations/{orgId}/picklists/creditreasons/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CreditReasonUpdateParams,
        requestOptions: RequestOptions,
    ): CreditReasonResponse =
        // put /organizations/{orgId}/picklists/creditreasons/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CreditReasonListParams,
        requestOptions: RequestOptions,
    ): CreditReasonListPage =
        // get /organizations/{orgId}/picklists/creditreasons
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: CreditReasonDeleteParams,
        requestOptions: RequestOptions,
    ): CreditReasonResponse =
        // delete /organizations/{orgId}/picklists/creditreasons/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditReasonService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CreditReasonResponse> =
            jsonHandler<CreditReasonResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: CreditReasonCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditReasonResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "picklists",
                        "creditreasons",
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

        private val retrieveHandler: Handler<CreditReasonResponse> =
            jsonHandler<CreditReasonResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: CreditReasonRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditReasonResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "picklists",
                        "creditreasons",
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

        private val updateHandler: Handler<CreditReasonResponse> =
            jsonHandler<CreditReasonResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: CreditReasonUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditReasonResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "picklists",
                        "creditreasons",
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

        private val listHandler: Handler<CreditReasonListPageResponse> =
            jsonHandler<CreditReasonListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CreditReasonListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditReasonListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "picklists",
                        "creditreasons",
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
                        CreditReasonListPage.builder()
                            .service(CreditReasonServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<CreditReasonResponse> =
            jsonHandler<CreditReasonResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: CreditReasonDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditReasonResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "picklists",
                        "creditreasons",
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
