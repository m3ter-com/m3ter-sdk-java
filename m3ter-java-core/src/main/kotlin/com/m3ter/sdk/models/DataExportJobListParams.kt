// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.m3ter.sdk.core.Enum
import com.m3ter.sdk.core.JsonField
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Retrieve a list of Export Job entities. */
class DataExportJobListParams
private constructor(
    private val orgId: String,
    private val dateCreatedEnd: String?,
    private val dateCreatedStart: String?,
    private val ids: List<String>?,
    private val nextToken: String?,
    private val pageSize: Long?,
    private val scheduleId: String?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /** Include only Job entities created before this date. Format: yyyy-MM-dd'T'HH:mm:ss'Z' */
    fun dateCreatedEnd(): Optional<String> = Optional.ofNullable(dateCreatedEnd)

    /** Include only Job entities created on or after this date. Format: yyyy-MM-dd'T'HH:mm:ss'Z' */
    fun dateCreatedStart(): Optional<String> = Optional.ofNullable(dateCreatedStart)

    /** List Job entities for the given UUIDs */
    fun ids(): Optional<List<String>> = Optional.ofNullable(ids)

    /** nextToken for multi page retrievals */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** Number of Jobs to retrieve per page */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    /** List Job entities for the schedule UUID */
    fun scheduleId(): Optional<String> = Optional.ofNullable(scheduleId)

    /** List Job entities for the status */
    fun status(): Optional<Status> = Optional.ofNullable(status)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DataExportJobListParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExportJobListParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var dateCreatedEnd: String? = null
        private var dateCreatedStart: String? = null
        private var ids: MutableList<String>? = null
        private var nextToken: String? = null
        private var pageSize: Long? = null
        private var scheduleId: String? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dataExportJobListParams: DataExportJobListParams) = apply {
            orgId = dataExportJobListParams.orgId
            dateCreatedEnd = dataExportJobListParams.dateCreatedEnd
            dateCreatedStart = dataExportJobListParams.dateCreatedStart
            ids = dataExportJobListParams.ids?.toMutableList()
            nextToken = dataExportJobListParams.nextToken
            pageSize = dataExportJobListParams.pageSize
            scheduleId = dataExportJobListParams.scheduleId
            status = dataExportJobListParams.status
            additionalHeaders = dataExportJobListParams.additionalHeaders.toBuilder()
            additionalQueryParams = dataExportJobListParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /** Include only Job entities created before this date. Format: yyyy-MM-dd'T'HH:mm:ss'Z' */
        fun dateCreatedEnd(dateCreatedEnd: String?) = apply { this.dateCreatedEnd = dateCreatedEnd }

        /** Alias for calling [Builder.dateCreatedEnd] with `dateCreatedEnd.orElse(null)`. */
        fun dateCreatedEnd(dateCreatedEnd: Optional<String>) =
            dateCreatedEnd(dateCreatedEnd.getOrNull())

        /**
         * Include only Job entities created on or after this date. Format: yyyy-MM-dd'T'HH:mm:ss'Z'
         */
        fun dateCreatedStart(dateCreatedStart: String?) = apply {
            this.dateCreatedStart = dateCreatedStart
        }

        /** Alias for calling [Builder.dateCreatedStart] with `dateCreatedStart.orElse(null)`. */
        fun dateCreatedStart(dateCreatedStart: Optional<String>) =
            dateCreatedStart(dateCreatedStart.getOrNull())

        /** List Job entities for the given UUIDs */
        fun ids(ids: List<String>?) = apply { this.ids = ids?.toMutableList() }

        /** Alias for calling [Builder.ids] with `ids.orElse(null)`. */
        fun ids(ids: Optional<List<String>>) = ids(ids.getOrNull())

        /**
         * Adds a single [String] to [ids].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { ids = (ids ?: mutableListOf()).apply { add(id) } }

        /** nextToken for multi page retrievals */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** Number of Jobs to retrieve per page */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        /** List Job entities for the schedule UUID */
        fun scheduleId(scheduleId: String?) = apply { this.scheduleId = scheduleId }

        /** Alias for calling [Builder.scheduleId] with `scheduleId.orElse(null)`. */
        fun scheduleId(scheduleId: Optional<String>) = scheduleId(scheduleId.getOrNull())

        /** List Job entities for the status */
        fun status(status: Status?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

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
         * Returns an immutable instance of [DataExportJobListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataExportJobListParams =
            DataExportJobListParams(
                checkRequired("orgId", orgId),
                dateCreatedEnd,
                dateCreatedStart,
                ids?.toImmutable(),
                nextToken,
                pageSize,
                scheduleId,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                dateCreatedEnd?.let { put("dateCreatedEnd", it) }
                dateCreatedStart?.let { put("dateCreatedStart", it) }
                ids?.let { put("ids", it.joinToString(",")) }
                nextToken?.let { put("nextToken", it) }
                pageSize?.let { put("pageSize", it.toString()) }
                scheduleId?.let { put("scheduleId", it) }
                status?.let { put("status", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** List Job entities for the status */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING = of("PENDING")

            @JvmField val RUNNING = of("RUNNING")

            @JvmField val SUCCEEDED = of("SUCCEEDED")

            @JvmField val FAILED = of("FAILED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            RUNNING,
            SUCCEEDED,
            FAILED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            RUNNING,
            SUCCEEDED,
            FAILED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                RUNNING -> Value.RUNNING
                SUCCEEDED -> Value.SUCCEEDED
                FAILED -> Value.FAILED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws M3terInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                RUNNING -> Known.RUNNING
                SUCCEEDED -> Known.SUCCEEDED
                FAILED -> Known.FAILED
                else -> throw M3terInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws M3terInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { M3terInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: M3terInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportJobListParams && orgId == other.orgId && dateCreatedEnd == other.dateCreatedEnd && dateCreatedStart == other.dateCreatedStart && ids == other.ids && nextToken == other.nextToken && pageSize == other.pageSize && scheduleId == other.scheduleId && status == other.status && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, dateCreatedEnd, dateCreatedStart, ids, nextToken, pageSize, scheduleId, status, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DataExportJobListParams{orgId=$orgId, dateCreatedEnd=$dateCreatedEnd, dateCreatedStart=$dateCreatedStart, ids=$ids, nextToken=$nextToken, pageSize=$pageSize, scheduleId=$scheduleId, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
