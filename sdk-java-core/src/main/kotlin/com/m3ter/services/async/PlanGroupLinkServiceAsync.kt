// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.PlanGroupLinkCreateParams
import com.m3ter.models.PlanGroupLinkDeleteParams
import com.m3ter.models.PlanGroupLinkListPageAsync
import com.m3ter.models.PlanGroupLinkListParams
import com.m3ter.models.PlanGroupLinkResponse
import com.m3ter.models.PlanGroupLinkRetrieveParams
import com.m3ter.models.PlanGroupLinkUpdateParams
import java.util.concurrent.CompletableFuture

interface PlanGroupLinkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new PlanGroupLink. */
    fun create(params: PlanGroupLinkCreateParams): CompletableFuture<PlanGroupLinkResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PlanGroupLinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanGroupLinkResponse>

    /** Retrieve a PlanGroupLink for the given UUID. */
    fun retrieve(id: String): CompletableFuture<PlanGroupLinkResponse> =
        retrieve(id, PlanGroupLinkRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PlanGroupLinkRetrieveParams = PlanGroupLinkRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanGroupLinkResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PlanGroupLinkRetrieveParams = PlanGroupLinkRetrieveParams.none(),
    ): CompletableFuture<PlanGroupLinkResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PlanGroupLinkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanGroupLinkResponse>

    /** @see [retrieve] */
    fun retrieve(params: PlanGroupLinkRetrieveParams): CompletableFuture<PlanGroupLinkResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanGroupLinkResponse> =
        retrieve(id, PlanGroupLinkRetrieveParams.none(), requestOptions)

    /** Update PlanGroupLink for the given UUID. */
    fun update(
        id: String,
        params: PlanGroupLinkUpdateParams,
    ): CompletableFuture<PlanGroupLinkResponse> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: PlanGroupLinkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanGroupLinkResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: PlanGroupLinkUpdateParams): CompletableFuture<PlanGroupLinkResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PlanGroupLinkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanGroupLinkResponse>

    /** Retrieve a list of PlanGroupLink entities */
    fun list(): CompletableFuture<PlanGroupLinkListPageAsync> = list(PlanGroupLinkListParams.none())

    /** @see [list] */
    fun list(
        params: PlanGroupLinkListParams = PlanGroupLinkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanGroupLinkListPageAsync>

    /** @see [list] */
    fun list(
        params: PlanGroupLinkListParams = PlanGroupLinkListParams.none()
    ): CompletableFuture<PlanGroupLinkListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<PlanGroupLinkListPageAsync> =
        list(PlanGroupLinkListParams.none(), requestOptions)

    /** Delete a PlanGroupLink for the given UUID. */
    fun delete(id: String): CompletableFuture<PlanGroupLinkResponse> =
        delete(id, PlanGroupLinkDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: PlanGroupLinkDeleteParams = PlanGroupLinkDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanGroupLinkResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: PlanGroupLinkDeleteParams = PlanGroupLinkDeleteParams.none(),
    ): CompletableFuture<PlanGroupLinkResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: PlanGroupLinkDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanGroupLinkResponse>

    /** @see [delete] */
    fun delete(params: PlanGroupLinkDeleteParams): CompletableFuture<PlanGroupLinkResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanGroupLinkResponse> =
        delete(id, PlanGroupLinkDeleteParams.none(), requestOptions)

    /**
     * A view of [PlanGroupLinkServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/plangrouplinks`, but is
         * otherwise the same as [PlanGroupLinkServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: PlanGroupLinkCreateParams
        ): CompletableFuture<HttpResponseFor<PlanGroupLinkResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PlanGroupLinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupLinkResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plangrouplinks/{id}`, but is
         * otherwise the same as [PlanGroupLinkServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<PlanGroupLinkResponse>> =
            retrieve(id, PlanGroupLinkRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PlanGroupLinkRetrieveParams = PlanGroupLinkRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupLinkResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PlanGroupLinkRetrieveParams = PlanGroupLinkRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupLinkResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PlanGroupLinkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupLinkResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PlanGroupLinkRetrieveParams
        ): CompletableFuture<HttpResponseFor<PlanGroupLinkResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanGroupLinkResponse>> =
            retrieve(id, PlanGroupLinkRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/plangrouplinks/{id}`, but is
         * otherwise the same as [PlanGroupLinkServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: PlanGroupLinkUpdateParams,
        ): CompletableFuture<HttpResponseFor<PlanGroupLinkResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: PlanGroupLinkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupLinkResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PlanGroupLinkUpdateParams
        ): CompletableFuture<HttpResponseFor<PlanGroupLinkResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PlanGroupLinkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupLinkResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plangrouplinks`, but is
         * otherwise the same as [PlanGroupLinkServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<PlanGroupLinkListPageAsync>> =
            list(PlanGroupLinkListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PlanGroupLinkListParams = PlanGroupLinkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupLinkListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PlanGroupLinkListParams = PlanGroupLinkListParams.none()
        ): CompletableFuture<HttpResponseFor<PlanGroupLinkListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PlanGroupLinkListPageAsync>> =
            list(PlanGroupLinkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/plangrouplinks/{id}`, but
         * is otherwise the same as [PlanGroupLinkServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(id: String): CompletableFuture<HttpResponseFor<PlanGroupLinkResponse>> =
            delete(id, PlanGroupLinkDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: PlanGroupLinkDeleteParams = PlanGroupLinkDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupLinkResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: PlanGroupLinkDeleteParams = PlanGroupLinkDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupLinkResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: PlanGroupLinkDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanGroupLinkResponse>>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: PlanGroupLinkDeleteParams
        ): CompletableFuture<HttpResponseFor<PlanGroupLinkResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanGroupLinkResponse>> =
            delete(id, PlanGroupLinkDeleteParams.none(), requestOptions)
    }
}
