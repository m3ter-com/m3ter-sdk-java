// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.AccountPlanCreateParams
import com.m3ter.models.AccountPlanDeleteParams
import com.m3ter.models.AccountPlanListPage
import com.m3ter.models.AccountPlanListParams
import com.m3ter.models.AccountPlanResponse
import com.m3ter.models.AccountPlanRetrieveParams
import com.m3ter.models.AccountPlanUpdateParams
import java.util.function.Consumer

interface AccountPlanService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountPlanService

    /**
     * Create a new AccountPlan or AccountPlanGroup.
     *
     * This endpoint creates a new AccountPlan or AccountPlanGroup for a specific Account in your
     * Organization. The details of the new AccountPlan or AccountPlanGroup should be supplied in
     * the request body.
     *
     * **Note:** You cannot use this call to create *both* an AccountPlan and AccountPlanGroup for
     * an Account at the same time. If you want to create both for an Account, you must submit two
     * separate calls.
     */
    fun create(params: AccountPlanCreateParams): AccountPlanResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccountPlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountPlanResponse

    /** Retrieve the AccountPlan or AccountPlanGroup details corresponding to the given UUID. */
    fun retrieve(id: String): AccountPlanResponse = retrieve(id, AccountPlanRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AccountPlanRetrieveParams = AccountPlanRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountPlanResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AccountPlanRetrieveParams = AccountPlanRetrieveParams.none(),
    ): AccountPlanResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AccountPlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountPlanResponse

    /** @see retrieve */
    fun retrieve(params: AccountPlanRetrieveParams): AccountPlanResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AccountPlanResponse =
        retrieve(id, AccountPlanRetrieveParams.none(), requestOptions)

    /**
     * Update the AccountPlan or AccountPlanGroup with the given UUID.
     *
     * This endpoint updates a new AccountPlan or AccountPlanGroup for a specific Account in your
     * Organization. The updated information should be provided in the request body.
     *
     * **Notes:**
     * * You cannot use this call to update *both* an AccountPlan and AccountPlanGroup for an
     *   Account at the same time. If you want to update an AccounPlan and an AccountPlanGroup
     *   attached to an Account, you must submit two separate calls.
     * * If you have created Custom Fields for an AccountPlan, when you use this endpoint to update
     *   the AccountPlan use the `customFields` parameter to preserve those Custom Fields. If you
     *   omit them from the update request, they will be lost.
     */
    fun update(id: String, params: AccountPlanUpdateParams): AccountPlanResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: AccountPlanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountPlanResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: AccountPlanUpdateParams): AccountPlanResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AccountPlanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountPlanResponse

    /**
     * Retrieves a list of AccountPlan and AccountPlanGroup entities for the specified Organization.
     * The list can be paginated for easier management, and supports filtering with various query
     * parameters.
     */
    fun list(): AccountPlanListPage = list(AccountPlanListParams.none())

    /** @see list */
    fun list(
        params: AccountPlanListParams = AccountPlanListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountPlanListPage

    /** @see list */
    fun list(params: AccountPlanListParams = AccountPlanListParams.none()): AccountPlanListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AccountPlanListPage =
        list(AccountPlanListParams.none(), requestOptions)

    /**
     * Delete the AccountPlan or AccountPlanGroup with the given UUID.
     *
     * This endpoint deletes an AccountPlan or AccountPlanGroup that has been attached to a specific
     * Account in your Organization.
     */
    fun delete(id: String): AccountPlanResponse = delete(id, AccountPlanDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AccountPlanDeleteParams = AccountPlanDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountPlanResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AccountPlanDeleteParams = AccountPlanDeleteParams.none(),
    ): AccountPlanResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AccountPlanDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountPlanResponse

    /** @see delete */
    fun delete(params: AccountPlanDeleteParams): AccountPlanResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): AccountPlanResponse =
        delete(id, AccountPlanDeleteParams.none(), requestOptions)

    /**
     * A view of [AccountPlanService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountPlanService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/accountplans`, but is
         * otherwise the same as [AccountPlanService.create].
         */
        @MustBeClosed
        fun create(params: AccountPlanCreateParams): HttpResponseFor<AccountPlanResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AccountPlanCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountPlanResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/accountplans/{id}`, but is
         * otherwise the same as [AccountPlanService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AccountPlanResponse> =
            retrieve(id, AccountPlanRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AccountPlanRetrieveParams = AccountPlanRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountPlanResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AccountPlanRetrieveParams = AccountPlanRetrieveParams.none(),
        ): HttpResponseFor<AccountPlanResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AccountPlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountPlanResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AccountPlanRetrieveParams): HttpResponseFor<AccountPlanResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountPlanResponse> =
            retrieve(id, AccountPlanRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/accountplans/{id}`, but is
         * otherwise the same as [AccountPlanService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: AccountPlanUpdateParams,
        ): HttpResponseFor<AccountPlanResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AccountPlanUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountPlanResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: AccountPlanUpdateParams): HttpResponseFor<AccountPlanResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AccountPlanUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountPlanResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/accountplans`, but is
         * otherwise the same as [AccountPlanService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AccountPlanListPage> = list(AccountPlanListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccountPlanListParams = AccountPlanListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountPlanListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccountPlanListParams = AccountPlanListParams.none()
        ): HttpResponseFor<AccountPlanListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccountPlanListPage> =
            list(AccountPlanListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/accountplans/{id}`, but is
         * otherwise the same as [AccountPlanService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<AccountPlanResponse> =
            delete(id, AccountPlanDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AccountPlanDeleteParams = AccountPlanDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountPlanResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AccountPlanDeleteParams = AccountPlanDeleteParams.none(),
        ): HttpResponseFor<AccountPlanResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AccountPlanDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountPlanResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: AccountPlanDeleteParams): HttpResponseFor<AccountPlanResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountPlanResponse> =
            delete(id, AccountPlanDeleteParams.none(), requestOptions)
    }
}
