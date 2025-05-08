// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.AccountCreateParams
import com.m3ter.models.AccountDeleteParams
import com.m3ter.models.AccountEndDateBillingEntitiesParams
import com.m3ter.models.AccountEndDateBillingEntitiesResponse
import com.m3ter.models.AccountGetChildrenParams
import com.m3ter.models.AccountListPageAsync
import com.m3ter.models.AccountListParams
import com.m3ter.models.AccountResponse
import com.m3ter.models.AccountRetrieveParams
import com.m3ter.models.AccountSearchParams
import com.m3ter.models.AccountSearchResponse
import com.m3ter.models.AccountUpdateParams
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
    fun retrieve(id: String): CompletableFuture<AccountResponse> =
        retrieve(id, AccountRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
    ): CompletableFuture<AccountResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountResponse>

    /** @see [retrieve] */
    fun retrieve(params: AccountRetrieveParams): CompletableFuture<AccountResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<AccountResponse> =
        retrieve(id, AccountRetrieveParams.none(), requestOptions)

    /**
     * Update the Account with the given Account UUID.
     *
     * **Note:** If you have created Custom Fields for an Account, when you use this endpoint to
     * update the Account, use the `customFields` parameter to preserve those Custom Fields. If you
     * omit them from the update request, they will be lost.
     */
    fun update(id: String, params: AccountUpdateParams): CompletableFuture<AccountResponse> =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: AccountUpdateParams): CompletableFuture<AccountResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountResponse>

    /** Retrieve a list of Accounts that can be filtered by Account ID or Account Code. */
    fun list(): CompletableFuture<AccountListPageAsync> = list(AccountListParams.none())

    /** @see [list] */
    fun list(
        params: AccountListParams = AccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountListPageAsync>

    /** @see [list] */
    fun list(
        params: AccountListParams = AccountListParams.none()
    ): CompletableFuture<AccountListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccountListPageAsync> =
        list(AccountListParams.none(), requestOptions)

    /**
     * Delete the Account with the given UUID. This may fail if there are any AccountPlans that
     * reference the Account being deleted.
     */
    fun delete(id: String): CompletableFuture<AccountResponse> =
        delete(id, AccountDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: AccountDeleteParams = AccountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: AccountDeleteParams = AccountDeleteParams.none(),
    ): CompletableFuture<AccountResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: AccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountResponse>

    /** @see [delete] */
    fun delete(params: AccountDeleteParams): CompletableFuture<AccountResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<AccountResponse> =
        delete(id, AccountDeleteParams.none(), requestOptions)

    /**
     * Apply the specified end-date to billing entities associated with an Account.
     *
     * **NOTE:**
     * - When you successfully end-date billing entities, the version number of each entity is
     *   incremented.
     */
    fun endDateBillingEntities(
        id: String,
        params: AccountEndDateBillingEntitiesParams,
    ): CompletableFuture<AccountEndDateBillingEntitiesResponse> =
        endDateBillingEntities(id, params, RequestOptions.none())

    /** @see [endDateBillingEntities] */
    fun endDateBillingEntities(
        id: String,
        params: AccountEndDateBillingEntitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountEndDateBillingEntitiesResponse> =
        endDateBillingEntities(params.toBuilder().id(id).build(), requestOptions)

    /** @see [endDateBillingEntities] */
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
    fun getChildren(id: String): CompletableFuture<AccountResponse> =
        getChildren(id, AccountGetChildrenParams.none())

    /** @see [getChildren] */
    fun getChildren(
        id: String,
        params: AccountGetChildrenParams = AccountGetChildrenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountResponse> =
        getChildren(params.toBuilder().id(id).build(), requestOptions)

    /** @see [getChildren] */
    fun getChildren(
        id: String,
        params: AccountGetChildrenParams = AccountGetChildrenParams.none(),
    ): CompletableFuture<AccountResponse> = getChildren(id, params, RequestOptions.none())

    /** @see [getChildren] */
    fun getChildren(
        params: AccountGetChildrenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountResponse>

    /** @see [getChildren] */
    fun getChildren(params: AccountGetChildrenParams): CompletableFuture<AccountResponse> =
        getChildren(params, RequestOptions.none())

    /** @see [getChildren] */
    fun getChildren(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountResponse> =
        getChildren(id, AccountGetChildrenParams.none(), requestOptions)

    /**
     * Search for Account entities.
     *
     * This endpoint executes a search query for Accounts based on the user specified search
     * criteria. The search query is customizable, allowing for complex nested conditions and
     * sorting. The returned list of Accounts can be paginated for easier management.
     */
    fun search(): CompletableFuture<AccountSearchResponse> = search(AccountSearchParams.none())

    /** @see [search] */
    fun search(
        params: AccountSearchParams = AccountSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountSearchResponse>

    /** @see [search] */
    fun search(
        params: AccountSearchParams = AccountSearchParams.none()
    ): CompletableFuture<AccountSearchResponse> = search(params, RequestOptions.none())

    /** @see [search] */
    fun search(requestOptions: RequestOptions): CompletableFuture<AccountSearchResponse> =
        search(AccountSearchParams.none(), requestOptions)

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
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AccountResponse>> =
            retrieve(id, AccountRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<AccountResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountResponse>> =
            retrieve(id, AccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/accounts/{id}`, but is
         * otherwise the same as [AccountServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: AccountUpdateParams,
        ): CompletableFuture<HttpResponseFor<AccountResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: AccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
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
        fun list(): CompletableFuture<HttpResponseFor<AccountListPageAsync>> =
            list(AccountListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountListParams = AccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountListParams = AccountListParams.none()
        ): CompletableFuture<HttpResponseFor<AccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountListPageAsync>> =
            list(AccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/accounts/{id}`, but is
         * otherwise the same as [AccountServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(id: String): CompletableFuture<HttpResponseFor<AccountResponse>> =
            delete(id, AccountDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: AccountDeleteParams = AccountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: AccountDeleteParams = AccountDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: AccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountResponse>>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: AccountDeleteParams
        ): CompletableFuture<HttpResponseFor<AccountResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountResponse>> =
            delete(id, AccountDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/accounts/{id}/enddatebillingentities`, but is otherwise the same
         * as [AccountServiceAsync.endDateBillingEntities].
         */
        @MustBeClosed
        fun endDateBillingEntities(
            id: String,
            params: AccountEndDateBillingEntitiesParams,
        ): CompletableFuture<HttpResponseFor<AccountEndDateBillingEntitiesResponse>> =
            endDateBillingEntities(id, params, RequestOptions.none())

        /** @see [endDateBillingEntities] */
        @MustBeClosed
        fun endDateBillingEntities(
            id: String,
            params: AccountEndDateBillingEntitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountEndDateBillingEntitiesResponse>> =
            endDateBillingEntities(params.toBuilder().id(id).build(), requestOptions)

        /** @see [endDateBillingEntities] */
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
        fun getChildren(id: String): CompletableFuture<HttpResponseFor<AccountResponse>> =
            getChildren(id, AccountGetChildrenParams.none())

        /** @see [getChildren] */
        @MustBeClosed
        fun getChildren(
            id: String,
            params: AccountGetChildrenParams = AccountGetChildrenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountResponse>> =
            getChildren(params.toBuilder().id(id).build(), requestOptions)

        /** @see [getChildren] */
        @MustBeClosed
        fun getChildren(
            id: String,
            params: AccountGetChildrenParams = AccountGetChildrenParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountResponse>> =
            getChildren(id, params, RequestOptions.none())

        /** @see [getChildren] */
        @MustBeClosed
        fun getChildren(
            params: AccountGetChildrenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountResponse>>

        /** @see [getChildren] */
        @MustBeClosed
        fun getChildren(
            params: AccountGetChildrenParams
        ): CompletableFuture<HttpResponseFor<AccountResponse>> =
            getChildren(params, RequestOptions.none())

        /** @see [getChildren] */
        @MustBeClosed
        fun getChildren(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountResponse>> =
            getChildren(id, AccountGetChildrenParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/accounts/search`, but is
         * otherwise the same as [AccountServiceAsync.search].
         */
        @MustBeClosed
        fun search(): CompletableFuture<HttpResponseFor<AccountSearchResponse>> =
            search(AccountSearchParams.none())

        /** @see [search] */
        @MustBeClosed
        fun search(
            params: AccountSearchParams = AccountSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountSearchResponse>>

        /** @see [search] */
        @MustBeClosed
        fun search(
            params: AccountSearchParams = AccountSearchParams.none()
        ): CompletableFuture<HttpResponseFor<AccountSearchResponse>> =
            search(params, RequestOptions.none())

        /** @see [search] */
        @MustBeClosed
        fun search(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountSearchResponse>> =
            search(AccountSearchParams.none(), requestOptions)
    }
}
