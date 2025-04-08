// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.AggregationCreateParams
import com.m3ter.models.AggregationDeleteParams
import com.m3ter.models.AggregationListPageAsync
import com.m3ter.models.AggregationListParams
import com.m3ter.models.AggregationResponse
import com.m3ter.models.AggregationRetrieveParams
import com.m3ter.models.AggregationUpdateParams
import java.util.concurrent.CompletableFuture

interface AggregationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new Aggregation. */
    fun create(params: AggregationCreateParams): CompletableFuture<AggregationResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AggregationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregationResponse>

    /** Retrieve the Aggregation with the given UUID. */
    fun retrieve(params: AggregationRetrieveParams): CompletableFuture<AggregationResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
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
    fun update(params: AggregationUpdateParams): CompletableFuture<AggregationResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: AggregationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregationResponse>

    /** Retrieve a list of Aggregations that can be filtered by Product, Aggregation ID, or Code. */
    fun list(): CompletableFuture<AggregationListPageAsync> = list(AggregationListParams.none())

    /** @see [list] */
    fun list(
        params: AggregationListParams = AggregationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregationListPageAsync>

    /** @see [list] */
    fun list(
        params: AggregationListParams = AggregationListParams.none()
    ): CompletableFuture<AggregationListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<AggregationListPageAsync> =
        list(AggregationListParams.none(), requestOptions)

    /** Delete the Aggregation with the given UUID. */
    fun delete(params: AggregationDeleteParams): CompletableFuture<AggregationResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
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
        @MustBeClosed
        fun create(
            params: AggregationCreateParams
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AggregationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/aggregations/{id}`, but is
         * otherwise the same as [AggregationServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: AggregationRetrieveParams
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AggregationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/aggregations/{id}`, but is
         * otherwise the same as [AggregationServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: AggregationUpdateParams
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: AggregationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/aggregations`, but is
         * otherwise the same as [AggregationServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<AggregationListPageAsync>> =
            list(AggregationListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AggregationListParams = AggregationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AggregationListParams = AggregationListParams.none()
        ): CompletableFuture<HttpResponseFor<AggregationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AggregationListPageAsync>> =
            list(AggregationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/aggregations/{id}`, but is
         * otherwise the same as [AggregationServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: AggregationDeleteParams
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: AggregationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationResponse>>
    }
}
