// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.lookupTables.lookupTableRevisionData.LookupTableRevisionDataJobService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see LookupTableRevisionDataJobService.list */
class LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage
private constructor(
    private val service: LookupTableRevisionDataJobService,
    private val params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams,
    private val response:
        LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse,
) : Page<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse> {

    /**
     * Delegates to [LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse],
     * but gracefully handles missing data.
     *
     * @see LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse.data
     */
    fun data(): List<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse],
     * but gracefully handles missing data.
     *
     * @see LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items():
        List<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage =
        service.list(nextPageParams())

    fun autoPager():
        AutoPager<LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListResponse> =
        AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams = params

    /** The response that this page was parsed from. */
    fun response(): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse =
        response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage].
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

    /** A builder for [LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage]. */
    class Builder internal constructor() {

        private var service: LookupTableRevisionDataJobService? = null
        private var params:
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams? =
            null
        private var response:
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse? =
            null

        @JvmSynthetic
        internal fun from(
            lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage:
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage
        ) = apply {
            service = lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage.service
            params = lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage.params
            response = lookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage.response
        }

        fun service(service: LookupTableRevisionDataJobService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun response(
            response: LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPageResponse
        ) = apply { this.response = response }

        /**
         * Returns an immutable instance of
         * [LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage].
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
        fun build(): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage =
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "LookupTableLookupTableRevisionDataLookupTableRevisionDataJobListPage{service=$service, params=$params, response=$response}"
}
