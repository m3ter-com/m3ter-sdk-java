// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking.dataExports

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.handlers.errorHandler
import com.m3ter.sdk.core.handlers.jsonHandler
import com.m3ter.sdk.core.handlers.withErrorHandler
import com.m3ter.sdk.core.http.HttpMethod
import com.m3ter.sdk.core.http.HttpRequest
import com.m3ter.sdk.core.http.HttpResponse.Handler
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
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

class DestinationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DestinationService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<DataExportDestinationCreateResponse> =
        jsonHandler<DataExportDestinationCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Create a new Export Destination to use for your Data Export Schedules or Ad-Hoc Data Exports.
     *
     * **NOTE:** Currently, you can only create Export Destinations using an S3 bucket on your AWS
     * Account.
     */
    override fun create(
        params: DataExportDestinationCreateParams,
        requestOptions: RequestOptions,
    ): DataExportDestinationCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "dataexports",
                    "destinations",
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<DataExportDestinationRetrieveResponse> =
        jsonHandler<DataExportDestinationRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve an Export Destination for the given UUID. */
    override fun retrieve(
        params: DataExportDestinationRetrieveParams,
        requestOptions: RequestOptions,
    ): DataExportDestinationRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "dataexports",
                    "destinations",
                    params.getPathParam(1),
                )
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<DataExportDestinationUpdateResponse> =
        jsonHandler<DataExportDestinationUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Update an Export Destination for the given UUID.
     *
     * **NOTE:** Currently, only Export Destinations using an S3 bucket on your AWS Account are
     * supported.
     */
    override fun update(
        params: DataExportDestinationUpdateParams,
        requestOptions: RequestOptions,
    ): DataExportDestinationUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "dataexports",
                    "destinations",
                    params.getPathParam(1),
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<DataExportDestinationListPage.Response> =
        jsonHandler<DataExportDestinationListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve a list of Export Destination entities. You can filter the list of Destinations
     * returned by UUID.
     */
    override fun list(
        params: DataExportDestinationListParams,
        requestOptions: RequestOptions,
    ): DataExportDestinationListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "dataexports",
                    "destinations",
                )
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
            .let { DataExportDestinationListPage.of(this, params, it) }
    }

    private val deleteHandler: Handler<DataExportDestinationDeleteResponse> =
        jsonHandler<DataExportDestinationDeleteResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Delete an Export Destination for the given UUID.
     *
     * **NOTE:** If you attempt to delete an Export Destination that is currently linked to a Data
     * Export Schedule, an error message is returned and you won't be able to delete the
     * Destination.
     */
    override fun delete(
        params: DataExportDestinationDeleteParams,
        requestOptions: RequestOptions,
    ): DataExportDestinationDeleteResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "dataexports",
                    "destinations",
                    params.getPathParam(1),
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { deleteHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }
}
