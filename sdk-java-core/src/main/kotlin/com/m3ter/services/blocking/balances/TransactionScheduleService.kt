// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.balances

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.BalanceTransactionScheduleCreateParams
import com.m3ter.models.BalanceTransactionScheduleDeleteParams
import com.m3ter.models.BalanceTransactionScheduleListPage
import com.m3ter.models.BalanceTransactionScheduleListParams
import com.m3ter.models.BalanceTransactionSchedulePreviewParams
import com.m3ter.models.BalanceTransactionScheduleRetrieveParams
import com.m3ter.models.BalanceTransactionScheduleUpdateParams
import com.m3ter.models.ScheduleResponse
import java.util.function.Consumer

interface TransactionScheduleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionScheduleService

    /** Create a new BalanceTransactionSchedule. */
    fun create(
        balanceId: String,
        params: BalanceTransactionScheduleCreateParams,
    ): ScheduleResponse = create(balanceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        balanceId: String,
        params: BalanceTransactionScheduleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleResponse = create(params.toBuilder().balanceId(balanceId).build(), requestOptions)

    /** @see create */
    fun create(params: BalanceTransactionScheduleCreateParams): ScheduleResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BalanceTransactionScheduleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleResponse

    /** Retrieve a BalanceTransactionSchedule for the given UUID. */
    fun retrieve(id: String, params: BalanceTransactionScheduleRetrieveParams): ScheduleResponse =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BalanceTransactionScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: BalanceTransactionScheduleRetrieveParams): ScheduleResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BalanceTransactionScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleResponse

    /** Update a BalanceTransactionSchedule for the given UUID. */
    fun update(id: String, params: BalanceTransactionScheduleUpdateParams): ScheduleResponse =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: BalanceTransactionScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: BalanceTransactionScheduleUpdateParams): ScheduleResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BalanceTransactionScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleResponse

    /** Retrieve a list of BalanceTransactionSchedule entities. */
    fun list(balanceId: String): BalanceTransactionScheduleListPage =
        list(balanceId, BalanceTransactionScheduleListParams.none())

    /** @see list */
    fun list(
        balanceId: String,
        params: BalanceTransactionScheduleListParams = BalanceTransactionScheduleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceTransactionScheduleListPage =
        list(params.toBuilder().balanceId(balanceId).build(), requestOptions)

    /** @see list */
    fun list(
        balanceId: String,
        params: BalanceTransactionScheduleListParams = BalanceTransactionScheduleListParams.none(),
    ): BalanceTransactionScheduleListPage = list(balanceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: BalanceTransactionScheduleListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceTransactionScheduleListPage

    /** @see list */
    fun list(params: BalanceTransactionScheduleListParams): BalanceTransactionScheduleListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        balanceId: String,
        requestOptions: RequestOptions,
    ): BalanceTransactionScheduleListPage =
        list(balanceId, BalanceTransactionScheduleListParams.none(), requestOptions)

    /** Delete the BalanceTransactionSchedule for the given UUID. */
    fun delete(id: String, params: BalanceTransactionScheduleDeleteParams): ScheduleResponse =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: BalanceTransactionScheduleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: BalanceTransactionScheduleDeleteParams): ScheduleResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BalanceTransactionScheduleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleResponse

    /**
     * Previews the BalanceTransactions this Schedule would create, without persisting them. You can
     * use this call to obtain a preview of the Transactions a Schedule you plan to create for a
     * Balance would generate.
     */
    fun preview(
        balanceId: String,
        params: BalanceTransactionSchedulePreviewParams,
    ): ScheduleResponse = preview(balanceId, params, RequestOptions.none())

    /** @see preview */
    fun preview(
        balanceId: String,
        params: BalanceTransactionSchedulePreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleResponse = preview(params.toBuilder().balanceId(balanceId).build(), requestOptions)

    /** @see preview */
    fun preview(params: BalanceTransactionSchedulePreviewParams): ScheduleResponse =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: BalanceTransactionSchedulePreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ScheduleResponse

    /**
     * A view of [TransactionScheduleService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionScheduleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules`, but is
         * otherwise the same as [TransactionScheduleService.create].
         */
        @MustBeClosed
        fun create(
            balanceId: String,
            params: BalanceTransactionScheduleCreateParams,
        ): HttpResponseFor<ScheduleResponse> = create(balanceId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            balanceId: String,
            params: BalanceTransactionScheduleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleResponse> =
            create(params.toBuilder().balanceId(balanceId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: BalanceTransactionScheduleCreateParams
        ): HttpResponseFor<ScheduleResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BalanceTransactionScheduleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules/{id}`, but is
         * otherwise the same as [TransactionScheduleService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BalanceTransactionScheduleRetrieveParams,
        ): HttpResponseFor<ScheduleResponse> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BalanceTransactionScheduleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BalanceTransactionScheduleRetrieveParams
        ): HttpResponseFor<ScheduleResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BalanceTransactionScheduleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleResponse>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules/{id}`, but is
         * otherwise the same as [TransactionScheduleService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: BalanceTransactionScheduleUpdateParams,
        ): HttpResponseFor<ScheduleResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: BalanceTransactionScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: BalanceTransactionScheduleUpdateParams
        ): HttpResponseFor<ScheduleResponse> = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BalanceTransactionScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules`, but is
         * otherwise the same as [TransactionScheduleService.list].
         */
        @MustBeClosed
        fun list(balanceId: String): HttpResponseFor<BalanceTransactionScheduleListPage> =
            list(balanceId, BalanceTransactionScheduleListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            balanceId: String,
            params: BalanceTransactionScheduleListParams =
                BalanceTransactionScheduleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceTransactionScheduleListPage> =
            list(params.toBuilder().balanceId(balanceId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            balanceId: String,
            params: BalanceTransactionScheduleListParams =
                BalanceTransactionScheduleListParams.none(),
        ): HttpResponseFor<BalanceTransactionScheduleListPage> =
            list(balanceId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BalanceTransactionScheduleListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceTransactionScheduleListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BalanceTransactionScheduleListParams
        ): HttpResponseFor<BalanceTransactionScheduleListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            balanceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceTransactionScheduleListPage> =
            list(balanceId, BalanceTransactionScheduleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules/{id}`, but is
         * otherwise the same as [TransactionScheduleService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: BalanceTransactionScheduleDeleteParams,
        ): HttpResponseFor<ScheduleResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: BalanceTransactionScheduleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BalanceTransactionScheduleDeleteParams
        ): HttpResponseFor<ScheduleResponse> = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BalanceTransactionScheduleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleResponse>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules/preview`, but is
         * otherwise the same as [TransactionScheduleService.preview].
         */
        @MustBeClosed
        fun preview(
            balanceId: String,
            params: BalanceTransactionSchedulePreviewParams,
        ): HttpResponseFor<ScheduleResponse> = preview(balanceId, params, RequestOptions.none())

        /** @see preview */
        @MustBeClosed
        fun preview(
            balanceId: String,
            params: BalanceTransactionSchedulePreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleResponse> =
            preview(params.toBuilder().balanceId(balanceId).build(), requestOptions)

        /** @see preview */
        @MustBeClosed
        fun preview(
            params: BalanceTransactionSchedulePreviewParams
        ): HttpResponseFor<ScheduleResponse> = preview(params, RequestOptions.none())

        /** @see preview */
        @MustBeClosed
        fun preview(
            params: BalanceTransactionSchedulePreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ScheduleResponse>
    }
}
