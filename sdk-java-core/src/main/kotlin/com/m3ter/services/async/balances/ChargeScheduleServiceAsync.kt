// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.balances

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.BalanceChargeScheduleCreateParams
import com.m3ter.models.BalanceChargeScheduleCreateResponse
import com.m3ter.models.BalanceChargeScheduleDeleteParams
import com.m3ter.models.BalanceChargeScheduleDeleteResponse
import com.m3ter.models.BalanceChargeScheduleListPageAsync
import com.m3ter.models.BalanceChargeScheduleListParams
import com.m3ter.models.BalanceChargeSchedulePreviewParams
import com.m3ter.models.BalanceChargeSchedulePreviewResponse
import com.m3ter.models.BalanceChargeScheduleRetrieveParams
import com.m3ter.models.BalanceChargeScheduleRetrieveResponse
import com.m3ter.models.BalanceChargeScheduleUpdateParams
import com.m3ter.models.BalanceChargeScheduleUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ChargeScheduleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChargeScheduleServiceAsync

    /** Create a new BalanceChargeSchedule. */
    fun create(
        balanceId: String,
        params: BalanceChargeScheduleCreateParams,
    ): CompletableFuture<BalanceChargeScheduleCreateResponse> =
        create(balanceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        balanceId: String,
        params: BalanceChargeScheduleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceChargeScheduleCreateResponse> =
        create(params.toBuilder().balanceId(balanceId).build(), requestOptions)

    /** @see create */
    fun create(
        params: BalanceChargeScheduleCreateParams
    ): CompletableFuture<BalanceChargeScheduleCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BalanceChargeScheduleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceChargeScheduleCreateResponse>

    /** Retrieve a BalanceChargeSchedule for the given UUID. */
    fun retrieve(
        id: String,
        params: BalanceChargeScheduleRetrieveParams,
    ): CompletableFuture<BalanceChargeScheduleRetrieveResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BalanceChargeScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceChargeScheduleRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: BalanceChargeScheduleRetrieveParams
    ): CompletableFuture<BalanceChargeScheduleRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BalanceChargeScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceChargeScheduleRetrieveResponse>

    /** Update a BalanceChargeSchedule for the given UUID. */
    fun update(
        id: String,
        params: BalanceChargeScheduleUpdateParams,
    ): CompletableFuture<BalanceChargeScheduleUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: BalanceChargeScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceChargeScheduleUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: BalanceChargeScheduleUpdateParams
    ): CompletableFuture<BalanceChargeScheduleUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BalanceChargeScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceChargeScheduleUpdateResponse>

    /** Retrieve a list of BalanceChargeSchedule entities */
    fun list(balanceId: String): CompletableFuture<BalanceChargeScheduleListPageAsync> =
        list(balanceId, BalanceChargeScheduleListParams.none())

    /** @see list */
    fun list(
        balanceId: String,
        params: BalanceChargeScheduleListParams = BalanceChargeScheduleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceChargeScheduleListPageAsync> =
        list(params.toBuilder().balanceId(balanceId).build(), requestOptions)

    /** @see list */
    fun list(
        balanceId: String,
        params: BalanceChargeScheduleListParams = BalanceChargeScheduleListParams.none(),
    ): CompletableFuture<BalanceChargeScheduleListPageAsync> =
        list(balanceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: BalanceChargeScheduleListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceChargeScheduleListPageAsync>

    /** @see list */
    fun list(
        params: BalanceChargeScheduleListParams
    ): CompletableFuture<BalanceChargeScheduleListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        balanceId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceChargeScheduleListPageAsync> =
        list(balanceId, BalanceChargeScheduleListParams.none(), requestOptions)

    /** Delete the BalanceChargeSchedule for the given UUID. */
    fun delete(
        id: String,
        params: BalanceChargeScheduleDeleteParams,
    ): CompletableFuture<BalanceChargeScheduleDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: BalanceChargeScheduleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceChargeScheduleDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: BalanceChargeScheduleDeleteParams
    ): CompletableFuture<BalanceChargeScheduleDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BalanceChargeScheduleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceChargeScheduleDeleteResponse>

    /**
     * Previews the Charges this Schedule would create, without persisting them. You can use this
     * call to obtain a preview of the Charges a Schedule you plan to create for a Balance would
     * generate.
     */
    fun preview(
        balanceId: String,
        params: BalanceChargeSchedulePreviewParams,
    ): CompletableFuture<BalanceChargeSchedulePreviewResponse> =
        preview(balanceId, params, RequestOptions.none())

    /** @see preview */
    fun preview(
        balanceId: String,
        params: BalanceChargeSchedulePreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceChargeSchedulePreviewResponse> =
        preview(params.toBuilder().balanceId(balanceId).build(), requestOptions)

    /** @see preview */
    fun preview(
        params: BalanceChargeSchedulePreviewParams
    ): CompletableFuture<BalanceChargeSchedulePreviewResponse> =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: BalanceChargeSchedulePreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceChargeSchedulePreviewResponse>

    /**
     * A view of [ChargeScheduleServiceAsync] that provides access to raw HTTP responses for each
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
        ): ChargeScheduleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/balances/{balanceId}/balancechargeschedules`, but is otherwise the
         * same as [ChargeScheduleServiceAsync.create].
         */
        fun create(
            balanceId: String,
            params: BalanceChargeScheduleCreateParams,
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleCreateResponse>> =
            create(balanceId, params, RequestOptions.none())

        /** @see create */
        fun create(
            balanceId: String,
            params: BalanceChargeScheduleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleCreateResponse>> =
            create(params.toBuilder().balanceId(balanceId).build(), requestOptions)

        /** @see create */
        fun create(
            params: BalanceChargeScheduleCreateParams
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BalanceChargeScheduleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleCreateResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/balances/{balanceId}/balancechargeschedules/{id}`, but is
         * otherwise the same as [ChargeScheduleServiceAsync.retrieve].
         */
        fun retrieve(
            id: String,
            params: BalanceChargeScheduleRetrieveParams,
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BalanceChargeScheduleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: BalanceChargeScheduleRetrieveParams
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BalanceChargeScheduleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/balances/{balanceId}/balancechargeschedules/{id}`, but is
         * otherwise the same as [ChargeScheduleServiceAsync.update].
         */
        fun update(
            id: String,
            params: BalanceChargeScheduleUpdateParams,
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: BalanceChargeScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: BalanceChargeScheduleUpdateParams
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BalanceChargeScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/balances/{balanceId}/balancechargeschedules`, but is otherwise the
         * same as [ChargeScheduleServiceAsync.list].
         */
        fun list(
            balanceId: String
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleListPageAsync>> =
            list(balanceId, BalanceChargeScheduleListParams.none())

        /** @see list */
        fun list(
            balanceId: String,
            params: BalanceChargeScheduleListParams = BalanceChargeScheduleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleListPageAsync>> =
            list(params.toBuilder().balanceId(balanceId).build(), requestOptions)

        /** @see list */
        fun list(
            balanceId: String,
            params: BalanceChargeScheduleListParams = BalanceChargeScheduleListParams.none(),
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleListPageAsync>> =
            list(balanceId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: BalanceChargeScheduleListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleListPageAsync>>

        /** @see list */
        fun list(
            params: BalanceChargeScheduleListParams
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            balanceId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleListPageAsync>> =
            list(balanceId, BalanceChargeScheduleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/balances/{balanceId}/balancechargeschedules/{id}`, but is
         * otherwise the same as [ChargeScheduleServiceAsync.delete].
         */
        fun delete(
            id: String,
            params: BalanceChargeScheduleDeleteParams,
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            params: BalanceChargeScheduleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: BalanceChargeScheduleDeleteParams
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BalanceChargeScheduleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceChargeScheduleDeleteResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/balances/{balanceId}/balancechargeschedules/preview`, but is
         * otherwise the same as [ChargeScheduleServiceAsync.preview].
         */
        fun preview(
            balanceId: String,
            params: BalanceChargeSchedulePreviewParams,
        ): CompletableFuture<HttpResponseFor<BalanceChargeSchedulePreviewResponse>> =
            preview(balanceId, params, RequestOptions.none())

        /** @see preview */
        fun preview(
            balanceId: String,
            params: BalanceChargeSchedulePreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceChargeSchedulePreviewResponse>> =
            preview(params.toBuilder().balanceId(balanceId).build(), requestOptions)

        /** @see preview */
        fun preview(
            params: BalanceChargeSchedulePreviewParams
        ): CompletableFuture<HttpResponseFor<BalanceChargeSchedulePreviewResponse>> =
            preview(params, RequestOptions.none())

        /** @see preview */
        fun preview(
            params: BalanceChargeSchedulePreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceChargeSchedulePreviewResponse>>
    }
}
