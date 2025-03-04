// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.m3ter.sdk.core.NoAutoDetect
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import java.util.Objects
import java.util.Optional

/**
 * List Event Fields.
 *
 * Retrieves a list of Fields for a specific Event Type. These Fields are dynamic and forward
 * compatibile, enabling calculation operations on the Event schema.
 *
 * **Notes:**
 * - In many of the Response schema for this call, such as when you retrieve the Fields for a
 *   `configuration.commitment.created` Event Type, `new` represents the attributes the newly
 *   created object has. The Response to a call to retrieve the Fields for a
 *   `configuration.commitment.updated` Event Type will contain Field values for both the `old` and
 *   `new` objects. The Response to a call to retrieve the Fields for a
 *   `configuration.commitment.deleted` Event Type will only contain `old` Fields, for values at
 *   point of deletion. Having access to reference both `new` and `old` Field values for an object
 *   can be very useful if you want to base a Notification rule on an Event and include a
 *   calculation in the rule that, for example, compares `new` values with `old` - for example,
 *   trigger a Notification only when a Commitment has been updated and the `new` value for the
 *   `amount` is at least $1,000 greater than the `old` value.
 * - Some Event types will show `customFields` even though the specific billing or configuration
 *   object the Event is for does not yet have the custom fields functionality implemented. For
 *   these Events, their `customFields` values will not be populated until such time as the custom
 *   fields functionality is implemented for them
 */
class EventGetFieldsParams
private constructor(
    private val orgId: String,
    private val eventName: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /**
     * The name of the specific Event Type to use as a list filter, for example
     * `configuration.commitment.created`.
     */
    fun eventName(): Optional<String> = Optional.ofNullable(eventName)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.eventName?.let { queryParams.put("eventName", listOf(it.toString())) }
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
         * Returns a mutable builder for constructing an instance of [EventGetFieldsParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventGetFieldsParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var eventName: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(eventGetFieldsParams: EventGetFieldsParams) = apply {
            orgId = eventGetFieldsParams.orgId
            eventName = eventGetFieldsParams.eventName
            additionalHeaders = eventGetFieldsParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventGetFieldsParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /**
         * The name of the specific Event Type to use as a list filter, for example
         * `configuration.commitment.created`.
         */
        fun eventName(eventName: String?) = apply { this.eventName = eventName }

        /**
         * The name of the specific Event Type to use as a list filter, for example
         * `configuration.commitment.created`.
         */
        fun eventName(eventName: Optional<String>) = eventName(eventName.orElse(null))

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

        fun build(): EventGetFieldsParams =
            EventGetFieldsParams(
                checkRequired("orgId", orgId),
                eventName,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventGetFieldsParams && orgId == other.orgId && eventName == other.eventName && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, eventName, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EventGetFieldsParams{orgId=$orgId, eventName=$eventName, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
