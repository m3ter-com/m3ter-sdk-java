// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.PlanGroupCreateParams
import com.m3ter.models.PlanGroupDeleteParams
import com.m3ter.models.PlanGroupListPage
import com.m3ter.models.PlanGroupListParams
import com.m3ter.models.PlanGroupResponse
import com.m3ter.models.PlanGroupRetrieveParams
import com.m3ter.models.PlanGroupUpdateParams

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
    fun retrieve(id: String): PlanGroupResponse = retrieve(id, PlanGroupRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PlanGroupRetrieveParams = PlanGroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PlanGroupRetrieveParams = PlanGroupRetrieveParams.none(),
    ): PlanGroupResponse = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PlanGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupResponse

    /** @see [retrieve] */
    fun retrieve(params: PlanGroupRetrieveParams): PlanGroupResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): PlanGroupResponse =
        retrieve(id, PlanGroupRetrieveParams.none(), requestOptions)

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
    fun update(id: String, params: PlanGroupUpdateParams): PlanGroupResponse =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: PlanGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
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
    fun list(): PlanGroupListPage = list(PlanGroupListParams.none())

    /** @see [list] */
    fun list(
        params: PlanGroupListParams = PlanGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupListPage

    /** @see [list] */
    fun list(params: PlanGroupListParams = PlanGroupListParams.none()): PlanGroupListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): PlanGroupListPage =
        list(PlanGroupListParams.none(), requestOptions)

    /**
     * Delete a PlanGroup with the given UUID.
     *
     * This endpoint deletes the PlanGroup identified by the given UUID within a specific
     * organization. This operation is irreversible and removes the PlanGroup along with any
     * associated settings.
     */
    fun delete(id: String): PlanGroupResponse = delete(id, PlanGroupDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: PlanGroupDeleteParams = PlanGroupDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: PlanGroupDeleteParams = PlanGroupDeleteParams.none(),
    ): PlanGroupResponse = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: PlanGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupResponse

    /** @see [delete] */
    fun delete(params: PlanGroupDeleteParams): PlanGroupResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): PlanGroupResponse =
        delete(id, PlanGroupDeleteParams.none(), requestOptions)

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
        fun retrieve(id: String): HttpResponseFor<PlanGroupResponse> =
            retrieve(id, PlanGroupRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PlanGroupRetrieveParams = PlanGroupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PlanGroupRetrieveParams = PlanGroupRetrieveParams.none(),
        ): HttpResponseFor<PlanGroupResponse> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PlanGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: PlanGroupRetrieveParams): HttpResponseFor<PlanGroupResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroupResponse> =
            retrieve(id, PlanGroupRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/plangroups/{id}`, but is
         * otherwise the same as [PlanGroupService.update].
         */
        @MustBeClosed
        fun update(id: String, params: PlanGroupUpdateParams): HttpResponseFor<PlanGroupResponse> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: PlanGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
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
        fun list(): HttpResponseFor<PlanGroupListPage> = list(PlanGroupListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PlanGroupListParams = PlanGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PlanGroupListParams = PlanGroupListParams.none()
        ): HttpResponseFor<PlanGroupListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PlanGroupListPage> =
            list(PlanGroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/plangroups/{id}`, but is
         * otherwise the same as [PlanGroupService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<PlanGroupResponse> =
            delete(id, PlanGroupDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: PlanGroupDeleteParams = PlanGroupDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: PlanGroupDeleteParams = PlanGroupDeleteParams.none(),
        ): HttpResponseFor<PlanGroupResponse> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: PlanGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: PlanGroupDeleteParams): HttpResponseFor<PlanGroupResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponseFor<PlanGroupResponse> =
            delete(id, PlanGroupDeleteParams.none(), requestOptions)
    }
}
