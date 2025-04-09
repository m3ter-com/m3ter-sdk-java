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
import com.m3ter.models.PermissionPolicyAddToServiceUserParams
import com.m3ter.models.PermissionPolicyAddToServiceUserResponse
import com.m3ter.models.PermissionPolicyAddToSupportUserParams
import com.m3ter.models.PermissionPolicyAddToSupportUserResponse
import com.m3ter.models.PermissionPolicyAddToUserGroupParams
import com.m3ter.models.PermissionPolicyAddToUserGroupResponse
import com.m3ter.models.PermissionPolicyAddToUserParams
import com.m3ter.models.PermissionPolicyAddToUserResponse
import com.m3ter.models.PermissionPolicyCreateParams
import com.m3ter.models.PermissionPolicyDeleteParams
import com.m3ter.models.PermissionPolicyListPage
import com.m3ter.models.PermissionPolicyListPageResponse
import com.m3ter.models.PermissionPolicyListParams
import com.m3ter.models.PermissionPolicyRemoveFromServiceUserParams
import com.m3ter.models.PermissionPolicyRemoveFromServiceUserResponse
import com.m3ter.models.PermissionPolicyRemoveFromSupportUserParams
import com.m3ter.models.PermissionPolicyRemoveFromSupportUserResponse
import com.m3ter.models.PermissionPolicyRemoveFromUserGroupParams
import com.m3ter.models.PermissionPolicyRemoveFromUserGroupResponse
import com.m3ter.models.PermissionPolicyRemoveFromUserParams
import com.m3ter.models.PermissionPolicyRemoveFromUserResponse
import com.m3ter.models.PermissionPolicyResponse
import com.m3ter.models.PermissionPolicyRetrieveParams
import com.m3ter.models.PermissionPolicyUpdateParams

class PermissionPolicyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PermissionPolicyService {

    private val withRawResponse: PermissionPolicyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PermissionPolicyService.WithRawResponse = withRawResponse

