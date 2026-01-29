// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.lookupTables

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
import com.m3ter.core.prepareAsync
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
import com.m3ter.services.async.lookupTables.lookupTableRevisionData.LookupTableRevisionDataJobServiceAsync
import com.m3ter.services.async.lookupTables.lookupTableRevisionData.LookupTableRevisionDataJobServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class LookupTableRevisionDataServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    LookupTableRevisionDataServiceAsync {

    private val withRawResponse: LookupTableRevisionDataServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val lookupTableRevisionDataJobs: LookupTableRevisionDataJobServiceAsync by lazy {
        LookupTableRevisionDataJobServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): LookupTableRevisionDataServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): LookupTableRevisionDataServiceAsync =
        LookupTableRevisionDataServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun lookupTableRevisionDataJobs(): LookupTableRevisionDataJobServiceAsync =
        lookupTableRevisionDataJobs

    override fun retrieve(
        params: LookupTableLookupTableRevisionDataRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableLookupTableRevisionDataRetrieveResponse> =
        // get
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: LookupTableLookupTableRevisionDataUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableLookupTableRevisionDataUpdateResponse> =
        // put
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: LookupTableLookupTableRevisionDataDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableLookupTableRevisionDataDeleteResponse> =
        // delete
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data
        withRawResponse().delete(params, requestOptions).thenApply { it.parse() }

    override fun archieve(
        params: LookupTableLookupTableRevisionDataArchieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableLookupTableRevisionDataArchieveResponse> =
        // post
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/archived
        withRawResponse().archieve(params, requestOptions).thenApply { it.parse() }

    override fun copy(
        params: LookupTableLookupTableRevisionDataCopyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableLookupTableRevisionDataCopyResponse> =
        // post
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/copy
        withRawResponse().copy(params, requestOptions).thenApply { it.parse() }

    override fun deleteKey(
        params: LookupTableLookupTableRevisionDataDeleteKeyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableLookupTableRevisionDataDeleteKeyResponse> =
        // delete
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/{lookupKey}
        withRawResponse().deleteKey(params, requestOptions).thenApply { it.parse() }

    override fun generateDownloadUrl(
        params: LookupTableLookupTableRevisionDataGenerateDownloadUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse> =
        // post
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/generateuploadurl
        withRawResponse().generateDownloadUrl(params, requestOptions).thenApply { it.parse() }

    override fun retrieveKey(
        params: LookupTableLookupTableRevisionDataRetrieveKeyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableLookupTableRevisionDataRetrieveKeyResponse> =
        // get
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/{lookupKey}
        withRawResponse().retrieveKey(params, requestOptions).thenApply { it.parse() }

    override fun updateKey(
        params: LookupTableLookupTableRevisionDataUpdateKeyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupTableLookupTableRevisionDataUpdateKeyResponse> =
        // put
        // /organizations/{orgId}/lookuptables/{lookupTableId}/revisions/{lookupTableRevisionId}/data/{lookupKey}
        withRawResponse().updateKey(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LookupTableRevisionDataServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val lookupTableRevisionDataJobs:
            LookupTableRevisionDataJobServiceAsync.WithRawResponse by lazy {
            LookupTableRevisionDataJobServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LookupTableRevisionDataServiceAsync.WithRawResponse =
            LookupTableRevisionDataServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun lookupTableRevisionDataJobs():
            LookupTableRevisionDataJobServiceAsync.WithRawResponse = lookupTableRevisionDataJobs

        private val retrieveHandler: Handler<LookupTableLookupTableRevisionDataRetrieveResponse> =
            jsonHandler<LookupTableLookupTableRevisionDataRetrieveResponse>(
                clientOptions.jsonMapper
            )

        override fun retrieve(
            params: LookupTableLookupTableRevisionDataRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val updateHandler: Handler<LookupTableLookupTableRevisionDataUpdateResponse> =
            jsonHandler<LookupTableLookupTableRevisionDataUpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: LookupTableLookupTableRevisionDataUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataUpdateResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val deleteHandler: Handler<LookupTableLookupTableRevisionDataDeleteResponse> =
            jsonHandler<LookupTableLookupTableRevisionDataDeleteResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: LookupTableLookupTableRevisionDataDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataDeleteResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val archieveHandler: Handler<LookupTableLookupTableRevisionDataArchieveResponse> =
            jsonHandler<LookupTableLookupTableRevisionDataArchieveResponse>(
                clientOptions.jsonMapper
            )

        override fun archieve(
            params: LookupTableLookupTableRevisionDataArchieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataArchieveResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { archieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val copyHandler: Handler<LookupTableLookupTableRevisionDataCopyResponse> =
            jsonHandler<LookupTableLookupTableRevisionDataCopyResponse>(clientOptions.jsonMapper)

        override fun copy(
            params: LookupTableLookupTableRevisionDataCopyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataCopyResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { copyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataDeleteKeyResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deleteKeyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<
            HttpResponseFor<LookupTableLookupTableRevisionDataGenerateDownloadUrlResponse>
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
                        "generateuploadurl",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { generateDownloadUrlHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<
            HttpResponseFor<LookupTableLookupTableRevisionDataRetrieveKeyResponse>
        > {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveKeyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<LookupTableLookupTableRevisionDataUpdateKeyResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
