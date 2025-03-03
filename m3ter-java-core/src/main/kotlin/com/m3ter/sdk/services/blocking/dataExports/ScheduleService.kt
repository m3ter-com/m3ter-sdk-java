// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking.dataExports

import com.m3ter.sdk.core.RequestOptions
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
    @JvmOverloads
    fun create(
        params: DataExportScheduleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleCreateResponse

    /**
     * Retrieve a Data Export Schedule for the given UUID. Each Schedule can be configured for
     * exporting _only one_ of either Usage or Operational data.
     */
    @JvmOverloads
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
    @JvmOverloads
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
    @JvmOverloads
    fun list(
        params: DataExportScheduleListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleListPage

    /**
     * Delete the Data Export Schedule for the given UUID. Each Schedule can be configured for
     * exporting _only one_ of either Usage or Operational data.
     */
    @JvmOverloads
    fun delete(
        params: DataExportScheduleDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DataExportScheduleDeleteResponse
}
