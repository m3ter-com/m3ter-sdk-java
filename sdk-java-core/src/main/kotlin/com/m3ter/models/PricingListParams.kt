// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.Params
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of Pricings filtered by date, Plan ID, PlanTemplate ID, or Pricing ID. */
class PricingListParams
private constructor(
    private val orgId: String?,
    private val aggregationId: String?,
    private val date: String?,
    private val ids: List<String>?,
    private val nextToken: String?,
    private val pageSize: Int?,
    private val planId: String?,
    private val planTemplateId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /** UUID of the Aggregation to retrieve pricings for */
    fun aggregationId(): Optional<String> = Optional.ofNullable(aggregationId)

    /** Date on which to retrieve active Pricings. */
    fun date(): Optional<String> = Optional.ofNullable(date)

    /** List of Pricing IDs to retrieve. */
    fun ids(): Optional<List<String>> = Optional.ofNullable(ids)

    /** `nextToken` for multi-page retrievals. */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** Number of Pricings to retrieve per page. */
    fun pageSize(): Optional<Int> = Optional.ofNullable(pageSize)

    /** UUID of the Plan to retrieve Pricings for. */
    fun planId(): Optional<String> = Optional.ofNullable(planId)

    /** UUID of the PlanTemplate to retrieve Pricings for. */
    fun planTemplateId(): Optional<String> = Optional.ofNullable(planTemplateId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): PricingListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [PricingListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PricingListParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var aggregationId: String? = null
        private var date: String? = null
        private var ids: MutableList<String>? = null
        private var nextToken: String? = null
        private var pageSize: Int? = null
        private var planId: String? = null
        private var planTemplateId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(pricingListParams: PricingListParams) = apply {
            orgId = pricingListParams.orgId
            aggregationId = pricingListParams.aggregationId
            date = pricingListParams.date
            ids = pricingListParams.ids?.toMutableList()
            nextToken = pricingListParams.nextToken
            pageSize = pricingListParams.pageSize
            planId = pricingListParams.planId
            planTemplateId = pricingListParams.planTemplateId
            additionalHeaders = pricingListParams.additionalHeaders.toBuilder()
            additionalQueryParams = pricingListParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /** UUID of the Aggregation to retrieve pricings for */
        fun aggregationId(aggregationId: String?) = apply { this.aggregationId = aggregationId }

        /** Alias for calling [Builder.aggregationId] with `aggregationId.orElse(null)`. */
        fun aggregationId(aggregationId: Optional<String>) =
            aggregationId(aggregationId.getOrNull())

        /** Date on which to retrieve active Pricings. */
        fun date(date: String?) = apply { this.date = date }

        /** Alias for calling [Builder.date] with `date.orElse(null)`. */
        fun date(date: Optional<String>) = date(date.getOrNull())

        /** List of Pricing IDs to retrieve. */
        fun ids(ids: List<String>?) = apply { this.ids = ids?.toMutableList() }

        /** Alias for calling [Builder.ids] with `ids.orElse(null)`. */
        fun ids(ids: Optional<List<String>>) = ids(ids.getOrNull())

        /**
         * Adds a single [String] to [ids].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { ids = (ids ?: mutableListOf()).apply { add(id) } }

        /** `nextToken` for multi-page retrievals. */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** Number of Pricings to retrieve per page. */
        fun pageSize(pageSize: Int?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Int) = pageSize(pageSize as Int?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Int>) = pageSize(pageSize.getOrNull())

        /** UUID of the Plan to retrieve Pricings for. */
        fun planId(planId: String?) = apply { this.planId = planId }

        /** Alias for calling [Builder.planId] with `planId.orElse(null)`. */
        fun planId(planId: Optional<String>) = planId(planId.getOrNull())

        /** UUID of the PlanTemplate to retrieve Pricings for. */
        fun planTemplateId(planTemplateId: String?) = apply { this.planTemplateId = planTemplateId }

        /** Alias for calling [Builder.planTemplateId] with `planTemplateId.orElse(null)`. */
        fun planTemplateId(planTemplateId: Optional<String>) =
            planTemplateId(planTemplateId.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [PricingListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PricingListParams =
            PricingListParams(
                orgId,
                aggregationId,
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

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                aggregationId?.let { put("aggregationId", it) }
                date?.let { put("date", it) }
                ids?.let { put("ids", it.joinToString(",")) }
                nextToken?.let { put("nextToken", it) }
                pageSize?.let { put("pageSize", it.toString()) }
                planId?.let { put("planId", it) }
                planTemplateId?.let { put("planTemplateId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PricingListParams &&
            orgId == other.orgId &&
            aggregationId == other.aggregationId &&
            date == other.date &&
            ids == other.ids &&
            nextToken == other.nextToken &&
            pageSize == other.pageSize &&
            planId == other.planId &&
            planTemplateId == other.planTemplateId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            orgId,
            aggregationId,
            date,
            ids,
            nextToken,
            pageSize,
            planId,
            planTemplateId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "PricingListParams{orgId=$orgId, aggregationId=$aggregationId, date=$date, ids=$ids, nextToken=$nextToken, pageSize=$pageSize, planId=$planId, planTemplateId=$planTemplateId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
