// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.bills

import com.m3ter.core.ClientOptions
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
import java.util.function.Consumer

interface CreditLineItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditLineItemServiceAsync

    /**
     * Create a new Credit line item for the given Bill.
     *
     * When creating Credit line items for Bills, use the Credit Reasons created for your
     * Organization. See [CreditReason](https://www.m3ter.com/docs/api#tag/CreditReason).
     */
    fun create(
        billId: String,
        params: BillCreditLineItemCreateParams,
    ): CompletableFuture<CreditLineItemResponse> = create(billId, params, RequestOptions.none())

    /** @see create */
    fun create(
        billId: String,
        params: BillCreditLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditLineItemResponse> =
        create(params.toBuilder().billId(billId).build(), requestOptions)

    /** @see create */
    fun create(params: BillCreditLineItemCreateParams): CompletableFuture<CreditLineItemResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BillCreditLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditLineItemResponse>

    /** Retrieve the Credit line item with the given UUID. */
    fun retrieve(
        id: String,
        params: BillCreditLineItemRetrieveParams,
    ): CompletableFuture<CreditLineItemResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BillCreditLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditLineItemResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: BillCreditLineItemRetrieveParams
    ): CompletableFuture<CreditLineItemResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BillCreditLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditLineItemResponse>

    /** Update the Credit line item with the given UUID. */
    fun update(
        id: String,
        params: BillCreditLineItemUpdateParams,
    ): CompletableFuture<CreditLineItemResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: BillCreditLineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditLineItemResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: BillCreditLineItemUpdateParams): CompletableFuture<CreditLineItemResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BillCreditLineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditLineItemResponse>

    /** List the Credit line items for the given Bill. */
    fun list(billId: String): CompletableFuture<BillCreditLineItemListPageAsync> =
        list(billId, BillCreditLineItemListParams.none())

    /** @see list */
    fun list(
        billId: String,
        params: BillCreditLineItemListParams = BillCreditLineItemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillCreditLineItemListPageAsync> =
        list(params.toBuilder().billId(billId).build(), requestOptions)

    /** @see list */
    fun list(
        billId: String,
        params: BillCreditLineItemListParams = BillCreditLineItemListParams.none(),
    ): CompletableFuture<BillCreditLineItemListPageAsync> =
        list(billId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: BillCreditLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillCreditLineItemListPageAsync>

    /** @see list */
    fun list(
        params: BillCreditLineItemListParams
    ): CompletableFuture<BillCreditLineItemListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        billId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillCreditLineItemListPageAsync> =
        list(billId, BillCreditLineItemListParams.none(), requestOptions)

    /** Delete the Credit line item with the given UUID. */
    fun delete(
        id: String,
        params: BillCreditLineItemDeleteParams,
    ): CompletableFuture<CreditLineItemResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: BillCreditLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditLineItemResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: BillCreditLineItemDeleteParams): CompletableFuture<CreditLineItemResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditLineItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/bills/{billId}/creditlineitems`, but is otherwise the same as
         * [CreditLineItemServiceAsync.create].
         */
        fun create(
            billId: String,
            params: BillCreditLineItemCreateParams,
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>> =
            create(billId, params, RequestOptions.none())

        /** @see create */
        fun create(
            billId: String,
            params: BillCreditLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>> =
            create(params.toBuilder().billId(billId).build(), requestOptions)

        /** @see create */
        fun create(
            params: BillCreditLineItemCreateParams
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BillCreditLineItemCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/bills/{billId}/creditlineitems/{id}`, but is otherwise the same as
         * [CreditLineItemServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: BillCreditLineItemRetrieveParams,
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BillCreditLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: BillCreditLineItemRetrieveParams
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BillCreditLineItemRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/bills/{billId}/creditlineitems/{id}`, but is otherwise the same as
         * [CreditLineItemServiceAsync.update].
         */
        fun update(
            id: String,
            params: BillCreditLineItemUpdateParams,
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: BillCreditLineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: BillCreditLineItemUpdateParams
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BillCreditLineItemUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/bills/{billId}/creditlineitems`, but is otherwise the same as
         * [CreditLineItemServiceAsync.list].
         */
        fun list(
            billId: String
        ): CompletableFuture<HttpResponseFor<BillCreditLineItemListPageAsync>> =
            list(billId, BillCreditLineItemListParams.none())

        /** @see list */
        fun list(
            billId: String,
            params: BillCreditLineItemListParams = BillCreditLineItemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillCreditLineItemListPageAsync>> =
            list(params.toBuilder().billId(billId).build(), requestOptions)

        /** @see list */
        fun list(
            billId: String,
            params: BillCreditLineItemListParams = BillCreditLineItemListParams.none(),
        ): CompletableFuture<HttpResponseFor<BillCreditLineItemListPageAsync>> =
            list(billId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: BillCreditLineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillCreditLineItemListPageAsync>>

        /** @see list */
        fun list(
            params: BillCreditLineItemListParams
        ): CompletableFuture<HttpResponseFor<BillCreditLineItemListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            billId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillCreditLineItemListPageAsync>> =
            list(billId, BillCreditLineItemListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/bills/{billId}/creditlineitems/{id}`, but is otherwise the same as
         * [CreditLineItemServiceAsync.delete].
         */
        fun delete(
            id: String,
            params: BillCreditLineItemDeleteParams,
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            params: BillCreditLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: BillCreditLineItemDeleteParams
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BillCreditLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditLineItemResponse>>
    }
}
