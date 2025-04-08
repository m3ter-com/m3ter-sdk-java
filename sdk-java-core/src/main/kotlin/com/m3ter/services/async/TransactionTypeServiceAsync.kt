// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.TransactionTypeCreateParams
import com.m3ter.models.TransactionTypeDeleteParams
import com.m3ter.models.TransactionTypeListPageAsync
import com.m3ter.models.TransactionTypeListParams
import com.m3ter.models.TransactionTypeResponse
import com.m3ter.models.TransactionTypeRetrieveParams
import com.m3ter.models.TransactionTypeUpdateParams
import java.util.concurrent.CompletableFuture

interface TransactionTypeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new TransactionType for the specified Organization. Details of the new
     * TransactionType should be included in the request body.
     */
    fun create(params: TransactionTypeCreateParams): CompletableFuture<TransactionTypeResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: TransactionTypeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionTypeResponse>

    /** Retrieves the TransactionType with the given UUID from the specified Organization. */
    fun retrieve(
        params: TransactionTypeRetrieveParams
    ): CompletableFuture<TransactionTypeResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TransactionTypeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionTypeResponse>

    /**
     * Updates the TransactionType with the specified UUID for the specified Organization. Update
     * details for the TransactionType should be included in the request body.
     */
    fun update(params: TransactionTypeUpdateParams): CompletableFuture<TransactionTypeResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: TransactionTypeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionTypeResponse>

    /**
     * Retrieves a list of TransactionType entities for the specified Organization. The list can be
     * paginated for easier management, and supports filtering by various parameters.
     */
    fun list(): CompletableFuture<TransactionTypeListPageAsync> =
        list(TransactionTypeListParams.none())

    /** @see [list] */
    fun list(
        params: TransactionTypeListParams = TransactionTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionTypeListPageAsync>

    /** @see [list] */
    fun list(
        params: TransactionTypeListParams = TransactionTypeListParams.none()
    ): CompletableFuture<TransactionTypeListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<TransactionTypeListPageAsync> =
        list(TransactionTypeListParams.none(), requestOptions)

    /** Deletes the TransactionType with the given UUID from the specified Organization. */
    fun delete(params: TransactionTypeDeleteParams): CompletableFuture<TransactionTypeResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: TransactionTypeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionTypeResponse>

    /**
     * A view of [TransactionTypeServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/picklists/transactiontypes`,
         * but is otherwise the same as [TransactionTypeServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: TransactionTypeCreateParams
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: TransactionTypeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/picklists/transactiontypes/{id}`, but is otherwise the same as
         * [TransactionTypeServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: TransactionTypeRetrieveParams
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TransactionTypeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/picklists/transactiontypes/{id}`, but is otherwise the same as
         * [TransactionTypeServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: TransactionTypeUpdateParams
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: TransactionTypeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/picklists/transactiontypes`,
         * but is otherwise the same as [TransactionTypeServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<TransactionTypeListPageAsync>> =
            list(TransactionTypeListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TransactionTypeListParams = TransactionTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionTypeListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TransactionTypeListParams = TransactionTypeListParams.none()
        ): CompletableFuture<HttpResponseFor<TransactionTypeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TransactionTypeListPageAsync>> =
            list(TransactionTypeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/picklists/transactiontypes/{id}`, but is otherwise the same as
         * [TransactionTypeServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: TransactionTypeDeleteParams
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: TransactionTypeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>>
    }
}
