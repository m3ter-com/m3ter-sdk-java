// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.CustomFieldRetrieveParams
import com.m3ter.sdk.models.CustomFieldUpdateParams
import com.m3ter.sdk.models.CustomFieldsResponse

interface CustomFieldService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Retrieve all Custom Fields added at Organizational level for the entities that support them.
     */
    @JvmOverloads
    fun retrieve(
        params: CustomFieldRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomFieldsResponse

    /** Update Custom Fields added at Organization level to entities that support them. */
    @JvmOverloads
    fun update(
        params: CustomFieldUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomFieldsResponse

    /**
     * A view of [CustomFieldService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/customfields`, but is
         * otherwise the same as [CustomFieldService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: CustomFieldRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomFieldsResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/customfields`, but is
         * otherwise the same as [CustomFieldService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: CustomFieldUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomFieldsResponse>
    }
}
