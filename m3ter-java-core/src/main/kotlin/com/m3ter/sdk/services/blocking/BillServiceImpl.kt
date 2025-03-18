// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

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
import com.m3ter.sdk.models.BillApproveParams
import com.m3ter.sdk.models.BillApproveResponse
import com.m3ter.sdk.models.BillDeleteParams
import com.m3ter.sdk.models.BillLatestByAccountParams
import com.m3ter.sdk.models.BillListPage
import com.m3ter.sdk.models.BillListParams
import com.m3ter.sdk.models.BillLockParams
import com.m3ter.sdk.models.BillResponse
import com.m3ter.sdk.models.BillRetrieveParams
import com.m3ter.sdk.models.BillSearchParams
import com.m3ter.sdk.models.BillSearchResponse
import com.m3ter.sdk.models.BillUpdateStatusParams
import com.m3ter.sdk.services.blocking.bills.CreditLineItemService
import com.m3ter.sdk.services.blocking.bills.CreditLineItemServiceImpl
import com.m3ter.sdk.services.blocking.bills.DebitLineItemService
import com.m3ter.sdk.services.blocking.bills.DebitLineItemServiceImpl
import com.m3ter.sdk.services.blocking.bills.LineItemService
import com.m3ter.sdk.services.blocking.bills.LineItemServiceImpl

class BillServiceImpl internal constructor(private val clientOptions: ClientOptions) : BillService {

    private val withRawResponse: BillService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val creditLineItems: CreditLineItemService by lazy {
        CreditLineItemServiceImpl(clientOptions)
    }

    private val debitLineItems: DebitLineItemService by lazy {
        DebitLineItemServiceImpl(clientOptions)
    }

    private val lineItems: LineItemService by lazy { LineItemServiceImpl(clientOptions) }

    override fun withRawResponse(): BillService.WithRawResponse = withRawResponse

    override fun creditLineItems(): CreditLineItemService = creditLineItems

    override fun debitLineItems(): DebitLineItemService = debitLineItems

    override fun lineItems(): LineItemService = lineItems

    override fun retrieve(
        params: BillRetrieveParams,
        requestOptions: RequestOptions,
    ): BillResponse =
        // get /organizations/{orgId}/bills/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: BillListParams, requestOptions: RequestOptions): BillListPage =
        // get /organizations/{orgId}/bills
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: BillDeleteParams, requestOptions: RequestOptions): BillResponse =
        // delete /organizations/{orgId}/bills/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun approve(
        params: BillApproveParams,
        requestOptions: RequestOptions,
    ): BillApproveResponse =
        // post /organizations/{orgId}/bills/approve
        withRawResponse().approve(params, requestOptions).parse()

    override fun latestByAccount(
        params: BillLatestByAccountParams,
        requestOptions: RequestOptions,
    ): BillResponse =
        // get /organizations/{orgId}/bills/latest/{accountId}
        withRawResponse().latestByAccount(params, requestOptions).parse()

    override fun lock(params: BillLockParams, requestOptions: RequestOptions): BillResponse =
        // put /organizations/{orgId}/bills/{id}/lock
        withRawResponse().lock(params, requestOptions).parse()

    override fun search(
        params: BillSearchParams,
        requestOptions: RequestOptions,
    ): BillSearchResponse =
        // get /organizations/{orgId}/bills/search
        withRawResponse().search(params, requestOptions).parse()

    override fun updateStatus(
        params: BillUpdateStatusParams,
        requestOptions: RequestOptions,
    ): BillResponse =
        // put /organizations/{orgId}/bills/{id}/status
        withRawResponse().updateStatus(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BillService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val creditLineItems: CreditLineItemService.WithRawResponse by lazy {
            CreditLineItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val debitLineItems: DebitLineItemService.WithRawResponse by lazy {
            DebitLineItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val lineItems: LineItemService.WithRawResponse by lazy {
            LineItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun creditLineItems(): CreditLineItemService.WithRawResponse = creditLineItems

        override fun debitLineItems(): DebitLineItemService.WithRawResponse = debitLineItems

        override fun lineItems(): LineItemService.WithRawResponse = lineItems

        private val retrieveHandler: Handler<BillResponse> =
            jsonHandler<BillResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: BillRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "bills",
                        params._pathParam(1),
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

        private val listHandler: Handler<BillListPage.Response> =
            jsonHandler<BillListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: BillListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params._pathParam(0), "bills")
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
                    .let { BillListPage.of(BillServiceImpl(clientOptions), params, it) }
            }
        }

        private val deleteHandler: Handler<BillResponse> =
            jsonHandler<BillResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun delete(
            params: BillDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "bills",
                        params._pathParam(1),
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

        private val approveHandler: Handler<BillApproveResponse> =
            jsonHandler<BillApproveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun approve(
            params: BillApproveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillApproveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params._pathParam(0), "bills", "approve")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { approveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val latestByAccountHandler: Handler<BillResponse> =
            jsonHandler<BillResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun latestByAccount(
            params: BillLatestByAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "bills",
                        "latest",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { latestByAccountHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val lockHandler: Handler<BillResponse> =
            jsonHandler<BillResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun lock(
            params: BillLockParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "bills",
                        params._pathParam(1),
                        "lock",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { lockHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchHandler: Handler<BillSearchResponse> =
            jsonHandler<BillSearchResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun search(
            params: BillSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillSearchResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params._pathParam(0), "bills", "search")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { searchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateStatusHandler: Handler<BillResponse> =
            jsonHandler<BillResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun updateStatus(
            params: BillUpdateStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0),
                        "bills",
                        params._pathParam(1),
                        "status",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
