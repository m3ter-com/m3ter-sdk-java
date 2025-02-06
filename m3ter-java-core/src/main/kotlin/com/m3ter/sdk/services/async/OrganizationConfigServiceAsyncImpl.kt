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
import com.m3ter.sdk.models.OrganizationConfig
import com.m3ter.sdk.models.OrganizationConfigRetrieveParams
import com.m3ter.sdk.models.OrganizationConfigUpdateParams
import java.util.concurrent.CompletableFuture

class OrganizationConfigServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : OrganizationConfigServiceAsync {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<OrganizationConfig> =
        jsonHandler<OrganizationConfig>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve the Organization-wide configuration details. */
    override fun retrieve(
        params: OrganizationConfigRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<OrganizationConfig> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "organizationconfig")
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

    private val updateHandler: Handler<OrganizationConfig> =
        jsonHandler<OrganizationConfig>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update the Organization-wide configuration details. */
    override fun update(
        params: OrganizationConfigUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<OrganizationConfig> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("organizations", params.getPathParam(0), "organizationconfig")
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
