// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.AggregationCreateParams
import com.m3ter.models.AggregationDeleteParams
import com.m3ter.models.AggregationListPage
import com.m3ter.models.AggregationListParams
import com.m3ter.models.AggregationResponse
import com.m3ter.models.AggregationRetrieveParams
import com.m3ter.models.AggregationUpdateParams
import java.util.function.Consumer

interface AggregationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AggregationService

    /** Create a new Aggregation. */
    fun create(params: AggregationCreateParams): AggregationResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AggregationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AggregationResponse

    /** Retrieve the Aggregation with the given UUID. */
    fun retrieve(id: String): AggregationResponse = retrieve(id, AggregationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AggregationRetrieveParams = AggregationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AggregationResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AggregationRetrieveParams = AggregationRetrieveParams.none(),
    ): AggregationResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AggregationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AggregationResponse

    /** @see retrieve */
    fun retrieve(params: AggregationRetrieveParams): AggregationResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): AggregationResponse =
        retrieve(id, AggregationRetrieveParams.none(), requestOptions)

    /**
     * Update the Aggregation with the given UUID.
     *
     * **Note:** If you have created Custom Fields for an Aggregation, when you use this endpoint to
     * update the Aggregation use the `customFields` parameter to preserve those Custom Fields. If
     * you omit them from the update request, they will be lost.
     */
    fun update(id: String, params: AggregationUpdateParams): AggregationResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: AggregationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AggregationResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: AggregationUpdateParams): AggregationResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AggregationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AggregationResponse

    /** Retrieve a list of Aggregations that can be filtered by Product, Aggregation ID, or Code. */
    fun list(): AggregationListPage = list(AggregationListParams.none())

    /** @see list */
    fun list(
        params: AggregationListParams = AggregationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AggregationListPage

    /** @see list */
    fun list(params: AggregationListParams = AggregationListParams.none()): AggregationListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AggregationListPage =
        list(AggregationListParams.none(), requestOptions)

    /** Delete the Aggregation with the given UUID. */
    fun delete(id: String): AggregationResponse = delete(id, AggregationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AggregationDeleteParams = AggregationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AggregationResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AggregationDeleteParams = AggregationDeleteParams.none(),
    ): AggregationResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AggregationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AggregationResponse

    /** @see delete */
    fun delete(params: AggregationDeleteParams): AggregationResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): AggregationResponse =
        delete(id, AggregationDeleteParams.none(), requestOptions)

    /**
     * A view of [AggregationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AggregationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/aggregations`, but is
         * otherwise the same as [AggregationService.create].
         */
        @MustBeClosed
        fun create(params: AggregationCreateParams): HttpResponseFor<AggregationResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AggregationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AggregationResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/aggregations/{id}`, but is
         * otherwise the same as [AggregationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<AggregationResponse> =
            retrieve(id, AggregationRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AggregationRetrieveParams = AggregationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AggregationResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: AggregationRetrieveParams = AggregationRetrieveParams.none(),
        ): HttpResponseFor<AggregationResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AggregationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AggregationResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AggregationRetrieveParams): HttpResponseFor<AggregationResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AggregationResponse> =
            retrieve(id, AggregationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/aggregations/{id}`, but is
         * otherwise the same as [AggregationService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: AggregationUpdateParams,
        ): HttpResponseFor<AggregationResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: AggregationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AggregationResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: AggregationUpdateParams): HttpResponseFor<AggregationResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AggregationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AggregationResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/aggregations`, but is
         * otherwise the same as [AggregationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AggregationListPage> = list(AggregationListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AggregationListParams = AggregationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AggregationListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AggregationListParams = AggregationListParams.none()
        ): HttpResponseFor<AggregationListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AggregationListPage> =
            list(AggregationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/aggregations/{id}`, but is
         * otherwise the same as [AggregationService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<AggregationResponse> =
            delete(id, AggregationDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AggregationDeleteParams = AggregationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AggregationResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: AggregationDeleteParams = AggregationDeleteParams.none(),
        ): HttpResponseFor<AggregationResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AggregationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AggregationResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: AggregationDeleteParams): HttpResponseFor<AggregationResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AggregationResponse> =
            delete(id, AggregationDeleteParams.none(), requestOptions)
    }
}
