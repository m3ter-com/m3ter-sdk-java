// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.usage.fileUploads.JobService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see JobService.list */
class UsageFileUploadJobListPage
private constructor(
    private val service: JobService,
    private val params: UsageFileUploadJobListParams,
    private val response: UsageFileUploadJobListPageResponse,
) : Page<FileUploadJobResponse> {

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

    override fun nextPage(): UsageFileUploadJobListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<FileUploadJobResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): UsageFileUploadJobListParams = params

    /** The response that this page was parsed from. */
    fun response(): UsageFileUploadJobListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UsageFileUploadJobListPage].
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

    /** A builder for [UsageFileUploadJobListPage]. */
    class Builder internal constructor() {

        private var service: JobService? = null
        private var params: UsageFileUploadJobListParams? = null
        private var response: UsageFileUploadJobListPageResponse? = null

        @JvmSynthetic
        internal fun from(usageFileUploadJobListPage: UsageFileUploadJobListPage) = apply {
            service = usageFileUploadJobListPage.service
            params = usageFileUploadJobListPage.params
            response = usageFileUploadJobListPage.response
        }

        fun service(service: JobService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: UsageFileUploadJobListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UsageFileUploadJobListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [UsageFileUploadJobListPage].
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
        fun build(): UsageFileUploadJobListPage =
            UsageFileUploadJobListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsageFileUploadJobListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "UsageFileUploadJobListPage{service=$service, params=$params, response=$response}"
}
