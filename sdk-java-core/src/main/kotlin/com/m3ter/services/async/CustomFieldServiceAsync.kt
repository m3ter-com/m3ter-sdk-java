// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.CustomFieldRetrieveParams
import com.m3ter.models.CustomFieldUpdateParams
import com.m3ter.models.CustomFieldsResponse
import java.util.concurrent.CompletableFuture

interface CustomFieldServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Retrieve all Custom Fields added at Organizational level for the entities that support them.
     */
    fun retrieve(): CompletableFuture<CustomFieldsResponse> =
        retrieve(CustomFieldRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CustomFieldRetrieveParams = CustomFieldRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomFieldsResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: CustomFieldRetrieveParams = CustomFieldRetrieveParams.none()
    ): CompletableFuture<CustomFieldsResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<CustomFieldsResponse> =
        retrieve(CustomFieldRetrieveParams.none(), requestOptions)

    /** Update Custom Fields added at Organization level to entities that support them. */
    fun update(): CompletableFuture<CustomFieldsResponse> = update(CustomFieldUpdateParams.none())

    /** @see [update] */
    fun update(
        params: CustomFieldUpdateParams = CustomFieldUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomFieldsResponse>

    /** @see [update] */
    fun update(
        params: CustomFieldUpdateParams = CustomFieldUpdateParams.none()
    ): CompletableFuture<CustomFieldsResponse> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(requestOptions: RequestOptions): CompletableFuture<CustomFieldsResponse> =
        update(CustomFieldUpdateParams.none(), requestOptions)

    /**
     * A view of [CustomFieldServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/customfields`, but is
         * otherwise the same as [CustomFieldServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<CustomFieldsResponse>> =
            retrieve(CustomFieldRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            params: CustomFieldRetrieveParams = CustomFieldRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomFieldsResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: CustomFieldRetrieveParams = CustomFieldRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<CustomFieldsResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CustomFieldsResponse>> =
            retrieve(CustomFieldRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/customfields`, but is
         * otherwise the same as [CustomFieldServiceAsync.update].
         */
        fun update(): CompletableFuture<HttpResponseFor<CustomFieldsResponse>> =
            update(CustomFieldUpdateParams.none())

        /** @see [update] */
        fun update(
            params: CustomFieldUpdateParams = CustomFieldUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomFieldsResponse>>

        /** @see [update] */
        fun update(
            params: CustomFieldUpdateParams = CustomFieldUpdateParams.none()
        ): CompletableFuture<HttpResponseFor<CustomFieldsResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CustomFieldsResponse>> =
            update(CustomFieldUpdateParams.none(), requestOptions)
    }
}
