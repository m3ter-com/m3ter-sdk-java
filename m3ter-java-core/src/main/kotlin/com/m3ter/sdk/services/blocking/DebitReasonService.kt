// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.DebitReasonCreateParams
import com.m3ter.sdk.models.DebitReasonDeleteParams
import com.m3ter.sdk.models.DebitReasonListPage
import com.m3ter.sdk.models.DebitReasonListParams
import com.m3ter.sdk.models.DebitReasonResponse
import com.m3ter.sdk.models.DebitReasonRetrieveParams
import com.m3ter.sdk.models.DebitReasonUpdateParams

interface DebitReasonService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new Debit Reason for your Organization. When you've created a Debit Reason, it
     * becomes available as a debit type for adding Debit line items to Bills. See
     * [Debits](https://www.m3ter.com/docs/api#tag/Debits).
     */
    fun create(params: DebitReasonCreateParams): DebitReasonResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: DebitReasonCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DebitReasonResponse

    /** Retrieve the Debit Reason with the given UUID. */
    fun retrieve(params: DebitReasonRetrieveParams): DebitReasonResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DebitReasonRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DebitReasonResponse

    /** Update the Debit Reason with the given UUID. */
    fun update(params: DebitReasonUpdateParams): DebitReasonResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: DebitReasonUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DebitReasonResponse

    /**
     * Retrieve a list of the Debit Reason entities created for your Organization. You can filter
     * the list returned for the call by Debit Reason ID, Debit Reason short code, or by Archive
     * status.
     */
    fun list(params: DebitReasonListParams): DebitReasonListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: DebitReasonListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DebitReasonListPage

    /** Delete the Debit Reason with the given UUID. */
    fun delete(params: DebitReasonDeleteParams): DebitReasonResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: DebitReasonDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DebitReasonResponse

    /**
     * A view of [DebitReasonService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/picklists/debitreasons`, but
         * is otherwise the same as [DebitReasonService.create].
         */
        @MustBeClosed
        fun create(params: DebitReasonCreateParams): HttpResponseFor<DebitReasonResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: DebitReasonCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DebitReasonResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/picklists/debitreasons/{id}`,
         * but is otherwise the same as [DebitReasonService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: DebitReasonRetrieveParams): HttpResponseFor<DebitReasonResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DebitReasonRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DebitReasonResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/picklists/debitreasons/{id}`,
         * but is otherwise the same as [DebitReasonService.update].
         */
        @MustBeClosed
        fun update(params: DebitReasonUpdateParams): HttpResponseFor<DebitReasonResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: DebitReasonUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DebitReasonResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/picklists/debitreasons`, but
         * is otherwise the same as [DebitReasonService.list].
         */
        @MustBeClosed
        fun list(params: DebitReasonListParams): HttpResponseFor<DebitReasonListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DebitReasonListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DebitReasonListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/picklists/debitreasons/{id}`, but is otherwise the same as
         * [DebitReasonService.delete].
         */
        @MustBeClosed
        fun delete(params: DebitReasonDeleteParams): HttpResponseFor<DebitReasonResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: DebitReasonDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DebitReasonResponse>
    }
}
