// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.lookupTables.lookupTableRevisionData

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
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams
import com.m3ter.models.LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LookupTableRevisionDataJobServiceImpl
internal constructor(private val clientOptions: ClientOptions) : LookupTableRevisionDataJobService {

    private val withRawResponse: LookupTableRevisionDataJobService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LookupTableRevisionDataJobService.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): LookupTableRevisionDataJobService =
        LookupTableRevisionDataJobServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun retrieve(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams,
        requestOptions: RequestOptions,
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse =
        // get
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/jobs/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams,
        requestOptions: RequestOptions,
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage =
        // get
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/jobs
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams,
        requestOptions: RequestOptions,
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse =
        // delete
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/jobs/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun download(
        params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams,
        requestOptions: RequestOptions,
    ): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse =
        // post
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/jobs/download
        withRawResponse().download(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LookupTableRevisionDataJobService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LookupTableRevisionDataJobService.WithRawResponse =
            LookupTableRevisionDataJobServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler:
            Handler<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse> =
            jsonHandler<
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
            >(
                clientOptions.jsonMapper
            )

        override fun retrieve(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
        > {
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
                        "revisions",
                        params._pathParam(2),
                        "data",
                        "jobs",
                        params._pathParam(3),
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

        private val listHandler:
            Handler<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse> =
            jsonHandler<
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse
            >(
                clientOptions.jsonMapper
            )

        override fun list(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("lookupTableRevisionId", params.lookupTableRevisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "lookuptables",
                        params._pathParam(1),
                        "revisions",
                        params._pathParam(2),
                        "data",
                        "jobs",
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
                        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage
                            .builder()
                            .service(LookupTableRevisionDataJobServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler:
            Handler<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse> =
            jsonHandler<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse>(
                clientOptions.jsonMapper
            )

        override fun delete(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDeleteResponse
        > {
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
                        "revisions",
                        params._pathParam(2),
                        "data",
                        "jobs",
                        params._pathParam(3),
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

        private val downloadHandler:
            Handler<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse> =
            jsonHandler<
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
            >(
                clientOptions.jsonMapper
            )

        override fun download(
            params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobDownloadResponse
        > {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("lookupTableRevisionId", params.lookupTableRevisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "lookuptables",
                        params._pathParam(1),
                        "revisions",
                        params._pathParam(2),
                        "data",
                        "jobs",
                        "download",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { downloadHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
