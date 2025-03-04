// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.AggregationResponse
import com.m3ter.sdk.models.CompoundAggregation
import com.m3ter.sdk.models.CompoundAggregationCreateParams
import com.m3ter.sdk.models.CompoundAggregationDeleteParams
import com.m3ter.sdk.models.CompoundAggregationListPageAsync
import com.m3ter.sdk.models.CompoundAggregationListParams
import com.m3ter.sdk.models.CompoundAggregationRetrieveParams
import com.m3ter.sdk.models.CompoundAggregationUpdateParams
import java.util.concurrent.CompletableFuture

interface CompoundAggregationServiceAsync {

    /**
     * Create a new CompoundAggregation.
     *
     * This endpoint allows you to create a new CompoundAggregation for a specific Organization. The
     * request body must include all the necessary details such as the Calculation formula.
     */
    @JvmOverloads
    fun create(
        params: CompoundAggregationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregationResponse>

    /**
     * Retrieve a CompoundAggregation using the given UUID.
     *
     * This endpoint returns a specific CompoundAggregation associated with an Organization. It
     * provides detailed information about the CompoundAggregation.
     */
    @JvmOverloads
    fun retrieve(
        params: CompoundAggregationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompoundAggregation>

    /**
     * Update the CompoundAggregation with the given UUID.
     *
     * This endpoint allows you to update the details of a specific CompoundAggregation associated
     * with an Organization. Use it to modify details of an existing CompoundAggregation such as the
     * Calculation formula.
     *
     * **Note:** If you have created Custom Fields for a Compound Aggregation, when you use this
     * endpoint to update the Compound Aggregation use the `customFields` parameter to preserve
     * those Custom Fields. If you omit them from the update request, they will be lost.
     */
    @JvmOverloads
    fun update(
        params: CompoundAggregationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregationResponse>

    /**
     * Retrieve a list of all CompoundAggregations.
     *
     * This endpoint retrieves a list of CompoundAggregations associated with a specific
     * organization. CompoundAggregations enable you to define numerical measures based on simple
     * Aggregations of usage data. It supports pagination, and includes various query parameters to
     * filter the CompoundAggregations based on Product, CompoundAggregation IDs or short codes.
     */
    @JvmOverloads
    fun list(
        params: CompoundAggregationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompoundAggregationListPageAsync>

    /**
     * Delete a CompoundAggregation with the given UUID.
     *
     * This endpoint enables deletion of a specific CompoundAggregation associated with a specific
     * Organization. Useful when you need to remove an existing CompoundAggregation that is no
     * longer required, such as when changing pricing or planning models.
     */
    @JvmOverloads
    fun delete(
        params: CompoundAggregationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompoundAggregation>
}
