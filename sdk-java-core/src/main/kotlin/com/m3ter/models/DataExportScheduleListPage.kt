// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.dataExports.ScheduleService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ScheduleService.list */
class DataExportScheduleListPage
private constructor(
    private val service: ScheduleService,
    private val params: DataExportScheduleListParams,
    private val response: DataExportScheduleListPageResponse,
) : Page<DataExportScheduleListResponse> {

    /**
     * Delegates to [DataExportScheduleListPageResponse], but gracefully handles missing data.
     *
     * @see DataExportScheduleListPageResponse.data
     */
    fun data(): List<DataExportScheduleListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DataExportScheduleListPageResponse], but gracefully handles missing data.
     *
     * @see DataExportScheduleListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<DataExportScheduleListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): DataExportScheduleListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): DataExportScheduleListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DataExportScheduleListResponse> = AutoPager.from(this)

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
