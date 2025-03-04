// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.Account
import com.m3ter.sdk.models.AccountCreateParams
import com.m3ter.sdk.models.AccountDeleteParams
import com.m3ter.sdk.models.AccountEndDateBillingEntitiesParams
import com.m3ter.sdk.models.AccountEndDateBillingEntitiesResponse
import com.m3ter.sdk.models.AccountGetChildrenParams
import com.m3ter.sdk.models.AccountListPage
import com.m3ter.sdk.models.AccountListParams
import com.m3ter.sdk.models.AccountRetrieveParams
import com.m3ter.sdk.models.AccountSearchParams
import com.m3ter.sdk.models.AccountSearchResponse
import com.m3ter.sdk.models.AccountUpdateParams

interface AccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new Account within the Organization. */
    @JvmOverloads
    fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** Retrieve the Account with the given Account UUID. */
    @JvmOverloads
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /**
     * Update the Account with the given Account UUID.
     *
     * **Note:** If you have created Custom Fields for an Account, when you use this endpoint to
     * update the Account, use the `customFields` parameter to preserve those Custom Fields. If you
     * omit them from the update request, they will be lost.
     */
    @JvmOverloads
    fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** Retrieve a list of Accounts that can be filtered by Account ID or Account Code. */
    @JvmOverloads
    fun list(
        params: AccountListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountListPage

    /**
     * Delete the Account with the given UUID. This may fail if there are any AccountPlans that
     * reference the Account being deleted.
     */
    @JvmOverloads
    fun delete(
        params: AccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /**
     * Apply the specified end-date to billing entities associated with an Account.
     *
     * **NOTE:**
     * - When you successfully end-date billing entities, the version number of each entity is
     *   incremented.
     */
    @JvmOverloads
    fun endDateBillingEntities(
        params: AccountEndDateBillingEntitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountEndDateBillingEntitiesResponse

    /** Retrieve a list of Accounts that are children of the specified Account. */
    @JvmOverloads
    fun getChildren(
        params: AccountGetChildrenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /**
     * Search for Account entities.
     *
     * This endpoint executes a search query for Accounts based on the user specified search
     * criteria. The search query is customizable, allowing for complex nested conditions and
     * sorting. The returned list of Accounts can be paginated for easier management.
     */
    @JvmOverloads
    fun search(
        params: AccountSearchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountSearchResponse

    /** A view of [AccountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/accounts`, but is otherwise
         * the same as [AccountService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/accounts/{id}`, but is
         * otherwise the same as [AccountService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/accounts/{id}`, but is
         * otherwise the same as [AccountService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/accounts`, but is otherwise
         * the same as [AccountService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: AccountListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountListPage>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/accounts/{id}`, but is
         * otherwise the same as [AccountService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: AccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/accounts/{id}/enddatebillingentities`, but is otherwise the same
         * as [AccountService.endDateBillingEntities].
         */
        @JvmOverloads
        @MustBeClosed
        fun endDateBillingEntities(
            params: AccountEndDateBillingEntitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountEndDateBillingEntitiesResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/accounts/{id}/children`, but
         * is otherwise the same as [AccountService.getChildren].
         */
        @JvmOverloads
        @MustBeClosed
        fun getChildren(
            params: AccountGetChildrenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/accounts/search`, but is
         * otherwise the same as [AccountService.search].
         */
        @JvmOverloads
        @MustBeClosed
        fun search(
            params: AccountSearchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountSearchResponse>
    }
}
