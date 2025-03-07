// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.PlanTemplateCreateParams
import com.m3ter.sdk.models.PlanTemplateDeleteParams
import com.m3ter.sdk.models.PlanTemplateListPageAsync
import com.m3ter.sdk.models.PlanTemplateListParams
import com.m3ter.sdk.models.PlanTemplateResponse
import com.m3ter.sdk.models.PlanTemplateRetrieveParams
import com.m3ter.sdk.models.PlanTemplateUpdateParams
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
    @JvmOverloads
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
    @JvmOverloads
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
    @JvmOverloads
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
    @JvmOverloads
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
    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: PlanTemplateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanTemplateResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plantemplates/{id}`, but is
         * otherwise the same as [PlanTemplateServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: PlanTemplateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanTemplateResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/plantemplates/{id}`, but is
         * otherwise the same as [PlanTemplateServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: PlanTemplateUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanTemplateResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/plantemplates`, but is
         * otherwise the same as [PlanTemplateServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: PlanTemplateListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanTemplateListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/plantemplates/{id}`, but
         * is otherwise the same as [PlanTemplateServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: PlanTemplateDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PlanTemplateResponse>>
    }
}
