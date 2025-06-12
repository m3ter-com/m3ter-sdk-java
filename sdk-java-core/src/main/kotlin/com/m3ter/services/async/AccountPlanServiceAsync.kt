// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.AccountPlanCreateParams
import com.m3ter.models.AccountPlanDeleteParams
import com.m3ter.models.AccountPlanListPageAsync
import com.m3ter.models.AccountPlanListParams
import com.m3ter.models.AccountPlanResponse
import com.m3ter.models.AccountPlanRetrieveParams
import com.m3ter.models.AccountPlanUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AccountPlanServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountPlanServiceAsync

    /**
     * Create a new AccountPlan or AccountPlanGroup.
     *
     * This endpoint creates a new AccountPlan or AccountPlanGroup for a specific Account in your
     * Organization. The details of the new AccountPlan or AccountPlanGroup should be supplied in
     * the request body.
     *
     * **Note:** You cannot use this call to create _both_ an AccountPlan and AccountPlanGroup for
     * an Account at the same time. If you want to create both for an Account, you must submit two
     * separate calls.
     */
    fun create(params: AccountPlanCreateParams): CompletableFuture<AccountPlanResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AccountPlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountPlanResponse>

    /** Retrieve the AccountPlan or AccountPlanGroup details corresponding to the given UUID. */
    fun retrieve(id: String): CompletableFuture<AccountPlanResponse> =
        retrieve(id, AccountPlanRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: AccountPlanRetrieveParams = AccountPlanRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountPlanResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: AccountPlanRetrieveParams = AccountPlanRetrieveParams.none(),
    ): CompletableFuture<AccountPlanResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AccountPlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountPlanResponse>

    /** @see [retrieve] */
    fun retrieve(params: AccountPlanRetrieveParams): CompletableFuture<AccountPlanResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountPlanResponse> =
        retrieve(id, AccountPlanRetrieveParams.none(), requestOptions)

    /**
     * Update the AccountPlan or AccountPlanGroup with the given UUID.
     *
     * This endpoint updates a new AccountPlan or AccountPlanGroup for a specific Account in your
     * Organization. The updated information should be provided in the request body.
     *
     * **Notes:**
     * - You cannot use this call to update _both_ an AccountPlan and AccountPlanGroup for an
     *   Account at the same time. If you want to update an AccounPlan and an AccountPlanGroup
     *   attached to an Account, you must submit two separate calls.
     * - If you have created Custom Fields for an AccountPlan, when you use this endpoint to update
     *   the AccountPlan use the `customFields` parameter to preserve those Custom Fields. If you
     *   omit them from the update request, they will be lost.
     */
    fun update(
        id: String,
        params: AccountPlanUpdateParams,
    ): CompletableFuture<AccountPlanResponse> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: AccountPlanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountPlanResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: AccountPlanUpdateParams): CompletableFuture<AccountPlanResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: AccountPlanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountPlanResponse>

    /**
     * Retrieve a list of AccountPlan and AccountPlanGroup entities for the specified Organization.
     *
     * This endpoint retrieves a list of AccountPlans and AccountPlanGroups for a specific
     * Organization. The list can be paginated for easier management, and supports filtering with
     * various parameters.
     *
     * **NOTE:** You cannot use the `product` query parameter as a single filter condition, but must
     * always use it in combination with the `account` query parameter.
     */
    fun list(): CompletableFuture<AccountPlanListPageAsync> = list(AccountPlanListParams.none())

    /** @see [list] */
    fun list(
        params: AccountPlanListParams = AccountPlanListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountPlanListPageAsync>

    /** @see [list] */
    fun list(
        params: AccountPlanListParams = AccountPlanListParams.none()
    ): CompletableFuture<AccountPlanListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccountPlanListPageAsync> =
        list(AccountPlanListParams.none(), requestOptions)

    /**
     * Delete the AccountPlan or AccountPlanGroup with the given UUID.
     *
     * This endpoint deletes an AccountPlan or AccountPlanGroup that has been attached to a specific
     * Account in your Organization.
     */
    fun delete(id: String): CompletableFuture<AccountPlanResponse> =
        delete(id, AccountPlanDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: AccountPlanDeleteParams = AccountPlanDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountPlanResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: AccountPlanDeleteParams = AccountPlanDeleteParams.none(),
    ): CompletableFuture<AccountPlanResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: AccountPlanDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountPlanResponse>

    /** @see [delete] */
    fun delete(params: AccountPlanDeleteParams): CompletableFuture<AccountPlanResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<AccountPlanResponse> =
        delete(id, AccountPlanDeleteParams.none(), requestOptions)

    /**
     * A view of [AccountPlanServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountPlanServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/accountplans`, but is
         * otherwise the same as [AccountPlanServiceAsync.create].
         */
        fun create(
            params: AccountPlanCreateParams
        ): CompletableFuture<HttpResponseFor<AccountPlanResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: AccountPlanCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountPlanResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/accountplans/{id}`, but is
         * otherwise the same as [AccountPlanServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AccountPlanResponse>> =
            retrieve(id, AccountPlanRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: AccountPlanRetrieveParams = AccountPlanRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountPlanResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: AccountPlanRetrieveParams = AccountPlanRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountPlanResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: AccountPlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountPlanResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: AccountPlanRetrieveParams
        ): CompletableFuture<HttpResponseFor<AccountPlanResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountPlanResponse>> =
            retrieve(id, AccountPlanRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/accountplans/{id}`, but is
         * otherwise the same as [AccountPlanServiceAsync.update].
         */
        fun update(
            id: String,
            params: AccountPlanUpdateParams,
        ): CompletableFuture<HttpResponseFor<AccountPlanResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            params: AccountPlanUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountPlanResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            params: AccountPlanUpdateParams
        ): CompletableFuture<HttpResponseFor<AccountPlanResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: AccountPlanUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountPlanResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/accountplans`, but is
         * otherwise the same as [AccountPlanServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AccountPlanListPageAsync>> =
            list(AccountPlanListParams.none())

        /** @see [list] */
        fun list(
            params: AccountPlanListParams = AccountPlanListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountPlanListPageAsync>>

        /** @see [list] */
        fun list(
            params: AccountPlanListParams = AccountPlanListParams.none()
        ): CompletableFuture<HttpResponseFor<AccountPlanListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountPlanListPageAsync>> =
            list(AccountPlanListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/accountplans/{id}`, but is
         * otherwise the same as [AccountPlanServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<AccountPlanResponse>> =
            delete(id, AccountPlanDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: AccountPlanDeleteParams = AccountPlanDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountPlanResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: AccountPlanDeleteParams = AccountPlanDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountPlanResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: AccountPlanDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountPlanResponse>>

        /** @see [delete] */
        fun delete(
            params: AccountPlanDeleteParams
        ): CompletableFuture<HttpResponseFor<AccountPlanResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountPlanResponse>> =
            delete(id, AccountPlanDeleteParams.none(), requestOptions)
    }
}
