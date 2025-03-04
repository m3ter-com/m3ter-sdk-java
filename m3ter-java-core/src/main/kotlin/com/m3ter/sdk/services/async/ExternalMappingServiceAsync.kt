// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.ExternalMapping
import com.m3ter.sdk.models.ExternalMappingCreateParams
import com.m3ter.sdk.models.ExternalMappingDeleteParams
import com.m3ter.sdk.models.ExternalMappingListByExternalEntityPageAsync
import com.m3ter.sdk.models.ExternalMappingListByExternalEntityParams
import com.m3ter.sdk.models.ExternalMappingListByM3terEntityPageAsync
import com.m3ter.sdk.models.ExternalMappingListByM3terEntityParams
import com.m3ter.sdk.models.ExternalMappingListPageAsync
import com.m3ter.sdk.models.ExternalMappingListParams
import com.m3ter.sdk.models.ExternalMappingRetrieveParams
import com.m3ter.sdk.models.ExternalMappingUpdateParams
import java.util.concurrent.CompletableFuture

interface ExternalMappingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Creates a new External Mapping.
     *
     * This endpoint enables you to create a new External Mapping for the specified Organization.
     * You need to supply a request body with the details of the new External Mapping.
     */
    @JvmOverloads
    fun create(
        params: ExternalMappingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMapping>

    /**
     * Retrieve an External Mapping with the given UUID.
     *
     * This endpoint enables you to retrieve the External Mapping with the specified UUID for a
     * specific Organization.
     */
    @JvmOverloads
    fun retrieve(
        params: ExternalMappingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMapping>

    /**
     * Updates an External Mapping with the given UUID.
     *
     * This endpoint enables you to update an existing External Mapping entity, identified by its
     * UUID. You must supply a request body with the new details for the External Mapping.
     */
    @JvmOverloads
    fun update(
        params: ExternalMappingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMapping>

    /**
     * Retrieve a list of all External Mapping entities.
     *
     * This endpoint retrieves a list of all External Mapping entities for a specific Organization.
     * The list can be paginated for better management, and supports filtering using the external
     * system.
     */
    @JvmOverloads
    fun list(
        params: ExternalMappingListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMappingListPageAsync>

    /** Delete an External Mapping with the given UUID. */
    @JvmOverloads
    fun delete(
        params: ExternalMappingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMapping>

    /**
     * Retrieve a list of External Mapping entities for a specified external system entity.
     *
     * Use this endpoint to retrieve a list of External Mapping entities associated with a specific
     * external system entity. The list can be paginated for easier management.
     */
    @JvmOverloads
    fun listByExternalEntity(
        params: ExternalMappingListByExternalEntityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMappingListByExternalEntityPageAsync>

    /**
     * Retrieve a list of External Mapping entities for a specified m3ter entity.
     *
     * Use this endpoint to retrieve a list of External Mapping entities associated with a specific
     * m3ter entity. The list can be paginated for easier management.
     */
    @JvmOverloads
    fun listByM3terEntity(
        params: ExternalMappingListByM3terEntityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMappingListByM3terEntityPageAsync>

    /**
     * A view of [ExternalMappingServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/externalmappings`, but is
         * otherwise the same as [ExternalMappingServiceAsync.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ExternalMappingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMapping>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/externalmappings/{id}`, but
         * is otherwise the same as [ExternalMappingServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ExternalMappingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMapping>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/externalmappings/{id}`, but
         * is otherwise the same as [ExternalMappingServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: ExternalMappingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMapping>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/externalmappings`, but is
         * otherwise the same as [ExternalMappingServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ExternalMappingListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/externalmappings/{id}`,
         * but is otherwise the same as [ExternalMappingServiceAsync.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: ExternalMappingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMapping>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/externalmappings/externalid/{system}/{externalTable}/{externalId}`,
         * but is otherwise the same as [ExternalMappingServiceAsync.listByExternalEntity].
         */
        @JvmOverloads
        @MustBeClosed
        fun listByExternalEntity(
            params: ExternalMappingListByExternalEntityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingListByExternalEntityPageAsync>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/externalmappings/external/{entity}/{m3terId}`, but is otherwise
         * the same as [ExternalMappingServiceAsync.listByM3terEntity].
         */
        @JvmOverloads
        @MustBeClosed
        fun listByM3terEntity(
            params: ExternalMappingListByM3terEntityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingListByM3terEntityPageAsync>>
    }
}
