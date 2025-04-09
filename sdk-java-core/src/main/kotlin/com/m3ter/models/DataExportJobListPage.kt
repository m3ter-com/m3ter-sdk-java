// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.dataExports.JobService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of Export Job entities. */
class DataExportJobListPage
private constructor(
    private val jobsService: JobService,
    private val params: DataExportJobListParams,
    private val response: DataExportJobListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DataExportJobListPageResponse = response

    /**
     * Delegates to [DataExportJobListPageResponse], but gracefully handles missing data.
     *
     * @see [DataExportJobListPageResponse.data]
     */
    fun data(): List<DataExportJobResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DataExportJobListPageResponse], but gracefully handles missing data.
     *
     * @see [DataExportJobListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportJobListPage && jobsService == other.jobsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(jobsService, params, response) /* spotless:on */

    override fun toString() =
        "DataExportJobListPage{jobsService=$jobsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<DataExportJobListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<DataExportJobListPage> {
        return getNextPageParams().map { jobsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            jobsService: JobService,
            params: DataExportJobListParams,
            response: DataExportJobListPageResponse,
        ) = DataExportJobListPage(jobsService, params, response)
    }

    class AutoPager(private val firstPage: DataExportJobListPage) :
        Iterable<DataExportJobResponse> {

        override fun iterator(): Iterator<DataExportJobResponse> = iterator {
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

        fun stream(): Stream<DataExportJobResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
