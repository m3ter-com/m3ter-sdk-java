// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.dataExports.ScheduleService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [ScheduleService.list] */
class DataExportScheduleListPage
private constructor(
    private val service: ScheduleService,
    private val params: DataExportScheduleListParams,
    private val response: DataExportScheduleListPageResponse,
) {

    /**
     * Delegates to [DataExportScheduleListPageResponse], but gracefully handles missing data.
     *
     * @see [DataExportScheduleListPageResponse.data]
     */
    fun data(): List<DataExportScheduleListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DataExportScheduleListPageResponse], but gracefully handles missing data.
     *
     * @see [DataExportScheduleListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<DataExportScheduleListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<DataExportScheduleListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): DataExportScheduleListParams = params

    /** The response that this page was parsed from. */
    fun response(): DataExportScheduleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DataExportScheduleListPage].
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

    /** A builder for [DataExportScheduleListPage]. */
    class Builder internal constructor() {

        private var service: ScheduleService? = null
        private var params: DataExportScheduleListParams? = null
        private var response: DataExportScheduleListPageResponse? = null

        @JvmSynthetic
        internal fun from(dataExportScheduleListPage: DataExportScheduleListPage) = apply {
            service = dataExportScheduleListPage.service
            params = dataExportScheduleListPage.params
            response = dataExportScheduleListPage.response
        }

        fun service(service: ScheduleService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DataExportScheduleListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DataExportScheduleListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DataExportScheduleListPage].
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
        fun build(): DataExportScheduleListPage =
            DataExportScheduleListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: DataExportScheduleListPage) :
        Iterable<DataExportScheduleListResponse> {

        override fun iterator(): Iterator<DataExportScheduleListResponse> = iterator {
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

        fun stream(): Stream<DataExportScheduleListResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportScheduleListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DataExportScheduleListPage{service=$service, params=$params, response=$response}"
}
