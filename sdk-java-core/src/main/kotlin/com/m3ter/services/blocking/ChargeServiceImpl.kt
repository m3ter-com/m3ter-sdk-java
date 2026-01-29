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
import com.m3ter.models.ChargeCreateParams
import com.m3ter.models.ChargeCreateResponse
import com.m3ter.models.ChargeDeleteParams
import com.m3ter.models.ChargeDeleteResponse
import com.m3ter.models.ChargeListPage
import com.m3ter.models.ChargeListPageResponse
import com.m3ter.models.ChargeListParams
import com.m3ter.models.ChargeRetrieveParams
import com.m3ter.models.ChargeRetrieveResponse
import com.m3ter.models.ChargeUpdateParams
import com.m3ter.models.ChargeUpdateResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ChargeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ChargeService {

    private val withRawResponse: ChargeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ChargeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ChargeService =
        ChargeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ChargeCreateParams,
        requestOptions: RequestOptions,
    ): ChargeCreateResponse =
        // post /organizations/{orgId}/charges
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ChargeRetrieveParams,
        requestOptions: RequestOptions,
    ): ChargeRetrieveResponse =
        // get /organizations/{orgId}/charges/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: ChargeUpdateParams,
        requestOptions: RequestOptions,
    ): ChargeUpdateResponse =
        // put /organizations/{orgId}/charges/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: ChargeListParams, requestOptions: RequestOptions): ChargeListPage =
        // get /organizations/{orgId}/charges
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: ChargeDeleteParams,
        requestOptions: RequestOptions,
    ): ChargeDeleteResponse =
        // delete /organizations/{orgId}/charges/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ChargeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ChargeService.WithRawResponse =
            ChargeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ChargeCreateResponse> =
            jsonHandler<ChargeCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: ChargeCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChargeCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "charges",
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

        private val retrieveHandler: Handler<ChargeRetrieveResponse> =
            jsonHandler<ChargeRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ChargeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChargeRetrieveResponse> {
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
                        "charges",
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

        private val updateHandler: Handler<ChargeUpdateResponse> =
            jsonHandler<ChargeUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: ChargeUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChargeUpdateResponse> {
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
                        "charges",
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

        private val listHandler: Handler<ChargeListPageResponse> =
            jsonHandler<ChargeListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ChargeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChargeListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "charges",
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
                        ChargeListPage.builder()
                            .service(ChargeServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<ChargeDeleteResponse> =
            jsonHandler<ChargeDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: ChargeDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ChargeDeleteResponse> {
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
                        "charges",
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
    }
}
