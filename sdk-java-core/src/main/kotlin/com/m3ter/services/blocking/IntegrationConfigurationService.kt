// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.IntegrationConfigurationCreateParams
import com.m3ter.models.IntegrationConfigurationCreateResponse
import com.m3ter.models.IntegrationConfigurationDeleteParams
import com.m3ter.models.IntegrationConfigurationDeleteResponse
import com.m3ter.models.IntegrationConfigurationEnableParams
import com.m3ter.models.IntegrationConfigurationEnableResponse
import com.m3ter.models.IntegrationConfigurationGetByEntityParams
import com.m3ter.models.IntegrationConfigurationListPage
import com.m3ter.models.IntegrationConfigurationListParams
import com.m3ter.models.IntegrationConfigurationResponse
import com.m3ter.models.IntegrationConfigurationRetrieveParams
import com.m3ter.models.IntegrationConfigurationUpdateParams
import com.m3ter.models.IntegrationConfigurationUpdateResponse

interface IntegrationConfigurationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Set the integration configuration for the entity. */
    fun create(
        params: IntegrationConfigurationCreateParams
    ): IntegrationConfigurationCreateResponse = create(params, RequestOptions.none())

    /** @see [create] */
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
    fun retrieve(id: String): IntegrationConfigurationResponse =
        retrieve(id, IntegrationConfigurationRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: IntegrationConfigurationRetrieveParams =
            IntegrationConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationConfigurationResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: IntegrationConfigurationRetrieveParams =
            IntegrationConfigurationRetrieveParams.none(),
    ): IntegrationConfigurationResponse = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: IntegrationConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationConfigurationResponse

    /** @see [retrieve] */
    fun retrieve(params: IntegrationConfigurationRetrieveParams): IntegrationConfigurationResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): IntegrationConfigurationResponse =
        retrieve(id, IntegrationConfigurationRetrieveParams.none(), requestOptions)

    /**
     * Update the integration configuration for the given UUID.
     *
     * This endpoint allows you to update the configuration of a specific integration within your
     * organization. It is used to modify settings or parameters of an existing integration.
     */
    fun update(
        id: String,
        params: IntegrationConfigurationUpdateParams,
    ): IntegrationConfigurationUpdateResponse = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: IntegrationConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationConfigurationUpdateResponse =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: IntegrationConfigurationUpdateParams
    ): IntegrationConfigurationUpdateResponse = update(params, RequestOptions.none())

    /** @see [update] */
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
    fun list(): IntegrationConfigurationListPage = list(IntegrationConfigurationListParams.none())

    /** @see [list] */
    fun list(
        params: IntegrationConfigurationListParams = IntegrationConfigurationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationConfigurationListPage

    /** @see [list] */
    fun list(
        params: IntegrationConfigurationListParams = IntegrationConfigurationListParams.none()
    ): IntegrationConfigurationListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): IntegrationConfigurationListPage =
        list(IntegrationConfigurationListParams.none(), requestOptions)

    /**
     * Delete the integration configuration for the given UUID.
     *
     * Use this endpoint to delete the configuration of a specific integration within your
     * organization. It is intended for removing integration settings that are no longer needed.
     */
    fun delete(id: String): IntegrationConfigurationDeleteResponse =
        delete(id, IntegrationConfigurationDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: IntegrationConfigurationDeleteParams = IntegrationConfigurationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationConfigurationDeleteResponse =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: IntegrationConfigurationDeleteParams = IntegrationConfigurationDeleteParams.none(),
    ): IntegrationConfigurationDeleteResponse = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: IntegrationConfigurationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationConfigurationDeleteResponse

    /** @see [delete] */
    fun delete(
        params: IntegrationConfigurationDeleteParams
    ): IntegrationConfigurationDeleteResponse = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): IntegrationConfigurationDeleteResponse =
        delete(id, IntegrationConfigurationDeleteParams.none(), requestOptions)

    /**
     * Enables a previously disabled integration configuration, allowing it to be operational again.
     */
    fun enable(id: String): IntegrationConfigurationEnableResponse =
        enable(id, IntegrationConfigurationEnableParams.none())

    /** @see [enable] */
    fun enable(
        id: String,
        params: IntegrationConfigurationEnableParams = IntegrationConfigurationEnableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationConfigurationEnableResponse =
        enable(params.toBuilder().id(id).build(), requestOptions)

    /** @see [enable] */
    fun enable(
        id: String,
        params: IntegrationConfigurationEnableParams = IntegrationConfigurationEnableParams.none(),
    ): IntegrationConfigurationEnableResponse = enable(id, params, RequestOptions.none())

    /** @see [enable] */
    fun enable(
        params: IntegrationConfigurationEnableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationConfigurationEnableResponse

    /** @see [enable] */
    fun enable(
        params: IntegrationConfigurationEnableParams
    ): IntegrationConfigurationEnableResponse = enable(params, RequestOptions.none())

    /** @see [enable] */
    fun enable(id: String, requestOptions: RequestOptions): IntegrationConfigurationEnableResponse =
        enable(id, IntegrationConfigurationEnableParams.none(), requestOptions)

    /** Retrieve the integration configuration for the entity */
    fun getByEntity(entityType: String): IntegrationConfigurationResponse =
        getByEntity(entityType, IntegrationConfigurationGetByEntityParams.none())

    /** @see [getByEntity] */
    fun getByEntity(
        entityType: String,
        params: IntegrationConfigurationGetByEntityParams =
            IntegrationConfigurationGetByEntityParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationConfigurationResponse =
        getByEntity(params.toBuilder().entityType(entityType).build(), requestOptions)

    /** @see [getByEntity] */
    fun getByEntity(
        entityType: String,
        params: IntegrationConfigurationGetByEntityParams =
            IntegrationConfigurationGetByEntityParams.none(),
    ): IntegrationConfigurationResponse = getByEntity(entityType, params, RequestOptions.none())

    /** @see [getByEntity] */
    fun getByEntity(
        params: IntegrationConfigurationGetByEntityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntegrationConfigurationResponse

    /** @see [getByEntity] */
    fun getByEntity(
        params: IntegrationConfigurationGetByEntityParams
    ): IntegrationConfigurationResponse = getByEntity(params, RequestOptions.none())

    /** @see [getByEntity] */
    fun getByEntity(
        entityType: String,
        requestOptions: RequestOptions,
    ): IntegrationConfigurationResponse =
        getByEntity(entityType, IntegrationConfigurationGetByEntityParams.none(), requestOptions)

    /**
     * A view of [IntegrationConfigurationService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/integrationconfigs`, but is
         * otherwise the same as [IntegrationConfigurationService.create].
         */
        @MustBeClosed
        fun create(
            params: IntegrationConfigurationCreateParams
        ): HttpResponseFor<IntegrationConfigurationCreateResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: IntegrationConfigurationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationConfigurationCreateResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/integrationconfigs/{id}`, but
         * is otherwise the same as [IntegrationConfigurationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<IntegrationConfigurationResponse> =
            retrieve(id, IntegrationConfigurationRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: IntegrationConfigurationRetrieveParams =
                IntegrationConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationConfigurationResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: IntegrationConfigurationRetrieveParams =
                IntegrationConfigurationRetrieveParams.none(),
        ): HttpResponseFor<IntegrationConfigurationResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: IntegrationConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationConfigurationResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: IntegrationConfigurationRetrieveParams
        ): HttpResponseFor<IntegrationConfigurationResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegrationConfigurationResponse> =
            retrieve(id, IntegrationConfigurationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/integrationconfigs/{id}`, but
         * is otherwise the same as [IntegrationConfigurationService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: IntegrationConfigurationUpdateParams,
        ): HttpResponseFor<IntegrationConfigurationUpdateResponse> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: IntegrationConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationConfigurationUpdateResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: IntegrationConfigurationUpdateParams
        ): HttpResponseFor<IntegrationConfigurationUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: IntegrationConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationConfigurationUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/integrationconfigs`, but is
         * otherwise the same as [IntegrationConfigurationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<IntegrationConfigurationListPage> =
            list(IntegrationConfigurationListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: IntegrationConfigurationListParams = IntegrationConfigurationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationConfigurationListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: IntegrationConfigurationListParams = IntegrationConfigurationListParams.none()
        ): HttpResponseFor<IntegrationConfigurationListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<IntegrationConfigurationListPage> =
            list(IntegrationConfigurationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/integrationconfigs/{id}`,
         * but is otherwise the same as [IntegrationConfigurationService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<IntegrationConfigurationDeleteResponse> =
            delete(id, IntegrationConfigurationDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: IntegrationConfigurationDeleteParams =
                IntegrationConfigurationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationConfigurationDeleteResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: IntegrationConfigurationDeleteParams =
                IntegrationConfigurationDeleteParams.none(),
        ): HttpResponseFor<IntegrationConfigurationDeleteResponse> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: IntegrationConfigurationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationConfigurationDeleteResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: IntegrationConfigurationDeleteParams
        ): HttpResponseFor<IntegrationConfigurationDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegrationConfigurationDeleteResponse> =
            delete(id, IntegrationConfigurationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/integrationconfigs/{id}/enable`, but is otherwise the same as
         * [IntegrationConfigurationService.enable].
         */
        @MustBeClosed
        fun enable(id: String): HttpResponseFor<IntegrationConfigurationEnableResponse> =
            enable(id, IntegrationConfigurationEnableParams.none())

        /** @see [enable] */
        @MustBeClosed
        fun enable(
            id: String,
            params: IntegrationConfigurationEnableParams =
                IntegrationConfigurationEnableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationConfigurationEnableResponse> =
            enable(params.toBuilder().id(id).build(), requestOptions)

        /** @see [enable] */
        @MustBeClosed
        fun enable(
            id: String,
            params: IntegrationConfigurationEnableParams =
                IntegrationConfigurationEnableParams.none(),
        ): HttpResponseFor<IntegrationConfigurationEnableResponse> =
            enable(id, params, RequestOptions.none())

        /** @see [enable] */
        @MustBeClosed
        fun enable(
            params: IntegrationConfigurationEnableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationConfigurationEnableResponse>

        /** @see [enable] */
        @MustBeClosed
        fun enable(
            params: IntegrationConfigurationEnableParams
        ): HttpResponseFor<IntegrationConfigurationEnableResponse> =
            enable(params, RequestOptions.none())

        /** @see [enable] */
        @MustBeClosed
        fun enable(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegrationConfigurationEnableResponse> =
            enable(id, IntegrationConfigurationEnableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/integrationconfigs/entity/{entityType}`, but is otherwise the same
         * as [IntegrationConfigurationService.getByEntity].
         */
        @MustBeClosed
        fun getByEntity(entityType: String): HttpResponseFor<IntegrationConfigurationResponse> =
            getByEntity(entityType, IntegrationConfigurationGetByEntityParams.none())

        /** @see [getByEntity] */
        @MustBeClosed
        fun getByEntity(
            entityType: String,
            params: IntegrationConfigurationGetByEntityParams =
                IntegrationConfigurationGetByEntityParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationConfigurationResponse> =
            getByEntity(params.toBuilder().entityType(entityType).build(), requestOptions)

        /** @see [getByEntity] */
        @MustBeClosed
        fun getByEntity(
            entityType: String,
            params: IntegrationConfigurationGetByEntityParams =
                IntegrationConfigurationGetByEntityParams.none(),
        ): HttpResponseFor<IntegrationConfigurationResponse> =
            getByEntity(entityType, params, RequestOptions.none())

        /** @see [getByEntity] */
        @MustBeClosed
        fun getByEntity(
            params: IntegrationConfigurationGetByEntityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntegrationConfigurationResponse>

        /** @see [getByEntity] */
        @MustBeClosed
        fun getByEntity(
            params: IntegrationConfigurationGetByEntityParams
        ): HttpResponseFor<IntegrationConfigurationResponse> =
            getByEntity(params, RequestOptions.none())

        /** @see [getByEntity] */
        @MustBeClosed
        fun getByEntity(
            entityType: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegrationConfigurationResponse> =
            getByEntity(
                entityType,
                IntegrationConfigurationGetByEntityParams.none(),
                requestOptions,
            )
    }
}
