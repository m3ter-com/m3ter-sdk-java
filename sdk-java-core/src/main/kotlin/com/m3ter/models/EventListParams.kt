// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.m3ter.core.Params
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.core.toImmutable
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * List all Events.
 *
 * Retrieve a list of all Events, with options to filter the returned list based on various
 * criteria. Each Event represents a unique instance of a state change within the system, classified
 * under a specific kind of Event.
 *
 * **NOTES:** You can:
 * - Use `eventName` as a valid Query parameter to filter the list of Events returned. For example:
 *   `.../organizations/{orgId}/events?eventName=configuration.commitment.created`
 * - Use the
 *   [List Notification Events](https://www.m3ter.com/docs/api#tag/Events/operation/ListEventTypes)
 *   endpoint in this section. The response lists the valid Query parameters.
 */
class EventListParams
private constructor(
    private val orgId: String?,
    private val accountId: String?,
    private val eventName: String?,
    private val eventType: String?,
    private val ids: List<String>?,
    private val includeActioned: Boolean?,
    private val nextToken: String?,
    private val notificationCode: String?,
    private val notificationId: String?,
    private val pageSize: Int?,
    private val resourceId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /**
     * The Account ID associated with the Event to filter the results. Returns the Events that have
     * been generated for the Account.
     */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId)

    fun eventName(): Optional<String> = Optional.ofNullable(eventName)

    /**
     * The category of Events to filter the results by. Options:
     * - Notification
     * - IntegrationEvent
     * - IngestValidationFailure
     * - DataExportJobFailure
     */
    fun eventType(): Optional<String> = Optional.ofNullable(eventType)

    /**
     * List of Event UUIDs to filter the results.
     *
     * **NOTE:** cannot be used with other filters.
     */
    fun ids(): Optional<List<String>> = Optional.ofNullable(ids)

    /**
     * A Boolean flag indicating whether to return Events that have been actioned.
     * - **TRUE** - include actioned Events.
     * - **FALSE** - exclude actioned Events.
     */
    fun includeActioned(): Optional<Boolean> = Optional.ofNullable(includeActioned)

    /**
     * The `nextToken` for multi-page retrievals. It is used to fetch the next page of Events in a
     * paginated list.
     */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /**
     * Short code of the Notification to filter the results. Returns the Events that have triggered
     * the Notification.
     */
    fun notificationCode(): Optional<String> = Optional.ofNullable(notificationCode)

    /**
     * Notification UUID to filter the results. Returns the Events that have triggered the
     * Notification.
     */
    fun notificationId(): Optional<String> = Optional.ofNullable(notificationId)

    /** The maximum number of Events to retrieve per page. */
    fun pageSize(): Optional<Int> = Optional.ofNullable(pageSize)

    fun resourceId(): Optional<String> = Optional.ofNullable(resourceId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): EventListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [EventListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventListParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var accountId: String? = null
        private var eventName: String? = null
        private var eventType: String? = null
        private var ids: MutableList<String>? = null
        private var includeActioned: Boolean? = null
        private var nextToken: String? = null
        private var notificationCode: String? = null
        private var notificationId: String? = null
        private var pageSize: Int? = null
        private var resourceId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(eventListParams: EventListParams) = apply {
            orgId = eventListParams.orgId
            accountId = eventListParams.accountId
            eventName = eventListParams.eventName
            eventType = eventListParams.eventType
            ids = eventListParams.ids?.toMutableList()
            includeActioned = eventListParams.includeActioned
            nextToken = eventListParams.nextToken
            notificationCode = eventListParams.notificationCode
            notificationId = eventListParams.notificationId
            pageSize = eventListParams.pageSize
            resourceId = eventListParams.resourceId
            additionalHeaders = eventListParams.additionalHeaders.toBuilder()
            additionalQueryParams = eventListParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /**
         * The Account ID associated with the Event to filter the results. Returns the Events that
         * have been generated for the Account.
         */
        fun accountId(accountId: String?) = apply { this.accountId = accountId }

        /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
        fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

        fun eventName(eventName: String?) = apply { this.eventName = eventName }

        /** Alias for calling [Builder.eventName] with `eventName.orElse(null)`. */
        fun eventName(eventName: Optional<String>) = eventName(eventName.getOrNull())

        /**
         * The category of Events to filter the results by. Options:
         * - Notification
         * - IntegrationEvent
         * - IngestValidationFailure
         * - DataExportJobFailure
         */
        fun eventType(eventType: String?) = apply { this.eventType = eventType }

        /** Alias for calling [Builder.eventType] with `eventType.orElse(null)`. */
        fun eventType(eventType: Optional<String>) = eventType(eventType.getOrNull())

        /**
         * List of Event UUIDs to filter the results.
         *
         * **NOTE:** cannot be used with other filters.
         */
        fun ids(ids: List<String>?) = apply { this.ids = ids?.toMutableList() }

        /** Alias for calling [Builder.ids] with `ids.orElse(null)`. */
        fun ids(ids: Optional<List<String>>) = ids(ids.getOrNull())

        /**
         * Adds a single [String] to [ids].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addId(id: String) = apply { ids = (ids ?: mutableListOf()).apply { add(id) } }

        /**
         * A Boolean flag indicating whether to return Events that have been actioned.
         * - **TRUE** - include actioned Events.
         * - **FALSE** - exclude actioned Events.
         */
        fun includeActioned(includeActioned: Boolean?) = apply {
            this.includeActioned = includeActioned
        }

        /**
         * Alias for [Builder.includeActioned].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun includeActioned(includeActioned: Boolean) = includeActioned(includeActioned as Boolean?)

        /** Alias for calling [Builder.includeActioned] with `includeActioned.orElse(null)`. */
        fun includeActioned(includeActioned: Optional<Boolean>) =
            includeActioned(includeActioned.getOrNull())

        /**
         * The `nextToken` for multi-page retrievals. It is used to fetch the next page of Events in
         * a paginated list.
         */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /**
         * Short code of the Notification to filter the results. Returns the Events that have
         * triggered the Notification.
         */
        fun notificationCode(notificationCode: String?) = apply {
            this.notificationCode = notificationCode
        }

        /** Alias for calling [Builder.notificationCode] with `notificationCode.orElse(null)`. */
        fun notificationCode(notificationCode: Optional<String>) =
            notificationCode(notificationCode.getOrNull())

        /**
         * Notification UUID to filter the results. Returns the Events that have triggered the
         * Notification.
         */
        fun notificationId(notificationId: String?) = apply { this.notificationId = notificationId }

        /** Alias for calling [Builder.notificationId] with `notificationId.orElse(null)`. */
        fun notificationId(notificationId: Optional<String>) =
            notificationId(notificationId.getOrNull())

        /** The maximum number of Events to retrieve per page. */
        fun pageSize(pageSize: Int?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Int) = pageSize(pageSize as Int?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Int>) = pageSize(pageSize.getOrNull())

        fun resourceId(resourceId: String?) = apply { this.resourceId = resourceId }

        /** Alias for calling [Builder.resourceId] with `resourceId.orElse(null)`. */
        fun resourceId(resourceId: Optional<String>) = resourceId(resourceId.getOrNull())

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
         * Returns an immutable instance of [EventListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EventListParams =
            EventListParams(
                orgId,
                accountId,
                eventName,
                eventType,
                ids?.toImmutable(),
                includeActioned,
                nextToken,
                notificationCode,
                notificationId,
                pageSize,
                resourceId,
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
                accountId?.let { put("accountId", it) }
                eventName?.let { put("eventName", it) }
                eventType?.let { put("eventType", it) }
                ids?.let { put("ids", it.joinToString(",")) }
                includeActioned?.let { put("includeActioned", it.toString()) }
                nextToken?.let { put("nextToken", it) }
                notificationCode?.let { put("notificationCode", it) }
                notificationId?.let { put("notificationId", it) }
                pageSize?.let { put("pageSize", it.toString()) }
                resourceId?.let { put("resourceId", it) }
                putAll(additionalQueryParams)
            }
            .build()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventListParams && orgId == other.orgId && accountId == other.accountId && eventName == other.eventName && eventType == other.eventType && ids == other.ids && includeActioned == other.includeActioned && nextToken == other.nextToken && notificationCode == other.notificationCode && notificationId == other.notificationId && pageSize == other.pageSize && resourceId == other.resourceId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, accountId, eventName, eventType, ids, includeActioned, nextToken, notificationCode, notificationId, pageSize, resourceId, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "EventListParams{orgId=$orgId, accountId=$accountId, eventName=$eventName, eventType=$eventType, ids=$ids, includeActioned=$includeActioned, nextToken=$nextToken, notificationCode=$notificationCode, notificationId=$notificationId, pageSize=$pageSize, resourceId=$resourceId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
