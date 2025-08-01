// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.IntegrationConfigurationCreateParams
import com.m3ter.models.IntegrationConfigurationCreateResponse
import com.m3ter.models.IntegrationConfigurationDeleteParams
import com.m3ter.models.IntegrationConfigurationDeleteResponse
import com.m3ter.models.IntegrationConfigurationEnableParams
import com.m3ter.models.IntegrationConfigurationEnableResponse
import com.m3ter.models.IntegrationConfigurationGetByEntityParams
import com.m3ter.models.IntegrationConfigurationListPageAsync
import com.m3ter.models.IntegrationConfigurationListParams
import com.m3ter.models.IntegrationConfigurationResponse
import com.m3ter.models.IntegrationConfigurationRetrieveParams
import com.m3ter.models.IntegrationConfigurationUpdateParams
import com.m3ter.models.IntegrationConfigurationUpdateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IntegrationConfigurationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntegrationConfigurationServiceAsync

    /** Set the integration configuration for the entity. */
    fun create(
        params: IntegrationConfigurationCreateParams
    ): CompletableFuture<IntegrationConfigurationCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
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
    fun retrieve(id: String): CompletableFuture<IntegrationConfigurationResponse> =
        retrieve(id, IntegrationConfigurationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: IntegrationConfigurationRetrieveParams =
            IntegrationConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationConfigurationResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: IntegrationConfigurationRetrieveParams =
            IntegrationConfigurationRetrieveParams.none(),
    ): CompletableFuture<IntegrationConfigurationResponse> =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: IntegrationConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationConfigurationResponse>

    /** @see retrieve */
    fun retrieve(
        params: IntegrationConfigurationRetrieveParams
    ): CompletableFuture<IntegrationConfigurationResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationConfigurationResponse> =
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
    ): CompletableFuture<IntegrationConfigurationUpdateResponse> =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        id: String,
        params: IntegrationConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationConfigurationUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        params: IntegrationConfigurationUpdateParams
    ): CompletableFuture<IntegrationConfigurationUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
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
    fun list(): CompletableFuture<IntegrationConfigurationListPageAsync> =
        list(IntegrationConfigurationListParams.none())

    /** @see list */
    fun list(
        params: IntegrationConfigurationListParams = IntegrationConfigurationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationConfigurationListPageAsync>

    /** @see list */
    fun list(
        params: IntegrationConfigurationListParams = IntegrationConfigurationListParams.none()
    ): CompletableFuture<IntegrationConfigurationListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<IntegrationConfigurationListPageAsync> =
        list(IntegrationConfigurationListParams.none(), requestOptions)

    /**
     * Delete the integration configuration for the given UUID.
     *
     * Use this endpoint to delete the configuration of a specific integration within your
     * organization. It is intended for removing integration settings that are no longer needed.
     */
    fun delete(id: String): CompletableFuture<IntegrationConfigurationDeleteResponse> =
        delete(id, IntegrationConfigurationDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: IntegrationConfigurationDeleteParams = IntegrationConfigurationDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationConfigurationDeleteResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: IntegrationConfigurationDeleteParams = IntegrationConfigurationDeleteParams.none(),
    ): CompletableFuture<IntegrationConfigurationDeleteResponse> =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: IntegrationConfigurationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationConfigurationDeleteResponse>

    /** @see delete */
    fun delete(
        params: IntegrationConfigurationDeleteParams
    ): CompletableFuture<IntegrationConfigurationDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationConfigurationDeleteResponse> =
        delete(id, IntegrationConfigurationDeleteParams.none(), requestOptions)

    /**
     * Enables a previously disabled integration configuration, allowing it to be operational again.
     */
    fun enable(id: String): CompletableFuture<IntegrationConfigurationEnableResponse> =
        enable(id, IntegrationConfigurationEnableParams.none())

    /** @see enable */
    fun enable(
        id: String,
        params: IntegrationConfigurationEnableParams = IntegrationConfigurationEnableParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationConfigurationEnableResponse> =
        enable(params.toBuilder().id(id).build(), requestOptions)

    /** @see enable */
    fun enable(
        id: String,
        params: IntegrationConfigurationEnableParams = IntegrationConfigurationEnableParams.none(),
    ): CompletableFuture<IntegrationConfigurationEnableResponse> =
        enable(id, params, RequestOptions.none())

    /** @see enable */
    fun enable(
        params: IntegrationConfigurationEnableParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationConfigurationEnableResponse>

    /** @see enable */
    fun enable(
        params: IntegrationConfigurationEnableParams
    ): CompletableFuture<IntegrationConfigurationEnableResponse> =
        enable(params, RequestOptions.none())

    /** @see enable */
    fun enable(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationConfigurationEnableResponse> =
        enable(id, IntegrationConfigurationEnableParams.none(), requestOptions)

    /** Retrieve the integration configuration for the entity */
    fun getByEntity(entityType: String): CompletableFuture<IntegrationConfigurationResponse> =
        getByEntity(entityType, IntegrationConfigurationGetByEntityParams.none())

    /** @see getByEntity */
    fun getByEntity(
        entityType: String,
        params: IntegrationConfigurationGetByEntityParams =
            IntegrationConfigurationGetByEntityParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationConfigurationResponse> =
        getByEntity(params.toBuilder().entityType(entityType).build(), requestOptions)

    /** @see getByEntity */
    fun getByEntity(
        entityType: String,
        params: IntegrationConfigurationGetByEntityParams =
            IntegrationConfigurationGetByEntityParams.none(),
    ): CompletableFuture<IntegrationConfigurationResponse> =
        getByEntity(entityType, params, RequestOptions.none())

    /** @see getByEntity */
    fun getByEntity(
        params: IntegrationConfigurationGetByEntityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegrationConfigurationResponse>

    /** @see getByEntity */
    fun getByEntity(
        params: IntegrationConfigurationGetByEntityParams
    ): CompletableFuture<IntegrationConfigurationResponse> =
        getByEntity(params, RequestOptions.none())

    /** @see getByEntity */
    fun getByEntity(
        entityType: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegrationConfigurationResponse> =
        getByEntity(entityType, IntegrationConfigurationGetByEntityParams.none(), requestOptions)

    /**
     * A view of [IntegrationConfigurationServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntegrationConfigurationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/integrationconfigs`, but is
         * otherwise the same as [IntegrationConfigurationServiceAsync.create].
         */
        fun create(
            params: IntegrationConfigurationCreateParams
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: IntegrationConfigurationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/integrationconfigs/{id}`, but
         * is otherwise the same as [IntegrationConfigurationServiceAsync.retrieve].
         */
        fun retrieve(
            id: String
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationResponse>> =
            retrieve(id, IntegrationConfigurationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: IntegrationConfigurationRetrieveParams =
                IntegrationConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: IntegrationConfigurationRetrieveParams =
                IntegrationConfigurationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: IntegrationConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationResponse>>

        /** @see retrieve */
        fun retrieve(
            params: IntegrationConfigurationRetrieveParams
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationResponse>> =
            retrieve(id, IntegrationConfigurationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/integrationconfigs/{id}`, but
         * is otherwise the same as [IntegrationConfigurationServiceAsync.update].
         */
        fun update(
            id: String,
            params: IntegrationConfigurationUpdateParams,
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            params: IntegrationConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            params: IntegrationConfigurationUpdateParams
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: IntegrationConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/integrationconfigs`, but is
         * otherwise the same as [IntegrationConfigurationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<IntegrationConfigurationListPageAsync>> =
            list(IntegrationConfigurationListParams.none())

        /** @see list */
        fun list(
            params: IntegrationConfigurationListParams = IntegrationConfigurationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationListPageAsync>>

        /** @see list */
        fun list(
            params: IntegrationConfigurationListParams = IntegrationConfigurationListParams.none()
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationListPageAsync>> =
            list(IntegrationConfigurationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/integrationconfigs/{id}`,
         * but is otherwise the same as [IntegrationConfigurationServiceAsync.delete].
         */
        fun delete(
            id: String
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationDeleteResponse>> =
            delete(id, IntegrationConfigurationDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: IntegrationConfigurationDeleteParams =
                IntegrationConfigurationDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationDeleteResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: IntegrationConfigurationDeleteParams =
                IntegrationConfigurationDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationDeleteResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: IntegrationConfigurationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationDeleteResponse>>

        /** @see delete */
        fun delete(
            params: IntegrationConfigurationDeleteParams
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationDeleteResponse>> =
            delete(id, IntegrationConfigurationDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/integrationconfigs/{id}/enable`, but is otherwise the same as
         * [IntegrationConfigurationServiceAsync.enable].
         */
        fun enable(
            id: String
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationEnableResponse>> =
            enable(id, IntegrationConfigurationEnableParams.none())

        /** @see enable */
        fun enable(
            id: String,
            params: IntegrationConfigurationEnableParams =
                IntegrationConfigurationEnableParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationEnableResponse>> =
            enable(params.toBuilder().id(id).build(), requestOptions)

        /** @see enable */
        fun enable(
            id: String,
            params: IntegrationConfigurationEnableParams =
                IntegrationConfigurationEnableParams.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationEnableResponse>> =
            enable(id, params, RequestOptions.none())

        /** @see enable */
        fun enable(
            params: IntegrationConfigurationEnableParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationEnableResponse>>

        /** @see enable */
        fun enable(
            params: IntegrationConfigurationEnableParams
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationEnableResponse>> =
            enable(params, RequestOptions.none())

        /** @see enable */
        fun enable(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationEnableResponse>> =
            enable(id, IntegrationConfigurationEnableParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/integrationconfigs/entity/{entityType}`, but is otherwise the same
         * as [IntegrationConfigurationServiceAsync.getByEntity].
         */
        fun getByEntity(
            entityType: String
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationResponse>> =
            getByEntity(entityType, IntegrationConfigurationGetByEntityParams.none())

        /** @see getByEntity */
        fun getByEntity(
            entityType: String,
            params: IntegrationConfigurationGetByEntityParams =
                IntegrationConfigurationGetByEntityParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationResponse>> =
            getByEntity(params.toBuilder().entityType(entityType).build(), requestOptions)

        /** @see getByEntity */
        fun getByEntity(
            entityType: String,
            params: IntegrationConfigurationGetByEntityParams =
                IntegrationConfigurationGetByEntityParams.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationResponse>> =
            getByEntity(entityType, params, RequestOptions.none())

        /** @see getByEntity */
        fun getByEntity(
            params: IntegrationConfigurationGetByEntityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationResponse>>

        /** @see getByEntity */
        fun getByEntity(
            params: IntegrationConfigurationGetByEntityParams
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationResponse>> =
            getByEntity(params, RequestOptions.none())

        /** @see getByEntity */
        fun getByEntity(
            entityType: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegrationConfigurationResponse>> =
            getByEntity(
                entityType,
                IntegrationConfigurationGetByEntityParams.none(),
                requestOptions,
            )
    }
}
