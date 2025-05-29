// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.PlanCreateParams
import com.m3ter.models.PlanDeleteParams
import com.m3ter.models.PlanListPageAsync
import com.m3ter.models.PlanListParams
import com.m3ter.models.PlanResponse
import com.m3ter.models.PlanRetrieveParams
import com.m3ter.models.PlanUpdateParams
import java.util.concurrent.CompletableFuture

interface PlanServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new Plan. */
    fun create(params: PlanCreateParams): CompletableFuture<PlanResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanResponse>

    /** Retrieve the Plan with the given UUID. */
    fun retrieve(id: String): CompletableFuture<PlanResponse> =
        retrieve(id, PlanRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PlanRetrieveParams = PlanRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanResponse> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PlanRetrieveParams = PlanRetrieveParams.none(),
    ): CompletableFuture<PlanResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanResponse>

    /** @see [retrieve] */
    fun retrieve(params: PlanRetrieveParams): CompletableFuture<PlanResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<PlanResponse> =
        retrieve(id, PlanRetrieveParams.none(), requestOptions)

    /**
     * Update the Plan with the given UUID.
     *
     * **Note:** If you have created Custom Fields for a Plan, when you use this endpoint to update
     * the Plan use the `customFields` parameter to preserve those Custom Fields. If you omit them
     * from the update request, they will be lost.
     */
    fun update(id: String, params: PlanUpdateParams): CompletableFuture<PlanResponse> =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: PlanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanResponse> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: PlanUpdateParams): CompletableFuture<PlanResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PlanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanResponse>

    /** Retrieve a list of Plans that can be filtered by Product, Account, or Plan ID. */
    fun list(): CompletableFuture<PlanListPageAsync> = list(PlanListParams.none())

    /** @see [list] */
    fun list(
        params: PlanListParams = PlanListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanListPageAsync>

    /** @see [list] */
    fun list(params: PlanListParams = PlanListParams.none()): CompletableFuture<PlanListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<PlanListPageAsync> =
        list(PlanListParams.none(), requestOptions)

    /** Delete the Plan with the given UUID. */
    fun delete(id: String): CompletableFuture<PlanResponse> = delete(id, PlanDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: PlanDeleteParams = PlanDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanResponse> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: PlanDeleteParams = PlanDeleteParams.none(),
    ): CompletableFuture<PlanResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: PlanDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanResponse>

    /** @see [delete] */
    fun delete(params: PlanDeleteParams): CompletableFuture<PlanResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<PlanResponse> =
        delete(id, PlanDeleteParams.none(), requestOptions)

    /** A view of [PlanServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/plans`, but is otherwise the
         * same as [PlanServiceAsync.create].
         */
        fun create(params: PlanCreateParams): CompletableFuture<HttpResponseFor<PlanResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: PlanCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plans/{id}`, but is otherwise
         * the same as [PlanServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<PlanResponse>> =
            retrieve(id, PlanRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: PlanRetrieveParams = PlanRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: PlanRetrieveParams = PlanRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PlanResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: PlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanResponse>>

        /** @see [retrieve] */
        fun retrieve(params: PlanRetrieveParams): CompletableFuture<HttpResponseFor<PlanResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanResponse>> =
            retrieve(id, PlanRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/plans/{id}`, but is otherwise
         * the same as [PlanServiceAsync.update].
         */
        fun update(
            id: String,
            params: PlanUpdateParams,
        ): CompletableFuture<HttpResponseFor<PlanResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            params: PlanUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(params: PlanUpdateParams): CompletableFuture<HttpResponseFor<PlanResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: PlanUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plans`, but is otherwise the
         * same as [PlanServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PlanListPageAsync>> =
            list(PlanListParams.none())

        /** @see [list] */
        fun list(
            params: PlanListParams = PlanListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanListPageAsync>>

        /** @see [list] */
        fun list(
            params: PlanListParams = PlanListParams.none()
        ): CompletableFuture<HttpResponseFor<PlanListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PlanListPageAsync>> =
            list(PlanListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/plans/{id}`, but is
         * otherwise the same as [PlanServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<PlanResponse>> =
            delete(id, PlanDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: PlanDeleteParams = PlanDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: PlanDeleteParams = PlanDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<PlanResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: PlanDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanResponse>>

        /** @see [delete] */
        fun delete(params: PlanDeleteParams): CompletableFuture<HttpResponseFor<PlanResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanResponse>> =
            delete(id, PlanDeleteParams.none(), requestOptions)
    }
}
