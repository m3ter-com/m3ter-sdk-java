// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.lookupTables

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
import com.m3ter.models.LookupTableLookupTableRevisionDataArchieveParams
import com.m3ter.models.LookupTableLookupTableRevisionDataArchieveResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataCopyParams
import com.m3ter.models.LookupTableLookupTableRevisionDataCopyResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataDeleteKeyParams
import com.m3ter.models.LookupTableLookupTableRevisionDataDeleteKeyResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataDeleteParams
import com.m3ter.models.LookupTableLookupTableRevisionDataDeleteResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataGenerateDownloadUrlParams
import com.m3ter.models.LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataRetrieveKeyParams
import com.m3ter.models.LookupTableLookupTableRevisionDataRetrieveKeyResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataRetrieveParams
import com.m3ter.models.LookupTableLookupTableRevisionDataRetrieveResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataUpdateKeyParams
import com.m3ter.models.LookupTableLookupTableRevisionDataUpdateKeyResponse
import com.m3ter.models.LookupTableLookupTableRevisionDataUpdateParams
import com.m3ter.models.LookupTableLookupTableRevisionDataUpdateResponse
import com.m3ter.services.blocking.lookupTables.lookupTableRevisionData.LookupTableRevisionDataJobService
import com.m3ter.services.blocking.lookupTables.lookupTableRevisionData.LookupTableRevisionDataJobServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LookupTableRevisionDataServiceImpl
internal constructor(private val clientOptions: ClientOptions) : LookupTableRevisionDataService {

    private val withRawResponse: LookupTableRevisionDataService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val lookupTableRevisionDataJobs: LookupTableRevisionDataJobService by lazy {
        LookupTableRevisionDataJobServiceImpl(clientOptions)
    }

    override fun withRawResponse(): LookupTableRevisionDataService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): LookupTableRevisionDataService =
        LookupTableRevisionDataServiceImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun lookupTableRevisionDataJobs(): LookupTableRevisionDataJobService =
        lookupTableRevisionDataJobs

    override fun retrieve(
        params: LookupTableLookupTableRevisionDataRetrieveParams,
        requestOptions: RequestOptions,
    ): LookupTableLookupTableRevisionDataRetrieveResponse =
        // get
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: LookupTableLookupTableRevisionDataUpdateParams,
        requestOptions: RequestOptions,
    ): LookupTableLookupTableRevisionDataUpdateResponse =
        // put
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(
        params: LookupTableLookupTableRevisionDataDeleteParams,
        requestOptions: RequestOptions,
    ): LookupTableLookupTableRevisionDataDeleteResponse =
        // delete
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data
        withRawResponse().delete(params, requestOptions).parse()

    override fun archieve(
        params: LookupTableLookupTableRevisionDataArchieveParams,
        requestOptions: RequestOptions,
    ): LookupTableLookupTableRevisionDataArchieveResponse =
        // post
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/archived
        withRawResponse().archieve(params, requestOptions).parse()

    override fun copy(
        params: LookupTableLookupTableRevisionDataCopyParams,
        requestOptions: RequestOptions,
    ): LookupTableLookupTableRevisionDataCopyResponse =
        // post
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/copy
        withRawResponse().copy(params, requestOptions).parse()

    override fun deleteKey(
        params: LookupTableLookupTableRevisionDataDeleteKeyParams,
        requestOptions: RequestOptions,
    ): LookupTableLookupTableRevisionDataDeleteKeyResponse =
        // delete
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/{lookupKey}
        withRawResponse().deleteKey(params, requestOptions).parse()

    override fun generateDownloadUrl(
        params: LookupTableLookupTableRevisionDataGenerateDownloadUrlParams,
        requestOptions: RequestOptions,
    ): LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse =
        // post
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/generateuploadurl
        withRawResponse().generateDownloadUrl(params, requestOptions).parse()

    override fun retrieveKey(
        params: LookupTableLookupTableRevisionDataRetrieveKeyParams,
        requestOptions: RequestOptions,
    ): LookupTableLookupTableRevisionDataRetrieveKeyResponse =
        // get
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/{lookupKey}
        withRawResponse().retrieveKey(params, requestOptions).parse()

    override fun updateKey(
        params: LookupTableLookupTableRevisionDataUpdateKeyParams,
        requestOptions: RequestOptions,
    ): LookupTableLookupTableRevisionDataUpdateKeyResponse =
        // put
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/{lookupKey}
        withRawResponse().updateKey(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LookupTableRevisionDataService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val lookupTableRevisionDataJobs:
            LookupTableRevisionDataJobService.WithRawResponse by lazy {
            LookupTableRevisionDataJobServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LookupTableRevisionDataService.WithRawResponse =
            LookupTableRevisionDataServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun lookupTableRevisionDataJobs():
            LookupTableRevisionDataJobService.WithRawResponse = lookupTableRevisionDataJobs

        private val retrieveHandler: Handler<LookupTableLookupTableRevisionDataRetrieveResponse> =
            jsonHandler<LookupTableLookupTableRevisionDataRetrieveResponse>(
                clientOptions.jsonMapper
            )

        override fun retrieve(
            params: LookupTableLookupTableRevisionDataRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveResponse> {
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

        private val updateHandler: Handler<LookupTableLookupTableRevisionDataUpdateResponse> =
            jsonHandler<LookupTableLookupTableRevisionDataUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: LookupTableLookupTableRevisionDataUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataUpdateResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("lookupTableRevisionId", params.lookupTableRevisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "lookuptables",
                        params._pathParam(1),
                        "revisions",
                        params._pathParam(2),
                        "data",
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

        private val deleteHandler: Handler<LookupTableLookupTableRevisionDataDeleteResponse> =
            jsonHandler<LookupTableLookupTableRevisionDataDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: LookupTableLookupTableRevisionDataDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataDeleteResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("lookupTableRevisionId", params.lookupTableRevisionId().getOrNull())
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

        private val archieveHandler: Handler<LookupTableLookupTableRevisionDataArchieveResponse> =
            jsonHandler<LookupTableLookupTableRevisionDataArchieveResponse>(
                clientOptions.jsonMapper
            )

        override fun archieve(
            params: LookupTableLookupTableRevisionDataArchieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataArchieveResponse> {
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
                        "archived",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { archieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val copyHandler: Handler<LookupTableLookupTableRevisionDataCopyResponse> =
            jsonHandler<LookupTableLookupTableRevisionDataCopyResponse>(clientOptions.jsonMapper)

        override fun copy(
            params: LookupTableLookupTableRevisionDataCopyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataCopyResponse> {
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
                        "copy",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { copyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteKeyHandler: Handler<LookupTableLookupTableRevisionDataDeleteKeyResponse> =
            jsonHandler<LookupTableLookupTableRevisionDataDeleteKeyResponse>(
                clientOptions.jsonMapper
            )

        override fun deleteKey(
            params: LookupTableLookupTableRevisionDataDeleteKeyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataDeleteKeyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("lookupKey", params.lookupKey().getOrNull())
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
                        params._pathParam(3),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deleteKeyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val generateDownloadUrlHandler:
            Handler<LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse> =
            jsonHandler<LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse>(
                clientOptions.jsonMapper
            )

        override fun generateDownloadUrl(
            params: LookupTableLookupTableRevisionDataGenerateDownloadUrlParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse> {
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
                        "generateuploadurl",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { generateDownloadUrlHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveKeyHandler:
            Handler<LookupTableLookupTableRevisionDataRetrieveKeyResponse> =
            jsonHandler<LookupTableLookupTableRevisionDataRetrieveKeyResponse>(
                clientOptions.jsonMapper
            )

        override fun retrieveKey(
            params: LookupTableLookupTableRevisionDataRetrieveKeyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveKeyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("lookupKey", params.lookupKey().getOrNull())
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
                        params._pathParam(3),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveKeyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateKeyHandler: Handler<LookupTableLookupTableRevisionDataUpdateKeyResponse> =
            jsonHandler<LookupTableLookupTableRevisionDataUpdateKeyResponse>(
                clientOptions.jsonMapper
            )

        override fun updateKey(
            params: LookupTableLookupTableRevisionDataUpdateKeyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupTableLookupTableRevisionDataUpdateKeyResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("lookupKey", params.lookupKey().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "lookuptables",
                        params._pathParam(1),
                        "revisions",
                        params._pathParam(2),
                        "data",
                        params._pathParam(3),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateKeyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
