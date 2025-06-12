// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.PlanTemplateCreateParams
import com.m3ter.models.PlanTemplateDeleteParams
import com.m3ter.models.PlanTemplateListPage
import com.m3ter.models.PlanTemplateListParams
import com.m3ter.models.PlanTemplateResponse
import com.m3ter.models.PlanTemplateRetrieveParams
import com.m3ter.models.PlanTemplateUpdateParams
import java.util.function.Consumer

interface PlanTemplateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanTemplateService

    /**
     * Create a new PlanTemplate.
     *
     * This endpoint creates a new PlanTemplate within a specific Organization, identified by its
     * unique UUID. The request body should contain the necessary information for the new
     * PlanTemplate.
     */
    fun create(params: PlanTemplateCreateParams): PlanTemplateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PlanTemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanTemplateResponse

    /**
     * Retrieve a specific PlanTemplate.
     *
     * This endpoint allows you to retrieve a specific PlanTemplate within a specific Organization,
     * both identified by their unique identifiers (UUIDs).
     */
    fun retrieve(id: String): PlanTemplateResponse = retrieve(id, PlanTemplateRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PlanTemplateRetrieveParams = PlanTemplateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanTemplateResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PlanTemplateRetrieveParams = PlanTemplateRetrieveParams.none(),
    ): PlanTemplateResponse = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PlanTemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanTemplateResponse

    /** @see [retrieve] */
    fun retrieve(params: PlanTemplateRetrieveParams): PlanTemplateResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): PlanTemplateResponse =
        retrieve(id, PlanTemplateRetrieveParams.none(), requestOptions)

    /**
     * Update a specific PlanTemplate.
     *
     * This endpoint enables you to update a specific PlanTemplate within a specific Organization,
     * both identified by their unique identifiers (UUIDs). The request body should contain the
     * updated information for the PlanTemplate.
     *
     * **Note:** If you have created Custom Fields for a Plan Template, when you use this endpoint
     * to update the Plan Template use the `customFields` parameter to preserve those Custom Fields.
     * If you omit them from the update request, they will be lost.
     */
    fun update(id: String, params: PlanTemplateUpdateParams): PlanTemplateResponse =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: PlanTemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanTemplateResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: PlanTemplateUpdateParams): PlanTemplateResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PlanTemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanTemplateResponse

    /**
     * Retrieve a list of PlanTemplates.
     *
     * This endpoint enables you to retrieve a paginated list of PlanTemplates belonging to a
     * specific Organization, identified by its UUID. You can filter the list by PlanTemplate IDs or
     * Product IDs for more focused retrieval.
     */
    fun list(): PlanTemplateListPage = list(PlanTemplateListParams.none())

    /** @see [list] */
    fun list(
        params: PlanTemplateListParams = PlanTemplateListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanTemplateListPage

    /** @see [list] */
    fun list(params: PlanTemplateListParams = PlanTemplateListParams.none()): PlanTemplateListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): PlanTemplateListPage =
        list(PlanTemplateListParams.none(), requestOptions)

    /**
     * Delete a specific PlanTemplate.
     *
     * This endpoint enables you to delete a specific PlanTemplate within a specific Organization,
     * both identified by their unique identifiers (UUIDs).
     */
    fun delete(id: String): PlanTemplateResponse = delete(id, PlanTemplateDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: PlanTemplateDeleteParams = PlanTemplateDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanTemplateResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: PlanTemplateDeleteParams = PlanTemplateDeleteParams.none(),
    ): PlanTemplateResponse = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: PlanTemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlanTemplateResponse

    /** @see [delete] */
    fun delete(params: PlanTemplateDeleteParams): PlanTemplateResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): PlanTemplateResponse =
        delete(id, PlanTemplateDeleteParams.none(), requestOptions)

    /**
     * A view of [PlanTemplateService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlanTemplateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/plantemplates`, but is
         * otherwise the same as [PlanTemplateService.create].
         */
        @MustBeClosed
        fun create(params: PlanTemplateCreateParams): HttpResponseFor<PlanTemplateResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PlanTemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanTemplateResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plantemplates/{id}`, but is
         * otherwise the same as [PlanTemplateService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<PlanTemplateResponse> =
            retrieve(id, PlanTemplateRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PlanTemplateRetrieveParams = PlanTemplateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanTemplateResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PlanTemplateRetrieveParams = PlanTemplateRetrieveParams.none(),
        ): HttpResponseFor<PlanTemplateResponse> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PlanTemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanTemplateResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: PlanTemplateRetrieveParams): HttpResponseFor<PlanTemplateResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanTemplateResponse> =
            retrieve(id, PlanTemplateRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/plantemplates/{id}`, but is
         * otherwise the same as [PlanTemplateService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: PlanTemplateUpdateParams,
        ): HttpResponseFor<PlanTemplateResponse> = update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: PlanTemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanTemplateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(params: PlanTemplateUpdateParams): HttpResponseFor<PlanTemplateResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PlanTemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanTemplateResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plantemplates`, but is
         * otherwise the same as [PlanTemplateService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PlanTemplateListPage> = list(PlanTemplateListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PlanTemplateListParams = PlanTemplateListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanTemplateListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PlanTemplateListParams = PlanTemplateListParams.none()
        ): HttpResponseFor<PlanTemplateListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PlanTemplateListPage> =
            list(PlanTemplateListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/plantemplates/{id}`, but
         * is otherwise the same as [PlanTemplateService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<PlanTemplateResponse> =
            delete(id, PlanTemplateDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: PlanTemplateDeleteParams = PlanTemplateDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanTemplateResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: PlanTemplateDeleteParams = PlanTemplateDeleteParams.none(),
        ): HttpResponseFor<PlanTemplateResponse> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: PlanTemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlanTemplateResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(params: PlanTemplateDeleteParams): HttpResponseFor<PlanTemplateResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanTemplateResponse> =
            delete(id, PlanTemplateDeleteParams.none(), requestOptions)
    }
}
