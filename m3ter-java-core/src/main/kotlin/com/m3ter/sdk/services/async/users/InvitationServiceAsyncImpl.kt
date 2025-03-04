// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async.users

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.handlers.errorHandler
import com.m3ter.sdk.core.handlers.jsonHandler
import com.m3ter.sdk.core.handlers.withErrorHandler
import com.m3ter.sdk.core.http.HttpMethod
import com.m3ter.sdk.core.http.HttpRequest
import com.m3ter.sdk.core.http.HttpResponse.Handler
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepareAsync
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.Invitation
import com.m3ter.sdk.models.UserInvitationCreateParams
import com.m3ter.sdk.models.UserInvitationListPageAsync
import com.m3ter.sdk.models.UserInvitationListParams
import com.m3ter.sdk.models.UserInvitationRetrieveParams
import java.util.concurrent.CompletableFuture

class InvitationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InvitationServiceAsync {

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
    ): CompletableFuture<Invitation> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("organizations", params.getPathParam(0), "invitations")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
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

    /** Retrieve the specified invitation with the given UUID. */
    override fun retrieve(
        params: UserInvitationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Invitation> {
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
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<UserInvitationListPageAsync.Response> =
        jsonHandler<UserInvitationListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve a list of all invitations in the Organization. */
    override fun list(
        params: UserInvitationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UserInvitationListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "invitations")
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let { UserInvitationListPageAsync.of(this, params, it) }
            }
    }
}
