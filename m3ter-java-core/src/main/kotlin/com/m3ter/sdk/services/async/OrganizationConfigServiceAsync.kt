// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.OrganizationConfigResponse
import com.m3ter.sdk.models.OrganizationConfigRetrieveParams
import com.m3ter.sdk.models.OrganizationConfigUpdateParams
import java.util.concurrent.CompletableFuture

interface OrganizationConfigServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve the Organization-wide configuration details. */
    @JvmOverloads
    fun retrieve(
        params: OrganizationConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OrganizationConfigResponse>

    /** Update the Organization-wide configuration details. */
    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: OrganizationConfigRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationConfigResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/organizationconfig`, but is
         * otherwise the same as [OrganizationConfigServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: OrganizationConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OrganizationConfigResponse>>
    }
}
