// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.Plan
import com.m3ter.sdk.models.PlanCreateParams
import com.m3ter.sdk.models.PlanDeleteParams
import com.m3ter.sdk.models.PlanListPage
import com.m3ter.sdk.models.PlanListParams
import com.m3ter.sdk.models.PlanRetrieveParams
import com.m3ter.sdk.models.PlanUpdateParams

interface PlanService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new Plan. */
    @JvmOverloads
    fun create(
        params: PlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan

    /** Retrieve the Plan with the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: PlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan

    /**
     * Update the Plan with the given UUID.
     *
     * **Note:** If you have created Custom Fields for a Plan, when you use this endpoint to update
     * the Plan use the `customFields` parameter to preserve those Custom Fields. If you omit them
     * from the update request, they will be lost.
     */
    @JvmOverloads
    fun update(
        params: PlanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan

    /** Retrieve a list of Plans that can be filtered by Product, Account, or Plan ID. */
    @JvmOverloads
    fun list(
        params: PlanListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanListPage

    /** Delete the Plan with the given UUID. */
    @JvmOverloads
    fun delete(
        params: PlanDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Plan

    /** A view of [PlanService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/plans`, but is otherwise the
         * same as [PlanService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: PlanCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plans/{id}`, but is otherwise
         * the same as [PlanService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: PlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/plans/{id}`, but is otherwise
         * the same as [PlanService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: PlanUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plans`, but is otherwise the
         * same as [PlanService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: PlanListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanListPage>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/plans/{id}`, but is
         * otherwise the same as [PlanService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: PlanDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Plan>
    }
}
