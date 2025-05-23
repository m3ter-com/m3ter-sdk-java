// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.balances

import com.m3ter.core.ClientOptions
import com.m3ter.core.JsonValue
import com.m3ter.core.RequestOptions
import com.m3ter.core.checkRequired
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
import com.m3ter.models.BalanceTransactionCreateParams
import com.m3ter.models.BalanceTransactionListPage
import com.m3ter.models.BalanceTransactionListPageResponse
import com.m3ter.models.BalanceTransactionListParams
import com.m3ter.models.BalanceTransactionSummaryParams
import com.m3ter.models.BalanceTransactionSummaryResponse
import com.m3ter.models.TransactionResponse
import kotlin.jvm.optionals.getOrNull

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

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<TransactionResponse> =
            jsonHandler<TransactionResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: BalanceTransactionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("balanceId", params.balanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
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

        private val listHandler: Handler<BalanceTransactionListPageResponse> =
            jsonHandler<BalanceTransactionListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: BalanceTransactionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceTransactionListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("balanceId", params.balanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
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
                        BalanceTransactionListPage.builder()
                            .service(TransactionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("balanceId", params.balanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
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
