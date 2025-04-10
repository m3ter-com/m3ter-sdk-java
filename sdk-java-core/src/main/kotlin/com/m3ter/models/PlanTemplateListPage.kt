// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.checkRequired
import com.m3ter.services.blocking.PlanTemplateService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [PlanTemplateService.list] */
class PlanTemplateListPage
private constructor(
    private val service: PlanTemplateService,
    private val params: PlanTemplateListParams,
    private val response: PlanTemplateListPageResponse,
) {

    /**
     * Delegates to [PlanTemplateListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanTemplateListPageResponse.data]
     */
    fun data(): List<PlanTemplateResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PlanTemplateListPageResponse], but gracefully handles missing data.
     *
     * @see [PlanTemplateListPageResponse.nextToken]
     */
    fun nextToken(): Optional<String> = response._nextToken().getOptional("nextToken")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextToken().isPresent

    fun getNextPageParams(): Optional<PlanTemplateListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            params.toBuilder().apply { nextToken().ifPresent { nextToken(it) } }.build()
        )
    }

    fun getNextPage(): Optional<PlanTemplateListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): PlanTemplateListParams = params

    /** The response that this page was parsed from. */
    fun response(): PlanTemplateListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanTemplateListPage].
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

    /** A builder for [PlanTemplateListPage]. */
    class Builder internal constructor() {

        private var service: PlanTemplateService? = null
        private var params: PlanTemplateListParams? = null
        private var response: PlanTemplateListPageResponse? = null

        @JvmSynthetic
        internal fun from(planTemplateListPage: PlanTemplateListPage) = apply {
            service = planTemplateListPage.service
            params = planTemplateListPage.params
            response = planTemplateListPage.response
        }

        fun service(service: PlanTemplateService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PlanTemplateListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PlanTemplateListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PlanTemplateListPage].
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
        fun build(): PlanTemplateListPage =
            PlanTemplateListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: PlanTemplateListPage) : Iterable<PlanTemplateResponse> {

        override fun iterator(): Iterator<PlanTemplateResponse> = iterator {
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

        fun stream(): Stream<PlanTemplateResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanTemplateListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PlanTemplateListPage{service=$service, params=$params, response=$response}"
}
