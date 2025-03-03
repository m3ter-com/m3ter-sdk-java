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
import com.m3ter.sdk.models.BillJob
import com.m3ter.sdk.models.BillJobCancelParams
import com.m3ter.sdk.models.BillJobCreateParams
import com.m3ter.sdk.models.BillJobListPageAsync
import com.m3ter.sdk.models.BillJobListParams
import com.m3ter.sdk.models.BillJobRecalculateParams
import com.m3ter.sdk.models.BillJobRetrieveParams
import java.util.concurrent.CompletableFuture

class BillJobServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BillJobServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<BillJob> =
        jsonHandler<BillJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new BillJob to handle asynchronous bill calculations for a specific Organization.
     *
     * This operation allows you to initiate the processing of bills according to specified
     * parameters. For example, create a BillJob to run only those bills where `billingFrequency` is
     * `MONTHLY`. Note that if you want to run a BillJob for all billing frequencies, simply omit
     * the `billingFrequency` request parameter.
     *
     * Once created, the BillJob's progress can be monitored:
     * - In the Running Tasks panel in the m3ter Console - for more details, see
     *   [Running Bills Manually](https://www.m3ter.com/docs/guides/billing-and-usage-data/running-viewing-and-managing-bills/running-bills-and-viewing-bill-details#running-bills-manually)
     * - Queried using the
     *   [List BillJobs](https://www.m3ter.com/docs/api#tag/BillJob/operation/ListBillJobs)
     *   operation.
     *
     * **NOTES:**
     * - **Consolidated bills**. If you've already run billing with the Consolidate bills option
     *   disabled for your Organization but you then enable it, subsequent Bills for specific bill
     *   dates will now start afresh and not update earlier non-consolidated Bills for the same bill
     *   date. To avoid any billing conflicts, you might want to archive these earlier versions or
     *   delete them entirely.
     * - **Maximum concurrent BillJobs**. If you already have 10 BillJobs currently running, and try
     *   to create another one, you'll get an HTTP 429 response (Too many requests). When one of the
     *   existing BillJobs has completed, you'll be able to submit another job
     */
    override fun create(
        params: BillJobCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillJob> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "billjobs")
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

    private val retrieveHandler: Handler<BillJob> =
        jsonHandler<BillJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Bill Job for the given UUID. */
    override fun retrieve(
        params: BillJobRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillJob> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "billjobs",
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

    private val listHandler: Handler<BillJobListPageAsync.Response> =
        jsonHandler<BillJobListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve a list of BillJobs.
     *
     * This endpoint retrieves a list of BillJobs for a specified organization. The list can be
     * paginated for easier management, and allows you to query and filter based on various
     * parameters, such as BillJob `status` and whether or not BillJob remains `active`.
     */
    override fun list(
        params: BillJobListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillJobListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "billjobs")
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
                    .let { BillJobListPageAsync.of(this, params, it) }
            }
    }

    private val cancelHandler: Handler<BillJob> =
        jsonHandler<BillJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Cancel an ongoing BillJob for the given Organization and BillJob UUID.
     *
     * This endpoint allows you to halt the processing of a specific BillJob, which might be
     * necessary if there are changes in billing requirements or other operational considerations.
     */
    override fun cancel(
        params: BillJobCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillJob> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "billjobs",
                    params.getPathParam(1),
                    "cancel",
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val recalculateHandler: Handler<BillJob> =
        jsonHandler<BillJob>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new BillJob specifically to recalculate existing bills for a given Organization.
     *
     * This operation is essential when adjustments or corrections are required in previously
     * calculated bills. The recalculated bills when the BillJob is complete can be checked in the
     * m3ter Console Bill Management page or queried by using the
     * [List Bills](https://www.m3ter.com/docs/api#tag/Bill/operation/ListBills) operation.
     *
     * **NOTE:**
     * - **Response Schema**. The response schema for this call is dynamic. This means that the
     *   response might not contain all of the parameters listed. If set to null,the parameter is
     *   hidden to help simplify the output as well as to reduce its size and improve performance.
     */
    override fun recalculate(
        params: BillJobRecalculateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillJob> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "billjobs", "recalculate")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { recalculateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
