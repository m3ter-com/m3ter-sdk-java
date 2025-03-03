// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.CustomFieldRetrieveParams
import com.m3ter.sdk.models.CustomFieldUpdateParams
import com.m3ter.sdk.models.CustomFields

interface CustomFieldService {

    /**
     * Retrieve all Custom Fields added at Organizational level for the entities that support them.
     */
    @JvmOverloads
    fun retrieve(
        params: CustomFieldRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomFields

    /** Update Custom Fields added at Organization level to entities that support them. */
    @JvmOverloads
    fun update(
        params: CustomFieldUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomFields
}
