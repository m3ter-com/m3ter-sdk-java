// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.CreditReasonCreateParams
import com.m3ter.models.CreditReasonDeleteParams
import com.m3ter.models.CreditReasonListPage
import com.m3ter.models.CreditReasonListParams
import com.m3ter.models.CreditReasonResponse
import com.m3ter.models.CreditReasonRetrieveParams
import com.m3ter.models.CreditReasonUpdateParams

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
    fun retrieve(id: String): CreditReasonResponse = retrieve(id, CreditReasonRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: CreditReasonRetrieveParams = CreditReasonRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditReasonResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: CreditReasonRetrieveParams = CreditReasonRetrieveParams.none(),
    ): CreditReasonResponse = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CreditReasonRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditReasonResponse

    /** @see [retrieve] */
    fun retrieve(params: CreditReasonRetrieveParams): CreditReasonResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CreditReasonResponse =
        retrieve(id, CreditReasonRetrieveParams.none(), requestOptions)

    /** Update the Credit Reason with the given UUID. */
    fun update(id: String, params: CreditReasonUpdateParams): CreditReasonResponse =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: CreditReasonUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditReasonResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
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
    fun list(): CreditReasonListPage = list(CreditReasonListParams.none())

    /** @see [list] */
    fun list(
        params: CreditReasonListParams = CreditReasonListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditReasonListPage

    /** @see [list] */
    fun list(params: CreditReasonListParams = CreditReasonListParams.none()): CreditReasonListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CreditReasonListPage =
        list(CreditReasonListParams.none(), requestOptions)

    /** Delete the Credit Reason with the given UUID. */
    fun delete(id: String): CreditReasonResponse = delete(id, CreditReasonDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: CreditReasonDeleteParams = CreditReasonDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditReasonResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: CreditReasonDeleteParams = CreditReasonDeleteParams.none(),
    ): CreditReasonResponse = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: CreditReasonDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CreditReasonResponse

    /** @see [delete] */
    fun delete(params: CreditReasonDeleteParams): CreditReasonResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CreditReasonResponse =
        delete(id, CreditReasonDeleteParams.none(), requestOptions)

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
        fun retrieve(id: String): HttpResponseFor<CreditReasonResponse> =
            retrieve(id, CreditReasonRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CreditReasonRetrieveParams = CreditReasonRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditReasonResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CreditReasonRetrieveParams = CreditReasonRetrieveParams.none(),
        ): HttpResponseFor<CreditReasonResponse> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CreditReasonRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditReasonResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: CreditReasonRetrieveParams): HttpResponseFor<CreditReasonResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditReasonResponse> =
            retrieve(id, CreditReasonRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/picklists/creditreasons/{id}`, but is otherwise the same as
         * [CreditReasonService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: CreditReasonUpdateParams,
        ): HttpResponseFor<CreditReasonResponse> = update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: CreditReasonUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditReasonResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
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
        fun list(): HttpResponseFor<CreditReasonListPage> = list(CreditReasonListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CreditReasonListParams = CreditReasonListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditReasonListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CreditReasonListParams = CreditReasonListParams.none()
        ): HttpResponseFor<CreditReasonListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CreditReasonListPage> =
            list(CreditReasonListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/picklists/creditreasons/{id}`, but is otherwise the same as
         * [CreditReasonService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<CreditReasonResponse> =
            delete(id, CreditReasonDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: CreditReasonDeleteParams = CreditReasonDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditReasonResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: CreditReasonDeleteParams = CreditReasonDeleteParams.none(),
        ): HttpResponseFor<CreditReasonResponse> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: CreditReasonDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CreditReasonResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: CreditReasonDeleteParams): HttpResponseFor<CreditReasonResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditReasonResponse> =
            delete(id, CreditReasonDeleteParams.none(), requestOptions)
    }
}
