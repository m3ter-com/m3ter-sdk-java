// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.core.ClientOptions
import com.m3ter.core.JsonValue
import com.m3ter.core.RequestOptions
import com.m3ter.core.checkRequired
import com.m3ter.core.handlers.errorHandler
import com.m3ter.core.handlers.jsonHandler
import com.m3ter.core.handlers.withErrorHandler
import com.m3ter.core.http.HttpMethod
import com.m3ter.core.http.HttpRequest
import com.m3ter.core.http.HttpResponse.Handler
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.core.http.json
import com.m3ter.core.http.parseable
import com.m3ter.core.prepare
import com.m3ter.models.PlanGroupCreateParams
import com.m3ter.models.PlanGroupDeleteParams
import com.m3ter.models.PlanGroupListPage
import com.m3ter.models.PlanGroupListPageResponse
import com.m3ter.models.PlanGroupListParams
import com.m3ter.models.PlanGroupResponse
import com.m3ter.models.PlanGroupRetrieveParams
import com.m3ter.models.PlanGroupUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class PlanGroupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PlanGroupService {

    private val withRawResponse: PlanGroupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlanGroupService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PlanGroupService =
        PlanGroupServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PlanGroupCreateParams,
        requestOptions: RequestOptions,
    ): PlanGroupResponse =
        // post /organizations/{orgId}/plangroups
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PlanGroupRetrieveParams,
        requestOptions: RequestOptions,
    ): PlanGroupResponse =
        // get /organizations/{orgId}/plangroups/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PlanGroupUpdateParams,
        requestOptions: RequestOptions,
    ): PlanGroupResponse =
        // put /organizations/{orgId}/plangroups/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PlanGroupListParams,
        requestOptions: RequestOptions,
    ): PlanGroupListPage =
        // get /organizations/{orgId}/plangroups
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: PlanGroupDeleteParams,
        requestOptions: RequestOptions,
    ): PlanGroupResponse =
        // delete /organizations/{orgId}/plangroups/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlanGroupService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PlanGroupService.WithRawResponse =
            PlanGroupServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PlanGroupResponse> =
            jsonHandler<PlanGroupResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: PlanGroupCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroupResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "plangroups",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<PlanGroupResponse> =
            jsonHandler<PlanGroupResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PlanGroupRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroupResponse> {
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
                        "plangroups",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<PlanGroupResponse> =
            jsonHandler<PlanGroupResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: PlanGroupUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroupResponse> {
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
                        "plangroups",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<PlanGroupListPageResponse> =
            jsonHandler<PlanGroupListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PlanGroupListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroupListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "plangroups",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PlanGroupListPage.builder()
                            .service(PlanGroupServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<PlanGroupResponse> =
            jsonHandler<PlanGroupResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: PlanGroupDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PlanGroupResponse> {
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
                        "plangroups",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
