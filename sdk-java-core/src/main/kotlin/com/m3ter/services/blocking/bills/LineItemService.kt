// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.bills

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.BillLineItemListPage
import com.m3ter.models.BillLineItemListParams
import com.m3ter.models.BillLineItemRetrieveParams
import com.m3ter.models.LineItemResponse

interface LineItemService {

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
    fun retrieve(params: BillLineItemRetrieveParams): LineItemResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BillLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LineItemResponse

    /**
     * Lists all the line items for a specific Bill.
     *
     * This endpoint retrieves a list of line items for the given Bill within the specified
     * Organization. The list can also be paginated for easier management. The line items returned
     * in the list include individual charges, discounts, or adjustments within a Bill.
     */
    fun list(params: BillLineItemListParams): BillLineItemListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: BillLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillLineItemListPage

    /** A view of [LineItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/bills/{billId}/lineitems/{id}`, but is otherwise the same as
         * [LineItemService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: BillLineItemRetrieveParams): HttpResponseFor<LineItemResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BillLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LineItemResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/bills/{billId}/lineitems`,
         * but is otherwise the same as [LineItemService.list].
         */
        @MustBeClosed
        fun list(params: BillLineItemListParams): HttpResponseFor<BillLineItemListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BillLineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillLineItemListPage>
    }
}
