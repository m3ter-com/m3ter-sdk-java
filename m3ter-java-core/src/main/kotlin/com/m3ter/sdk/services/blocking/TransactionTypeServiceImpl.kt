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
import com.m3ter.sdk.models.TransactionTypeCreateParams
import com.m3ter.sdk.models.TransactionTypeDeleteParams
import com.m3ter.sdk.models.TransactionTypeListPage
import com.m3ter.sdk.models.TransactionTypeListParams
import com.m3ter.sdk.models.TransactionTypeResponse
import com.m3ter.sdk.models.TransactionTypeRetrieveParams
import com.m3ter.sdk.models.TransactionTypeUpdateParams

class TransactionTypeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TransactionTypeService {

    private val withRawResponse: TransactionTypeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransactionTypeService.WithRawResponse = withRawResponse

    override fun create(
        params: TransactionTypeCreateParams,
        requestOptions: RequestOptions,
    ): TransactionTypeResponse =
        // post /organizations/{orgId}/picklists/transactiontypes
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: TransactionTypeRetrieveParams,
        requestOptions: RequestOptions,
    ): TransactionTypeResponse =
        // get /organizations/{orgId}/picklists/transactiontypes/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: TransactionTypeUpdateParams,
        requestOptions: RequestOptions,
    ): TransactionTypeResponse =
        // put /organizations/{orgId}/picklists/transactiontypes/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: TransactionTypeListParams,
        requestOptions: RequestOptions,
    ): TransactionTypeListPage =
        // get /organizations/{orgId}/picklists/transactiontypes
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: TransactionTypeDeleteParams,
        requestOptions: RequestOptions,
    ): TransactionTypeResponse =
        // delete /organizations/{orgId}/picklists/transactiontypes/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionTypeService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<TransactionTypeResponse> =
            jsonHandler<TransactionTypeResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: TransactionTypeCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionTypeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "picklists",
                        "transactiontypes",
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

        private val retrieveHandler: Handler<TransactionTypeResponse> =
            jsonHandler<TransactionTypeResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: TransactionTypeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionTypeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "picklists",
                        "transactiontypes",
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

        private val updateHandler: Handler<TransactionTypeResponse> =
            jsonHandler<TransactionTypeResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: TransactionTypeUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionTypeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "picklists",
                        "transactiontypes",
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

        private val listHandler: Handler<TransactionTypeListPage.Response> =
            jsonHandler<TransactionTypeListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: TransactionTypeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionTypeListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "picklists",
                        "transactiontypes",
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
                        TransactionTypeListPage.of(
                            TransactionTypeServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val deleteHandler: Handler<TransactionTypeResponse> =
            jsonHandler<TransactionTypeResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: TransactionTypeDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionTypeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "picklists",
                        "transactiontypes",
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
