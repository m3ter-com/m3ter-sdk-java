// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.Params
import com.m3ter.core.checkRequired
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** List Lookup Table Revision Data items for the given UUID. */
class LookupTableLookupTableRevisionDataRetrieveParams
private constructor(
    private val orgId: String?,
    private val lookupTableId: String,
    private val lookupTableRevisionId: String?,
    private val additional: List<String>?,
    private val limit: Int?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun lookupTableId(): String = lookupTableId

    fun lookupTableRevisionId(): Optional<String> = Optional.ofNullable(lookupTableRevisionId)

    /**
     * Comma separated list of additional fields. For example, you can use `additional=lookupKey` to
     * get the lookup key returned for each Data item. You can then use a lookup key for the
     * Get/Upsert/Delete data entry endpoints in this section.
     */
    fun additional(): Optional<List<String>> = Optional.ofNullable(additional)

    /**
     * The maximum number of Data items to return. Defaults to 2000. You can set this to return
     * fewer items if required.
     *
     * If you expect the Revision to contain more than 2000 Data items, you can use the
     * [Trigger Downlad URL Job](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/TriggerDownloadJob)
     * to download the Lookup Table Revision Data.
     */
    fun limit(): Optional<Int> = Optional.ofNullable(limit)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LookupTableLookupTableRevisionDataRetrieveParams].
         *
         * The following fields are required:
         * ```java
         * .lookupTableId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LookupTableLookupTableRevisionDataRetrieveParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var lookupTableId: String? = null
        private var lookupTableRevisionId: String? = null
        private var additional: MutableList<String>? = null
        private var limit: Int? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            lookupTableLookupTableRevisionDataRetrieveParams:
                LookupTableLookupTableRevisionDataRetrieveParams
        ) = apply {
            orgId = lookupTableLookupTableRevisionDataRetrieveParams.orgId
            lookupTableId = lookupTableLookupTableRevisionDataRetrieveParams.lookupTableId
            lookupTableRevisionId =
                lookupTableLookupTableRevisionDataRetrieveParams.lookupTableRevisionId
            additional =
                lookupTableLookupTableRevisionDataRetrieveParams.additional?.toMutableList()
            limit = lookupTableLookupTableRevisionDataRetrieveParams.limit
            additionalHeaders =
                lookupTableLookupTableRevisionDataRetrieveParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                lookupTableLookupTableRevisionDataRetrieveParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun lookupTableId(lookupTableId: String) = apply { this.lookupTableId = lookupTableId }

        fun lookupTableRevisionId(lookupTableRevisionId: String?) = apply {
            this.lookupTableRevisionId = lookupTableRevisionId
        }

        /**
         * Alias for calling [Builder.lookupTableRevisionId] with
         * `lookupTableRevisionId.orElse(null)`.
         */
        fun lookupTableRevisionId(lookupTableRevisionId: Optional<String>) =
            lookupTableRevisionId(lookupTableRevisionId.getOrNull())

        /**
         * Comma separated list of additional fields. For example, you can use
         * `additional=lookupKey` to get the lookup key returned for each Data item. You can then
         * use a lookup key for the Get/Upsert/Delete data entry endpoints in this section.
         */
        fun additional(additional: List<String>?) = apply {
            this.additional = additional?.toMutableList()
        }

        /** Alias for calling [Builder.additional] with `additional.orElse(null)`. */
        fun additional(additional: Optional<List<String>>) = additional(additional.getOrNull())

        /**
         * Adds a single [String] to [Builder.additional].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdditional(additional: String) = apply {
            this.additional = (this.additional ?: mutableListOf()).apply { add(additional) }
        }

        /**
         * The maximum number of Data items to return. Defaults to 2000. You can set this to return
         * fewer items if required.
         *
         * If you expect the Revision to contain more than 2000 Data items, you can use the
         * [Trigger Downlad URL Job](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/TriggerDownloadJob)
         * to download the Lookup Table Revision Data.
         */
        fun limit(limit: Int?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Int) = limit(limit as Int?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Int>) = limit(limit.getOrNull())

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

        /**
         * Returns an immutable instance of [LookupTableLookupTableRevisionDataRetrieveParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .lookupTableId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LookupTableLookupTableRevisionDataRetrieveParams =
            LookupTableLookupTableRevisionDataRetrieveParams(
                orgId,
                checkRequired("lookupTableId", lookupTableId),
                lookupTableRevisionId,
                additional?.toImmutable(),
                limit,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            1 -> lookupTableId
            2 -> lookupTableRevisionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                additional?.let { put("additional", it.joinToString(",")) }
                limit?.let { put("limit", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LookupTableLookupTableRevisionDataRetrieveParams &&
            orgId == other.orgId &&
            lookupTableId == other.lookupTableId &&
            lookupTableRevisionId == other.lookupTableRevisionId &&
            additional == other.additional &&
            limit == other.limit &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            orgId,
            lookupTableId,
            lookupTableRevisionId,
            additional,
            limit,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "LookupTableLookupTableRevisionDataRetrieveParams{orgId=$orgId, lookupTableId=$lookupTableId, lookupTableRevisionId=$lookupTableRevisionId, additional=$additional, limit=$limit, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
