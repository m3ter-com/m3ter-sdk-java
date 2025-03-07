// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.PermissionPolicyAddToServiceUserParams
import com.m3ter.sdk.models.PermissionPolicyAddToServiceUserResponse
import com.m3ter.sdk.models.PermissionPolicyAddToSupportUserParams
import com.m3ter.sdk.models.PermissionPolicyAddToSupportUserResponse
import com.m3ter.sdk.models.PermissionPolicyAddToUserGroupParams
import com.m3ter.sdk.models.PermissionPolicyAddToUserGroupResponse
import com.m3ter.sdk.models.PermissionPolicyAddToUserParams
import com.m3ter.sdk.models.PermissionPolicyAddToUserResponse
import com.m3ter.sdk.models.PermissionPolicyCreateParams
import com.m3ter.sdk.models.PermissionPolicyDeleteParams
import com.m3ter.sdk.models.PermissionPolicyListPage
import com.m3ter.sdk.models.PermissionPolicyListParams
import com.m3ter.sdk.models.PermissionPolicyRemoveFromServiceUserParams
import com.m3ter.sdk.models.PermissionPolicyRemoveFromServiceUserResponse
import com.m3ter.sdk.models.PermissionPolicyRemoveFromSupportUserParams
import com.m3ter.sdk.models.PermissionPolicyRemoveFromSupportUserResponse
import com.m3ter.sdk.models.PermissionPolicyRemoveFromUserGroupParams
import com.m3ter.sdk.models.PermissionPolicyRemoveFromUserGroupResponse
import com.m3ter.sdk.models.PermissionPolicyRemoveFromUserParams
import com.m3ter.sdk.models.PermissionPolicyRemoveFromUserResponse
import com.m3ter.sdk.models.PermissionPolicyResponse
import com.m3ter.sdk.models.PermissionPolicyRetrieveParams
import com.m3ter.sdk.models.PermissionPolicyUpdateParams

