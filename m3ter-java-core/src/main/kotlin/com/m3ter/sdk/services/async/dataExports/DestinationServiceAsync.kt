// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async.dataExports

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.DataExportDestinationCreateParams
import com.m3ter.sdk.models.DataExportDestinationCreateResponse
import com.m3ter.sdk.models.DataExportDestinationDeleteParams
import com.m3ter.sdk.models.DataExportDestinationDeleteResponse
import com.m3ter.sdk.models.DataExportDestinationListPageAsync
import com.m3ter.sdk.models.DataExportDestinationListParams
import com.m3ter.sdk.models.DataExportDestinationRetrieveParams
import com.m3ter.sdk.models.DataExportDestinationRetrieveResponse
import com.m3ter.sdk.models.DataExportDestinationUpdateParams
import com.m3ter.sdk.models.DataExportDestinationUpdateResponse
import java.util.concurrent.CompletableFuture

interface DestinationServiceAsync {

    /**
     * Create a new Export Destination to use for your Data Export Schedules or Ad-Hoc Data Exports.
     *
     * **NOTE:** Currently, you can only create Export Destinations using an S3 bucket on your AWS
     * Account.
     */
    @JvmOverloads
    fun create(
        params: DataExportDestinationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportDestinationCreateResponse>

    /** Retrieve an Export Destination for the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: DataExportDestinationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportDestinationRetrieveResponse>

    /**
     * Update an Export Destination for the given UUID.
     *
     * **NOTE:** Currently, only Export Destinations using an S3 bucket on your AWS Account are
     * supported.
     */
    @JvmOverloads
    fun update(
        params: DataExportDestinationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportDestinationUpdateResponse>

    /**
     * Retrieve a list of Export Destination entities. You can filter the list of Destinations
     * returned by UUID.
     */
    @JvmOverloads
    fun list(
        params: DataExportDestinationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportDestinationListPageAsync>

    /**
     * Delete an Export Destination for the given UUID.
     *
     * **NOTE:** If you attempt to delete an Export Destination that is currently linked to a Data
     * Export Schedule, an error message is returned and you won't be able to delete the
     * Destination.
     */
    @JvmOverloads
    fun delete(
        params: DataExportDestinationDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DataExportDestinationDeleteResponse>
}
