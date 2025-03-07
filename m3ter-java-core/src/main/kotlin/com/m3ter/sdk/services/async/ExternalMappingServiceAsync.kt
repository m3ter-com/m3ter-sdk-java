// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.ExternalMappingCreateParams
import com.m3ter.sdk.models.ExternalMappingDeleteParams
import com.m3ter.sdk.models.ExternalMappingListByExternalEntityPageAsync
import com.m3ter.sdk.models.ExternalMappingListByExternalEntityParams
import com.m3ter.sdk.models.ExternalMappingListByM3terEntityPageAsync
import com.m3ter.sdk.models.ExternalMappingListByM3terEntityParams
import com.m3ter.sdk.models.ExternalMappingListPageAsync
import com.m3ter.sdk.models.ExternalMappingListParams
import com.m3ter.sdk.models.ExternalMappingResponse
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
    fun create(params: ExternalMappingCreateParams): CompletableFuture<ExternalMappingResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ExternalMappingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMappingResponse>

    /**
     * Retrieve an External Mapping with the given UUID.
     *
     * This endpoint enables you to retrieve the External Mapping with the specified UUID for a
     * specific Organization.
     */
    fun retrieve(
        params: ExternalMappingRetrieveParams
    ): CompletableFuture<ExternalMappingResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ExternalMappingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMappingResponse>

    /**
     * Updates an External Mapping with the given UUID.
     *
     * This endpoint enables you to update an existing External Mapping entity, identified by its
     * UUID. You must supply a request body with the new details for the External Mapping.
     */
    fun update(params: ExternalMappingUpdateParams): CompletableFuture<ExternalMappingResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ExternalMappingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMappingResponse>

    /**
     * Retrieve a list of all External Mapping entities.
     *
     * This endpoint retrieves a list of all External Mapping entities for a specific Organization.
     * The list can be paginated for better management, and supports filtering using the external
     * system.
     */
    fun list(params: ExternalMappingListParams): CompletableFuture<ExternalMappingListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: ExternalMappingListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMappingListPageAsync>

    /** Delete an External Mapping with the given UUID. */
    fun delete(params: ExternalMappingDeleteParams): CompletableFuture<ExternalMappingResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ExternalMappingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMappingResponse>

    /**
     * Retrieve a list of External Mapping entities for a specified external system entity.
     *
     * Use this endpoint to retrieve a list of External Mapping entities associated with a specific
     * external system entity. The list can be paginated for easier management.
     */
    fun listByExternalEntity(
        params: ExternalMappingListByExternalEntityParams
    ): CompletableFuture<ExternalMappingListByExternalEntityPageAsync> =
        listByExternalEntity(params, RequestOptions.none())

    /** @see [listByExternalEntity] */
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
    fun listByM3terEntity(
        params: ExternalMappingListByM3terEntityParams
    ): CompletableFuture<ExternalMappingListByM3terEntityPageAsync> =
        listByM3terEntity(params, RequestOptions.none())

    /** @see [listByM3terEntity] */
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
        @MustBeClosed
        fun create(
            params: ExternalMappingCreateParams
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ExternalMappingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/externalmappings/{id}`, but
         * is otherwise the same as [ExternalMappingServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ExternalMappingRetrieveParams
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ExternalMappingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/externalmappings/{id}`, but
         * is otherwise the same as [ExternalMappingServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: ExternalMappingUpdateParams
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ExternalMappingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/externalmappings`, but is
         * otherwise the same as [ExternalMappingServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: ExternalMappingListParams
        ): CompletableFuture<HttpResponseFor<ExternalMappingListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExternalMappingListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/externalmappings/{id}`,
         * but is otherwise the same as [ExternalMappingServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: ExternalMappingDeleteParams
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ExternalMappingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/externalmappings/externalid/{system}/{externalTable}/{externalId}`,
         * but is otherwise the same as [ExternalMappingServiceAsync.listByExternalEntity].
         */
        @MustBeClosed
        fun listByExternalEntity(
            params: ExternalMappingListByExternalEntityParams
        ): CompletableFuture<HttpResponseFor<ExternalMappingListByExternalEntityPageAsync>> =
            listByExternalEntity(params, RequestOptions.none())

        /** @see [listByExternalEntity] */
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
        @MustBeClosed
        fun listByM3terEntity(
            params: ExternalMappingListByM3terEntityParams
        ): CompletableFuture<HttpResponseFor<ExternalMappingListByM3terEntityPageAsync>> =
            listByM3terEntity(params, RequestOptions.none())

        /** @see [listByM3terEntity] */
        @MustBeClosed
        fun listByM3terEntity(
            params: ExternalMappingListByM3terEntityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingListByM3terEntityPageAsync>>
    }
}
