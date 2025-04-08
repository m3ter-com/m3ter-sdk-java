// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.ExternalMappingCreateParams
import com.m3ter.models.ExternalMappingDeleteParams
import com.m3ter.models.ExternalMappingListByExternalEntityPage
import com.m3ter.models.ExternalMappingListByExternalEntityParams
import com.m3ter.models.ExternalMappingListByM3terEntityPage
import com.m3ter.models.ExternalMappingListByM3terEntityParams
import com.m3ter.models.ExternalMappingListPage
import com.m3ter.models.ExternalMappingListParams
import com.m3ter.models.ExternalMappingResponse
import com.m3ter.models.ExternalMappingRetrieveParams
import com.m3ter.models.ExternalMappingUpdateParams

interface ExternalMappingService {

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
    fun create(params: ExternalMappingCreateParams): ExternalMappingResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ExternalMappingCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalMappingResponse

    /**
     * Retrieve an External Mapping with the given UUID.
     *
     * This endpoint enables you to retrieve the External Mapping with the specified UUID for a
     * specific Organization.
     */
    fun retrieve(params: ExternalMappingRetrieveParams): ExternalMappingResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ExternalMappingRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalMappingResponse

    /**
     * Updates an External Mapping with the given UUID.
     *
     * This endpoint enables you to update an existing External Mapping entity, identified by its
     * UUID. You must supply a request body with the new details for the External Mapping.
     */
    fun update(params: ExternalMappingUpdateParams): ExternalMappingResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ExternalMappingUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalMappingResponse

    /**
     * Retrieve a list of all External Mapping entities.
     *
     * This endpoint retrieves a list of all External Mapping entities for a specific Organization.
     * The list can be paginated for better management, and supports filtering using the external
     * system.
     */
    fun list(): ExternalMappingListPage = list(ExternalMappingListParams.none())

    /** @see [list] */
    fun list(
        params: ExternalMappingListParams = ExternalMappingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalMappingListPage

    /** @see [list] */
    fun list(
        params: ExternalMappingListParams = ExternalMappingListParams.none()
    ): ExternalMappingListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ExternalMappingListPage =
        list(ExternalMappingListParams.none(), requestOptions)

    /** Delete an External Mapping with the given UUID. */
    fun delete(params: ExternalMappingDeleteParams): ExternalMappingResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ExternalMappingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalMappingResponse

    /**
     * Retrieve a list of External Mapping entities for a specified external system entity.
     *
     * Use this endpoint to retrieve a list of External Mapping entities associated with a specific
     * external system entity. The list can be paginated for easier management.
     */
    fun listByExternalEntity(
        params: ExternalMappingListByExternalEntityParams
    ): ExternalMappingListByExternalEntityPage = listByExternalEntity(params, RequestOptions.none())

    /** @see [listByExternalEntity] */
    fun listByExternalEntity(
        params: ExternalMappingListByExternalEntityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalMappingListByExternalEntityPage

    /**
     * Retrieve a list of External Mapping entities for a specified m3ter entity.
     *
     * Use this endpoint to retrieve a list of External Mapping entities associated with a specific
     * m3ter entity. The list can be paginated for easier management.
     */
    fun listByM3terEntity(
        params: ExternalMappingListByM3terEntityParams
    ): ExternalMappingListByM3terEntityPage = listByM3terEntity(params, RequestOptions.none())

    /** @see [listByM3terEntity] */
    fun listByM3terEntity(
        params: ExternalMappingListByM3terEntityParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalMappingListByM3terEntityPage

    /**
     * A view of [ExternalMappingService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/externalmappings`, but is
         * otherwise the same as [ExternalMappingService.create].
         */
        @MustBeClosed
        fun create(params: ExternalMappingCreateParams): HttpResponseFor<ExternalMappingResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ExternalMappingCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalMappingResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/externalmappings/{id}`, but
         * is otherwise the same as [ExternalMappingService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ExternalMappingRetrieveParams
        ): HttpResponseFor<ExternalMappingResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ExternalMappingRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalMappingResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/externalmappings/{id}`, but
         * is otherwise the same as [ExternalMappingService.update].
         */
        @MustBeClosed
        fun update(params: ExternalMappingUpdateParams): HttpResponseFor<ExternalMappingResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ExternalMappingUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalMappingResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/externalmappings`, but is
         * otherwise the same as [ExternalMappingService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ExternalMappingListPage> =
            list(ExternalMappingListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExternalMappingListParams = ExternalMappingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalMappingListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExternalMappingListParams = ExternalMappingListParams.none()
        ): HttpResponseFor<ExternalMappingListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExternalMappingListPage> =
            list(ExternalMappingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/externalmappings/{id}`,
         * but is otherwise the same as [ExternalMappingService.delete].
         */
        @MustBeClosed
        fun delete(params: ExternalMappingDeleteParams): HttpResponseFor<ExternalMappingResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ExternalMappingDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalMappingResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/externalmappings/externalid/{system}/{externalTable}/{externalId}`,
         * but is otherwise the same as [ExternalMappingService.listByExternalEntity].
         */
        @MustBeClosed
        fun listByExternalEntity(
            params: ExternalMappingListByExternalEntityParams
        ): HttpResponseFor<ExternalMappingListByExternalEntityPage> =
            listByExternalEntity(params, RequestOptions.none())

        /** @see [listByExternalEntity] */
        @MustBeClosed
        fun listByExternalEntity(
            params: ExternalMappingListByExternalEntityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalMappingListByExternalEntityPage>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/externalmappings/external/{entity}/{m3terId}`, but is otherwise
         * the same as [ExternalMappingService.listByM3terEntity].
         */
        @MustBeClosed
        fun listByM3terEntity(
            params: ExternalMappingListByM3terEntityParams
        ): HttpResponseFor<ExternalMappingListByM3terEntityPage> =
            listByM3terEntity(params, RequestOptions.none())

        /** @see [listByM3terEntity] */
        @MustBeClosed
        fun listByM3terEntity(
            params: ExternalMappingListByM3terEntityParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalMappingListByM3terEntityPage>
    }
}
