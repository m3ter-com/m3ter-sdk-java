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
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.BalanceTransactionCreateParams
import com.m3ter.sdk.models.BalanceTransactionListParams
import com.m3ter.sdk.models.BalanceTransactionListResponse
import com.m3ter.sdk.models.Transaction

class TransactionServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : TransactionService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Transaction> =
        jsonHandler<Transaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Add a Transaction to a Balance. This endpoint allows you to create a new Transaction amount
     * for a Balance. This amount then becomes available at billing for draw-down to cover charges
     * due. The Transaction details should be provided in the request body.
     *
     * Before you can add a Transaction amount, you must first set up Transaction Types at the
     * Organization Level - see the
     * [Transaction Type](https://www.m3ter.com/docs/api#tag/TransactionType) section in this API
     * Reference for more details. You can then use this call to add an instance of a Transaction
     * Type to a Balance.
     *
     * **Note:** If you have a customer whose payment is in a different currency to the Balance
     * currency, you can use the `paid` and `paidCurrency` request parameters to record the amount
     * paid and alternative currency respectively. For example, you might add a Transaction amount
     * of 200 USD to a Balance on a customer Account where the customer actually paid you 50 units
     * in virtual currency X.
     */
    override fun create(
        params: BalanceTransactionCreateParams,
        requestOptions: RequestOptions
    ): Transaction {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "balances",
                    params.getPathParam(1),
                    "transactions"
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<BalanceTransactionListResponse> =
        jsonHandler<BalanceTransactionListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve all Transactions for a specific Balance.
     *
     * This endpoint returns a list of all Transactions associated with a specific Balance. You can
     * paginate through the Transactions by using the `pageSize` and `nextToken` parameters.
     */
    override fun list(
        params: BalanceTransactionListParams,
        requestOptions: RequestOptions
    ): BalanceTransactionListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "balances",
                    params.getPathParam(1),
                    "transactions"
                )
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
