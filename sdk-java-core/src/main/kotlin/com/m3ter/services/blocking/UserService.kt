// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponse
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.PermissionPolicyResponse
import com.m3ter.models.ResourceGroupResponse
import com.m3ter.models.UserGetPermissionsParams
import com.m3ter.models.UserGetUserGroupsParams
import com.m3ter.models.UserListPage
import com.m3ter.models.UserListParams
import com.m3ter.models.UserMeParams
import com.m3ter.models.UserMeResponse
import com.m3ter.models.UserResendPasswordParams
import com.m3ter.models.UserResponse
import com.m3ter.models.UserRetrieveParams
import com.m3ter.models.UserUpdateParams
import com.m3ter.services.blocking.users.InvitationService

interface UserService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun invitations(): InvitationService

    /**
     * Retrieve the OrgUser with the given UUID.
     *
     * Retrieves detailed information for a specific user within an Organization, using their unique
     * identifier (UUID).
     */
    fun retrieve(params: UserRetrieveParams): UserResponse = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: UserRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserResponse

    /**
     * Update the OrgUser with the given UUID.
     *
     * Updates the details for a specific user within an Organization using their unique identifier
     * (UUID). Use this endpoint when you need to modify user information such as their permission
     * policy.
     */
    fun update(params: UserUpdateParams): UserResponse = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: UserUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserResponse

    /**
     * Retrieve a list of OrgUsers.
     *
     * Retrieves a list of all users within a specified Organization. Use this endpoint to get an
     * overview of all users and their basic details. The list can be paginated for easier
     * management.
     */
    fun list(): UserListPage = list(UserListParams.none())

    /** @see [list] */
    fun list(
        params: UserListParams = UserListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserListPage

    /** @see [list] */
    fun list(params: UserListParams = UserListParams.none()): UserListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): UserListPage =
        list(UserListParams.none(), requestOptions)

    /**
     * Retrieve the permissions for the OrgUser with the given UUID.
     *
     * Retrieves a list of all permissions associated with a specific user in an Organization using
     * their UUID. The list can be paginated for easier management.
     */
    fun getPermissions(params: UserGetPermissionsParams): PermissionPolicyResponse =
        getPermissions(params, RequestOptions.none())

    /** @see [getPermissions] */
    fun getPermissions(
        params: UserGetPermissionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyResponse

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
    fun getUserGroups(params: UserGetUserGroupsParams): ResourceGroupResponse =
        getUserGroups(params, RequestOptions.none())

    /** @see [getUserGroups] */
    fun getUserGroups(
        params: UserGetUserGroupsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ResourceGroupResponse

    /** Retrieve information about the current user */
    fun me(): UserMeResponse = me(UserMeParams.none())

    /** @see [me] */
    fun me(
        params: UserMeParams = UserMeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserMeResponse

    /** @see [me] */
    fun me(params: UserMeParams = UserMeParams.none()): UserMeResponse =
        me(params, RequestOptions.none())

    /** @see [me] */
    fun me(requestOptions: RequestOptions): UserMeResponse = me(UserMeParams.none(), requestOptions)

    /** Resend temporary password for user */
    fun resendPassword(params: UserResendPasswordParams) =
        resendPassword(params, RequestOptions.none())

    /** @see [resendPassword] */
    fun resendPassword(
        params: UserResendPasswordParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [UserService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun invitations(): InvitationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/users/{id}`, but is otherwise
         * the same as [UserService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: UserRetrieveParams): HttpResponseFor<UserResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: UserRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/users/{id}`, but is otherwise
         * the same as [UserService.update].
         */
        @MustBeClosed
        fun update(params: UserUpdateParams): HttpResponseFor<UserResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: UserUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/users`, but is otherwise the
         * same as [UserService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<UserListPage> = list(UserListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: UserListParams = UserListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(params: UserListParams = UserListParams.none()): HttpResponseFor<UserListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<UserListPage> =
            list(UserListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/users/{id}/permissions`, but
         * is otherwise the same as [UserService.getPermissions].
         */
        @MustBeClosed
        fun getPermissions(
            params: UserGetPermissionsParams
        ): HttpResponseFor<PermissionPolicyResponse> = getPermissions(params, RequestOptions.none())

        /** @see [getPermissions] */
        @MustBeClosed
        fun getPermissions(
            params: UserGetPermissionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/users/{id}/usergroups`, but
         * is otherwise the same as [UserService.getUserGroups].
         */
        @MustBeClosed
        fun getUserGroups(params: UserGetUserGroupsParams): HttpResponseFor<ResourceGroupResponse> =
            getUserGroups(params, RequestOptions.none())

        /** @see [getUserGroups] */
        @MustBeClosed
        fun getUserGroups(
            params: UserGetUserGroupsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ResourceGroupResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/users/me`, but is otherwise
         * the same as [UserService.me].
         */
        @MustBeClosed fun me(): HttpResponseFor<UserMeResponse> = me(UserMeParams.none())

        /** @see [me] */
        @MustBeClosed
        fun me(
            params: UserMeParams = UserMeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserMeResponse>

        /** @see [me] */
        @MustBeClosed
        fun me(params: UserMeParams = UserMeParams.none()): HttpResponseFor<UserMeResponse> =
            me(params, RequestOptions.none())

        /** @see [me] */
        @MustBeClosed
        fun me(requestOptions: RequestOptions): HttpResponseFor<UserMeResponse> =
            me(UserMeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/users/{id}/password/resend`,
         * but is otherwise the same as [UserService.resendPassword].
         */
        @MustBeClosed
        fun resendPassword(params: UserResendPasswordParams): HttpResponse =
            resendPassword(params, RequestOptions.none())

        /** @see [resendPassword] */
        @MustBeClosed
        fun resendPassword(
            params: UserResendPasswordParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
