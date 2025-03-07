// File generated from our OpenAPI spec by Stainless.

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
import com.m3ter.sdk.models.DebitLineItemResponse
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
    fun create(params: BillDebitLineItemCreateParams): CompletableFuture<DebitLineItemResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BillDebitLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitLineItemResponse>

    /** Retrieve the Debit line item with the given UUID. */
    fun retrieve(
        params: BillDebitLineItemRetrieveParams
    ): CompletableFuture<DebitLineItemResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BillDebitLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitLineItemResponse>

    /** Update the Debit line item with the given UUID. */
    fun update(params: BillDebitLineItemUpdateParams): CompletableFuture<DebitLineItemResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: BillDebitLineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitLineItemResponse>

    /** List the Debit line items for the given bill. */
    fun list(
        params: BillDebitLineItemListParams
    ): CompletableFuture<BillDebitLineItemListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: BillDebitLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillDebitLineItemListPageAsync>

    /** Delete the Debit line item with the given UUID. */
    fun delete(params: BillDebitLineItemDeleteParams): CompletableFuture<DebitLineItemResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: BillDebitLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitLineItemResponse>

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
        @MustBeClosed
        fun create(
            params: BillDebitLineItemCreateParams
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: BillDebitLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/bills/{billId}/debitlineitems/{id}`, but is otherwise the same as
         * [DebitLineItemServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: BillDebitLineItemRetrieveParams
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BillDebitLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/bills/{billId}/debitlineitems/{id}`, but is otherwise the same as
         * [DebitLineItemServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: BillDebitLineItemUpdateParams
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: BillDebitLineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/bills/{billId}/debitlineitems`, but is otherwise the same as
         * [DebitLineItemServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: BillDebitLineItemListParams
        ): CompletableFuture<HttpResponseFor<BillDebitLineItemListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
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
        @MustBeClosed
        fun delete(
            params: BillDebitLineItemDeleteParams
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: BillDebitLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>>
    }
}
