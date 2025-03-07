// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.CounterAdjustmentCreateParams
import com.m3ter.sdk.models.CounterAdjustmentDeleteParams
import com.m3ter.sdk.models.CounterAdjustmentListPage
import com.m3ter.sdk.models.CounterAdjustmentListParams
import com.m3ter.sdk.models.CounterAdjustmentResponse
import com.m3ter.sdk.models.CounterAdjustmentRetrieveParams
import com.m3ter.sdk.models.CounterAdjustmentUpdateParams

interface CounterAdjustmentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new CounterAdjustment for an Account using a Counter.
     *
     * **Notes:**
     * - Use the new absolute value for the Counter for the selected date - if it was 15 and has
     *   increased to 20, enter 20; if it was 15 and has decreased to 10, enter 10. _Do not enter_
     *   the plus or minus value relative to the previous Counter value on the Account.
     * - CounterAdjustments on Accounts are supported down to a _specific day_ of granularity - you
     *   cannot create more than one CounterAdjustment for any given day using the same Counter and
     *   you'll receive an error if you try to do this.
     */
    @JvmOverloads
    fun create(
        params: CounterAdjustmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterAdjustmentResponse

    /** Retrieve a CounterAdjustment for the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: CounterAdjustmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterAdjustmentResponse

    /** Update a CounterAdjustment for an Account. */
    @JvmOverloads
    fun update(
        params: CounterAdjustmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterAdjustmentResponse

    /**
     * Retrieve a list of CounterAdjustments created for Accounts in your Organization. You can
     * filter the list returned by date, Account ID, or Counter ID.
     *
     * **CONSTRAINTS:**
     * - The `counterId` query parameter is always required when calling this endpoint, used either
     *   as a single query parameter or in combination with any of the other query parameters.
     * - If you want to use the `date`, `dateStart`, or `dateEnd` query parameters, you must also
     *   use the `accountId` query parameter.
     */
    @JvmOverloads
    fun list(
        params: CounterAdjustmentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterAdjustmentListPage

    /** Delete a CounterAdjustment for the given UUID. */
    @JvmOverloads
    fun delete(
        params: CounterAdjustmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterAdjustmentResponse

    /**
     * A view of [CounterAdjustmentService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/counteradjustments`, but is
         * otherwise the same as [CounterAdjustmentService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: CounterAdjustmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterAdjustmentResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counteradjustments/{id}`, but
         * is otherwise the same as [CounterAdjustmentService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: CounterAdjustmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterAdjustmentResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/counteradjustments/{id}`, but
         * is otherwise the same as [CounterAdjustmentService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: CounterAdjustmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterAdjustmentResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counteradjustments`, but is
         * otherwise the same as [CounterAdjustmentService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: CounterAdjustmentListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterAdjustmentListPage>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/counteradjustments/{id}`,
         * but is otherwise the same as [CounterAdjustmentService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: CounterAdjustmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterAdjustmentResponse>
    }
}
