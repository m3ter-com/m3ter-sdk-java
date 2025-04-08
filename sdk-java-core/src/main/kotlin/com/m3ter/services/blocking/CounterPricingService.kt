// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.CounterPricingCreateParams
import com.m3ter.models.CounterPricingDeleteParams
import com.m3ter.models.CounterPricingListPage
import com.m3ter.models.CounterPricingListParams
import com.m3ter.models.CounterPricingResponse
import com.m3ter.models.CounterPricingRetrieveParams
import com.m3ter.models.CounterPricingUpdateParams

interface CounterPricingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new CounterPricing.
     *
     * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call
     * to be valid. If you omit both, then you will receive a validation error.
     */
    fun create(params: CounterPricingCreateParams): CounterPricingResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CounterPricingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterPricingResponse

    /** Retrieve a CounterPricing for the given UUID. */
    fun retrieve(params: CounterPricingRetrieveParams): CounterPricingResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CounterPricingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterPricingResponse

    /**
     * Update CounterPricing for the given UUID.
     *
     * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call
     * to be valid. If you omit both, then you will receive a validation error.
     */
    fun update(params: CounterPricingUpdateParams): CounterPricingResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CounterPricingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterPricingResponse

    /**
     * Retrieve a list of CounterPricing entities filtered by date, Plan ID, Plan Template ID, or
     * CounterPricing ID.
     */
    fun list(): CounterPricingListPage = list(CounterPricingListParams.none())

    /** @see [list] */
    fun list(
        params: CounterPricingListParams = CounterPricingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterPricingListPage

    /** @see [list] */
    fun list(
        params: CounterPricingListParams = CounterPricingListParams.none()
    ): CounterPricingListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CounterPricingListPage =
        list(CounterPricingListParams.none(), requestOptions)

    /** Delete a CounterPricing for the given UUID. */
    fun delete(params: CounterPricingDeleteParams): CounterPricingResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CounterPricingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterPricingResponse

    /**
     * A view of [CounterPricingService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/counterpricings`, but is
         * otherwise the same as [CounterPricingService.create].
         */
        @MustBeClosed
        fun create(params: CounterPricingCreateParams): HttpResponseFor<CounterPricingResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CounterPricingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterPricingResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counterpricings/{id}`, but is
         * otherwise the same as [CounterPricingService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: CounterPricingRetrieveParams
        ): HttpResponseFor<CounterPricingResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CounterPricingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterPricingResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/counterpricings/{id}`, but is
         * otherwise the same as [CounterPricingService.update].
         */
        @MustBeClosed
        fun update(params: CounterPricingUpdateParams): HttpResponseFor<CounterPricingResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CounterPricingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterPricingResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counterpricings`, but is
         * otherwise the same as [CounterPricingService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CounterPricingListPage> = list(CounterPricingListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CounterPricingListParams = CounterPricingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterPricingListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CounterPricingListParams = CounterPricingListParams.none()
        ): HttpResponseFor<CounterPricingListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CounterPricingListPage> =
            list(CounterPricingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/counterpricings/{id}`, but
         * is otherwise the same as [CounterPricingService.delete].
         */
        @MustBeClosed
        fun delete(params: CounterPricingDeleteParams): HttpResponseFor<CounterPricingResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CounterPricingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterPricingResponse>
    }
}
