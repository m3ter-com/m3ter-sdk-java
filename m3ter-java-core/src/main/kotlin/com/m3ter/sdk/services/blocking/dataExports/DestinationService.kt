// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking.dataExports

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.DataExportDestinationCreateParams
import com.m3ter.sdk.models.DataExportDestinationCreateResponse
import com.m3ter.sdk.models.DataExportDestinationDeleteParams
import com.m3ter.sdk.models.DataExportDestinationDeleteResponse
import com.m3ter.sdk.models.DataExportDestinationListPage
import com.m3ter.sdk.models.DataExportDestinationListParams
import com.m3ter.sdk.models.DataExportDestinationRetrieveParams
import com.m3ter.sdk.models.DataExportDestinationRetrieveResponse
import com.m3ter.sdk.models.DataExportDestinationUpdateParams
import com.m3ter.sdk.models.DataExportDestinationUpdateResponse

interface DestinationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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
    ): DataExportDestinationCreateResponse

    /** Retrieve an Export Destination for the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: DataExportDestinationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportDestinationRetrieveResponse

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
    ): DataExportDestinationUpdateResponse

    /**
     * Retrieve a list of Export Destination entities. You can filter the list of Destinations
     * returned by UUID.
     */
    @JvmOverloads
    fun list(
        params: DataExportDestinationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportDestinationListPage

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
    ): DataExportDestinationDeleteResponse

    /**
     * A view of [DestinationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/dataexports/destinations`,
         * but is otherwise the same as [DestinationService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: DataExportDestinationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportDestinationCreateResponse>

        /**
         * Returns a raw HTTP response for `get
         * /organizations/{orgId}/dataexports/destinations/{id}`, but is otherwise the same as
         * [DestinationService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: DataExportDestinationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportDestinationRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put
         * /organizations/{orgId}/dataexports/destinations/{id}`, but is otherwise the same as
         * [DestinationService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: DataExportDestinationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportDestinationUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/dataexports/destinations`,
         * but is otherwise the same as [DestinationService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: DataExportDestinationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportDestinationListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/dataexports/destinations/{id}`, but is otherwise the same as
         * [DestinationService.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: DataExportDestinationDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportDestinationDeleteResponse>
    }
}
