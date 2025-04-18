// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.CounterPricingCreateParams
import com.m3ter.models.CounterPricingDeleteParams
import com.m3ter.models.CounterPricingListPageAsync
import com.m3ter.models.CounterPricingListParams
import com.m3ter.models.CounterPricingResponse
import com.m3ter.models.CounterPricingRetrieveParams
import com.m3ter.models.CounterPricingUpdateParams
import java.util.concurrent.CompletableFuture

interface CounterPricingServiceAsync {

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
    fun create(params: CounterPricingCreateParams): CompletableFuture<CounterPricingResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CounterPricingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterPricingResponse>

    /** Retrieve a CounterPricing for the given UUID. */
    fun retrieve(params: CounterPricingRetrieveParams): CompletableFuture<CounterPricingResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CounterPricingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterPricingResponse>

    /**
     * Update CounterPricing for the given UUID.
     *
     * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call
     * to be valid. If you omit both, then you will receive a validation error.
     */
    fun update(params: CounterPricingUpdateParams): CompletableFuture<CounterPricingResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CounterPricingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterPricingResponse>

    /**
     * Retrieve a list of CounterPricing entities filtered by date, Plan ID, Plan Template ID, or
     * CounterPricing ID.
     */
    fun list(): CompletableFuture<CounterPricingListPageAsync> =
        list(CounterPricingListParams.none())

    /** @see [list] */
    fun list(
        params: CounterPricingListParams = CounterPricingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterPricingListPageAsync>

    /** @see [list] */
    fun list(
        params: CounterPricingListParams = CounterPricingListParams.none()
    ): CompletableFuture<CounterPricingListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CounterPricingListPageAsync> =
        list(CounterPricingListParams.none(), requestOptions)

    /** Delete a CounterPricing for the given UUID. */
    fun delete(params: CounterPricingDeleteParams): CompletableFuture<CounterPricingResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CounterPricingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterPricingResponse>

    /**
     * A view of [CounterPricingServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/counterpricings`, but is
         * otherwise the same as [CounterPricingServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: CounterPricingCreateParams
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CounterPricingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counterpricings/{id}`, but is
         * otherwise the same as [CounterPricingServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: CounterPricingRetrieveParams
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CounterPricingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/counterpricings/{id}`, but is
         * otherwise the same as [CounterPricingServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: CounterPricingUpdateParams
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CounterPricingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counterpricings`, but is
         * otherwise the same as [CounterPricingServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<CounterPricingListPageAsync>> =
            list(CounterPricingListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CounterPricingListParams = CounterPricingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterPricingListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CounterPricingListParams = CounterPricingListParams.none()
        ): CompletableFuture<HttpResponseFor<CounterPricingListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CounterPricingListPageAsync>> =
            list(CounterPricingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/counterpricings/{id}`, but
         * is otherwise the same as [CounterPricingServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: CounterPricingDeleteParams
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CounterPricingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>>
    }
}
