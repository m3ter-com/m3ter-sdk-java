// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.CurrencyCreateParams
import com.m3ter.sdk.models.CurrencyDeleteParams
import com.m3ter.sdk.models.CurrencyListPage
import com.m3ter.sdk.models.CurrencyListParams
import com.m3ter.sdk.models.CurrencyResponse
import com.m3ter.sdk.models.CurrencyRetrieveParams
import com.m3ter.sdk.models.CurrencyUpdateParams

interface CurrencyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Creates a new Currency for the specified Organization.
     *
     * Used to create a Currency that your Organization will start to use.
     */
    fun create(params: CurrencyCreateParams): CurrencyResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CurrencyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyResponse

    /**
     * Retrieve the specified Currency with the given UUID. Used to obtain the details of a
     * specified existing Currency in your Organization.
     */
    fun retrieve(params: CurrencyRetrieveParams): CurrencyResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CurrencyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyResponse

    /**
     * Update a Currency with the given UUID.
     *
     * Used to update the attributes of the specified Currency for the specified Organization.
     */
    fun update(params: CurrencyUpdateParams): CurrencyResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CurrencyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyResponse

    /**
     * Retrieve a list of Currencies.
     *
     * Retrieves a list of Currencies for the specified Organization. This endpoint supports
     * pagination and includes various query parameters to filter the Currencies based on Currency
     * ID, and short codes.
     */
    fun list(params: CurrencyListParams): CurrencyListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: CurrencyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyListPage

    /**
     * Delete the Currency with the given UUID.
     *
     * Used to remove an existing Currency from your Organization that is no longer required.
     */
    fun delete(params: CurrencyDeleteParams): CurrencyResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CurrencyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyResponse

    /** A view of [CurrencyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/picklists/currency`, but is
         * otherwise the same as [CurrencyService.create].
         */
        @MustBeClosed
        fun create(params: CurrencyCreateParams): HttpResponseFor<CurrencyResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CurrencyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/picklists/currency/{id}`, but
         * is otherwise the same as [CurrencyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: CurrencyRetrieveParams): HttpResponseFor<CurrencyResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CurrencyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/picklists/currency/{id}`, but
         * is otherwise the same as [CurrencyService.update].
         */
        @MustBeClosed
        fun update(params: CurrencyUpdateParams): HttpResponseFor<CurrencyResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CurrencyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/picklists/currency`, but is
         * otherwise the same as [CurrencyService.list].
         */
        @MustBeClosed
        fun list(params: CurrencyListParams): HttpResponseFor<CurrencyListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CurrencyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyListPage>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/picklists/currency/{id}`,
         * but is otherwise the same as [CurrencyService.delete].
         */
        @MustBeClosed
        fun delete(params: CurrencyDeleteParams): HttpResponseFor<CurrencyResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CurrencyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyResponse>
    }
}
