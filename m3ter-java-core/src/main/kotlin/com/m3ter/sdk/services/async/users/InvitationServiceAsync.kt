// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.m3ter.sdk.services.async.users

import com.m3ter.sdk.core.RequestOptions
import com.m3ter.sdk.models.Invitation
import com.m3ter.sdk.models.UserInvitationCreateParams
import com.m3ter.sdk.models.UserInvitationListPageAsync
import com.m3ter.sdk.models.UserInvitationListParams
import com.m3ter.sdk.models.UserInvitationRetrieveParams
import java.util.concurrent.CompletableFuture

interface InvitationServiceAsync {

    /**
     * Invite a new user to your Organization.
     *
     * This sends an email to someone inviting them to join your m3ter Organization.
     */
    @JvmOverloads
    fun create(
        params: UserInvitationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invitation>

    /** Retrieve the specified invitation with the given UUID. */
    @JvmOverloads
    fun retrieve(
        params: UserInvitationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Invitation>

    /** Retrieve a list of all invitations in the Organization. */
    @JvmOverloads
    fun list(
        params: UserInvitationListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UserInvitationListPageAsync>
}
