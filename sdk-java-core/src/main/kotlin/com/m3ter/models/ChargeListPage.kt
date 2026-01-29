// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.ChargeService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ChargeService.list */
class ChargeListPage
private constructor(
    private val service: ChargeService,
    private val params: ChargeListParams,
    private val response: ChargeListPageResponse,
) : Page<ChargeListResponse> {

    /**
     * Delegates to [ChargeListPageResponse], but gracefully handles missing data.
     *
     * @see ChargeListPageResponse.data
     */
    fun data(): List<ChargeListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ChargeListPageResponse], but gracefully handles missing data.
     *
     * @see ChargeListPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<ChargeListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): ChargeListParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): ChargeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ChargeListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ChargeListParams = params

    /** The response that this page was parsed from. */
    fun response(): ChargeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ChargeListPage].
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

    /** A builder for [ChargeListPage]. */
    class Builder internal constructor() {

        private var service: ChargeService? = null
        private var params: ChargeListParams? = null
        private var response: ChargeListPageResponse? = null

        @JvmSynthetic
        internal fun from(chargeListPage: ChargeListPage) = apply {
            service = chargeListPage.service
            params = chargeListPage.params
            response = chargeListPage.response
        }

        fun service(service: ChargeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ChargeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ChargeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ChargeListPage].
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
        fun build(): ChargeListPage =
            ChargeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChargeListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "ChargeListPage{service=$service, params=$params, response=$response}"
}
