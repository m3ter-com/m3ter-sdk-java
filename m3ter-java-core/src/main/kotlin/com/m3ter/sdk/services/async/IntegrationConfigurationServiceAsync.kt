// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.m3ter.sdk.core.RequestOptions
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

interface IntegrationConfigurationServiceAsync {

    /** Set the integration configuration for the entity. */
    @JvmOverloads
    fun create(
        params: IntegrationConfigurationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationConfigurationCreateResponse>

    /**
     * Retrieve the integration configuration for the given UUID.
     *
     * This endpoint retrieves the configuration details of a specific integration within an
     * organization. It is useful for obtaining the settings and parameters of an integration.
     */
    @JvmOverloads
    fun retrieve(
        params: IntegrationConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationConfiguration>

    /**
     * Update the integration configuration for the given UUID.
     *
     * This endpoint allows you to update the configuration of a specific integration within your
     * organization. It is used to modify settings or parameters of an existing integration.
     */
    @JvmOverloads
    fun update(
        params: IntegrationConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationConfigurationUpdateResponse>

    /**
     * List all integration configurations.
     *
     * This endpoint retrieves a list of all integration configurations for the specified
     * Organization. The list can be paginated for easier management.
     */
    @JvmOverloads
    fun list(
        params: IntegrationConfigurationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationConfigurationListPageAsync>

    /**
     * Delete the integration configuration for the given UUID.
     *
     * Use this endpoint to delete the configuration of a specific integration within your
     * organization. It is intended for removing integration settings that are no longer needed.
     */
    @JvmOverloads
    fun delete(
        params: IntegrationConfigurationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationConfigurationDeleteResponse>

    /**
     * Enables a previously disabled integration configuration, allowing it to be operational again.
     */
    @JvmOverloads
    fun enable(
        params: IntegrationConfigurationEnableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationConfigurationEnableResponse>

    /** Retrieve the integration configuration for the entity */
    @JvmOverloads
    fun getByEntity(
        params: IntegrationConfigurationGetByEntityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationConfiguration>
}
