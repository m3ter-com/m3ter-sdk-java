// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.OrganizationConfigResponse
import com.m3ter.models.OrganizationConfigRetrieveParams
import com.m3ter.models.OrganizationConfigUpdateParams

interface OrganizationConfigService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve the Organization-wide configuration details. */
    fun retrieve(params: OrganizationConfigRetrieveParams): OrganizationConfigResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: OrganizationConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationConfigResponse

    /** Update the Organization-wide configuration details. */
    fun update(params: OrganizationConfigUpdateParams): OrganizationConfigResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: OrganizationConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OrganizationConfigResponse

    /**
     * A view of [OrganizationConfigService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/organizationconfig`, but is
         * otherwise the same as [OrganizationConfigService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: OrganizationConfigRetrieveParams
        ): HttpResponseFor<OrganizationConfigResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: OrganizationConfigRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrganizationConfigResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/organizationconfig`, but is
         * otherwise the same as [OrganizationConfigService.update].
         */
        @MustBeClosed
        fun update(
            params: OrganizationConfigUpdateParams
        ): HttpResponseFor<OrganizationConfigResponse> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: OrganizationConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OrganizationConfigResponse>
    }
}
