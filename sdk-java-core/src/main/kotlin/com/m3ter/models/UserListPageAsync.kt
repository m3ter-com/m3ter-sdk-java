// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.UserServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of OrgUsers.
 *
 * Retrieves a list of all users within a specified Organization. Use this endpoint to get an
 * overview of all users and their basic details. The list can be paginated for easier management.
 */
class UserListPageAsync
private constructor(
    private val usersService: UserServiceAsync,
    private val params: UserListParams,
    private val response: UserListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): UserListPageResponse = response

    /**
     * Delegates to [UserListPageResponse], but gracefully handles missing data.
     *
     * @see [UserListPageResponse.data]
     */
    fun data(): List<UserResponse> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [UserListPageResponse], but gracefully handles missing data.
     *
     * @see [UserListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UserListPageAsync && usersService == other.usersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(usersService, params, response) /* spotless:on */

    override fun toString() =
        "UserListPageAsync{usersService=$usersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<UserListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<UserListPageAsync>> {
        return getNextPageParams()
            .map { usersService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            usersService: UserServiceAsync,
            params: UserListParams,
            response: UserListPageResponse,
        ) = UserListPageAsync(usersService, params, response)
    }

    class AutoPager(private val firstPage: UserListPageAsync) {

        fun forEach(action: Predicate<UserResponse>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<UserListPageAsync>>.forEach(
                action: (UserResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<UserResponse>> {
            val values = mutableListOf<UserResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
