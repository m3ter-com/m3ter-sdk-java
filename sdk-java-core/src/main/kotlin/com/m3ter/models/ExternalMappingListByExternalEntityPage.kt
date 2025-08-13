// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.AutoPager
import com.m3ter.core.Page
import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.ExternalMappingService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ExternalMappingService.listByExternalEntity */
class ExternalMappingListByExternalEntityPage
private constructor(
    private val service: ExternalMappingService,
    private val params: ExternalMappingListByExternalEntityParams,
    private val response: ExternalMappingListByExternalEntityPageResponse,
) : Page<ExternalMappingResponse> {

    /**
     * Delegates to [ExternalMappingListByExternalEntityPageResponse], but gracefully handles
     * missing data.
     *
     * @see ExternalMappingListByExternalEntityPageResponse.data
     */
    fun data(): List<ExternalMappingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalMappingListByExternalEntityPageResponse], but gracefully handles
     * missing data.
     *
     * @see ExternalMappingListByExternalEntityPageResponse.nextToken
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    override fun items(): List<ExternalMappingResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextToken().isPresent

    fun nextPageParams(): ExternalMappingListByExternalEntityParams {
        val nextCursor =
            nextToken().getOrNull()
                ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().nextToken(nextCursor).build()
    }

    override fun nextPage(): ExternalMappingListByExternalEntityPage =
        service.listByExternalEntity(nextPageParams())

    fun autoPager(): AutoPager<ExternalMappingResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ExternalMappingListByExternalEntityParams = params

    /** The response that this page was parsed from. */
    fun response(): ExternalMappingListByExternalEntityPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ExternalMappingListByExternalEntityPage].
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

    /** A builder for [ExternalMappingListByExternalEntityPage]. */
    class Builder internal constructor() {

        private var service: ExternalMappingService? = null
        private var params: ExternalMappingListByExternalEntityParams? = null
        private var response: ExternalMappingListByExternalEntityPageResponse? = null

        @JvmSynthetic
        internal fun from(
            externalMappingListByExternalEntityPage: ExternalMappingListByExternalEntityPage
        ) = apply {
            service = externalMappingListByExternalEntityPage.service
            params = externalMappingListByExternalEntityPage.params
            response = externalMappingListByExternalEntityPage.response
        }

        fun service(service: ExternalMappingService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExternalMappingListByExternalEntityParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: ExternalMappingListByExternalEntityPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ExternalMappingListByExternalEntityPage].
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
        fun build(): ExternalMappingListByExternalEntityPage =
            ExternalMappingListByExternalEntityPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalMappingListByExternalEntityPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ExternalMappingListByExternalEntityPage{service=$service, params=$params, response=$response}"
}
