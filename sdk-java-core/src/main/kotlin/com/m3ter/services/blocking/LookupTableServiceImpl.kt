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
import com.m3ter.models.LookupTableCreateParams
import com.m3ter.models.LookupTableDeleteParams
import com.m3ter.models.LookupTableListPage
import com.m3ter.models.LookupTableListPageResponse
import com.m3ter.models.LookupTableListParams
import com.m3ter.models.LookupTableResponse
import com.m3ter.models.LookupTableRetrieveParams
import com.m3ter.models.LookupTableUpdateParams
import com.m3ter.services.blocking.lookupTables.LookupTableRevisionDataService
import com.m3ter.services.blocking.lookupTables.LookupTableRevisionDataServiceImpl
import com.m3ter.services.blocking.lookupTables.LookupTableRevisionService
import com.m3ter.services.blocking.lookupTables.LookupTableRevisionServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LookupTableServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LookupTableService {

    private val withRawResponse: LookupTableService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val lookupTableRevisions: LookupTableRevisionService by lazy {
        LookupTableRevisionServiceImpl(clientOptions)
    }

    private val lookupTableRevisionData: LookupTableRevisionDataService by lazy {
        LookupTableRevisionDataServiceImpl(clientOptions)
    }

    override fun withRawResponse(): LookupTableService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LookupTableService =
        LookupTableServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun lookupTableRevisions(): LookupTableRevisionService = lookupTableRevisions

    override fun lookupTableRevisionData(): LookupTableRevisionDataService = lookupTableRevisionData

    override fun create(
        params: LookupTableCreateParams,
        requestOptions: RequestOptions,
    ): LookupTableResponse =
        // post /organizations/{orgId}/lookuptables
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: LookupTableRetrieveParams,
        requestOptions: RequestOptions,
    ): LookupTableResponse =
        // get /organizations/{orgId}/lookuptables/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: LookupTableUpdateParams,
        requestOptions: RequestOptions,
    ): LookupTableResponse =
        // put /organizations/{orgId}/lookuptables/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: LookupTableListParams,
        requestOptions: RequestOptions,
    ): LookupTableListPage =
        // get /organizations/{orgId}/lookuptables
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: LookupTableDeleteParams,
        requestOptions: RequestOptions,
    ): LookupTableResponse =
        // delete /organizations/{orgId}/lookuptables/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LookupTableService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val lookupTableRevisions: LookupTableRevisionService.WithRawResponse by lazy {
            LookupTableRevisionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val lookupTableRevisionData:
            LookupTableRevisionDataService.WithRawResponse by lazy {
            LookupTableRevisionDataServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LookupTableService.WithRawResponse =
            LookupTableServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun lookupTableRevisions(): LookupTableRevisionService.WithRawResponse =
            lookupTableRevisions

        override fun lookupTableRevisionData(): LookupTableRevisionDataService.WithRawResponse =
            lookupTableRevisionData

        private val createHandler: Handler<LookupTableResponse> =
            jsonHandler<LookupTableResponse>(clientOptions.jsonMapper)

        override fun create(
            params: LookupTableCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupTableResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "lookuptables",
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

        private val retrieveHandler: Handler<LookupTableResponse> =
            jsonHandler<LookupTableResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: LookupTableRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupTableResponse> {
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
                        "lookuptables",
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

        private val updateHandler: Handler<LookupTableResponse> =
            jsonHandler<LookupTableResponse>(clientOptions.jsonMapper)

        override fun update(
            params: LookupTableUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupTableResponse> {
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
                        "lookuptables",
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

        private val listHandler: Handler<LookupTableListPageResponse> =
            jsonHandler<LookupTableListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: LookupTableListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupTableListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "lookuptables",
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
                        LookupTableListPage.builder()
                            .service(LookupTableServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<LookupTableResponse> =
            jsonHandler<LookupTableResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: LookupTableDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupTableResponse> {
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
                        "lookuptables",
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
