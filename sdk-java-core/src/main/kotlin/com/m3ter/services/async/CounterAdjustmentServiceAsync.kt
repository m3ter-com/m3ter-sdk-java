// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.CounterAdjustmentCreateParams
import com.m3ter.models.CounterAdjustmentDeleteParams
import com.m3ter.models.CounterAdjustmentListPageAsync
import com.m3ter.models.CounterAdjustmentListParams
import com.m3ter.models.CounterAdjustmentResponse
import com.m3ter.models.CounterAdjustmentRetrieveParams
import com.m3ter.models.CounterAdjustmentUpdateParams
import java.util.concurrent.CompletableFuture

interface CounterAdjustmentServiceAsync {

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
    fun create(
        params: CounterAdjustmentCreateParams
    ): CompletableFuture<CounterAdjustmentResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CounterAdjustmentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterAdjustmentResponse>

    /** Retrieve a CounterAdjustment for the given UUID. */
    fun retrieve(
        params: CounterAdjustmentRetrieveParams
    ): CompletableFuture<CounterAdjustmentResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CounterAdjustmentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterAdjustmentResponse>

    /** Update a CounterAdjustment for an Account. */
    fun update(
        params: CounterAdjustmentUpdateParams
    ): CompletableFuture<CounterAdjustmentResponse> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CounterAdjustmentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterAdjustmentResponse>

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
    fun list(): CompletableFuture<CounterAdjustmentListPageAsync> =
        list(CounterAdjustmentListParams.none())

    /** @see [list] */
    fun list(
        params: CounterAdjustmentListParams = CounterAdjustmentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterAdjustmentListPageAsync>

    /** @see [list] */
    fun list(
        params: CounterAdjustmentListParams = CounterAdjustmentListParams.none()
    ): CompletableFuture<CounterAdjustmentListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CounterAdjustmentListPageAsync> =
        list(CounterAdjustmentListParams.none(), requestOptions)

    /** Delete a CounterAdjustment for the given UUID. */
    fun delete(
        params: CounterAdjustmentDeleteParams
    ): CompletableFuture<CounterAdjustmentResponse> = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CounterAdjustmentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterAdjustmentResponse>

    /**
     * A view of [CounterAdjustmentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/counteradjustments`, but is
         * otherwise the same as [CounterAdjustmentServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: CounterAdjustmentCreateParams
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CounterAdjustmentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counteradjustments/{id}`, but
         * is otherwise the same as [CounterAdjustmentServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: CounterAdjustmentRetrieveParams
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CounterAdjustmentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/counteradjustments/{id}`, but
         * is otherwise the same as [CounterAdjustmentServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: CounterAdjustmentUpdateParams
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CounterAdjustmentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counteradjustments`, but is
         * otherwise the same as [CounterAdjustmentServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<CounterAdjustmentListPageAsync>> =
            list(CounterAdjustmentListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CounterAdjustmentListParams = CounterAdjustmentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CounterAdjustmentListParams = CounterAdjustmentListParams.none()
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentListPageAsync>> =
            list(CounterAdjustmentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/counteradjustments/{id}`,
         * but is otherwise the same as [CounterAdjustmentServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: CounterAdjustmentDeleteParams
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CounterAdjustmentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterAdjustmentResponse>>
    }
}
