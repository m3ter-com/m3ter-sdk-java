// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.ClientOptions
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
import java.util.function.Consumer

interface TransactionTypeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionTypeServiceAsync

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
    fun retrieve(id: String): CompletableFuture<TransactionTypeResponse> =
        retrieve(id, TransactionTypeRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: TransactionTypeRetrieveParams = TransactionTypeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionTypeResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: TransactionTypeRetrieveParams = TransactionTypeRetrieveParams.none(),
    ): CompletableFuture<TransactionTypeResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TransactionTypeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionTypeResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: TransactionTypeRetrieveParams
    ): CompletableFuture<TransactionTypeResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionTypeResponse> =
        retrieve(id, TransactionTypeRetrieveParams.none(), requestOptions)

    /**
     * Updates the TransactionType with the specified UUID for the specified Organization. Update
     * details for the TransactionType should be included in the request body.
     */
    fun update(
        id: String,
        params: TransactionTypeUpdateParams,
    ): CompletableFuture<TransactionTypeResponse> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: TransactionTypeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionTypeResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
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
    fun delete(id: String): CompletableFuture<TransactionTypeResponse> =
        delete(id, TransactionTypeDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: TransactionTypeDeleteParams = TransactionTypeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionTypeResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: TransactionTypeDeleteParams = TransactionTypeDeleteParams.none(),
    ): CompletableFuture<TransactionTypeResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: TransactionTypeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionTypeResponse>

    /** @see [delete] */
    fun delete(params: TransactionTypeDeleteParams): CompletableFuture<TransactionTypeResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionTypeResponse> =
        delete(id, TransactionTypeDeleteParams.none(), requestOptions)

    /**
     * A view of [TransactionTypeServiceAsync] that provides access to raw HTTP responses for each
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
        ): TransactionTypeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/picklists/transactiontypes`,
         * but is otherwise the same as [TransactionTypeServiceAsync.create].
         */
        fun create(
            params: TransactionTypeCreateParams
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: TransactionTypeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/picklists/transactiontypes/{id}`, but is otherwise the same as
         * [TransactionTypeServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> =
            retrieve(id, TransactionTypeRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: TransactionTypeRetrieveParams = TransactionTypeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: TransactionTypeRetrieveParams = TransactionTypeRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: TransactionTypeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: TransactionTypeRetrieveParams
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> =
            retrieve(id, TransactionTypeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/picklists/transactiontypes/{id}`, but is otherwise the same as
         * [TransactionTypeServiceAsync.update].
         */
        fun update(
            id: String,
            params: TransactionTypeUpdateParams,
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            params: TransactionTypeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            params: TransactionTypeUpdateParams
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: TransactionTypeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/picklists/transactiontypes`,
         * but is otherwise the same as [TransactionTypeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TransactionTypeListPageAsync>> =
            list(TransactionTypeListParams.none())

        /** @see [list] */
        fun list(
            params: TransactionTypeListParams = TransactionTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionTypeListPageAsync>>

        /** @see [list] */
        fun list(
            params: TransactionTypeListParams = TransactionTypeListParams.none()
        ): CompletableFuture<HttpResponseFor<TransactionTypeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TransactionTypeListPageAsync>> =
            list(TransactionTypeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/picklists/transactiontypes/{id}`, but is otherwise the same as
         * [TransactionTypeServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> =
            delete(id, TransactionTypeDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: TransactionTypeDeleteParams = TransactionTypeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: TransactionTypeDeleteParams = TransactionTypeDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: TransactionTypeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>>

        /** @see [delete] */
        fun delete(
            params: TransactionTypeDeleteParams
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionTypeResponse>> =
            delete(id, TransactionTypeDeleteParams.none(), requestOptions)
    }
}
