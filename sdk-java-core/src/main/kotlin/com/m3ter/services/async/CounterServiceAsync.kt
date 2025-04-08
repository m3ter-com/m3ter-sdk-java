// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.CounterCreateParams
import com.m3ter.models.CounterDeleteParams
import com.m3ter.models.CounterListPageAsync
import com.m3ter.models.CounterListParams
import com.m3ter.models.CounterResponse
import com.m3ter.models.CounterRetrieveParams
import com.m3ter.models.CounterUpdateParams
import java.util.concurrent.CompletableFuture

interface CounterServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new Counter. */
    fun create(params: CounterCreateParams): CompletableFuture<CounterResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CounterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterResponse>

    /** Retrieve a Counter for the given UUID. */
    fun retrieve(params: CounterRetrieveParams): CompletableFuture<CounterResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CounterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterResponse>

    /** Update Counter for the given UUID. */
    fun update(params: CounterUpdateParams): CompletableFuture<CounterResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CounterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterResponse>

    /**
     * Retrieve a list of Counter entities that can be filtered by Product, Counter ID, or Codes.
     */
    fun list(params: CounterListParams): CompletableFuture<CounterListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: CounterListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterListPageAsync>

    /** Delete a Counter for the given UUID. */
    fun delete(params: CounterDeleteParams): CompletableFuture<CounterResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CounterDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterResponse>

    /**
     * A view of [CounterServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/counters`, but is otherwise
         * the same as [CounterServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: CounterCreateParams
        ): CompletableFuture<HttpResponseFor<CounterResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CounterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counters/{id}`, but is
         * otherwise the same as [CounterServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: CounterRetrieveParams
        ): CompletableFuture<HttpResponseFor<CounterResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CounterRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/counters/{id}`, but is
         * otherwise the same as [CounterServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: CounterUpdateParams
        ): CompletableFuture<HttpResponseFor<CounterResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CounterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counters`, but is otherwise
         * the same as [CounterServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: CounterListParams
        ): CompletableFuture<HttpResponseFor<CounterListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CounterListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/counters/{id}`, but is
         * otherwise the same as [CounterServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: CounterDeleteParams
        ): CompletableFuture<HttpResponseFor<CounterResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CounterDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterResponse>>
    }
}
