// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.ExternalMappingService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [ExternalMappingService.listByM3terEntity] */
class ExternalMappingListByM3terEntityPage
private constructor(
    private val service: ExternalMappingService,
    private val params: ExternalMappingListByM3terEntityParams,
    private val response: ExternalMappingListByM3terEntityPageResponse,
) {

    /**
     * Delegates to [ExternalMappingListByM3terEntityPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ExternalMappingListByM3terEntityPageResponse.data]
     */
    fun data(): List<ExternalMappingResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalMappingListByM3terEntityPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ExternalMappingListByM3terEntityPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<ExternalMappingListByM3terEntityParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<ExternalMappingListByM3terEntityPage> =
        getNextPageParams().map { service.listByM3terEntity(it) }

    fun autoPager(): AutoPager = AutoPager(this)

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

    class AutoPager(private val firstPage: ExternalMappingListByM3terEntityPage) :
        Iterable<ExternalMappingResponse> {

        override fun iterator(): Iterator<ExternalMappingResponse> = iterator {
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

        fun stream(): Stream<ExternalMappingResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
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
