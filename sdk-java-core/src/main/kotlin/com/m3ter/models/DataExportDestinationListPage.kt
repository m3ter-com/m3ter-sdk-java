// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.dataExports.DestinationService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [DestinationService.list] */
class DataExportDestinationListPage
private constructor(
    private val service: DestinationService,
    private val params: DataExportDestinationListParams,
    private val response: DataExportDestinationListPageResponse,
) {

    /**
     * Delegates to [DataExportDestinationListPageResponse], but gracefully handles missing data.
     *
     * @see [DataExportDestinationListPageResponse.data]
     */
    fun data(): List<DataExportDestinationResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DataExportDestinationListPageResponse], but gracefully handles missing data.
     *
     * @see [DataExportDestinationListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<DataExportDestinationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<DataExportDestinationListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): DataExportDestinationListParams = params

    /** The response that this page was parsed from. */
    fun response(): DataExportDestinationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DataExportDestinationListPage].
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

    /** A builder for [DataExportDestinationListPage]. */
    class Builder internal constructor() {

        private var service: DestinationService? = null
        private var params: DataExportDestinationListParams? = null
        private var response: DataExportDestinationListPageResponse? = null

        @JvmSynthetic
        internal fun from(dataExportDestinationListPage: DataExportDestinationListPage) = apply {
            service = dataExportDestinationListPage.service
            params = dataExportDestinationListPage.params
            response = dataExportDestinationListPage.response
        }

        fun service(service: DestinationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DataExportDestinationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DataExportDestinationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DataExportDestinationListPage].
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
        fun build(): DataExportDestinationListPage =
            DataExportDestinationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: DataExportDestinationListPage) :
        Iterable<DataExportDestinationResponse> {

        override fun iterator(): Iterator<DataExportDestinationResponse> = iterator {
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

        fun stream(): Stream<DataExportDestinationResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportDestinationListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DataExportDestinationListPage{service=$service, params=$params, response=$response}"
}
