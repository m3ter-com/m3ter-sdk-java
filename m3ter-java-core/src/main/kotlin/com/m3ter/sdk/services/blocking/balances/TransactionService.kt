// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking.balances

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.BalanceTransactionCreateParams
import com.m3ter.sdk.models.BalanceTransactionListPage
import com.m3ter.sdk.models.BalanceTransactionListParams
import com.m3ter.sdk.models.BalanceTransactionSummaryParams
import com.m3ter.sdk.models.BalanceTransactionSummaryResponse
import com.m3ter.sdk.models.TransactionResponse

interface TransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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
    fun create(params: BalanceTransactionCreateParams): TransactionResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BalanceTransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionResponse

    /**
     * Retrieve all Transactions for a specific Balance.
     *
     * This endpoint returns a list of all Transactions associated with a specific Balance. You can
     * paginate through the Transactions by using the `pageSize` and `nextToken` parameters.
     */
    fun list(params: BalanceTransactionListParams): BalanceTransactionListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: BalanceTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceTransactionListPage

    /** Retrieves the Balance Transactions Summary for a given Balance. */
    fun summary(params: BalanceTransactionSummaryParams): BalanceTransactionSummaryResponse =
        summary(params, RequestOptions.none())

    /** @see [summary] */
    fun summary(
        params: BalanceTransactionSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceTransactionSummaryResponse

    /**
     * A view of [TransactionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/balances/{balanceId}/transactions`, but is otherwise the same as
         * [TransactionService.create].
         */
        @MustBeClosed
        fun create(params: BalanceTransactionCreateParams): HttpResponseFor<TransactionResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: BalanceTransactionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/balances/{balanceId}/transactions`, but is otherwise the same as
         * [TransactionService.list].
         */
        @MustBeClosed
        fun list(
            params: BalanceTransactionListParams
        ): HttpResponseFor<BalanceTransactionListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BalanceTransactionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceTransactionListPage>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/balances/{balanceId}/transactions/summary`, but is otherwise the
         * same as [TransactionService.summary].
         */
        @MustBeClosed
        fun summary(
            params: BalanceTransactionSummaryParams
        ): HttpResponseFor<BalanceTransactionSummaryResponse> =
            summary(params, RequestOptions.none())

        /** @see [summary] */
        @MustBeClosed
        fun summary(
            params: BalanceTransactionSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceTransactionSummaryResponse>
    }
}
