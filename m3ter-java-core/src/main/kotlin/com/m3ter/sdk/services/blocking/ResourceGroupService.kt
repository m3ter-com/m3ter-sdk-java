// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.ResourceGroup
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
import com.m3ter.sdk.models.ResourceGroupRetrieveParams
import com.m3ter.sdk.models.ResourceGroupUpdateParams

interface ResourceGroupService {

    /** Create a ResourceGroup for the UUID */
    @JvmOverloads
    fun create(
        params: ResourceGroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroup

    /** Retrieve the ResourceGroup for the UUID */
    @JvmOverloads
    fun retrieve(
        params: ResourceGroupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroup

    /** Update the ResourceGroup for the UUID */
    @JvmOverloads
    fun update(
        params: ResourceGroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroup

    /** Retrieve a list of ResourceGroup entities */
    @JvmOverloads
    fun list(
        params: ResourceGroupListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupListPage

    /** Delete a ResourceGroup for the UUID */
    @JvmOverloads
    fun delete(
        params: ResourceGroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroup

    /** Add an item to a ResourceGroup. */
    @JvmOverloads
    fun addResource(
        params: ResourceGroupAddResourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroup

    /** Retrieve a list of items for a ResourceGroup */
    @JvmOverloads
    fun listContents(
        params: ResourceGroupListContentsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupListContentsPage

    /** Retrieve a list of permission policies for a ResourceGroup */
    @JvmOverloads
    fun listPermissions(
        params: ResourceGroupListPermissionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupListPermissionsPage

    /** Remove an item from a ResourceGroup. */
    @JvmOverloads
    fun removeResource(
        params: ResourceGroupRemoveResourceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroup
}
