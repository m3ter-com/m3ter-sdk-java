// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async

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
import com.m3ter.models.PermissionPolicyListPageAsync
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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PermissionPolicyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PermissionPolicyServiceAsync

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
    fun retrieve(id: String): CompletableFuture<PermissionPolicyResponse> =
        retrieve(id, PermissionPolicyRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PermissionPolicyRetrieveParams = PermissionPolicyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: PermissionPolicyRetrieveParams = PermissionPolicyRetrieveParams.none(),
    ): CompletableFuture<PermissionPolicyResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PermissionPolicyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: PermissionPolicyRetrieveParams
    ): CompletableFuture<PermissionPolicyResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyResponse> =
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
    fun update(
        id: String,
        params: PermissionPolicyUpdateParams,
    ): CompletableFuture<PermissionPolicyResponse> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: PermissionPolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: PermissionPolicyUpdateParams): CompletableFuture<PermissionPolicyResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: PermissionPolicyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyResponse>

    /** Retrieve a list of PermissionPolicy entities */
    fun list(): CompletableFuture<PermissionPolicyListPageAsync> =
        list(PermissionPolicyListParams.none())

    /** @see [list] */
    fun list(
        params: PermissionPolicyListParams = PermissionPolicyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyListPageAsync>

    /** @see [list] */
    fun list(
        params: PermissionPolicyListParams = PermissionPolicyListParams.none()
    ): CompletableFuture<PermissionPolicyListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<PermissionPolicyListPageAsync> =
        list(PermissionPolicyListParams.none(), requestOptions)

    /** Delete the PermissionPolicy for the UUID */
    fun delete(id: String): CompletableFuture<PermissionPolicyResponse> =
        delete(id, PermissionPolicyDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: PermissionPolicyDeleteParams = PermissionPolicyDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyResponse> =
        delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: PermissionPolicyDeleteParams = PermissionPolicyDeleteParams.none(),
    ): CompletableFuture<PermissionPolicyResponse> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: PermissionPolicyDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyResponse>

    /** @see [delete] */
    fun delete(params: PermissionPolicyDeleteParams): CompletableFuture<PermissionPolicyResponse> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyResponse> =
        delete(id, PermissionPolicyDeleteParams.none(), requestOptions)

    /** Add a permission policy to a service user. */
    fun addToServiceUser(
        permissionPolicyId: String,
        params: PermissionPolicyAddToServiceUserParams,
    ): CompletableFuture<PermissionPolicyAddToServiceUserResponse> =
        addToServiceUser(permissionPolicyId, params, RequestOptions.none())

    /** @see [addToServiceUser] */
    fun addToServiceUser(
        permissionPolicyId: String,
        params: PermissionPolicyAddToServiceUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyAddToServiceUserResponse> =
        addToServiceUser(
            params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
            requestOptions,
        )

    /** @see [addToServiceUser] */
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
        permissionPolicyId: String
    ): CompletableFuture<PermissionPolicyAddToSupportUserResponse> =
        addToSupportUser(permissionPolicyId, PermissionPolicyAddToSupportUserParams.none())

    /** @see [addToSupportUser] */
    fun addToSupportUser(
        permissionPolicyId: String,
        params: PermissionPolicyAddToSupportUserParams =
            PermissionPolicyAddToSupportUserParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyAddToSupportUserResponse> =
        addToSupportUser(
            params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
            requestOptions,
        )

    /** @see [addToSupportUser] */
    fun addToSupportUser(
        permissionPolicyId: String,
        params: PermissionPolicyAddToSupportUserParams =
            PermissionPolicyAddToSupportUserParams.none(),
    ): CompletableFuture<PermissionPolicyAddToSupportUserResponse> =
        addToSupportUser(permissionPolicyId, params, RequestOptions.none())

    /** @see [addToSupportUser] */
    fun addToSupportUser(
        params: PermissionPolicyAddToSupportUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyAddToSupportUserResponse>

    /** @see [addToSupportUser] */
    fun addToSupportUser(
        params: PermissionPolicyAddToSupportUserParams
    ): CompletableFuture<PermissionPolicyAddToSupportUserResponse> =
        addToSupportUser(params, RequestOptions.none())

    /** @see [addToSupportUser] */
    fun addToSupportUser(
        permissionPolicyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyAddToSupportUserResponse> =
        addToSupportUser(
            permissionPolicyId,
            PermissionPolicyAddToSupportUserParams.none(),
            requestOptions,
        )

    /** Add a permission policy to a user. */
    fun addToUser(
        permissionPolicyId: String,
        params: PermissionPolicyAddToUserParams,
    ): CompletableFuture<PermissionPolicyAddToUserResponse> =
        addToUser(permissionPolicyId, params, RequestOptions.none())

    /** @see [addToUser] */
    fun addToUser(
        permissionPolicyId: String,
        params: PermissionPolicyAddToUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyAddToUserResponse> =
        addToUser(params.toBuilder().permissionPolicyId(permissionPolicyId).build(), requestOptions)

    /** @see [addToUser] */
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
        permissionPolicyId: String,
        params: PermissionPolicyAddToUserGroupParams,
    ): CompletableFuture<PermissionPolicyAddToUserGroupResponse> =
        addToUserGroup(permissionPolicyId, params, RequestOptions.none())

    /** @see [addToUserGroup] */
    fun addToUserGroup(
        permissionPolicyId: String,
        params: PermissionPolicyAddToUserGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyAddToUserGroupResponse> =
        addToUserGroup(
            params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
            requestOptions,
        )

    /** @see [addToUserGroup] */
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
        permissionPolicyId: String,
        params: PermissionPolicyRemoveFromServiceUserParams,
    ): CompletableFuture<PermissionPolicyRemoveFromServiceUserResponse> =
        removeFromServiceUser(permissionPolicyId, params, RequestOptions.none())

    /** @see [removeFromServiceUser] */
    fun removeFromServiceUser(
        permissionPolicyId: String,
        params: PermissionPolicyRemoveFromServiceUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyRemoveFromServiceUserResponse> =
        removeFromServiceUser(
            params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
            requestOptions,
        )

    /** @see [removeFromServiceUser] */
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
        permissionPolicyId: String
    ): CompletableFuture<PermissionPolicyRemoveFromSupportUserResponse> =
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
    ): CompletableFuture<PermissionPolicyRemoveFromSupportUserResponse> =
        removeFromSupportUser(
            params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
            requestOptions,
        )

    /** @see [removeFromSupportUser] */
    fun removeFromSupportUser(
        permissionPolicyId: String,
        params: PermissionPolicyRemoveFromSupportUserParams =
            PermissionPolicyRemoveFromSupportUserParams.none(),
    ): CompletableFuture<PermissionPolicyRemoveFromSupportUserResponse> =
        removeFromSupportUser(permissionPolicyId, params, RequestOptions.none())

    /** @see [removeFromSupportUser] */
    fun removeFromSupportUser(
        params: PermissionPolicyRemoveFromSupportUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyRemoveFromSupportUserResponse>

    /** @see [removeFromSupportUser] */
    fun removeFromSupportUser(
        params: PermissionPolicyRemoveFromSupportUserParams
    ): CompletableFuture<PermissionPolicyRemoveFromSupportUserResponse> =
        removeFromSupportUser(params, RequestOptions.none())

    /** @see [removeFromSupportUser] */
    fun removeFromSupportUser(
        permissionPolicyId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PermissionPolicyRemoveFromSupportUserResponse> =
        removeFromSupportUser(
            permissionPolicyId,
            PermissionPolicyRemoveFromSupportUserParams.none(),
            requestOptions,
        )

    /** Remove a permission policy from a user. */
    fun removeFromUser(
        permissionPolicyId: String,
        params: PermissionPolicyRemoveFromUserParams,
    ): CompletableFuture<PermissionPolicyRemoveFromUserResponse> =
        removeFromUser(permissionPolicyId, params, RequestOptions.none())

    /** @see [removeFromUser] */
    fun removeFromUser(
        permissionPolicyId: String,
        params: PermissionPolicyRemoveFromUserParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyRemoveFromUserResponse> =
        removeFromUser(
            params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
            requestOptions,
        )

    /** @see [removeFromUser] */
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
        permissionPolicyId: String,
        params: PermissionPolicyRemoveFromUserGroupParams,
    ): CompletableFuture<PermissionPolicyRemoveFromUserGroupResponse> =
        removeFromUserGroup(permissionPolicyId, params, RequestOptions.none())

    /** @see [removeFromUserGroup] */
    fun removeFromUserGroup(
        permissionPolicyId: String,
        params: PermissionPolicyRemoveFromUserGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PermissionPolicyRemoveFromUserGroupResponse> =
        removeFromUserGroup(
            params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
            requestOptions,
        )

    /** @see [removeFromUserGroup] */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PermissionPolicyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/permissionpolicies`, but is
         * otherwise the same as [PermissionPolicyServiceAsync.create].
         */
        fun create(
            params: PermissionPolicyCreateParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: PermissionPolicyCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/permissionpolicies/{id}`, but
         * is otherwise the same as [PermissionPolicyServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>> =
            retrieve(id, PermissionPolicyRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: PermissionPolicyRetrieveParams = PermissionPolicyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: PermissionPolicyRetrieveParams = PermissionPolicyRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: PermissionPolicyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: PermissionPolicyRetrieveParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>> =
            retrieve(id, PermissionPolicyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /organizations/{orgId}/permissionpolicies/{id}`, but
         * is otherwise the same as [PermissionPolicyServiceAsync.update].
         */
        fun update(
            id: String,
            params: PermissionPolicyUpdateParams,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            params: PermissionPolicyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            params: PermissionPolicyUpdateParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: PermissionPolicyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/permissionpolicies`, but is
         * otherwise the same as [PermissionPolicyServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PermissionPolicyListPageAsync>> =
            list(PermissionPolicyListParams.none())

        /** @see [list] */
        fun list(
            params: PermissionPolicyListParams = PermissionPolicyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyListPageAsync>>

        /** @see [list] */
        fun list(
            params: PermissionPolicyListParams = PermissionPolicyListParams.none()
        ): CompletableFuture<HttpResponseFor<PermissionPolicyListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PermissionPolicyListPageAsync>> =
            list(PermissionPolicyListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /organizations/{orgId}/permissionpolicies/{id}`,
         * but is otherwise the same as [PermissionPolicyServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>> =
            delete(id, PermissionPolicyDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: PermissionPolicyDeleteParams = PermissionPolicyDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: PermissionPolicyDeleteParams = PermissionPolicyDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>> =
            delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: PermissionPolicyDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>>

        /** @see [delete] */
        fun delete(
            params: PermissionPolicyDeleteParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyResponse>> =
            delete(id, PermissionPolicyDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtoserviceuser`, but is
         * otherwise the same as [PermissionPolicyServiceAsync.addToServiceUser].
         */
        fun addToServiceUser(
            permissionPolicyId: String,
            params: PermissionPolicyAddToServiceUserParams,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToServiceUserResponse>> =
            addToServiceUser(permissionPolicyId, params, RequestOptions.none())

        /** @see [addToServiceUser] */
        fun addToServiceUser(
            permissionPolicyId: String,
            params: PermissionPolicyAddToServiceUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToServiceUserResponse>> =
            addToServiceUser(
                params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
                requestOptions,
            )

        /** @see [addToServiceUser] */
        fun addToServiceUser(
            params: PermissionPolicyAddToServiceUserParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToServiceUserResponse>> =
            addToServiceUser(params, RequestOptions.none())

        /** @see [addToServiceUser] */
        fun addToServiceUser(
            params: PermissionPolicyAddToServiceUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToServiceUserResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtosupportusers`, but is
         * otherwise the same as [PermissionPolicyServiceAsync.addToSupportUser].
         */
        fun addToSupportUser(
            permissionPolicyId: String
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToSupportUserResponse>> =
            addToSupportUser(permissionPolicyId, PermissionPolicyAddToSupportUserParams.none())

        /** @see [addToSupportUser] */
        fun addToSupportUser(
            permissionPolicyId: String,
            params: PermissionPolicyAddToSupportUserParams =
                PermissionPolicyAddToSupportUserParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToSupportUserResponse>> =
            addToSupportUser(
                params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
                requestOptions,
            )

        /** @see [addToSupportUser] */
        fun addToSupportUser(
            permissionPolicyId: String,
            params: PermissionPolicyAddToSupportUserParams =
                PermissionPolicyAddToSupportUserParams.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToSupportUserResponse>> =
            addToSupportUser(permissionPolicyId, params, RequestOptions.none())

        /** @see [addToSupportUser] */
        fun addToSupportUser(
            params: PermissionPolicyAddToSupportUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToSupportUserResponse>>

        /** @see [addToSupportUser] */
        fun addToSupportUser(
            params: PermissionPolicyAddToSupportUserParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToSupportUserResponse>> =
            addToSupportUser(params, RequestOptions.none())

        /** @see [addToSupportUser] */
        fun addToSupportUser(
            permissionPolicyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToSupportUserResponse>> =
            addToSupportUser(
                permissionPolicyId,
                PermissionPolicyAddToSupportUserParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtouser`, but is
         * otherwise the same as [PermissionPolicyServiceAsync.addToUser].
         */
        fun addToUser(
            permissionPolicyId: String,
            params: PermissionPolicyAddToUserParams,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToUserResponse>> =
            addToUser(permissionPolicyId, params, RequestOptions.none())

        /** @see [addToUser] */
        fun addToUser(
            permissionPolicyId: String,
            params: PermissionPolicyAddToUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToUserResponse>> =
            addToUser(
                params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
                requestOptions,
            )

        /** @see [addToUser] */
        fun addToUser(
            params: PermissionPolicyAddToUserParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToUserResponse>> =
            addToUser(params, RequestOptions.none())

        /** @see [addToUser] */
        fun addToUser(
            params: PermissionPolicyAddToUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToUserResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/addtousergroup`, but is
         * otherwise the same as [PermissionPolicyServiceAsync.addToUserGroup].
         */
        fun addToUserGroup(
            permissionPolicyId: String,
            params: PermissionPolicyAddToUserGroupParams,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToUserGroupResponse>> =
            addToUserGroup(permissionPolicyId, params, RequestOptions.none())

        /** @see [addToUserGroup] */
        fun addToUserGroup(
            permissionPolicyId: String,
            params: PermissionPolicyAddToUserGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToUserGroupResponse>> =
            addToUserGroup(
                params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
                requestOptions,
            )

        /** @see [addToUserGroup] */
        fun addToUserGroup(
            params: PermissionPolicyAddToUserGroupParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToUserGroupResponse>> =
            addToUserGroup(params, RequestOptions.none())

        /** @see [addToUserGroup] */
        fun addToUserGroup(
            params: PermissionPolicyAddToUserGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyAddToUserGroupResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromserviceuser`,
         * but is otherwise the same as [PermissionPolicyServiceAsync.removeFromServiceUser].
         */
        fun removeFromServiceUser(
            permissionPolicyId: String,
            params: PermissionPolicyRemoveFromServiceUserParams,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromServiceUserResponse>> =
            removeFromServiceUser(permissionPolicyId, params, RequestOptions.none())

        /** @see [removeFromServiceUser] */
        fun removeFromServiceUser(
            permissionPolicyId: String,
            params: PermissionPolicyRemoveFromServiceUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromServiceUserResponse>> =
            removeFromServiceUser(
                params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
                requestOptions,
            )

        /** @see [removeFromServiceUser] */
        fun removeFromServiceUser(
            params: PermissionPolicyRemoveFromServiceUserParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromServiceUserResponse>> =
            removeFromServiceUser(params, RequestOptions.none())

        /** @see [removeFromServiceUser] */
        fun removeFromServiceUser(
            params: PermissionPolicyRemoveFromServiceUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromServiceUserResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromsupportusers`,
         * but is otherwise the same as [PermissionPolicyServiceAsync.removeFromSupportUser].
         */
        fun removeFromSupportUser(
            permissionPolicyId: String
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromSupportUserResponse>> =
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
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromSupportUserResponse>> =
            removeFromSupportUser(
                params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
                requestOptions,
            )

        /** @see [removeFromSupportUser] */
        fun removeFromSupportUser(
            permissionPolicyId: String,
            params: PermissionPolicyRemoveFromSupportUserParams =
                PermissionPolicyRemoveFromSupportUserParams.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromSupportUserResponse>> =
            removeFromSupportUser(permissionPolicyId, params, RequestOptions.none())

        /** @see [removeFromSupportUser] */
        fun removeFromSupportUser(
            params: PermissionPolicyRemoveFromSupportUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromSupportUserResponse>>

        /** @see [removeFromSupportUser] */
        fun removeFromSupportUser(
            params: PermissionPolicyRemoveFromSupportUserParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromSupportUserResponse>> =
            removeFromSupportUser(params, RequestOptions.none())

        /** @see [removeFromSupportUser] */
        fun removeFromSupportUser(
            permissionPolicyId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromSupportUserResponse>> =
            removeFromSupportUser(
                permissionPolicyId,
                PermissionPolicyRemoveFromSupportUserParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromuser`, but is
         * otherwise the same as [PermissionPolicyServiceAsync.removeFromUser].
         */
        fun removeFromUser(
            permissionPolicyId: String,
            params: PermissionPolicyRemoveFromUserParams,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromUserResponse>> =
            removeFromUser(permissionPolicyId, params, RequestOptions.none())

        /** @see [removeFromUser] */
        fun removeFromUser(
            permissionPolicyId: String,
            params: PermissionPolicyRemoveFromUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromUserResponse>> =
            removeFromUser(
                params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
                requestOptions,
            )

        /** @see [removeFromUser] */
        fun removeFromUser(
            params: PermissionPolicyRemoveFromUserParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromUserResponse>> =
            removeFromUser(params, RequestOptions.none())

        /** @see [removeFromUser] */
        fun removeFromUser(
            params: PermissionPolicyRemoveFromUserParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromUserResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /organizations/{orgId}/permissionpolicies/{permissionPolicyId}/removefromusergroup`, but
         * is otherwise the same as [PermissionPolicyServiceAsync.removeFromUserGroup].
         */
        fun removeFromUserGroup(
            permissionPolicyId: String,
            params: PermissionPolicyRemoveFromUserGroupParams,
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromUserGroupResponse>> =
            removeFromUserGroup(permissionPolicyId, params, RequestOptions.none())

        /** @see [removeFromUserGroup] */
        fun removeFromUserGroup(
            permissionPolicyId: String,
            params: PermissionPolicyRemoveFromUserGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromUserGroupResponse>> =
            removeFromUserGroup(
                params.toBuilder().permissionPolicyId(permissionPolicyId).build(),
                requestOptions,
            )

        /** @see [removeFromUserGroup] */
        fun removeFromUserGroup(
            params: PermissionPolicyRemoveFromUserGroupParams
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromUserGroupResponse>> =
            removeFromUserGroup(params, RequestOptions.none())

        /** @see [removeFromUserGroup] */
        fun removeFromUserGroup(
            params: PermissionPolicyRemoveFromUserGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PermissionPolicyRemoveFromUserGroupResponse>>
    }
}
