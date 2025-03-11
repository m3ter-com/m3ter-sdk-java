// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.services.async

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
import com.m3ter.sdk.models.PermissionPolicyListPageAsync
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
import java.util.concurrent.CompletableFuture

interface PermissionPolicyServiceAsync {

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
    fun create(params: PermissionPolicyCreateParams): CompletableFuture<PermissionPolicyResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PermissionPolicyCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyResponse>

    /** Retrieve the permission policy for the UUID */
    fun retrieve(
        params: PermissionPolicyRetrieveParams
    ): CompletableFuture<PermissionPolicyResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PermissionPolicyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyResponse>

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
    fun update(params: PermissionPolicyUpdateParams): CompletableFuture<PermissionPolicyResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PermissionPolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyResponse>

    /** Retrieve a list of PermissionPolicy entities */
    fun list(params: PermissionPolicyListParams): CompletableFuture<PermissionPolicyListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: PermissionPolicyListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyListPageAsync>

    /** Delete the PermissionPolicy for the UUID */
    fun delete(params: PermissionPolicyDeleteParams): CompletableFuture<PermissionPolicyResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: PermissionPolicyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyResponse>

    /** Add a permission policy to a service user. */
    fun addToServiceUser(
        params: PermissionPolicyAddToServiceUserParams
    ): CompletableFuture<PermissionPolicyAddToServiceUserResponse> =
        addToServiceUser(params, RequestOptions.none())

