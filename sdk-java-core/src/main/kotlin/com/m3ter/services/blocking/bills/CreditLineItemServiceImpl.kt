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
import com.m3ter.models.BillCreditLineItemCreateParams
import com.m3ter.models.BillCreditLineItemDeleteParams
import com.m3ter.models.BillCreditLineItemListPage
import com.m3ter.models.BillCreditLineItemListPageResponse
import com.m3ter.models.BillCreditLineItemListParams
import com.m3ter.models.BillCreditLineItemRetrieveParams
import com.m3ter.models.BillCreditLineItemUpdateParams
import com.m3ter.models.CreditLineItemResponse
import kotlin.jvm.optionals.getOrNull

class CreditLineItemServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditLineItemService {

    private val withRawResponse: CreditLineItemService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CreditLineItemService.WithRawResponse = withRawResponse

    override fun create(
        params: BillCreditLineItemCreateParams,
        requestOptions: RequestOptions,
    ): CreditLineItemResponse =
        // post /organizations/{orgId}/bills/{billId}/creditlineitems
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: BillCreditLineItemRetrieveParams,
        requestOptions: RequestOptions,
    ): CreditLineItemResponse =
        // get /organizations/{orgId}/bills/{billId}/creditlineitems/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: BillCreditLineItemUpdateParams,
        requestOptions: RequestOptions,
    ): CreditLineItemResponse =
        // put /organizations/{orgId}/bills/{billId}/creditlineitems/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: BillCreditLineItemListParams,
        requestOptions: RequestOptions,
    ): BillCreditLineItemListPage =
        // get /organizations/{orgId}/bills/{billId}/creditlineitems
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: BillCreditLineItemDeleteParams,
        requestOptions: RequestOptions,
    ): CreditLineItemResponse =
        // delete /organizations/{orgId}/bills/{billId}/creditlineitems/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditLineItemService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CreditLineItemResponse> =
            jsonHandler<CreditLineItemResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: BillCreditLineItemCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditLineItemResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("billId", params.billId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "bills",
                        params._pathParam(1),
                        "creditlineitems",
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

        private val retrieveHandler: Handler<CreditLineItemResponse> =
            jsonHandler<CreditLineItemResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: BillCreditLineItemRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditLineItemResponse> {
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
                        "bills",
                        params._pathParam(1),
                        "creditlineitems",
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

        private val updateHandler: Handler<CreditLineItemResponse> =
            jsonHandler<CreditLineItemResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: BillCreditLineItemUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditLineItemResponse> {
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
                        "bills",
                        params._pathParam(1),
                        "creditlineitems",
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

        private val listHandler: Handler<BillCreditLineItemListPageResponse> =
            jsonHandler<BillCreditLineItemListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: BillCreditLineItemListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillCreditLineItemListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("billId", params.billId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "bills",
                        params._pathParam(1),
                        "creditlineitems",
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
                        BillCreditLineItemListPage.builder()
                            .service(CreditLineItemServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<CreditLineItemResponse> =
            jsonHandler<CreditLineItemResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: BillCreditLineItemDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditLineItemResponse> {
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
                        "bills",
                        params._pathParam(1),
                        "creditlineitems",
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
