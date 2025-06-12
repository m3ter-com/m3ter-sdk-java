// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.PlanCreateParams
import com.m3ter.models.PlanDeleteParams
import com.m3ter.models.PlanListPage
import com.m3ter.models.PlanListParams
import com.m3ter.models.PlanResponse
import com.m3ter.models.PlanRetrieveParams
import com.m3ter.models.PlanUpdateParams
import java.util.function.Consumer

interface PlanService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanService

    /** Create a new Plan. */
    fun create(params: PlanCreateParams): PlanResponse = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PlanCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanResponse

    /** Retrieve the Plan with the given UUID. */
    fun retrieve(id: String): PlanResponse = retrieve(id, PlanRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PlanRetrieveParams = PlanRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(id: String, params: PlanRetrieveParams = PlanRetrieveParams.none()): PlanResponse =
        retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanResponse

    /** @see [retrieve] */
    fun retrieve(params: PlanRetrieveParams): PlanResponse = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): PlanResponse =
        retrieve(id, PlanRetrieveParams.none(), requestOptions)

    /**
     * Update the Plan with the given UUID.
     *
     * **Note:** If you have created Custom Fields for a Plan, when you use this endpoint to update
     * the Plan use the `customFields` parameter to preserve those Custom Fields. If you omit them
     * from the update request, they will be lost.
     */
    fun update(id: String, params: PlanUpdateParams): PlanResponse =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: PlanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: PlanUpdateParams): PlanResponse = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PlanUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanResponse

    /** Retrieve a list of Plans that can be filtered by Product, Account, or Plan ID. */
    fun list(): PlanListPage = list(PlanListParams.none())

    /** @see [list] */
    fun list(
        params: PlanListParams = PlanListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanListPage

    /** @see [list] */
    fun list(params: PlanListParams = PlanListParams.none()): PlanListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): PlanListPage =
        list(PlanListParams.none(), requestOptions)

    /** Delete the Plan with the given UUID. */
    fun delete(id: String): PlanResponse = delete(id, PlanDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: PlanDeleteParams = PlanDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(id: String, params: PlanDeleteParams = PlanDeleteParams.none()): PlanResponse =
        delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: PlanDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanResponse

    /** @see [delete] */
    fun delete(params: PlanDeleteParams): PlanResponse = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): PlanResponse =
        delete(id, PlanDeleteParams.none(), requestOptions)

    /** A view of [PlanService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/plans`, but is otherwise the
         * same as [PlanService.create].
         */
        @MustBeClosed
        fun create(params: PlanCreateParams): HttpResponseFor<PlanResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PlanCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plans/{id}`, but is otherwise
         * the same as [PlanService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<PlanResponse> =
            retrieve(id, PlanRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PlanRetrieveParams = PlanRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PlanRetrieveParams = PlanRetrieveParams.none(),
        ): HttpResponseFor<PlanResponse> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: PlanRetrieveParams): HttpResponseFor<PlanResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<PlanResponse> =
            retrieve(id, PlanRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/plans/{id}`, but is otherwise
         * the same as [PlanService.update].
         */
        @MustBeClosed
        fun update(id: String, params: PlanUpdateParams): HttpResponseFor<PlanResponse> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: PlanUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanResponse> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(params: PlanUpdateParams): HttpResponseFor<PlanResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PlanUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plans`, but is otherwise the
         * same as [PlanService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<PlanListPage> = list(PlanListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PlanListParams = PlanListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: PlanListParams = PlanListParams.none()): HttpResponseFor<PlanListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PlanListPage> =
            list(PlanListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/plans/{id}`, but is
         * otherwise the same as [PlanService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<PlanResponse> = delete(id, PlanDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: PlanDeleteParams = PlanDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanResponse> = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: PlanDeleteParams = PlanDeleteParams.none(),
        ): HttpResponseFor<PlanResponse> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: PlanDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: PlanDeleteParams): HttpResponseFor<PlanResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponseFor<PlanResponse> =
            delete(id, PlanDeleteParams.none(), requestOptions)
    }
}
