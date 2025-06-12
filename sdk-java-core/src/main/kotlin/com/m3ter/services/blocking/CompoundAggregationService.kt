// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.AggregationResponse
import com.m3ter.models.CompoundAggregationCreateParams
import com.m3ter.models.CompoundAggregationDeleteParams
import com.m3ter.models.CompoundAggregationListPage
import com.m3ter.models.CompoundAggregationListParams
import com.m3ter.models.CompoundAggregationResponse
import com.m3ter.models.CompoundAggregationRetrieveParams
import com.m3ter.models.CompoundAggregationUpdateParams
import java.util.function.Consumer

interface CompoundAggregationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CompoundAggregationService

    /**
     * Create a new CompoundAggregation.
     *
     * This endpoint allows you to create a new CompoundAggregation for a specific Organization. The
     * request body must include all the necessary details such as the Calculation formula.
     */
    fun create(params: CompoundAggregationCreateParams): AggregationResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CompoundAggregationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AggregationResponse

    /**
     * Retrieve a CompoundAggregation using the given UUID.
     *
     * This endpoint returns a specific CompoundAggregation associated with an Organization. It
     * provides detailed information about the CompoundAggregation.
     */
    fun retrieve(id: String): CompoundAggregationResponse =
        retrieve(id, CompoundAggregationRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: CompoundAggregationRetrieveParams = CompoundAggregationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompoundAggregationResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: CompoundAggregationRetrieveParams = CompoundAggregationRetrieveParams.none(),
    ): CompoundAggregationResponse = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CompoundAggregationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompoundAggregationResponse

    /** @see [retrieve] */
    fun retrieve(params: CompoundAggregationRetrieveParams): CompoundAggregationResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompoundAggregationResponse =
        retrieve(id, CompoundAggregationRetrieveParams.none(), requestOptions)

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
    fun update(id: String, params: CompoundAggregationUpdateParams): AggregationResponse =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: CompoundAggregationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AggregationResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: CompoundAggregationUpdateParams): AggregationResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CompoundAggregationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AggregationResponse

    /**
     * Retrieve a list of all CompoundAggregations.
     *
     * This endpoint retrieves a list of CompoundAggregations associated with a specific
     * organization. CompoundAggregations enable you to define numerical measures based on simple
     * Aggregations of usage data. It supports pagination, and includes various query parameters to
     * filter the CompoundAggregations based on Product, CompoundAggregation IDs or short codes.
     */
    fun list(): CompoundAggregationListPage = list(CompoundAggregationListParams.none())

    /** @see [list] */
    fun list(
        params: CompoundAggregationListParams = CompoundAggregationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompoundAggregationListPage

    /** @see [list] */
    fun list(
        params: CompoundAggregationListParams = CompoundAggregationListParams.none()
    ): CompoundAggregationListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompoundAggregationListPage =
        list(CompoundAggregationListParams.none(), requestOptions)

    /**
     * Delete a CompoundAggregation with the given UUID.
     *
     * This endpoint enables deletion of a specific CompoundAggregation associated with a specific
     * Organization. Useful when you need to remove an existing CompoundAggregation that is no
     * longer required, such as when changing pricing or planning models.
     */
    fun delete(id: String): CompoundAggregationResponse =
        delete(id, CompoundAggregationDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: CompoundAggregationDeleteParams = CompoundAggregationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompoundAggregationResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: CompoundAggregationDeleteParams = CompoundAggregationDeleteParams.none(),
    ): CompoundAggregationResponse = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CompoundAggregationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompoundAggregationResponse

    /** @see [delete] */
    fun delete(params: CompoundAggregationDeleteParams): CompoundAggregationResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompoundAggregationResponse =
        delete(id, CompoundAggregationDeleteParams.none(), requestOptions)

    /**
     * A view of [CompoundAggregationService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CompoundAggregationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/compoundaggregations`, but
         * is otherwise the same as [CompoundAggregationService.create].
         */
        @MustBeClosed
        fun create(params: CompoundAggregationCreateParams): HttpResponseFor<AggregationResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CompoundAggregationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AggregationResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/compoundaggregations/{id}`,
         * but is otherwise the same as [CompoundAggregationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CompoundAggregationResponse> =
            retrieve(id, CompoundAggregationRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CompoundAggregationRetrieveParams = CompoundAggregationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompoundAggregationResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CompoundAggregationRetrieveParams = CompoundAggregationRetrieveParams.none(),
        ): HttpResponseFor<CompoundAggregationResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CompoundAggregationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompoundAggregationResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CompoundAggregationRetrieveParams
        ): HttpResponseFor<CompoundAggregationResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompoundAggregationResponse> =
            retrieve(id, CompoundAggregationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/compoundaggregations/{id}`,
         * but is otherwise the same as [CompoundAggregationService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: CompoundAggregationUpdateParams,
        ): HttpResponseFor<AggregationResponse> = update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: CompoundAggregationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AggregationResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(params: CompoundAggregationUpdateParams): HttpResponseFor<AggregationResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CompoundAggregationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AggregationResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/compoundaggregations`, but is
         * otherwise the same as [CompoundAggregationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CompoundAggregationListPage> =
            list(CompoundAggregationListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CompoundAggregationListParams = CompoundAggregationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompoundAggregationListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CompoundAggregationListParams = CompoundAggregationListParams.none()
        ): HttpResponseFor<CompoundAggregationListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CompoundAggregationListPage> =
            list(CompoundAggregationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/compoundaggregations/{id}`, but is otherwise the same as
         * [CompoundAggregationService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<CompoundAggregationResponse> =
            delete(id, CompoundAggregationDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: CompoundAggregationDeleteParams = CompoundAggregationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompoundAggregationResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: CompoundAggregationDeleteParams = CompoundAggregationDeleteParams.none(),
        ): HttpResponseFor<CompoundAggregationResponse> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CompoundAggregationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CompoundAggregationResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CompoundAggregationDeleteParams
        ): HttpResponseFor<CompoundAggregationResponse> = delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CompoundAggregationResponse> =
            delete(id, CompoundAggregationDeleteParams.none(), requestOptions)
    }
}