    /** @see [addToServiceUser] */
    fun addToServiceUser(
        params: PermissionPolicyAddToServiceUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyAddToServiceUserResponse>

    /** Add a permission policy to support users for an organization. */
    fun addToSupportUser(
        params: PermissionPolicyAddToSupportUserParams
    ): CompletableFuture<PermissionPolicyAddToSupportUserResponse> =
        addToSupportUser(params, RequestOptions.none())

    /** @see [addToSupportUser] */
    fun addToSupportUser(
        params: PermissionPolicyAddToSupportUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyAddToSupportUserResponse>

    /** Add a permission policy to a user. */
    fun addToUser(
        params: PermissionPolicyAddToUserParams
    ): CompletableFuture<PermissionPolicyAddToUserResponse> =
        addToUser(params, RequestOptions.none())

    /** @see [addToUser] */
    fun addToUser(
        params: PermissionPolicyAddToUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyAddToUserResponse>

    /** Add a permission Policy to a user group */
    fun addToUserGroup(
        params: PermissionPolicyAddToUserGroupParams
    ): CompletableFuture<PermissionPolicyAddToUserGroupResponse> =
        addToUserGroup(params, RequestOptions.none())

    /** @see [addToUserGroup] */
    fun addToUserGroup(
        params: PermissionPolicyAddToUserGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyAddToUserGroupResponse>

    /** Remove a permission policy from a service user. */
    fun removeFromServiceUser(
        params: PermissionPolicyRemoveFromServiceUserParams
    ): CompletableFuture<PermissionPolicyRemoveFromServiceUserResponse> =
        removeFromServiceUser(params, RequestOptions.none())

    /** @see [removeFromServiceUser] */
    fun removeFromServiceUser(
        params: PermissionPolicyRemoveFromServiceUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyRemoveFromServiceUserResponse>

    /** Remove a permission policy from support users for an organization. */
    fun removeFromSupportUser(
        params: PermissionPolicyRemoveFromSupportUserParams
    ): CompletableFuture<PermissionPolicyRemoveFromSupportUserResponse> =
        removeFromSupportUser(params, RequestOptions.none())

    /** @see [removeFromSupportUser] */
    fun removeFromSupportUser(
        params: PermissionPolicyRemoveFromSupportUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyRemoveFromSupportUserResponse>

    /** Remove a permission policy from a user. */
    fun removeFromUser(
        params: PermissionPolicyRemoveFromUserParams
    ): CompletableFuture<PermissionPolicyRemoveFromUserResponse> =
        removeFromUser(params, RequestOptions.none())

    /** @see [removeFromUser] */
    fun removeFromUser(
        params: PermissionPolicyRemoveFromUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyRemoveFromUserResponse>

    /** Remove a permission policy from a user group. */
    fun removeFromUserGroup(
        params: PermissionPolicyRemoveFromUserGroupParams
    ): CompletableFuture<PermissionPolicyRemoveFromUserGroupResponse> =
        removeFromUserGroup(params, RequestOptions.none())

    /** @see [removeFromUserGroup] */
    fun removeFromUserGroup(
        params: PermissionPolicyRemoveFromUserGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyRemoveFromUserGroupResponse>

    /**
     * A view of [PermissionPolicyServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/permissionpolicies`, but is
         * otherwise the same as [PermissionPolicyServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: PermissionPolicyCreateParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PermissionPolicyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/permissionpolicies/{id}`, but
         * is otherwise the same as [PermissionPolicyServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: PermissionPolicyRetrieveParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PermissionPolicyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>>

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/permissionpolicies/{id}`, but
         * is otherwise the same as [PermissionPolicyServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: PermissionPolicyUpdateParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: PermissionPolicyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/permissionpolicies`, but is
         * otherwise the same as [PermissionPolicyServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: PermissionPolicyListParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PermissionPolicyListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyListPageAsync>>

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/permissionpolicies/{id}`,
         * but is otherwise the same as [PermissionPolicyServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(
            params: PermissionPolicyDeleteParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: PermissionPolicyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtoserviceuser`, but is
         * otherwise the same as [PermissionPolicyServiceAsync.addToServiceUser].
         */
        @MustBeClosed
        fun addToServiceUser(
            params: PermissionPolicyAddToServiceUserParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToServiceUserResponse>> =
            addToServiceUser(params, RequestOptions.none())

        /** @see [addToServiceUser] */
        @MustBeClosed
        fun addToServiceUser(
            params: PermissionPolicyAddToServiceUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToServiceUserResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtosupportusers`, but is
         * otherwise the same as [PermissionPolicyServiceAsync.addToSupportUser].
         */
        @MustBeClosed
        fun addToSupportUser(
            params: PermissionPolicyAddToSupportUserParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToSupportUserResponse>> =
            addToSupportUser(params, RequestOptions.none())

        /** @see [addToSupportUser] */
        @MustBeClosed
        fun addToSupportUser(
            params: PermissionPolicyAddToSupportUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToSupportUserResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtouser`, but is
         * otherwise the same as [PermissionPolicyServiceAsync.addToUser].
         */
        @MustBeClosed
        fun addToUser(
            params: PermissionPolicyAddToUserParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToUserResponse>> =
            addToUser(params, RequestOptions.none())

        /** @see [addToUser] */
        @MustBeClosed
        fun addToUser(
            params: PermissionPolicyAddToUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToUserResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtousergroup`, but is
         * otherwise the same as [PermissionPolicyServiceAsync.addToUserGroup].
         */
        @MustBeClosed
        fun addToUserGroup(
            params: PermissionPolicyAddToUserGroupParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToUserGroupResponse>> =
            addToUserGroup(params, RequestOptions.none())

        /** @see [addToUserGroup] */
        @MustBeClosed
        fun addToUserGroup(
            params: PermissionPolicyAddToUserGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToUserGroupResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromserviceuser`,
         * but is otherwise the same as [PermissionPolicyServiceAsync.removeFromServiceUser].
         */
        @MustBeClosed
        fun removeFromServiceUser(
            params: PermissionPolicyRemoveFromServiceUserParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromServiceUserResponse>> =
            removeFromServiceUser(params, RequestOptions.none())

        /** @see [removeFromServiceUser] */
        @MustBeClosed
        fun removeFromServiceUser(
            params: PermissionPolicyRemoveFromServiceUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromServiceUserResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromsupportusers`,
         * but is otherwise the same as [PermissionPolicyServiceAsync.removeFromSupportUser].
         */
        @MustBeClosed
        fun removeFromSupportUser(
            params: PermissionPolicyRemoveFromSupportUserParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromSupportUserResponse>> =
            removeFromSupportUser(params, RequestOptions.none())

        /** @see [removeFromSupportUser] */
        @MustBeClosed
        fun removeFromSupportUser(
            params: PermissionPolicyRemoveFromSupportUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromSupportUserResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromuser`, but is
         * otherwise the same as [PermissionPolicyServiceAsync.removeFromUser].
         */
        @MustBeClosed
        fun removeFromUser(
            params: PermissionPolicyRemoveFromUserParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromUserResponse>> =
            removeFromUser(params, RequestOptions.none())

        /** @see [removeFromUser] */
        @MustBeClosed
        fun removeFromUser(
            params: PermissionPolicyRemoveFromUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromUserResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromusergroup`, but
         * is otherwise the same as [PermissionPolicyServiceAsync.removeFromUserGroup].
         */
        @MustBeClosed
        fun removeFromUserGroup(
            params: PermissionPolicyRemoveFromUserGroupParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromUserGroupResponse>> =
            removeFromUserGroup(params, RequestOptions.none())

        /** @see [removeFromUserGroup] */
        @MustBeClosed
        fun removeFromUserGroup(
            params: PermissionPolicyRemoveFromUserGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromUserGroupResponse>>
    }
}
