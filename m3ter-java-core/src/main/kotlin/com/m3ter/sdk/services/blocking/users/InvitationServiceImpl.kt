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
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.Invitation
import com.m3ter.sdk.models.UserInvitationCreateParams
import com.m3ter.sdk.models.UserInvitationListPage
import com.m3ter.sdk.models.UserInvitationListParams
import com.m3ter.sdk.models.UserInvitationRetrieveParams

class InvitationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InvitationService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Invitation> =
        jsonHandler<Invitation>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Invite a new user to your Organization.
     *
     * This sends an email to someone inviting them to join your m3ter Organization.
     */
    override fun create(
        params: UserInvitationCreateParams,
        requestOptions: RequestOptions,
    ): Invitation {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "invitations")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<Invitation> =
        jsonHandler<Invitation>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve the specified invitation with the given UUID. */
    override fun retrieve(
        params: UserInvitationRetrieveParams,
        requestOptions: RequestOptions,
    ): Invitation {
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
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<UserInvitationListPage.Response> =
        jsonHandler<UserInvitationListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a list of all invitations in the Organization. */
    override fun list(
        params: UserInvitationListParams,
        requestOptions: RequestOptions,
    ): UserInvitationListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "invitations")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { UserInvitationListPage.of(this, params, it) }
    }
}
