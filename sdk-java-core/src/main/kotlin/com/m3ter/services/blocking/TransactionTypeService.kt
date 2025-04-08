// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.TransactionTypeCreateParams
import com.m3ter.models.TransactionTypeDeleteParams
import com.m3ter.models.TransactionTypeListPage
import com.m3ter.models.TransactionTypeListParams
import com.m3ter.models.TransactionTypeResponse
import com.m3ter.models.TransactionTypeRetrieveParams
import com.m3ter.models.TransactionTypeUpdateParams

interface TransactionTypeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new TransactionType for the specified Organization. Details of the new
     * TransactionType should be included in the request body.
     */
    fun create(params: TransactionTypeCreateParams): TransactionTypeResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: TransactionTypeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionTypeResponse

    /** Retrieves the TransactionType with the given UUID from the specified Organization. */
    fun retrieve(params: TransactionTypeRetrieveParams): TransactionTypeResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TransactionTypeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionTypeResponse

    /**
     * Updates the TransactionType with the specified UUID for the specified Organization. Update
     * details for the TransactionType should be included in the request body.
     */
    fun update(params: TransactionTypeUpdateParams): TransactionTypeResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: TransactionTypeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionTypeResponse

    /**
     * Retrieves a list of TransactionType entities for the specified Organization. The list can be
     * paginated for easier management, and supports filtering by various parameters.
     */
    fun list(params: TransactionTypeListParams): TransactionTypeListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: TransactionTypeListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionTypeListPage

    /** Deletes the TransactionType with the given UUID from the specified Organization. */
    fun delete(params: TransactionTypeDeleteParams): TransactionTypeResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: TransactionTypeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionTypeResponse

    /**
     * A view of [TransactionTypeService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/picklists/transactiontypes`,
         * but is otherwise the same as [TransactionTypeService.create].
         */
        @MustBeClosed
        fun create(params: TransactionTypeCreateParams): HttpResponseFor<TransactionTypeResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: TransactionTypeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionTypeResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/picklists/transactiontypes/{id}`, but is otherwise the same as
         * [TransactionTypeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: TransactionTypeRetrieveParams
        ): HttpResponseFor<TransactionTypeResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TransactionTypeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionTypeResponse>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/picklists/transactiontypes/{id}`, but is otherwise the same as
         * [TransactionTypeService.update].
         */
        @MustBeClosed
        fun update(params: TransactionTypeUpdateParams): HttpResponseFor<TransactionTypeResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: TransactionTypeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionTypeResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/picklists/transactiontypes`,
         * but is otherwise the same as [TransactionTypeService.list].
         */
        @MustBeClosed
        fun list(params: TransactionTypeListParams): HttpResponseFor<TransactionTypeListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TransactionTypeListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionTypeListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/picklists/transactiontypes/{id}`, but is otherwise the same as
         * [TransactionTypeService.delete].
         */
        @MustBeClosed
        fun delete(params: TransactionTypeDeleteParams): HttpResponseFor<TransactionTypeResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: TransactionTypeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionTypeResponse>
    }
}
