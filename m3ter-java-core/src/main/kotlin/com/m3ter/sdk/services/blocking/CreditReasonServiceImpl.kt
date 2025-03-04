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
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.CreditReason
import com.m3ter.sdk.models.CreditReasonCreateParams
import com.m3ter.sdk.models.CreditReasonDeleteParams
import com.m3ter.sdk.models.CreditReasonListPage
import com.m3ter.sdk.models.CreditReasonListParams
import com.m3ter.sdk.models.CreditReasonRetrieveParams
import com.m3ter.sdk.models.CreditReasonUpdateParams

class CreditReasonServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditReasonService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CreditReason> =
        jsonHandler<CreditReason>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new Credit Reason for your Organization. When you've created a Credit Reason, it
     * becomes available as a credit type for adding Credit line items to Bills. See
     * [Credits](https://www.m3ter.com/docs/api#tag/Credits).
     */
    override fun create(
        params: CreditReasonCreateParams,
        requestOptions: RequestOptions,
    ): CreditReason {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "picklists",
                    "creditreasons",
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<CreditReason> =
        jsonHandler<CreditReason>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve the Credit Reason with the given UUID. */
    override fun retrieve(
        params: CreditReasonRetrieveParams,
        requestOptions: RequestOptions,
    ): CreditReason {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "picklists",
                    "creditreasons",
                    params.getPathParam(1),
                )
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<CreditReason> =
        jsonHandler<CreditReason>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update the Credit Reason with the given UUID. */
    override fun update(
        params: CreditReasonUpdateParams,
        requestOptions: RequestOptions,
    ): CreditReason {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "picklists",
                    "creditreasons",
                    params.getPathParam(1),
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<CreditReasonListPage.Response> =
        jsonHandler<CreditReasonListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve a list of the Credit Reason entities created for your Organization. You can filter
     * the list returned for the call by Credit Reason ID, Credit Reason short code, or by Archive
     * status.
     */
    override fun list(
        params: CreditReasonListParams,
        requestOptions: RequestOptions,
    ): CreditReasonListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "picklists",
                    "creditreasons",
                )
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
            .let { CreditReasonListPage.of(this, params, it) }
    }

    private val deleteHandler: Handler<CreditReason> =
        jsonHandler<CreditReason>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Delete the Credit Reason with the given UUID. */
    override fun delete(
        params: CreditReasonDeleteParams,
        requestOptions: RequestOptions,
    ): CreditReason {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "picklists",
                    "creditreasons",
                    params.getPathParam(1),
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { deleteHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }
}
