// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async.bills

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.BillCreditLineItemCreateParams
import com.m3ter.sdk.models.BillCreditLineItemDeleteParams
import com.m3ter.sdk.models.BillCreditLineItemListPageAsync
import com.m3ter.sdk.models.BillCreditLineItemListParams
import com.m3ter.sdk.models.BillCreditLineItemRetrieveParams
import com.m3ter.sdk.models.BillCreditLineItemUpdateParams
import com.m3ter.sdk.models.CreditLineItem
import java.util.concurrent.CompletableFuture

interface CreditLineItemServiceAsync {

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
    ): CompletableFuture<CreditLineItem>

    /** Retrieve the Credit line item with the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: BillCreditLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditLineItem>

    /** Update the Credit line item with the given UUID. */
    @JvmOverloads
    fun update(
        params: BillCreditLineItemUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditLineItem>

    /** List the Credit line items for the given Bill. */
    @JvmOverloads
    fun list(
        params: BillCreditLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillCreditLineItemListPageAsync>

    /** Delete the Credit line item with the given UUID. */
    @JvmOverloads
    fun delete(
        params: BillCreditLineItemDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditLineItem>
}
