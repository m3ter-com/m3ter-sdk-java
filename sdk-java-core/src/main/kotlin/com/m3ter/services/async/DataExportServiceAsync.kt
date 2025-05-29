// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.AdHocResponse
import com.m3ter.models.DataExportCreateAdhocParams
import com.m3ter.services.async.dataExports.DestinationServiceAsync
import com.m3ter.services.async.dataExports.JobServiceAsync
import com.m3ter.services.async.dataExports.ScheduleServiceAsync
import java.util.concurrent.CompletableFuture

interface DataExportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun destinations(): DestinationServiceAsync

    fun jobs(): JobServiceAsync

    fun schedules(): ScheduleServiceAsync

    /**
     * Trigger an ad-hoc Data Export. Each ad-hoc Export can be configured for exporting _only one
     * of_ either Usage or Operational data:
     *
     * **Operational Data Exports**.
     * - **Entity Types**. Use the `operationalDataTypes` parameter to specify the entities whose
     *   operational data you want to include in the ad-hoc export.
     * - **Export Files**. For each of the entity types you select, when the ad-hoc export runs a
     *   separate file is compiled containing the operational data for all entities of that type
     *   that exist in your Organization
     *
     * **Usage Data Exports**.
     * - Select the Meters and Accounts whose usage data you want to include in the ad-hoc export.
     * - You can use the `dimensionFilters` parameter to filter the usage data returned for export
     *   by adding specific values of non-numeric Dimension data fields on included Meters. Only the
     *   data collected for the values you've added for the selected Dimension fields will be
     *   included in the export.
     * - You can use the `aggregations` to apply aggregation methods the usage data returned for
     *   export. This restricts the range of usage data returned for export to only the data
     *   collected by aggregated fields on selected Meters. Nothing is returned for any
     *   non-aggregated fields on Meters. The usage data for Meter fields is returned as the values
     *   resulting from applying the selected aggregation method. See the
     *   [Aggregations for Queries - Options and Consequences](https://www.m3ter.com/docs/guides/data-explorer/usage-data-explorer-v2#aggregations-for-queries---understanding-options-and-consequences)
     *   for more details.
     * - If you've applied `aggregations` to the usage returned for export, you can then use the
     *   `groups` parameter to group the data by _Account_, _Dimension_, or _Time_.
     *
     * **Date Range for Operational Data Exports**. To restrict the operational data included in the
     * export by a date/time range, use the `startDate` and `endDate` date/time request parameters
     * to specify the period. Constraints:
     * - `startDate` with no `endDate` is valid.
     * - `endDate` with no `startDate` is valid.
     * - If both are set,`startDate` must be before `endDate`.
     * - `endDate` must be before now UTC.
     *
     * **Date Range for Usage Data Exports**. To restrict the usage data included in the export by
     * date/time range, use the `startDate` and `endDate` date/time parameters:
     * - Both `startDate` and `endDate` are required.
     * - `endDate` must be after `startDate`.
     * - `endDate` cannot be after tomorrow at midnight UTC. For example if today is May 20th 2025,
     *   you can only choose `endDate` to be equal or before 2025-05-21T00:00:00.000Z.
     *
     * **NOTE:** You can use the ExportJob `id` returned to check the status of the triggered ad-hoc
     * export. See the [ExportJob](https://www.m3ter.com/docs/api#tag/ExportJob) section of this API
     * Reference.
     */
    fun createAdhoc(params: DataExportCreateAdhocParams): CompletableFuture<AdHocResponse> =
        createAdhoc(params, RequestOptions.none())

    /** @see [createAdhoc] */
    fun createAdhoc(
        params: DataExportCreateAdhocParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AdHocResponse>

    /**
     * A view of [DataExportServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun destinations(): DestinationServiceAsync.WithRawResponse

        fun jobs(): JobServiceAsync.WithRawResponse

        fun schedules(): ScheduleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/dataexports/adhoc`, but is
         * otherwise the same as [DataExportServiceAsync.createAdhoc].
         */
        fun createAdhoc(
            params: DataExportCreateAdhocParams
        ): CompletableFuture<HttpResponseFor<AdHocResponse>> =
            createAdhoc(params, RequestOptions.none())

        /** @see [createAdhoc] */
        fun createAdhoc(
            params: DataExportCreateAdhocParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AdHocResponse>>
    }
}
