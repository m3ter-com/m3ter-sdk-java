// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.ContractCreateParams
import com.m3ter.models.ContractDeleteParams
import com.m3ter.models.ContractEndDateBillingEntitiesParams
import com.m3ter.models.ContractEndDateBillingEntitiesResponse
import com.m3ter.models.ContractListPageAsync
import com.m3ter.models.ContractListParams
import com.m3ter.models.ContractResponse
import com.m3ter.models.ContractRetrieveParams
import com.m3ter.models.ContractUpdateParams
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
    fun create(params: ContractCreateParams): CompletableFuture<ContractResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ContractCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractResponse>

    /** Retrieves the Contract with the given UUID. Used to obtain the details of a Contract. */
    fun retrieve(id: String): CompletableFuture<ContractResponse> =
        retrieve(id, ContractRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ContractRetrieveParams = ContractRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ContractRetrieveParams = ContractRetrieveParams.none(),
    ): CompletableFuture<ContractResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ContractRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractResponse>

    /** @see [retrieve] */
    fun retrieve(params: ContractRetrieveParams): CompletableFuture<ContractResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<ContractResponse> =
        retrieve(id, ContractRetrieveParams.none(), requestOptions)

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
    fun update(id: String, params: ContractUpdateParams): CompletableFuture<ContractResponse> =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: ContractUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: ContractUpdateParams): CompletableFuture<ContractResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ContractUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractResponse>

    /**
     * Retrieves a list of Contracts by Organization ID. Supports pagination and includes various
     * query parameters to filter the Contracts returned based on Contract IDs or short codes.
     */
    fun list(): CompletableFuture<ContractListPageAsync> = list(ContractListParams.none())

    /** @see [list] */
    fun list(
        params: ContractListParams = ContractListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractListPageAsync>

    /** @see [list] */
    fun list(
        params: ContractListParams = ContractListParams.none()
    ): CompletableFuture<ContractListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ContractListPageAsync> =
        list(ContractListParams.none(), requestOptions)

    /**
     * Deletes the Contract with the specified UUID. Used to remove an existing Contract from an
     * Account.
     *
     * **Note:** This call will fail if there are any AccountPlans or Commitments that have been
     * added to the Contract.
     */
    fun delete(id: String): CompletableFuture<ContractResponse> =
        delete(id, ContractDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: ContractDeleteParams = ContractDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: ContractDeleteParams = ContractDeleteParams.none(),
    ): CompletableFuture<ContractResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ContractDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractResponse>

    /** @see [delete] */
    fun delete(params: ContractDeleteParams): CompletableFuture<ContractResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<ContractResponse> =
        delete(id, ContractDeleteParams.none(), requestOptions)

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
    fun endDateBillingEntities(
        id: String,
        params: ContractEndDateBillingEntitiesParams,
    ): CompletableFuture<ContractEndDateBillingEntitiesResponse> =
        endDateBillingEntities(id, params, RequestOptions.none())

    /** @see [endDateBillingEntities] */
    fun endDateBillingEntities(
        id: String,
        params: ContractEndDateBillingEntitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContractEndDateBillingEntitiesResponse> =
        endDateBillingEntities(params.toBuilder().id(id).build(), requestOptions)

    /** @see [endDateBillingEntities] */
    fun endDateBillingEntities(
        params: ContractEndDateBillingEntitiesParams
    ): CompletableFuture<ContractEndDateBillingEntitiesResponse> =
        endDateBillingEntities(params, RequestOptions.none())

    /** @see [endDateBillingEntities] */
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
        @MustBeClosed
        fun create(
            params: ContractCreateParams
        ): CompletableFuture<HttpResponseFor<ContractResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ContractCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/contracts/{id}`, but is
         * otherwise the same as [ContractServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ContractResponse>> =
            retrieve(id, ContractRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ContractRetrieveParams = ContractRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ContractRetrieveParams = ContractRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ContractResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ContractRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ContractRetrieveParams
        ): CompletableFuture<HttpResponseFor<ContractResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContractResponse>> =
            retrieve(id, ContractRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/contracts/{id}`, but is
         * otherwise the same as [ContractServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: ContractUpdateParams,
        ): CompletableFuture<HttpResponseFor<ContractResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: ContractUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ContractUpdateParams
        ): CompletableFuture<HttpResponseFor<ContractResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ContractUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/contracts`, but is otherwise
         * the same as [ContractServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ContractListPageAsync>> =
            list(ContractListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ContractListParams = ContractListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ContractListParams = ContractListParams.none()
        ): CompletableFuture<HttpResponseFor<ContractListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ContractListPageAsync>> =
            list(ContractListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/contracts/{id}`, but is
         * otherwise the same as [ContractServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(id: String): CompletableFuture<HttpResponseFor<ContractResponse>> =
            delete(id, ContractDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: ContractDeleteParams = ContractDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: ContractDeleteParams = ContractDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ContractResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ContractDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractResponse>>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ContractDeleteParams
        ): CompletableFuture<HttpResponseFor<ContractResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContractResponse>> =
            delete(id, ContractDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/contracts/{id}/enddatebillingentities`, but is otherwise the same
         * as [ContractServiceAsync.endDateBillingEntities].
         */
        @MustBeClosed
        fun endDateBillingEntities(
            id: String,
            params: ContractEndDateBillingEntitiesParams,
        ): CompletableFuture<HttpResponseFor<ContractEndDateBillingEntitiesResponse>> =
            endDateBillingEntities(id, params, RequestOptions.none())

        /** @see [endDateBillingEntities] */
        @MustBeClosed
        fun endDateBillingEntities(
            id: String,
            params: ContractEndDateBillingEntitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractEndDateBillingEntitiesResponse>> =
            endDateBillingEntities(params.toBuilder().id(id).build(), requestOptions)

        /** @see [endDateBillingEntities] */
        @MustBeClosed
        fun endDateBillingEntities(
            params: ContractEndDateBillingEntitiesParams
        ): CompletableFuture<HttpResponseFor<ContractEndDateBillingEntitiesResponse>> =
            endDateBillingEntities(params, RequestOptions.none())

        /** @see [endDateBillingEntities] */
        @MustBeClosed
        fun endDateBillingEntities(
            params: ContractEndDateBillingEntitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContractEndDateBillingEntitiesResponse>>
    }
}
