// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.CounterPricingCreateParams
import com.m3ter.models.CounterPricingDeleteParams
import com.m3ter.models.CounterPricingListPageAsync
import com.m3ter.models.CounterPricingListParams
import com.m3ter.models.CounterPricingResponse
import com.m3ter.models.CounterPricingRetrieveParams
import com.m3ter.models.CounterPricingUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CounterPricingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CounterPricingServiceAsync

    /**
     * Create a new CounterPricing.
     *
     * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call
     * to be valid. If you omit both, then you will receive a validation error.
     */
    fun create(params: CounterPricingCreateParams): CompletableFuture<CounterPricingResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CounterPricingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterPricingResponse>

    /** Retrieve a CounterPricing for the given UUID. */
    fun retrieve(id: String): CompletableFuture<CounterPricingResponse> =
        retrieve(id, CounterPricingRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CounterPricingRetrieveParams = CounterPricingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterPricingResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CounterPricingRetrieveParams = CounterPricingRetrieveParams.none(),
    ): CompletableFuture<CounterPricingResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CounterPricingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterPricingResponse>

    /** @see retrieve */
    fun retrieve(params: CounterPricingRetrieveParams): CompletableFuture<CounterPricingResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CounterPricingResponse> =
        retrieve(id, CounterPricingRetrieveParams.none(), requestOptions)

    /**
     * Update CounterPricing for the given UUID.
     *
     * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call
     * to be valid. If you omit both, then you will receive a validation error.
     */
    fun update(
        id: String,
        params: CounterPricingUpdateParams,
    ): CompletableFuture<CounterPricingResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: CounterPricingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterPricingResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: CounterPricingUpdateParams): CompletableFuture<CounterPricingResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CounterPricingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterPricingResponse>

    /**
     * Retrieve a list of CounterPricing entities filtered by date, Plan ID, Plan Template ID, or
     * CounterPricing ID.
     */
    fun list(): CompletableFuture<CounterPricingListPageAsync> =
        list(CounterPricingListParams.none())

    /** @see list */
    fun list(
        params: CounterPricingListParams = CounterPricingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterPricingListPageAsync>

    /** @see list */
    fun list(
        params: CounterPricingListParams = CounterPricingListParams.none()
    ): CompletableFuture<CounterPricingListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CounterPricingListPageAsync> =
        list(CounterPricingListParams.none(), requestOptions)

    /** Delete a CounterPricing for the given UUID. */
    fun delete(id: String): CompletableFuture<CounterPricingResponse> =
        delete(id, CounterPricingDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: CounterPricingDeleteParams = CounterPricingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterPricingResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: CounterPricingDeleteParams = CounterPricingDeleteParams.none(),
    ): CompletableFuture<CounterPricingResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CounterPricingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterPricingResponse>

    /** @see delete */
    fun delete(params: CounterPricingDeleteParams): CompletableFuture<CounterPricingResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CounterPricingResponse> =
        delete(id, CounterPricingDeleteParams.none(), requestOptions)

    /**
     * A view of [CounterPricingServiceAsync] that provides access to raw HTTP responses for each
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
        ): CounterPricingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/counterpricings`, but is
         * otherwise the same as [CounterPricingServiceAsync.create].
         */
        fun create(
            params: CounterPricingCreateParams
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CounterPricingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counterpricings/{id}`, but is
         * otherwise the same as [CounterPricingServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CounterPricingResponse>> =
            retrieve(id, CounterPricingRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CounterPricingRetrieveParams = CounterPricingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CounterPricingRetrieveParams = CounterPricingRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CounterPricingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>>

        /** @see retrieve */
        fun retrieve(
            params: CounterPricingRetrieveParams
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>> =
            retrieve(id, CounterPricingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/counterpricings/{id}`, but is
         * otherwise the same as [CounterPricingServiceAsync.update].
         */
        fun update(
            id: String,
            params: CounterPricingUpdateParams,
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: CounterPricingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: CounterPricingUpdateParams
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CounterPricingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counterpricings`, but is
         * otherwise the same as [CounterPricingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CounterPricingListPageAsync>> =
            list(CounterPricingListParams.none())

        /** @see list */
        fun list(
            params: CounterPricingListParams = CounterPricingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterPricingListPageAsync>>

        /** @see list */
        fun list(
            params: CounterPricingListParams = CounterPricingListParams.none()
        ): CompletableFuture<HttpResponseFor<CounterPricingListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CounterPricingListPageAsync>> =
            list(CounterPricingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/counterpricings/{id}`, but
         * is otherwise the same as [CounterPricingServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<CounterPricingResponse>> =
            delete(id, CounterPricingDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: CounterPricingDeleteParams = CounterPricingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: CounterPricingDeleteParams = CounterPricingDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CounterPricingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>>

        /** @see delete */
        fun delete(
            params: CounterPricingDeleteParams
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CounterPricingResponse>> =
            delete(id, CounterPricingDeleteParams.none(), requestOptions)
    }
}
