// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.blocking.usage.fileUploads.JobService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * Lists the File Upload jobs. Part of the File Upload service for measurements ingest:
 * - You can use the `dateCreatedStart` and `dateCreatedEnd` optional Query parameters to define a
 *   date range to filter the File Uploads jobs returned for this call.
 * - If `dateCreatedStart` and `dateCreatedEnd` Query parameters are not used, then all File Upload
 *   jobs are returned.
 */
class UsageFileUploadJobListPage
private constructor(
    private val jobsService: JobService,
    private val params: UsageFileUploadJobListParams,
    private val response: UsageFileUploadJobListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): UsageFileUploadJobListPageResponse = response

    /**
     * Delegates to [UsageFileUploadJobListPageResponse], but gracefully handles missing data.
     *
     * @see [UsageFileUploadJobListPageResponse.data]
     */
    fun data(): List<FileUploadJobResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [UsageFileUploadJobListPageResponse], but gracefully handles missing data.
     *
     * @see [UsageFileUploadJobListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UsageFileUploadJobListPage && jobsService == other.jobsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(jobsService, params, response) /* spotless:on */

    override fun toString() =
        "UsageFileUploadJobListPage{jobsService=$jobsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<UsageFileUploadJobListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<UsageFileUploadJobListPage> {
        return getNextPageParams().map { jobsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            jobsService: JobService,
            params: UsageFileUploadJobListParams,
            response: UsageFileUploadJobListPageResponse,
        ) = UsageFileUploadJobListPage(jobsService, params, response)
    }

    class AutoPager(private val firstPage: UsageFileUploadJobListPage) :
        Iterable<FileUploadJobResponse> {

        override fun iterator(): Iterator<FileUploadJobResponse> = iterator {
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

        fun stream(): Stream<FileUploadJobResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
