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
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.core.http.parseable
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.PlanTemplate
import com.m3ter.sdk.models.PlanTemplateCreateParams
import com.m3ter.sdk.models.PlanTemplateDeleteParams
import com.m3ter.sdk.models.PlanTemplateListPageAsync
import com.m3ter.sdk.models.PlanTemplateListParams
import com.m3ter.sdk.models.PlanTemplateRetrieveParams
import com.m3ter.sdk.models.PlanTemplateUpdateParams
import java.util.concurrent.CompletableFuture

class PlanTemplateServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PlanTemplateServiceAsync {

    private val withRawResponse: PlanTemplateServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlanTemplateServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: PlanTemplateCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanTemplate> =
        // post /organizations/{orgId}/plantemplates
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: PlanTemplateRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanTemplate> =
        // get /organizations/{orgId}/plantemplates/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: PlanTemplateUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanTemplate> =
        // put /organizations/{orgId}/plantemplates/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PlanTemplateListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanTemplateListPageAsync> =
        // get /organizations/{orgId}/plantemplates
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: PlanTemplateDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PlanTemplate> =
        // delete /organizations/{orgId}/plantemplates/{id}
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlanTemplateServiceAsync.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PlanTemplate> =
            jsonHandler<PlanTemplate>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: PlanTemplateCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanTemplate>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "plantemplates")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<PlanTemplate> =
            jsonHandler<PlanTemplate>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PlanTemplateRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanTemplate>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "plantemplates",
                        params.getPathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<PlanTemplate> =
            jsonHandler<PlanTemplate>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: PlanTemplateUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanTemplate>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "plantemplates",
                        params.getPathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<PlanTemplateListPageAsync.Response> =
            jsonHandler<PlanTemplateListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PlanTemplateListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanTemplateListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "plantemplates")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                PlanTemplateListPageAsync.of(
                                    PlanTemplateServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<PlanTemplate> =
            jsonHandler<PlanTemplate>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: PlanTemplateDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PlanTemplate>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "plantemplates",
                        params.getPathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { deleteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
