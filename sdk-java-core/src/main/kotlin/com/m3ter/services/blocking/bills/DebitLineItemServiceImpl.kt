// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.bills

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
import com.m3ter.models.BillDebitLineItemCreateParams
import com.m3ter.models.BillDebitLineItemDeleteParams
import com.m3ter.models.BillDebitLineItemListPage
import com.m3ter.models.BillDebitLineItemListPageResponse
import com.m3ter.models.BillDebitLineItemListParams
import com.m3ter.models.BillDebitLineItemRetrieveParams
import com.m3ter.models.BillDebitLineItemUpdateParams
import com.m3ter.models.DebitLineItemResponse
import kotlin.jvm.optionals.getOrNull

class DebitLineItemServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DebitLineItemService {

    private val withRawResponse: DebitLineItemService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DebitLineItemService.WithRawResponse = withRawResponse

    override fun create(
        params: BillDebitLineItemCreateParams,
        requestOptions: RequestOptions,
    ): DebitLineItemResponse =
        // post /organizations/{orgId}/bills/{billId}/debitlineitems
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: BillDebitLineItemRetrieveParams,
        requestOptions: RequestOptions,
    ): DebitLineItemResponse =
        // get /organizations/{orgId}/bills/{billId}/debitlineitems/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: BillDebitLineItemUpdateParams,
        requestOptions: RequestOptions,
    ): DebitLineItemResponse =
        // put /organizations/{orgId}/bills/{billId}/debitlineitems/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: BillDebitLineItemListParams,
        requestOptions: RequestOptions,
    ): BillDebitLineItemListPage =
        // get /organizations/{orgId}/bills/{billId}/debitlineitems
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: BillDebitLineItemDeleteParams,
        requestOptions: RequestOptions,
    ): DebitLineItemResponse =
        // delete /organizations/{orgId}/bills/{billId}/debitlineitems/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DebitLineItemService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<DebitLineItemResponse> =
            jsonHandler<DebitLineItemResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: BillDebitLineItemCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DebitLineItemResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("billId", params.billId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "bills",
                        params._pathParam(1),
                        "debitlineitems",
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

        private val retrieveHandler: Handler<DebitLineItemResponse> =
            jsonHandler<DebitLineItemResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: BillDebitLineItemRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DebitLineItemResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "bills",
                        params._pathParam(1),
                        "debitlineitems",
                        params._pathParam(2),
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

        private val updateHandler: Handler<DebitLineItemResponse> =
            jsonHandler<DebitLineItemResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: BillDebitLineItemUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DebitLineItemResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "bills",
                        params._pathParam(1),
                        "debitlineitems",
                        params._pathParam(2),
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

        private val listHandler: Handler<BillDebitLineItemListPageResponse> =
            jsonHandler<BillDebitLineItemListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: BillDebitLineItemListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillDebitLineItemListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("billId", params.billId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "bills",
                        params._pathParam(1),
                        "debitlineitems",
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
                        BillDebitLineItemListPage.builder()
                            .service(DebitLineItemServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<DebitLineItemResponse> =
            jsonHandler<DebitLineItemResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: BillDebitLineItemDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DebitLineItemResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "bills",
                        params._pathParam(1),
                        "debitlineitems",
                        params._pathParam(2),
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
