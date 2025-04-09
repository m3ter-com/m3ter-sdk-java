// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.dataExports.ScheduleService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of Data Export Schedules created for your Organization. You can filter the
 * response by Schedules `ids`.
 *
 * The response will contain an array for both the operational and usage Data Export Schedules in
 * your Organization.
 */
class DataExportScheduleListPage
private constructor(
    private val schedulesService: ScheduleService,
    private val params: DataExportScheduleListParams,
    private val response: DataExportScheduleListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DataExportScheduleListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportScheduleListPage && schedulesService == other.schedulesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(schedulesService, params, response) /* spotless:on */

    override fun toString() =
        "DataExportScheduleListPage{schedulesService=$schedulesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<DataExportScheduleListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<DataExportScheduleListPage> {
        return getNextPageParams().map { schedulesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            schedulesService: ScheduleService,
            params: DataExportScheduleListParams,
            response: DataExportScheduleListPageResponse,
        ) = DataExportScheduleListPage(schedulesService, params, response)
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
}
