// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.OrganizationConfig
import com.m3ter.sdk.models.OrganizationConfigRetrieveParams
import com.m3ter.sdk.models.OrganizationConfigUpdateParams

interface OrganizationConfigService {

    /** Retrieve the Organization-wide configuration details. */
    @JvmOverloads
    fun retrieve(
        params: OrganizationConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): OrganizationConfig

    /** Update the Organization-wide configuration details. */
    @JvmOverloads
    fun update(
        params: OrganizationConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): OrganizationConfig
}
