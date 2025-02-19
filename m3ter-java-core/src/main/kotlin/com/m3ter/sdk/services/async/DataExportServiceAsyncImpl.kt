// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.handlers.errorHandler
import com.m3ter.sdk.core.handlers.jsonHandler
import com.m3ter.sdk.core.handlers.withErrorHandler
import com.m3ter.sdk.core.http.HttpMethod
import com.m3ter.sdk.core.http.HttpRequest
import com.m3ter.sdk.core.http.HttpResponse.Handler
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.AdhocExport
import com.m3ter.sdk.models.DataExportCreateAdhocParams
import java.util.concurrent.CompletableFuture

class DataExportServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : DataExportServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createAdhocHandler: Handler<AdhocExport> =
        jsonHandler<AdhocExport>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

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
     * - **Meters/Accounts**. Select the Meters and Accounts whose usage data you want to include in
     *   the ad-hoc export.
     * - **Aggregated or non-aggregated data**:
     * 1. If you _don't want to aggregate_ the usage data collected by the selected Meters, use
     *    **ORIGINAL** for `aggregationFrequency`, which is the _default_. This means the raw usage
     *    data collected by any type of Data Fields and the values for any Derived Fields on the
     *    selected Meters will be included in the ad-hoc export.
     * 2. If you _do want to aggregate_ the usage data collected by the selected Meters, use one of
     *    the other options for `aggregationFrequency`: **HOUR**, **DAY**, **WEEK**, or **MONTH**.
     *    You _must_ then also specified an `aggregation` method to be used on the usage data before
     *    export. Importantly, if you do aggregate usage data, only the usage data collected by any
     *    numeric Data Fields on the selected Meters - those of type **MEASURE**, **INCOME**, or
     *    **COST** - will be included in the ad-hoc export.
     *
     * **Date Range for Operational Data Exports**. To restrict the operational data included in the
     * export by a date/time range, use the `startDate` and `endDate` date/time request parameters
     * to specify the period. Constraints:
     * - `startDate` must be before `endDate`.
     * - `startDate` with no `endDate` is valid.
     * - No `startDate` with `endDate` is valid.
     * - `endDate` must be before present date/time.
     * - Both are optional and if neither is defined, the export includes all data for selected
     *   entities.
     *
     * **Date Range for Usage Data Exports**. To restrict the usage data included in the export by
     * date/time range, use the `timePeriod` request parameter to define a set date range.
     * Alternatively, define a custom date range using the `startDate` and `endDate` date/time
     * parameters:
     * - Both `startDate` and `endDate` are required.
     * - You cannot use a `startDate` earlier than 35 days in the past.
     * - The `endDate` is valid up to tomorrow at 00:00.
     * - You must define a Date Range using **timePeriod** or **startDate/endDate**, but they are
     *   mutually exclusive and you cannot use them together.
     *
     * **NOTE:** You can use the ExportJob `id` returned to check the status of the triggered ad-hoc
     * export. See the [ExportJob](https://www.m3ter.com/docs/api#tag/ExportJob) section of this API
     * Reference.
     */
    override fun createAdhoc(
        params: DataExportCreateAdhocParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AdhocExport> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "dataexports", "adhoc")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createAdhocHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
