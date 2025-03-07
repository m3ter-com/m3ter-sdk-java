// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponse
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.PermissionPolicyResponse
import com.m3ter.sdk.models.ResourceGroupResponse
import com.m3ter.sdk.models.UserGetPermissionsParams
import com.m3ter.sdk.models.UserGetUserGroupsParams
import com.m3ter.sdk.models.UserListPageAsync
import com.m3ter.sdk.models.UserListParams
import com.m3ter.sdk.models.UserMeParams
import com.m3ter.sdk.models.UserMeResponse
import com.m3ter.sdk.models.UserResendPasswordParams
import com.m3ter.sdk.models.UserResponse
import com.m3ter.sdk.models.UserRetrieveParams
import com.m3ter.sdk.models.UserUpdateParams
import com.m3ter.sdk.services.async.users.InvitationServiceAsync
import java.util.concurrent.CompletableFuture

interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun invitations(): InvitationServiceAsync

    /**
     * Retrieve the OrgUser with the given UUID.
     *
     * Retrieves detailed information for a specific user within an Organization, using their unique
     * identifier (UUID).
     */
    @JvmOverloads
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserResponse>

    /**
     * Update the OrgUser with the given UUID.
     *
     * Updates the details for a specific user within an Organization using their unique identifier
     * (UUID). Use this endpoint when you need to modify user information such as their permission
     * policy.
     */
    @JvmOverloads
    fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserResponse>

    /**
     * Retrieve a list of OrgUsers.
     *
     * Retrieves a list of all users within a specified Organization. Use this endpoint to get an
     * overview of all users and their basic details. The list can be paginated for easier
     * management.
     */
    @JvmOverloads
    fun list(
        params: UserListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserListPageAsync>

    /**
     * Retrieve the permissions for the OrgUser with the given UUID.
     *
     * Retrieves a list of all permissions associated with a specific user in an Organization using
     * their UUID. The list can be paginated for easier management.
     */
    @JvmOverloads
    fun getPermissions(
        params: UserGetPermissionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyResponse>

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
    @JvmOverloads
    fun getUserGroups(
        params: UserGetUserGroupsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ResourceGroupResponse>

    /** Retrieve information about the current user */
    @JvmOverloads
    fun me(
        params: UserMeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserMeResponse>

    /** Resend temporary password for user */
    @JvmOverloads
    fun resendPassword(
        params: UserResendPasswordParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun invitations(): InvitationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/users/{id}`, but is otherwise
         * the same as [UserServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/users/{id}`, but is otherwise
         * the same as [UserServiceAsync.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/users`, but is otherwise the
         * same as [UserServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: UserListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserListPageAsync>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/users/{id}/permissions`, but
         * is otherwise the same as [UserServiceAsync.getPermissions].
         */
        @JvmOverloads
        @MustBeClosed
        fun getPermissions(
            params: UserGetPermissionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/users/{id}/usergroups`, but
         * is otherwise the same as [UserServiceAsync.getUserGroups].
         */
        @JvmOverloads
        @MustBeClosed
        fun getUserGroups(
            params: UserGetUserGroupsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ResourceGroupResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/users/me`, but is otherwise
         * the same as [UserServiceAsync.me].
         */
        @JvmOverloads
        @MustBeClosed
        fun me(
            params: UserMeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserMeResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/users/{id}/password/resend`,
         * but is otherwise the same as [UserServiceAsync.resendPassword].
         */
        @JvmOverloads
        @MustBeClosed
        fun resendPassword(
            params: UserResendPasswordParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
