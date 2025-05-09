// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.ResourceGroupAddResourceParams
import com.m3ter.models.ResourceGroupCreateParams
import com.m3ter.models.ResourceGroupDeleteParams
import com.m3ter.models.ResourceGroupListContentsPageAsync
import com.m3ter.models.ResourceGroupListContentsParams
import com.m3ter.models.ResourceGroupListPageAsync
import com.m3ter.models.ResourceGroupListParams
import com.m3ter.models.ResourceGroupListPermissionsPageAsync
import com.m3ter.models.ResourceGroupListPermissionsParams
import com.m3ter.models.ResourceGroupRemoveResourceParams
import com.m3ter.models.ResourceGroupResponse
import com.m3ter.models.ResourceGroupRetrieveParams
import com.m3ter.models.ResourceGroupUpdateParams
import java.util.concurrent.CompletableFuture

interface ResourceGroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ResourceGroup for the UUID */
    fun create(
        type: String,
        params: ResourceGroupCreateParams,
    ): CompletableFuture<ResourceGroupResponse> = create(type, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        type: String,
        params: ResourceGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupResponse> =
        create(params.toBuilder().type(type).build(), requestOptions)

    /** @see [create] */
    fun create(params: ResourceGroupCreateParams): CompletableFuture<ResourceGroupResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ResourceGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupResponse>

    /** Retrieve the ResourceGroup for the UUID */
    fun retrieve(
        id: String,
        params: ResourceGroupRetrieveParams,
    ): CompletableFuture<ResourceGroupResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ResourceGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: ResourceGroupRetrieveParams): CompletableFuture<ResourceGroupResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ResourceGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupResponse>

    /** Update the ResourceGroup for the UUID */
    fun update(
        id: String,
        params: ResourceGroupUpdateParams,
    ): CompletableFuture<ResourceGroupResponse> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: ResourceGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: ResourceGroupUpdateParams): CompletableFuture<ResourceGroupResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ResourceGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupResponse>

    /** Retrieve a list of ResourceGroup entities */
    fun list(type: String): CompletableFuture<ResourceGroupListPageAsync> =
        list(type, ResourceGroupListParams.none())

    /** @see [list] */
    fun list(
        type: String,
        params: ResourceGroupListParams = ResourceGroupListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupListPageAsync> =
        list(params.toBuilder().type(type).build(), requestOptions)

    /** @see [list] */
    fun list(
        type: String,
        params: ResourceGroupListParams = ResourceGroupListParams.none(),
    ): CompletableFuture<ResourceGroupListPageAsync> = list(type, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: ResourceGroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupListPageAsync>

    /** @see [list] */
    fun list(params: ResourceGroupListParams): CompletableFuture<ResourceGroupListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        type: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ResourceGroupListPageAsync> =
        list(type, ResourceGroupListParams.none(), requestOptions)

    /** Delete a ResourceGroup for the UUID */
    fun delete(
        id: String,
        params: ResourceGroupDeleteParams,
    ): CompletableFuture<ResourceGroupResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: ResourceGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(params: ResourceGroupDeleteParams): CompletableFuture<ResourceGroupResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ResourceGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupResponse>

    /** Add an item to a ResourceGroup. */
    fun addResource(
        resourceGroupId: String,
        params: ResourceGroupAddResourceParams,
    ): CompletableFuture<ResourceGroupResponse> =
        addResource(resourceGroupId, params, RequestOptions.none())

    /** @see [addResource] */
    fun addResource(
        resourceGroupId: String,
        params: ResourceGroupAddResourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupResponse> =
        addResource(params.toBuilder().resourceGroupId(resourceGroupId).build(), requestOptions)

    /** @see [addResource] */
    fun addResource(
        params: ResourceGroupAddResourceParams
    ): CompletableFuture<ResourceGroupResponse> = addResource(params, RequestOptions.none())

    /** @see [addResource] */
    fun addResource(
        params: ResourceGroupAddResourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupResponse>

    /** Retrieve a list of items for a ResourceGroup */
    fun listContents(
        resourceGroupId: String,
        params: ResourceGroupListContentsParams,
    ): CompletableFuture<ResourceGroupListContentsPageAsync> =
        listContents(resourceGroupId, params, RequestOptions.none())

    /** @see [listContents] */
    fun listContents(
        resourceGroupId: String,
        params: ResourceGroupListContentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupListContentsPageAsync> =
        listContents(params.toBuilder().resourceGroupId(resourceGroupId).build(), requestOptions)

    /** @see [listContents] */
    fun listContents(
        params: ResourceGroupListContentsParams
    ): CompletableFuture<ResourceGroupListContentsPageAsync> =
        listContents(params, RequestOptions.none())

    /** @see [listContents] */
    fun listContents(
        params: ResourceGroupListContentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupListContentsPageAsync>

    /** Retrieve a list of permission policies for a ResourceGroup */
    fun listPermissions(
        resourceGroupId: String,
        params: ResourceGroupListPermissionsParams,
    ): CompletableFuture<ResourceGroupListPermissionsPageAsync> =
        listPermissions(resourceGroupId, params, RequestOptions.none())

    /** @see [listPermissions] */
    fun listPermissions(
        resourceGroupId: String,
        params: ResourceGroupListPermissionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupListPermissionsPageAsync> =
        listPermissions(params.toBuilder().resourceGroupId(resourceGroupId).build(), requestOptions)

    /** @see [listPermissions] */
    fun listPermissions(
        params: ResourceGroupListPermissionsParams
    ): CompletableFuture<ResourceGroupListPermissionsPageAsync> =
        listPermissions(params, RequestOptions.none())

    /** @see [listPermissions] */
    fun listPermissions(
        params: ResourceGroupListPermissionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupListPermissionsPageAsync>

    /** Remove an item from a ResourceGroup. */
    fun removeResource(
        resourceGroupId: String,
        params: ResourceGroupRemoveResourceParams,
    ): CompletableFuture<ResourceGroupResponse> =
        removeResource(resourceGroupId, params, RequestOptions.none())

    /** @see [removeResource] */
    fun removeResource(
        resourceGroupId: String,
        params: ResourceGroupRemoveResourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupResponse> =
        removeResource(params.toBuilder().resourceGroupId(resourceGroupId).build(), requestOptions)

    /** @see [removeResource] */
    fun removeResource(
        params: ResourceGroupRemoveResourceParams
    ): CompletableFuture<ResourceGroupResponse> = removeResource(params, RequestOptions.none())

    /** @see [removeResource] */
    fun removeResource(
        params: ResourceGroupRemoveResourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupResponse>

    /**
     * A view of [ResourceGroupServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/resourcegroups/{type}`, but
         * is otherwise the same as [ResourceGroupServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            type: String,
            params: ResourceGroupCreateParams,
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> =
            create(type, params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            type: String,
            params: ResourceGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> =
            create(params.toBuilder().type(type).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ResourceGroupCreateParams
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ResourceGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/resourcegroups/{type}/{id}`,
         * but is otherwise the same as [ResourceGroupServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ResourceGroupRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ResourceGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ResourceGroupRetrieveParams
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ResourceGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/resourcegroups/{type}/{id}`,
         * but is otherwise the same as [ResourceGroupServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: ResourceGroupUpdateParams,
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: ResourceGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ResourceGroupUpdateParams
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ResourceGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/resourcegroups/{type}`, but
         * is otherwise the same as [ResourceGroupServiceAsync.list].
         */
        @MustBeClosed
        fun list(type: String): CompletableFuture<HttpResponseFor<ResourceGroupListPageAsync>> =
            list(type, ResourceGroupListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            type: String,
            params: ResourceGroupListParams = ResourceGroupListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupListPageAsync>> =
            list(params.toBuilder().type(type).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            type: String,
            params: ResourceGroupListParams = ResourceGroupListParams.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupListPageAsync>> =
            list(type, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ResourceGroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ResourceGroupListParams
        ): CompletableFuture<HttpResponseFor<ResourceGroupListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            type: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ResourceGroupListPageAsync>> =
            list(type, ResourceGroupListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/resourcegroups/{type}/{id}`, but is otherwise the same as
         * [ResourceGroupServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: ResourceGroupDeleteParams,
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: ResourceGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ResourceGroupDeleteParams
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ResourceGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/resourcegroups/{type}/{resourceGroupId}/addresource`, but is
         * otherwise the same as [ResourceGroupServiceAsync.addResource].
         */
        @MustBeClosed
        fun addResource(
            resourceGroupId: String,
            params: ResourceGroupAddResourceParams,
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> =
            addResource(resourceGroupId, params, RequestOptions.none())

        /** @see [addResource] */
        @MustBeClosed
        fun addResource(
            resourceGroupId: String,
            params: ResourceGroupAddResourceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> =
            addResource(params.toBuilder().resourceGroupId(resourceGroupId).build(), requestOptions)

        /** @see [addResource] */
        @MustBeClosed
        fun addResource(
            params: ResourceGroupAddResourceParams
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> =
            addResource(params, RequestOptions.none())

        /** @see [addResource] */
        @MustBeClosed
        fun addResource(
            params: ResourceGroupAddResourceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/resourcegroups/{type}/{resourceGroupId}/contents`, but is
         * otherwise the same as [ResourceGroupServiceAsync.listContents].
         */
        @MustBeClosed
        fun listContents(
            resourceGroupId: String,
            params: ResourceGroupListContentsParams,
        ): CompletableFuture<HttpResponseFor<ResourceGroupListContentsPageAsync>> =
            listContents(resourceGroupId, params, RequestOptions.none())

        /** @see [listContents] */
        @MustBeClosed
        fun listContents(
            resourceGroupId: String,
            params: ResourceGroupListContentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupListContentsPageAsync>> =
            listContents(
                params.toBuilder().resourceGroupId(resourceGroupId).build(),
                requestOptions,
            )

        /** @see [listContents] */
        @MustBeClosed
        fun listContents(
            params: ResourceGroupListContentsParams
        ): CompletableFuture<HttpResponseFor<ResourceGroupListContentsPageAsync>> =
            listContents(params, RequestOptions.none())

        /** @see [listContents] */
        @MustBeClosed
        fun listContents(
            params: ResourceGroupListContentsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupListContentsPageAsync>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/resourcegroups/{type}/{resourceGroupId}/permissions`, but is
         * otherwise the same as [ResourceGroupServiceAsync.listPermissions].
         */
        @MustBeClosed
        fun listPermissions(
            resourceGroupId: String,
            params: ResourceGroupListPermissionsParams,
        ): CompletableFuture<HttpResponseFor<ResourceGroupListPermissionsPageAsync>> =
            listPermissions(resourceGroupId, params, RequestOptions.none())

        /** @see [listPermissions] */
        @MustBeClosed
        fun listPermissions(
            resourceGroupId: String,
            params: ResourceGroupListPermissionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupListPermissionsPageAsync>> =
            listPermissions(
                params.toBuilder().resourceGroupId(resourceGroupId).build(),
                requestOptions,
            )

        /** @see [listPermissions] */
        @MustBeClosed
        fun listPermissions(
            params: ResourceGroupListPermissionsParams
        ): CompletableFuture<HttpResponseFor<ResourceGroupListPermissionsPageAsync>> =
            listPermissions(params, RequestOptions.none())

        /** @see [listPermissions] */
        @MustBeClosed
        fun listPermissions(
            params: ResourceGroupListPermissionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupListPermissionsPageAsync>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/resourcegroups/{type}/{resourceGroupId}/removeresource`, but is
         * otherwise the same as [ResourceGroupServiceAsync.removeResource].
         */
        @MustBeClosed
        fun removeResource(
            resourceGroupId: String,
            params: ResourceGroupRemoveResourceParams,
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> =
            removeResource(resourceGroupId, params, RequestOptions.none())

        /** @see [removeResource] */
        @MustBeClosed
        fun removeResource(
            resourceGroupId: String,
            params: ResourceGroupRemoveResourceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> =
            removeResource(
                params.toBuilder().resourceGroupId(resourceGroupId).build(),
                requestOptions,
            )

        /** @see [removeResource] */
        @MustBeClosed
        fun removeResource(
            params: ResourceGroupRemoveResourceParams
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>> =
            removeResource(params, RequestOptions.none())

        /** @see [removeResource] */
        @MustBeClosed
        fun removeResource(
            params: ResourceGroupRemoveResourceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>>
    }
}
