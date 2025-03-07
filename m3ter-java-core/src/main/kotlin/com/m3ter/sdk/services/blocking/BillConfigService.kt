// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.BillConfigResponse
import com.m3ter.sdk.models.BillConfigRetrieveParams
import com.m3ter.sdk.models.BillConfigUpdateParams

interface BillConfigService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve the Organization-wide BillConfig. */
    fun retrieve(params: BillConfigRetrieveParams): BillConfigResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BillConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillConfigResponse

    /**
     * Update the Organization-wide BillConfig.
     *
     * You can use this endpoint to set a global lock date for **all** Bills - any Bill with a
     * service period end date on or before the set date will be locked and cannot be updated or
     * recalculated.
     */
    fun update(params: BillConfigUpdateParams): BillConfigResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: BillConfigUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillConfigResponse

    /** A view of [BillConfigService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/billconfig`, but is otherwise
         * the same as [BillConfigService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: BillConfigRetrieveParams): HttpResponseFor<BillConfigResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BillConfigRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillConfigResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/billconfig`, but is otherwise
         * the same as [BillConfigService.update].
         */
        @MustBeClosed
        fun update(params: BillConfigUpdateParams): HttpResponseFor<BillConfigResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: BillConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillConfigResponse>
    }
}
