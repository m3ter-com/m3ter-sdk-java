// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.bills

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.BillDebitLineItemCreateParams
import com.m3ter.models.BillDebitLineItemDeleteParams
import com.m3ter.models.BillDebitLineItemListPage
import com.m3ter.models.BillDebitLineItemListParams
import com.m3ter.models.BillDebitLineItemRetrieveParams
import com.m3ter.models.BillDebitLineItemUpdateParams
import com.m3ter.models.DebitLineItemResponse

interface DebitLineItemService {

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
    fun create(params: BillDebitLineItemCreateParams): DebitLineItemResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BillDebitLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DebitLineItemResponse

    /** Retrieve the Debit line item with the given UUID. */
    fun retrieve(params: BillDebitLineItemRetrieveParams): DebitLineItemResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BillDebitLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DebitLineItemResponse

    /** Update the Debit line item with the given UUID. */
    fun update(params: BillDebitLineItemUpdateParams): DebitLineItemResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: BillDebitLineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DebitLineItemResponse

    /** List the Debit line items for the given bill. */
    fun list(params: BillDebitLineItemListParams): BillDebitLineItemListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: BillDebitLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillDebitLineItemListPage

    /** Delete the Debit line item with the given UUID. */
    fun delete(params: BillDebitLineItemDeleteParams): DebitLineItemResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: BillDebitLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DebitLineItemResponse

    /**
     * A view of [DebitLineItemService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/bills/{billId}/debitlineitems`, but is otherwise the same as
         * [DebitLineItemService.create].
         */
        @MustBeClosed
        fun create(params: BillDebitLineItemCreateParams): HttpResponseFor<DebitLineItemResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: BillDebitLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DebitLineItemResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/bills/{billId}/debitlineitems/{id}`, but is otherwise the same as
         * [DebitLineItemService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: BillDebitLineItemRetrieveParams
        ): HttpResponseFor<DebitLineItemResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BillDebitLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DebitLineItemResponse>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/bills/{billId}/debitlineitems/{id}`, but is otherwise the same as
         * [DebitLineItemService.update].
         */
        @MustBeClosed
        fun update(params: BillDebitLineItemUpdateParams): HttpResponseFor<DebitLineItemResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: BillDebitLineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DebitLineItemResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/bills/{billId}/debitlineitems`, but is otherwise the same as
         * [DebitLineItemService.list].
         */
        @MustBeClosed
        fun list(params: BillDebitLineItemListParams): HttpResponseFor<BillDebitLineItemListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BillDebitLineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillDebitLineItemListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/bills/{billId}/debitlineitems/{id}`, but is otherwise the same as
         * [DebitLineItemService.delete].
         */
        @MustBeClosed
        fun delete(params: BillDebitLineItemDeleteParams): HttpResponseFor<DebitLineItemResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: BillDebitLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DebitLineItemResponse>
    }
}
