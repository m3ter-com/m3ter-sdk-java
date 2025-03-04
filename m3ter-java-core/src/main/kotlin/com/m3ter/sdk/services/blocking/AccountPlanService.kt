// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.AccountPlan
import com.m3ter.sdk.models.AccountPlanCreateParams
import com.m3ter.sdk.models.AccountPlanDeleteParams
import com.m3ter.sdk.models.AccountPlanListPage
import com.m3ter.sdk.models.AccountPlanListParams
import com.m3ter.sdk.models.AccountPlanRetrieveParams
import com.m3ter.sdk.models.AccountPlanUpdateParams

interface AccountPlanService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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
    @JvmOverloads
    fun create(
        params: AccountPlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountPlan

    /** Retrieve the AccountPlan or AccountPlanGroup details corresponding to the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: AccountPlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountPlan

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
    @JvmOverloads
    fun update(
        params: AccountPlanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountPlan

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
    @JvmOverloads
    fun list(
        params: AccountPlanListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountPlanListPage

    /**
     * Delete the AccountPlan or AccountPlanGroup with the given UUID.
     *
     * This endpoint deletes an AccountPlan or AccountPlanGroup that has been attached to a specific
     * Account in your Organization.
     */
    @JvmOverloads
    fun delete(
        params: AccountPlanDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountPlan

    /**
     * A view of [AccountPlanService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/accountplans`, but is
         * otherwise the same as [AccountPlanService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: AccountPlanCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountPlan>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/accountplans/{id}`, but is
         * otherwise the same as [AccountPlanService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: AccountPlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountPlan>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/accountplans/{id}`, but is
         * otherwise the same as [AccountPlanService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: AccountPlanUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountPlan>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/accountplans`, but is
         * otherwise the same as [AccountPlanService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: AccountPlanListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountPlanListPage>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/accountplans/{id}`, but is
         * otherwise the same as [AccountPlanService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: AccountPlanDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountPlan>
    }
}
