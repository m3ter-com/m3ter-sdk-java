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
    fun retrieve(id: String): PricingResponse = retrieve(id, PricingRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PricingRetrieveParams = PricingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PricingRetrieveParams = PricingRetrieveParams.none(),
    ): PricingResponse = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PricingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingResponse

    /** @see [retrieve] */
    fun retrieve(params: PricingRetrieveParams): PricingResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): PricingResponse =
        retrieve(id, PricingRetrieveParams.none(), requestOptions)

    /**
     * Update Pricing for the given UUID.
     *
     * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call
     * to be valid. If you omit both, then you will receive a validation error.
     */
    fun update(id: String, params: PricingUpdateParams): PricingResponse =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: PricingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: PricingUpdateParams): PricingResponse = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PricingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingResponse

    /** Retrieve a list of Pricings filtered by date, Plan ID, PlanTemplate ID, or Pricing ID. */
    fun list(): PricingListPage = list(PricingListParams.none())

    /** @see [list] */
    fun list(
        params: PricingListParams = PricingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingListPage

    /** @see [list] */
    fun list(params: PricingListParams = PricingListParams.none()): PricingListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): PricingListPage =
        list(PricingListParams.none(), requestOptions)

    /** Delete the Pricing with the given UUID. */
    fun delete(id: String): PricingResponse = delete(id, PricingDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: PricingDeleteParams = PricingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: PricingDeleteParams = PricingDeleteParams.none(),
    ): PricingResponse = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: PricingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingResponse

    /** @see [delete] */
    fun delete(params: PricingDeleteParams): PricingResponse = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): PricingResponse =
        delete(id, PricingDeleteParams.none(), requestOptions)

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
        fun retrieve(id: String): HttpResponseFor<PricingResponse> =
            retrieve(id, PricingRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PricingRetrieveParams = PricingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PricingRetrieveParams = PricingRetrieveParams.none(),
        ): HttpResponseFor<PricingResponse> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PricingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: PricingRetrieveParams): HttpResponseFor<PricingResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<PricingResponse> =
            retrieve(id, PricingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/pricings/{id}`, but is
         * otherwise the same as [PricingService.update].
         */
        @MustBeClosed
        fun update(id: String, params: PricingUpdateParams): HttpResponseFor<PricingResponse> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: PricingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
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
        @MustBeClosed fun list(): HttpResponseFor<PricingListPage> = list(PricingListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PricingListParams = PricingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PricingListParams = PricingListParams.none()
        ): HttpResponseFor<PricingListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PricingListPage> =
            list(PricingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/pricings/{id}`, but is
         * otherwise the same as [PricingService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<PricingResponse> =
            delete(id, PricingDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: PricingDeleteParams = PricingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: PricingDeleteParams = PricingDeleteParams.none(),
        ): HttpResponseFor<PricingResponse> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: PricingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: PricingDeleteParams): HttpResponseFor<PricingResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponseFor<PricingResponse> =
            delete(id, PricingDeleteParams.none(), requestOptions)
    }
}
