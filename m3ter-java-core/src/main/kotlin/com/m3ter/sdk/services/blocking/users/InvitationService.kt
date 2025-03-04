// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.blocking.users

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.Invitation
import com.m3ter.sdk.models.UserInvitationCreateParams
import com.m3ter.sdk.models.UserInvitationListPage
import com.m3ter.sdk.models.UserInvitationListParams
import com.m3ter.sdk.models.UserInvitationRetrieveParams

interface InvitationService {

    /**
     * Invite a new user to your Organization.
     *
     * This sends an email to someone inviting them to join your m3ter Organization.
     */
    @JvmOverloads
    fun create(
        params: UserInvitationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invitation

    /** Retrieve the specified invitation with the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: UserInvitationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Invitation

    /** Retrieve a list of all invitations in the Organization. */
    @JvmOverloads
    fun list(
        params: UserInvitationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserInvitationListPage
}
