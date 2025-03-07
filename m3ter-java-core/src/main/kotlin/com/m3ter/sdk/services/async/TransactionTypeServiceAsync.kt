// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.TransactionTypeCreateParams
import com.m3ter.sdk.models.TransactionTypeDeleteParams
import com.m3ter.sdk.models.TransactionTypeListPageAsync
import com.m3ter.sdk.models.TransactionTypeListParams
import com.m3ter.sdk.models.TransactionTypeResponse
import com.m3ter.sdk.models.TransactionTypeRetrieveParams
import com.m3ter.sdk.models.TransactionTypeUpdateParams
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
    @JvmOverloads
    fun create(
        params: TransactionTypeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionTypeResponse>

    /** Retrieves the TransactionType with the given UUID from the specified Organization. */
    @JvmOverloads
    fun retrieve(
        params: TransactionTypeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionTypeResponse>

    /**
     * Updates the TransactionType with the specified UUID for the specified Organization. Update
     * details for the TransactionType should be included in the request body.
     */
    @JvmOverloads
    fun update(
        params: TransactionTypeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionTypeResponse>

    /**
     * Retrieves a list of TransactionType entities for the specified Organization. The list can be
     * paginated for easier management, and supports filtering by various parameters.
     */
    @JvmOverloads
    fun list(
        params: TransactionTypeListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionTypeListPageAsync>

    /** Deletes the TransactionType with the given UUID from the specified Organization. */
    @JvmOverloads
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
        @JvmOverloads
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
        @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: TransactionTypeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/picklists/transactiontypes`,
         * but is otherwise the same as [TransactionTypeServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: TransactionTypeListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionTypeListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/picklists/transactiontypes/{id}`, but is otherwise the same as
         * [TransactionTypeServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: TransactionTypeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>>
    }
}
