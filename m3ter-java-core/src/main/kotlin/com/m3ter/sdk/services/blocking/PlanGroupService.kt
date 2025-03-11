// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.PlanGroupCreateParams
import com.m3ter.sdk.models.PlanGroupDeleteParams
import com.m3ter.sdk.models.PlanGroupListPage
import com.m3ter.sdk.models.PlanGroupListParams
import com.m3ter.sdk.models.PlanGroupResponse
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
    fun create(params: PlanGroupCreateParams): PlanGroupResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PlanGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupResponse

    /**
     * Retrieve a specific PlanGroup with the given UUID.
     *
     * This endpoint retrieves detailed information about a specific PlanGroup identified by the
     * given UUID within a specific organization.
     */
    fun retrieve(params: PlanGroupRetrieveParams): PlanGroupResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PlanGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupResponse

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
    fun update(params: PlanGroupUpdateParams): PlanGroupResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PlanGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupResponse

    /**
     * Retrieve a list of PlanGroups.
     *
     * Retrieves a list of PlanGroups within the specified organization. You can optionally filter
     * by Account IDs or PlanGroup IDs, and also paginate the results for easier management.
     */
    fun list(params: PlanGroupListParams): PlanGroupListPage = list(params, RequestOptions.none())

    /** @see [list] */
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
    fun delete(params: PlanGroupDeleteParams): PlanGroupResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: PlanGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupResponse

    /** A view of [PlanGroupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/plangroups`, but is
         * otherwise the same as [PlanGroupService.create].
         */
        @MustBeClosed
        fun create(params: PlanGroupCreateParams): HttpResponseFor<PlanGroupResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PlanGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plangroups/{id}`, but is
         * otherwise the same as [PlanGroupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: PlanGroupRetrieveParams): HttpResponseFor<PlanGroupResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PlanGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/plangroups/{id}`, but is
         * otherwise the same as [PlanGroupService.update].
         */
        @MustBeClosed
        fun update(params: PlanGroupUpdateParams): HttpResponseFor<PlanGroupResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PlanGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plangroups`, but is otherwise
         * the same as [PlanGroupService.list].
         */
        @MustBeClosed
        fun list(params: PlanGroupListParams): HttpResponseFor<PlanGroupListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PlanGroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupListPage>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/plangroups/{id}`, but is
         * otherwise the same as [PlanGroupService.delete].
         */
        @MustBeClosed
        fun delete(params: PlanGroupDeleteParams): HttpResponseFor<PlanGroupResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: PlanGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupResponse>
    }
}
