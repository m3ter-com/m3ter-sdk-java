// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.PlanGroupLinkCreateParams
import com.m3ter.models.PlanGroupLinkDeleteParams
import com.m3ter.models.PlanGroupLinkListPage
import com.m3ter.models.PlanGroupLinkListParams
import com.m3ter.models.PlanGroupLinkResponse
import com.m3ter.models.PlanGroupLinkRetrieveParams
import com.m3ter.models.PlanGroupLinkUpdateParams

interface PlanGroupLinkService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a new PlanGroupLink. */
    fun create(params: PlanGroupLinkCreateParams): PlanGroupLinkResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PlanGroupLinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupLinkResponse

    /** Retrieve a PlanGroupLink for the given UUID. */
    fun retrieve(id: String): PlanGroupLinkResponse =
        retrieve(id, PlanGroupLinkRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PlanGroupLinkRetrieveParams = PlanGroupLinkRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupLinkResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PlanGroupLinkRetrieveParams = PlanGroupLinkRetrieveParams.none(),
    ): PlanGroupLinkResponse = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PlanGroupLinkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupLinkResponse

    /** @see [retrieve] */
    fun retrieve(params: PlanGroupLinkRetrieveParams): PlanGroupLinkResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): PlanGroupLinkResponse =
        retrieve(id, PlanGroupLinkRetrieveParams.none(), requestOptions)

    /** Update PlanGroupLink for the given UUID. */
    fun update(id: String, params: PlanGroupLinkUpdateParams): PlanGroupLinkResponse =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: PlanGroupLinkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupLinkResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: PlanGroupLinkUpdateParams): PlanGroupLinkResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PlanGroupLinkUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupLinkResponse

    /** Retrieve a list of PlanGroupLink entities */
    fun list(): PlanGroupLinkListPage = list(PlanGroupLinkListParams.none())

    /** @see [list] */
    fun list(
        params: PlanGroupLinkListParams = PlanGroupLinkListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupLinkListPage

    /** @see [list] */
    fun list(
        params: PlanGroupLinkListParams = PlanGroupLinkListParams.none()
    ): PlanGroupLinkListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): PlanGroupLinkListPage =
        list(PlanGroupLinkListParams.none(), requestOptions)

    /** Delete a PlanGroupLink for the given UUID. */
    fun delete(id: String): PlanGroupLinkResponse = delete(id, PlanGroupLinkDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: PlanGroupLinkDeleteParams = PlanGroupLinkDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupLinkResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: PlanGroupLinkDeleteParams = PlanGroupLinkDeleteParams.none(),
    ): PlanGroupLinkResponse = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: PlanGroupLinkDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanGroupLinkResponse

    /** @see [delete] */
    fun delete(params: PlanGroupLinkDeleteParams): PlanGroupLinkResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): PlanGroupLinkResponse =
        delete(id, PlanGroupLinkDeleteParams.none(), requestOptions)

    /**
     * A view of [PlanGroupLinkService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/plangrouplinks`, but is
         * otherwise the same as [PlanGroupLinkService.create].
         */
        @MustBeClosed
        fun create(params: PlanGroupLinkCreateParams): HttpResponseFor<PlanGroupLinkResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PlanGroupLinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupLinkResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plangrouplinks/{id}`, but is
         * otherwise the same as [PlanGroupLinkService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<PlanGroupLinkResponse> =
            retrieve(id, PlanGroupLinkRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PlanGroupLinkRetrieveParams = PlanGroupLinkRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupLinkResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PlanGroupLinkRetrieveParams = PlanGroupLinkRetrieveParams.none(),
        ): HttpResponseFor<PlanGroupLinkResponse> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PlanGroupLinkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupLinkResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: PlanGroupLinkRetrieveParams): HttpResponseFor<PlanGroupLinkResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroupLinkResponse> =
            retrieve(id, PlanGroupLinkRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/plangrouplinks/{id}`, but is
         * otherwise the same as [PlanGroupLinkService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: PlanGroupLinkUpdateParams,
        ): HttpResponseFor<PlanGroupLinkResponse> = update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: PlanGroupLinkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupLinkResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(params: PlanGroupLinkUpdateParams): HttpResponseFor<PlanGroupLinkResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PlanGroupLinkUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupLinkResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plangrouplinks`, but is
         * otherwise the same as [PlanGroupLinkService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PlanGroupLinkListPage> = list(PlanGroupLinkListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PlanGroupLinkListParams = PlanGroupLinkListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupLinkListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PlanGroupLinkListParams = PlanGroupLinkListParams.none()
        ): HttpResponseFor<PlanGroupLinkListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PlanGroupLinkListPage> =
            list(PlanGroupLinkListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/plangrouplinks/{id}`, but
         * is otherwise the same as [PlanGroupLinkService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<PlanGroupLinkResponse> =
            delete(id, PlanGroupLinkDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: PlanGroupLinkDeleteParams = PlanGroupLinkDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupLinkResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: PlanGroupLinkDeleteParams = PlanGroupLinkDeleteParams.none(),
        ): HttpResponseFor<PlanGroupLinkResponse> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: PlanGroupLinkDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanGroupLinkResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: PlanGroupLinkDeleteParams): HttpResponseFor<PlanGroupLinkResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroupLinkResponse> =
            delete(id, PlanGroupLinkDeleteParams.none(), requestOptions)
    }
}
