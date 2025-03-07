// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.PricingCreateParams
import com.m3ter.sdk.models.PricingDeleteParams
import com.m3ter.sdk.models.PricingListPage
import com.m3ter.sdk.models.PricingListParams
import com.m3ter.sdk.models.PricingResponse
import com.m3ter.sdk.models.PricingRetrieveParams
import com.m3ter.sdk.models.PricingUpdateParams

interface PricingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new Pricing.
     *
     * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call
     * to be valid. If you omit both, then you will receive a validation error.
     */
    @JvmOverloads
    fun create(
        params: PricingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingResponse

    /** Retrieve the Pricing with the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: PricingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingResponse

    /**
     * Update Pricing for the given UUID.
     *
     * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call
     * to be valid. If you omit both, then you will receive a validation error.
     */
    @JvmOverloads
    fun update(
        params: PricingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingResponse

    /** Retrieve a list of Pricings filtered by date, Plan ID, PlanTemplate ID, or Pricing ID. */
    @JvmOverloads
    fun list(
        params: PricingListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingListPage

    /** Delete the Pricing with the given UUID. */
    @JvmOverloads
    fun delete(
        params: PricingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingResponse

    /** A view of [PricingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/pricings`, but is otherwise
         * the same as [PricingService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: PricingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/pricings/{id}`, but is
         * otherwise the same as [PricingService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: PricingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/pricings/{id}`, but is
         * otherwise the same as [PricingService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: PricingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/pricings`, but is otherwise
         * the same as [PricingService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: PricingListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingListPage>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/pricings/{id}`, but is
         * otherwise the same as [PricingService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: PricingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingResponse>
    }
}
