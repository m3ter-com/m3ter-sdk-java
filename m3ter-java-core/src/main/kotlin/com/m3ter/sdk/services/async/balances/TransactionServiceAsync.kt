// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async.balances

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.BalanceTransactionCreateParams
import com.m3ter.sdk.models.BalanceTransactionListParams
import com.m3ter.sdk.models.BalanceTransactionListResponse
import com.m3ter.sdk.models.Transaction
import java.util.concurrent.CompletableFuture

interface TransactionServiceAsync {

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
    @JvmOverloads
    fun create(
        params: BalanceTransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Transaction>

    /**
     * Retrieve all Transactions for a specific Balance.
     *
     * This endpoint returns a list of all Transactions associated with a specific Balance. You can
     * paginate through the Transactions by using the `pageSize` and `nextToken` parameters.
     */
    @JvmOverloads
    fun list(
        params: BalanceTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BalanceTransactionListResponse>
}
