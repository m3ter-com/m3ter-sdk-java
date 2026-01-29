// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.lookupTables.LookupTableRevisionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see LookupTableRevisionService.list */
class LookupTableLookupTableRevisionListPage
private constructor(
    private val service: LookupTableRevisionService,
    private val params: LookupTableLookupTableRevisionListParams,
    private val response: LookupTableLookupTableRevisionListPageResponse,
) : Page<LookupTableRevisionResponse> {

    /**
     * Delegates to [LookupTableLookupTableRevisionListPageResponse], but gracefully handles missing
     * data.
     *
     * @see LookupTableLookupTableRevisionListPageResponse.data
     */
    fun data(): List<LookupTableRevisionResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [LookupTableLookupTableRevisionListPageResponse], but gracefully handles missing
     * data.
     *
     * @see LookupTableLookupTableRevisionListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<LookupTableRevisionResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): LookupTableLookupTableRevisionListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): LookupTableLookupTableRevisionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LookupTableRevisionResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LookupTableLookupTableRevisionListParams = params

    /** The response that this page was parsed from. */
    fun response(): LookupTableLookupTableRevisionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LookupTableLookupTableRevisionListPage].
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

    /** A builder for [LookupTableLookupTableRevisionListPage]. */
    class Builder internal constructor() {

        private var service: LookupTableRevisionService? = null
        private var params: LookupTableLookupTableRevisionListParams? = null
        private var response: LookupTableLookupTableRevisionListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            lookupTableLookupTableRevisionListPage: LookupTableLookupTableRevisionListPage
        ) = apply {
            service = lookupTableLookupTableRevisionListPage.service
            params = lookupTableLookupTableRevisionListPage.params
            response = lookupTableLookupTableRevisionListPage.response
        }

        fun service(service: LookupTableRevisionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LookupTableLookupTableRevisionListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: LookupTableLookupTableRevisionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [LookupTableLookupTableRevisionListPage].
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
        fun build(): LookupTableLookupTableRevisionListPage =
            LookupTableLookupTableRevisionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LookupTableLookupTableRevisionListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "LookupTableLookupTableRevisionListPage{service=$service, params=$params, response=$response}"
}
