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
    fun retrieve(id: String): TransactionTypeResponse =
        retrieve(id, TransactionTypeRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: TransactionTypeRetrieveParams = TransactionTypeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionTypeResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: TransactionTypeRetrieveParams = TransactionTypeRetrieveParams.none(),
    ): TransactionTypeResponse = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TransactionTypeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionTypeResponse

    /** @see [retrieve] */
    fun retrieve(params: TransactionTypeRetrieveParams): TransactionTypeResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): TransactionTypeResponse =
        retrieve(id, TransactionTypeRetrieveParams.none(), requestOptions)

    /**
     * Updates the TransactionType with the specified UUID for the specified Organization. Update
     * details for the TransactionType should be included in the request body.
     */
    fun update(id: String, params: TransactionTypeUpdateParams): TransactionTypeResponse =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: TransactionTypeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionTypeResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
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
    fun list(): TransactionTypeListPage = list(TransactionTypeListParams.none())

    /** @see [list] */
    fun list(
        params: TransactionTypeListParams = TransactionTypeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionTypeListPage

    /** @see [list] */
    fun list(
        params: TransactionTypeListParams = TransactionTypeListParams.none()
    ): TransactionTypeListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): TransactionTypeListPage =
        list(TransactionTypeListParams.none(), requestOptions)

    /** Deletes the TransactionType with the given UUID from the specified Organization. */
    fun delete(id: String): TransactionTypeResponse = delete(id, TransactionTypeDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: TransactionTypeDeleteParams = TransactionTypeDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionTypeResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: TransactionTypeDeleteParams = TransactionTypeDeleteParams.none(),
    ): TransactionTypeResponse = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: TransactionTypeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionTypeResponse

    /** @see [delete] */
    fun delete(params: TransactionTypeDeleteParams): TransactionTypeResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): TransactionTypeResponse =
        delete(id, TransactionTypeDeleteParams.none(), requestOptions)

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
        fun retrieve(id: String): HttpResponseFor<TransactionTypeResponse> =
            retrieve(id, TransactionTypeRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TransactionTypeRetrieveParams = TransactionTypeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionTypeResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TransactionTypeRetrieveParams = TransactionTypeRetrieveParams.none(),
        ): HttpResponseFor<TransactionTypeResponse> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TransactionTypeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionTypeResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TransactionTypeRetrieveParams
        ): HttpResponseFor<TransactionTypeResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionTypeResponse> =
            retrieve(id, TransactionTypeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/picklists/transactiontypes/{id}`, but is otherwise the same as
         * [TransactionTypeService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: TransactionTypeUpdateParams,
        ): HttpResponseFor<TransactionTypeResponse> = update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: TransactionTypeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionTypeResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
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
        fun list(): HttpResponseFor<TransactionTypeListPage> =
            list(TransactionTypeListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TransactionTypeListParams = TransactionTypeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionTypeListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: TransactionTypeListParams = TransactionTypeListParams.none()
        ): HttpResponseFor<TransactionTypeListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TransactionTypeListPage> =
            list(TransactionTypeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/picklists/transactiontypes/{id}`, but is otherwise the same as
         * [TransactionTypeService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<TransactionTypeResponse> =
            delete(id, TransactionTypeDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: TransactionTypeDeleteParams = TransactionTypeDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionTypeResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: TransactionTypeDeleteParams = TransactionTypeDeleteParams.none(),
        ): HttpResponseFor<TransactionTypeResponse> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: TransactionTypeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionTypeResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: TransactionTypeDeleteParams): HttpResponseFor<TransactionTypeResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionTypeResponse> =
            delete(id, TransactionTypeDeleteParams.none(), requestOptions)
    }
}
