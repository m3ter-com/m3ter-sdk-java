// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.m3ter.core.ClientOptions
import com.m3ter.core.JsonValue
import com.m3ter.core.RequestOptions
import com.m3ter.core.checkRequired
import com.m3ter.core.handlers.emptyHandler
import com.m3ter.core.handlers.errorHandler
import com.m3ter.core.handlers.jsonHandler
import com.m3ter.core.handlers.withErrorHandler
import com.m3ter.core.http.HttpMethod
import com.m3ter.core.http.HttpRequest
import com.m3ter.core.http.HttpResponse
import com.m3ter.core.http.HttpResponse.Handler
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.core.http.json
import com.m3ter.core.http.parseable
import com.m3ter.core.prepare
import com.m3ter.models.PermissionPolicyResponse
import com.m3ter.models.ResourceGroupResponse
import com.m3ter.models.UserGetPermissionsParams
import com.m3ter.models.UserGetUserGroupsParams
import com.m3ter.models.UserListPage
import com.m3ter.models.UserListPageResponse
import com.m3ter.models.UserListParams
import com.m3ter.models.UserMeParams
import com.m3ter.models.UserMeResponse
import com.m3ter.models.UserResendPasswordParams
import com.m3ter.models.UserResponse
import com.m3ter.models.UserRetrieveParams
import com.m3ter.models.UserUpdateParams
import com.m3ter.services.blocking.users.InvitationService
import com.m3ter.services.blocking.users.InvitationServiceImpl
import kotlin.jvm.optionals.getOrNull

class UserServiceImpl internal constructor(private val clientOptions: ClientOptions) : UserService {

    private val withRawResponse: UserService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val invitations: InvitationService by lazy { InvitationServiceImpl(clientOptions) }

    override fun withRawResponse(): UserService.WithRawResponse = withRawResponse

    override fun invitations(): InvitationService = invitations

    override fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions,
    ): UserResponse =
        // get /organizations/{orgId}/users/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: UserUpdateParams, requestOptions: RequestOptions): UserResponse =
        // put /organizations/{orgId}/users/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: UserListParams, requestOptions: RequestOptions): UserListPage =
        // get /organizations/{orgId}/users
        withRawResponse().list(params, requestOptions).parse()

    override fun getPermissions(
        params: UserGetPermissionsParams,
        requestOptions: RequestOptions,
    ): PermissionPolicyResponse =
        // get /organizations/{orgId}/users/{id}/permissions
        withRawResponse().getPermissions(params, requestOptions).parse()

    override fun getUserGroups(
        params: UserGetUserGroupsParams,
        requestOptions: RequestOptions,
    ): ResourceGroupResponse =
        // get /organizations/{orgId}/users/{id}/usergroups
        withRawResponse().getUserGroups(params, requestOptions).parse()

    override fun me(params: UserMeParams, requestOptions: RequestOptions): UserMeResponse =
        // get /organizations/{orgId}/users/me
        withRawResponse().me(params, requestOptions).parse()

    override fun resendPassword(params: UserResendPasswordParams, requestOptions: RequestOptions) {
        // put /organizations/{orgId}/users/{id}/password/resend
        withRawResponse().resendPassword(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UserService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val invitations: InvitationService.WithRawResponse by lazy {
            InvitationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun invitations(): InvitationService.WithRawResponse = invitations

        private val retrieveHandler: Handler<UserResponse> =
            jsonHandler<UserResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserResponse> {
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
                        "users",
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

        private val updateHandler: Handler<UserResponse> =
            jsonHandler<UserResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserResponse> {
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
                        "users",
                        params._pathParam(1),
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

        private val listHandler: Handler<UserListPageResponse> =
            jsonHandler<UserListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: UserListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "users",
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
                        UserListPage.builder()
                            .service(UserServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getPermissionsHandler: Handler<PermissionPolicyResponse> =
            jsonHandler<PermissionPolicyResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getPermissions(
            params: UserGetPermissionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PermissionPolicyResponse> {
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
                        "users",
                        params._pathParam(1),
                        "permissions",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { getPermissionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getUserGroupsHandler: Handler<ResourceGroupResponse> =
            jsonHandler<ResourceGroupResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun getUserGroups(
            params: UserGetUserGroupsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ResourceGroupResponse> {
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
                        "users",
                        params._pathParam(1),
                        "usergroups",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { getUserGroupsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val meHandler: Handler<UserMeResponse> =
            jsonHandler<UserMeResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun me(
            params: UserMeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UserMeResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "users",
                        "me",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { meHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val resendPasswordHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun resendPassword(
            params: UserResendPasswordParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                        "users",
                        params._pathParam(1),
                        "password",
                        "resend",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { resendPasswordHandler.handle(it) } }
        }
    }
}
