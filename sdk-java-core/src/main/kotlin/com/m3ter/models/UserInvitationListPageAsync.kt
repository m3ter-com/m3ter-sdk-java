// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.users.InvitationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of all invitations in the Organization. */
class UserInvitationListPageAsync
private constructor(
    private val invitationsService: InvitationServiceAsync,
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

        return /* spotless:off */ other is UserInvitationListPageAsync && invitationsService == other.invitationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(invitationsService, params, response) /* spotless:on */

    override fun toString() =
        "UserInvitationListPageAsync{invitationsService=$invitationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<UserInvitationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<UserInvitationListPageAsync>> {
        return getNextPageParams()
            .map { invitationsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            invitationsService: InvitationServiceAsync,
            params: UserInvitationListParams,
            response: UserInvitationListPageResponse,
        ) = UserInvitationListPageAsync(invitationsService, params, response)
    }

    class AutoPager(private val firstPage: UserInvitationListPageAsync) {

        fun forEach(
            action: Predicate<InvitationResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<UserInvitationListPageAsync>>.forEach(
                action: (InvitationResponse) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<InvitationResponse>> {
            val values = mutableListOf<InvitationResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
