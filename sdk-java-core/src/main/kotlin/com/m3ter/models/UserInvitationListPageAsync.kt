// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.users.InvitationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see InvitationServiceAsync.list */
class UserInvitationListPageAsync
private constructor(
    private val service: InvitationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: UserInvitationListParams,
    private val response: UserInvitationListPageResponse,
) : PageAsync<InvitationResponse> {

    /**
     * Delegates to [UserInvitationListPageResponse], but gracefully handles missing data.
     *
     * @see UserInvitationListPageResponse.data
     */
    fun data(): List<InvitationResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [UserInvitationListPageResponse], but gracefully handles missing data.
     *
     * @see UserInvitationListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<InvitationResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): UserInvitationListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<UserInvitationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InvitationResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserInvitationListPageAsync]. */
    class Builder internal constructor() {

        private var service: InvitationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: UserInvitationListParams? = null
        private var response: UserInvitationListPageResponse? = null

        @JvmSynthetic
        internal fun from(userInvitationListPageAsync: UserInvitationListPageAsync) = apply {
            service = userInvitationListPageAsync.service
            streamHandlerExecutor = userInvitationListPageAsync.streamHandlerExecutor
            params = userInvitationListPageAsync.params
            response = userInvitationListPageAsync.response
        }

        fun service(service: InvitationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserInvitationListPageAsync =
            UserInvitationListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserInvitationListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "UserInvitationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
