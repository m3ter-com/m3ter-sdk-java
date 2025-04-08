// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.CounterCreateParams
import com.m3ter.models.CounterDeleteParams
import com.m3ter.models.CounterListPage
import com.m3ter.models.CounterListParams
import com.m3ter.models.CounterResponse
import com.m3ter.models.CounterRetrieveParams
import com.m3ter.models.CounterUpdateParams

interface CounterService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new Counter. */
    fun create(params: CounterCreateParams): CounterResponse = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CounterCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterResponse

    /** Retrieve a Counter for the given UUID. */
    fun retrieve(params: CounterRetrieveParams): CounterResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CounterRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterResponse

    /** Update Counter for the given UUID. */
    fun update(params: CounterUpdateParams): CounterResponse = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CounterUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterResponse

    /**
     * Retrieve a list of Counter entities that can be filtered by Product, Counter ID, or Codes.
     */
    fun list(params: CounterListParams): CounterListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: CounterListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterListPage

    /** Delete a Counter for the given UUID. */
    fun delete(params: CounterDeleteParams): CounterResponse = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CounterDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CounterResponse

    /** A view of [CounterService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/counters`, but is otherwise
         * the same as [CounterService.create].
         */
        @MustBeClosed
        fun create(params: CounterCreateParams): HttpResponseFor<CounterResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CounterCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counters/{id}`, but is
         * otherwise the same as [CounterService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: CounterRetrieveParams): HttpResponseFor<CounterResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CounterRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/counters/{id}`, but is
         * otherwise the same as [CounterService.update].
         */
        @MustBeClosed
        fun update(params: CounterUpdateParams): HttpResponseFor<CounterResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CounterUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/counters`, but is otherwise
         * the same as [CounterService.list].
         */
        @MustBeClosed
        fun list(params: CounterListParams): HttpResponseFor<CounterListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CounterListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterListPage>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/counters/{id}`, but is
         * otherwise the same as [CounterService.delete].
         */
        @MustBeClosed
        fun delete(params: CounterDeleteParams): HttpResponseFor<CounterResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CounterDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CounterResponse>
    }
}
