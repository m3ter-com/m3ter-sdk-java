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
import com.m3ter.sdk.models.BillConfig
import com.m3ter.sdk.models.BillConfigRetrieveParams
import com.m3ter.sdk.models.BillConfigUpdateParams
import java.util.concurrent.CompletableFuture

class BillConfigServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BillConfigServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<BillConfig> =
        jsonHandler<BillConfig>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve the Organization-wide BillConfig. */
    override fun retrieve(
        params: BillConfigRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillConfig> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "billconfig")
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

    private val updateHandler: Handler<BillConfig> =
        jsonHandler<BillConfig>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Update the Organization-wide BillConfig.
     *
     * You can use this endpoint to set a global lock date for **all** Bills - any Bill with a
     * service period end date on or before the set date will be locked and cannot be updated or
     * recalculated.
     */
    override fun update(
        params: BillConfigUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillConfig> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("organizations", params.getPathParam(0), "billconfig")
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
}
