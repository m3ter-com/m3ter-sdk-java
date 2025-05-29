// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.OrganizationConfigResponse
import com.m3ter.models.OrganizationConfigRetrieveParams
import com.m3ter.models.OrganizationConfigUpdateParams
import java.util.concurrent.CompletableFuture

interface OrganizationConfigServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve the Organization-wide configuration details. */
    fun retrieve(): CompletableFuture<OrganizationConfigResponse> =
        retrieve(OrganizationConfigRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        params: OrganizationConfigRetrieveParams = OrganizationConfigRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationConfigResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: OrganizationConfigRetrieveParams = OrganizationConfigRetrieveParams.none()
    ): CompletableFuture<OrganizationConfigResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<OrganizationConfigResponse> =
        retrieve(OrganizationConfigRetrieveParams.none(), requestOptions)

    /** Update the Organization-wide configuration details. */
    fun update(
        params: OrganizationConfigUpdateParams
    ): CompletableFuture<OrganizationConfigResponse> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: OrganizationConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationConfigResponse>

    /**
     * A view of [OrganizationConfigServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/organizationconfig`, but is
         * otherwise the same as [OrganizationConfigServiceAsync.retrieve].
         */
        fun retrieve(): CompletableFuture<HttpResponseFor<OrganizationConfigResponse>> =
            retrieve(OrganizationConfigRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            params: OrganizationConfigRetrieveParams = OrganizationConfigRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationConfigResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: OrganizationConfigRetrieveParams = OrganizationConfigRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<OrganizationConfigResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<OrganizationConfigResponse>> =
            retrieve(OrganizationConfigRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/organizationconfig`, but is
         * otherwise the same as [OrganizationConfigServiceAsync.update].
         */
        fun update(
            params: OrganizationConfigUpdateParams
        ): CompletableFuture<HttpResponseFor<OrganizationConfigResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: OrganizationConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationConfigResponse>>
    }
}
