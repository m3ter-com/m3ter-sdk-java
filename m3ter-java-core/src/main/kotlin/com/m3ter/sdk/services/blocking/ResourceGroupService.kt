// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.ResourceGroupAddResourceParams
import com.m3ter.sdk.models.ResourceGroupCreateParams
import com.m3ter.sdk.models.ResourceGroupDeleteParams
import com.m3ter.sdk.models.ResourceGroupListContentsPage
import com.m3ter.sdk.models.ResourceGroupListContentsParams
import com.m3ter.sdk.models.ResourceGroupListPage
import com.m3ter.sdk.models.ResourceGroupListParams
import com.m3ter.sdk.models.ResourceGroupListPermissionsPage
import com.m3ter.sdk.models.ResourceGroupListPermissionsParams
import com.m3ter.sdk.models.ResourceGroupRemoveResourceParams
import com.m3ter.sdk.models.ResourceGroupResponse
import com.m3ter.sdk.models.ResourceGroupRetrieveParams
import com.m3ter.sdk.models.ResourceGroupUpdateParams

interface ResourceGroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ResourceGroup for the UUID */
    fun create(params: ResourceGroupCreateParams): ResourceGroupResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ResourceGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupResponse

    /** Retrieve the ResourceGroup for the UUID */
    fun retrieve(params: ResourceGroupRetrieveParams): ResourceGroupResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ResourceGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupResponse

    /** Update the ResourceGroup for the UUID */
    fun update(params: ResourceGroupUpdateParams): ResourceGroupResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ResourceGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupResponse

    /** Retrieve a list of ResourceGroup entities */
    fun list(params: ResourceGroupListParams): ResourceGroupListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: ResourceGroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupListPage

    /** Delete a ResourceGroup for the UUID */
    fun delete(params: ResourceGroupDeleteParams): ResourceGroupResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ResourceGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupResponse

    /** Add an item to a ResourceGroup. */
    fun addResource(params: ResourceGroupAddResourceParams): ResourceGroupResponse =
        addResource(params, RequestOptions.none())

    /** @see [addResource] */
    fun addResource(
        params: ResourceGroupAddResourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupResponse

    /** Retrieve a list of items for a ResourceGroup */
    fun listContents(params: ResourceGroupListContentsParams): ResourceGroupListContentsPage =
        listContents(params, RequestOptions.none())

    /** @see [listContents] */
    fun listContents(
        params: ResourceGroupListContentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupListContentsPage

    /** Retrieve a list of permission policies for a ResourceGroup */
    fun listPermissions(
        params: ResourceGroupListPermissionsParams
    ): ResourceGroupListPermissionsPage = listPermissions(params, RequestOptions.none())

    /** @see [listPermissions] */
    fun listPermissions(
        params: ResourceGroupListPermissionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupListPermissionsPage

    /** Remove an item from a ResourceGroup. */
    fun removeResource(params: ResourceGroupRemoveResourceParams): ResourceGroupResponse =
        removeResource(params, RequestOptions.none())

    /** @see [removeResource] */
    fun removeResource(
        params: ResourceGroupRemoveResourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupResponse

    /**
     * A view of [ResourceGroupService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/resourcegroups/{type}`, but
         * is otherwise the same as [ResourceGroupService.create].
         */
        @MustBeClosed
        fun create(params: ResourceGroupCreateParams): HttpResponseFor<ResourceGroupResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ResourceGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/resourcegroups/{type}/{id}`,
         * but is otherwise the same as [ResourceGroupService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ResourceGroupRetrieveParams): HttpResponseFor<ResourceGroupResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ResourceGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/resourcegroups/{type}/{id}`,
         * but is otherwise the same as [ResourceGroupService.update].
         */
        @MustBeClosed
        fun update(params: ResourceGroupUpdateParams): HttpResponseFor<ResourceGroupResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ResourceGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/resourcegroups/{type}`, but
         * is otherwise the same as [ResourceGroupService.list].
         */
        @MustBeClosed
        fun list(params: ResourceGroupListParams): HttpResponseFor<ResourceGroupListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ResourceGroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/resourcegroups/{type}/{id}`, but is otherwise the same as
         * [ResourceGroupService.delete].
         */
        @MustBeClosed
        fun delete(params: ResourceGroupDeleteParams): HttpResponseFor<ResourceGroupResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ResourceGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupResponse>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/resourcegroups/{type}/{resourceGroupId}/addresource`, but is
         * otherwise the same as [ResourceGroupService.addResource].
         */
        @MustBeClosed
        fun addResource(
            params: ResourceGroupAddResourceParams
        ): HttpResponseFor<ResourceGroupResponse> = addResource(params, RequestOptions.none())

        /** @see [addResource] */
        @MustBeClosed
        fun addResource(
            params: ResourceGroupAddResourceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupResponse>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/resourcegroups/{type}/{resourceGroupId}/contents`, but is
         * otherwise the same as [ResourceGroupService.listContents].
         */
        @MustBeClosed
        fun listContents(
            params: ResourceGroupListContentsParams
        ): HttpResponseFor<ResourceGroupListContentsPage> =
            listContents(params, RequestOptions.none())

        /** @see [listContents] */
        @MustBeClosed
        fun listContents(
            params: ResourceGroupListContentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupListContentsPage>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/resourcegroups/{type}/{resourceGroupId}/permissions`, but is
         * otherwise the same as [ResourceGroupService.listPermissions].
         */
        @MustBeClosed
        fun listPermissions(
            params: ResourceGroupListPermissionsParams
        ): HttpResponseFor<ResourceGroupListPermissionsPage> =
            listPermissions(params, RequestOptions.none())

        /** @see [listPermissions] */
        @MustBeClosed
        fun listPermissions(
            params: ResourceGroupListPermissionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupListPermissionsPage>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/resourcegroups/{type}/{resourceGroupId}/removeresource`, but is
         * otherwise the same as [ResourceGroupService.removeResource].
         */
        @MustBeClosed
        fun removeResource(
            params: ResourceGroupRemoveResourceParams
        ): HttpResponseFor<ResourceGroupResponse> = removeResource(params, RequestOptions.none())

        /** @see [removeResource] */
        @MustBeClosed
        fun removeResource(
            params: ResourceGroupRemoveResourceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupResponse>
    }
}
