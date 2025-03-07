// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.Balance
import com.m3ter.sdk.models.BalanceCreateParams
import com.m3ter.sdk.models.BalanceDeleteParams
import com.m3ter.sdk.models.BalanceListPage
import com.m3ter.sdk.models.BalanceListParams
import com.m3ter.sdk.models.BalanceRetrieveParams
import com.m3ter.sdk.models.BalanceUpdateParams
import com.m3ter.sdk.services.blocking.balances.TransactionService

interface BalanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun transactions(): TransactionService

    /**
     * Create a new Balance for the given end customer Account.
     *
     * This endpoint allows you to create a new Balance for a specific end customer Account. The
     * Balance details should be provided in the request body.
     */
    fun create(params: BalanceCreateParams): Balance = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BalanceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Balance

    /**
     * Retrieve a specific Balance.
     *
     * This endpoint returns the details of the specified Balance.
     */
    fun retrieve(params: BalanceRetrieveParams): Balance = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BalanceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Balance

    /**
     * Update a specific Balance.
     *
     * This endpoint allows you to update the details of a specific Balance. The updated Balance
     * details should be provided in the request body.
     */
    fun update(params: BalanceUpdateParams): Balance = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: BalanceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Balance

    /**
     * Retrieve a list of all Balances for your Organization.
     *
     * This endpoint returns a list of all Balances associated with your organization. You can
     * filter the Balances by the end customer's Account UUID and end dates, and paginate through
     * them using the `pageSize` and `nextToken` parameters.
     */
    fun list(params: BalanceListParams): BalanceListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: BalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceListPage

    /**
     * Delete a specific Balance.
     *
     * This endpoint allows you to delete a specific Balance with the given UUID.
     */
    fun delete(params: BalanceDeleteParams): Balance = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: BalanceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Balance

    /** A view of [BalanceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun transactions(): TransactionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/balances`, but is otherwise
         * the same as [BalanceService.create].
         */
        @MustBeClosed
        fun create(params: BalanceCreateParams): HttpResponseFor<Balance> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: BalanceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Balance>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/balances/{id}`, but is
         * otherwise the same as [BalanceService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: BalanceRetrieveParams): HttpResponseFor<Balance> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BalanceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Balance>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/balances/{id}`, but is
         * otherwise the same as [BalanceService.update].
         */
        @MustBeClosed
        fun update(params: BalanceUpdateParams): HttpResponseFor<Balance> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: BalanceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Balance>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/balances`, but is otherwise
         * the same as [BalanceService.list].
         */
        @MustBeClosed
        fun list(params: BalanceListParams): HttpResponseFor<BalanceListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BalanceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceListPage>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/balances/{id}`, but is
         * otherwise the same as [BalanceService.delete].
         */
        @MustBeClosed
        fun delete(params: BalanceDeleteParams): HttpResponseFor<Balance> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: BalanceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Balance>
    }
}
