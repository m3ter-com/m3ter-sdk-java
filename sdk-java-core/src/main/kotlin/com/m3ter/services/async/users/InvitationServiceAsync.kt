// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.users

import com.m3ter.core.ClientOptions
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.InvitationResponse
import com.m3ter.models.UserInvitationCreateParams
import com.m3ter.models.UserInvitationListPageAsync
import com.m3ter.models.UserInvitationListParams
import com.m3ter.models.UserInvitationRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InvitationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InvitationServiceAsync

    /**
     * Invite a new user to your Organization.
     *
     * This sends an email to someone inviting them to join your m3ter Organization.
     */
    fun create(params: UserInvitationCreateParams): CompletableFuture<InvitationResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: UserInvitationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvitationResponse>

    /** Retrieve the specified invitation with the given UUID. */
    fun retrieve(id: String): CompletableFuture<InvitationResponse> =
        retrieve(id, UserInvitationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: UserInvitationRetrieveParams = UserInvitationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvitationResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: UserInvitationRetrieveParams = UserInvitationRetrieveParams.none(),
    ): CompletableFuture<InvitationResponse> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: UserInvitationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvitationResponse>

    /** @see retrieve */
    fun retrieve(params: UserInvitationRetrieveParams): CompletableFuture<InvitationResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<InvitationResponse> =
        retrieve(id, UserInvitationRetrieveParams.none(), requestOptions)

    /** Retrieve a list of all invitations in the Organization. */
    fun list(): CompletableFuture<UserInvitationListPageAsync> =
        list(UserInvitationListParams.none())

    /** @see list */
    fun list(
        params: UserInvitationListParams = UserInvitationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserInvitationListPageAsync>

    /** @see list */
    fun list(
        params: UserInvitationListParams = UserInvitationListParams.none()
    ): CompletableFuture<UserInvitationListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<UserInvitationListPageAsync> =
        list(UserInvitationListParams.none(), requestOptions)

    /**
     * A view of [InvitationServiceAsync] that provides access to raw HTTP responses for each
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
        ): InvitationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/invitations`, but is
         * otherwise the same as [InvitationServiceAsync.create].
         */
        fun create(
            params: UserInvitationCreateParams
        ): CompletableFuture<HttpResponseFor<InvitationResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: UserInvitationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvitationResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/invitations/{id}`, but is
         * otherwise the same as [InvitationServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<InvitationResponse>> =
            retrieve(id, UserInvitationRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: UserInvitationRetrieveParams = UserInvitationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvitationResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: UserInvitationRetrieveParams = UserInvitationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<InvitationResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: UserInvitationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvitationResponse>>

        /** @see retrieve */
        fun retrieve(
            params: UserInvitationRetrieveParams
        ): CompletableFuture<HttpResponseFor<InvitationResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InvitationResponse>> =
            retrieve(id, UserInvitationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/invitations`, but is
         * otherwise the same as [InvitationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<UserInvitationListPageAsync>> =
            list(UserInvitationListParams.none())

        /** @see list */
        fun list(
            params: UserInvitationListParams = UserInvitationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserInvitationListPageAsync>>

        /** @see list */
        fun list(
            params: UserInvitationListParams = UserInvitationListParams.none()
        ): CompletableFuture<HttpResponseFor<UserInvitationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UserInvitationListPageAsync>> =
            list(UserInvitationListParams.none(), requestOptions)
    }
}
