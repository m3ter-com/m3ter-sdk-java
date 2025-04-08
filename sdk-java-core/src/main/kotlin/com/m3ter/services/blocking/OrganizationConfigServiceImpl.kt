// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.core.ClientOptions
import com.m3ter.core.JsonValue
import com.m3ter.core.RequestOptions
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
import com.m3ter.models.OrganizationConfigResponse
import com.m3ter.models.OrganizationConfigRetrieveParams
import com.m3ter.models.OrganizationConfigUpdateParams

class OrganizationConfigServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OrganizationConfigService {

    private val withRawResponse: OrganizationConfigService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OrganizationConfigService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: OrganizationConfigRetrieveParams,
        requestOptions: RequestOptions,
    ): OrganizationConfigResponse =
        // get /organizations/{orgId}/organizationconfig
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: OrganizationConfigUpdateParams,
        requestOptions: RequestOptions,
    ): OrganizationConfigResponse =
        // put /organizations/{orgId}/organizationconfig
        withRawResponse().update(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OrganizationConfigService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<OrganizationConfigResponse> =
            jsonHandler<OrganizationConfigResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: OrganizationConfigRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrganizationConfigResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "organizationconfig",
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

        private val updateHandler: Handler<OrganizationConfigResponse> =
            jsonHandler<OrganizationConfigResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: OrganizationConfigUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OrganizationConfigResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "organizationconfig",
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
    }
}
