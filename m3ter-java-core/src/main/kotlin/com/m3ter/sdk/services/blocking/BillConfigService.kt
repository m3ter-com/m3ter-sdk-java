// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
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
    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: BillConfigRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillConfigResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/billconfig`, but is otherwise
         * the same as [BillConfigService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: BillConfigUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillConfigResponse>
    }
}
