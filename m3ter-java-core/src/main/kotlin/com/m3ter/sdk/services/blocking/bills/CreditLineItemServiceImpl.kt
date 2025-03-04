// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking.bills

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.handlers.errorHandler
import com.m3ter.sdk.core.handlers.jsonHandler
import com.m3ter.sdk.core.handlers.withErrorHandler
import com.m3ter.sdk.core.http.HttpMethod
import com.m3ter.sdk.core.http.HttpRequest
import com.m3ter.sdk.core.http.HttpResponse.Handler
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.core.http.json
import com.m3ter.sdk.core.http.parseable
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.BillCreditLineItemCreateParams
import com.m3ter.sdk.models.BillCreditLineItemDeleteParams
import com.m3ter.sdk.models.BillCreditLineItemListPage
import com.m3ter.sdk.models.BillCreditLineItemListParams
import com.m3ter.sdk.models.BillCreditLineItemRetrieveParams
import com.m3ter.sdk.models.BillCreditLineItemUpdateParams
import com.m3ter.sdk.models.CreditLineItem

class CreditLineItemServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditLineItemService {

    private val withRawResponse: CreditLineItemService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CreditLineItemService.WithRawResponse = withRawResponse

    override fun create(
        params: BillCreditLineItemCreateParams,
        requestOptions: RequestOptions,
    ): CreditLineItem =
        // post /organizations/{orgId}/bills/{billId}/creditlineitems
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: BillCreditLineItemRetrieveParams,
        requestOptions: RequestOptions,
    ): CreditLineItem =
        // get /organizations/{orgId}/bills/{billId}/creditlineitems/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: BillCreditLineItemUpdateParams,
        requestOptions: RequestOptions,
    ): CreditLineItem =
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
    ): CreditLineItem =
        // delete /organizations/{orgId}/bills/{billId}/creditlineitems/{id}
        withRawResponse().delete(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditLineItemService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CreditLineItem> =
            jsonHandler<CreditLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: BillCreditLineItemCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditLineItem> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "bills",
                        params.getPathParam(1),
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

        private val retrieveHandler: Handler<CreditLineItem> =
            jsonHandler<CreditLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: BillCreditLineItemRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditLineItem> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "bills",
                        params.getPathParam(1),
                        "creditlineitems",
                        params.getPathParam(2),
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

        private val updateHandler: Handler<CreditLineItem> =
            jsonHandler<CreditLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: BillCreditLineItemUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditLineItem> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "bills",
                        params.getPathParam(1),
                        "creditlineitems",
                        params.getPathParam(2),
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

        private val listHandler: Handler<BillCreditLineItemListPage.Response> =
            jsonHandler<BillCreditLineItemListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: BillCreditLineItemListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillCreditLineItemListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "bills",
                        params.getPathParam(1),
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
                        BillCreditLineItemListPage.of(
                            CreditLineItemServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val deleteHandler: Handler<CreditLineItem> =
            jsonHandler<CreditLineItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: BillCreditLineItemDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditLineItem> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "bills",
                        params.getPathParam(1),
                        "creditlineitems",
                        params.getPathParam(2),
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
