// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async.bills

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.BillDebitLineItemCreateParams
import com.m3ter.sdk.models.BillDebitLineItemDeleteParams
import com.m3ter.sdk.models.BillDebitLineItemListPageAsync
import com.m3ter.sdk.models.BillDebitLineItemListParams
import com.m3ter.sdk.models.BillDebitLineItemRetrieveParams
import com.m3ter.sdk.models.BillDebitLineItemUpdateParams
import com.m3ter.sdk.models.DebitLineItem
import java.util.concurrent.CompletableFuture

interface DebitLineItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new Debit line item for the given bill.
     *
     * When creating Debit line items for Bills, use the Debit Reasons created for your
     * Organization. See [DebitReason](https://www.m3ter.com/docs/api#tag/DebitReason).
     */
    @JvmOverloads
    fun create(
        params: BillDebitLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitLineItem>

    /** Retrieve the Debit line item with the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: BillDebitLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitLineItem>

    /** Update the Debit line item with the given UUID. */
    @JvmOverloads
    fun update(
        params: BillDebitLineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitLineItem>

    /** List the Debit line items for the given bill. */
    @JvmOverloads
    fun list(
        params: BillDebitLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillDebitLineItemListPageAsync>

    /** Delete the Debit line item with the given UUID. */
    @JvmOverloads
    fun delete(
        params: BillDebitLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitLineItem>

    /**
     * A view of [DebitLineItemServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/bills/{billId}/debitlineitems`, but is otherwise the same as
         * [DebitLineItemServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: BillDebitLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitLineItem>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/bills/{billId}/debitlineitems/{id}`, but is otherwise the same as
         * [DebitLineItemServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: BillDebitLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitLineItem>>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/bills/{billId}/debitlineitems/{id}`, but is otherwise the same as
         * [DebitLineItemServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: BillDebitLineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitLineItem>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/bills/{billId}/debitlineitems`, but is otherwise the same as
         * [DebitLineItemServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: BillDebitLineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillDebitLineItemListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/bills/{billId}/debitlineitems/{id}`, but is otherwise the same as
         * [DebitLineItemServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: BillDebitLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitLineItem>>
    }
}
