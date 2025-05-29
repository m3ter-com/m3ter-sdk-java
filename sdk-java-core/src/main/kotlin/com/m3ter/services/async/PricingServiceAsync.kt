// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.PricingCreateParams
import com.m3ter.models.PricingDeleteParams
import com.m3ter.models.PricingListPageAsync
import com.m3ter.models.PricingListParams
import com.m3ter.models.PricingResponse
import com.m3ter.models.PricingRetrieveParams
import com.m3ter.models.PricingUpdateParams
import java.util.concurrent.CompletableFuture

interface PricingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new Pricing.
     *
     * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call
     * to be valid. If you omit both, then you will receive a validation error.
     */
    fun create(params: PricingCreateParams): CompletableFuture<PricingResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PricingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PricingResponse>

    /** Retrieve the Pricing with the given UUID. */
    fun retrieve(id: String): CompletableFuture<PricingResponse> =
        retrieve(id, PricingRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PricingRetrieveParams = PricingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PricingResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PricingRetrieveParams = PricingRetrieveParams.none(),
    ): CompletableFuture<PricingResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PricingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PricingResponse>

    /** @see [retrieve] */
    fun retrieve(params: PricingRetrieveParams): CompletableFuture<PricingResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<PricingResponse> =
        retrieve(id, PricingRetrieveParams.none(), requestOptions)

    /**
     * Update Pricing for the given UUID.
     *
     * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call
     * to be valid. If you omit both, then you will receive a validation error.
     */
    fun update(id: String, params: PricingUpdateParams): CompletableFuture<PricingResponse> =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: PricingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PricingResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: PricingUpdateParams): CompletableFuture<PricingResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PricingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PricingResponse>

    /** Retrieve a list of Pricings filtered by date, Plan ID, PlanTemplate ID, or Pricing ID. */
    fun list(): CompletableFuture<PricingListPageAsync> = list(PricingListParams.none())

    /** @see [list] */
    fun list(
        params: PricingListParams = PricingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PricingListPageAsync>

    /** @see [list] */
    fun list(
        params: PricingListParams = PricingListParams.none()
    ): CompletableFuture<PricingListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<PricingListPageAsync> =
        list(PricingListParams.none(), requestOptions)

    /** Delete the Pricing with the given UUID. */
    fun delete(id: String): CompletableFuture<PricingResponse> =
        delete(id, PricingDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: PricingDeleteParams = PricingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PricingResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: PricingDeleteParams = PricingDeleteParams.none(),
    ): CompletableFuture<PricingResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: PricingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PricingResponse>

    /** @see [delete] */
    fun delete(params: PricingDeleteParams): CompletableFuture<PricingResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<PricingResponse> =
        delete(id, PricingDeleteParams.none(), requestOptions)

    /**
     * A view of [PricingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/pricings`, but is otherwise
         * the same as [PricingServiceAsync.create].
         */
        fun create(
            params: PricingCreateParams
        ): CompletableFuture<HttpResponseFor<PricingResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: PricingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PricingResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/pricings/{id}`, but is
         * otherwise the same as [PricingServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<PricingResponse>> =
            retrieve(id, PricingRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: PricingRetrieveParams = PricingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PricingResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: PricingRetrieveParams = PricingRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PricingResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: PricingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PricingResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: PricingRetrieveParams
        ): CompletableFuture<HttpResponseFor<PricingResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PricingResponse>> =
            retrieve(id, PricingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/pricings/{id}`, but is
         * otherwise the same as [PricingServiceAsync.update].
         */
        fun update(
            id: String,
            params: PricingUpdateParams,
        ): CompletableFuture<HttpResponseFor<PricingResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            params: PricingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PricingResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            params: PricingUpdateParams
        ): CompletableFuture<HttpResponseFor<PricingResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: PricingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PricingResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/pricings`, but is otherwise
         * the same as [PricingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PricingListPageAsync>> =
            list(PricingListParams.none())

        /** @see [list] */
        fun list(
            params: PricingListParams = PricingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PricingListPageAsync>>

        /** @see [list] */
        fun list(
            params: PricingListParams = PricingListParams.none()
        ): CompletableFuture<HttpResponseFor<PricingListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PricingListPageAsync>> =
            list(PricingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/pricings/{id}`, but is
         * otherwise the same as [PricingServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<PricingResponse>> =
            delete(id, PricingDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: PricingDeleteParams = PricingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PricingResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: PricingDeleteParams = PricingDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<PricingResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: PricingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PricingResponse>>

        /** @see [delete] */
        fun delete(
            params: PricingDeleteParams
        ): CompletableFuture<HttpResponseFor<PricingResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PricingResponse>> =
            delete(id, PricingDeleteParams.none(), requestOptions)
    }
}
