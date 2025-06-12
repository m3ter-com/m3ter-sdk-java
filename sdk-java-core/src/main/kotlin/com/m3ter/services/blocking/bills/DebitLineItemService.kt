// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.bills

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.BillDebitLineItemCreateParams
import com.m3ter.models.BillDebitLineItemDeleteParams
import com.m3ter.models.BillDebitLineItemListPage
import com.m3ter.models.BillDebitLineItemListParams
import com.m3ter.models.BillDebitLineItemRetrieveParams
import com.m3ter.models.BillDebitLineItemUpdateParams
import com.m3ter.models.DebitLineItemResponse
import java.util.function.Consumer

interface DebitLineItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DebitLineItemService

    /**
     * Create a new Debit line item for the given bill.
     *
     * When creating Debit line items for Bills, use the Debit Reasons created for your
     * Organization. See [DebitReason](https://www.m3ter.com/docs/api#tag/DebitReason).
     */
    fun create(billId: String, params: BillDebitLineItemCreateParams): DebitLineItemResponse =
        create(billId, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        billId: String,
        params: BillDebitLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DebitLineItemResponse = create(params.toBuilder().billId(billId).build(), requestOptions)

    /** @see [create] */
    fun create(params: BillDebitLineItemCreateParams): DebitLineItemResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BillDebitLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DebitLineItemResponse

    /** Retrieve the Debit line item with the given UUID. */
    fun retrieve(id: String, params: BillDebitLineItemRetrieveParams): DebitLineItemResponse =
        retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: BillDebitLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DebitLineItemResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: BillDebitLineItemRetrieveParams): DebitLineItemResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BillDebitLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DebitLineItemResponse

    /** Update the Debit line item with the given UUID. */
    fun update(id: String, params: BillDebitLineItemUpdateParams): DebitLineItemResponse =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: BillDebitLineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DebitLineItemResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: BillDebitLineItemUpdateParams): DebitLineItemResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: BillDebitLineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DebitLineItemResponse

    /** List the Debit line items for the given bill. */
    fun list(billId: String): BillDebitLineItemListPage =
        list(billId, BillDebitLineItemListParams.none())

    /** @see [list] */
    fun list(
        billId: String,
        params: BillDebitLineItemListParams = BillDebitLineItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillDebitLineItemListPage = list(params.toBuilder().billId(billId).build(), requestOptions)

    /** @see [list] */
    fun list(
        billId: String,
        params: BillDebitLineItemListParams = BillDebitLineItemListParams.none(),
    ): BillDebitLineItemListPage = list(billId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: BillDebitLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillDebitLineItemListPage

    /** @see [list] */
    fun list(params: BillDebitLineItemListParams): BillDebitLineItemListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(billId: String, requestOptions: RequestOptions): BillDebitLineItemListPage =
        list(billId, BillDebitLineItemListParams.none(), requestOptions)

    /** Delete the Debit line item with the given UUID. */
    fun delete(id: String, params: BillDebitLineItemDeleteParams): DebitLineItemResponse =
        delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: BillDebitLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DebitLineItemResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DebitLineItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/bills/{billId}/debitlineitems`, but is otherwise the same as
         * [DebitLineItemService.create].
         */
        @MustBeClosed
        fun create(
            billId: String,
            params: BillDebitLineItemCreateParams,
        ): HttpResponseFor<DebitLineItemResponse> = create(billId, params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            billId: String,
            params: BillDebitLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DebitLineItemResponse> =
            create(params.toBuilder().billId(billId).build(), requestOptions)

        /** @see [create] */
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
            id: String,
            params: BillDebitLineItemRetrieveParams,
        ): HttpResponseFor<DebitLineItemResponse> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BillDebitLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DebitLineItemResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
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
        fun update(
            id: String,
            params: BillDebitLineItemUpdateParams,
        ): HttpResponseFor<DebitLineItemResponse> = update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: BillDebitLineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DebitLineItemResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
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
        fun list(billId: String): HttpResponseFor<BillDebitLineItemListPage> =
            list(billId, BillDebitLineItemListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            billId: String,
            params: BillDebitLineItemListParams = BillDebitLineItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillDebitLineItemListPage> =
            list(params.toBuilder().billId(billId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            billId: String,
            params: BillDebitLineItemListParams = BillDebitLineItemListParams.none(),
        ): HttpResponseFor<BillDebitLineItemListPage> = list(billId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BillDebitLineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillDebitLineItemListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: BillDebitLineItemListParams): HttpResponseFor<BillDebitLineItemListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            billId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillDebitLineItemListPage> =
            list(billId, BillDebitLineItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/bills/{billId}/debitlineitems/{id}`, but is otherwise the same as
         * [DebitLineItemService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: BillDebitLineItemDeleteParams,
        ): HttpResponseFor<DebitLineItemResponse> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: BillDebitLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DebitLineItemResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
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
