// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.DebitReasonCreateParams
import com.m3ter.models.DebitReasonDeleteParams
import com.m3ter.models.DebitReasonListPageAsync
import com.m3ter.models.DebitReasonListParams
import com.m3ter.models.DebitReasonResponse
import com.m3ter.models.DebitReasonRetrieveParams
import com.m3ter.models.DebitReasonUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DebitReasonServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DebitReasonServiceAsync

    /**
     * Create a new Debit Reason for your Organization. When you've created a Debit Reason, it
     * becomes available as a debit type for adding Debit line items to Bills. See
     * [Debits](https://www.m3ter.com/docs/api#tag/Debits).
     */
    fun create(params: DebitReasonCreateParams): CompletableFuture<DebitReasonResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: DebitReasonCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitReasonResponse>

    /** Retrieve the Debit Reason with the given UUID. */
    fun retrieve(id: String): CompletableFuture<DebitReasonResponse> =
        retrieve(id, DebitReasonRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DebitReasonRetrieveParams = DebitReasonRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitReasonResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: DebitReasonRetrieveParams = DebitReasonRetrieveParams.none(),
    ): CompletableFuture<DebitReasonResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DebitReasonRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitReasonResponse>

    /** @see retrieve */
    fun retrieve(params: DebitReasonRetrieveParams): CompletableFuture<DebitReasonResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DebitReasonResponse> =
        retrieve(id, DebitReasonRetrieveParams.none(), requestOptions)

    /** Update the Debit Reason with the given UUID. */
    fun update(
        id: String,
        params: DebitReasonUpdateParams,
    ): CompletableFuture<DebitReasonResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: DebitReasonUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitReasonResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: DebitReasonUpdateParams): CompletableFuture<DebitReasonResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: DebitReasonUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitReasonResponse>

    /**
     * Retrieve a list of the Debit Reason entities created for your Organization. You can filter
     * the list returned for the call by Debit Reason ID, Debit Reason short code, or by Archive
     * status.
     */
    fun list(): CompletableFuture<DebitReasonListPageAsync> = list(DebitReasonListParams.none())

    /** @see list */
    fun list(
        params: DebitReasonListParams = DebitReasonListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitReasonListPageAsync>

    /** @see list */
    fun list(
        params: DebitReasonListParams = DebitReasonListParams.none()
    ): CompletableFuture<DebitReasonListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DebitReasonListPageAsync> =
        list(DebitReasonListParams.none(), requestOptions)

    /** Delete the Debit Reason with the given UUID. */
    fun delete(id: String): CompletableFuture<DebitReasonResponse> =
        delete(id, DebitReasonDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: DebitReasonDeleteParams = DebitReasonDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitReasonResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: DebitReasonDeleteParams = DebitReasonDeleteParams.none(),
    ): CompletableFuture<DebitReasonResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: DebitReasonDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DebitReasonResponse>

    /** @see delete */
    fun delete(params: DebitReasonDeleteParams): CompletableFuture<DebitReasonResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<DebitReasonResponse> =
        delete(id, DebitReasonDeleteParams.none(), requestOptions)

    /**
     * A view of [DebitReasonServiceAsync] that provides access to raw HTTP responses for each
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
        ): DebitReasonServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/picklists/debitreasons`, but
         * is otherwise the same as [DebitReasonServiceAsync.create].
         */
        fun create(
            params: DebitReasonCreateParams
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: DebitReasonCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/picklists/debitreasons/{id}`,
         * but is otherwise the same as [DebitReasonServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<DebitReasonResponse>> =
            retrieve(id, DebitReasonRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DebitReasonRetrieveParams = DebitReasonRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: DebitReasonRetrieveParams = DebitReasonRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DebitReasonRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>>

        /** @see retrieve */
        fun retrieve(
            params: DebitReasonRetrieveParams
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>> =
            retrieve(id, DebitReasonRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/picklists/debitreasons/{id}`,
         * but is otherwise the same as [DebitReasonServiceAsync.update].
         */
        fun update(
            id: String,
            params: DebitReasonUpdateParams,
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: DebitReasonUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: DebitReasonUpdateParams
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: DebitReasonUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/picklists/debitreasons`, but
         * is otherwise the same as [DebitReasonServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DebitReasonListPageAsync>> =
            list(DebitReasonListParams.none())

        /** @see list */
        fun list(
            params: DebitReasonListParams = DebitReasonListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitReasonListPageAsync>>

        /** @see list */
        fun list(
            params: DebitReasonListParams = DebitReasonListParams.none()
        ): CompletableFuture<HttpResponseFor<DebitReasonListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DebitReasonListPageAsync>> =
            list(DebitReasonListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/picklists/debitreasons/{id}`, but is otherwise the same as
         * [DebitReasonServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<DebitReasonResponse>> =
            delete(id, DebitReasonDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: DebitReasonDeleteParams = DebitReasonDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: DebitReasonDeleteParams = DebitReasonDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: DebitReasonDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>>

        /** @see delete */
        fun delete(
            params: DebitReasonDeleteParams
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DebitReasonResponse>> =
            delete(id, DebitReasonDeleteParams.none(), requestOptions)
    }
}
