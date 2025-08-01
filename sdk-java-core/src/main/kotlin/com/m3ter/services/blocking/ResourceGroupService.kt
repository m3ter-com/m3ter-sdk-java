// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.ResourceGroupAddResourceParams
import com.m3ter.models.ResourceGroupCreateParams
import com.m3ter.models.ResourceGroupDeleteParams
import com.m3ter.models.ResourceGroupListContentsPage
import com.m3ter.models.ResourceGroupListContentsParams
import com.m3ter.models.ResourceGroupListPage
import com.m3ter.models.ResourceGroupListParams
import com.m3ter.models.ResourceGroupListPermissionsPage
import com.m3ter.models.ResourceGroupListPermissionsParams
import com.m3ter.models.ResourceGroupRemoveResourceParams
import com.m3ter.models.ResourceGroupResponse
import com.m3ter.models.ResourceGroupRetrieveParams
import com.m3ter.models.ResourceGroupUpdateParams
import java.util.function.Consumer

interface ResourceGroupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ResourceGroupService

    /** Create a ResourceGroup for the UUID */
    fun create(type: String, params: ResourceGroupCreateParams): ResourceGroupResponse =
        create(type, params, RequestOptions.none())

    /** @see create */
    fun create(
        type: String,
        params: ResourceGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupResponse = create(params.toBuilder().type(type).build(), requestOptions)

    /** @see create */
    fun create(params: ResourceGroupCreateParams): ResourceGroupResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ResourceGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupResponse

    /** Retrieve the ResourceGroup for the UUID */
    fun retrieve(id: String, params: ResourceGroupRetrieveParams): ResourceGroupResponse =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ResourceGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: ResourceGroupRetrieveParams): ResourceGroupResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ResourceGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupResponse

    /** Update the ResourceGroup for the UUID */
    fun update(id: String, params: ResourceGroupUpdateParams): ResourceGroupResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: ResourceGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: ResourceGroupUpdateParams): ResourceGroupResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ResourceGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupResponse

    /** Retrieve a list of ResourceGroup entities */
    fun list(type: String): ResourceGroupListPage = list(type, ResourceGroupListParams.none())

    /** @see list */
    fun list(
        type: String,
        params: ResourceGroupListParams = ResourceGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupListPage = list(params.toBuilder().type(type).build(), requestOptions)

    /** @see list */
    fun list(
        type: String,
        params: ResourceGroupListParams = ResourceGroupListParams.none(),
    ): ResourceGroupListPage = list(type, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: ResourceGroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupListPage

    /** @see list */
    fun list(params: ResourceGroupListParams): ResourceGroupListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(type: String, requestOptions: RequestOptions): ResourceGroupListPage =
        list(type, ResourceGroupListParams.none(), requestOptions)

    /** Delete a ResourceGroup for the UUID */
    fun delete(id: String, params: ResourceGroupDeleteParams): ResourceGroupResponse =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ResourceGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: ResourceGroupDeleteParams): ResourceGroupResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ResourceGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupResponse

    /** Add an item to a ResourceGroup. */
    fun addResource(
        resourceGroupId: String,
        params: ResourceGroupAddResourceParams,
    ): ResourceGroupResponse = addResource(resourceGroupId, params, RequestOptions.none())

    /** @see addResource */
    fun addResource(
        resourceGroupId: String,
        params: ResourceGroupAddResourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupResponse =
        addResource(params.toBuilder().resourceGroupId(resourceGroupId).build(), requestOptions)

    /** @see addResource */
    fun addResource(params: ResourceGroupAddResourceParams): ResourceGroupResponse =
        addResource(params, RequestOptions.none())

    /** @see addResource */
    fun addResource(
        params: ResourceGroupAddResourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupResponse

    /** Retrieve a list of items for a ResourceGroup */
    fun listContents(
        resourceGroupId: String,
        params: ResourceGroupListContentsParams,
    ): ResourceGroupListContentsPage = listContents(resourceGroupId, params, RequestOptions.none())

    /** @see listContents */
    fun listContents(
        resourceGroupId: String,
        params: ResourceGroupListContentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupListContentsPage =
        listContents(params.toBuilder().resourceGroupId(resourceGroupId).build(), requestOptions)

    /** @see listContents */
    fun listContents(params: ResourceGroupListContentsParams): ResourceGroupListContentsPage =
        listContents(params, RequestOptions.none())

    /** @see listContents */
    fun listContents(
        params: ResourceGroupListContentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupListContentsPage

    /** Retrieve a list of permission policies for a ResourceGroup */
    fun listPermissions(
        resourceGroupId: String,
        params: ResourceGroupListPermissionsParams,
    ): ResourceGroupListPermissionsPage =
        listPermissions(resourceGroupId, params, RequestOptions.none())

    /** @see listPermissions */
    fun listPermissions(
        resourceGroupId: String,
        params: ResourceGroupListPermissionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupListPermissionsPage =
        listPermissions(params.toBuilder().resourceGroupId(resourceGroupId).build(), requestOptions)

    /** @see listPermissions */
    fun listPermissions(
        params: ResourceGroupListPermissionsParams
    ): ResourceGroupListPermissionsPage = listPermissions(params, RequestOptions.none())

    /** @see listPermissions */
    fun listPermissions(
        params: ResourceGroupListPermissionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupListPermissionsPage

    /** Remove an item from a ResourceGroup. */
    fun removeResource(
        resourceGroupId: String,
        params: ResourceGroupRemoveResourceParams,
    ): ResourceGroupResponse = removeResource(resourceGroupId, params, RequestOptions.none())

    /** @see removeResource */
    fun removeResource(
        resourceGroupId: String,
        params: ResourceGroupRemoveResourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupResponse =
        removeResource(params.toBuilder().resourceGroupId(resourceGroupId).build(), requestOptions)

    /** @see removeResource */
    fun removeResource(params: ResourceGroupRemoveResourceParams): ResourceGroupResponse =
        removeResource(params, RequestOptions.none())

    /** @see removeResource */
    fun removeResource(
        params: ResourceGroupRemoveResourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupResponse

    /**
     * A view of [ResourceGroupService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ResourceGroupService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/resourcegroups/{type}`, but
         * is otherwise the same as [ResourceGroupService.create].
         */
        @MustBeClosed
        fun create(
            type: String,
            params: ResourceGroupCreateParams,
        ): HttpResponseFor<ResourceGroupResponse> = create(type, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            type: String,
            params: ResourceGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupResponse> =
            create(params.toBuilder().type(type).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(params: ResourceGroupCreateParams): HttpResponseFor<ResourceGroupResponse> =
            create(params, RequestOptions.none())

        /** @see create */
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
        fun retrieve(
            id: String,
            params: ResourceGroupRetrieveParams,
        ): HttpResponseFor<ResourceGroupResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ResourceGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ResourceGroupRetrieveParams): HttpResponseFor<ResourceGroupResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
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
        fun update(
            id: String,
            params: ResourceGroupUpdateParams,
        ): HttpResponseFor<ResourceGroupResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: ResourceGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: ResourceGroupUpdateParams): HttpResponseFor<ResourceGroupResponse> =
            update(params, RequestOptions.none())

        /** @see update */
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
        fun list(type: String): HttpResponseFor<ResourceGroupListPage> =
            list(type, ResourceGroupListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            type: String,
            params: ResourceGroupListParams = ResourceGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupListPage> =
            list(params.toBuilder().type(type).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            type: String,
            params: ResourceGroupListParams = ResourceGroupListParams.none(),
        ): HttpResponseFor<ResourceGroupListPage> = list(type, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ResourceGroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: ResourceGroupListParams): HttpResponseFor<ResourceGroupListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            type: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResourceGroupListPage> =
            list(type, ResourceGroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/resourcegroups/{type}/{id}`, but is otherwise the same as
         * [ResourceGroupService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: ResourceGroupDeleteParams,
        ): HttpResponseFor<ResourceGroupResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ResourceGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: ResourceGroupDeleteParams): HttpResponseFor<ResourceGroupResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
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
            resourceGroupId: String,
            params: ResourceGroupAddResourceParams,
        ): HttpResponseFor<ResourceGroupResponse> =
            addResource(resourceGroupId, params, RequestOptions.none())

        /** @see addResource */
        @MustBeClosed
        fun addResource(
            resourceGroupId: String,
            params: ResourceGroupAddResourceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupResponse> =
            addResource(params.toBuilder().resourceGroupId(resourceGroupId).build(), requestOptions)

        /** @see addResource */
        @MustBeClosed
        fun addResource(
            params: ResourceGroupAddResourceParams
        ): HttpResponseFor<ResourceGroupResponse> = addResource(params, RequestOptions.none())

        /** @see addResource */
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
            resourceGroupId: String,
            params: ResourceGroupListContentsParams,
        ): HttpResponseFor<ResourceGroupListContentsPage> =
            listContents(resourceGroupId, params, RequestOptions.none())

        /** @see listContents */
        @MustBeClosed
        fun listContents(
            resourceGroupId: String,
            params: ResourceGroupListContentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupListContentsPage> =
            listContents(
                params.toBuilder().resourceGroupId(resourceGroupId).build(),
                requestOptions,
            )

        /** @see listContents */
        @MustBeClosed
        fun listContents(
            params: ResourceGroupListContentsParams
        ): HttpResponseFor<ResourceGroupListContentsPage> =
            listContents(params, RequestOptions.none())

        /** @see listContents */
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
            resourceGroupId: String,
            params: ResourceGroupListPermissionsParams,
        ): HttpResponseFor<ResourceGroupListPermissionsPage> =
            listPermissions(resourceGroupId, params, RequestOptions.none())

        /** @see listPermissions */
        @MustBeClosed
        fun listPermissions(
            resourceGroupId: String,
            params: ResourceGroupListPermissionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupListPermissionsPage> =
            listPermissions(
                params.toBuilder().resourceGroupId(resourceGroupId).build(),
                requestOptions,
            )

        /** @see listPermissions */
        @MustBeClosed
        fun listPermissions(
            params: ResourceGroupListPermissionsParams
        ): HttpResponseFor<ResourceGroupListPermissionsPage> =
            listPermissions(params, RequestOptions.none())

        /** @see listPermissions */
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
            resourceGroupId: String,
            params: ResourceGroupRemoveResourceParams,
        ): HttpResponseFor<ResourceGroupResponse> =
            removeResource(resourceGroupId, params, RequestOptions.none())

        /** @see removeResource */
        @MustBeClosed
        fun removeResource(
            resourceGroupId: String,
            params: ResourceGroupRemoveResourceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupResponse> =
            removeResource(
                params.toBuilder().resourceGroupId(resourceGroupId).build(),
                requestOptions,
            )

        /** @see removeResource */
        @MustBeClosed
        fun removeResource(
            params: ResourceGroupRemoveResourceParams
        ): HttpResponseFor<ResourceGroupResponse> = removeResource(params, RequestOptions.none())

        /** @see removeResource */
        @MustBeClosed
        fun removeResource(
            params: ResourceGroupRemoveResourceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupResponse>
    }
}
