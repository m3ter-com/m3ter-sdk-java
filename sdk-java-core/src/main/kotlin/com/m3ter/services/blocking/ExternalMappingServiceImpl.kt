// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.checkRequired
import com.m3ter.core.handlers.errorBodyHandler
import com.m3ter.core.handlers.errorHandler
import com.m3ter.core.handlers.jsonHandler
import com.m3ter.core.http.HttpMethod
import com.m3ter.core.http.HttpRequest
import com.m3ter.core.http.HttpResponse
import com.m3ter.core.http.HttpResponse.Handler
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.core.http.json
import com.m3ter.core.http.parseable
import com.m3ter.core.prepare
import com.m3ter.models.ExternalMappingCreateParams
import com.m3ter.models.ExternalMappingDeleteParams
import com.m3ter.models.ExternalMappingListByExternalEntityPage
import com.m3ter.models.ExternalMappingListByExternalEntityPageResponse
import com.m3ter.models.ExternalMappingListByExternalEntityParams
import com.m3ter.models.ExternalMappingListByM3terEntityPage
import com.m3ter.models.ExternalMappingListByM3terEntityPageResponse
import com.m3ter.models.ExternalMappingListByM3terEntityParams
import com.m3ter.models.ExternalMappingListPage
import com.m3ter.models.ExternalMappingListPageResponse
import com.m3ter.models.ExternalMappingListParams
import com.m3ter.models.ExternalMappingResponse
import com.m3ter.models.ExternalMappingRetrieveParams
import com.m3ter.models.ExternalMappingUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExternalMappingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExternalMappingService {

    private val withRawResponse: ExternalMappingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalMappingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalMappingService =
        ExternalMappingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ExternalMappingCreateParams,
        requestOptions: RequestOptions,
    ): ExternalMappingResponse =
        // post /organizations/{orgId}/externalmappings
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ExternalMappingRetrieveParams,
        requestOptions: RequestOptions,
    ): ExternalMappingResponse =
        // get /organizations/{orgId}/externalmappings/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ExternalMappingUpdateParams,
        requestOptions: RequestOptions,
    ): ExternalMappingResponse =
        // put /organizations/{orgId}/externalmappings/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: ExternalMappingListParams,
        requestOptions: RequestOptions,
    ): ExternalMappingListPage =
        // get /organizations/{orgId}/externalmappings
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ExternalMappingDeleteParams,
        requestOptions: RequestOptions,
    ): ExternalMappingResponse =
        // delete /organizations/{orgId}/externalmappings/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun listByExternalEntity(
        params: ExternalMappingListByExternalEntityParams,
        requestOptions: RequestOptions,
    ): ExternalMappingListByExternalEntityPage =
        // get
        // /organizations/{orgId}/externalmappings/externalid/{system}/{externalTable}/{externalId}
        withRawResponse().listByExternalEntity(params, requestOptions).parse()

    override fun listByM3terEntity(
        params: ExternalMappingListByM3terEntityParams,
        requestOptions: RequestOptions,
    ): ExternalMappingListByM3terEntityPage =
        // get /organizations/{orgId}/externalmappings/external/{entity}/{m3terId}
        withRawResponse().listByM3terEntity(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalMappingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalMappingService.WithRawResponse =
            ExternalMappingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ExternalMappingResponse> =
            jsonHandler<ExternalMappingResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ExternalMappingCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalMappingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "externalmappings",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<ExternalMappingResponse> =
            jsonHandler<ExternalMappingResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ExternalMappingRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalMappingResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "externalmappings",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<ExternalMappingResponse> =
            jsonHandler<ExternalMappingResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ExternalMappingUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalMappingResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "externalmappings",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<ExternalMappingListPageResponse> =
            jsonHandler<ExternalMappingListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ExternalMappingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalMappingListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "externalmappings",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ExternalMappingListPage.builder()
                            .service(ExternalMappingServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<ExternalMappingResponse> =
            jsonHandler<ExternalMappingResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ExternalMappingDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalMappingResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "externalmappings",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listByExternalEntityHandler:
            Handler<ExternalMappingListByExternalEntityPageResponse> =
            jsonHandler<ExternalMappingListByExternalEntityPageResponse>(clientOptions.jsonMapper)

        override fun listByExternalEntity(
            params: ExternalMappingListByExternalEntityParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalMappingListByExternalEntityPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("externalId", params.externalId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "externalmappings",
                        "externalid",
                        params._pathParam(1),
                        params._pathParam(2),
                        params._pathParam(3),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listByExternalEntityHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ExternalMappingListByExternalEntityPage.builder()
                            .service(ExternalMappingServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listByM3terEntityHandler:
            Handler<ExternalMappingListByM3terEntityPageResponse> =
            jsonHandler<ExternalMappingListByM3terEntityPageResponse>(clientOptions.jsonMapper)

        override fun listByM3terEntity(
            params: ExternalMappingListByM3terEntityParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalMappingListByM3terEntityPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("m3terId", params.m3terId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "externalmappings",
                        "external",
                        params._pathParam(1),
                        params._pathParam(2),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listByM3terEntityHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ExternalMappingListByM3terEntityPage.builder()
                            .service(ExternalMappingServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
