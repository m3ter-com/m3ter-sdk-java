// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.bills

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.BillCreditLineItemCreateParams
import com.m3ter.models.BillCreditLineItemDeleteParams
import com.m3ter.models.BillCreditLineItemListPage
import com.m3ter.models.BillCreditLineItemListParams
import com.m3ter.models.BillCreditLineItemRetrieveParams
import com.m3ter.models.BillCreditLineItemUpdateParams
import com.m3ter.models.CreditLineItemResponse
import java.util.function.Consumer

interface CreditLineItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditLineItemService

    /**
     * Create a new Credit line item for the given Bill.
     *
     * When creating Credit line items for Bills, use the Credit Reasons created for your
     * Organization. See [CreditReason](https://www.m3ter.com/docs/api#tag/CreditReason).
     */
    fun create(billId: String, params: BillCreditLineItemCreateParams): CreditLineItemResponse =
        create(billId, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        billId: String,
        params: BillCreditLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditLineItemResponse = create(params.toBuilder().billId(billId).build(), requestOptions)

    /** @see [create] */
    fun create(params: BillCreditLineItemCreateParams): CreditLineItemResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BillCreditLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditLineItemResponse

    /** Retrieve the Credit line item with the given UUID. */
    fun retrieve(id: String, params: BillCreditLineItemRetrieveParams): CreditLineItemResponse =
        retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: BillCreditLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditLineItemResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: BillCreditLineItemRetrieveParams): CreditLineItemResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BillCreditLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditLineItemResponse

    /** Update the Credit line item with the given UUID. */
    fun update(id: String, params: BillCreditLineItemUpdateParams): CreditLineItemResponse =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: BillCreditLineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditLineItemResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: BillCreditLineItemUpdateParams): CreditLineItemResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: BillCreditLineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditLineItemResponse

    /** List the Credit line items for the given Bill. */
    fun list(billId: String): BillCreditLineItemListPage =
        list(billId, BillCreditLineItemListParams.none())

    /** @see [list] */
    fun list(
        billId: String,
        params: BillCreditLineItemListParams = BillCreditLineItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillCreditLineItemListPage = list(params.toBuilder().billId(billId).build(), requestOptions)

    /** @see [list] */
    fun list(
        billId: String,
        params: BillCreditLineItemListParams = BillCreditLineItemListParams.none(),
    ): BillCreditLineItemListPage = list(billId, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: BillCreditLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillCreditLineItemListPage

    /** @see [list] */
    fun list(params: BillCreditLineItemListParams): BillCreditLineItemListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(billId: String, requestOptions: RequestOptions): BillCreditLineItemListPage =
        list(billId, BillCreditLineItemListParams.none(), requestOptions)

    /** Delete the Credit line item with the given UUID. */
    fun delete(id: String, params: BillCreditLineItemDeleteParams): CreditLineItemResponse =
        delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: BillCreditLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditLineItemResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(params: BillCreditLineItemDeleteParams): CreditLineItemResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: BillCreditLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditLineItemResponse

    /**
     * A view of [CreditLineItemService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditLineItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/bills/{billId}/creditlineitems`, but is otherwise the same as
         * [CreditLineItemService.create].
         */
        @MustBeClosed
        fun create(
            billId: String,
            params: BillCreditLineItemCreateParams,
        ): HttpResponseFor<CreditLineItemResponse> = create(billId, params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            billId: String,
            params: BillCreditLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditLineItemResponse> =
            create(params.toBuilder().billId(billId).build(), requestOptions)

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: BillCreditLineItemCreateParams
        ): HttpResponseFor<CreditLineItemResponse> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: BillCreditLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditLineItemResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/bills/{billId}/creditlineitems/{id}`, but is otherwise the same as
         * [CreditLineItemService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BillCreditLineItemRetrieveParams,
        ): HttpResponseFor<CreditLineItemResponse> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BillCreditLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditLineItemResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BillCreditLineItemRetrieveParams
        ): HttpResponseFor<CreditLineItemResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BillCreditLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditLineItemResponse>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/bills/{billId}/creditlineitems/{id}`, but is otherwise the same as
         * [CreditLineItemService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: BillCreditLineItemUpdateParams,
        ): HttpResponseFor<CreditLineItemResponse> = update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: BillCreditLineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditLineItemResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: BillCreditLineItemUpdateParams
        ): HttpResponseFor<CreditLineItemResponse> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: BillCreditLineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditLineItemResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/bills/{billId}/creditlineitems`, but is otherwise the same as
         * [CreditLineItemService.list].
         */
        @MustBeClosed
        fun list(billId: String): HttpResponseFor<BillCreditLineItemListPage> =
            list(billId, BillCreditLineItemListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            billId: String,
            params: BillCreditLineItemListParams = BillCreditLineItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillCreditLineItemListPage> =
            list(params.toBuilder().billId(billId).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            billId: String,
            params: BillCreditLineItemListParams = BillCreditLineItemListParams.none(),
        ): HttpResponseFor<BillCreditLineItemListPage> = list(billId, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BillCreditLineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillCreditLineItemListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BillCreditLineItemListParams
        ): HttpResponseFor<BillCreditLineItemListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            billId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillCreditLineItemListPage> =
            list(billId, BillCreditLineItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/bills/{billId}/creditlineitems/{id}`, but is otherwise the same as
         * [CreditLineItemService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: BillCreditLineItemDeleteParams,
        ): HttpResponseFor<CreditLineItemResponse> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: BillCreditLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditLineItemResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: BillCreditLineItemDeleteParams
        ): HttpResponseFor<CreditLineItemResponse> = delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: BillCreditLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditLineItemResponse>
    }
}
