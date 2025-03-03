// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.m3ter.sdk.core.ClientOptions
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.handlers.emptyHandler
import com.m3ter.sdk.core.handlers.errorHandler
import com.m3ter.sdk.core.handlers.jsonHandler
import com.m3ter.sdk.core.handlers.withErrorHandler
import com.m3ter.sdk.core.http.HttpMethod
import com.m3ter.sdk.core.http.HttpRequest
import com.m3ter.sdk.core.http.HttpResponse.Handler
import com.m3ter.sdk.core.json
import com.m3ter.sdk.core.prepare
import com.m3ter.sdk.errors.M3terError
import com.m3ter.sdk.models.PermissionPolicy
import com.m3ter.sdk.models.ResourceGroup
import com.m3ter.sdk.models.User
import com.m3ter.sdk.models.UserGetPermissionsParams
import com.m3ter.sdk.models.UserGetUserGroupsParams
import com.m3ter.sdk.models.UserListPage
import com.m3ter.sdk.models.UserListParams
import com.m3ter.sdk.models.UserMeParams
import com.m3ter.sdk.models.UserMeResponse
import com.m3ter.sdk.models.UserResendPasswordParams
import com.m3ter.sdk.models.UserRetrieveParams
import com.m3ter.sdk.models.UserUpdateParams
import com.m3ter.sdk.services.blocking.users.InvitationService
import com.m3ter.sdk.services.blocking.users.InvitationServiceImpl

class UserServiceImpl internal constructor(private val clientOptions: ClientOptions) : UserService {

    private val errorHandler: Handler<M3terError> = errorHandler(clientOptions.jsonMapper)

    private val invitations: InvitationService by lazy { InvitationServiceImpl(clientOptions) }

    override fun invitations(): InvitationService = invitations

    private val retrieveHandler: Handler<User> =
        jsonHandler<User>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve the OrgUser with the given UUID.
     *
     * Retrieves detailed information for a specific user within an Organization, using their unique
     * identifier (UUID).
     */
    override fun retrieve(params: UserRetrieveParams, requestOptions: RequestOptions): User {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "users",
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

    private val updateHandler: Handler<User> =
        jsonHandler<User>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Update the OrgUser with the given UUID.
     *
     * Updates the details for a specific user within an Organization using their unique identifier
     * (UUID). Use this endpoint when you need to modify user information such as their permission
     * policy.
     */
    override fun update(params: UserUpdateParams, requestOptions: RequestOptions): User {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "users",
                    params.getPathParam(1),
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<UserListPage.Response> =
        jsonHandler<UserListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve a list of OrgUsers.
     *
     * Retrieves a list of all users within a specified Organization. Use this endpoint to get an
     * overview of all users and their basic details. The list can be paginated for easier
     * management.
     */
    override fun list(params: UserListParams, requestOptions: RequestOptions): UserListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "users")
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
            .let { UserListPage.of(this, params, it) }
    }

    private val getPermissionsHandler: Handler<PermissionPolicy> =
        jsonHandler<PermissionPolicy>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve the permissions for the OrgUser with the given UUID.
     *
     * Retrieves a list of all permissions associated with a specific user in an Organization using
     * their UUID. The list can be paginated for easier management.
     */
    override fun getPermissions(
        params: UserGetPermissionsParams,
        requestOptions: RequestOptions,
    ): PermissionPolicy {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "users",
                    params.getPathParam(1),
                    "permissions",
                )
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { getPermissionsHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val getUserGroupsHandler: Handler<ResourceGroup> =
        jsonHandler<ResourceGroup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve a list of User Groups for an OrgUser.
     *
     * Retrieves a list of all User Groups that a specific user belongs to within an Organization.
     * The list can be paginated for easier management.
     *
     * **Notes:**
     * - **User Groups as Resource Groups**. A User Group is a Resource Group - one used to group
     *   resources of type `user`. You can use the _Create ResourceGroup_ call detailed in the
     *   [ResourceGroup](https://www.m3ter.com/docs/api#tag/ResourceGroup) section to create a User
     *   Resource Group, and then use the _Add Item_ and _Remove Item_ calls to manage which Users
     *   belong to the User Resource Group.
     * - **Using the `inherited` parameter for the Retrieve OrgUser Groups call**. Resource Groups
     *   can be nested, which means a User Resource Group can contain another User Resource Group as
     *   a member. You can use the `inherited` parameter with this _Retrieve OrgUser Groups_ call as
     *   a _QUERY PARAMETER_ to control which User Resource Groups are returned:
     * * If the user specified belongs to a User Resource Group that is nested as part of another
     *   User Resource Group:
     *     - If `inherited = TRUE`, then any Groups the user belongs to AND any parent Groups those
     *       Groups belong to as nested Groups are returned.
     *     - If `inherited = FALSE`, then only those User Resource Groups to which the user belongs
     *       are returned.
     */
    override fun getUserGroups(
        params: UserGetUserGroupsParams,
        requestOptions: RequestOptions,
    ): ResourceGroup {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "users",
                    params.getPathParam(1),
                    "usergroups",
                )
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { getUserGroupsHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val meHandler: Handler<UserMeResponse> =
        jsonHandler<UserMeResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve information about the current user */
    override fun me(params: UserMeParams, requestOptions: RequestOptions): UserMeResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("organizations", params.getPathParam(0), "users", "me")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { meHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val resendPasswordHandler: Handler<Void?> =
        emptyHandler().withErrorHandler(errorHandler)

    /** Resend temporary password for user */
    override fun resendPassword(params: UserResendPasswordParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments(
                    "organizations",
                    params.getPathParam(0),
                    "users",
                    params.getPathParam(1),
                    "password",
                    "resend",
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { resendPasswordHandler.handle(it) }
    }
}
