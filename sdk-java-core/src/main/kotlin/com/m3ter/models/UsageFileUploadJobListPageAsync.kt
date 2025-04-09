// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.services.async.usage.fileUploads.JobServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/**
 * Lists the File Upload jobs. Part of the File Upload service for measurements ingest:
 * - You can use the `dateCreatedStart` and `dateCreatedEnd` optional Query parameters to define a
 *   date range to filter the File Uploads jobs returned for this call.
 * - If `dateCreatedStart` and `dateCreatedEnd` Query parameters are not used, then all File Upload
 *   jobs are returned.
 */
class UsageFileUploadJobListPageAsync
private constructor(
    private val jobsService: JobServiceAsync,
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

        return /* spotless:off */ other is UsageFileUploadJobListPageAsync && jobsService == other.jobsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(jobsService, params, response) /* spotless:on */

    override fun toString() =
        "UsageFileUploadJobListPageAsync{jobsService=$jobsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<UsageFileUploadJobListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<UsageFileUploadJobListPageAsync>> {
        return getNextPageParams()
            .map { jobsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            jobsService: JobServiceAsync,
            params: UsageFileUploadJobListParams,
            response: UsageFileUploadJobListPageResponse,
        ) = UsageFileUploadJobListPageAsync(jobsService, params, response)
    }

    class AutoPager(private val firstPage: UsageFileUploadJobListPageAsync) {

        fun forEach(
            action: Predicate<FileUploadJobResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<UsageFileUploadJobListPageAsync>>.forEach(
                action: (FileUploadJobResponse) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<FileUploadJobResponse>> {
            val values = mutableListOf<FileUploadJobResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
