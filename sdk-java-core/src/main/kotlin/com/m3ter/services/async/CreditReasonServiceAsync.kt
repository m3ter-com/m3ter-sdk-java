// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.CreditReasonCreateParams
import com.m3ter.models.CreditReasonDeleteParams
import com.m3ter.models.CreditReasonListPageAsync
import com.m3ter.models.CreditReasonListParams
import com.m3ter.models.CreditReasonResponse
import com.m3ter.models.CreditReasonRetrieveParams
import com.m3ter.models.CreditReasonUpdateParams
import java.util.concurrent.CompletableFuture

interface CreditReasonServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new Credit Reason for your Organization. When you've created a Credit Reason, it
     * becomes available as a credit type for adding Credit line items to Bills. See
     * [Credits](https://www.m3ter.com/docs/api#tag/Credits).
     */
    fun create(params: CreditReasonCreateParams): CompletableFuture<CreditReasonResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CreditReasonCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditReasonResponse>

    /** Retrieve the Credit Reason with the given UUID. */
    fun retrieve(id: String): CompletableFuture<CreditReasonResponse> =
        retrieve(id, CreditReasonRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: CreditReasonRetrieveParams = CreditReasonRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditReasonResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: CreditReasonRetrieveParams = CreditReasonRetrieveParams.none(),
    ): CompletableFuture<CreditReasonResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CreditReasonRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditReasonResponse>

    /** @see [retrieve] */
    fun retrieve(params: CreditReasonRetrieveParams): CompletableFuture<CreditReasonResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditReasonResponse> =
        retrieve(id, CreditReasonRetrieveParams.none(), requestOptions)

    /** Update the Credit Reason with the given UUID. */
    fun update(
        id: String,
        params: CreditReasonUpdateParams,
    ): CompletableFuture<CreditReasonResponse> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: CreditReasonUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditReasonResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: CreditReasonUpdateParams): CompletableFuture<CreditReasonResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CreditReasonUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditReasonResponse>

    /**
     * Retrieve a list of the Credit Reason entities created for your Organization. You can filter
     * the list returned for the call by Credit Reason ID, Credit Reason short code, or by Archive
     * status.
     */
    fun list(): CompletableFuture<CreditReasonListPageAsync> = list(CreditReasonListParams.none())

    /** @see [list] */
    fun list(
        params: CreditReasonListParams = CreditReasonListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditReasonListPageAsync>

    /** @see [list] */
    fun list(
        params: CreditReasonListParams = CreditReasonListParams.none()
    ): CompletableFuture<CreditReasonListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CreditReasonListPageAsync> =
        list(CreditReasonListParams.none(), requestOptions)

    /** Delete the Credit Reason with the given UUID. */
    fun delete(id: String): CompletableFuture<CreditReasonResponse> =
        delete(id, CreditReasonDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: CreditReasonDeleteParams = CreditReasonDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditReasonResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: CreditReasonDeleteParams = CreditReasonDeleteParams.none(),
    ): CompletableFuture<CreditReasonResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CreditReasonDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CreditReasonResponse>

    /** @see [delete] */
    fun delete(params: CreditReasonDeleteParams): CompletableFuture<CreditReasonResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditReasonResponse> =
        delete(id, CreditReasonDeleteParams.none(), requestOptions)

    /**
     * A view of [CreditReasonServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/picklists/creditreasons`,
         * but is otherwise the same as [CreditReasonServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: CreditReasonCreateParams
        ): CompletableFuture<HttpResponseFor<CreditReasonResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CreditReasonCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditReasonResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/picklists/creditreasons/{id}`, but is otherwise the same as
         * [CreditReasonServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CreditReasonResponse>> =
            retrieve(id, CreditReasonRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CreditReasonRetrieveParams = CreditReasonRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditReasonResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CreditReasonRetrieveParams = CreditReasonRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CreditReasonResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CreditReasonRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditReasonResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CreditReasonRetrieveParams
        ): CompletableFuture<HttpResponseFor<CreditReasonResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditReasonResponse>> =
            retrieve(id, CreditReasonRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/picklists/creditreasons/{id}`, but is otherwise the same as
         * [CreditReasonServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: CreditReasonUpdateParams,
        ): CompletableFuture<HttpResponseFor<CreditReasonResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: CreditReasonUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditReasonResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CreditReasonUpdateParams
        ): CompletableFuture<HttpResponseFor<CreditReasonResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CreditReasonUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditReasonResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/picklists/creditreasons`, but
         * is otherwise the same as [CreditReasonServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<CreditReasonListPageAsync>> =
            list(CreditReasonListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CreditReasonListParams = CreditReasonListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditReasonListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CreditReasonListParams = CreditReasonListParams.none()
        ): CompletableFuture<HttpResponseFor<CreditReasonListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CreditReasonListPageAsync>> =
            list(CreditReasonListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/picklists/creditreasons/{id}`, but is otherwise the same as
         * [CreditReasonServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(id: String): CompletableFuture<HttpResponseFor<CreditReasonResponse>> =
            delete(id, CreditReasonDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: CreditReasonDeleteParams = CreditReasonDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditReasonResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: CreditReasonDeleteParams = CreditReasonDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<CreditReasonResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CreditReasonDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CreditReasonResponse>>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CreditReasonDeleteParams
        ): CompletableFuture<HttpResponseFor<CreditReasonResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditReasonResponse>> =
            delete(id, CreditReasonDeleteParams.none(), requestOptions)
    }
}
