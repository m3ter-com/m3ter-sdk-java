// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async.dataExports

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
import com.m3ter.sdk.models.DataExportScheduleCreateParams
import com.m3ter.sdk.models.DataExportScheduleCreateResponse
import com.m3ter.sdk.models.DataExportScheduleDeleteParams
import com.m3ter.sdk.models.DataExportScheduleDeleteResponse
import com.m3ter.sdk.models.DataExportScheduleListPageAsync
import com.m3ter.sdk.models.DataExportScheduleListParams
import com.m3ter.sdk.models.DataExportScheduleRetrieveParams
import com.m3ter.sdk.models.DataExportScheduleRetrieveResponse
import com.m3ter.sdk.models.DataExportScheduleUpdateParams
import com.m3ter.sdk.models.DataExportScheduleUpdateResponse
import java.util.concurrent.CompletableFuture

class ScheduleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ScheduleServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<DataExportScheduleCreateResponse> =
        jsonHandler<DataExportScheduleCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

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
    override fun create(
        params: DataExportScheduleCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportScheduleCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "dataexports",
                    "schedules",
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val retrieveHandler: Handler<DataExportScheduleRetrieveResponse> =
        jsonHandler<DataExportScheduleRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve a Data Export Schedule for the given UUID. Each Schedule can be configured for
     * exporting _only one_ of either Usage or Operational data.
     */
    override fun retrieve(
        params: DataExportScheduleRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportScheduleRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "dataexports",
                    "schedules",
                    params.getPathParam(1),
                )
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val updateHandler: Handler<DataExportScheduleUpdateResponse> =
        jsonHandler<DataExportScheduleUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

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
    override fun update(
        params: DataExportScheduleUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportScheduleUpdateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "dataexports",
                    "schedules",
                    params.getPathParam(1),
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<DataExportScheduleListPageAsync.Response> =
        jsonHandler<DataExportScheduleListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve a list of Data Export Schedules created for your Organization. You can filter the
     * response by Schedules `ids`.
     *
     * The response will contain an array for both the operational and usage Data Export Schedules
     * in your Organization.
     */
    override fun list(
        params: DataExportScheduleListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportScheduleListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "dataexports",
                    "schedules",
                )
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { DataExportScheduleListPageAsync.of(this, params, it) }
            }
    }

    private val deleteHandler: Handler<DataExportScheduleDeleteResponse> =
        jsonHandler<DataExportScheduleDeleteResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Delete the Data Export Schedule for the given UUID. Each Schedule can be configured for
     * exporting _only one_ of either Usage or Operational data.
     */
    override fun delete(
        params: DataExportScheduleDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DataExportScheduleDeleteResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "dataexports",
                    "schedules",
                    params.getPathParam(1),
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
