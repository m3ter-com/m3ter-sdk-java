// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.bills

import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.BillDebitLineItemCreateParams
import com.m3ter.models.BillDebitLineItemDeleteParams
import com.m3ter.models.BillDebitLineItemListPageAsync
import com.m3ter.models.BillDebitLineItemListParams
import com.m3ter.models.BillDebitLineItemRetrieveParams
import com.m3ter.models.BillDebitLineItemUpdateParams
import com.m3ter.models.DebitLineItemResponse
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
    fun create(
        billId: String,
        params: BillDebitLineItemCreateParams,
    ): CompletableFuture<DebitLineItemResponse> = create(billId, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        billId: String,
        params: BillDebitLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitLineItemResponse> =
        create(params.toBuilder().billId(billId).build(), requestOptions)

    /** @see [create] */
    fun create(params: BillDebitLineItemCreateParams): CompletableFuture<DebitLineItemResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BillDebitLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitLineItemResponse>

    /** Retrieve the Debit line item with the given UUID. */
    fun retrieve(
        id: String,
        params: BillDebitLineItemRetrieveParams,
    ): CompletableFuture<DebitLineItemResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: BillDebitLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitLineItemResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: BillDebitLineItemRetrieveParams
    ): CompletableFuture<DebitLineItemResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BillDebitLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitLineItemResponse>

    /** Update the Debit line item with the given UUID. */
    fun update(
        id: String,
        params: BillDebitLineItemUpdateParams,
    ): CompletableFuture<DebitLineItemResponse> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: BillDebitLineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitLineItemResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: BillDebitLineItemUpdateParams): CompletableFuture<DebitLineItemResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: BillDebitLineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitLineItemResponse>

    /** List the Debit line items for the given bill. */
    fun list(billId: String): CompletableFuture<BillDebitLineItemListPageAsync> =
        list(billId, BillDebitLineItemListParams.none())

    /** @see [list] */
    fun list(
        billId: String,
        params: BillDebitLineItemListParams = BillDebitLineItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillDebitLineItemListPageAsync> =
        list(params.toBuilder().billId(billId).build(), requestOptions)

    /** @see [list] */
    fun list(
        billId: String,
        params: BillDebitLineItemListParams = BillDebitLineItemListParams.none(),
    ): CompletableFuture<BillDebitLineItemListPageAsync> =
        list(billId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: BillDebitLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillDebitLineItemListPageAsync>

    /** @see [list] */
    fun list(
        params: BillDebitLineItemListParams
    ): CompletableFuture<BillDebitLineItemListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        billId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillDebitLineItemListPageAsync> =
        list(billId, BillDebitLineItemListParams.none(), requestOptions)

    /** Delete the Debit line item with the given UUID. */
    fun delete(
        id: String,
        params: BillDebitLineItemDeleteParams,
    ): CompletableFuture<DebitLineItemResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: BillDebitLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitLineItemResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
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
        fun create(
            billId: String,
            params: BillDebitLineItemCreateParams,
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> =
            create(billId, params, RequestOptions.none())

        /** @see [create] */
        fun create(
            billId: String,
            params: BillDebitLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> =
            create(params.toBuilder().billId(billId).build(), requestOptions)

        /** @see [create] */
        fun create(
            params: BillDebitLineItemCreateParams
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: BillDebitLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/bills/{billId}/debitlineitems/{id}`, but is otherwise the same as
         * [DebitLineItemServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: BillDebitLineItemRetrieveParams,
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: BillDebitLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            params: BillDebitLineItemRetrieveParams
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: BillDebitLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/bills/{billId}/debitlineitems/{id}`, but is otherwise the same as
         * [DebitLineItemServiceAsync.update].
         */
        fun update(
            id: String,
            params: BillDebitLineItemUpdateParams,
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            params: BillDebitLineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            params: BillDebitLineItemUpdateParams
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: BillDebitLineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/bills/{billId}/debitlineitems`, but is otherwise the same as
         * [DebitLineItemServiceAsync.list].
         */
        fun list(
            billId: String
        ): CompletableFuture<HttpResponseFor<BillDebitLineItemListPageAsync>> =
            list(billId, BillDebitLineItemListParams.none())

        /** @see [list] */
        fun list(
            billId: String,
            params: BillDebitLineItemListParams = BillDebitLineItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillDebitLineItemListPageAsync>> =
            list(params.toBuilder().billId(billId).build(), requestOptions)

        /** @see [list] */
        fun list(
            billId: String,
            params: BillDebitLineItemListParams = BillDebitLineItemListParams.none(),
        ): CompletableFuture<HttpResponseFor<BillDebitLineItemListPageAsync>> =
            list(billId, params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: BillDebitLineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillDebitLineItemListPageAsync>>

        /** @see [list] */
        fun list(
            params: BillDebitLineItemListParams
        ): CompletableFuture<HttpResponseFor<BillDebitLineItemListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            billId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillDebitLineItemListPageAsync>> =
            list(billId, BillDebitLineItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/bills/{billId}/debitlineitems/{id}`, but is otherwise the same as
         * [DebitLineItemServiceAsync.delete].
         */
        fun delete(
            id: String,
            params: BillDebitLineItemDeleteParams,
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: BillDebitLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            params: BillDebitLineItemDeleteParams
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: BillDebitLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitLineItemResponse>>
    }
}
