// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking.dataExports

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.DataExportScheduleCreateParams
import com.m3ter.sdk.models.DataExportScheduleCreateResponse
import com.m3ter.sdk.models.DataExportScheduleDeleteParams
import com.m3ter.sdk.models.DataExportScheduleDeleteResponse
import com.m3ter.sdk.models.DataExportScheduleListPage
import com.m3ter.sdk.models.DataExportScheduleListParams
import com.m3ter.sdk.models.DataExportScheduleRetrieveParams
import com.m3ter.sdk.models.DataExportScheduleRetrieveResponse
import com.m3ter.sdk.models.DataExportScheduleUpdateParams
import com.m3ter.sdk.models.DataExportScheduleUpdateResponse

interface ScheduleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new Data Export Schedule. Each Schedule can be configured for exporting _only one_
     * of either Usage or Operational data:
     *
     * **Operational Data Exports**.
     * - Use the `operationalDataTypes` parameter to specify the entities whose operational data you
     *   want to include in the export each time the Export Schedule runs.
     * - For each of the entity types you select, each time the Export Schedule runs a separate file
     *   is compiled containing the operational data for all entities of that type that exist in
     *   your Organization
     *
     * **Usage Data Exports**.
     * - Select the Meters and Accounts whose usage data you want to include in the export each time
     *   the Export Schedule runs.
     * - If _don't want to aggregate_ the usage data collected by the selected Meters, use
     *   **ORIGINAL** for `aggregationFrequency`, which is the _default_. This means the raw usage
     *   data collected by any type of Data Fields and the values for any Derived Fields on the
     *   selected Meters will be included in the export.
     * - If you _do want to aggregate_ the usage data collected by the selected Meters, use one of
     *   the other options for `aggregationFrequency`: **HOUR**, **DAY**, **WEEK**, or **MONTH**.
     *   You _must_ then also specified an `aggregation` method to be used on the usage data before
     *   export. Importantly, if you do aggregate usage data, only the usage data collected by any
     *   numeric Data Fields on the selected Meters - those of type **MEASURE**, **INCOME**, or
     *   **COST** - will be included in the export each time the Export Schedule runs.
     */
    fun create(params: DataExportScheduleCreateParams): DataExportScheduleCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: DataExportScheduleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleCreateResponse

    /**
     * Retrieve a Data Export Schedule for the given UUID. Each Schedule can be configured for
     * exporting _only one_ of either Usage or Operational data.
     */
    fun retrieve(params: DataExportScheduleRetrieveParams): DataExportScheduleRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DataExportScheduleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleRetrieveResponse

    /**
     * Update a Data Export Schedule for the given UUID. Each Schedule can be configured for
     * exporting _only one_ of either Usage or Operational data:
     *
     * **Operational Data Exports**.
     * - Use the `operationalDataTypes` parameter to specify the entities whose operational data you
     *   want to include in the export each time the Export Schedule runs.
     * - For each of the entity types you select, each time the Export Schedule runs a separate file
     *   is compiled containing the operational data for all entities of that type that exist in
     *   your Organization
     *
     * **Usage Data Exports**.
     * - Select the Meters and Accounts whose usage data you want to include in the export each time
     *   the Export Schedule runs.
     * - If _don't want to aggregate_ the usage data collected by the selected Meters, use
     *   **ORIGINAL** for `aggregationFrequency`, which is the _default_. This means the raw usage
     *   data collected by any type of Data Fields and the values for any Derived Fields on the
     *   selected Meters will be included in the export.
     * - If you _do want to aggregate_ the usage data collected by the selected Meters, use one of
     *   the other options for `aggregationFrequency`: **HOUR**, **DAY**, **WEEK**, or **MONTH**.
     *   You _must_ then also specified an `aggregation` method to be used on the usage data before
     *   export. Importantly, if you do aggregate usage data, only the usage data collected by any
     *   numeric Data Fields on the selected Meters - those of type **MEASURE**, **INCOME**, or
     *   **COST** - will be included in the export each time the Export Schedule runs.
     */
    fun update(params: DataExportScheduleUpdateParams): DataExportScheduleUpdateResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: DataExportScheduleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleUpdateResponse

    /**
     * Retrieve a list of Data Export Schedules created for your Organization. You can filter the
     * response by Schedules `ids`.
     *
     * The response will contain an array for both the operational and usage Data Export Schedules
     * in your Organization.
     */
    fun list(params: DataExportScheduleListParams): DataExportScheduleListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: DataExportScheduleListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleListPage

    /**
     * Delete the Data Export Schedule for the given UUID. Each Schedule can be configured for
     * exporting _only one_ of either Usage or Operational data.
     */
    fun delete(params: DataExportScheduleDeleteParams): DataExportScheduleDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: DataExportScheduleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleDeleteResponse

    /** A view of [ScheduleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/dataexports/schedules`, but
         * is otherwise the same as [ScheduleService.create].
         */
        @MustBeClosed
        fun create(
            params: DataExportScheduleCreateParams
        ): HttpResponseFor<DataExportScheduleCreateResponse> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: DataExportScheduleCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportScheduleCreateResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/dataexports/schedules/{id}`,
         * but is otherwise the same as [ScheduleService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: DataExportScheduleRetrieveParams
        ): HttpResponseFor<DataExportScheduleRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DataExportScheduleRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportScheduleRetrieveResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/dataexports/schedules/{id}`,
         * but is otherwise the same as [ScheduleService.update].
         */
        @MustBeClosed
        fun update(
            params: DataExportScheduleUpdateParams
        ): HttpResponseFor<DataExportScheduleUpdateResponse> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: DataExportScheduleUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportScheduleUpdateResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/dataexports/schedules`, but
         * is otherwise the same as [ScheduleService.list].
         */
        @MustBeClosed
        fun list(
            params: DataExportScheduleListParams
        ): HttpResponseFor<DataExportScheduleListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DataExportScheduleListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportScheduleListPage>

        /**
         * Returns a raw HTTP response for `delete
         * /organizations/{orgId}/dataexports/schedules/{id}`, but is otherwise the same as
         * [ScheduleService.delete].
         */
        @MustBeClosed
        fun delete(
            params: DataExportScheduleDeleteParams
        ): HttpResponseFor<DataExportScheduleDeleteResponse> = delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: DataExportScheduleDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DataExportScheduleDeleteResponse>
    }
}
