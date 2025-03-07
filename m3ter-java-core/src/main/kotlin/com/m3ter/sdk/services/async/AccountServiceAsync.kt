// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.AccountCreateParams
import com.m3ter.sdk.models.AccountDeleteParams
import com.m3ter.sdk.models.AccountEndDateBillingEntitiesParams
import com.m3ter.sdk.models.AccountEndDateBillingEntitiesResponse
import com.m3ter.sdk.models.AccountGetChildrenParams
import com.m3ter.sdk.models.AccountListPageAsync
import com.m3ter.sdk.models.AccountListParams
import com.m3ter.sdk.models.AccountResponse
import com.m3ter.sdk.models.AccountRetrieveParams
import com.m3ter.sdk.models.AccountSearchParams
import com.m3ter.sdk.models.AccountSearchResponse
import com.m3ter.sdk.models.AccountUpdateParams
import java.util.concurrent.CompletableFuture

interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new Account within the Organization. */
    fun create(params: AccountCreateParams): CompletableFuture<AccountResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountResponse>

    /** Retrieve the Account with the given Account UUID. */
    fun retrieve(params: AccountRetrieveParams): CompletableFuture<AccountResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountResponse>

    /**
     * Update the Account with the given Account UUID.
     *
     * **Note:** If you have created Custom Fields for an Account, when you use this endpoint to
     * update the Account, use the `customFields` parameter to preserve those Custom Fields. If you
     * omit them from the update request, they will be lost.
     */
    fun update(params: AccountUpdateParams): CompletableFuture<AccountResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountResponse>

    /** Retrieve a list of Accounts that can be filtered by Account ID or Account Code. */
    fun list(params: AccountListParams): CompletableFuture<AccountListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: AccountListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountListPageAsync>

    /**
     * Delete the Account with the given UUID. This may fail if there are any AccountPlans that
     * reference the Account being deleted.
     */
    fun delete(params: AccountDeleteParams): CompletableFuture<AccountResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: AccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountResponse>

    /**
     * Apply the specified end-date to billing entities associated with an Account.
     *
     * **NOTE:**
     * - When you successfully end-date billing entities, the version number of each entity is
     *   incremented.
     */
    fun endDateBillingEntities(
        params: AccountEndDateBillingEntitiesParams
    ): CompletableFuture<AccountEndDateBillingEntitiesResponse> =
        endDateBillingEntities(params, RequestOptions.none())

    /** @see [endDateBillingEntities] */
    fun endDateBillingEntities(
        params: AccountEndDateBillingEntitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountEndDateBillingEntitiesResponse>

    /** Retrieve a list of Accounts that are children of the specified Account. */
    fun getChildren(params: AccountGetChildrenParams): CompletableFuture<AccountResponse> =
        getChildren(params, RequestOptions.none())

    /** @see [getChildren] */
    fun getChildren(
        params: AccountGetChildrenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountResponse>

    /**
     * Search for Account entities.
     *
     * This endpoint executes a search query for Accounts based on the user specified search
     * criteria. The search query is customizable, allowing for complex nested conditions and
     * sorting. The returned list of Accounts can be paginated for easier management.
     */
    fun search(params: AccountSearchParams): CompletableFuture<AccountSearchResponse> =
        search(params, RequestOptions.none())

    /** @see [search] */
    fun search(
        params: AccountSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountSearchResponse>

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/accounts`, but is otherwise
         * the same as [AccountServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: AccountCreateParams
        ): CompletableFuture<HttpResponseFor<AccountResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/accounts/{id}`, but is
         * otherwise the same as [AccountServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: AccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<AccountResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/accounts/{id}`, but is
         * otherwise the same as [AccountServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: AccountUpdateParams
        ): CompletableFuture<HttpResponseFor<AccountResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/accounts`, but is otherwise
         * the same as [AccountServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: AccountListParams
        ): CompletableFuture<HttpResponseFor<AccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/accounts/{id}`, but is
         * otherwise the same as [AccountServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: AccountDeleteParams
        ): CompletableFuture<HttpResponseFor<AccountResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: AccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/accounts/{id}/enddatebillingentities`, but is otherwise the same
         * as [AccountServiceAsync.endDateBillingEntities].
         */
        @MustBeClosed
        fun endDateBillingEntities(
            params: AccountEndDateBillingEntitiesParams
        ): CompletableFuture<HttpResponseFor<AccountEndDateBillingEntitiesResponse>> =
            endDateBillingEntities(params, RequestOptions.none())

        /** @see [endDateBillingEntities] */
        @MustBeClosed
        fun endDateBillingEntities(
            params: AccountEndDateBillingEntitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountEndDateBillingEntitiesResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/accounts/{id}/children`, but
         * is otherwise the same as [AccountServiceAsync.getChildren].
         */
        @MustBeClosed
        fun getChildren(
            params: AccountGetChildrenParams
        ): CompletableFuture<HttpResponseFor<AccountResponse>> =
            getChildren(params, RequestOptions.none())

        /** @see [getChildren] */
        @MustBeClosed
        fun getChildren(
            params: AccountGetChildrenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/accounts/search`, but is
         * otherwise the same as [AccountServiceAsync.search].
         */
        @MustBeClosed
        fun search(
            params: AccountSearchParams
        ): CompletableFuture<HttpResponseFor<AccountSearchResponse>> =
            search(params, RequestOptions.none())

        /** @see [search] */
        @MustBeClosed
        fun search(
            params: AccountSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountSearchResponse>>
    }
}
