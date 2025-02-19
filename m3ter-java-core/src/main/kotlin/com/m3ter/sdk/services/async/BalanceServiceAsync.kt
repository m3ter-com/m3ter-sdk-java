// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.Balance
import com.m3ter.sdk.models.BalanceCreateParams
import com.m3ter.sdk.models.BalanceDeleteParams
import com.m3ter.sdk.models.BalanceListPageAsync
import com.m3ter.sdk.models.BalanceListParams
import com.m3ter.sdk.models.BalanceRetrieveParams
import com.m3ter.sdk.models.BalanceUpdateParams
import com.m3ter.sdk.services.async.balances.TransactionServiceAsync
import java.util.concurrent.CompletableFuture

interface BalanceServiceAsync {

    fun transactions(): TransactionServiceAsync

    /**
     * Create a new Balance for the given end customer Account.
     *
     * This endpoint allows you to create a new Balance for a specific end customer Account. The
     * Balance details should be provided in the request body.
     */
    @JvmOverloads
    fun create(
        params: BalanceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Balance>

    /**
     * Retrieve a specific Balance.
     *
     * This endpoint returns the details of the specified Balance.
     */
    @JvmOverloads
    fun retrieve(
        params: BalanceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Balance>

    /**
     * Update a specific Balance.
     *
     * This endpoint allows you to update the details of a specific Balance. The updated Balance
     * details should be provided in the request body.
     */
    @JvmOverloads
    fun update(
        params: BalanceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Balance>

    /**
     * Retrieve a list of all Balances for your Organization.
     *
     * This endpoint returns a list of all Balances associated with your organization. You can
     * filter the Balances by the end customer's Account UUID and end dates, and paginate through
     * them using the `pageSize` and `nextToken` parameters.
     */
    @JvmOverloads
    fun list(
        params: BalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceListPageAsync>

    /**
     * Delete a specific Balance.
     *
     * This endpoint allows you to delete a specific Balance with the given UUID.
     */
    @JvmOverloads
    fun delete(
        params: BalanceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Balance>
}
