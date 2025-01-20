// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.handlers.errorHandler
import com.m3ter.sdk.core.handlers.jsonHandler
import com.m3ter.sdk.core.handlers.withErrorHandler
import com.m3ter.sdk.core.http.HttpMethod
import com.m3ter.sdk.core.http.HttpRequest
import com.m3ter.sdk.core.http.HttpResponse.Handler
import com.m3ter.sdk.core.json
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.Meter
import com.m3ter.sdk.models.MeterCreateParams
import com.m3ter.sdk.models.MeterListPage
import com.m3ter.sdk.models.MeterListParams
import com.m3ter.sdk.models.MeterRetrieveParams
import com.m3ter.sdk.models.MeterUpdateParams

class MeterServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : MeterService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Meter> =
        jsonHandler<Meter>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new Meter.
     *
     * When you create a Meter, you can define two types of field for usage data collection and
     * ingest into the platform:
     * - `dataFields` to collect raw usage data measures - numeric quantitative data values or
     *   non-numeric point data values.
     * - `derivedFields` to derive usage data measures that are the result of applying a calculation
     *   to `dataFields`, `customFields`, or system `Timestamp` fields.
     *
     * You can also:
     * - Create `customFields` for a Meter, which allows you to attach custom data to the Meter as
     *   name/value pairs.
     * - Create Global Meters, which are not tied to a specific Product and allow you collect to
     *   usage data that will form the basis of usage-based pricing across more than one of your
     *   Products.
     *
     * **IMPORTANT! - use of PII:** The use of any of your end-customers' Personally Identifiable
     * Information (PII) in m3ter is restricted to a few fields on the **Account** entity. Please
     * ensure that any fields you configure for Meters, such as Data Fields or Derived Fields, do
     * not contain any end-customer PII data. See the
     * [Introduction section](https://www.m3ter.com/docs/api#section/Introduction) above for more
     * details.
     *
     * See also:
     * - [Reviewing Meter
     *   Options](https://www.m3ter.com/docs/guides/setting-up-usage-data-meters-and-aggregations/reviewing-meter-options).
     */
    override fun create(params: MeterCreateParams, requestOptions: RequestOptions): Meter {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "meters")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<Meter> =
        jsonHandler<Meter>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve the Meter with the given UUID. */
    override fun retrieve(params: MeterRetrieveParams, requestOptions: RequestOptions): Meter {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "meters",
                    params.getPathParam(1)
                )
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<Meter> =
        jsonHandler<Meter>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Update the Meter with the given UUID.
     *
     * **Note:** If you have created Custom Fields for a Meter, when you use this endpoint to update
     * the Meter use the `customFields` parameter to preserve those Custom Fields. If you omit them
     * from the update request, they will be lost.
     */
    override fun update(params: MeterUpdateParams, requestOptions: RequestOptions): Meter {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "meters",
                    params.getPathParam(1)
                )
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<MeterListPage.Response> =
        jsonHandler<MeterListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a list of Meters that can be filtered by Product, Meter ID, or Meter short code. */
    override fun list(params: MeterListParams, requestOptions: RequestOptions): MeterListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "meters")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { MeterListPage.of(this, params, it) }
        }
    }
}
