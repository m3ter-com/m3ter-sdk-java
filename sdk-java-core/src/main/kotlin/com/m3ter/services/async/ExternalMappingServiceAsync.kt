// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.ExternalMappingCreateParams
import com.m3ter.models.ExternalMappingDeleteParams
import com.m3ter.models.ExternalMappingListByExternalEntityPageAsync
import com.m3ter.models.ExternalMappingListByExternalEntityParams
import com.m3ter.models.ExternalMappingListByM3terEntityPageAsync
import com.m3ter.models.ExternalMappingListByM3terEntityParams
import com.m3ter.models.ExternalMappingListPageAsync
import com.m3ter.models.ExternalMappingListParams
import com.m3ter.models.ExternalMappingResponse
import com.m3ter.models.ExternalMappingRetrieveParams
import com.m3ter.models.ExternalMappingUpdateParams
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
    fun retrieve(id: String): CompletableFuture<ExternalMappingResponse> =
        retrieve(id, ExternalMappingRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ExternalMappingRetrieveParams = ExternalMappingRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMappingResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ExternalMappingRetrieveParams = ExternalMappingRetrieveParams.none(),
    ): CompletableFuture<ExternalMappingResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ExternalMappingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMappingResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: ExternalMappingRetrieveParams
    ): CompletableFuture<ExternalMappingResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalMappingResponse> =
        retrieve(id, ExternalMappingRetrieveParams.none(), requestOptions)

    /**
     * Updates an External Mapping with the given UUID.
     *
     * This endpoint enables you to update an existing External Mapping entity, identified by its
     * UUID. You must supply a request body with the new details for the External Mapping.
     */
    fun update(
        id: String,
        params: ExternalMappingUpdateParams,
    ): CompletableFuture<ExternalMappingResponse> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: ExternalMappingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMappingResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
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
    fun list(): CompletableFuture<ExternalMappingListPageAsync> =
        list(ExternalMappingListParams.none())

    /** @see [list] */
    fun list(
        params: ExternalMappingListParams = ExternalMappingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMappingListPageAsync>

    /** @see [list] */
    fun list(
        params: ExternalMappingListParams = ExternalMappingListParams.none()
    ): CompletableFuture<ExternalMappingListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExternalMappingListPageAsync> =
        list(ExternalMappingListParams.none(), requestOptions)

    /** Delete an External Mapping with the given UUID. */
    fun delete(id: String): CompletableFuture<ExternalMappingResponse> =
        delete(id, ExternalMappingDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: ExternalMappingDeleteParams = ExternalMappingDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMappingResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: ExternalMappingDeleteParams = ExternalMappingDeleteParams.none(),
    ): CompletableFuture<ExternalMappingResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ExternalMappingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMappingResponse>

    /** @see [delete] */
    fun delete(params: ExternalMappingDeleteParams): CompletableFuture<ExternalMappingResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalMappingResponse> =
        delete(id, ExternalMappingDeleteParams.none(), requestOptions)

    /**
     * Retrieve a list of External Mapping entities for a specified external system entity.
     *
     * Use this endpoint to retrieve a list of External Mapping entities associated with a specific
     * external system entity. The list can be paginated for easier management.
     */
    fun listByExternalEntity(
        externalId: String,
        params: ExternalMappingListByExternalEntityParams,
    ): CompletableFuture<ExternalMappingListByExternalEntityPageAsync> =
        listByExternalEntity(externalId, params, RequestOptions.none())

    /** @see [listByExternalEntity] */
    fun listByExternalEntity(
        externalId: String,
        params: ExternalMappingListByExternalEntityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMappingListByExternalEntityPageAsync> =
        listByExternalEntity(params.toBuilder().externalId(externalId).build(), requestOptions)

    /** @see [listByExternalEntity] */
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
        m3terId: String,
        params: ExternalMappingListByM3terEntityParams,
    ): CompletableFuture<ExternalMappingListByM3terEntityPageAsync> =
        listByM3terEntity(m3terId, params, RequestOptions.none())

    /** @see [listByM3terEntity] */
    fun listByM3terEntity(
        m3terId: String,
        params: ExternalMappingListByM3terEntityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalMappingListByM3terEntityPageAsync> =
        listByM3terEntity(params.toBuilder().m3terId(m3terId).build(), requestOptions)

    /** @see [listByM3terEntity] */
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
        fun create(
            params: ExternalMappingCreateParams
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: ExternalMappingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/externalmappings/{id}`, but
         * is otherwise the same as [ExternalMappingServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ExternalMappingResponse>> =
            retrieve(id, ExternalMappingRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: ExternalMappingRetrieveParams = ExternalMappingRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: ExternalMappingRetrieveParams = ExternalMappingRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: ExternalMappingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: ExternalMappingRetrieveParams
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>> =
            retrieve(id, ExternalMappingRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/externalmappings/{id}`, but
         * is otherwise the same as [ExternalMappingServiceAsync.update].
         */
        fun update(
            id: String,
            params: ExternalMappingUpdateParams,
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            params: ExternalMappingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            params: ExternalMappingUpdateParams
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: ExternalMappingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/externalmappings`, but is
         * otherwise the same as [ExternalMappingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ExternalMappingListPageAsync>> =
            list(ExternalMappingListParams.none())

        /** @see [list] */
        fun list(
            params: ExternalMappingListParams = ExternalMappingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingListPageAsync>>

        /** @see [list] */
        fun list(
            params: ExternalMappingListParams = ExternalMappingListParams.none()
        ): CompletableFuture<HttpResponseFor<ExternalMappingListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExternalMappingListPageAsync>> =
            list(ExternalMappingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/externalmappings/{id}`,
         * but is otherwise the same as [ExternalMappingServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<ExternalMappingResponse>> =
            delete(id, ExternalMappingDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: ExternalMappingDeleteParams = ExternalMappingDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: ExternalMappingDeleteParams = ExternalMappingDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: ExternalMappingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>>

        /** @see [delete] */
        fun delete(
            params: ExternalMappingDeleteParams
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalMappingResponse>> =
            delete(id, ExternalMappingDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/externalmappings/externalid/{system}/{externalTable}/{externalId}`,
         * but is otherwise the same as [ExternalMappingServiceAsync.listByExternalEntity].
         */
        fun listByExternalEntity(
            externalId: String,
            params: ExternalMappingListByExternalEntityParams,
        ): CompletableFuture<HttpResponseFor<ExternalMappingListByExternalEntityPageAsync>> =
            listByExternalEntity(externalId, params, RequestOptions.none())

        /** @see [listByExternalEntity] */
        fun listByExternalEntity(
            externalId: String,
            params: ExternalMappingListByExternalEntityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingListByExternalEntityPageAsync>> =
            listByExternalEntity(params.toBuilder().externalId(externalId).build(), requestOptions)

        /** @see [listByExternalEntity] */
        fun listByExternalEntity(
            params: ExternalMappingListByExternalEntityParams
        ): CompletableFuture<HttpResponseFor<ExternalMappingListByExternalEntityPageAsync>> =
            listByExternalEntity(params, RequestOptions.none())

        /** @see [listByExternalEntity] */
        fun listByExternalEntity(
            params: ExternalMappingListByExternalEntityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingListByExternalEntityPageAsync>>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/externalmappings/external/{entity}/{m3terId}`, but is otherwise
         * the same as [ExternalMappingServiceAsync.listByM3terEntity].
         */
        fun listByM3terEntity(
            m3terId: String,
            params: ExternalMappingListByM3terEntityParams,
        ): CompletableFuture<HttpResponseFor<ExternalMappingListByM3terEntityPageAsync>> =
            listByM3terEntity(m3terId, params, RequestOptions.none())

        /** @see [listByM3terEntity] */
        fun listByM3terEntity(
            m3terId: String,
            params: ExternalMappingListByM3terEntityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingListByM3terEntityPageAsync>> =
            listByM3terEntity(params.toBuilder().m3terId(m3terId).build(), requestOptions)

        /** @see [listByM3terEntity] */
        fun listByM3terEntity(
            params: ExternalMappingListByM3terEntityParams
        ): CompletableFuture<HttpResponseFor<ExternalMappingListByM3terEntityPageAsync>> =
            listByM3terEntity(params, RequestOptions.none())

        /** @see [listByM3terEntity] */
        fun listByM3terEntity(
            params: ExternalMappingListByM3terEntityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalMappingListByM3terEntityPageAsync>>
    }
}
