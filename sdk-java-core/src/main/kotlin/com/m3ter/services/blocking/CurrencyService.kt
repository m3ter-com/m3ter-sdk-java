// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.CurrencyCreateParams
import com.m3ter.models.CurrencyDeleteParams
import com.m3ter.models.CurrencyListPage
import com.m3ter.models.CurrencyListParams
import com.m3ter.models.CurrencyResponse
import com.m3ter.models.CurrencyRetrieveParams
import com.m3ter.models.CurrencyUpdateParams
import java.util.function.Consumer

interface CurrencyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrencyService

    /**
     * Creates a new Currency for the specified Organization.
     *
     * Used to create a Currency that your Organization will start to use.
     */
    fun create(params: CurrencyCreateParams): CurrencyResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CurrencyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyResponse

    /**
     * Retrieve the specified Currency with the given UUID. Used to obtain the details of a
     * specified existing Currency in your Organization.
     */
    fun retrieve(id: String): CurrencyResponse = retrieve(id, CurrencyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CurrencyRetrieveParams = CurrencyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CurrencyRetrieveParams = CurrencyRetrieveParams.none(),
    ): CurrencyResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CurrencyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyResponse

    /** @see retrieve */
    fun retrieve(params: CurrencyRetrieveParams): CurrencyResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CurrencyResponse =
        retrieve(id, CurrencyRetrieveParams.none(), requestOptions)

    /**
     * Update a Currency with the given UUID.
     *
     * Used to update the attributes of the specified Currency for the specified Organization.
     */
    fun update(id: String, params: CurrencyUpdateParams): CurrencyResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: CurrencyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: CurrencyUpdateParams): CurrencyResponse =
        update(params, RequestOptions.none())

    /** @see update */
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
    fun list(): CurrencyListPage = list(CurrencyListParams.none())

    /** @see list */
    fun list(
        params: CurrencyListParams = CurrencyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyListPage

    /** @see list */
    fun list(params: CurrencyListParams = CurrencyListParams.none()): CurrencyListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CurrencyListPage =
        list(CurrencyListParams.none(), requestOptions)

    /**
     * Delete the Currency with the given UUID.
     *
     * Used to remove an existing Currency from your Organization that is no longer required.
     */
    fun delete(id: String): CurrencyResponse = delete(id, CurrencyDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: CurrencyDeleteParams = CurrencyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: CurrencyDeleteParams = CurrencyDeleteParams.none(),
    ): CurrencyResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CurrencyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CurrencyResponse

    /** @see delete */
    fun delete(params: CurrencyDeleteParams): CurrencyResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CurrencyResponse =
        delete(id, CurrencyDeleteParams.none(), requestOptions)

    /** A view of [CurrencyService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrencyService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/picklists/currency`, but is
         * otherwise the same as [CurrencyService.create].
         */
        @MustBeClosed
        fun create(params: CurrencyCreateParams): HttpResponseFor<CurrencyResponse> =
            create(params, RequestOptions.none())

        /** @see create */
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
        fun retrieve(id: String): HttpResponseFor<CurrencyResponse> =
            retrieve(id, CurrencyRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CurrencyRetrieveParams = CurrencyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CurrencyRetrieveParams = CurrencyRetrieveParams.none(),
        ): HttpResponseFor<CurrencyResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CurrencyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CurrencyRetrieveParams): HttpResponseFor<CurrencyResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencyResponse> =
            retrieve(id, CurrencyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/picklists/currency/{id}`, but
         * is otherwise the same as [CurrencyService.update].
         */
        @MustBeClosed
        fun update(id: String, params: CurrencyUpdateParams): HttpResponseFor<CurrencyResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: CurrencyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CurrencyUpdateParams): HttpResponseFor<CurrencyResponse> =
            update(params, RequestOptions.none())

        /** @see update */
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
        fun list(): HttpResponseFor<CurrencyListPage> = list(CurrencyListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CurrencyListParams = CurrencyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CurrencyListParams = CurrencyListParams.none()
        ): HttpResponseFor<CurrencyListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CurrencyListPage> =
            list(CurrencyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/picklists/currency/{id}`,
         * but is otherwise the same as [CurrencyService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<CurrencyResponse> =
            delete(id, CurrencyDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: CurrencyDeleteParams = CurrencyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: CurrencyDeleteParams = CurrencyDeleteParams.none(),
        ): HttpResponseFor<CurrencyResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CurrencyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CurrencyResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: CurrencyDeleteParams): HttpResponseFor<CurrencyResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponseFor<CurrencyResponse> =
            delete(id, CurrencyDeleteParams.none(), requestOptions)
    }
}
