// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking.users

import com.google.errorprone.annotations.MustBeClosed
import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.core.http.HttpResponseFor
import com.m3ter.sdk.models.InvitationResponse
import com.m3ter.sdk.models.UserInvitationCreateParams
import com.m3ter.sdk.models.UserInvitationListPage
import com.m3ter.sdk.models.UserInvitationListParams
import com.m3ter.sdk.models.UserInvitationRetrieveParams

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
    @JvmOverloads
    fun create(
        params: UserInvitationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvitationResponse

    /** Retrieve the specified invitation with the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: UserInvitationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvitationResponse

    /** Retrieve a list of all invitations in the Organization. */
    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: UserInvitationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvitationResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/invitations/{id}`, but is
         * otherwise the same as [InvitationService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: UserInvitationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InvitationResponse>

        /**
         * Returns a raw HTTP response for `get /organizations/{orgId}/invitations`, but is
         * otherwise the same as [InvitationService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: UserInvitationListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserInvitationListPage>
    }
}
