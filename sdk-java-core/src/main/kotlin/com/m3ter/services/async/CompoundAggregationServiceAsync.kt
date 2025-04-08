// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.AggregationResponse
import com.m3ter.models.CompoundAggregationCreateParams
import com.m3ter.models.CompoundAggregationDeleteParams
import com.m3ter.models.CompoundAggregationListPageAsync
import com.m3ter.models.CompoundAggregationListParams
import com.m3ter.models.CompoundAggregationResponse
import com.m3ter.models.CompoundAggregationRetrieveParams
import com.m3ter.models.CompoundAggregationUpdateParams
import java.util.concurrent.CompletableFuture

interface CompoundAggregationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new CompoundAggregation.
     *
     * This endpoint allows you to create a new CompoundAggregation for a specific Organization. The
     * request body must include all the necessary details such as the Calculation formula.
     */
    fun create(params: CompoundAggregationCreateParams): CompletableFuture<AggregationResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
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
    fun retrieve(
        params: CompoundAggregationRetrieveParams
    ): CompletableFuture<CompoundAggregationResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CompoundAggregationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompoundAggregationResponse>

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
    fun update(params: CompoundAggregationUpdateParams): CompletableFuture<AggregationResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
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
    fun list(): CompletableFuture<CompoundAggregationListPageAsync> =
        list(CompoundAggregationListParams.none())

    /** @see [list] */
    fun list(
        params: CompoundAggregationListParams = CompoundAggregationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompoundAggregationListPageAsync>

    /** @see [list] */
    fun list(
        params: CompoundAggregationListParams = CompoundAggregationListParams.none()
    ): CompletableFuture<CompoundAggregationListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CompoundAggregationListPageAsync> =
        list(CompoundAggregationListParams.none(), requestOptions)

    /**
     * Delete a CompoundAggregation with the given UUID.
     *
     * This endpoint enables deletion of a specific CompoundAggregation associated with a specific
     * Organization. Useful when you need to remove an existing CompoundAggregation that is no
     * longer required, such as when changing pricing or planning models.
     */
    fun delete(
        params: CompoundAggregationDeleteParams
    ): CompletableFuture<CompoundAggregationResponse> = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CompoundAggregationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CompoundAggregationResponse>

    /**
     * A view of [CompoundAggregationServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/compoundaggregations`, but
         * is otherwise the same as [CompoundAggregationServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: CompoundAggregationCreateParams
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CompoundAggregationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/compoundaggregations/{id}`,
         * but is otherwise the same as [CompoundAggregationServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: CompoundAggregationRetrieveParams
        ): CompletableFuture<HttpResponseFor<CompoundAggregationResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CompoundAggregationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompoundAggregationResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/compoundaggregations/{id}`,
         * but is otherwise the same as [CompoundAggregationServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: CompoundAggregationUpdateParams
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CompoundAggregationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/compoundaggregations`, but is
         * otherwise the same as [CompoundAggregationServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<CompoundAggregationListPageAsync>> =
            list(CompoundAggregationListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CompoundAggregationListParams = CompoundAggregationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompoundAggregationListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CompoundAggregationListParams = CompoundAggregationListParams.none()
        ): CompletableFuture<HttpResponseFor<CompoundAggregationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CompoundAggregationListPageAsync>> =
            list(CompoundAggregationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/compoundaggregations/{id}`, but is otherwise the same as
         * [CompoundAggregationServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: CompoundAggregationDeleteParams
        ): CompletableFuture<HttpResponseFor<CompoundAggregationResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CompoundAggregationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CompoundAggregationResponse>>
    }
}
