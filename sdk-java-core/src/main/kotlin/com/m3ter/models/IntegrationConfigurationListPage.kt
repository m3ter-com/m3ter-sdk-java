// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.IntegrationConfigurationService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [IntegrationConfigurationService.list] */
class IntegrationConfigurationListPage
private constructor(
    private val service: IntegrationConfigurationService,
    private val params: IntegrationConfigurationListParams,
    private val response: IntegrationConfigurationListPageResponse,
) {

    /**
     * Delegates to [IntegrationConfigurationListPageResponse], but gracefully handles missing data.
     *
     * @see [IntegrationConfigurationListPageResponse.data]
     */
    fun data(): List<IntegrationConfigurationListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [IntegrationConfigurationListPageResponse], but gracefully handles missing data.
     *
     * @see [IntegrationConfigurationListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<IntegrationConfigurationListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<IntegrationConfigurationListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): IntegrationConfigurationListParams = params

    /** The response that this page was parsed from. */
    fun response(): IntegrationConfigurationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [IntegrationConfigurationListPage].
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

    /** A builder for [IntegrationConfigurationListPage]. */
    class Builder internal constructor() {

        private var service: IntegrationConfigurationService? = null
        private var params: IntegrationConfigurationListParams? = null
        private var response: IntegrationConfigurationListPageResponse? = null

        @JvmSynthetic
        internal fun from(integrationConfigurationListPage: IntegrationConfigurationListPage) =
            apply {
                service = integrationConfigurationListPage.service
                params = integrationConfigurationListPage.params
                response = integrationConfigurationListPage.response
            }

        fun service(service: IntegrationConfigurationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: IntegrationConfigurationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: IntegrationConfigurationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [IntegrationConfigurationListPage].
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
        fun build(): IntegrationConfigurationListPage =
            IntegrationConfigurationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: IntegrationConfigurationListPage) :
        Iterable<IntegrationConfigurationListResponse> {

        override fun iterator(): Iterator<IntegrationConfigurationListResponse> = iterator {
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

        fun stream(): Stream<IntegrationConfigurationListResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IntegrationConfigurationListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "IntegrationConfigurationListPage{service=$service, params=$params, response=$response}"
}
