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
 * Retrieve a list of Event Notifications for the specified Organization.
 *
 * This endpoint retrieves a list of all Event Notifications for the Organization identified by its
 * UUID. The list can be paginated for easier management. The list also supports filtering by
 * parameters such as Notification UUID.
 */
class NotificationConfigurationListParams
private constructor(
    private val orgId: String,
    private val active: Boolean?,
    private val eventName: String?,
    private val ids: List<String>?,
    private val nextToken: String?,
    private val pageSize: Long?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /**
     * A Boolean flag indicating whether to retrieve only active or only inactive Notifications.
     * - **TRUE** - only active Notifications are returned.
     * - **FALSE** - only inactive Notifications are returned.
     */
    fun active(): Optional<Boolean> = Optional.ofNullable(active)

    /**
     * Use this to filter the Notifications returned - only those Notifications that are based on
     * the _Event type_ specified by `eventName` are returned.
     */
    fun eventName(): Optional<String> = Optional.ofNullable(eventName)

    /** A list of specific Notification UUIDs to retrieve. */
    fun ids(): Optional<List<String>> = Optional.ofNullable(ids)

    /**
     * The `nextToken` for multi-page retrievals. It is used to fetch the next page of Notifications
     * in a paginated list.
     */
    fun nextToken(): Optional<String> = Optional.ofNullable(nextToken)

    /** Specifies the maximum number of Notifications to retrieve per page. */
    fun pageSize(): Optional<Long> = Optional.ofNullable(pageSize)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                active?.let { put("active", it.toString()) }
                eventName?.let { put("eventName", it) }
                ids?.let { put("ids", it.joinToString(",")) }
                nextToken?.let { put("nextToken", it) }
                pageSize?.let { put("pageSize", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [NotificationConfigurationListParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationConfigurationListParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var active: Boolean? = null
        private var eventName: String? = null
        private var ids: MutableList<String>? = null
        private var nextToken: String? = null
        private var pageSize: Long? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            notificationConfigurationListParams: NotificationConfigurationListParams
        ) = apply {
            orgId = notificationConfigurationListParams.orgId
            active = notificationConfigurationListParams.active
            eventName = notificationConfigurationListParams.eventName
            ids = notificationConfigurationListParams.ids?.toMutableList()
            nextToken = notificationConfigurationListParams.nextToken
            pageSize = notificationConfigurationListParams.pageSize
            additionalHeaders = notificationConfigurationListParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                notificationConfigurationListParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /**
         * A Boolean flag indicating whether to retrieve only active or only inactive Notifications.
         * - **TRUE** - only active Notifications are returned.
         * - **FALSE** - only inactive Notifications are returned.
         */
        fun active(active: Boolean?) = apply { this.active = active }

        /**
         * Alias for [Builder.active].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun active(active: Boolean) = active(active as Boolean?)

        /** Alias for calling [Builder.active] with `active.orElse(null)`. */
        fun active(active: Optional<Boolean>) = active(active.getOrNull())

        /**
         * Use this to filter the Notifications returned - only those Notifications that are based
         * on the _Event type_ specified by `eventName` are returned.
         */
        fun eventName(eventName: String?) = apply { this.eventName = eventName }

        /** Alias for calling [Builder.eventName] with `eventName.orElse(null)`. */
        fun eventName(eventName: Optional<String>) = eventName(eventName.getOrNull())

        /** A list of specific Notification UUIDs to retrieve. */
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
         * The `nextToken` for multi-page retrievals. It is used to fetch the next page of
         * Notifications in a paginated list.
         */
        fun nextToken(nextToken: String?) = apply { this.nextToken = nextToken }

        /** Alias for calling [Builder.nextToken] with `nextToken.orElse(null)`. */
        fun nextToken(nextToken: Optional<String>) = nextToken(nextToken.getOrNull())

        /** Specifies the maximum number of Notifications to retrieve per page. */
        fun pageSize(pageSize: Long?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Long) = pageSize(pageSize as Long?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
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

        /**
         * Returns an immutable instance of [NotificationConfigurationListParams].
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
        fun build(): NotificationConfigurationListParams =
            NotificationConfigurationListParams(
                checkRequired("orgId", orgId),
                active,
                eventName,
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

        return /* spotless:off */ other is NotificationConfigurationListParams && orgId == other.orgId && active == other.active && eventName == other.eventName && ids == other.ids && nextToken == other.nextToken && pageSize == other.pageSize && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, active, eventName, ids, nextToken, pageSize, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "NotificationConfigurationListParams{orgId=$orgId, active=$active, eventName=$eventName, ids=$ids, nextToken=$nextToken, pageSize=$pageSize, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