    override fun create(
        params: PermissionPolicyCreateParams,
        requestOptions: RequestOptions,
    ): PermissionPolicyResponse =
        // post /organizations/{orgId}/permissionpolicies
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PermissionPolicyRetrieveParams,
        requestOptions: RequestOptions,
    ): PermissionPolicyResponse =
        // get /organizations/{orgId}/permissionpolicies/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: PermissionPolicyUpdateParams,
        requestOptions: RequestOptions,
    ): PermissionPolicyResponse =
        // put /organizations/{orgId}/permissionpolicies/{id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: PermissionPolicyListParams,
        requestOptions: RequestOptions,
    ): PermissionPolicyListPage =
        // get /organizations/{orgId}/permissionpolicies
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: PermissionPolicyDeleteParams,
        requestOptions: RequestOptions,
    ): PermissionPolicyResponse =
        // delete /organizations/{orgId}/permissionpolicies/{id}
        withRawResponse().delete(params, requestOptions).parse()

    override fun addToServiceUser(
        params: PermissionPolicyAddToServiceUserParams,
        requestOptions: RequestOptions,
    ): PermissionPolicyAddToServiceUserResponse =
        // post /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtoserviceuser
        withRawResponse().addToServiceUser(params, requestOptions).parse()

    override fun addToSupportUser(
        params: PermissionPolicyAddToSupportUserParams,
        requestOptions: RequestOptions,
    ): PermissionPolicyAddToSupportUserResponse =
        // post /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtosupportusers
        withRawResponse().addToSupportUser(params, requestOptions).parse()

    override fun addToUser(
        params: PermissionPolicyAddToUserParams,
        requestOptions: RequestOptions,
    ): PermissionPolicyAddToUserResponse =
        // post /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtouser
        withRawResponse().addToUser(params, requestOptions).parse()

    override fun addToUserGroup(
        params: PermissionPolicyAddToUserGroupParams,
        requestOptions: RequestOptions,
    ): PermissionPolicyAddToUserGroupResponse =
        // post /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtousergroup
        withRawResponse().addToUserGroup(params, requestOptions).parse()

    override fun removeFromServiceUser(
        params: PermissionPolicyRemoveFromServiceUserParams,
        requestOptions: RequestOptions,
    ): PermissionPolicyRemoveFromServiceUserResponse =
        // post /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromserviceuser
        withRawResponse().removeFromServiceUser(params, requestOptions).parse()

    override fun removeFromSupportUser(
        params: PermissionPolicyRemoveFromSupportUserParams,
        requestOptions: RequestOptions,
    ): PermissionPolicyRemoveFromSupportUserResponse =
        // post
        // /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromsupportusers
        withRawResponse().removeFromSupportUser(params, requestOptions).parse()

    override fun removeFromUser(
        params: PermissionPolicyRemoveFromUserParams,
        requestOptions: RequestOptions,
    ): PermissionPolicyRemoveFromUserResponse =
        // post /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromuser
        withRawResponse().removeFromUser(params, requestOptions).parse()

    override fun removeFromUserGroup(
        params: PermissionPolicyRemoveFromUserGroupParams,
        requestOptions: RequestOptions,
    ): PermissionPolicyRemoveFromUserGroupResponse =
        // post /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromusergroup
        withRawResponse().removeFromUserGroup(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PermissionPolicyService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PermissionPolicyResponse> =
            jsonHandler<PermissionPolicyResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: PermissionPolicyCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PermissionPolicyResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "permissionpolicies",
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

        private val retrieveHandler: Handler<PermissionPolicyResponse> =
            jsonHandler<PermissionPolicyResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: PermissionPolicyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PermissionPolicyResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "permissionpolicies",
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

        private val updateHandler: Handler<PermissionPolicyResponse> =
            jsonHandler<PermissionPolicyResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: PermissionPolicyUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PermissionPolicyResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "permissionpolicies",
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

        private val listHandler: Handler<PermissionPolicyListPageResponse> =
            jsonHandler<PermissionPolicyListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PermissionPolicyListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PermissionPolicyListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "permissionpolicies",
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
                        PermissionPolicyListPage.of(
                            PermissionPolicyServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val deleteHandler: Handler<PermissionPolicyResponse> =
            jsonHandler<PermissionPolicyResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun delete(
            params: PermissionPolicyDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PermissionPolicyResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "permissionpolicies",
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

        private val addToServiceUserHandler: Handler<PermissionPolicyAddToServiceUserResponse> =
            jsonHandler<PermissionPolicyAddToServiceUserResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun addToServiceUser(
            params: PermissionPolicyAddToServiceUserParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PermissionPolicyAddToServiceUserResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "permissionpolicies",
                        params._pathParam(1),
                        "addtoserviceuser",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { addToServiceUserHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val addToSupportUserHandler: Handler<PermissionPolicyAddToSupportUserResponse> =
            jsonHandler<PermissionPolicyAddToSupportUserResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun addToSupportUser(
            params: PermissionPolicyAddToSupportUserParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PermissionPolicyAddToSupportUserResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "permissionpolicies",
                        params._pathParam(1),
                        "addtosupportusers",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { addToSupportUserHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val addToUserHandler: Handler<PermissionPolicyAddToUserResponse> =
            jsonHandler<PermissionPolicyAddToUserResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun addToUser(
            params: PermissionPolicyAddToUserParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PermissionPolicyAddToUserResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "permissionpolicies",
                        params._pathParam(1),
                        "addtouser",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { addToUserHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val addToUserGroupHandler: Handler<PermissionPolicyAddToUserGroupResponse> =
            jsonHandler<PermissionPolicyAddToUserGroupResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun addToUserGroup(
            params: PermissionPolicyAddToUserGroupParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PermissionPolicyAddToUserGroupResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "permissionpolicies",
                        params._pathParam(1),
                        "addtousergroup",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { addToUserGroupHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val removeFromServiceUserHandler:
            Handler<PermissionPolicyRemoveFromServiceUserResponse> =
            jsonHandler<PermissionPolicyRemoveFromServiceUserResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun removeFromServiceUser(
            params: PermissionPolicyRemoveFromServiceUserParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PermissionPolicyRemoveFromServiceUserResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "permissionpolicies",
                        params._pathParam(1),
                        "removefromserviceuser",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { removeFromServiceUserHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val removeFromSupportUserHandler:
            Handler<PermissionPolicyRemoveFromSupportUserResponse> =
            jsonHandler<PermissionPolicyRemoveFromSupportUserResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun removeFromSupportUser(
            params: PermissionPolicyRemoveFromSupportUserParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PermissionPolicyRemoveFromSupportUserResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "permissionpolicies",
                        params._pathParam(1),
                        "removefromsupportusers",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { removeFromSupportUserHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val removeFromUserHandler: Handler<PermissionPolicyRemoveFromUserResponse> =
            jsonHandler<PermissionPolicyRemoveFromUserResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun removeFromUser(
            params: PermissionPolicyRemoveFromUserParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PermissionPolicyRemoveFromUserResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "permissionpolicies",
                        params._pathParam(1),
                        "removefromuser",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { removeFromUserHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val removeFromUserGroupHandler:
            Handler<PermissionPolicyRemoveFromUserGroupResponse> =
            jsonHandler<PermissionPolicyRemoveFromUserGroupResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun removeFromUserGroup(
            params: PermissionPolicyRemoveFromUserGroupParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PermissionPolicyRemoveFromUserGroupResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "organizations",
                        params._pathParam(0).ifBlank { clientOptions.orgId },
                        "permissionpolicies",
                        params._pathParam(1),
                        "removefromusergroup",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { removeFromUserGroupHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
