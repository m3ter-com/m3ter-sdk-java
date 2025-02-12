// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.handlers.errorHandler
import com.m3ter.sdk.core.handlers.jsonHandler
import com.m3ter.sdk.core.handlers.withErrorHandler
import com.m3ter.sdk.core.http.HttpMethod
import com.m3ter.sdk.core.http.HttpRequest
import com.m3ter.sdk.core.http.HttpResponse.Handler
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.PlanTemplate
import com.m3ter.sdk.models.PlanTemplateCreateParams
import com.m3ter.sdk.models.PlanTemplateDeleteParams
import com.m3ter.sdk.models.PlanTemplateListParams
import com.m3ter.sdk.models.PlanTemplateListResponse
import com.m3ter.sdk.models.PlanTemplateRetrieveParams
import com.m3ter.sdk.models.PlanTemplateUpdateParams

class PlanTemplateServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : PlanTemplateService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<PlanTemplate> =
        jsonHandler<PlanTemplate>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new PlanTemplate.
     *
     * This endpoint creates a new PlanTemplate within a specific Organization, identified by its
     * unique UUID. The request body should contain the necessary information for the new
     * PlanTemplate.
     */
    override fun create(
        params: PlanTemplateCreateParams,
        requestOptions: RequestOptions
    ): PlanTemplate {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "plantemplates")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<PlanTemplate> =
        jsonHandler<PlanTemplate>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve a specific PlanTemplate.
     *
     * This endpoint allows you to retrieve a specific PlanTemplate within a specific Organization,
     * both identified by their unique identifiers (UUIDs).
     */
    override fun retrieve(
        params: PlanTemplateRetrieveParams,
        requestOptions: RequestOptions
    ): PlanTemplate {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "plantemplates",
                    params.getPathParam(1)
                )
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<PlanTemplate> =
        jsonHandler<PlanTemplate>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

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
    override fun update(
        params: PlanTemplateUpdateParams,
        requestOptions: RequestOptions
    ): PlanTemplate {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "plantemplates",
                    params.getPathParam(1)
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<PlanTemplateListResponse> =
        jsonHandler<PlanTemplateListResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve a list of PlanTemplates.
     *
     * This endpoint enables you to retrieve a paginated list of PlanTemplates belonging to a
     * specific Organization, identified by its UUID. You can filter the list by PlanTemplate IDs or
     * Product IDs for more focused retrieval.
     */
    override fun list(
        params: PlanTemplateListParams,
        requestOptions: RequestOptions
    ): PlanTemplateListResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "plantemplates")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val deleteHandler: Handler<PlanTemplate> =
        jsonHandler<PlanTemplate>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Delete a specific PlanTemplate.
     *
     * This endpoint enables you to delete a specific PlanTemplate within a specific Organization,
     * both identified by their unique identifiers (UUIDs).
     */
    override fun delete(
        params: PlanTemplateDeleteParams,
        requestOptions: RequestOptions
    ): PlanTemplate {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "plantemplates",
                    params.getPathParam(1)
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { deleteHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
