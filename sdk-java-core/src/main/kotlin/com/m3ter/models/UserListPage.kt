// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.UserService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [UserService.list] */
class UserListPage
private constructor(
    private val service: UserService,
    private val params: UserListParams,
    private val response: UserListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<UserListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<UserListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): UserListParams = params

    /** The response that this page was parsed from. */
    fun response(): UserListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserListPage].
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

    /** A builder for [UserListPage]. */
    class Builder internal constructor() {

        private var service: UserService? = null
        private var params: UserListParams? = null
        private var response: UserListPageResponse? = null

        @JvmSynthetic
        internal fun from(userListPage: UserListPage) = apply {
            service = userListPage.service
            params = userListPage.params
            response = userListPage.response
        }

        fun service(service: UserService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: UserListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UserListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UserListPage].
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
        fun build(): UserListPage =
            UserListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: UserListPage) : Iterable<UserResponse> {

        override fun iterator(): Iterator<UserResponse> = iterator {
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

        fun stream(): Stream<UserResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UserListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() = "UserListPage{service=$service, params=$params, response=$response}"
}
