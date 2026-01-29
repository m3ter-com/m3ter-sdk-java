// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.balances

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.BalanceChargeScheduleCreateParams
import com.m3ter.models.BalanceChargeScheduleCreateResponse
import com.m3ter.models.BalanceChargeScheduleDeleteParams
import com.m3ter.models.BalanceChargeScheduleDeleteResponse
import com.m3ter.models.BalanceChargeScheduleListPage
import com.m3ter.models.BalanceChargeScheduleListParams
import com.m3ter.models.BalanceChargeSchedulePreviewParams
import com.m3ter.models.BalanceChargeSchedulePreviewResponse
import com.m3ter.models.BalanceChargeScheduleRetrieveParams
import com.m3ter.models.BalanceChargeScheduleRetrieveResponse
import com.m3ter.models.BalanceChargeScheduleUpdateParams
import com.m3ter.models.BalanceChargeScheduleUpdateResponse
import java.util.function.Consumer

interface ChargeScheduleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChargeScheduleService

    /** Create a new BalanceChargeSchedule. */
    fun create(
        balanceId: String,
        params: BalanceChargeScheduleCreateParams,
    ): BalanceChargeScheduleCreateResponse = create(balanceId, params, RequestOptions.none())

    /** @see create */
    fun create(
        balanceId: String,
        params: BalanceChargeScheduleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceChargeScheduleCreateResponse =
        create(params.toBuilder().balanceId(balanceId).build(), requestOptions)

    /** @see create */
    fun create(params: BalanceChargeScheduleCreateParams): BalanceChargeScheduleCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BalanceChargeScheduleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceChargeScheduleCreateResponse

    /** Retrieve a BalanceChargeSchedule for the given UUID. */
    fun retrieve(
        id: String,
        params: BalanceChargeScheduleRetrieveParams,
    ): BalanceChargeScheduleRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BalanceChargeScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceChargeScheduleRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: BalanceChargeScheduleRetrieveParams
    ): BalanceChargeScheduleRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BalanceChargeScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceChargeScheduleRetrieveResponse

    /** Update a BalanceChargeSchedule for the given UUID. */
    fun update(
        id: String,
        params: BalanceChargeScheduleUpdateParams,
    ): BalanceChargeScheduleUpdateResponse = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: BalanceChargeScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceChargeScheduleUpdateResponse =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(params: BalanceChargeScheduleUpdateParams): BalanceChargeScheduleUpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BalanceChargeScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceChargeScheduleUpdateResponse

    /** Retrieve a list of BalanceChargeSchedule entities */
    fun list(balanceId: String): BalanceChargeScheduleListPage =
        list(balanceId, BalanceChargeScheduleListParams.none())

    /** @see list */
    fun list(
        balanceId: String,
        params: BalanceChargeScheduleListParams = BalanceChargeScheduleListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceChargeScheduleListPage =
        list(params.toBuilder().balanceId(balanceId).build(), requestOptions)

    /** @see list */
    fun list(
        balanceId: String,
        params: BalanceChargeScheduleListParams = BalanceChargeScheduleListParams.none(),
    ): BalanceChargeScheduleListPage = list(balanceId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: BalanceChargeScheduleListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceChargeScheduleListPage

    /** @see list */
    fun list(params: BalanceChargeScheduleListParams): BalanceChargeScheduleListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(balanceId: String, requestOptions: RequestOptions): BalanceChargeScheduleListPage =
        list(balanceId, BalanceChargeScheduleListParams.none(), requestOptions)

    /** Delete the BalanceChargeSchedule for the given UUID. */
    fun delete(
        id: String,
        params: BalanceChargeScheduleDeleteParams,
    ): BalanceChargeScheduleDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        params: BalanceChargeScheduleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceChargeScheduleDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(params: BalanceChargeScheduleDeleteParams): BalanceChargeScheduleDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BalanceChargeScheduleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceChargeScheduleDeleteResponse

    /**
     * Previews the Charges this Schedule would create, without persisting them. You can use this
     * call to obtain a preview of the Charges a Schedule you plan to create for a Balance would
     * generate.
     */
    fun preview(
        balanceId: String,
        params: BalanceChargeSchedulePreviewParams,
    ): BalanceChargeSchedulePreviewResponse = preview(balanceId, params, RequestOptions.none())

    /** @see preview */
    fun preview(
        balanceId: String,
        params: BalanceChargeSchedulePreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceChargeSchedulePreviewResponse =
        preview(params.toBuilder().balanceId(balanceId).build(), requestOptions)

    /** @see preview */
    fun preview(params: BalanceChargeSchedulePreviewParams): BalanceChargeSchedulePreviewResponse =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: BalanceChargeSchedulePreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceChargeSchedulePreviewResponse

    /**
     * A view of [ChargeScheduleService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChargeScheduleService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/balances/{balanceId}/balancechargeschedules`, but is otherwise the
         * same as [ChargeScheduleService.create].
         */
        @MustBeClosed
        fun create(
            balanceId: String,
            params: BalanceChargeScheduleCreateParams,
        ): HttpResponseFor<BalanceChargeScheduleCreateResponse> =
            create(balanceId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            balanceId: String,
            params: BalanceChargeScheduleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceChargeScheduleCreateResponse> =
            create(params.toBuilder().balanceId(balanceId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            params: BalanceChargeScheduleCreateParams
        ): HttpResponseFor<BalanceChargeScheduleCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BalanceChargeScheduleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceChargeScheduleCreateResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/balances/{balanceId}/balancechargeschedules/{id}`, but is
         * otherwise the same as [ChargeScheduleService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BalanceChargeScheduleRetrieveParams,
        ): HttpResponseFor<BalanceChargeScheduleRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BalanceChargeScheduleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceChargeScheduleRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BalanceChargeScheduleRetrieveParams
        ): HttpResponseFor<BalanceChargeScheduleRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BalanceChargeScheduleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceChargeScheduleRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/balances/{balanceId}/balancechargeschedules/{id}`, but is
         * otherwise the same as [ChargeScheduleService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: BalanceChargeScheduleUpdateParams,
        ): HttpResponseFor<BalanceChargeScheduleUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: BalanceChargeScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceChargeScheduleUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: BalanceChargeScheduleUpdateParams
        ): HttpResponseFor<BalanceChargeScheduleUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BalanceChargeScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceChargeScheduleUpdateResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/balances/{balanceId}/balancechargeschedules`, but is otherwise the
         * same as [ChargeScheduleService.list].
         */
        @MustBeClosed
        fun list(balanceId: String): HttpResponseFor<BalanceChargeScheduleListPage> =
            list(balanceId, BalanceChargeScheduleListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            balanceId: String,
            params: BalanceChargeScheduleListParams = BalanceChargeScheduleListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceChargeScheduleListPage> =
            list(params.toBuilder().balanceId(balanceId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            balanceId: String,
            params: BalanceChargeScheduleListParams = BalanceChargeScheduleListParams.none(),
        ): HttpResponseFor<BalanceChargeScheduleListPage> =
            list(balanceId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BalanceChargeScheduleListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceChargeScheduleListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BalanceChargeScheduleListParams
        ): HttpResponseFor<BalanceChargeScheduleListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            balanceId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceChargeScheduleListPage> =
            list(balanceId, BalanceChargeScheduleListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/balances/{balanceId}/balancechargeschedules/{id}`, but is
         * otherwise the same as [ChargeScheduleService.delete].
         */
        @MustBeClosed
        fun delete(
            id: String,
            params: BalanceChargeScheduleDeleteParams,
        ): HttpResponseFor<BalanceChargeScheduleDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: BalanceChargeScheduleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceChargeScheduleDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BalanceChargeScheduleDeleteParams
        ): HttpResponseFor<BalanceChargeScheduleDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BalanceChargeScheduleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceChargeScheduleDeleteResponse>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/balances/{balanceId}/balancechargeschedules/preview`, but is
         * otherwise the same as [ChargeScheduleService.preview].
         */
        @MustBeClosed
        fun preview(
            balanceId: String,
            params: BalanceChargeSchedulePreviewParams,
        ): HttpResponseFor<BalanceChargeSchedulePreviewResponse> =
            preview(balanceId, params, RequestOptions.none())

        /** @see preview */
        @MustBeClosed
        fun preview(
            balanceId: String,
            params: BalanceChargeSchedulePreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceChargeSchedulePreviewResponse> =
            preview(params.toBuilder().balanceId(balanceId).build(), requestOptions)

        /** @see preview */
        @MustBeClosed
        fun preview(
            params: BalanceChargeSchedulePreviewParams
        ): HttpResponseFor<BalanceChargeSchedulePreviewResponse> =
            preview(params, RequestOptions.none())

        /** @see preview */
        @MustBeClosed
        fun preview(
            params: BalanceChargeSchedulePreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceChargeSchedulePreviewResponse>
    }
}
