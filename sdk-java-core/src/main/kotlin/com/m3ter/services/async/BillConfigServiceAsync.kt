// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.BillConfigResponse
import com.m3ter.models.BillConfigRetrieveParams
import com.m3ter.models.BillConfigUpdateParams
import java.util.concurrent.CompletableFuture

interface BillConfigServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve the Organization-wide BillConfig. */
    fun retrieve(): CompletableFuture<BillConfigResponse> =
        retrieve(BillConfigRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BillConfigRetrieveParams = BillConfigRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillConfigResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: BillConfigRetrieveParams = BillConfigRetrieveParams.none()
    ): CompletableFuture<BillConfigResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(requestOptions: RequestOptions): CompletableFuture<BillConfigResponse> =
        retrieve(BillConfigRetrieveParams.none(), requestOptions)

    /**
     * Update the Organization-wide BillConfig.
     *
     * You can use this endpoint to set a global lock date for **all** Bills - any Bill with a
     * service period end date on or before the set date will be locked and cannot be updated or
     * recalculated.
     */
    fun update(): CompletableFuture<BillConfigResponse> = update(BillConfigUpdateParams.none())

    /** @see [update] */
    fun update(
        params: BillConfigUpdateParams = BillConfigUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillConfigResponse>

    /** @see [update] */
    fun update(
        params: BillConfigUpdateParams = BillConfigUpdateParams.none()
    ): CompletableFuture<BillConfigResponse> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(requestOptions: RequestOptions): CompletableFuture<BillConfigResponse> =
        update(BillConfigUpdateParams.none(), requestOptions)

    /**
     * A view of [BillConfigServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/billconfig`, but is otherwise
         * the same as [BillConfigServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(): CompletableFuture<HttpResponseFor<BillConfigResponse>> =
            retrieve(BillConfigRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BillConfigRetrieveParams = BillConfigRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillConfigResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BillConfigRetrieveParams = BillConfigRetrieveParams.none()
        ): CompletableFuture<HttpResponseFor<BillConfigResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BillConfigResponse>> =
            retrieve(BillConfigRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/billconfig`, but is otherwise
         * the same as [BillConfigServiceAsync.update].
         */
        @MustBeClosed
        fun update(): CompletableFuture<HttpResponseFor<BillConfigResponse>> =
            update(BillConfigUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: BillConfigUpdateParams = BillConfigUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillConfigResponse>>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: BillConfigUpdateParams = BillConfigUpdateParams.none()
        ): CompletableFuture<HttpResponseFor<BillConfigResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BillConfigResponse>> =
            update(BillConfigUpdateParams.none(), requestOptions)
    }
}
