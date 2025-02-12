// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.PlanGroupLink
import com.m3ter.sdk.models.PlanGroupLinkCreateParams
import com.m3ter.sdk.models.PlanGroupLinkDeleteParams
import com.m3ter.sdk.models.PlanGroupLinkListPage
import com.m3ter.sdk.models.PlanGroupLinkListParams
import com.m3ter.sdk.models.PlanGroupLinkRetrieveParams
import com.m3ter.sdk.models.PlanGroupLinkUpdateParams

interface PlanGroupLinkService {

    /** Create a new PlanGroupLink. */
    @JvmOverloads
    fun create(
        params: PlanGroupLinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PlanGroupLink

    /** Retrieve a PlanGroupLink for the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: PlanGroupLinkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PlanGroupLink

    /** Update PlanGroupLink for the given UUID. */
    @JvmOverloads
    fun update(
        params: PlanGroupLinkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PlanGroupLink

    /** Retrieve a list of PlanGroupLink entities */
    @JvmOverloads
    fun list(
        params: PlanGroupLinkListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PlanGroupLinkListPage

    /** Delete a PlanGroupLink for the given UUID. */
    @JvmOverloads
    fun delete(
        params: PlanGroupLinkDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PlanGroupLink
}
