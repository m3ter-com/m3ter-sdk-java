// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking.bills

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.BillCreditLineItemCreateParams
import com.m3ter.sdk.models.BillCreditLineItemDeleteParams
import com.m3ter.sdk.models.BillCreditLineItemListPage
import com.m3ter.sdk.models.BillCreditLineItemListParams
import com.m3ter.sdk.models.BillCreditLineItemRetrieveParams
import com.m3ter.sdk.models.BillCreditLineItemUpdateParams
import com.m3ter.sdk.models.CreditLineItemResponse

interface CreditLineItemService {

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
    @JvmOverloads
    fun create(
        params: BillCreditLineItemCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditLineItemResponse

    /** Retrieve the Credit line item with the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: BillCreditLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditLineItemResponse

    /** Update the Credit line item with the given UUID. */
    @JvmOverloads
    fun update(
        params: BillCreditLineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditLineItemResponse

    /** List the Credit line items for the given Bill. */
    @JvmOverloads
    fun list(
        params: BillCreditLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillCreditLineItemListPage

    /** Delete the Credit line item with the given UUID. */
    @JvmOverloads
    fun delete(
        params: BillCreditLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditLineItemResponse

    /**
     * A view of [CreditLineItemService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/bills/{billId}/creditlineitems`, but is otherwise the same as
         * [CreditLineItemService.create].
         */
        @JvmOverloads
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
        @JvmOverloads
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
        @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: BillCreditLineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillCreditLineItemListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/bills/{billId}/creditlineitems/{id}`, but is otherwise the same as
         * [CreditLineItemService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: BillCreditLineItemDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditLineItemResponse>
    }
}
