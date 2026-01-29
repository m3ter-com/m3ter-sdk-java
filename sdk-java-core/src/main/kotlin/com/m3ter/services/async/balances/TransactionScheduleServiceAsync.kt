// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.balances

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.BalanceTransactionScheduleCreateParams
import com.m3ter.models.BalanceTransactionScheduleDeleteParams
import com.m3ter.models.BalanceTransactionScheduleListPageAsync
import com.m3ter.models.BalanceTransactionScheduleListParams
import com.m3ter.models.BalanceTransactionSchedulePreviewParams
import com.m3ter.models.BalanceTransactionScheduleRetrieveParams
import com.m3ter.models.BalanceTransactionScheduleUpdateParams
import com.m3ter.models.ScheduleResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TransactionScheduleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionScheduleServiceAsync

    /** Create a new BalanceTransactionSchedule. */
    fun create(
        balanceId: String,
        params: BalanceTransactionScheduleCreateParams,
    ): CompletableFuture<ScheduleResponse> = create(balanceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        balanceId: String,
        params: BalanceTransactionScheduleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduleResponse> =
        create(params.toBuilder().balanceId(balanceId).build(), requestOptions)

    /** @see create */
    fun create(
        params: BalanceTransactionScheduleCreateParams
    ): CompletableFuture<ScheduleResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BalanceTransactionScheduleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduleResponse>

    /** Retrieve a BalanceTransactionSchedule for the given UUID. */
    fun retrieve(
        id: String,
        params: BalanceTransactionScheduleRetrieveParams,
    ): CompletableFuture<ScheduleResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BalanceTransactionScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduleResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: BalanceTransactionScheduleRetrieveParams
    ): CompletableFuture<ScheduleResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BalanceTransactionScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduleResponse>

    /** Update a BalanceTransactionSchedule for the given UUID. */
    fun update(
        id: String,
        params: BalanceTransactionScheduleUpdateParams,
    ): CompletableFuture<ScheduleResponse> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: BalanceTransactionScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduleResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: BalanceTransactionScheduleUpdateParams
    ): CompletableFuture<ScheduleResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BalanceTransactionScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduleResponse>

    /** Retrieve a list of BalanceTransactionSchedule entities. */
    fun list(balanceId: String): CompletableFuture<BalanceTransactionScheduleListPageAsync> =
        list(balanceId, BalanceTransactionScheduleListParams.none())

    /** @see list */
    fun list(
        balanceId: String,
        params: BalanceTransactionScheduleListParams = BalanceTransactionScheduleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceTransactionScheduleListPageAsync> =
        list(params.toBuilder().balanceId(balanceId).build(), requestOptions)

    /** @see list */
    fun list(
        balanceId: String,
        params: BalanceTransactionScheduleListParams = BalanceTransactionScheduleListParams.none(),
    ): CompletableFuture<BalanceTransactionScheduleListPageAsync> =
        list(balanceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: BalanceTransactionScheduleListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceTransactionScheduleListPageAsync>

    /** @see list */
    fun list(
        params: BalanceTransactionScheduleListParams
    ): CompletableFuture<BalanceTransactionScheduleListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        balanceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceTransactionScheduleListPageAsync> =
        list(balanceId, BalanceTransactionScheduleListParams.none(), requestOptions)

    /** Delete the BalanceTransactionSchedule for the given UUID. */
    fun delete(
        id: String,
        params: BalanceTransactionScheduleDeleteParams,
    ): CompletableFuture<ScheduleResponse> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: BalanceTransactionScheduleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduleResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: BalanceTransactionScheduleDeleteParams
    ): CompletableFuture<ScheduleResponse> = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BalanceTransactionScheduleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduleResponse>

    /**
     * Previews the BalanceTransactions this Schedule would create, without persisting them. You can
     * use this call to obtain a preview of the Transactions a Schedule you plan to create for a
     * Balance would generate.
     */
    fun preview(
        balanceId: String,
        params: BalanceTransactionSchedulePreviewParams,
    ): CompletableFuture<ScheduleResponse> = preview(balanceId, params, RequestOptions.none())

    /** @see preview */
    fun preview(
        balanceId: String,
        params: BalanceTransactionSchedulePreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduleResponse> =
        preview(params.toBuilder().balanceId(balanceId).build(), requestOptions)

    /** @see preview */
    fun preview(
        params: BalanceTransactionSchedulePreviewParams
    ): CompletableFuture<ScheduleResponse> = preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: BalanceTransactionSchedulePreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ScheduleResponse>

    /**
     * A view of [TransactionScheduleServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionScheduleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules`, but is
         * otherwise the same as [TransactionScheduleServiceAsync.create].
         */
        fun create(
            balanceId: String,
            params: BalanceTransactionScheduleCreateParams,
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> =
            create(balanceId, params, RequestOptions.none())

        /** @see create */
        fun create(
            balanceId: String,
            params: BalanceTransactionScheduleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> =
            create(params.toBuilder().balanceId(balanceId).build(), requestOptions)

        /** @see create */
        fun create(
            params: BalanceTransactionScheduleCreateParams
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BalanceTransactionScheduleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules/{id}`, but is
         * otherwise the same as [TransactionScheduleServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: BalanceTransactionScheduleRetrieveParams,
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BalanceTransactionScheduleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: BalanceTransactionScheduleRetrieveParams
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BalanceTransactionScheduleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules/{id}`, but is
         * otherwise the same as [TransactionScheduleServiceAsync.update].
         */
        fun update(
            id: String,
            params: BalanceTransactionScheduleUpdateParams,
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: BalanceTransactionScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: BalanceTransactionScheduleUpdateParams
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BalanceTransactionScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules`, but is
         * otherwise the same as [TransactionScheduleServiceAsync.list].
         */
        fun list(
            balanceId: String
        ): CompletableFuture<HttpResponseFor<BalanceTransactionScheduleListPageAsync>> =
            list(balanceId, BalanceTransactionScheduleListParams.none())

        /** @see list */
        fun list(
            balanceId: String,
            params: BalanceTransactionScheduleListParams =
                BalanceTransactionScheduleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceTransactionScheduleListPageAsync>> =
            list(params.toBuilder().balanceId(balanceId).build(), requestOptions)

        /** @see list */
        fun list(
            balanceId: String,
            params: BalanceTransactionScheduleListParams =
                BalanceTransactionScheduleListParams.none(),
        ): CompletableFuture<HttpResponseFor<BalanceTransactionScheduleListPageAsync>> =
            list(balanceId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: BalanceTransactionScheduleListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceTransactionScheduleListPageAsync>>

        /** @see list */
        fun list(
            params: BalanceTransactionScheduleListParams
        ): CompletableFuture<HttpResponseFor<BalanceTransactionScheduleListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            balanceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceTransactionScheduleListPageAsync>> =
            list(balanceId, BalanceTransactionScheduleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules/{id}`, but is
         * otherwise the same as [TransactionScheduleServiceAsync.delete].
         */
        fun delete(
            id: String,
            params: BalanceTransactionScheduleDeleteParams,
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            params: BalanceTransactionScheduleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: BalanceTransactionScheduleDeleteParams
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BalanceTransactionScheduleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules/preview`, but is
         * otherwise the same as [TransactionScheduleServiceAsync.preview].
         */
        fun preview(
            balanceId: String,
            params: BalanceTransactionSchedulePreviewParams,
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> =
            preview(balanceId, params, RequestOptions.none())

        /** @see preview */
        fun preview(
            balanceId: String,
            params: BalanceTransactionSchedulePreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> =
            preview(params.toBuilder().balanceId(balanceId).build(), requestOptions)

        /** @see preview */
        fun preview(
            params: BalanceTransactionSchedulePreviewParams
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>> =
            preview(params, RequestOptions.none())

        /** @see preview */
        fun preview(
            params: BalanceTransactionSchedulePreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ScheduleResponse>>
    }
}
