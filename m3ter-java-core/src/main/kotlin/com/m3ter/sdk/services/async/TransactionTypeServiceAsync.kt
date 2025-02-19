// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.TransactionType
import com.m3ter.sdk.models.TransactionTypeCreateParams
import com.m3ter.sdk.models.TransactionTypeDeleteParams
import com.m3ter.sdk.models.TransactionTypeListPageAsync
import com.m3ter.sdk.models.TransactionTypeListParams
import com.m3ter.sdk.models.TransactionTypeRetrieveParams
import com.m3ter.sdk.models.TransactionTypeUpdateParams
import java.util.concurrent.CompletableFuture

interface TransactionTypeServiceAsync {

    /**
     * Create a new TransactionType for the specified Organization. Details of the new
     * TransactionType should be included in the request body.
     */
    @JvmOverloads
    fun create(
        params: TransactionTypeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionType>

    /** Retrieves the TransactionType with the given UUID from the specified Organization. */
    @JvmOverloads
    fun retrieve(
        params: TransactionTypeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionType>

    /**
     * Updates the TransactionType with the specified UUID for the specified Organization. Update
     * details for the TransactionType should be included in the request body.
     */
    @JvmOverloads
    fun update(
        params: TransactionTypeUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionType>

    /**
     * Retrieves a list of TransactionType entities for the specified Organization. The list can be
     * paginated for easier management, and supports filtering by various parameters.
     */
    @JvmOverloads
    fun list(
        params: TransactionTypeListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionTypeListPageAsync>

    /** Deletes the TransactionType with the given UUID from the specified Organization. */
    @JvmOverloads
    fun delete(
        params: TransactionTypeDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionType>
}
