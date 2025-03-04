// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.PlanGroup
import com.m3ter.sdk.models.PlanGroupCreateParams
import com.m3ter.sdk.models.PlanGroupDeleteParams
import com.m3ter.sdk.models.PlanGroupListPage
import com.m3ter.sdk.models.PlanGroupListParams
import com.m3ter.sdk.models.PlanGroupRetrieveParams
import com.m3ter.sdk.models.PlanGroupUpdateParams

interface PlanGroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new PlanGroup. This endpoint creates a new PlanGroup within the specified
     * organization.
     */
    @JvmOverloads
    fun create(
        params: PlanGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroup

    /**
     * Retrieve a specific PlanGroup with the given UUID.
     *
     * This endpoint retrieves detailed information about a specific PlanGroup identified by the
     * given UUID within a specific organization.
     */
    @JvmOverloads
    fun retrieve(
        params: PlanGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroup

    /**
     * Update the PlanGroup with the given UUID.
     *
     * This endpoint updates the details of a specific PlanGroup identified by the given UUID within
     * a specific organization. This allows modifications to existing PlanGroup attributes.
     *
     * **Note:** If you have created Custom Fields for a PlanGroup, when you use this endpoint to
     * update the PlanGroup use the `customFields` parameter to preserve those Custom Fields. If you
     * omit them from the update request, they will be lost.
     */
    @JvmOverloads
    fun update(
        params: PlanGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroup

    /**
     * Retrieve a list of PlanGroups.
     *
     * Retrieves a list of PlanGroups within the specified organization. You can optionally filter
     * by Account IDs or PlanGroup IDs, and also paginate the results for easier management.
     */
    @JvmOverloads
    fun list(
        params: PlanGroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupListPage

    /**
     * Delete a PlanGroup with the given UUID.
     *
     * This endpoint deletes the PlanGroup identified by the given UUID within a specific
     * organization. This operation is irreversible and removes the PlanGroup along with any
     * associated settings.
     */
    @JvmOverloads
    fun delete(
        params: PlanGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroup

    /** A view of [PlanGroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/plangroups`, but is
         * otherwise the same as [PlanGroupService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: PlanGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroup>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plangroups/{id}`, but is
         * otherwise the same as [PlanGroupService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: PlanGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroup>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/plangroups/{id}`, but is
         * otherwise the same as [PlanGroupService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: PlanGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroup>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plangroups`, but is otherwise
         * the same as [PlanGroupService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: PlanGroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupListPage>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/plangroups/{id}`, but is
         * otherwise the same as [PlanGroupService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: PlanGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroup>
    }
}
