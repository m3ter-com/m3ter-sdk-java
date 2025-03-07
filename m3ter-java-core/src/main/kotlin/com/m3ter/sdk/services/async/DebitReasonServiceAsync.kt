// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
    fun create(
        params: DebitReasonCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitReasonResponse>

    /** Retrieve the Debit Reason with the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: DebitReasonRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitReasonResponse>

    /** Update the Debit Reason with the given UUID. */
    @JvmOverloads
    fun update(
        params: DebitReasonUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitReasonResponse>

    /**
     * Retrieve a list of the Debit Reason entities created for your Organization. You can filter
     * the list returned for the call by Debit Reason ID, Debit Reason short code, or by Archive
     * status.
     */
    @JvmOverloads
    fun list(
        params: DebitReasonListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitReasonListPageAsync>

    /** Delete the Debit Reason with the given UUID. */
    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: DebitReasonCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/picklists/debitreasons/{id}`,
         * but is otherwise the same as [DebitReasonServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: DebitReasonRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/picklists/debitreasons/{id}`,
         * but is otherwise the same as [DebitReasonServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: DebitReasonUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/picklists/debitreasons`, but
         * is otherwise the same as [DebitReasonServiceAsync.list].
         */
        @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: DebitReasonDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>>
    }
}
