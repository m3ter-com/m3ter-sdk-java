// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.PricingCreateParams
import com.m3ter.sdk.models.PricingDeleteParams
import com.m3ter.sdk.models.PricingListPageAsync
import com.m3ter.sdk.models.PricingListParams
import com.m3ter.sdk.models.PricingResponse
import com.m3ter.sdk.models.PricingRetrieveParams
import com.m3ter.sdk.models.PricingUpdateParams
import java.util.concurrent.CompletableFuture

interface PricingServiceAsync {

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
    fun create(params: PricingCreateParams): CompletableFuture<PricingResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PricingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PricingResponse>

    /** Retrieve the Pricing with the given UUID. */
    fun retrieve(params: PricingRetrieveParams): CompletableFuture<PricingResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PricingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PricingResponse>

    /**
     * Update Pricing for the given UUID.
     *
     * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call
     * to be valid. If you omit both, then you will receive a validation error.
     */
    fun update(params: PricingUpdateParams): CompletableFuture<PricingResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PricingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PricingResponse>

    /** Retrieve a list of Pricings filtered by date, Plan ID, PlanTemplate ID, or Pricing ID. */
    fun list(params: PricingListParams): CompletableFuture<PricingListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: PricingListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PricingListPageAsync>

    /** Delete the Pricing with the given UUID. */
    fun delete(params: PricingDeleteParams): CompletableFuture<PricingResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: PricingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PricingResponse>

    /**
     * A view of [PricingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/pricings`, but is otherwise
         * the same as [PricingServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: PricingCreateParams
        ): CompletableFuture<HttpResponseFor<PricingResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PricingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PricingResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/pricings/{id}`, but is
         * otherwise the same as [PricingServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: PricingRetrieveParams
        ): CompletableFuture<HttpResponseFor<PricingResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PricingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PricingResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/pricings/{id}`, but is
         * otherwise the same as [PricingServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: PricingUpdateParams
        ): CompletableFuture<HttpResponseFor<PricingResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PricingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PricingResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/pricings`, but is otherwise
         * the same as [PricingServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: PricingListParams
        ): CompletableFuture<HttpResponseFor<PricingListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PricingListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PricingListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/pricings/{id}`, but is
         * otherwise the same as [PricingServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: PricingDeleteParams
        ): CompletableFuture<HttpResponseFor<PricingResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: PricingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PricingResponse>>
    }
}
