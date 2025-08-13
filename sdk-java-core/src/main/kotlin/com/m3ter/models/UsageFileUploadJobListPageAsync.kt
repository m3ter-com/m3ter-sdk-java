// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPagerAsync
import com.m3ter.core.PageAsync
import com.m3ter.core.checkRequired
import com.m3ter.services.async.usage.fileUploads.JobServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see JobServiceAsync.list */
class UsageFileUploadJobListPageAsync
private constructor(
    private val service: JobServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: UsageFileUploadJobListParams,
    private val response: UsageFileUploadJobListPageResponse,
) : PageAsync<FileUploadJobResponse> {

    /**
     * Delegates to [UsageFileUploadJobListPageResponse], but gracefully handles missing data.
     *
     * @see UsageFileUploadJobListPageResponse.data
     */
    fun data(): List<FileUploadJobResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [UsageFileUploadJobListPageResponse], but gracefully handles missing data.
     *
     * @see UsageFileUploadJobListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<FileUploadJobResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): UsageFileUploadJobListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): CompletableFuture<UsageFileUploadJobListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<FileUploadJobResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): UsageFileUploadJobListParams = params

    /** The response that this page was parsed from. */
    fun response(): UsageFileUploadJobListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [UsageFileUploadJobListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageFileUploadJobListPageAsync]. */
    class Builder internal constructor() {

        private var service: JobServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: UsageFileUploadJobListParams? = null
        private var response: UsageFileUploadJobListPageResponse? = null

        @JvmSynthetic
        internal fun from(usageFileUploadJobListPageAsync: UsageFileUploadJobListPageAsync) =
            apply {
                service = usageFileUploadJobListPageAsync.service
                streamHandlerExecutor = usageFileUploadJobListPageAsync.streamHandlerExecutor
                params = usageFileUploadJobListPageAsync.params
                response = usageFileUploadJobListPageAsync.response
            }

        fun service(service: JobServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: UsageFileUploadJobListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UsageFileUploadJobListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [UsageFileUploadJobListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsageFileUploadJobListPageAsync =
            UsageFileUploadJobListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageFileUploadJobListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "UsageFileUploadJobListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
