// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.ResourceGroup
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
import com.m3ter.sdk.models.ResourceGroupRetrieveParams
import com.m3ter.sdk.models.ResourceGroupUpdateParams
import java.util.concurrent.CompletableFuture

interface ResourceGroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a ResourceGroup for the UUID */
    @JvmOverloads
    fun create(
        params: ResourceGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroup>

    /** Retrieve the ResourceGroup for the UUID */
    @JvmOverloads
    fun retrieve(
        params: ResourceGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroup>

    /** Update the ResourceGroup for the UUID */
    @JvmOverloads
    fun update(
        params: ResourceGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroup>

    /** Retrieve a list of ResourceGroup entities */
    @JvmOverloads
    fun list(
        params: ResourceGroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupListPageAsync>

    /** Delete a ResourceGroup for the UUID */
    @JvmOverloads
    fun delete(
        params: ResourceGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroup>

    /** Add an item to a ResourceGroup. */
    @JvmOverloads
    fun addResource(
        params: ResourceGroupAddResourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroup>

    /** Retrieve a list of items for a ResourceGroup */
    @JvmOverloads
    fun listContents(
        params: ResourceGroupListContentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupListContentsPageAsync>

    /** Retrieve a list of permission policies for a ResourceGroup */
    @JvmOverloads
    fun listPermissions(
        params: ResourceGroupListPermissionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupListPermissionsPageAsync>

    /** Remove an item from a ResourceGroup. */
    @JvmOverloads
    fun removeResource(
        params: ResourceGroupRemoveResourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroup>

    /**
     * A view of [ResourceGroupServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/resourcegroups/{type}`, but
         * is otherwise the same as [ResourceGroupServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ResourceGroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroup>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/resourcegroups/{type}/{id}`,
         * but is otherwise the same as [ResourceGroupServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ResourceGroupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroup>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/resourcegroups/{type}/{id}`,
         * but is otherwise the same as [ResourceGroupServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: ResourceGroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroup>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/resourcegroups/{type}`, but
         * is otherwise the same as [ResourceGroupServiceAsync.list].
         */
        @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: ResourceGroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroup>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/resourcegroups/{type}/{resourceGroupId}/addresource`, but is
         * otherwise the same as [ResourceGroupServiceAsync.addResource].
         */
        @JvmOverloads
        @MustBeClosed
        fun addResource(
            params: ResourceGroupAddResourceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroup>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/resourcegroups/{type}/{resourceGroupId}/contents`, but is
         * otherwise the same as [ResourceGroupServiceAsync.listContents].
         */
        @JvmOverloads
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
        @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun removeResource(
            params: ResourceGroupRemoveResourceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroup>>
    }
}
