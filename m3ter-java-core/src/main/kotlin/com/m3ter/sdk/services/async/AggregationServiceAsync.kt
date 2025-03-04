// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.AggregationCreateParams
import com.m3ter.sdk.models.AggregationDeleteParams
import com.m3ter.sdk.models.AggregationListPageAsync
import com.m3ter.sdk.models.AggregationListParams
import com.m3ter.sdk.models.AggregationResponse
import com.m3ter.sdk.models.AggregationRetrieveParams
import com.m3ter.sdk.models.AggregationUpdateParams
import java.util.concurrent.CompletableFuture

interface AggregationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new Aggregation. */
    @JvmOverloads
    fun create(
        params: AggregationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregationResponse>

    /** Retrieve the Aggregation with the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: AggregationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregationResponse>

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
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregationResponse>

    /** Retrieve a list of Aggregations that can be filtered by Product, Aggregation ID, or Code. */
    @JvmOverloads
    fun list(
        params: AggregationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregationListPageAsync>

    /** Delete the Aggregation with the given UUID. */
    @JvmOverloads
    fun delete(
        params: AggregationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregationResponse>

    /**
     * A view of [AggregationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/aggregations`, but is
         * otherwise the same as [AggregationServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: AggregationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/aggregations/{id}`, but is
         * otherwise the same as [AggregationServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: AggregationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/aggregations/{id}`, but is
         * otherwise the same as [AggregationServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: AggregationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/aggregations`, but is
         * otherwise the same as [AggregationServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: AggregationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/aggregations/{id}`, but is
         * otherwise the same as [AggregationServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: AggregationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationResponse>>
    }
}
