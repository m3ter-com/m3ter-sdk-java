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
import kotlin.jvm.optionals.getOrNull

/**
 * Retrieve a list of the Debit Reason entities created for your Organization. You can filter the
 * list returned for the call by Debit Reason ID, Debit Reason short code, or by Archive status.
 */
class DebitReasonListParams
private constructor(
    private val orgId: String,
    private val archived: Boolean?,
    private val codes: List<String>?,
    private val ids: List<String>?,
    private val nextToken: String?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /**
     * Filter using the boolean archived flag. DebitReasons can be archived if they are obsolete.
     * - TRUE includes DebitReasons that have been archived.
     * - FALSE excludes archived DebitReasons.
     */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived)

    /** List of Debit Reason short codes to retrieve. */
    fun codes(): Optional<List<String>> = Optional.ofNullable(codes)

    /** List of Debit Reason IDs to retrieve. */
    fun ids(): Optional<List<String>> = Optional.ofNullable(ids)

    /** `nextToken` for multi page retrievals. */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** Number of Debit Reasons to retrieve per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.archived?.let { queryParams.put("archived", listOf(it.toString())) }
        this.codes?.let { queryParams.put("codes", listOf(it.joinToString(separator = ","))) }
        this.ids?.let { queryParams.put("ids", listOf(it.joinToString(separator = ","))) }
        this.nextToken?.let { queryParams.put("nextToken", listOf(it.toString())) }
        this.pageSize?.let { queryParams.put("pageSize", listOf(it.toString())) }
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
         * Returns a mutable builder for constructing an instance of [DebitReasonListParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DebitReasonListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var archived: Boolean? = null
        private var codes: MutableList<String>? = null
        private var ids: MutableList<String>? = null
        private var nextToken: String? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(debitReasonListParams: DebitReasonListParams) = apply {
            orgId = debitReasonListParams.orgId
            archived = debitReasonListParams.archived
            codes = debitReasonListParams.codes?.toMutableList()
            ids = debitReasonListParams.ids?.toMutableList()
            nextToken = debitReasonListParams.nextToken
            pageSize = debitReasonListParams.pageSize
            additionalHeaders = debitReasonListParams.additionalHeaders.toBuilder()
            additionalQueryParams = debitReasonListParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /**
         * Filter using the boolean archived flag. DebitReasons can be archived if they are
         * obsolete.
         * - TRUE includes DebitReasons that have been archived.
         * - FALSE excludes archived DebitReasons.
         */
        fun archived(archived: Boolean?) = apply { this.archived = archived }

        /**
         * Filter using the boolean archived flag. DebitReasons can be archived if they are
         * obsolete.
         * - TRUE includes DebitReasons that have been archived.
         * - FALSE excludes archived DebitReasons.
         */
        fun archived(archived: Boolean) = archived(archived as Boolean?)

        /**
         * Filter using the boolean archived flag. DebitReasons can be archived if they are
         * obsolete.
         * - TRUE includes DebitReasons that have been archived.
         * - FALSE excludes archived DebitReasons.
         */
        fun archived(archived: Optional<Boolean>) = archived(archived.getOrNull())

        /** List of Debit Reason short codes to retrieve. */
        fun codes(codes: List<String>?) = apply { this.codes = codes?.toMutableList() }

        /** List of Debit Reason short codes to retrieve. */
        fun codes(codes: Optional<List<String>>) = codes(codes.getOrNull())

        /** List of Debit Reason short codes to retrieve. */
        fun addCode(code: String) = apply { codes = (codes ?: mutableListOf()).apply { add(code) } }

        /** List of Debit Reason IDs to retrieve. */
        fun ids(ids: List<String>?) = apply { this.ids = ids?.toMutableList() }

        /** List of Debit Reason IDs to retrieve. */
        fun ids(ids: Optional<List<String>>) = ids(ids.getOrNull())

        /** List of Debit Reason IDs to retrieve. */
        fun addId(id: String) = apply { ids = (ids ?: mutableListOf()).apply { add(id) } }

        /** `nextToken` for multi page retrievals. */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** `nextToken` for multi page retrievals. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** Number of Debit Reasons to retrieve per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /** Number of Debit Reasons to retrieve per page. */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Number of Debit Reasons to retrieve per page. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

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

        fun build(): DebitReasonListParams =
            DebitReasonListParams(
                checkRequired("orgId", orgId),
                archived,
                codes?.toImmutable(),
                ids?.toImmutable(),
                nextToken,
                pageSize,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DebitReasonListParams && orgId == other.orgId && archived == other.archived && codes == other.codes && ids == other.ids && nextToken == other.nextToken && pageSize == other.pageSize && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, archived, codes, ids, nextToken, pageSize, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DebitReasonListParams{orgId=$orgId, archived=$archived, codes=$codes, ids=$ids, nextToken=$nextToken, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
