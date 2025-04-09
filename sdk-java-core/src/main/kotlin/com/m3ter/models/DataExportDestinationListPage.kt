// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.dataExports.DestinationService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of Export Destination entities. You can filter the list of Destinations returned
 * by UUID.
 */
class DataExportDestinationListPage
private constructor(
    private val destinationsService: DestinationService,
    private val params: DataExportDestinationListParams,
    private val response: DataExportDestinationListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DataExportDestinationListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportDestinationListPage && destinationsService == other.destinationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(destinationsService, params, response) /* spotless:on */

    override fun toString() =
        "DataExportDestinationListPage{destinationsService=$destinationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<DataExportDestinationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<DataExportDestinationListPage> {
        return getNextPageParams().map { destinationsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            destinationsService: DestinationService,
            params: DataExportDestinationListParams,
            response: DataExportDestinationListPageResponse,
        ) = DataExportDestinationListPage(destinationsService, params, response)
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
}
