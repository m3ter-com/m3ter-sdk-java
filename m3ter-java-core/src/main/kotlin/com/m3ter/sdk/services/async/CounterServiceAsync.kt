// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.CounterCreateParams
import com.m3ter.sdk.models.CounterDeleteParams
import com.m3ter.sdk.models.CounterListPageAsync
import com.m3ter.sdk.models.CounterListParams
import com.m3ter.sdk.models.CounterResponse
import com.m3ter.sdk.models.CounterRetrieveParams
import com.m3ter.sdk.models.CounterUpdateParams
import java.util.concurrent.CompletableFuture

interface CounterServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new Counter. */
    @JvmOverloads
    fun create(
        params: CounterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterResponse>

    /** Retrieve a Counter for the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: CounterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterResponse>

    /** Update Counter for the given UUID. */
    @JvmOverloads
    fun update(
        params: CounterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterResponse>

    /**
     * Retrieve a list of Counter entities that can be filtered by Product, Counter ID, or Codes.
     */
    @JvmOverloads
    fun list(
        params: CounterListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterListPageAsync>

    /** Delete a Counter for the given UUID. */
    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: CounterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counters/{id}`, but is
         * otherwise the same as [CounterServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: CounterRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/counters/{id}`, but is
         * otherwise the same as [CounterServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: CounterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counters`, but is otherwise
         * the same as [CounterServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: CounterListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/counters/{id}`, but is
         * otherwise the same as [CounterServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: CounterDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterResponse>>
    }
}
