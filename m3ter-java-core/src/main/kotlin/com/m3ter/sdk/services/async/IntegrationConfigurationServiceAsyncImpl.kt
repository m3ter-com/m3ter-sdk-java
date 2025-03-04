// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.handlers.errorHandler
import com.m3ter.sdk.core.handlers.jsonHandler
import com.m3ter.sdk.core.handlers.withErrorHandler
import com.m3ter.sdk.core.http.HttpMethod
import com.m3ter.sdk.core.http.HttpRequest
import com.m3ter.sdk.core.http.HttpResponse.Handler
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.IntegrationConfiguration
import com.m3ter.sdk.models.IntegrationConfigurationCreateParams
import com.m3ter.sdk.models.IntegrationConfigurationCreateResponse
import com.m3ter.sdk.models.IntegrationConfigurationDeleteParams
import com.m3ter.sdk.models.IntegrationConfigurationDeleteResponse
import com.m3ter.sdk.models.IntegrationConfigurationEnableParams
import com.m3ter.sdk.models.IntegrationConfigurationEnableResponse
import com.m3ter.sdk.models.IntegrationConfigurationGetByEntityParams
import com.m3ter.sdk.models.IntegrationConfigurationListPageAsync
import com.m3ter.sdk.models.IntegrationConfigurationListParams
import com.m3ter.sdk.models.IntegrationConfigurationRetrieveParams
import com.m3ter.sdk.models.IntegrationConfigurationUpdateParams
import com.m3ter.sdk.models.IntegrationConfigurationUpdateResponse
import java.util.concurrent.CompletableFuture

class IntegrationConfigurationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    IntegrationConfigurationServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<IntegrationConfigurationCreateResponse> =
        jsonHandler<IntegrationConfigurationCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Set the integration configuration for the entity. */
    override fun create(
        params: IntegrationConfigurationCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationConfigurationCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "integrationconfigs")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<IntegrationConfiguration> =
        jsonHandler<IntegrationConfiguration>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve the integration configuration for the given UUID.
     *
     * This endpoint retrieves the configuration details of a specific integration within an
     * organization. It is useful for obtaining the settings and parameters of an integration.
     */
    override fun retrieve(
        params: IntegrationConfigurationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationConfiguration> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "integrationconfigs",
                    params.getPathParam(1),
                )
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<IntegrationConfigurationUpdateResponse> =
        jsonHandler<IntegrationConfigurationUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Update the integration configuration for the given UUID.
     *
     * This endpoint allows you to update the configuration of a specific integration within your
     * organization. It is used to modify settings or parameters of an existing integration.
     */
    override fun update(
        params: IntegrationConfigurationUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationConfigurationUpdateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "integrationconfigs",
                    params.getPathParam(1),
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<IntegrationConfigurationListPageAsync.Response> =
        jsonHandler<IntegrationConfigurationListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List all integration configurations.
     *
     * This endpoint retrieves a list of all integration configurations for the specified
     * Organization. The list can be paginated for easier management.
     */
    override fun list(
        params: IntegrationConfigurationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationConfigurationListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "integrationconfigs")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { IntegrationConfigurationListPageAsync.of(this, params, it) }
            }
    }

    private val deleteHandler: Handler<IntegrationConfigurationDeleteResponse> =
        jsonHandler<IntegrationConfigurationDeleteResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Delete the integration configuration for the given UUID.
     *
     * Use this endpoint to delete the configuration of a specific integration within your
     * organization. It is intended for removing integration settings that are no longer needed.
     */
    override fun delete(
        params: IntegrationConfigurationDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationConfigurationDeleteResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "integrationconfigs",
                    params.getPathParam(1),
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val enableHandler: Handler<IntegrationConfigurationEnableResponse> =
        jsonHandler<IntegrationConfigurationEnableResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Enables a previously disabled integration configuration, allowing it to be operational again.
     */
    override fun enable(
        params: IntegrationConfigurationEnableParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationConfigurationEnableResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "integrationconfigs",
                    params.getPathParam(1),
                    "enable",
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { enableHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val getByEntityHandler: Handler<IntegrationConfiguration> =
        jsonHandler<IntegrationConfiguration>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve the integration configuration for the entity */
    override fun getByEntity(
        params: IntegrationConfigurationGetByEntityParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationConfiguration> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "integrationconfigs",
                    "entity",
                    params.getPathParam(1),
                )
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { getByEntityHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
