// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.NoAutoDetect
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.toImmutable
import java.util.Objects
import java.util.Optional

/** Retrieve a list of Pricings filtered by date, Plan ID, PlanTemplate ID, or Pricing ID. */
class PricingListParams
private constructor(
    private val orgId: String,
    private val date: String?,
    private val ids: List<String>?,
    private val nextToken: String?,
    private val pageSize: Long?,
    private val planId: String?,
    private val planTemplateId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /** Date on which to retrieve active Pricings. */
    fun date(): Optional<String> = Optional.ofNullable(date)

    /** List of Pricing IDs to retrieve. */
    fun ids(): Optional<List<String>> = Optional.ofNullable(ids)

    /** `nextToken` for multi-page retrievals. */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** Number of Pricings to retrieve per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** UUID of the Plan to retrieve Pricings for. */
    fun planId(): Optional<String> = Optional.ofNullable(planId)

    /** UUID of the PlanTemplate to retrieve Pricings for. */
    fun planTemplateId(): Optional<String> = Optional.ofNullable(planTemplateId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.date?.let { queryParams.put("date", listOf(it.toString())) }
        this.ids?.let { queryParams.put("ids", listOf(it.joinToString(separator = ","))) }
        this.nextToken?.let { queryParams.put("nextToken", listOf(it.toString())) }
        this.pageSize?.let { queryParams.put("pageSize", listOf(it.toString())) }
        this.planId?.let { queryParams.put("planId", listOf(it.toString())) }
        this.planTemplateId?.let { queryParams.put("planTemplateId", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> orgId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PricingListParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PricingListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var date: String? = null
        private var ids: MutableList<String>? = null
        private var nextToken: String? = null
        private var pageSize: Long? = null
        private var planId: String? = null
        private var planTemplateId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(pricingListParams: PricingListParams) = apply {
            orgId = pricingListParams.orgId
            date = pricingListParams.date
            ids = pricingListParams.ids?.toMutableList()
            nextToken = pricingListParams.nextToken
            pageSize = pricingListParams.pageSize
            planId = pricingListParams.planId
            planTemplateId = pricingListParams.planTemplateId
            additionalHeaders = pricingListParams.additionalHeaders.toBuilder()
            additionalQueryParams = pricingListParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /** Date on which to retrieve active Pricings. */
        fun date(date: String?) = apply { this.date = date }

        /** Date on which to retrieve active Pricings. */
        fun date(date: Optional<String>) = date(date.orElse(null))

        /** List of Pricing IDs to retrieve. */
        fun ids(ids: List<String>?) = apply { this.ids = ids?.toMutableList() }

        /** List of Pricing IDs to retrieve. */
        fun ids(ids: Optional<List<String>>) = ids(ids.orElse(null))

        /** List of Pricing IDs to retrieve. */
        fun addId(id: String) = apply { ids = (ids ?: mutableListOf()).apply { add(id) } }

        /** `nextToken` for multi-page retrievals. */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** `nextToken` for multi-page retrievals. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.orElse(null))

        /** Number of Pricings to retrieve per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /** Number of Pricings to retrieve per page. */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Number of Pricings to retrieve per page. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.orElse(null) as Long?)

        /** UUID of the Plan to retrieve Pricings for. */
        fun planId(planId: String?) = apply { this.planId = planId }

        /** UUID of the Plan to retrieve Pricings for. */
        fun planId(planId: Optional<String>) = planId(planId.orElse(null))

        /** UUID of the PlanTemplate to retrieve Pricings for. */
        fun planTemplateId(planTemplateId: String?) = apply { this.planTemplateId = planTemplateId }

        /** UUID of the PlanTemplate to retrieve Pricings for. */
        fun planTemplateId(planTemplateId: Optional<String>) =
            planTemplateId(planTemplateId.orElse(null))

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): PricingListParams =
            PricingListParams(
                checkRequired("orgId", orgId),
                date,
                ids?.toImmutable(),
                nextToken,
                pageSize,
                planId,
                planTemplateId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PricingListParams && orgId == other.orgId && date == other.date && ids == other.ids && nextToken == other.nextToken && pageSize == other.pageSize && planId == other.planId && planTemplateId == other.planTemplateId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, date, ids, nextToken, pageSize, planId, planTemplateId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PricingListParams{orgId=$orgId, date=$date, ids=$ids, nextToken=$nextToken, pageSize=$pageSize, planId=$planId, planTemplateId=$planTemplateId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
