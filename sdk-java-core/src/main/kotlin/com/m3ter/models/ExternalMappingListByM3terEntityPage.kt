// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.ExternalMappingService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ExternalMappingService.listByM3terEntity */
class ExternalMappingListByM3terEntityPage
private constructor(
    private val service: ExternalMappingService,
    private val params: ExternalMappingListByM3terEntityParams,
    private val response: ExternalMappingListByM3terEntityPageResponse,
) : Page<ExternalMappingResponse> {

    /**
     * Delegates to [ExternalMappingListByM3terEntityPageResponse], but gracefully handles missing
     * data.
     *
     * @see ExternalMappingListByM3terEntityPageResponse.data
     */
    fun data(): List<ExternalMappingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalMappingListByM3terEntityPageResponse], but gracefully handles missing
     * data.
     *
     * @see ExternalMappingListByM3terEntityPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<ExternalMappingResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): ExternalMappingListByM3terEntityParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): ExternalMappingListByM3terEntityPage =
        service.listByM3terEntity(nextPageParams())

    fun autoPager(): AutoPager<ExternalMappingResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ExternalMappingListByM3terEntityParams = params

    /** The response that this page was parsed from. */
    fun response(): ExternalMappingListByM3terEntityPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ExternalMappingListByM3terEntityPage].
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

    /** A builder for [ExternalMappingListByM3terEntityPage]. */
    class Builder internal constructor() {

        private var service: ExternalMappingService? = null
        private var params: ExternalMappingListByM3terEntityParams? = null
        private var response: ExternalMappingListByM3terEntityPageResponse? = null

        @JvmSynthetic
        internal fun from(
            externalMappingListByM3terEntityPage: ExternalMappingListByM3terEntityPage
        ) = apply {
            service = externalMappingListByM3terEntityPage.service
            params = externalMappingListByM3terEntityPage.params
            response = externalMappingListByM3terEntityPage.response
        }

        fun service(service: ExternalMappingService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExternalMappingListByM3terEntityParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExternalMappingListByM3terEntityPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ExternalMappingListByM3terEntityPage].
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
        fun build(): ExternalMappingListByM3terEntityPage =
            ExternalMappingListByM3terEntityPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalMappingListByM3terEntityPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ExternalMappingListByM3terEntityPage{service=$service, params=$params, response=$response}"
}
