// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.BillConfigResponse
import com.m3ter.sdk.models.BillConfigRetrieveParams
import com.m3ter.sdk.models.BillConfigUpdateParams
import java.util.concurrent.CompletableFuture

interface BillConfigServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve the Organization-wide BillConfig. */
    fun retrieve(params: BillConfigRetrieveParams): CompletableFuture<BillConfigResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BillConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillConfigResponse>

    /**
     * Update the Organization-wide BillConfig.
     *
     * You can use this endpoint to set a global lock date for **all** Bills - any Bill with a
     * service period end date on or before the set date will be locked and cannot be updated or
     * recalculated.
     */
    fun update(params: BillConfigUpdateParams): CompletableFuture<BillConfigResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: BillConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillConfigResponse>

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
        fun retrieve(
            params: BillConfigRetrieveParams
        ): CompletableFuture<HttpResponseFor<BillConfigResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BillConfigRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillConfigResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/billconfig`, but is otherwise
         * the same as [BillConfigServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: BillConfigUpdateParams
        ): CompletableFuture<HttpResponseFor<BillConfigResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: BillConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillConfigResponse>>
    }
}
