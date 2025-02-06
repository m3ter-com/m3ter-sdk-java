// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.Aggregation
import com.m3ter.sdk.models.AggregationCreateParams
import com.m3ter.sdk.models.AggregationDeleteParams
import com.m3ter.sdk.models.AggregationListPage
import com.m3ter.sdk.models.AggregationListParams
import com.m3ter.sdk.models.AggregationRetrieveParams
import com.m3ter.sdk.models.AggregationUpdateParams

interface AggregationService {

    /** Create a new Aggregation. */
    @JvmOverloads
    fun create(
        params: AggregationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Aggregation

    /** Retrieve the Aggregation with the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: AggregationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Aggregation

    /**
     * Update the Aggregation with the given UUID.
     *
     * **Note:** If you have created Custom Fields for an Aggregation, when you use this endpoint to
     * update the Aggregation use the `customFields` parameter to preserve those Custom Fields. If
     * you omit them from the update request, they will be lost.
     */
    @JvmOverloads
    fun update(
        params: AggregationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Aggregation

    /** Retrieve a list of Aggregations that can be filtered by Product, Aggregation ID, or Code. */
    @JvmOverloads
    fun list(
        params: AggregationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AggregationListPage

    /** Delete the Aggregation with the given UUID. */
    @JvmOverloads
    fun delete(
        params: AggregationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Aggregation
}
