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
import com.m3ter.sdk.models.CustomFieldRetrieveParams
import com.m3ter.sdk.models.CustomFieldUpdateParams
import com.m3ter.sdk.models.CustomFields
import java.util.concurrent.CompletableFuture

class CustomFieldServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomFieldServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<CustomFields> =
        jsonHandler<CustomFields>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve all Custom Fields added at Organizational level for the entities that support them.
     */
    override fun retrieve(
        params: CustomFieldRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomFields> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "customfields")
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

    private val updateHandler: Handler<CustomFields> =
        jsonHandler<CustomFields>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update Custom Fields added at Organization level to entities that support them. */
    override fun update(
        params: CustomFieldUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomFields> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("organizations", params.getPathParam(0), "customfields")
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
