// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.JsonValue
import com.m3ter.core.Params
import com.m3ter.core.checkRequired
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update the status of a Lookup Table Revision for the given UUID. */
class LookupTableLookupTableRevisionUpdateStatusParams
private constructor(
    private val orgId: String?,
    private val lookupTableId: String,
    private val id: String?,
    private val lookupTableRevisionStatusRequest: LookupTableRevisionStatusRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun lookupTableId(): String = lookupTableId

    fun id(): Optional<String> = Optional.ofNullable(id)

    /** Request containing the status details for a LookupTableRevision entity */
    fun lookupTableRevisionStatusRequest(): LookupTableRevisionStatusRequest =
        lookupTableRevisionStatusRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        lookupTableRevisionStatusRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LookupTableLookupTableRevisionUpdateStatusParams].
         *
         * The following fields are required:
         * ```java
         * .lookupTableId()
         * .lookupTableRevisionStatusRequest()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LookupTableLookupTableRevisionUpdateStatusParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var lookupTableId: String? = null
        private var id: String? = null
        private var lookupTableRevisionStatusRequest: LookupTableRevisionStatusRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            lookupTableLookupTableRevisionUpdateStatusParams:
                LookupTableLookupTableRevisionUpdateStatusParams
        ) = apply {
            orgId = lookupTableLookupTableRevisionUpdateStatusParams.orgId
            lookupTableId = lookupTableLookupTableRevisionUpdateStatusParams.lookupTableId
            id = lookupTableLookupTableRevisionUpdateStatusParams.id
            lookupTableRevisionStatusRequest =
                lookupTableLookupTableRevisionUpdateStatusParams.lookupTableRevisionStatusRequest
            additionalHeaders =
                lookupTableLookupTableRevisionUpdateStatusParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                lookupTableLookupTableRevisionUpdateStatusParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun lookupTableId(lookupTableId: String) = apply { this.lookupTableId = lookupTableId }

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /** Request containing the status details for a LookupTableRevision entity */
        fun lookupTableRevisionStatusRequest(
            lookupTableRevisionStatusRequest: LookupTableRevisionStatusRequest
        ) = apply { this.lookupTableRevisionStatusRequest = lookupTableRevisionStatusRequest }

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
         * Returns an immutable instance of [LookupTableLookupTableRevisionUpdateStatusParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .lookupTableId()
         * .lookupTableRevisionStatusRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LookupTableLookupTableRevisionUpdateStatusParams =
            LookupTableLookupTableRevisionUpdateStatusParams(
                orgId,
                checkRequired("lookupTableId", lookupTableId),
                id,
                checkRequired("lookupTableRevisionStatusRequest", lookupTableRevisionStatusRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): LookupTableRevisionStatusRequest = lookupTableRevisionStatusRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            1 -> lookupTableId
            2 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LookupTableLookupTableRevisionUpdateStatusParams &&
            orgId == other.orgId &&
            lookupTableId == other.lookupTableId &&
            id == other.id &&
            lookupTableRevisionStatusRequest == other.lookupTableRevisionStatusRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            orgId,
            lookupTableId,
            id,
            lookupTableRevisionStatusRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "LookupTableLookupTableRevisionUpdateStatusParams{orgId=$orgId, lookupTableId=$lookupTableId, id=$id, lookupTableRevisionStatusRequest=$lookupTableRevisionStatusRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
