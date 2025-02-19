// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.Contract
import com.m3ter.sdk.models.ContractCreateParams
import com.m3ter.sdk.models.ContractDeleteParams
import com.m3ter.sdk.models.ContractListPageAsync
import com.m3ter.sdk.models.ContractListParams
import com.m3ter.sdk.models.ContractRetrieveParams
import com.m3ter.sdk.models.ContractUpdateParams
import java.util.concurrent.CompletableFuture

interface ContractServiceAsync {

    /**
     * Create a new Contract.
     *
     * Creates a new Contract for the specified Account. The Contract includes information such as
     * the associated Account along with start and end dates.
     */
    @JvmOverloads
    fun create(
        params: ContractCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Contract>

    /** Retrieves the Contract with the given UUID. Used to obtain the details of a Contract. */
    @JvmOverloads
    fun retrieve(
        params: ContractRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Contract>

    /**
     * Update the Contract with the given UUID.
     *
     * This endpoint updates the details of the Contract with the specified ID. Used to modify
     * details of an existing Contract such as the start or end dates.
     *
     * **Note:** If you have created Custom Fields for a Contract, when you use this endpoint to
     * update the Contract use the `customFields` parameter to preserve those Custom Fields. If you
     * omit them from the update request, they will be lost.
     */
    @JvmOverloads
    fun update(
        params: ContractUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Contract>

    /**
     * Retrieves a list of Contracts by Organization ID. Supports pagination and includes various
     * query parameters to filter the Contracts returned based on Contract IDs or short codes.
     */
    @JvmOverloads
    fun list(
        params: ContractListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractListPageAsync>

    /**
     * Deletes the Contract with the specified UUID. Used to remove an existing Contract from an
     * Account.
     *
     * **Note:** This call will fail if there are any AccountPlans or Commitments that have been
     * added to the Contract.
     */
    @JvmOverloads
    fun delete(
        params: ContractDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Contract>
}
