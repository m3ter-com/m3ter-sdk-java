// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.RequestOptions
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

interface ExternalMappingService {

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
    ): ExternalMapping

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
    ): ExternalMapping

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
    ): ExternalMapping

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
    ): ExternalMappingListPage

    /** Delete an External Mapping with the given UUID. */
    @JvmOverloads
    fun delete(
        params: ExternalMappingDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalMapping

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
    ): ExternalMappingListByExternalEntityPage

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
    ): ExternalMappingListByM3terEntityPage
}
