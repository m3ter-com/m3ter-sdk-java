// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async.bills

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.BillLineItemListPageAsync
import com.m3ter.sdk.models.BillLineItemListParams
import com.m3ter.sdk.models.BillLineItemRetrieveParams
import com.m3ter.sdk.models.LineItemResponse
import java.util.concurrent.CompletableFuture

interface LineItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Retrieves a specific line item within a Bill.
     *
     * This endpoint retrieves the line item given by its unique identifier (UUID) from a specific
     * Bill.
     */
    fun retrieve(params: BillLineItemRetrieveParams): CompletableFuture<LineItemResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BillLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LineItemResponse>

    /**
     * Lists all the line items for a specific Bill.
     *
     * This endpoint retrieves a list of line items for the given Bill within the specified
     * Organization. The list can also be paginated for easier management. The line items returned
     * in the list include individual charges, discounts, or adjustments within a Bill.
     */
    fun list(params: BillLineItemListParams): CompletableFuture<BillLineItemListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: BillLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillLineItemListPageAsync>

    /**
     * A view of [LineItemServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/bills/{billId}/lineitems/{id}`, but is otherwise the same as
         * [LineItemServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: BillLineItemRetrieveParams
        ): CompletableFuture<HttpResponseFor<LineItemResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BillLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LineItemResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/bills/{billId}/lineitems`,
         * but is otherwise the same as [LineItemServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: BillLineItemListParams
        ): CompletableFuture<HttpResponseFor<BillLineItemListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BillLineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillLineItemListPageAsync>>
    }
}
