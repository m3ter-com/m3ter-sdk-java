// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.TransactionTypeCreateParams
import com.m3ter.sdk.models.TransactionTypeDeleteParams
import com.m3ter.sdk.models.TransactionTypeListPage
import com.m3ter.sdk.models.TransactionTypeListParams
import com.m3ter.sdk.models.TransactionTypeResponse
import com.m3ter.sdk.models.TransactionTypeRetrieveParams
import com.m3ter.sdk.models.TransactionTypeUpdateParams

interface TransactionTypeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new TransactionType for the specified Organization. Details of the new
     * TransactionType should be included in the request body.
     */
    @JvmOverloads
    fun create(
        params: TransactionTypeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionTypeResponse

    /** Retrieves the TransactionType with the given UUID from the specified Organization. */
    @JvmOverloads
    fun retrieve(
        params: TransactionTypeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionTypeResponse

    /**
     * Updates the TransactionType with the specified UUID for the specified Organization. Update
     * details for the TransactionType should be included in the request body.
     */
    @JvmOverloads
    fun update(
        params: TransactionTypeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionTypeResponse

    /**
     * Retrieves a list of TransactionType entities for the specified Organization. The list can be
     * paginated for easier management, and supports filtering by various parameters.
     */
    @JvmOverloads
    fun list(
        params: TransactionTypeListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionTypeListPage

    /** Deletes the TransactionType with the given UUID from the specified Organization. */
    @JvmOverloads
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
        @JvmOverloads
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
        @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: TransactionTypeUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionTypeResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/picklists/transactiontypes`,
         * but is otherwise the same as [TransactionTypeService.list].
         */
        @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: TransactionTypeDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionTypeResponse>
    }
}
