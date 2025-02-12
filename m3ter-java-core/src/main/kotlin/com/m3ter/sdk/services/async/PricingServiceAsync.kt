// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.Pricing
import com.m3ter.sdk.models.PricingCreateParams
import com.m3ter.sdk.models.PricingDeleteParams
import com.m3ter.sdk.models.PricingListPageAsync
import com.m3ter.sdk.models.PricingListParams
import com.m3ter.sdk.models.PricingRetrieveParams
import com.m3ter.sdk.models.PricingUpdateParams
import java.util.concurrent.CompletableFuture

interface PricingServiceAsync {

    /**
     * Create a new Pricing.
     *
     * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call
     * to be valid. If you omit both, then you will receive a validation error.
     */
    @JvmOverloads
    fun create(
        params: PricingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Pricing>

    /** Retrieve the Pricing with the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: PricingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Pricing>

    /**
     * Update Pricing for the given UUID.
     *
     * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call
     * to be valid. If you omit both, then you will receive a validation error.
     */
    @JvmOverloads
    fun update(
        params: PricingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Pricing>

    /** Retrieve a list of Pricings filtered by date, Plan ID, PlanTemplate ID, or Pricing ID. */
    @JvmOverloads
    fun list(
        params: PricingListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PricingListPageAsync>

    /** Delete the Pricing with the given UUID. */
    @JvmOverloads
    fun delete(
        params: PricingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Pricing>
}
