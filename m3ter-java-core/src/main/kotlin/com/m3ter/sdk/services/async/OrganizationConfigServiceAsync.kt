// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.OrganizationConfig
import com.m3ter.sdk.models.OrganizationConfigRetrieveParams
import com.m3ter.sdk.models.OrganizationConfigUpdateParams
import java.util.concurrent.CompletableFuture

interface OrganizationConfigServiceAsync {

    /** Retrieve the Organization-wide configuration details. */
    @JvmOverloads
    fun retrieve(
        params: OrganizationConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationConfig>

    /** Update the Organization-wide configuration details. */
    @JvmOverloads
    fun update(
        params: OrganizationConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationConfig>
}
