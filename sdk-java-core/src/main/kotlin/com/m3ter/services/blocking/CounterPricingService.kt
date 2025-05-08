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
    fun retrieve(id: String): CounterPricingResponse =
        retrieve(id, CounterPricingRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: CounterPricingRetrieveParams = CounterPricingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterPricingResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: CounterPricingRetrieveParams = CounterPricingRetrieveParams.none(),
    ): CounterPricingResponse = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CounterPricingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterPricingResponse

    /** @see [retrieve] */
    fun retrieve(params: CounterPricingRetrieveParams): CounterPricingResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CounterPricingResponse =
        retrieve(id, CounterPricingRetrieveParams.none(), requestOptions)

    /**
     * Update CounterPricing for the given UUID.
     *
     * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call
     * to be valid. If you omit both, then you will receive a validation error.
     */
    fun update(id: String, params: CounterPricingUpdateParams): CounterPricingResponse =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: CounterPricingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterPricingResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
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
    fun delete(id: String): CounterPricingResponse = delete(id, CounterPricingDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: CounterPricingDeleteParams = CounterPricingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterPricingResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: CounterPricingDeleteParams = CounterPricingDeleteParams.none(),
    ): CounterPricingResponse = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CounterPricingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterPricingResponse

    /** @see [delete] */
    fun delete(params: CounterPricingDeleteParams): CounterPricingResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CounterPricingResponse =
        delete(id, CounterPricingDeleteParams.none(), requestOptions)

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
        fun retrieve(id: String): HttpResponseFor<CounterPricingResponse> =
            retrieve(id, CounterPricingRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CounterPricingRetrieveParams = CounterPricingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterPricingResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CounterPricingRetrieveParams = CounterPricingRetrieveParams.none(),
        ): HttpResponseFor<CounterPricingResponse> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CounterPricingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterPricingResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CounterPricingRetrieveParams
        ): HttpResponseFor<CounterPricingResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterPricingResponse> =
            retrieve(id, CounterPricingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/counterpricings/{id}`, but is
         * otherwise the same as [CounterPricingService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: CounterPricingUpdateParams,
        ): HttpResponseFor<CounterPricingResponse> = update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: CounterPricingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterPricingResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
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
        fun delete(id: String): HttpResponseFor<CounterPricingResponse> =
            delete(id, CounterPricingDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: CounterPricingDeleteParams = CounterPricingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterPricingResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: CounterPricingDeleteParams = CounterPricingDeleteParams.none(),
        ): HttpResponseFor<CounterPricingResponse> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CounterPricingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterPricingResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: CounterPricingDeleteParams): HttpResponseFor<CounterPricingResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CounterPricingResponse> =
            delete(id, CounterPricingDeleteParams.none(), requestOptions)
    }
}
