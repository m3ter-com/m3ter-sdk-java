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
import com.m3ter.models.CurrencyCreateParams
import com.m3ter.models.CurrencyDeleteParams
import com.m3ter.models.CurrencyListPage
import com.m3ter.models.CurrencyListPageResponse
import com.m3ter.models.CurrencyListParams
import com.m3ter.models.CurrencyResponse
import com.m3ter.models.CurrencyRetrieveParams
import com.m3ter.models.CurrencyUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CurrencyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CurrencyService {

    private val withRawResponse: CurrencyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CurrencyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CurrencyService =
        CurrencyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CurrencyCreateParams,
        requestOptions: RequestOptions,
    ): CurrencyResponse =
        // post /organizations/{orgId}/picklists/currency
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CurrencyRetrieveParams,
        requestOptions: RequestOptions,
    ): CurrencyResponse =
        // get /organizations/{orgId}/picklists/currency/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: CurrencyUpdateParams,
        requestOptions: RequestOptions,
    ): CurrencyResponse =
        // put /organizations/{orgId}/picklists/currency/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: CurrencyListParams,
        requestOptions: RequestOptions,
    ): CurrencyListPage =
        // get /organizations/{orgId}/picklists/currency
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: CurrencyDeleteParams,
        requestOptions: RequestOptions,
    ): CurrencyResponse =
        // delete /organizations/{orgId}/picklists/currency/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CurrencyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CurrencyService.WithRawResponse =
            CurrencyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CurrencyResponse> =
            jsonHandler<CurrencyResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CurrencyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencyResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "picklists",
                        "currency",
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

        private val retrieveHandler: Handler<CurrencyResponse> =
            jsonHandler<CurrencyResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CurrencyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencyResponse> {
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
                        "picklists",
                        "currency",
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

        private val updateHandler: Handler<CurrencyResponse> =
            jsonHandler<CurrencyResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CurrencyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencyResponse> {
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
                        "picklists",
                        "currency",
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

        private val listHandler: Handler<CurrencyListPageResponse> =
            jsonHandler<CurrencyListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CurrencyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencyListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "picklists",
                        "currency",
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
                        CurrencyListPage.builder()
                            .service(CurrencyServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<CurrencyResponse> =
            jsonHandler<CurrencyResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: CurrencyDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CurrencyResponse> {
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
                        "picklists",
                        "currency",
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
