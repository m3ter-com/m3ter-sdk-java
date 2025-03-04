// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking.users

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
import com.m3ter.sdk.models.Invitation
import com.m3ter.sdk.models.UserInvitationCreateParams
import com.m3ter.sdk.models.UserInvitationListPage
import com.m3ter.sdk.models.UserInvitationListParams
import com.m3ter.sdk.models.UserInvitationRetrieveParams

class InvitationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InvitationService {

    private val withRawResponse: InvitationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InvitationService.WithRawResponse = withRawResponse

    override fun create(
        params: UserInvitationCreateParams,
        requestOptions: RequestOptions,
    ): Invitation =
        // post /organizations/{orgId}/invitations
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: UserInvitationRetrieveParams,
        requestOptions: RequestOptions,
    ): Invitation =
        // get /organizations/{orgId}/invitations/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: UserInvitationListParams,
        requestOptions: RequestOptions,
    ): UserInvitationListPage =
        // get /organizations/{orgId}/invitations
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InvitationService.WithRawResponse {

        private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Invitation> =
            jsonHandler<Invitation>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: UserInvitationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invitation> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("organizations", params.getPathParam(0), "invitations")
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

        private val retrieveHandler: Handler<Invitation> =
            jsonHandler<Invitation>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: UserInvitationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Invitation> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params.getPathParam(0),
                        "invitations",
                        params.getPathParam(1),
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

        private val listHandler: Handler<UserInvitationListPage.Response> =
            jsonHandler<UserInvitationListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: UserInvitationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserInvitationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("organizations", params.getPathParam(0), "invitations")
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
                        UserInvitationListPage.of(InvitationServiceImpl(clientOptions), params, it)
                    }
            }
        }
    }
}
