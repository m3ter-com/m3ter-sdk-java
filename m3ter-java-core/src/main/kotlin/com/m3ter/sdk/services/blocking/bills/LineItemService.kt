// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking.bills

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.BillLineItemListPage
import com.m3ter.sdk.models.BillLineItemListParams
import com.m3ter.sdk.models.BillLineItemRetrieveParams
import com.m3ter.sdk.models.LineItem

interface LineItemService {

    /**
     * Retrieves a specific line item within a Bill.
     *
     * This endpoint retrieves the line item given by its unique identifier (UUID) from a specific
     * Bill.
     */
    @JvmOverloads
    fun retrieve(
        params: BillLineItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LineItem

    /**
     * Lists all the line items for a specific Bill.
     *
     * This endpoint retrieves a list of line items for the given Bill within the specified
     * Organization. The list can also be paginated for easier management. The line items returned
     * in the list include individual charges, discounts, or adjustments within a Bill.
     */
    @JvmOverloads
    fun list(
        params: BillLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillLineItemListPage
}