interface PermissionPolicyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new Permission Policy
     *
     * **NOTE:** When you set up a policy statement for this call using the `permissionPolicy`
     * request parameter to specify the `effect`, `action`, and `resource`, you must use all lower
     * case and the format as shown in this example for a Permission Policy statement that grants
     * full CRUD access to all meters:
     * ```
     * "permissionPolicy" : [
     * 	{
     * 		"effect" : "allow",
     * 		"action" : [
     * 		"config:create",
     * 		"config:delete",
     * 		"config:retrieve",
     * 		"config:update"
     * 		]
     * 		"resource" : [
     * 		"config:meter&#47;*"
     * 		]
     * 	}
     * ]
     * ```
     *
     * For more details and further examples, see
     * [Understanding, Creating, and Managing Permission Policies](https://www.m3ter.com/docs/guides/organization-and-access-management/creating-and-managing-permissions#permission-policy-statements---available-actions-and-resources)
     * in our main Documentation.
     */
    fun create(params: PermissionPolicyCreateParams): PermissionPolicyResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PermissionPolicyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyResponse

    /** Retrieve the permission policy for the UUID */
    fun retrieve(params: PermissionPolicyRetrieveParams): PermissionPolicyResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PermissionPolicyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyResponse

    /**
     * Update a Permission Policy for the UUID
     *
     * **NOTE:** When you set up a policy statement for this call to specify the `effect`, `action`,
     * and `resource`, you must use all lower case and the format as shown in this example - a
     * Permission Policy statement that grants full CRUD access to all meters:
     * ```
     * "permissionPolicy" : [
     * 	{
     * 		"effect" : "allow",
     * 		"action" : [
     * 		"config:create",
     * 		"config:delete",
     * 		"config:retrieve",
     * 		"config:update"
     * 		]
     * 		"resource" : [
     * 		"config:meter&#47;*"
     * 		]
     * 	}
     * ]
     * ```
     *
     * For more details and further examples, see
     * [Understanding, Creating, and Managing Permission Policies](https://www.m3ter.com/docs/guides/organization-and-access-management/creating-and-managing-permissions#permission-policy-statements---available-actions-and-resources)
     * in our main Documentation.
     */
    fun update(params: PermissionPolicyUpdateParams): PermissionPolicyResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PermissionPolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyResponse

    /** Retrieve a list of PermissionPolicy entities */
    fun list(params: PermissionPolicyListParams): PermissionPolicyListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: PermissionPolicyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyListPage

    /** Delete the PermissionPolicy for the UUID */
    fun delete(params: PermissionPolicyDeleteParams): PermissionPolicyResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: PermissionPolicyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyResponse

    /** Add a permission policy to a service user. */
    fun addToServiceUser(
        params: PermissionPolicyAddToServiceUserParams
    ): PermissionPolicyAddToServiceUserResponse = addToServiceUser(params, RequestOptions.none())

    /** @see [addToServiceUser] */
    fun addToServiceUser(
        params: PermissionPolicyAddToServiceUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyAddToServiceUserResponse

    /** Add a permission policy to support users for an organization. */
    fun addToSupportUser(
        params: PermissionPolicyAddToSupportUserParams
    ): PermissionPolicyAddToSupportUserResponse = addToSupportUser(params, RequestOptions.none())

    /** @see [addToSupportUser] */
    fun addToSupportUser(
        params: PermissionPolicyAddToSupportUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyAddToSupportUserResponse

    /** Add a permission policy to a user. */
    fun addToUser(params: PermissionPolicyAddToUserParams): PermissionPolicyAddToUserResponse =
        addToUser(params, RequestOptions.none())

    /** @see [addToUser] */
    fun addToUser(
        params: PermissionPolicyAddToUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyAddToUserResponse

    /** Add a permission Policy to a user group */
    fun addToUserGroup(
        params: PermissionPolicyAddToUserGroupParams
    ): PermissionPolicyAddToUserGroupResponse = addToUserGroup(params, RequestOptions.none())

    /** @see [addToUserGroup] */
    fun addToUserGroup(
        params: PermissionPolicyAddToUserGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyAddToUserGroupResponse

    /** Remove a permission policy from a service user. */
    fun removeFromServiceUser(
        params: PermissionPolicyRemoveFromServiceUserParams
    ): PermissionPolicyRemoveFromServiceUserResponse =
        removeFromServiceUser(params, RequestOptions.none())

    /** @see [removeFromServiceUser] */
    fun removeFromServiceUser(
        params: PermissionPolicyRemoveFromServiceUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyRemoveFromServiceUserResponse

    /** Remove a permission policy from support users for an organization. */
    fun removeFromSupportUser(
        params: PermissionPolicyRemoveFromSupportUserParams
    ): PermissionPolicyRemoveFromSupportUserResponse =
        removeFromSupportUser(params, RequestOptions.none())

    /** @see [removeFromSupportUser] */
    fun removeFromSupportUser(
        params: PermissionPolicyRemoveFromSupportUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyRemoveFromSupportUserResponse

    /** Remove a permission policy from a user. */
    fun removeFromUser(
        params: PermissionPolicyRemoveFromUserParams
    ): PermissionPolicyRemoveFromUserResponse = removeFromUser(params, RequestOptions.none())

    /** @see [removeFromUser] */
    fun removeFromUser(
        params: PermissionPolicyRemoveFromUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyRemoveFromUserResponse

    /** Remove a permission policy from a user group. */
    fun removeFromUserGroup(
        params: PermissionPolicyRemoveFromUserGroupParams
    ): PermissionPolicyRemoveFromUserGroupResponse =
        removeFromUserGroup(params, RequestOptions.none())

    /** @see [removeFromUserGroup] */
    fun removeFromUserGroup(
        params: PermissionPolicyRemoveFromUserGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyRemoveFromUserGroupResponse

    /**
     * A view of [PermissionPolicyService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/permissionpolicies`, but is
         * otherwise the same as [PermissionPolicyService.create].
         */
        @MustBeClosed
        fun create(
            params: PermissionPolicyCreateParams
        ): HttpResponseFor<PermissionPolicyResponse> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PermissionPolicyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/permissionpolicies/{id}`, but
         * is otherwise the same as [PermissionPolicyService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: PermissionPolicyRetrieveParams
        ): HttpResponseFor<PermissionPolicyResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PermissionPolicyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyResponse>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/permissionpolicies/{id}`, but
         * is otherwise the same as [PermissionPolicyService.update].
         */
        @MustBeClosed
        fun update(
            params: PermissionPolicyUpdateParams
        ): HttpResponseFor<PermissionPolicyResponse> = update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PermissionPolicyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/permissionpolicies`, but is
         * otherwise the same as [PermissionPolicyService.list].
         */
        @MustBeClosed
        fun list(params: PermissionPolicyListParams): HttpResponseFor<PermissionPolicyListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PermissionPolicyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyListPage>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/permissionpolicies/{id}`,
         * but is otherwise the same as [PermissionPolicyService.delete].
         */
        @MustBeClosed
        fun delete(
            params: PermissionPolicyDeleteParams
        ): HttpResponseFor<PermissionPolicyResponse> = delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: PermissionPolicyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyResponse>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtoserviceuser`, but is
         * otherwise the same as [PermissionPolicyService.addToServiceUser].
         */
        @MustBeClosed
        fun addToServiceUser(
            params: PermissionPolicyAddToServiceUserParams
        ): HttpResponseFor<PermissionPolicyAddToServiceUserResponse> =
            addToServiceUser(params, RequestOptions.none())

        /** @see [addToServiceUser] */
        @MustBeClosed
        fun addToServiceUser(
            params: PermissionPolicyAddToServiceUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyAddToServiceUserResponse>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtosupportusers`, but is
         * otherwise the same as [PermissionPolicyService.addToSupportUser].
         */
        @MustBeClosed
        fun addToSupportUser(
            params: PermissionPolicyAddToSupportUserParams
        ): HttpResponseFor<PermissionPolicyAddToSupportUserResponse> =
            addToSupportUser(params, RequestOptions.none())

        /** @see [addToSupportUser] */
        @MustBeClosed
        fun addToSupportUser(
            params: PermissionPolicyAddToSupportUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyAddToSupportUserResponse>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtouser`, but is
         * otherwise the same as [PermissionPolicyService.addToUser].
         */
        @MustBeClosed
        fun addToUser(
            params: PermissionPolicyAddToUserParams
        ): HttpResponseFor<PermissionPolicyAddToUserResponse> =
            addToUser(params, RequestOptions.none())

        /** @see [addToUser] */
        @MustBeClosed
        fun addToUser(
            params: PermissionPolicyAddToUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyAddToUserResponse>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtousergroup`, but is
         * otherwise the same as [PermissionPolicyService.addToUserGroup].
         */
        @MustBeClosed
        fun addToUserGroup(
            params: PermissionPolicyAddToUserGroupParams
        ): HttpResponseFor<PermissionPolicyAddToUserGroupResponse> =
            addToUserGroup(params, RequestOptions.none())

        /** @see [addToUserGroup] */
        @MustBeClosed
        fun addToUserGroup(
            params: PermissionPolicyAddToUserGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyAddToUserGroupResponse>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromserviceuser`,
         * but is otherwise the same as [PermissionPolicyService.removeFromServiceUser].
         */
        @MustBeClosed
        fun removeFromServiceUser(
            params: PermissionPolicyRemoveFromServiceUserParams
        ): HttpResponseFor<PermissionPolicyRemoveFromServiceUserResponse> =
            removeFromServiceUser(params, RequestOptions.none())

        /** @see [removeFromServiceUser] */
        @MustBeClosed
        fun removeFromServiceUser(
            params: PermissionPolicyRemoveFromServiceUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyRemoveFromServiceUserResponse>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromsupportusers`,
         * but is otherwise the same as [PermissionPolicyService.removeFromSupportUser].
         */
        @MustBeClosed
        fun removeFromSupportUser(
            params: PermissionPolicyRemoveFromSupportUserParams
        ): HttpResponseFor<PermissionPolicyRemoveFromSupportUserResponse> =
            removeFromSupportUser(params, RequestOptions.none())

        /** @see [removeFromSupportUser] */
        @MustBeClosed
        fun removeFromSupportUser(
            params: PermissionPolicyRemoveFromSupportUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyRemoveFromSupportUserResponse>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromuser`, but is
         * otherwise the same as [PermissionPolicyService.removeFromUser].
         */
        @MustBeClosed
        fun removeFromUser(
            params: PermissionPolicyRemoveFromUserParams
        ): HttpResponseFor<PermissionPolicyRemoveFromUserResponse> =
            removeFromUser(params, RequestOptions.none())

        /** @see [removeFromUser] */
        @MustBeClosed
        fun removeFromUser(
            params: PermissionPolicyRemoveFromUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyRemoveFromUserResponse>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromusergroup`, but
         * is otherwise the same as [PermissionPolicyService.removeFromUserGroup].
         */
        @MustBeClosed
        fun removeFromUserGroup(
            params: PermissionPolicyRemoveFromUserGroupParams
        ): HttpResponseFor<PermissionPolicyRemoveFromUserGroupResponse> =
            removeFromUserGroup(params, RequestOptions.none())

        /** @see [removeFromUserGroup] */
        @MustBeClosed
        fun removeFromUserGroup(
            params: PermissionPolicyRemoveFromUserGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyRemoveFromUserGroupResponse>
    }
}
