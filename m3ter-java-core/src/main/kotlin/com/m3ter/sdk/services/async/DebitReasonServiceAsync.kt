// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.DebitReasonCreateParams
import com.m3ter.sdk.models.DebitReasonDeleteParams
import com.m3ter.sdk.models.DebitReasonListPageAsync
import com.m3ter.sdk.models.DebitReasonListParams
import com.m3ter.sdk.models.DebitReasonResponse
import com.m3ter.sdk.models.DebitReasonRetrieveParams
import com.m3ter.sdk.models.DebitReasonUpdateParams
import java.util.concurrent.CompletableFuture

interface DebitReasonServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new Debit Reason for your Organization. When you've created a Debit Reason, it
     * becomes available as a debit type for adding Debit line items to Bills. See
     * [Debits](https://www.m3ter.com/docs/api#tag/Debits).
     */
    fun create(params: DebitReasonCreateParams): CompletableFuture<DebitReasonResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: DebitReasonCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitReasonResponse>

    /** Retrieve the Debit Reason with the given UUID. */
    fun retrieve(params: DebitReasonRetrieveParams): CompletableFuture<DebitReasonResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DebitReasonRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitReasonResponse>

    /** Update the Debit Reason with the given UUID. */
    fun update(params: DebitReasonUpdateParams): CompletableFuture<DebitReasonResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: DebitReasonUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitReasonResponse>

    /**
     * Retrieve a list of the Debit Reason entities created for your Organization. You can filter
     * the list returned for the call by Debit Reason ID, Debit Reason short code, or by Archive
     * status.
     */
    fun list(params: DebitReasonListParams): CompletableFuture<DebitReasonListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: DebitReasonListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitReasonListPageAsync>

    /** Delete the Debit Reason with the given UUID. */
    fun delete(params: DebitReasonDeleteParams): CompletableFuture<DebitReasonResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: DebitReasonDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitReasonResponse>

    /**
     * A view of [DebitReasonServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/picklists/debitreasons`, but
         * is otherwise the same as [DebitReasonServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: DebitReasonCreateParams
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: DebitReasonCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/picklists/debitreasons/{id}`,
         * but is otherwise the same as [DebitReasonServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: DebitReasonRetrieveParams
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DebitReasonRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/picklists/debitreasons/{id}`,
         * but is otherwise the same as [DebitReasonServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: DebitReasonUpdateParams
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: DebitReasonUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/picklists/debitreasons`, but
         * is otherwise the same as [DebitReasonServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: DebitReasonListParams
        ): CompletableFuture<HttpResponseFor<DebitReasonListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DebitReasonListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitReasonListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/picklists/debitreasons/{id}`, but is otherwise the same as
         * [DebitReasonServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: DebitReasonDeleteParams
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: DebitReasonDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>>
    }
}
