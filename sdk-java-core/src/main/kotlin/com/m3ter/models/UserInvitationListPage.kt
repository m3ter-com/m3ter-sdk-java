// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.users.InvitationService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of all invitations in the Organization. */
class UserInvitationListPage
private constructor(
    private val invitationsService: InvitationService,
    private val params: UserInvitationListParams,
    private val response: UserInvitationListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): UserInvitationListPageResponse = response

    /**
     * Delegates to [UserInvitationListPageResponse], but gracefully handles missing data.
     *
     * @see [UserInvitationListPageResponse.data]
     */
    fun data(): List<InvitationResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [UserInvitationListPageResponse], but gracefully handles missing data.
     *
     * @see [UserInvitationListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UserInvitationListPage && invitationsService == other.invitationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(invitationsService, params, response) /* spotless:on */

    override fun toString() =
        "UserInvitationListPage{invitationsService=$invitationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<UserInvitationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<UserInvitationListPage> {
        return getNextPageParams().map { invitationsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            invitationsService: InvitationService,
            params: UserInvitationListParams,
            response: UserInvitationListPageResponse,
        ) = UserInvitationListPage(invitationsService, params, response)
    }

    class AutoPager(private val firstPage: UserInvitationListPage) : Iterable<InvitationResponse> {

        override fun iterator(): Iterator<InvitationResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<InvitationResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
