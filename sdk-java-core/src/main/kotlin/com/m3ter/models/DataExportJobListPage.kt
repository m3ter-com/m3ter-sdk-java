// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.dataExports.JobService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see JobService.list */
class DataExportJobListPage
private constructor(
    private val service: JobService,
    private val params: DataExportJobListParams,
    private val response: DataExportJobListPageResponse,
) : Page<DataExportJobResponse> {

    /**
     * Delegates to [DataExportJobListPageResponse], but gracefully handles missing data.
     *
     * @see DataExportJobListPageResponse.data
     */
    fun data(): List<DataExportJobResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DataExportJobListPageResponse], but gracefully handles missing data.
     *
     * @see DataExportJobListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<DataExportJobResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): DataExportJobListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): DataExportJobListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DataExportJobResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DataExportJobListParams = params

    /** The response that this page was parsed from. */
    fun response(): DataExportJobListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DataExportJobListPage].
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

    /** A builder for [DataExportJobListPage]. */
    class Builder internal constructor() {

        private var service: JobService? = null
        private var params: DataExportJobListParams? = null
        private var response: DataExportJobListPageResponse? = null

        @JvmSynthetic
        internal fun from(dataExportJobListPage: DataExportJobListPage) = apply {
            service = dataExportJobListPage.service
            params = dataExportJobListPage.params
            response = dataExportJobListPage.response
        }

        fun service(service: JobService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DataExportJobListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DataExportJobListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DataExportJobListPage].
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
        fun build(): DataExportJobListPage =
            DataExportJobListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataExportJobListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DataExportJobListPage{service=$service, params=$params, response=$response}"
}
