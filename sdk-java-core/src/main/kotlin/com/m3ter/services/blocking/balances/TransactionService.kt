// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.balances

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.BalanceTransactionCreateParams
import com.m3ter.models.BalanceTransactionListPage
import com.m3ter.models.BalanceTransactionListParams
import com.m3ter.models.BalanceTransactionSummaryParams
import com.m3ter.models.BalanceTransactionSummaryResponse
import com.m3ter.models.TransactionResponse
import java.util.function.Consumer

interface TransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionService

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
    fun create(balanceId: String, params: BalanceTransactionCreateParams): TransactionResponse =
        create(balanceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        balanceId: String,
        params: BalanceTransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionResponse = create(params.toBuilder().balanceId(balanceId).build(), requestOptions)

    /** @see create */
    fun create(params: BalanceTransactionCreateParams): TransactionResponse =
        create(params, RequestOptions.none())

    /** @see create */
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
    fun list(balanceId: String): BalanceTransactionListPage =
        list(balanceId, BalanceTransactionListParams.none())

    /** @see list */
    fun list(
        balanceId: String,
        params: BalanceTransactionListParams = BalanceTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceTransactionListPage =
        list(params.toBuilder().balanceId(balanceId).build(), requestOptions)

    /** @see list */
    fun list(
        balanceId: String,
        params: BalanceTransactionListParams = BalanceTransactionListParams.none(),
    ): BalanceTransactionListPage = list(balanceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: BalanceTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceTransactionListPage

    /** @see list */
    fun list(params: BalanceTransactionListParams): BalanceTransactionListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(balanceId: String, requestOptions: RequestOptions): BalanceTransactionListPage =
        list(balanceId, BalanceTransactionListParams.none(), requestOptions)

    /**
     * Retrieves the Balance Transactions Summary for a given Balance.
     *
     * The response contains useful recorded and calculated Transaction amounts created for a
     * Balance during the time it is active for the Account, including amounts relevant to any
     * rollover amount configured for a Balance:
     * - `totalCreditAmount`. The sum of all credits amounts created for the Balance.
     * - `totalDebitAmount`. The sum of all debit amounts created for the Balance.
     * - `initialCreditAmount`. The initial credit amount created for the Balance.
     * - `expiredBalanceAmount`. The amount of the Balance remaining at the time the Balance expires
     *   and which is not included in any configured Rollover amount. For example, suppose a Balance
     *   reaches its end date and $1000 credit remains unused. If the Balance is configured to
     *   rollover $800, then the `expiredBalanceAmount` is calculated as $1000 - $800 = $200.
     * - `rolloverConsumed`. The sum of debits made against the configured rollover amount. Note
     *   that this amount is dynamic relative to when the API call is made until either the rollover
     *   end date is reached or the cap configured for the rollover amount is reached, after which
     *   it will be unchanged. If no rollover is configured for a Balance, then this is ignored.
     * - `balanceConsumed`. The sum of debits made against the Balance. Note that this amount is
     *   dynamic relative to when the API call is made until either the Balance end date is reached
     *   or the available Balance amount reaches zero, after which it will be unchanged.
     */
    fun summary(balanceId: String): BalanceTransactionSummaryResponse =
        summary(balanceId, BalanceTransactionSummaryParams.none())

    /** @see summary */
    fun summary(
        balanceId: String,
        params: BalanceTransactionSummaryParams = BalanceTransactionSummaryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceTransactionSummaryResponse =
        summary(params.toBuilder().balanceId(balanceId).build(), requestOptions)

    /** @see summary */
    fun summary(
        balanceId: String,
        params: BalanceTransactionSummaryParams = BalanceTransactionSummaryParams.none(),
    ): BalanceTransactionSummaryResponse = summary(balanceId, params, RequestOptions.none())

    /** @see summary */
    fun summary(
        params: BalanceTransactionSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceTransactionSummaryResponse

    /** @see summary */
    fun summary(params: BalanceTransactionSummaryParams): BalanceTransactionSummaryResponse =
        summary(params, RequestOptions.none())

    /** @see summary */
    fun summary(
        balanceId: String,
        requestOptions: RequestOptions,
    ): BalanceTransactionSummaryResponse =
        summary(balanceId, BalanceTransactionSummaryParams.none(), requestOptions)

    /**
     * A view of [TransactionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/balances/{balanceId}/transactions`, but is otherwise the same as
         * [TransactionService.create].
         */
        @MustBeClosed
        fun create(
            balanceId: String,
            params: BalanceTransactionCreateParams,
        ): HttpResponseFor<TransactionResponse> = create(balanceId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            balanceId: String,
            params: BalanceTransactionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionResponse> =
            create(params.toBuilder().balanceId(balanceId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: BalanceTransactionCreateParams): HttpResponseFor<TransactionResponse> =
            create(params, RequestOptions.none())

        /** @see create */
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
        fun list(balanceId: String): HttpResponseFor<BalanceTransactionListPage> =
            list(balanceId, BalanceTransactionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            balanceId: String,
            params: BalanceTransactionListParams = BalanceTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceTransactionListPage> =
            list(params.toBuilder().balanceId(balanceId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            balanceId: String,
            params: BalanceTransactionListParams = BalanceTransactionListParams.none(),
        ): HttpResponseFor<BalanceTransactionListPage> =
            list(balanceId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BalanceTransactionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceTransactionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BalanceTransactionListParams
        ): HttpResponseFor<BalanceTransactionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            balanceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceTransactionListPage> =
            list(balanceId, BalanceTransactionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/balances/{balanceId}/transactions/summary`, but is otherwise the
         * same as [TransactionService.summary].
         */
        @MustBeClosed
        fun summary(balanceId: String): HttpResponseFor<BalanceTransactionSummaryResponse> =
            summary(balanceId, BalanceTransactionSummaryParams.none())

        /** @see summary */
        @MustBeClosed
        fun summary(
            balanceId: String,
            params: BalanceTransactionSummaryParams = BalanceTransactionSummaryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceTransactionSummaryResponse> =
            summary(params.toBuilder().balanceId(balanceId).build(), requestOptions)

        /** @see summary */
        @MustBeClosed
        fun summary(
            balanceId: String,
            params: BalanceTransactionSummaryParams = BalanceTransactionSummaryParams.none(),
        ): HttpResponseFor<BalanceTransactionSummaryResponse> =
            summary(balanceId, params, RequestOptions.none())

        /** @see summary */
        @MustBeClosed
        fun summary(
            params: BalanceTransactionSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceTransactionSummaryResponse>

        /** @see summary */
        @MustBeClosed
        fun summary(
            params: BalanceTransactionSummaryParams
        ): HttpResponseFor<BalanceTransactionSummaryResponse> =
            summary(params, RequestOptions.none())

        /** @see summary */
        @MustBeClosed
        fun summary(
            balanceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceTransactionSummaryResponse> =
            summary(balanceId, BalanceTransactionSummaryParams.none(), requestOptions)
    }
}
