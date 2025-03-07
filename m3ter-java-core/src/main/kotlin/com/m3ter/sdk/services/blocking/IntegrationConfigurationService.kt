// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.IntegrationConfigurationCreateParams
import com.m3ter.sdk.models.IntegrationConfigurationCreateResponse
import com.m3ter.sdk.models.IntegrationConfigurationDeleteParams
import com.m3ter.sdk.models.IntegrationConfigurationDeleteResponse
import com.m3ter.sdk.models.IntegrationConfigurationEnableParams
import com.m3ter.sdk.models.IntegrationConfigurationEnableResponse
import com.m3ter.sdk.models.IntegrationConfigurationGetByEntityParams
import com.m3ter.sdk.models.IntegrationConfigurationListPage
import com.m3ter.sdk.models.IntegrationConfigurationListParams
import com.m3ter.sdk.models.IntegrationConfigurationResponse
import com.m3ter.sdk.models.IntegrationConfigurationRetrieveParams
import com.m3ter.sdk.models.IntegrationConfigurationUpdateParams
import com.m3ter.sdk.models.IntegrationConfigurationUpdateResponse

interface IntegrationConfigurationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Set the integration configuration for the entity. */
    @JvmOverloads
    fun create(
        params: IntegrationConfigurationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationConfigurationCreateResponse

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
    ): IntegrationConfigurationResponse

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
    ): IntegrationConfigurationUpdateResponse

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
    ): IntegrationConfigurationListPage

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
    ): IntegrationConfigurationDeleteResponse

    /**
     * Enables a previously disabled integration configuration, allowing it to be operational again.
     */
    @JvmOverloads
    fun enable(
        params: IntegrationConfigurationEnableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationConfigurationEnableResponse

    /** Retrieve the integration configuration for the entity */
    @JvmOverloads
    fun getByEntity(
        params: IntegrationConfigurationGetByEntityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationConfigurationResponse

    /**
     * A view of [IntegrationConfigurationService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/integrationconfigs`, but is
         * otherwise the same as [IntegrationConfigurationService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: IntegrationConfigurationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationConfigurationCreateResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/integrationconfigs/{id}`, but
         * is otherwise the same as [IntegrationConfigurationService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: IntegrationConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationConfigurationResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/integrationconfigs/{id}`, but
         * is otherwise the same as [IntegrationConfigurationService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: IntegrationConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationConfigurationUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/integrationconfigs`, but is
         * otherwise the same as [IntegrationConfigurationService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: IntegrationConfigurationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationConfigurationListPage>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/integrationconfigs/{id}`,
         * but is otherwise the same as [IntegrationConfigurationService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: IntegrationConfigurationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationConfigurationDeleteResponse>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/integrationconfigs/{id}/enable`, but is otherwise the same as
         * [IntegrationConfigurationService.enable].
         */
        @JvmOverloads
        @MustBeClosed
        fun enable(
            params: IntegrationConfigurationEnableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationConfigurationEnableResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/integrationconfigs/entity/{entityType}`, but is otherwise the same
         * as [IntegrationConfigurationService.getByEntity].
         */
        @JvmOverloads
        @MustBeClosed
        fun getByEntity(
            params: IntegrationConfigurationGetByEntityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationConfigurationResponse>
    }
}
