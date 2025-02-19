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
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.PlanGroupLink
import com.m3ter.sdk.models.PlanGroupLinkCreateParams
import com.m3ter.sdk.models.PlanGroupLinkDeleteParams
import com.m3ter.sdk.models.PlanGroupLinkListPage
import com.m3ter.sdk.models.PlanGroupLinkListParams
import com.m3ter.sdk.models.PlanGroupLinkRetrieveParams
import com.m3ter.sdk.models.PlanGroupLinkUpdateParams

class PlanGroupLinkServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PlanGroupLinkService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<PlanGroupLink> =
        jsonHandler<PlanGroupLink>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new PlanGroupLink. */
    override fun create(
        params: PlanGroupLinkCreateParams,
        requestOptions: RequestOptions,
    ): PlanGroupLink {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "plangrouplinks")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<PlanGroupLink> =
        jsonHandler<PlanGroupLink>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a PlanGroupLink for the given UUID. */
    override fun retrieve(
        params: PlanGroupLinkRetrieveParams,
        requestOptions: RequestOptions,
    ): PlanGroupLink {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "plangrouplinks",
                    params.getPathParam(1),
                )
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<PlanGroupLink> =
        jsonHandler<PlanGroupLink>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update PlanGroupLink for the given UUID. */
    override fun update(
        params: PlanGroupLinkUpdateParams,
        requestOptions: RequestOptions,
    ): PlanGroupLink {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "plangrouplinks",
                    params.getPathParam(1),
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<PlanGroupLinkListPage.Response> =
        jsonHandler<PlanGroupLinkListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a list of PlanGroupLink entities */
    override fun list(
        params: PlanGroupLinkListParams,
        requestOptions: RequestOptions,
    ): PlanGroupLinkListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "plangrouplinks")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { PlanGroupLinkListPage.of(this, params, it) }
    }

    private val deleteHandler: Handler<PlanGroupLink> =
        jsonHandler<PlanGroupLink>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete a PlanGroupLink for the given UUID. */
    override fun delete(
        params: PlanGroupLinkDeleteParams,
        requestOptions: RequestOptions,
    ): PlanGroupLink {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "plangrouplinks",
                    params.getPathParam(1),
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { deleteHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
