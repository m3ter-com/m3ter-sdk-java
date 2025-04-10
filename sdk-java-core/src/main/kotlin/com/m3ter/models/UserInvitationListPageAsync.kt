// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.async.users.InvitationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [InvitationServiceAsync.list] */
class UserInvitationListPageAsync
private constructor(
    private val service: InvitationServiceAsync,
    private val params: UserInvitationListParams,
    private val response: UserInvitationListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<UserInvitationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<UserInvitationListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): UserInvitationListParams = params

    /** The response that this page was parsed from. */
    fun response(): UserInvitationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserInvitationListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserInvitationListPageAsync]. */
    class Builder internal constructor() {

        private var service: InvitationServiceAsync? = null
        private var params: UserInvitationListParams? = null
        private var response: UserInvitationListPageResponse? = null

        @JvmSynthetic
        internal fun from(userInvitationListPageAsync: UserInvitationListPageAsync) = apply {
            service = userInvitationListPageAsync.service
            params = userInvitationListPageAsync.params
            response = userInvitationListPageAsync.response
        }

        fun service(service: InvitationServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: UserInvitationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UserInvitationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UserInvitationListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserInvitationListPageAsync =
            UserInvitationListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UserInvitationListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "UserInvitationListPageAsync{service=$service, params=$params, response=$response}"
}
