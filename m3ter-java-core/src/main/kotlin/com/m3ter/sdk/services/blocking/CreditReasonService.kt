// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.CreditReasonCreateParams
import com.m3ter.sdk.models.CreditReasonDeleteParams
import com.m3ter.sdk.models.CreditReasonListPage
import com.m3ter.sdk.models.CreditReasonListParams
import com.m3ter.sdk.models.CreditReasonResponse
import com.m3ter.sdk.models.CreditReasonRetrieveParams
import com.m3ter.sdk.models.CreditReasonUpdateParams

interface CreditReasonService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new Credit Reason for your Organization. When you've created a Credit Reason, it
     * becomes available as a credit type for adding Credit line items to Bills. See
     * [Credits](https://www.m3ter.com/docs/api#tag/Credits).
     */
    fun create(params: CreditReasonCreateParams): CreditReasonResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CreditReasonCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditReasonResponse

    /** Retrieve the Credit Reason with the given UUID. */
    fun retrieve(params: CreditReasonRetrieveParams): CreditReasonResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CreditReasonRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditReasonResponse

    /** Update the Credit Reason with the given UUID. */
    fun update(params: CreditReasonUpdateParams): CreditReasonResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CreditReasonUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditReasonResponse

    /**
     * Retrieve a list of the Credit Reason entities created for your Organization. You can filter
     * the list returned for the call by Credit Reason ID, Credit Reason short code, or by Archive
     * status.
     */
    fun list(params: CreditReasonListParams): CreditReasonListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: CreditReasonListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditReasonListPage

    /** Delete the Credit Reason with the given UUID. */
    fun delete(params: CreditReasonDeleteParams): CreditReasonResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CreditReasonDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditReasonResponse

    /**
     * A view of [CreditReasonService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/picklists/creditreasons`,
         * but is otherwise the same as [CreditReasonService.create].
         */
        @MustBeClosed
        fun create(params: CreditReasonCreateParams): HttpResponseFor<CreditReasonResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CreditReasonCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditReasonResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/picklists/creditreasons/{id}`, but is otherwise the same as
         * [CreditReasonService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: CreditReasonRetrieveParams): HttpResponseFor<CreditReasonResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CreditReasonRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditReasonResponse>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/picklists/creditreasons/{id}`, but is otherwise the same as
         * [CreditReasonService.update].
         */
        @MustBeClosed
        fun update(params: CreditReasonUpdateParams): HttpResponseFor<CreditReasonResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CreditReasonUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditReasonResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/picklists/creditreasons`, but
         * is otherwise the same as [CreditReasonService.list].
         */
        @MustBeClosed
        fun list(params: CreditReasonListParams): HttpResponseFor<CreditReasonListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CreditReasonListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditReasonListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/picklists/creditreasons/{id}`, but is otherwise the same as
         * [CreditReasonService.delete].
         */
        @MustBeClosed
        fun delete(params: CreditReasonDeleteParams): HttpResponseFor<CreditReasonResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CreditReasonDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditReasonResponse>
    }
}
