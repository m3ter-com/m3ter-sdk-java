// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.bills

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.BillCreditLineItemCreateParams
import com.m3ter.models.BillCreditLineItemDeleteParams
import com.m3ter.models.BillCreditLineItemListPageAsync
import com.m3ter.models.BillCreditLineItemListParams
import com.m3ter.models.BillCreditLineItemRetrieveParams
import com.m3ter.models.BillCreditLineItemUpdateParams
import com.m3ter.models.CreditLineItemResponse
import java.util.concurrent.CompletableFuture

interface CreditLineItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new Credit line item for the given Bill.
     *
     * When creating Credit line items for Bills, use the Credit Reasons created for your
     * Organization. See [CreditReason](https://www.m3ter.com/docs/api#tag/CreditReason).
     */
    fun create(params: BillCreditLineItemCreateParams): CompletableFuture<CreditLineItemResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BillCreditLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditLineItemResponse>

    /** Retrieve the Credit line item with the given UUID. */
    fun retrieve(
        params: BillCreditLineItemRetrieveParams
    ): CompletableFuture<CreditLineItemResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BillCreditLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditLineItemResponse>

    /** Update the Credit line item with the given UUID. */
    fun update(params: BillCreditLineItemUpdateParams): CompletableFuture<CreditLineItemResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: BillCreditLineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditLineItemResponse>

    /** List the Credit line items for the given Bill. */
    fun list(
        params: BillCreditLineItemListParams
    ): CompletableFuture<BillCreditLineItemListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: BillCreditLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillCreditLineItemListPageAsync>

    /** Delete the Credit line item with the given UUID. */
    fun delete(params: BillCreditLineItemDeleteParams): CompletableFuture<CreditLineItemResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: BillCreditLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditLineItemResponse>

    /**
     * A view of [CreditLineItemServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/bills/{billId}/creditlineitems`, but is otherwise the same as
         * [CreditLineItemServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: BillCreditLineItemCreateParams
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: BillCreditLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/bills/{billId}/creditlineitems/{id}`, but is otherwise the same as
         * [CreditLineItemServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: BillCreditLineItemRetrieveParams
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BillCreditLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/bills/{billId}/creditlineitems/{id}`, but is otherwise the same as
         * [CreditLineItemServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: BillCreditLineItemUpdateParams
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: BillCreditLineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/bills/{billId}/creditlineitems`, but is otherwise the same as
         * [CreditLineItemServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: BillCreditLineItemListParams
        ): CompletableFuture<HttpResponseFor<BillCreditLineItemListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BillCreditLineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillCreditLineItemListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/bills/{billId}/creditlineitems/{id}`, but is otherwise the same as
         * [CreditLineItemServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: BillCreditLineItemDeleteParams
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: BillCreditLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>>
    }
}
