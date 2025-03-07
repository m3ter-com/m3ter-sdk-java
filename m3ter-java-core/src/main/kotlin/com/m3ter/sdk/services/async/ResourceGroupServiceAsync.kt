// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.ResourceGroupAddResourceParams
import com.m3ter.sdk.models.ResourceGroupCreateParams
import com.m3ter.sdk.models.ResourceGroupDeleteParams
import com.m3ter.sdk.models.ResourceGroupListContentsPageAsync
import com.m3ter.sdk.models.ResourceGroupListContentsParams
import com.m3ter.sdk.models.ResourceGroupListPageAsync
import com.m3ter.sdk.models.ResourceGroupListParams
import com.m3ter.sdk.models.ResourceGroupListPermissionsPageAsync
import com.m3ter.sdk.models.ResourceGroupListPermissionsParams
import com.m3ter.sdk.models.ResourceGroupRemoveResourceParams
import com.m3ter.sdk.models.ResourceGroupResponse
import com.m3ter.sdk.models.ResourceGroupRetrieveParams
import com.m3ter.sdk.models.ResourceGroupUpdateParams
import java.util.concurrent.CompletableFuture

interface ResourceGroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ResourceGroup for the UUID */
    fun create(params: ResourceGroupCreateParams): CompletableFuture<ResourceGroupResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ResourceGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupResponse>

    /** Retrieve the ResourceGroup for the UUID */
    fun retrieve(params: ResourceGroupRetrieveParams): CompletableFuture<ResourceGroupResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ResourceGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupResponse>

    /** Update the ResourceGroup for the UUID */
    fun update(params: ResourceGroupUpdateParams): CompletableFuture<ResourceGroupResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ResourceGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupResponse>

    /** Retrieve a list of ResourceGroup entities */
    fun list(params: ResourceGroupListParams): CompletableFuture<ResourceGroupListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: ResourceGroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupListPageAsync>

    /** Delete a ResourceGroup for the UUID */
    fun delete(params: ResourceGroupDeleteParams): CompletableFuture<ResourceGroupResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ResourceGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupResponse>

    /** Add an item to a ResourceGroup. */
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
        fun list(
            params: ResourceGroupListParams
        ): CompletableFuture<HttpResponseFor<ResourceGroupListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ResourceGroupListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/resourcegroups/{type}/{id}`, but is otherwise the same as
         * [ResourceGroupServiceAsync.delete].
         */
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
