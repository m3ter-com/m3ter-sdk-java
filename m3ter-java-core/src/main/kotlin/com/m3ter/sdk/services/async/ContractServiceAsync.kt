// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.ContractCreateParams
import com.m3ter.sdk.models.ContractDeleteParams
import com.m3ter.sdk.models.ContractEndDateBillingEntitiesParams
import com.m3ter.sdk.models.ContractEndDateBillingEntitiesResponse
import com.m3ter.sdk.models.ContractListPageAsync
import com.m3ter.sdk.models.ContractListParams
import com.m3ter.sdk.models.ContractResponse
import com.m3ter.sdk.models.ContractRetrieveParams
import com.m3ter.sdk.models.ContractUpdateParams
import java.util.concurrent.CompletableFuture

interface ContractServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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
    ): CompletableFuture<ContractResponse>

    /** Retrieves the Contract with the given UUID. Used to obtain the details of a Contract. */
    @JvmOverloads
    fun retrieve(
        params: ContractRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractResponse>

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
    ): CompletableFuture<ContractResponse>

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
    ): CompletableFuture<ContractResponse>

    /**
     * Apply the specified end-date to billing entities associated with Accounts the Contract has
     * been added to, and apply the end-date to the Contract itself.
     *
     * **NOTES:**
     * - If you want to apply the end-date to the Contract _itself_ - the Contract `id` you use as
     *   the required PATH PARAMETER - you must also specify `CONTRACT` as a `billingEntities`
     *   option in the request body schema.
     * - Only the Contract whose id you specify for the PATH PARAMETER will be end-dated. If there
     *   are other Contracts associated with the Account, these will not be end-dated.
     * - When you successfully end-date billing entities, the version number of each entity is
     *   incremented.
     */
    @JvmOverloads
    fun endDateBillingEntities(
        params: ContractEndDateBillingEntitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractEndDateBillingEntitiesResponse>

    /**
     * A view of [ContractServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/contracts`, but is otherwise
         * the same as [ContractServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ContractCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/contracts/{id}`, but is
         * otherwise the same as [ContractServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ContractRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/contracts/{id}`, but is
         * otherwise the same as [ContractServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: ContractUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/contracts`, but is otherwise
         * the same as [ContractServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ContractListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/contracts/{id}`, but is
         * otherwise the same as [ContractServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: ContractDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/contracts/{id}/enddatebillingentities`, but is otherwise the same
         * as [ContractServiceAsync.endDateBillingEntities].
         */
        @JvmOverloads
        @MustBeClosed
        fun endDateBillingEntities(
            params: ContractEndDateBillingEntitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractEndDateBillingEntitiesResponse>>
    }
}
