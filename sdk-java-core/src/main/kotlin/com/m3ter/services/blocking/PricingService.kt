// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.PricingCreateParams
import com.m3ter.models.PricingDeleteParams
import com.m3ter.models.PricingListPage
import com.m3ter.models.PricingListParams
import com.m3ter.models.PricingResponse
import com.m3ter.models.PricingRetrieveParams
import com.m3ter.models.PricingUpdateParams

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
    fun create(params: PricingCreateParams): PricingResponse = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PricingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingResponse

    /** Retrieve the Pricing with the given UUID. */
    fun retrieve(params: PricingRetrieveParams): PricingResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
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
    fun update(params: PricingUpdateParams): PricingResponse = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PricingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingResponse

    /** Retrieve a list of Pricings filtered by date, Plan ID, PlanTemplate ID, or Pricing ID. */
    fun list(params: PricingListParams): PricingListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: PricingListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingListPage

    /** Delete the Pricing with the given UUID. */
    fun delete(params: PricingDeleteParams): PricingResponse = delete(params, RequestOptions.none())

    /** @see [delete] */
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
        @MustBeClosed
        fun create(params: PricingCreateParams): HttpResponseFor<PricingResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PricingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/pricings/{id}`, but is
         * otherwise the same as [PricingService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: PricingRetrieveParams): HttpResponseFor<PricingResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PricingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/pricings/{id}`, but is
         * otherwise the same as [PricingService.update].
         */
        @MustBeClosed
        fun update(params: PricingUpdateParams): HttpResponseFor<PricingResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PricingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/pricings`, but is otherwise
         * the same as [PricingService.list].
         */
        @MustBeClosed
        fun list(params: PricingListParams): HttpResponseFor<PricingListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PricingListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingListPage>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/pricings/{id}`, but is
         * otherwise the same as [PricingService.delete].
         */
        @MustBeClosed
        fun delete(params: PricingDeleteParams): HttpResponseFor<PricingResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: PricingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingResponse>
    }
}
