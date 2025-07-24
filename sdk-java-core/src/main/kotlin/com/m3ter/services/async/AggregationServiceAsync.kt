// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.ClientOptions
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
import java.util.function.Consumer

interface AggregationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AggregationServiceAsync

    /** Create a new Aggregation. */
    fun create(params: AggregationCreateParams): CompletableFuture<AggregationResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AggregationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregationResponse>

    /** Retrieve the Aggregation with the given UUID. */
    fun retrieve(id: String): CompletableFuture<AggregationResponse> =
        retrieve(id, AggregationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AggregationRetrieveParams = AggregationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregationResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: AggregationRetrieveParams = AggregationRetrieveParams.none(),
    ): CompletableFuture<AggregationResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AggregationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregationResponse>

    /** @see retrieve */
    fun retrieve(params: AggregationRetrieveParams): CompletableFuture<AggregationResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AggregationResponse> =
        retrieve(id, AggregationRetrieveParams.none(), requestOptions)

    /**
     * Update the Aggregation with the given UUID.
     *
     * **Note:** If you have created Custom Fields for an Aggregation, when you use this endpoint to
     * update the Aggregation use the `customFields` parameter to preserve those Custom Fields. If
     * you omit them from the update request, they will be lost.
     */
    fun update(
        id: String,
        params: AggregationUpdateParams,
    ): CompletableFuture<AggregationResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: AggregationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregationResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: AggregationUpdateParams): CompletableFuture<AggregationResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AggregationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregationResponse>

    /** Retrieve a list of Aggregations that can be filtered by Product, Aggregation ID, or Code. */
    fun list(): CompletableFuture<AggregationListPageAsync> = list(AggregationListParams.none())

    /** @see list */
    fun list(
        params: AggregationListParams = AggregationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregationListPageAsync>

    /** @see list */
    fun list(
        params: AggregationListParams = AggregationListParams.none()
    ): CompletableFuture<AggregationListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AggregationListPageAsync> =
        list(AggregationListParams.none(), requestOptions)

    /** Delete the Aggregation with the given UUID. */
    fun delete(id: String): CompletableFuture<AggregationResponse> =
        delete(id, AggregationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: AggregationDeleteParams = AggregationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregationResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: AggregationDeleteParams = AggregationDeleteParams.none(),
    ): CompletableFuture<AggregationResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AggregationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregationResponse>

    /** @see delete */
    fun delete(params: AggregationDeleteParams): CompletableFuture<AggregationResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<AggregationResponse> =
        delete(id, AggregationDeleteParams.none(), requestOptions)

    /**
     * A view of [AggregationServiceAsync] that provides access to raw HTTP responses for each
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
        ): AggregationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/aggregations`, but is
         * otherwise the same as [AggregationServiceAsync.create].
         */
        fun create(
            params: AggregationCreateParams
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AggregationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/aggregations/{id}`, but is
         * otherwise the same as [AggregationServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            retrieve(id, AggregationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AggregationRetrieveParams = AggregationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: AggregationRetrieveParams = AggregationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AggregationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AggregationRetrieveParams
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            retrieve(id, AggregationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/aggregations/{id}`, but is
         * otherwise the same as [AggregationServiceAsync.update].
         */
        fun update(
            id: String,
            params: AggregationUpdateParams,
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: AggregationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: AggregationUpdateParams
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AggregationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/aggregations`, but is
         * otherwise the same as [AggregationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AggregationListPageAsync>> =
            list(AggregationListParams.none())

        /** @see list */
        fun list(
            params: AggregationListParams = AggregationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationListPageAsync>>

        /** @see list */
        fun list(
            params: AggregationListParams = AggregationListParams.none()
        ): CompletableFuture<HttpResponseFor<AggregationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AggregationListPageAsync>> =
            list(AggregationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/aggregations/{id}`, but is
         * otherwise the same as [AggregationServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            delete(id, AggregationDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: AggregationDeleteParams = AggregationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: AggregationDeleteParams = AggregationDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AggregationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregationResponse>>

        /** @see delete */
        fun delete(
            params: AggregationDeleteParams
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AggregationResponse>> =
            delete(id, AggregationDeleteParams.none(), requestOptions)
    }
}
