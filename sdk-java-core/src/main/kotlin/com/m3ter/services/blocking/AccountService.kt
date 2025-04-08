// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.AccountCreateParams
import com.m3ter.models.AccountDeleteParams
import com.m3ter.models.AccountEndDateBillingEntitiesParams
import com.m3ter.models.AccountEndDateBillingEntitiesResponse
import com.m3ter.models.AccountGetChildrenParams
import com.m3ter.models.AccountListPage
import com.m3ter.models.AccountListParams
import com.m3ter.models.AccountResponse
import com.m3ter.models.AccountRetrieveParams
import com.m3ter.models.AccountSearchParams
import com.m3ter.models.AccountSearchResponse
import com.m3ter.models.AccountUpdateParams

interface AccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new Account within the Organization. */
    fun create(params: AccountCreateParams): AccountResponse = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountResponse

    /** Retrieve the Account with the given Account UUID. */
    fun retrieve(params: AccountRetrieveParams): AccountResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountResponse

    /**
     * Update the Account with the given Account UUID.
     *
     * **Note:** If you have created Custom Fields for an Account, when you use this endpoint to
     * update the Account, use the `customFields` parameter to preserve those Custom Fields. If you
     * omit them from the update request, they will be lost.
     */
    fun update(params: AccountUpdateParams): AccountResponse = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountResponse

    /** Retrieve a list of Accounts that can be filtered by Account ID or Account Code. */
    fun list(): AccountListPage = list(AccountListParams.none())

    /** @see [list] */
    fun list(
        params: AccountListParams = AccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountListPage

    /** @see [list] */
    fun list(params: AccountListParams = AccountListParams.none()): AccountListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): AccountListPage =
        list(AccountListParams.none(), requestOptions)

    /**
     * Delete the Account with the given UUID. This may fail if there are any AccountPlans that
     * reference the Account being deleted.
     */
    fun delete(params: AccountDeleteParams): AccountResponse = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: AccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountResponse

    /**
     * Apply the specified end-date to billing entities associated with an Account.
     *
     * **NOTE:**
     * - When you successfully end-date billing entities, the version number of each entity is
     *   incremented.
     */
    fun endDateBillingEntities(
        params: AccountEndDateBillingEntitiesParams
    ): AccountEndDateBillingEntitiesResponse = endDateBillingEntities(params, RequestOptions.none())

    /** @see [endDateBillingEntities] */
    fun endDateBillingEntities(
        params: AccountEndDateBillingEntitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountEndDateBillingEntitiesResponse

    /** Retrieve a list of Accounts that are children of the specified Account. */
    fun getChildren(params: AccountGetChildrenParams): AccountResponse =
        getChildren(params, RequestOptions.none())

    /** @see [getChildren] */
    fun getChildren(
        params: AccountGetChildrenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountResponse

    /**
     * Search for Account entities.
     *
     * This endpoint executes a search query for Accounts based on the user specified search
     * criteria. The search query is customizable, allowing for complex nested conditions and
     * sorting. The returned list of Accounts can be paginated for easier management.
     */
    fun search(): AccountSearchResponse = search(AccountSearchParams.none())

    /** @see [search] */
    fun search(
        params: AccountSearchParams = AccountSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountSearchResponse

    /** @see [search] */
    fun search(params: AccountSearchParams = AccountSearchParams.none()): AccountSearchResponse =
        search(params, RequestOptions.none())

    /** @see [search] */
    fun search(requestOptions: RequestOptions): AccountSearchResponse =
        search(AccountSearchParams.none(), requestOptions)

    /** A view of [AccountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/accounts`, but is otherwise
         * the same as [AccountService.create].
         */
        @MustBeClosed
        fun create(params: AccountCreateParams): HttpResponseFor<AccountResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/accounts/{id}`, but is
         * otherwise the same as [AccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: AccountRetrieveParams): HttpResponseFor<AccountResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/accounts/{id}`, but is
         * otherwise the same as [AccountService.update].
         */
        @MustBeClosed
        fun update(params: AccountUpdateParams): HttpResponseFor<AccountResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/accounts`, but is otherwise
         * the same as [AccountService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<AccountListPage> = list(AccountListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountListParams = AccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AccountListParams = AccountListParams.none()
        ): HttpResponseFor<AccountListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccountListPage> =
            list(AccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/accounts/{id}`, but is
         * otherwise the same as [AccountService.delete].
         */
        @MustBeClosed
        fun delete(params: AccountDeleteParams): HttpResponseFor<AccountResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: AccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountResponse>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/accounts/{id}/enddatebillingentities`, but is otherwise the same
         * as [AccountService.endDateBillingEntities].
         */
        @MustBeClosed
        fun endDateBillingEntities(
            params: AccountEndDateBillingEntitiesParams
        ): HttpResponseFor<AccountEndDateBillingEntitiesResponse> =
            endDateBillingEntities(params, RequestOptions.none())

        /** @see [endDateBillingEntities] */
        @MustBeClosed
        fun endDateBillingEntities(
            params: AccountEndDateBillingEntitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountEndDateBillingEntitiesResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/accounts/{id}/children`, but
         * is otherwise the same as [AccountService.getChildren].
         */
        @MustBeClosed
        fun getChildren(params: AccountGetChildrenParams): HttpResponseFor<AccountResponse> =
            getChildren(params, RequestOptions.none())

        /** @see [getChildren] */
        @MustBeClosed
        fun getChildren(
            params: AccountGetChildrenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/accounts/search`, but is
         * otherwise the same as [AccountService.search].
         */
        @MustBeClosed
        fun search(): HttpResponseFor<AccountSearchResponse> = search(AccountSearchParams.none())

        /** @see [search] */
        @MustBeClosed
        fun search(
            params: AccountSearchParams = AccountSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountSearchResponse>

        /** @see [search] */
        @MustBeClosed
        fun search(
            params: AccountSearchParams = AccountSearchParams.none()
        ): HttpResponseFor<AccountSearchResponse> = search(params, RequestOptions.none())

        /** @see [search] */
        @MustBeClosed
        fun search(requestOptions: RequestOptions): HttpResponseFor<AccountSearchResponse> =
            search(AccountSearchParams.none(), requestOptions)
    }
}
