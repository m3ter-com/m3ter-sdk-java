// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.PlanTemplateCreateParams
import com.m3ter.models.PlanTemplateDeleteParams
import com.m3ter.models.PlanTemplateListPageAsync
import com.m3ter.models.PlanTemplateListParams
import com.m3ter.models.PlanTemplateResponse
import com.m3ter.models.PlanTemplateRetrieveParams
import com.m3ter.models.PlanTemplateUpdateParams
import java.util.concurrent.CompletableFuture

interface PlanTemplateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new PlanTemplate.
     *
     * This endpoint creates a new PlanTemplate within a specific Organization, identified by its
     * unique UUID. The request body should contain the necessary information for the new
     * PlanTemplate.
     */
    fun create(params: PlanTemplateCreateParams): CompletableFuture<PlanTemplateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PlanTemplateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanTemplateResponse>

    /**
     * Retrieve a specific PlanTemplate.
     *
     * This endpoint allows you to retrieve a specific PlanTemplate within a specific Organization,
     * both identified by their unique identifiers (UUIDs).
     */
    fun retrieve(params: PlanTemplateRetrieveParams): CompletableFuture<PlanTemplateResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PlanTemplateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanTemplateResponse>

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
    fun update(params: PlanTemplateUpdateParams): CompletableFuture<PlanTemplateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PlanTemplateUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanTemplateResponse>

    /**
     * Retrieve a list of PlanTemplates.
     *
     * This endpoint enables you to retrieve a paginated list of PlanTemplates belonging to a
     * specific Organization, identified by its UUID. You can filter the list by PlanTemplate IDs or
     * Product IDs for more focused retrieval.
     */
    fun list(params: PlanTemplateListParams): CompletableFuture<PlanTemplateListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: PlanTemplateListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanTemplateListPageAsync>

    /**
     * Delete a specific PlanTemplate.
     *
     * This endpoint enables you to delete a specific PlanTemplate within a specific Organization,
     * both identified by their unique identifiers (UUIDs).
     */
    fun delete(params: PlanTemplateDeleteParams): CompletableFuture<PlanTemplateResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: PlanTemplateDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PlanTemplateResponse>

    /**
     * A view of [PlanTemplateServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/plantemplates`, but is
         * otherwise the same as [PlanTemplateServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: PlanTemplateCreateParams
        ): CompletableFuture<HttpResponseFor<PlanTemplateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PlanTemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanTemplateResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plantemplates/{id}`, but is
         * otherwise the same as [PlanTemplateServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: PlanTemplateRetrieveParams
        ): CompletableFuture<HttpResponseFor<PlanTemplateResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PlanTemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanTemplateResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/plantemplates/{id}`, but is
         * otherwise the same as [PlanTemplateServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: PlanTemplateUpdateParams
        ): CompletableFuture<HttpResponseFor<PlanTemplateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PlanTemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanTemplateResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plantemplates`, but is
         * otherwise the same as [PlanTemplateServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: PlanTemplateListParams
        ): CompletableFuture<HttpResponseFor<PlanTemplateListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PlanTemplateListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanTemplateListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/plantemplates/{id}`, but
         * is otherwise the same as [PlanTemplateServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: PlanTemplateDeleteParams
        ): CompletableFuture<HttpResponseFor<PlanTemplateResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: PlanTemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanTemplateResponse>>
    }
}
