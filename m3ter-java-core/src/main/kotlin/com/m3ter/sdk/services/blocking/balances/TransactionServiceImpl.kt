// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking.balances

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
import com.m3ter.sdk.models.BalanceTransactionCreateParams
import com.m3ter.sdk.models.BalanceTransactionListPage
import com.m3ter.sdk.models.BalanceTransactionListParams
import com.m3ter.sdk.models.BalanceTransactionSummaryParams
import com.m3ter.sdk.models.BalanceTransactionSummaryResponse
import com.m3ter.sdk.models.TransactionResponse

class TransactionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TransactionService {

    private val withRawResponse: TransactionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransactionService.WithRawResponse = withRawResponse

    override fun create(
        params: BalanceTransactionCreateParams,
        requestOptions: RequestOptions,
    ): TransactionResponse =
        // post /organizations/{orgId}/balances/{balanceId}/transactions
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: BalanceTransactionListParams,
        requestOptions: RequestOptions,
    ): BalanceTransactionListPage =
        // get /organizations/{orgId}/balances/{balanceId}/transactions
        withRawResponse().list(params, requestOptions).parse()

    override fun summary(
        params: BalanceTransactionSummaryParams,
        requestOptions: RequestOptions,
    ): BalanceTransactionSummaryResponse =
        // get /organizations/{orgId}/balances/{balanceId}/transactions/summary
        withRawResponse().summary(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<TransactionResponse> =
            jsonHandler<TransactionResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: BalanceTransactionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "balances",
                        params._pathParam(1),
                        "transactions",
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

        private val listHandler: Handler<BalanceTransactionListPage.Response> =
            jsonHandler<BalanceTransactionListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: BalanceTransactionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceTransactionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "balances",
                        params._pathParam(1),
                        "transactions",
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
                        BalanceTransactionListPage.of(
                            TransactionServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val summaryHandler: Handler<BalanceTransactionSummaryResponse> =
            jsonHandler<BalanceTransactionSummaryResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun summary(
            params: BalanceTransactionSummaryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceTransactionSummaryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "balances",
                        params._pathParam(1),
                        "transactions",
                        "summary",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { summaryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
