// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
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
import java.util.function.Consumer

interface PermissionPolicyService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PermissionPolicyService

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
    fun retrieve(id: String): PermissionPolicyResponse =
        retrieve(id, PermissionPolicyRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PermissionPolicyRetrieveParams = PermissionPolicyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PermissionPolicyRetrieveParams = PermissionPolicyRetrieveParams.none(),
    ): PermissionPolicyResponse = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PermissionPolicyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyResponse

    /** @see [retrieve] */
    fun retrieve(params: PermissionPolicyRetrieveParams): PermissionPolicyResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): PermissionPolicyResponse =
        retrieve(id, PermissionPolicyRetrieveParams.none(), requestOptions)

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
    fun update(id: String, params: PermissionPolicyUpdateParams): PermissionPolicyResponse =
        update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: PermissionPolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyResponse = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: PermissionPolicyUpdateParams): PermissionPolicyResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PermissionPolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyResponse

    /** Retrieve a list of PermissionPolicy entities */
    fun list(): PermissionPolicyListPage = list(PermissionPolicyListParams.none())

    /** @see [list] */
    fun list(
        params: PermissionPolicyListParams = PermissionPolicyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyListPage

    /** @see [list] */
    fun list(
        params: PermissionPolicyListParams = PermissionPolicyListParams.none()
    ): PermissionPolicyListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): PermissionPolicyListPage =
        list(PermissionPolicyListParams.none(), requestOptions)

    /** Delete the PermissionPolicy for the UUID */
    fun delete(id: String): PermissionPolicyResponse =
        delete(id, PermissionPolicyDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: PermissionPolicyDeleteParams = PermissionPolicyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyResponse = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: PermissionPolicyDeleteParams = PermissionPolicyDeleteParams.none(),
    ): PermissionPolicyResponse = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: PermissionPolicyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyResponse

    /** @see [delete] */
    fun delete(params: PermissionPolicyDeleteParams): PermissionPolicyResponse =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): PermissionPolicyResponse =
        delete(id, PermissionPolicyDeleteParams.none(), requestOptions)

    /** Add a permission policy to a service user. */
    fun addToServiceUser(
        permissionPolicyId: String,
        params: PermissionPolicyAddToServiceUserParams,
    ): PermissionPolicyAddToServiceUserResponse =
        addToServiceUser(permissionPolicyId, params, RequestOptions.none())

    /** @see [addToServiceUser] */
    fun addToServiceUser(
        permissionPolicyId: String,
        params: PermissionPolicyAddToServiceUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyAddToServiceUserResponse =
        addToServiceUser(
            params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
            requestOptions,
        )

    /** @see [addToServiceUser] */
    fun addToServiceUser(
        params: PermissionPolicyAddToServiceUserParams
    ): PermissionPolicyAddToServiceUserResponse = addToServiceUser(params, RequestOptions.none())

    /** @see [addToServiceUser] */
    fun addToServiceUser(
        params: PermissionPolicyAddToServiceUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyAddToServiceUserResponse

    /** Add a permission policy to support users for an organization. */
    fun addToSupportUser(permissionPolicyId: String): PermissionPolicyAddToSupportUserResponse =
        addToSupportUser(permissionPolicyId, PermissionPolicyAddToSupportUserParams.none())

    /** @see [addToSupportUser] */
    fun addToSupportUser(
        permissionPolicyId: String,
        params: PermissionPolicyAddToSupportUserParams =
            PermissionPolicyAddToSupportUserParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyAddToSupportUserResponse =
        addToSupportUser(
            params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
            requestOptions,
        )

    /** @see [addToSupportUser] */
    fun addToSupportUser(
        permissionPolicyId: String,
        params: PermissionPolicyAddToSupportUserParams =
            PermissionPolicyAddToSupportUserParams.none(),
    ): PermissionPolicyAddToSupportUserResponse =
        addToSupportUser(permissionPolicyId, params, RequestOptions.none())

    /** @see [addToSupportUser] */
    fun addToSupportUser(
        params: PermissionPolicyAddToSupportUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyAddToSupportUserResponse

    /** @see [addToSupportUser] */
    fun addToSupportUser(
        params: PermissionPolicyAddToSupportUserParams
    ): PermissionPolicyAddToSupportUserResponse = addToSupportUser(params, RequestOptions.none())

    /** @see [addToSupportUser] */
    fun addToSupportUser(
        permissionPolicyId: String,
        requestOptions: RequestOptions,
    ): PermissionPolicyAddToSupportUserResponse =
        addToSupportUser(
            permissionPolicyId,
            PermissionPolicyAddToSupportUserParams.none(),
            requestOptions,
        )

    /** Add a permission policy to a user. */
    fun addToUser(
        permissionPolicyId: String,
        params: PermissionPolicyAddToUserParams,
    ): PermissionPolicyAddToUserResponse =
        addToUser(permissionPolicyId, params, RequestOptions.none())

    /** @see [addToUser] */
    fun addToUser(
        permissionPolicyId: String,
        params: PermissionPolicyAddToUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyAddToUserResponse =
        addToUser(params.toBuilder().permissionPolicyId(permissionPolicyId).build(), requestOptions)

    /** @see [addToUser] */
    fun addToUser(params: PermissionPolicyAddToUserParams): PermissionPolicyAddToUserResponse =
        addToUser(params, RequestOptions.none())

    /** @see [addToUser] */
    fun addToUser(
        params: PermissionPolicyAddToUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyAddToUserResponse

    /** Add a permission Policy to a user group */
    fun addToUserGroup(
        permissionPolicyId: String,
        params: PermissionPolicyAddToUserGroupParams,
    ): PermissionPolicyAddToUserGroupResponse =
        addToUserGroup(permissionPolicyId, params, RequestOptions.none())

    /** @see [addToUserGroup] */
    fun addToUserGroup(
        permissionPolicyId: String,
        params: PermissionPolicyAddToUserGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyAddToUserGroupResponse =
        addToUserGroup(
            params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
            requestOptions,
        )

    /** @see [addToUserGroup] */
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
        permissionPolicyId: String,
        params: PermissionPolicyRemoveFromServiceUserParams,
    ): PermissionPolicyRemoveFromServiceUserResponse =
        removeFromServiceUser(permissionPolicyId, params, RequestOptions.none())

    /** @see [removeFromServiceUser] */
    fun removeFromServiceUser(
        permissionPolicyId: String,
        params: PermissionPolicyRemoveFromServiceUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyRemoveFromServiceUserResponse =
        removeFromServiceUser(
            params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
            requestOptions,
        )

    /** @see [removeFromServiceUser] */
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
        permissionPolicyId: String
    ): PermissionPolicyRemoveFromSupportUserResponse =
        removeFromSupportUser(
            permissionPolicyId,
            PermissionPolicyRemoveFromSupportUserParams.none(),
        )

    /** @see [removeFromSupportUser] */
    fun removeFromSupportUser(
        permissionPolicyId: String,
        params: PermissionPolicyRemoveFromSupportUserParams =
            PermissionPolicyRemoveFromSupportUserParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyRemoveFromSupportUserResponse =
        removeFromSupportUser(
            params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
            requestOptions,
        )

    /** @see [removeFromSupportUser] */
    fun removeFromSupportUser(
        permissionPolicyId: String,
        params: PermissionPolicyRemoveFromSupportUserParams =
            PermissionPolicyRemoveFromSupportUserParams.none(),
    ): PermissionPolicyRemoveFromSupportUserResponse =
        removeFromSupportUser(permissionPolicyId, params, RequestOptions.none())

    /** @see [removeFromSupportUser] */
    fun removeFromSupportUser(
        params: PermissionPolicyRemoveFromSupportUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyRemoveFromSupportUserResponse

    /** @see [removeFromSupportUser] */
    fun removeFromSupportUser(
        params: PermissionPolicyRemoveFromSupportUserParams
    ): PermissionPolicyRemoveFromSupportUserResponse =
        removeFromSupportUser(params, RequestOptions.none())

    /** @see [removeFromSupportUser] */
    fun removeFromSupportUser(
        permissionPolicyId: String,
        requestOptions: RequestOptions,
    ): PermissionPolicyRemoveFromSupportUserResponse =
        removeFromSupportUser(
            permissionPolicyId,
            PermissionPolicyRemoveFromSupportUserParams.none(),
            requestOptions,
        )

    /** Remove a permission policy from a user. */
    fun removeFromUser(
        permissionPolicyId: String,
        params: PermissionPolicyRemoveFromUserParams,
    ): PermissionPolicyRemoveFromUserResponse =
        removeFromUser(permissionPolicyId, params, RequestOptions.none())

    /** @see [removeFromUser] */
    fun removeFromUser(
        permissionPolicyId: String,
        params: PermissionPolicyRemoveFromUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyRemoveFromUserResponse =
        removeFromUser(
            params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
            requestOptions,
        )

    /** @see [removeFromUser] */
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
        permissionPolicyId: String,
        params: PermissionPolicyRemoveFromUserGroupParams,
    ): PermissionPolicyRemoveFromUserGroupResponse =
        removeFromUserGroup(permissionPolicyId, params, RequestOptions.none())

    /** @see [removeFromUserGroup] */
    fun removeFromUserGroup(
        permissionPolicyId: String,
        params: PermissionPolicyRemoveFromUserGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PermissionPolicyRemoveFromUserGroupResponse =
        removeFromUserGroup(
            params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
            requestOptions,
        )

    /** @see [removeFromUserGroup] */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PermissionPolicyService.WithRawResponse

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
        fun retrieve(id: String): HttpResponseFor<PermissionPolicyResponse> =
            retrieve(id, PermissionPolicyRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PermissionPolicyRetrieveParams = PermissionPolicyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: PermissionPolicyRetrieveParams = PermissionPolicyRetrieveParams.none(),
        ): HttpResponseFor<PermissionPolicyResponse> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PermissionPolicyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PermissionPolicyRetrieveParams
        ): HttpResponseFor<PermissionPolicyResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PermissionPolicyResponse> =
            retrieve(id, PermissionPolicyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/permissionpolicies/{id}`, but
         * is otherwise the same as [PermissionPolicyService.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: PermissionPolicyUpdateParams,
        ): HttpResponseFor<PermissionPolicyResponse> = update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: PermissionPolicyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
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
        fun list(): HttpResponseFor<PermissionPolicyListPage> =
            list(PermissionPolicyListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PermissionPolicyListParams = PermissionPolicyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PermissionPolicyListParams = PermissionPolicyListParams.none()
        ): HttpResponseFor<PermissionPolicyListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PermissionPolicyListPage> =
            list(PermissionPolicyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/permissionpolicies/{id}`,
         * but is otherwise the same as [PermissionPolicyService.delete].
         */
        @MustBeClosed
        fun delete(id: String): HttpResponseFor<PermissionPolicyResponse> =
            delete(id, PermissionPolicyDeleteParams.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: PermissionPolicyDeleteParams = PermissionPolicyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            params: PermissionPolicyDeleteParams = PermissionPolicyDeleteParams.none(),
        ): HttpResponseFor<PermissionPolicyResponse> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: PermissionPolicyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyResponse>

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: PermissionPolicyDeleteParams
        ): HttpResponseFor<PermissionPolicyResponse> = delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PermissionPolicyResponse> =
            delete(id, PermissionPolicyDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtoserviceuser`, but is
         * otherwise the same as [PermissionPolicyService.addToServiceUser].
         */
        @MustBeClosed
        fun addToServiceUser(
            permissionPolicyId: String,
            params: PermissionPolicyAddToServiceUserParams,
        ): HttpResponseFor<PermissionPolicyAddToServiceUserResponse> =
            addToServiceUser(permissionPolicyId, params, RequestOptions.none())

        /** @see [addToServiceUser] */
        @MustBeClosed
        fun addToServiceUser(
            permissionPolicyId: String,
            params: PermissionPolicyAddToServiceUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyAddToServiceUserResponse> =
            addToServiceUser(
                params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
                requestOptions,
            )

        /** @see [addToServiceUser] */
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
            permissionPolicyId: String
        ): HttpResponseFor<PermissionPolicyAddToSupportUserResponse> =
            addToSupportUser(permissionPolicyId, PermissionPolicyAddToSupportUserParams.none())

        /** @see [addToSupportUser] */
        @MustBeClosed
        fun addToSupportUser(
            permissionPolicyId: String,
            params: PermissionPolicyAddToSupportUserParams =
                PermissionPolicyAddToSupportUserParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyAddToSupportUserResponse> =
            addToSupportUser(
                params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
                requestOptions,
            )

        /** @see [addToSupportUser] */
        @MustBeClosed
        fun addToSupportUser(
            permissionPolicyId: String,
            params: PermissionPolicyAddToSupportUserParams =
                PermissionPolicyAddToSupportUserParams.none(),
        ): HttpResponseFor<PermissionPolicyAddToSupportUserResponse> =
            addToSupportUser(permissionPolicyId, params, RequestOptions.none())

        /** @see [addToSupportUser] */
        @MustBeClosed
        fun addToSupportUser(
            params: PermissionPolicyAddToSupportUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyAddToSupportUserResponse>

        /** @see [addToSupportUser] */
        @MustBeClosed
        fun addToSupportUser(
            params: PermissionPolicyAddToSupportUserParams
        ): HttpResponseFor<PermissionPolicyAddToSupportUserResponse> =
            addToSupportUser(params, RequestOptions.none())

        /** @see [addToSupportUser] */
        @MustBeClosed
        fun addToSupportUser(
            permissionPolicyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PermissionPolicyAddToSupportUserResponse> =
            addToSupportUser(
                permissionPolicyId,
                PermissionPolicyAddToSupportUserParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtouser`, but is
         * otherwise the same as [PermissionPolicyService.addToUser].
         */
        @MustBeClosed
        fun addToUser(
            permissionPolicyId: String,
            params: PermissionPolicyAddToUserParams,
        ): HttpResponseFor<PermissionPolicyAddToUserResponse> =
            addToUser(permissionPolicyId, params, RequestOptions.none())

        /** @see [addToUser] */
        @MustBeClosed
        fun addToUser(
            permissionPolicyId: String,
            params: PermissionPolicyAddToUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyAddToUserResponse> =
            addToUser(
                params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
                requestOptions,
            )

        /** @see [addToUser] */
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
            permissionPolicyId: String,
            params: PermissionPolicyAddToUserGroupParams,
        ): HttpResponseFor<PermissionPolicyAddToUserGroupResponse> =
            addToUserGroup(permissionPolicyId, params, RequestOptions.none())

        /** @see [addToUserGroup] */
        @MustBeClosed
        fun addToUserGroup(
            permissionPolicyId: String,
            params: PermissionPolicyAddToUserGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyAddToUserGroupResponse> =
            addToUserGroup(
                params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
                requestOptions,
            )

        /** @see [addToUserGroup] */
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
            permissionPolicyId: String,
            params: PermissionPolicyRemoveFromServiceUserParams,
        ): HttpResponseFor<PermissionPolicyRemoveFromServiceUserResponse> =
            removeFromServiceUser(permissionPolicyId, params, RequestOptions.none())

        /** @see [removeFromServiceUser] */
        @MustBeClosed
        fun removeFromServiceUser(
            permissionPolicyId: String,
            params: PermissionPolicyRemoveFromServiceUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyRemoveFromServiceUserResponse> =
            removeFromServiceUser(
                params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
                requestOptions,
            )

        /** @see [removeFromServiceUser] */
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
            permissionPolicyId: String
        ): HttpResponseFor<PermissionPolicyRemoveFromSupportUserResponse> =
            removeFromSupportUser(
                permissionPolicyId,
                PermissionPolicyRemoveFromSupportUserParams.none(),
            )

        /** @see [removeFromSupportUser] */
        @MustBeClosed
        fun removeFromSupportUser(
            permissionPolicyId: String,
            params: PermissionPolicyRemoveFromSupportUserParams =
                PermissionPolicyRemoveFromSupportUserParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyRemoveFromSupportUserResponse> =
            removeFromSupportUser(
                params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
                requestOptions,
            )

        /** @see [removeFromSupportUser] */
        @MustBeClosed
        fun removeFromSupportUser(
            permissionPolicyId: String,
            params: PermissionPolicyRemoveFromSupportUserParams =
                PermissionPolicyRemoveFromSupportUserParams.none(),
        ): HttpResponseFor<PermissionPolicyRemoveFromSupportUserResponse> =
            removeFromSupportUser(permissionPolicyId, params, RequestOptions.none())

        /** @see [removeFromSupportUser] */
        @MustBeClosed
        fun removeFromSupportUser(
            params: PermissionPolicyRemoveFromSupportUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyRemoveFromSupportUserResponse>

        /** @see [removeFromSupportUser] */
        @MustBeClosed
        fun removeFromSupportUser(
            params: PermissionPolicyRemoveFromSupportUserParams
        ): HttpResponseFor<PermissionPolicyRemoveFromSupportUserResponse> =
            removeFromSupportUser(params, RequestOptions.none())

        /** @see [removeFromSupportUser] */
        @MustBeClosed
        fun removeFromSupportUser(
            permissionPolicyId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PermissionPolicyRemoveFromSupportUserResponse> =
            removeFromSupportUser(
                permissionPolicyId,
                PermissionPolicyRemoveFromSupportUserParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromuser`, but is
         * otherwise the same as [PermissionPolicyService.removeFromUser].
         */
        @MustBeClosed
        fun removeFromUser(
            permissionPolicyId: String,
            params: PermissionPolicyRemoveFromUserParams,
        ): HttpResponseFor<PermissionPolicyRemoveFromUserResponse> =
            removeFromUser(permissionPolicyId, params, RequestOptions.none())

        /** @see [removeFromUser] */
        @MustBeClosed
        fun removeFromUser(
            permissionPolicyId: String,
            params: PermissionPolicyRemoveFromUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyRemoveFromUserResponse> =
            removeFromUser(
                params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
                requestOptions,
            )

        /** @see [removeFromUser] */
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
            permissionPolicyId: String,
            params: PermissionPolicyRemoveFromUserGroupParams,
        ): HttpResponseFor<PermissionPolicyRemoveFromUserGroupResponse> =
            removeFromUserGroup(permissionPolicyId, params, RequestOptions.none())

        /** @see [removeFromUserGroup] */
        @MustBeClosed
        fun removeFromUserGroup(
            permissionPolicyId: String,
            params: PermissionPolicyRemoveFromUserGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PermissionPolicyRemoveFromUserGroupResponse> =
            removeFromUserGroup(
                params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
                requestOptions,
            )

        /** @see [removeFromUserGroup] */
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
