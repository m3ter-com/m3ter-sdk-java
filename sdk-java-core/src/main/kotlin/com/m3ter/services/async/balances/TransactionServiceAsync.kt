// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.balances

import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.BalanceTransactionCreateParams
import com.m3ter.models.BalanceTransactionListPageAsync
import com.m3ter.models.BalanceTransactionListParams
import com.m3ter.models.BalanceTransactionSummaryParams
import com.m3ter.models.BalanceTransactionSummaryResponse
import com.m3ter.models.TransactionResponse
import java.util.concurrent.CompletableFuture

interface TransactionServiceAsync {

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
    fun create(
        balanceId: String,
        params: BalanceTransactionCreateParams,
    ): CompletableFuture<TransactionResponse> = create(balanceId, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        balanceId: String,
        params: BalanceTransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionResponse> =
        create(params.toBuilder().balanceId(balanceId).build(), requestOptions)

    /** @see [create] */
    fun create(params: BalanceTransactionCreateParams): CompletableFuture<TransactionResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BalanceTransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionResponse>

    /**
     * Retrieve all Transactions for a specific Balance.
     *
     * This endpoint returns a list of all Transactions associated with a specific Balance. You can
     * paginate through the Transactions by using the `pageSize` and `nextToken` parameters.
     */
    fun list(balanceId: String): CompletableFuture<BalanceTransactionListPageAsync> =
        list(balanceId, BalanceTransactionListParams.none())

    /** @see [list] */
    fun list(
        balanceId: String,
        params: BalanceTransactionListParams = BalanceTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceTransactionListPageAsync> =
        list(params.toBuilder().balanceId(balanceId).build(), requestOptions)

    /** @see [list] */
    fun list(
        balanceId: String,
        params: BalanceTransactionListParams = BalanceTransactionListParams.none(),
    ): CompletableFuture<BalanceTransactionListPageAsync> =
        list(balanceId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: BalanceTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceTransactionListPageAsync>

    /** @see [list] */
    fun list(
        params: BalanceTransactionListParams
    ): CompletableFuture<BalanceTransactionListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        balanceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceTransactionListPageAsync> =
        list(balanceId, BalanceTransactionListParams.none(), requestOptions)

    /** Retrieves the Balance Transactions Summary for a given Balance. */
    fun summary(balanceId: String): CompletableFuture<BalanceTransactionSummaryResponse> =
        summary(balanceId, BalanceTransactionSummaryParams.none())

    /** @see [summary] */
    fun summary(
        balanceId: String,
        params: BalanceTransactionSummaryParams = BalanceTransactionSummaryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceTransactionSummaryResponse> =
        summary(params.toBuilder().balanceId(balanceId).build(), requestOptions)

    /** @see [summary] */
    fun summary(
        balanceId: String,
        params: BalanceTransactionSummaryParams = BalanceTransactionSummaryParams.none(),
    ): CompletableFuture<BalanceTransactionSummaryResponse> =
        summary(balanceId, params, RequestOptions.none())

    /** @see [summary] */
    fun summary(
        params: BalanceTransactionSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceTransactionSummaryResponse>

    /** @see [summary] */
    fun summary(
        params: BalanceTransactionSummaryParams
    ): CompletableFuture<BalanceTransactionSummaryResponse> = summary(params, RequestOptions.none())

    /** @see [summary] */
    fun summary(
        balanceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceTransactionSummaryResponse> =
        summary(balanceId, BalanceTransactionSummaryParams.none(), requestOptions)

    /**
     * A view of [TransactionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/balances/{balanceId}/transactions`, but is otherwise the same as
         * [TransactionServiceAsync.create].
         */
        fun create(
            balanceId: String,
            params: BalanceTransactionCreateParams,
        ): CompletableFuture<HttpResponseFor<TransactionResponse>> =
            create(balanceId, params, RequestOptions.none())

        /** @see [create] */
        fun create(
            balanceId: String,
            params: BalanceTransactionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionResponse>> =
            create(params.toBuilder().balanceId(balanceId).build(), requestOptions)

        /** @see [create] */
        fun create(
            params: BalanceTransactionCreateParams
        ): CompletableFuture<HttpResponseFor<TransactionResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: BalanceTransactionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/balances/{balanceId}/transactions`, but is otherwise the same as
         * [TransactionServiceAsync.list].
         */
        fun list(
            balanceId: String
        ): CompletableFuture<HttpResponseFor<BalanceTransactionListPageAsync>> =
            list(balanceId, BalanceTransactionListParams.none())

        /** @see [list] */
        fun list(
            balanceId: String,
            params: BalanceTransactionListParams = BalanceTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceTransactionListPageAsync>> =
            list(params.toBuilder().balanceId(balanceId).build(), requestOptions)

        /** @see [list] */
        fun list(
            balanceId: String,
            params: BalanceTransactionListParams = BalanceTransactionListParams.none(),
        ): CompletableFuture<HttpResponseFor<BalanceTransactionListPageAsync>> =
            list(balanceId, params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: BalanceTransactionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceTransactionListPageAsync>>

        /** @see [list] */
        fun list(
            params: BalanceTransactionListParams
        ): CompletableFuture<HttpResponseFor<BalanceTransactionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            balanceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceTransactionListPageAsync>> =
            list(balanceId, BalanceTransactionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/balances/{balanceId}/transactions/summary`, but is otherwise the
         * same as [TransactionServiceAsync.summary].
         */
        fun summary(
            balanceId: String
        ): CompletableFuture<HttpResponseFor<BalanceTransactionSummaryResponse>> =
            summary(balanceId, BalanceTransactionSummaryParams.none())

        /** @see [summary] */
        fun summary(
            balanceId: String,
            params: BalanceTransactionSummaryParams = BalanceTransactionSummaryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceTransactionSummaryResponse>> =
            summary(params.toBuilder().balanceId(balanceId).build(), requestOptions)

        /** @see [summary] */
        fun summary(
            balanceId: String,
            params: BalanceTransactionSummaryParams = BalanceTransactionSummaryParams.none(),
        ): CompletableFuture<HttpResponseFor<BalanceTransactionSummaryResponse>> =
            summary(balanceId, params, RequestOptions.none())

        /** @see [summary] */
        fun summary(
            params: BalanceTransactionSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceTransactionSummaryResponse>>

        /** @see [summary] */
        fun summary(
            params: BalanceTransactionSummaryParams
        ): CompletableFuture<HttpResponseFor<BalanceTransactionSummaryResponse>> =
            summary(params, RequestOptions.none())

        /** @see [summary] */
        fun summary(
            balanceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceTransactionSummaryResponse>> =
            summary(balanceId, BalanceTransactionSummaryParams.none(), requestOptions)
    }
}
