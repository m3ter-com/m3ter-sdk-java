// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.Account
import com.m3ter.sdk.models.AccountCreateParams
import com.m3ter.sdk.models.AccountDeleteParams
import com.m3ter.sdk.models.AccountListChildrenParams
import com.m3ter.sdk.models.AccountListPage
import com.m3ter.sdk.models.AccountListParams
import com.m3ter.sdk.models.AccountRetrieveParams
import com.m3ter.sdk.models.AccountSearchParams
import com.m3ter.sdk.models.AccountSearchResponse
import com.m3ter.sdk.models.AccountUpdateParams

interface AccountService {

    /** Create a new Account within the Organization. */
    @JvmOverloads
    fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Account

    /** Retrieve the Account with the given Account UUID. */
    @JvmOverloads
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
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
        requestOptions: RequestOptions = RequestOptions.none()
    ): Account

    /** Retrieve a list of Accounts that can be filtered by Account ID or Account Code. */
    @JvmOverloads
    fun list(
        params: AccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountListPage

    /**
     * Delete the Account with the given UUID. This may fail if there are any AccountPlans that
     * reference the Account being deleted.
     */
    @JvmOverloads
    fun delete(
        params: AccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Account

    /** Retrieve a list of Accounts that are children of the specified Account. */
    @JvmOverloads
    fun listChildren(
        params: AccountListChildrenParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Account

    /** Search for account entities */
    @JvmOverloads
    fun search(
        params: AccountSearchParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountSearchResponse
}
