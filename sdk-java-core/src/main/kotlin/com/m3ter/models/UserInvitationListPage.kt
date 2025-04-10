// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.users.InvitationService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [InvitationService.list] */
class UserInvitationListPage
private constructor(
    private val service: InvitationService,
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

    fun getNextPage(): Optional<UserInvitationListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): UserInvitationListParams = params

    /** The response that this page was parsed from. */
    fun response(): UserInvitationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserInvitationListPage].
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

    /** A builder for [UserInvitationListPage]. */
    class Builder internal constructor() {

        private var service: InvitationService? = null
        private var params: UserInvitationListParams? = null
        private var response: UserInvitationListPageResponse? = null

        @JvmSynthetic
        internal fun from(userInvitationListPage: UserInvitationListPage) = apply {
            service = userInvitationListPage.service
            params = userInvitationListPage.params
            response = userInvitationListPage.response
        }

        fun service(service: InvitationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: UserInvitationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UserInvitationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UserInvitationListPage].
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
        fun build(): UserInvitationListPage =
            UserInvitationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UserInvitationListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "UserInvitationListPage{service=$service, params=$params, response=$response}"
}
