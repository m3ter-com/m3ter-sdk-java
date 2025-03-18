// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async.balances

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
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.BalanceTransactionCreateParams
import com.m3ter.sdk.models.BalanceTransactionListPageAsync
import com.m3ter.sdk.models.BalanceTransactionListParams
import com.m3ter.sdk.models.BalanceTransactionSummaryParams
import com.m3ter.sdk.models.BalanceTransactionSummaryResponse
import com.m3ter.sdk.models.TransactionResponse
import java.util.concurrent.CompletableFuture

class TransactionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TransactionServiceAsync {

    private val withRawResponse: TransactionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransactionServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: BalanceTransactionCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionResponse> =
        // post /organizations/{orgId}/balances/{balanceId}/transactions
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BalanceTransactionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceTransactionListPageAsync> =
        // get /organizations/{orgId}/balances/{balanceId}/transactions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun summary(
        params: BalanceTransactionSummaryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceTransactionSummaryResponse> =
        // get /organizations/{orgId}/balances/{balanceId}/transactions/summary
        withRawResponse().summary(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<TransactionResponse> =
            jsonHandler<TransactionResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: BalanceTransactionCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<BalanceTransactionListPageAsync.Response> =
            jsonHandler<BalanceTransactionListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: BalanceTransactionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceTransactionListPageAsync>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                BalanceTransactionListPageAsync.of(
                                    TransactionServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val summaryHandler: Handler<BalanceTransactionSummaryResponse> =
            jsonHandler<BalanceTransactionSummaryResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun summary(
            params: BalanceTransactionSummaryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceTransactionSummaryResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
}
