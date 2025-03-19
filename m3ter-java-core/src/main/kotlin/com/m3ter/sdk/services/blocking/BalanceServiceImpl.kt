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
import com.m3ter.sdk.models.Balance
import com.m3ter.sdk.models.BalanceCreateParams
import com.m3ter.sdk.models.BalanceDeleteParams
import com.m3ter.sdk.models.BalanceListPage
import com.m3ter.sdk.models.BalanceListParams
import com.m3ter.sdk.models.BalanceRetrieveParams
import com.m3ter.sdk.models.BalanceUpdateParams
import com.m3ter.sdk.services.blocking.balances.TransactionService
import com.m3ter.sdk.services.blocking.balances.TransactionServiceImpl

class BalanceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BalanceService {

    private val withRawResponse: BalanceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val transactions: TransactionService by lazy { TransactionServiceImpl(clientOptions) }

    override fun withRawResponse(): BalanceService.WithRawResponse = withRawResponse

    override fun transactions(): TransactionService = transactions

    override fun create(params: BalanceCreateParams, requestOptions: RequestOptions): Balance =
        // post /organizations/{orgId}/balances
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: BalanceRetrieveParams, requestOptions: RequestOptions): Balance =
        // get /organizations/{orgId}/balances/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: BalanceUpdateParams, requestOptions: RequestOptions): Balance =
        // put /organizations/{orgId}/balances/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: BalanceListParams, requestOptions: RequestOptions): BalanceListPage =
        // get /organizations/{orgId}/balances
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: BalanceDeleteParams, requestOptions: RequestOptions): Balance =
        // delete /organizations/{orgId}/balances/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BalanceService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val transactions: TransactionService.WithRawResponse by lazy {
            TransactionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun transactions(): TransactionService.WithRawResponse = transactions

        private val createHandler: Handler<Balance> =
            jsonHandler<Balance>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: BalanceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Balance> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params._pathParam(0), "balances")
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

        private val retrieveHandler: Handler<Balance> =
            jsonHandler<Balance>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: BalanceRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Balance> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "balances",
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

        private val updateHandler: Handler<Balance> =
            jsonHandler<Balance>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: BalanceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Balance> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "balances",
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

        private val listHandler: Handler<BalanceListPage.Response> =
            jsonHandler<BalanceListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: BalanceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params._pathParam(0), "balances")
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
                    .let { BalanceListPage.of(BalanceServiceImpl(clientOptions), params, it) }
            }
        }

        private val deleteHandler: Handler<Balance> =
            jsonHandler<Balance>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: BalanceDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Balance> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "balances",
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
