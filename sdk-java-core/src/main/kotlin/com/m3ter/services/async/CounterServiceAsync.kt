// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

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
    fun retrieve(id: String): CompletableFuture<CounterResponse> =
        retrieve(id, CounterRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: CounterRetrieveParams = CounterRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: CounterRetrieveParams = CounterRetrieveParams.none(),
    ): CompletableFuture<CounterResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CounterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterResponse>

    /** @see [retrieve] */
    fun retrieve(params: CounterRetrieveParams): CompletableFuture<CounterResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<CounterResponse> =
        retrieve(id, CounterRetrieveParams.none(), requestOptions)

    /** Update Counter for the given UUID. */
    fun update(id: String, params: CounterUpdateParams): CompletableFuture<CounterResponse> =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: CounterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
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
    fun list(): CompletableFuture<CounterListPageAsync> = list(CounterListParams.none())

    /** @see [list] */
    fun list(
        params: CounterListParams = CounterListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterListPageAsync>

    /** @see [list] */
    fun list(
        params: CounterListParams = CounterListParams.none()
    ): CompletableFuture<CounterListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CounterListPageAsync> =
        list(CounterListParams.none(), requestOptions)

    /** Delete a Counter for the given UUID. */
    fun delete(id: String): CompletableFuture<CounterResponse> =
        delete(id, CounterDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: CounterDeleteParams = CounterDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: CounterDeleteParams = CounterDeleteParams.none(),
    ): CompletableFuture<CounterResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CounterDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CounterResponse>

    /** @see [delete] */
    fun delete(params: CounterDeleteParams): CompletableFuture<CounterResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<CounterResponse> =
        delete(id, CounterDeleteParams.none(), requestOptions)

    /**
     * A view of [CounterServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/counters`, but is otherwise
         * the same as [CounterServiceAsync.create].
         */
        fun create(
            params: CounterCreateParams
        ): CompletableFuture<HttpResponseFor<CounterResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: CounterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counters/{id}`, but is
         * otherwise the same as [CounterServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CounterResponse>> =
            retrieve(id, CounterRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: CounterRetrieveParams = CounterRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: CounterRetrieveParams = CounterRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CounterResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: CounterRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: CounterRetrieveParams
        ): CompletableFuture<HttpResponseFor<CounterResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CounterResponse>> =
            retrieve(id, CounterRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/counters/{id}`, but is
         * otherwise the same as [CounterServiceAsync.update].
         */
        fun update(
            id: String,
            params: CounterUpdateParams,
        ): CompletableFuture<HttpResponseFor<CounterResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            params: CounterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            params: CounterUpdateParams
        ): CompletableFuture<HttpResponseFor<CounterResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: CounterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counters`, but is otherwise
         * the same as [CounterServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CounterListPageAsync>> =
            list(CounterListParams.none())

        /** @see [list] */
        fun list(
            params: CounterListParams = CounterListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterListPageAsync>>

        /** @see [list] */
        fun list(
            params: CounterListParams = CounterListParams.none()
        ): CompletableFuture<HttpResponseFor<CounterListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CounterListPageAsync>> =
            list(CounterListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/counters/{id}`, but is
         * otherwise the same as [CounterServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<CounterResponse>> =
            delete(id, CounterDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: CounterDeleteParams = CounterDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: CounterDeleteParams = CounterDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<CounterResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: CounterDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CounterResponse>>

        /** @see [delete] */
        fun delete(
            params: CounterDeleteParams
        ): CompletableFuture<HttpResponseFor<CounterResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CounterResponse>> =
            delete(id, CounterDeleteParams.none(), requestOptions)
    }
}
