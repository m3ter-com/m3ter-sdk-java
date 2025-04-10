// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.MeterService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [MeterService.list] */
class MeterListPage
private constructor(
    private val service: MeterService,
    private val params: MeterListParams,
    private val response: MeterListPageResponse,
) {

    /**
     * Delegates to [MeterListPageResponse], but gracefully handles missing data.
     *
     * @see [MeterListPageResponse.data]
     */
    fun data(): List<MeterResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [MeterListPageResponse], but gracefully handles missing data.
     *
     * @see [MeterListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<MeterListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<MeterListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): MeterListParams = params

    /** The response that this page was parsed from. */
    fun response(): MeterListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MeterListPage].
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

    /** A builder for [MeterListPage]. */
    class Builder internal constructor() {

        private var service: MeterService? = null
        private var params: MeterListParams? = null
        private var response: MeterListPageResponse? = null

        @JvmSynthetic
        internal fun from(meterListPage: MeterListPage) = apply {
            service = meterListPage.service
            params = meterListPage.params
            response = meterListPage.response
        }

        fun service(service: MeterService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: MeterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MeterListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MeterListPage].
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
        fun build(): MeterListPage =
            MeterListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: MeterListPage) : Iterable<MeterResponse> {

        override fun iterator(): Iterator<MeterResponse> = iterator {
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

        fun stream(): Stream<MeterResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MeterListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() = "MeterListPage{service=$service, params=$params, response=$response}"
}
