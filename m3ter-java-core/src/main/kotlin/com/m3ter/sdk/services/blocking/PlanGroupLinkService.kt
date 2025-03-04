// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.PlanGroupLink
import com.m3ter.sdk.models.PlanGroupLinkCreateParams
import com.m3ter.sdk.models.PlanGroupLinkDeleteParams
import com.m3ter.sdk.models.PlanGroupLinkListPage
import com.m3ter.sdk.models.PlanGroupLinkListParams
import com.m3ter.sdk.models.PlanGroupLinkRetrieveParams
import com.m3ter.sdk.models.PlanGroupLinkUpdateParams

interface PlanGroupLinkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new PlanGroupLink. */
    @JvmOverloads
    fun create(
        params: PlanGroupLinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupLink

    /** Retrieve a PlanGroupLink for the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: PlanGroupLinkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupLink

    /** Update PlanGroupLink for the given UUID. */
    @JvmOverloads
    fun update(
        params: PlanGroupLinkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupLink

    /** Retrieve a list of PlanGroupLink entities */
    @JvmOverloads
    fun list(
        params: PlanGroupLinkListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupLinkListPage

    /** Delete a PlanGroupLink for the given UUID. */
    @JvmOverloads
    fun delete(
        params: PlanGroupLinkDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupLink

    /**
     * A view of [PlanGroupLinkService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/plangrouplinks`, but is
         * otherwise the same as [PlanGroupLinkService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: PlanGroupLinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupLink>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plangrouplinks/{id}`, but is
         * otherwise the same as [PlanGroupLinkService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: PlanGroupLinkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupLink>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/plangrouplinks/{id}`, but is
         * otherwise the same as [PlanGroupLinkService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: PlanGroupLinkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupLink>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plangrouplinks`, but is
         * otherwise the same as [PlanGroupLinkService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: PlanGroupLinkListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupLinkListPage>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/plangrouplinks/{id}`, but
         * is otherwise the same as [PlanGroupLinkService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: PlanGroupLinkDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupLink>
    }
}
