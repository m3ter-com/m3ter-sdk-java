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
    private val orgId: String,
    private val accountId: String?,
    private val eventName: String?,
    private val eventType: String?,
    private val ids: List<String>?,
    private val includeActioned: Boolean?,
    private val nextToken: String?,
    private val notificationCode: String?,
    private val notificationId: String?,
    private val pageSize: Long?,
    private val resourceId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

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
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun resourceId(): Optional<String> = Optional.ofNullable(resourceId)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.accountId?.let { queryParams.put("accountId", listOf(it.toString())) }
        this.eventName?.let { queryParams.put("eventName", listOf(it.toString())) }
        this.eventType?.let { queryParams.put("eventType", listOf(it.toString())) }
        this.ids?.let { queryParams.put("ids", listOf(it.joinToString(separator = ","))) }
        this.includeActioned?.let { queryParams.put("includeActioned", listOf(it.toString())) }
        this.nextToken?.let { queryParams.put("nextToken", listOf(it.toString())) }
        this.notificationCode?.let { queryParams.put("notificationCode", listOf(it.toString())) }
        this.notificationId?.let { queryParams.put("notificationId", listOf(it.toString())) }
        this.pageSize?.let { queryParams.put("pageSize", listOf(it.toString())) }
        this.resourceId?.let { queryParams.put("resourceId", listOf(it.toString())) }
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
         * Returns a mutable builder for constructing an instance of [EventListParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventListParams]. */
    @NoAutoDetect
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
        private var pageSize: Long? = null
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

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /**
         * The Account ID associated with the Event to filter the results. Returns the Events that
         * have been generated for the Account.
         */
        fun accountId(accountId: String?) = apply { this.accountId = accountId }

        /**
         * The Account ID associated with the Event to filter the results. Returns the Events that
         * have been generated for the Account.
         */
        fun accountId(accountId: Optional<String>) = accountId(accountId.getOrNull())

        fun eventName(eventName: String?) = apply { this.eventName = eventName }

        fun eventName(eventName: Optional<String>) = eventName(eventName.getOrNull())

        /**
         * The category of Events to filter the results by. Options:
         * - Notification
         * - IntegrationEvent
         * - IngestValidationFailure
         * - DataExportJobFailure
         */
        fun eventType(eventType: String?) = apply { this.eventType = eventType }

        /**
         * The category of Events to filter the results by. Options:
         * - Notification
         * - IntegrationEvent
         * - IngestValidationFailure
         * - DataExportJobFailure
         */
        fun eventType(eventType: Optional<String>) = eventType(eventType.getOrNull())

        /**
         * List of Event UUIDs to filter the results.
         *
         * **NOTE:** cannot be used with other filters.
         */
        fun ids(ids: List<String>?) = apply { this.ids = ids?.toMutableList() }

        /**
         * List of Event UUIDs to filter the results.
         *
         * **NOTE:** cannot be used with other filters.
         */
        fun ids(ids: Optional<List<String>>) = ids(ids.getOrNull())

        /**
         * List of Event UUIDs to filter the results.
         *
         * **NOTE:** cannot be used with other filters.
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
         * A Boolean flag indicating whether to return Events that have been actioned.
         * - **TRUE** - include actioned Events.
         * - **FALSE** - exclude actioned Events.
         */
        fun includeActioned(includeActioned: Boolean) = includeActioned(includeActioned as Boolean?)

        /**
         * A Boolean flag indicating whether to return Events that have been actioned.
         * - **TRUE** - include actioned Events.
         * - **FALSE** - exclude actioned Events.
         */
        fun includeActioned(includeActioned: Optional<Boolean>) =
            includeActioned(includeActioned.getOrNull())

        /**
         * The `nextToken` for multi-page retrievals. It is used to fetch the next page of Events in
         * a paginated list.
         */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /**
         * The `nextToken` for multi-page retrievals. It is used to fetch the next page of Events in
         * a paginated list.
         */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /**
         * Short code of the Notification to filter the results. Returns the Events that have
         * triggered the Notification.
         */
        fun notificationCode(notificationCode: String?) = apply {
            this.notificationCode = notificationCode
        }

        /**
         * Short code of the Notification to filter the results. Returns the Events that have
         * triggered the Notification.
         */
        fun notificationCode(notificationCode: Optional<String>) =
            notificationCode(notificationCode.getOrNull())

        /**
         * Notification UUID to filter the results. Returns the Events that have triggered the
         * Notification.
         */
        fun notificationId(notificationId: String?) = apply { this.notificationId = notificationId }

        /**
         * Notification UUID to filter the results. Returns the Events that have triggered the
         * Notification.
         */
        fun notificationId(notificationId: Optional<String>) =
            notificationId(notificationId.getOrNull())

        /** The maximum number of Events to retrieve per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /** The maximum number of Events to retrieve per page. */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** The maximum number of Events to retrieve per page. */
        fun pageSize(pageSize: Optional<Long>) = pageSize(pageSize.getOrNull())

        fun resourceId(resourceId: String?) = apply { this.resourceId = resourceId }

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

        fun build(): EventListParams =
            EventListParams(
                checkRequired("orgId", orgId),
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
