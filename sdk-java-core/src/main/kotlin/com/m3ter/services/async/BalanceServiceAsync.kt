// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.Balance
import com.m3ter.models.BalanceCreateParams
import com.m3ter.models.BalanceDeleteParams
import com.m3ter.models.BalanceListPageAsync
import com.m3ter.models.BalanceListParams
import com.m3ter.models.BalanceRetrieveParams
import com.m3ter.models.BalanceUpdateParams
import com.m3ter.services.async.balances.TransactionServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceServiceAsync

    fun transactions(): TransactionServiceAsync

    /**
     * Create a new Balance for the given end customer Account.
     *
     * This endpoint allows you to create a new Balance for a specific end customer Account. The
     * Balance details should be provided in the request body.
     */
    fun create(params: BalanceCreateParams): CompletableFuture<Balance> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BalanceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Balance>

    /**
     * Retrieve a specific Balance.
     *
     * This endpoint returns the details of the specified Balance.
     */
    fun retrieve(id: String): CompletableFuture<Balance> =
        retrieve(id, BalanceRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: BalanceRetrieveParams = BalanceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Balance> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: BalanceRetrieveParams = BalanceRetrieveParams.none(),
    ): CompletableFuture<Balance> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BalanceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Balance>

    /** @see [retrieve] */
    fun retrieve(params: BalanceRetrieveParams): CompletableFuture<Balance> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Balance> =
        retrieve(id, BalanceRetrieveParams.none(), requestOptions)

    /**
     * Update a specific Balance.
     *
     * This endpoint allows you to update the details of a specific Balance. The updated Balance
     * details should be provided in the request body.
     */
    fun update(id: String, params: BalanceUpdateParams): CompletableFuture<Balance> =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: BalanceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Balance> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: BalanceUpdateParams): CompletableFuture<Balance> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: BalanceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Balance>

    /**
     * Retrieve a list of all Balances for your Organization.
     *
     * This endpoint returns a list of all Balances associated with your organization. You can
     * filter the Balances by the end customer's Account UUID and end dates, and paginate through
     * them using the `pageSize` and `nextToken` parameters.
     */
    fun list(): CompletableFuture<BalanceListPageAsync> = list(BalanceListParams.none())

    /** @see [list] */
    fun list(
        params: BalanceListParams = BalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceListPageAsync>

    /** @see [list] */
    fun list(
        params: BalanceListParams = BalanceListParams.none()
    ): CompletableFuture<BalanceListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<BalanceListPageAsync> =
        list(BalanceListParams.none(), requestOptions)

    /**
     * Delete a specific Balance.
     *
     * This endpoint allows you to delete a specific Balance with the given UUID.
     */
    fun delete(id: String): CompletableFuture<Balance> = delete(id, BalanceDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: BalanceDeleteParams = BalanceDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Balance> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: BalanceDeleteParams = BalanceDeleteParams.none(),
    ): CompletableFuture<Balance> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: BalanceDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Balance>

    /** @see [delete] */
    fun delete(params: BalanceDeleteParams): CompletableFuture<Balance> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Balance> =
        delete(id, BalanceDeleteParams.none(), requestOptions)

    /**
     * A view of [BalanceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BalanceServiceAsync.WithRawResponse

        fun transactions(): TransactionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/balances`, but is otherwise
         * the same as [BalanceServiceAsync.create].
         */
        fun create(params: BalanceCreateParams): CompletableFuture<HttpResponseFor<Balance>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: BalanceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Balance>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/balances/{id}`, but is
         * otherwise the same as [BalanceServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Balance>> =
            retrieve(id, BalanceRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: BalanceRetrieveParams = BalanceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Balance>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: BalanceRetrieveParams = BalanceRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Balance>> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: BalanceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Balance>>

        /** @see [retrieve] */
        fun retrieve(params: BalanceRetrieveParams): CompletableFuture<HttpResponseFor<Balance>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Balance>> =
            retrieve(id, BalanceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/balances/{id}`, but is
         * otherwise the same as [BalanceServiceAsync.update].
         */
        fun update(
            id: String,
            params: BalanceUpdateParams,
        ): CompletableFuture<HttpResponseFor<Balance>> = update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            params: BalanceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Balance>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(params: BalanceUpdateParams): CompletableFuture<HttpResponseFor<Balance>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: BalanceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Balance>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/balances`, but is otherwise
         * the same as [BalanceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BalanceListPageAsync>> =
            list(BalanceListParams.none())

        /** @see [list] */
        fun list(
            params: BalanceListParams = BalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceListPageAsync>>

        /** @see [list] */
        fun list(
            params: BalanceListParams = BalanceListParams.none()
        ): CompletableFuture<HttpResponseFor<BalanceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BalanceListPageAsync>> =
            list(BalanceListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/balances/{id}`, but is
         * otherwise the same as [BalanceServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<Balance>> =
            delete(id, BalanceDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: BalanceDeleteParams = BalanceDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Balance>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: BalanceDeleteParams = BalanceDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<Balance>> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: BalanceDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Balance>>

        /** @see [delete] */
        fun delete(params: BalanceDeleteParams): CompletableFuture<HttpResponseFor<Balance>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Balance>> =
            delete(id, BalanceDeleteParams.none(), requestOptions)
    }
}
