// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.balances

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
import com.m3ter.models.BalanceTransactionScheduleCreateParams
import com.m3ter.models.BalanceTransactionScheduleDeleteParams
import com.m3ter.models.BalanceTransactionScheduleListPage
import com.m3ter.models.BalanceTransactionScheduleListPageResponse
import com.m3ter.models.BalanceTransactionScheduleListParams
import com.m3ter.models.BalanceTransactionSchedulePreviewParams
import com.m3ter.models.BalanceTransactionScheduleRetrieveParams
import com.m3ter.models.BalanceTransactionScheduleUpdateParams
import com.m3ter.models.ScheduleResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TransactionScheduleServiceImpl
internal constructor(private val clientOptions: ClientOptions) : TransactionScheduleService {

    private val withRawResponse: TransactionScheduleService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransactionScheduleService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): TransactionScheduleService =
        TransactionScheduleServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: BalanceTransactionScheduleCreateParams,
        requestOptions: RequestOptions,
    ): ScheduleResponse =
        // post /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: BalanceTransactionScheduleRetrieveParams,
        requestOptions: RequestOptions,
    ): ScheduleResponse =
        // get /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: BalanceTransactionScheduleUpdateParams,
        requestOptions: RequestOptions,
    ): ScheduleResponse =
        // put /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: BalanceTransactionScheduleListParams,
        requestOptions: RequestOptions,
    ): BalanceTransactionScheduleListPage =
        // get /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: BalanceTransactionScheduleDeleteParams,
        requestOptions: RequestOptions,
    ): ScheduleResponse =
        // delete /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun preview(
        params: BalanceTransactionSchedulePreviewParams,
        requestOptions: RequestOptions,
    ): ScheduleResponse =
        // post /organizations/{orgId}/balances/{balanceId}/balancetransactionschedules/preview
        withRawResponse().preview(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionScheduleService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionScheduleService.WithRawResponse =
            TransactionScheduleServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ScheduleResponse> =
            jsonHandler<ScheduleResponse>(clientOptions.jsonMapper)

        override fun create(
            params: BalanceTransactionScheduleCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduleResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("balanceId", params.balanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "balances",
                        params._pathParam(1),
                        "balancetransactionschedules",
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

        private val retrieveHandler: Handler<ScheduleResponse> =
            jsonHandler<ScheduleResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BalanceTransactionScheduleRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduleResponse> {
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
                        "balances",
                        params._pathParam(1),
                        "balancetransactionschedules",
                        params._pathParam(2),
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

        private val updateHandler: Handler<ScheduleResponse> =
            jsonHandler<ScheduleResponse>(clientOptions.jsonMapper)

        override fun update(
            params: BalanceTransactionScheduleUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduleResponse> {
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
                        "balances",
                        params._pathParam(1),
                        "balancetransactionschedules",
                        params._pathParam(2),
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

        private val listHandler: Handler<BalanceTransactionScheduleListPageResponse> =
            jsonHandler<BalanceTransactionScheduleListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BalanceTransactionScheduleListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceTransactionScheduleListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("balanceId", params.balanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "balances",
                        params._pathParam(1),
                        "balancetransactionschedules",
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
                        BalanceTransactionScheduleListPage.builder()
                            .service(TransactionScheduleServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<ScheduleResponse> =
            jsonHandler<ScheduleResponse>(clientOptions.jsonMapper)

        override fun delete(
            params: BalanceTransactionScheduleDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduleResponse> {
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
                        "balances",
                        params._pathParam(1),
                        "balancetransactionschedules",
                        params._pathParam(2),
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

        private val previewHandler: Handler<ScheduleResponse> =
            jsonHandler<ScheduleResponse>(clientOptions.jsonMapper)

        override fun preview(
            params: BalanceTransactionSchedulePreviewParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ScheduleResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("balanceId", params.balanceId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "balances",
                        params._pathParam(1),
                        "balancetransactionschedules",
                        "preview",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { previewHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
