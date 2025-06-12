// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.BillConfigResponse
import com.m3ter.models.BillConfigRetrieveParams
import com.m3ter.models.BillConfigUpdateParams
import java.util.function.Consumer

interface BillConfigService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillConfigService

    /** Retrieve the Organization-wide BillConfig. */
    fun retrieve(): BillConfigResponse = retrieve(BillConfigRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BillConfigRetrieveParams = BillConfigRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillConfigResponse

    /** @see [retrieve] */
    fun retrieve(
        params: BillConfigRetrieveParams = BillConfigRetrieveParams.none()
    ): BillConfigResponse = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(requestOptions: RequestOptions): BillConfigResponse =
        retrieve(BillConfigRetrieveParams.none(), requestOptions)

    /**
     * Update the Organization-wide BillConfig.
     *
     * You can use this endpoint to set a global lock date for **all** Bills - any Bill with a
     * service period end date on or before the set date will be locked and cannot be updated or
     * recalculated.
     */
    fun update(): BillConfigResponse = update(BillConfigUpdateParams.none())

    /** @see [update] */
    fun update(
        params: BillConfigUpdateParams = BillConfigUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillConfigResponse

    /** @see [update] */
    fun update(params: BillConfigUpdateParams = BillConfigUpdateParams.none()): BillConfigResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(requestOptions: RequestOptions): BillConfigResponse =
        update(BillConfigUpdateParams.none(), requestOptions)

    /** A view of [BillConfigService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BillConfigService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/billconfig`, but is otherwise
         * the same as [BillConfigService.retrieve].
         */
        @MustBeClosed
        fun retrieve(): HttpResponseFor<BillConfigResponse> =
            retrieve(BillConfigRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BillConfigRetrieveParams = BillConfigRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillConfigResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BillConfigRetrieveParams = BillConfigRetrieveParams.none()
        ): HttpResponseFor<BillConfigResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(requestOptions: RequestOptions): HttpResponseFor<BillConfigResponse> =
            retrieve(BillConfigRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/billconfig`, but is otherwise
         * the same as [BillConfigService.update].
         */
        @MustBeClosed
        fun update(): HttpResponseFor<BillConfigResponse> = update(BillConfigUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: BillConfigUpdateParams = BillConfigUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillConfigResponse>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: BillConfigUpdateParams = BillConfigUpdateParams.none()
        ): HttpResponseFor<BillConfigResponse> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(requestOptions: RequestOptions): HttpResponseFor<BillConfigResponse> =
            update(BillConfigUpdateParams.none(), requestOptions)
    }
}
