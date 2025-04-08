// File generated from our OpenAPI spec by Stainless.

package com.m3ter.services.blocking.users

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.core.RequestOptions
import com.m3ter.core.http.HttpResponseFor
import com.m3ter.models.InvitationResponse
import com.m3ter.models.UserInvitationCreateParams
import com.m3ter.models.UserInvitationListPage
import com.m3ter.models.UserInvitationListParams
import com.m3ter.models.UserInvitationRetrieveParams

interface InvitationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Invite a new user to your Organization.
     *
     * This sends an email to someone inviting them to join your m3ter Organization.
     */
    fun create(params: UserInvitationCreateParams): InvitationResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: UserInvitationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvitationResponse

    /** Retrieve the specified invitation with the given UUID. */
    fun retrieve(params: UserInvitationRetrieveParams): InvitationResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: UserInvitationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvitationResponse

    /** Retrieve a list of all invitations in the Organization. */
    fun list(params: UserInvitationListParams): UserInvitationListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: UserInvitationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserInvitationListPage

    /** A view of [InvitationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /organizations/{orgId}/invitations`, but is
         * otherwise the same as [InvitationService.create].
         */
        @MustBeClosed
        fun create(params: UserInvitationCreateParams): HttpResponseFor<InvitationResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: UserInvitationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvitationResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/invitations/{id}`, but is
         * otherwise the same as [InvitationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: UserInvitationRetrieveParams): HttpResponseFor<InvitationResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: UserInvitationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvitationResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/invitations`, but is
         * otherwise the same as [InvitationService.list].
         */
        @MustBeClosed
        fun list(params: UserInvitationListParams): HttpResponseFor<UserInvitationListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: UserInvitationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserInvitationListPage>
    }
}
