// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.DebitReasonService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [DebitReasonService.list] */
class DebitReasonListPage
private constructor(
    private val service: DebitReasonService,
    private val params: DebitReasonListParams,
    private val response: DebitReasonListPageResponse,
) {

    /**
     * Delegates to [DebitReasonListPageResponse], but gracefully handles missing data.
     *
     * @see [DebitReasonListPageResponse.data]
     */
    fun data(): List<DebitReasonResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DebitReasonListPageResponse], but gracefully handles missing data.
     *
     * @see [DebitReasonListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<DebitReasonListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<DebitReasonListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): DebitReasonListParams = params

    /** The response that this page was parsed from. */
    fun response(): DebitReasonListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DebitReasonListPage].
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

    /** A builder for [DebitReasonListPage]. */
    class Builder internal constructor() {

        private var service: DebitReasonService? = null
        private var params: DebitReasonListParams? = null
        private var response: DebitReasonListPageResponse? = null

        @JvmSynthetic
        internal fun from(debitReasonListPage: DebitReasonListPage) = apply {
            service = debitReasonListPage.service
            params = debitReasonListPage.params
            response = debitReasonListPage.response
        }

        fun service(service: DebitReasonService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DebitReasonListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DebitReasonListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DebitReasonListPage].
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
        fun build(): DebitReasonListPage =
            DebitReasonListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: DebitReasonListPage) : Iterable<DebitReasonResponse> {

        override fun iterator(): Iterator<DebitReasonResponse> = iterator {
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

        fun stream(): Stream<DebitReasonResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DebitReasonListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DebitReasonListPage{service=$service, params=$params, response=$response}"
}
