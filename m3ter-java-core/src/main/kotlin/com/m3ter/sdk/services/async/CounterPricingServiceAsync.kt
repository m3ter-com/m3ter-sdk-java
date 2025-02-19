// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.CounterPricing
import com.m3ter.sdk.models.CounterPricingCreateParams
import com.m3ter.sdk.models.CounterPricingDeleteParams
import com.m3ter.sdk.models.CounterPricingListPageAsync
import com.m3ter.sdk.models.CounterPricingListParams
import com.m3ter.sdk.models.CounterPricingRetrieveParams
import com.m3ter.sdk.models.CounterPricingUpdateParams
import java.util.concurrent.CompletableFuture

interface CounterPricingServiceAsync {

    /**
     * Create a new CounterPricing.
     *
     * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call
     * to be valid. If you omit both, then you will receive a validation error.
     */
    @JvmOverloads
    fun create(
        params: CounterPricingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterPricing>

    /** Retrieve a CounterPricing for the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: CounterPricingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterPricing>

    /**
     * Update CounterPricing for the given UUID.
     *
     * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call
     * to be valid. If you omit both, then you will receive a validation error.
     */
    @JvmOverloads
    fun update(
        params: CounterPricingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterPricing>

    /**
     * Retrieve a list of CounterPricing entities filtered by date, Plan ID, Plan Template ID, or
     * CounterPricing ID.
     */
    @JvmOverloads
    fun list(
        params: CounterPricingListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterPricingListPageAsync>

    /** Delete a CounterPricing for the given UUID. */
    @JvmOverloads
    fun delete(
        params: CounterPricingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterPricing>
}
