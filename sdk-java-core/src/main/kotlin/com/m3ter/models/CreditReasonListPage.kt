// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.CreditReasonService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [CreditReasonService.list] */
class CreditReasonListPage
private constructor(
    private val service: CreditReasonService,
    private val params: CreditReasonListParams,
    private val response: CreditReasonListPageResponse,
) {

    /**
     * Delegates to [CreditReasonListPageResponse], but gracefully handles missing data.
     *
     * @see [CreditReasonListPageResponse.data]
     */
    fun data(): List<CreditReasonResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CreditReasonListPageResponse], but gracefully handles missing data.
     *
     * @see [CreditReasonListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<CreditReasonListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<CreditReasonListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CreditReasonListParams = params

    /** The response that this page was parsed from. */
    fun response(): CreditReasonListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditReasonListPage].
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

    /** A builder for [CreditReasonListPage]. */
    class Builder internal constructor() {

        private var service: CreditReasonService? = null
        private var params: CreditReasonListParams? = null
        private var response: CreditReasonListPageResponse? = null

        @JvmSynthetic
        internal fun from(creditReasonListPage: CreditReasonListPage) = apply {
            service = creditReasonListPage.service
            params = creditReasonListPage.params
            response = creditReasonListPage.response
        }

        fun service(service: CreditReasonService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CreditReasonListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CreditReasonListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CreditReasonListPage].
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
        fun build(): CreditReasonListPage =
            CreditReasonListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CreditReasonListPage) : Iterable<CreditReasonResponse> {

        override fun iterator(): Iterator<CreditReasonResponse> = iterator {
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

        fun stream(): Stream<CreditReasonResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditReasonListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CreditReasonListPage{service=$service, params=$params, response=$response}"
}
