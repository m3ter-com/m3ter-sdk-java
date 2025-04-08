// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.CustomFieldRetrieveParams
import com.m3ter.models.CustomFieldUpdateParams
import com.m3ter.models.CustomFieldsResponse

interface CustomFieldService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Retrieve all Custom Fields added at Organizational level for the entities that support them.
     */
    fun retrieve(): CustomFieldsResponse = retrieve(CustomFieldRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CustomFieldRetrieveParams = CustomFieldRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomFieldsResponse

    /** @see [retrieve] */
    fun retrieve(
        params: CustomFieldRetrieveParams = CustomFieldRetrieveParams.none()
    ): CustomFieldsResponse = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(requestOptions: RequestOptions): CustomFieldsResponse =
        retrieve(CustomFieldRetrieveParams.none(), requestOptions)

    /** Update Custom Fields added at Organization level to entities that support them. */
    fun update(): CustomFieldsResponse = update(CustomFieldUpdateParams.none())

    /** @see [update] */
    fun update(
        params: CustomFieldUpdateParams = CustomFieldUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomFieldsResponse

    /** @see [update] */
    fun update(
        params: CustomFieldUpdateParams = CustomFieldUpdateParams.none()
    ): CustomFieldsResponse = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(requestOptions: RequestOptions): CustomFieldsResponse =
        update(CustomFieldUpdateParams.none(), requestOptions)

    /**
     * A view of [CustomFieldService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/customfields`, but is
         * otherwise the same as [CustomFieldService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<CustomFieldsResponse> =
            retrieve(CustomFieldRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CustomFieldRetrieveParams = CustomFieldRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomFieldsResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CustomFieldRetrieveParams = CustomFieldRetrieveParams.none()
        ): HttpResponseFor<CustomFieldsResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<CustomFieldsResponse> =
            retrieve(CustomFieldRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/customfields`, but is
         * otherwise the same as [CustomFieldService.update].
         */
        @MustBeClosed
        fun update(): HttpResponseFor<CustomFieldsResponse> = update(CustomFieldUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CustomFieldUpdateParams = CustomFieldUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomFieldsResponse>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CustomFieldUpdateParams = CustomFieldUpdateParams.none()
        ): HttpResponseFor<CustomFieldsResponse> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(requestOptions: RequestOptions): HttpResponseFor<CustomFieldsResponse> =
            update(CustomFieldUpdateParams.none(), requestOptions)
    }
}
