// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.async.users

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.InvitationResponse
import com.m3ter.models.UserInvitationCreateParams
import com.m3ter.models.UserInvitationListPageAsync
import com.m3ter.models.UserInvitationListParams
import com.m3ter.models.UserInvitationRetrieveParams
import java.util.concurrent.CompletableFuture

interface InvitationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Invite a new user to your Organization.
     *
     * This sends an email to someone inviting them to join your m3ter Organization.
     */
    fun create(params: UserInvitationCreateParams): CompletableFuture<InvitationResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: UserInvitationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvitationResponse>

    /** Retrieve the specified invitation with the given UUID. */
    fun retrieve(params: UserInvitationRetrieveParams): CompletableFuture<InvitationResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: UserInvitationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InvitationResponse>

    /** Retrieve a list of all invitations in the Organization. */
    fun list(params: UserInvitationListParams): CompletableFuture<UserInvitationListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: UserInvitationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserInvitationListPageAsync>

    /**
     * A view of [InvitationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/invitations`, but is
         * otherwise the same as [InvitationServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: UserInvitationCreateParams
        ): CompletableFuture<HttpResponseFor<InvitationResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: UserInvitationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvitationResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/invitations/{id}`, but is
         * otherwise the same as [InvitationServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: UserInvitationRetrieveParams
        ): CompletableFuture<HttpResponseFor<InvitationResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: UserInvitationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InvitationResponse>>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/invitations`, but is
         * otherwise the same as [InvitationServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: UserInvitationListParams
        ): CompletableFuture<HttpResponseFor<UserInvitationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: UserInvitationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UserInvitationListPageAsync>>
    }
}
