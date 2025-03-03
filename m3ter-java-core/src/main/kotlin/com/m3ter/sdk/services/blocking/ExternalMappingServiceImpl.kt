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
import com.m3ter.sdk.models.ExternalMapping
import com.m3ter.sdk.models.ExternalMappingCreateParams
import com.m3ter.sdk.models.ExternalMappingDeleteParams
import com.m3ter.sdk.models.ExternalMappingListByExternalEntityPage
import com.m3ter.sdk.models.ExternalMappingListByExternalEntityParams
import com.m3ter.sdk.models.ExternalMappingListByM3terEntityPage
import com.m3ter.sdk.models.ExternalMappingListByM3terEntityParams
import com.m3ter.sdk.models.ExternalMappingListPage
import com.m3ter.sdk.models.ExternalMappingListParams
import com.m3ter.sdk.models.ExternalMappingRetrieveParams
import com.m3ter.sdk.models.ExternalMappingUpdateParams

class ExternalMappingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExternalMappingService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ExternalMapping> =
        jsonHandler<ExternalMapping>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Creates a new External Mapping.
     *
     * This endpoint enables you to create a new External Mapping for the specified Organization.
     * You need to supply a request body with the details of the new External Mapping.
     */
    override fun create(
        params: ExternalMappingCreateParams,
        requestOptions: RequestOptions,
    ): ExternalMapping {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "externalmappings")
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

    private val retrieveHandler: Handler<ExternalMapping> =
        jsonHandler<ExternalMapping>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve an External Mapping with the given UUID.
     *
     * This endpoint enables you to retrieve the External Mapping with the specified UUID for a
     * specific Organization.
     */
    override fun retrieve(
        params: ExternalMappingRetrieveParams,
        requestOptions: RequestOptions,
    ): ExternalMapping {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "externalmappings",
                    params.getPathParam(1),
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

    private val updateHandler: Handler<ExternalMapping> =
        jsonHandler<ExternalMapping>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Updates an External Mapping with the given UUID.
     *
     * This endpoint enables you to update an existing External Mapping entity, identified by its
     * UUID. You must supply a request body with the new details for the External Mapping.
     */
    override fun update(
        params: ExternalMappingUpdateParams,
        requestOptions: RequestOptions,
    ): ExternalMapping {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "externalmappings",
                    params.getPathParam(1),
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

    private val listHandler: Handler<ExternalMappingListPage.Response> =
        jsonHandler<ExternalMappingListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve a list of all External Mapping entities.
     *
     * This endpoint retrieves a list of all External Mapping entities for a specific Organization.
     * The list can be paginated for better management, and supports filtering using the external
     * system.
     */
    override fun list(
        params: ExternalMappingListParams,
        requestOptions: RequestOptions,
    ): ExternalMappingListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "externalmappings")
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
            .let { ExternalMappingListPage.of(this, params, it) }
    }

    private val deleteHandler: Handler<ExternalMapping> =
        jsonHandler<ExternalMapping>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete an External Mapping with the given UUID. */
    override fun delete(
        params: ExternalMappingDeleteParams,
        requestOptions: RequestOptions,
    ): ExternalMapping {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "externalmappings",
                    params.getPathParam(1),
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

    private val listByExternalEntityHandler:
        Handler<ExternalMappingListByExternalEntityPage.Response> =
        jsonHandler<ExternalMappingListByExternalEntityPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve a list of External Mapping entities for a specified external system entity.
     *
     * Use this endpoint to retrieve a list of External Mapping entities associated with a specific
     * external system entity. The list can be paginated for easier management.
     */
    override fun listByExternalEntity(
        params: ExternalMappingListByExternalEntityParams,
        requestOptions: RequestOptions,
    ): ExternalMappingListByExternalEntityPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "externalmappings",
                    "externalid",
                    params.getPathParam(1),
                    params.getPathParam(2),
                    params.getPathParam(3),
                )
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listByExternalEntityHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { ExternalMappingListByExternalEntityPage.of(this, params, it) }
    }

    private val listByM3terEntityHandler: Handler<ExternalMappingListByM3terEntityPage.Response> =
        jsonHandler<ExternalMappingListByM3terEntityPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve a list of External Mapping entities for a specified m3ter entity.
     *
     * Use this endpoint to retrieve a list of External Mapping entities associated with a specific
     * m3ter entity. The list can be paginated for easier management.
     */
    override fun listByM3terEntity(
        params: ExternalMappingListByM3terEntityParams,
        requestOptions: RequestOptions,
    ): ExternalMappingListByM3terEntityPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "externalmappings",
                    "external",
                    params.getPathParam(1),
                    params.getPathParam(2),
                )
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listByM3terEntityHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { ExternalMappingListByM3terEntityPage.of(this, params, it) }
    }
}
