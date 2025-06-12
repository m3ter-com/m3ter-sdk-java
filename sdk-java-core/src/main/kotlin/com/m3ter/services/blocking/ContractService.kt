// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.ContractCreateParams
import com.m3ter.models.ContractDeleteParams
import com.m3ter.models.ContractEndDateBillingEntitiesParams
import com.m3ter.models.ContractEndDateBillingEntitiesResponse
import com.m3ter.models.ContractListPage
import com.m3ter.models.ContractListParams
import com.m3ter.models.ContractResponse
import com.m3ter.models.ContractRetrieveParams
import com.m3ter.models.ContractUpdateParams
import java.util.function.Consumer

interface ContractService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContractService

    /**
     * Create a new Contract.
     *
     * Creates a new Contract for the specified Account. The Contract includes information such as
     * the associated Account along with start and end dates.
     */
    fun create(params: ContractCreateParams): ContractResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ContractCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractResponse

    /** Retrieves the Contract with the given UUID. Used to obtain the details of a Contract. */
    fun retrieve(id: String): ContractResponse = retrieve(id, ContractRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ContractRetrieveParams = ContractRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ContractRetrieveParams = ContractRetrieveParams.none(),
    ): ContractResponse = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ContractRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractResponse

    /** @see [retrieve] */
    fun retrieve(params: ContractRetrieveParams): ContractResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): ContractResponse =
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
    fun update(id: String, params: ContractUpdateParams): ContractResponse =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: ContractUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: ContractUpdateParams): ContractResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ContractUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractResponse

    /**
     * Retrieves a list of Contracts by Organization ID. Supports pagination and includes various
     * query parameters to filter the Contracts returned based on Contract IDs or short codes.
     */
    fun list(): ContractListPage = list(ContractListParams.none())

    /** @see [list] */
    fun list(
        params: ContractListParams = ContractListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractListPage

    /** @see [list] */
    fun list(params: ContractListParams = ContractListParams.none()): ContractListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ContractListPage =
        list(ContractListParams.none(), requestOptions)

    /**
     * Deletes the Contract with the specified UUID. Used to remove an existing Contract from an
     * Account.
     *
     * **Note:** This call will fail if there are any AccountPlans or Commitments that have been
     * added to the Contract.
     */
    fun delete(id: String): ContractResponse = delete(id, ContractDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: ContractDeleteParams = ContractDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: ContractDeleteParams = ContractDeleteParams.none(),
    ): ContractResponse = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ContractDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractResponse

    /** @see [delete] */
    fun delete(params: ContractDeleteParams): ContractResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): ContractResponse =
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
    ): ContractEndDateBillingEntitiesResponse =
        endDateBillingEntities(id, params, RequestOptions.none())

    /** @see [endDateBillingEntities] */
    fun endDateBillingEntities(
        id: String,
        params: ContractEndDateBillingEntitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractEndDateBillingEntitiesResponse =
        endDateBillingEntities(params.toBuilder().id(id).build(), requestOptions)

    /** @see [endDateBillingEntities] */
    fun endDateBillingEntities(
        params: ContractEndDateBillingEntitiesParams
    ): ContractEndDateBillingEntitiesResponse =
        endDateBillingEntities(params, RequestOptions.none())

    /** @see [endDateBillingEntities] */
    fun endDateBillingEntities(
        params: ContractEndDateBillingEntitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContractEndDateBillingEntitiesResponse

    /** A view of [ContractService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ContractService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/contracts`, but is otherwise
         * the same as [ContractService.create].
         */
        @MustBeClosed
        fun create(params: ContractCreateParams): HttpResponseFor<ContractResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ContractCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/contracts/{id}`, but is
         * otherwise the same as [ContractService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<ContractResponse> =
            retrieve(id, ContractRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ContractRetrieveParams = ContractRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ContractRetrieveParams = ContractRetrieveParams.none(),
        ): HttpResponseFor<ContractResponse> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ContractRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: ContractRetrieveParams): HttpResponseFor<ContractResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContractResponse> =
            retrieve(id, ContractRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/contracts/{id}`, but is
         * otherwise the same as [ContractService.update].
         */
        @MustBeClosed
        fun update(id: String, params: ContractUpdateParams): HttpResponseFor<ContractResponse> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: ContractUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(params: ContractUpdateParams): HttpResponseFor<ContractResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ContractUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/contracts`, but is otherwise
         * the same as [ContractService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ContractListPage> = list(ContractListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ContractListParams = ContractListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ContractListParams = ContractListParams.none()
        ): HttpResponseFor<ContractListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ContractListPage> =
            list(ContractListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/contracts/{id}`, but is
         * otherwise the same as [ContractService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<ContractResponse> =
            delete(id, ContractDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: ContractDeleteParams = ContractDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: ContractDeleteParams = ContractDeleteParams.none(),
        ): HttpResponseFor<ContractResponse> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ContractDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: ContractDeleteParams): HttpResponseFor<ContractResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponseFor<ContractResponse> =
            delete(id, ContractDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/contracts/{id}/enddatebillingentities`, but is otherwise the same
         * as [ContractService.endDateBillingEntities].
         */
        @MustBeClosed
        fun endDateBillingEntities(
            id: String,
            params: ContractEndDateBillingEntitiesParams,
        ): HttpResponseFor<ContractEndDateBillingEntitiesResponse> =
            endDateBillingEntities(id, params, RequestOptions.none())

        /** @see [endDateBillingEntities] */
        @MustBeClosed
        fun endDateBillingEntities(
            id: String,
            params: ContractEndDateBillingEntitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractEndDateBillingEntitiesResponse> =
            endDateBillingEntities(params.toBuilder().id(id).build(), requestOptions)

        /** @see [endDateBillingEntities] */
        @MustBeClosed
        fun endDateBillingEntities(
            params: ContractEndDateBillingEntitiesParams
        ): HttpResponseFor<ContractEndDateBillingEntitiesResponse> =
            endDateBillingEntities(params, RequestOptions.none())

        /** @see [endDateBillingEntities] */
        @MustBeClosed
        fun endDateBillingEntities(
            params: ContractEndDateBillingEntitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContractEndDateBillingEntitiesResponse>
    }
}
