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
import com.m3ter.sdk.models.CreditReason
import com.m3ter.sdk.models.CreditReasonCreateParams
import com.m3ter.sdk.models.CreditReasonDeleteParams
import com.m3ter.sdk.models.CreditReasonListPage
import com.m3ter.sdk.models.CreditReasonListParams
import com.m3ter.sdk.models.CreditReasonRetrieveParams
import com.m3ter.sdk.models.CreditReasonUpdateParams

class CreditReasonServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditReasonService {

    private val withRawResponse: CreditReasonService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CreditReasonService.WithRawResponse = withRawResponse

    override fun create(
        params: CreditReasonCreateParams,
        requestOptions: RequestOptions,
    ): CreditReason =
        // post /organizations/{orgId}/picklists/creditreasons
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CreditReasonRetrieveParams,
        requestOptions: RequestOptions,
    ): CreditReason =
        // get /organizations/{orgId}/picklists/creditreasons/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CreditReasonUpdateParams,
        requestOptions: RequestOptions,
    ): CreditReason =
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
    ): CreditReason =
        // delete /organizations/{orgId}/picklists/creditreasons/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditReasonService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CreditReason> =
            jsonHandler<CreditReason>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: CreditReasonCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditReason> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
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

        private val retrieveHandler: Handler<CreditReason> =
            jsonHandler<CreditReason>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: CreditReasonRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditReason> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "picklists",
                        "creditreasons",
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

        private val updateHandler: Handler<CreditReason> =
            jsonHandler<CreditReason>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: CreditReasonUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditReason> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "picklists",
                        "creditreasons",
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

        private val listHandler: Handler<CreditReasonListPage.Response> =
            jsonHandler<CreditReasonListPage.Response>(clientOptions.jsonMapper)
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
                        params.getPathParam(0),
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
                        CreditReasonListPage.of(CreditReasonServiceImpl(clientOptions), params, it)
                    }
            }
        }

        private val deleteHandler: Handler<CreditReason> =
            jsonHandler<CreditReason>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: CreditReasonDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditReason> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "picklists",
                        "creditreasons",
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
