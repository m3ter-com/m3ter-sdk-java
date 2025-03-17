// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.sdk.core.ExcludeMissing
import com.m3ter.sdk.core.JsonField
import com.m3ter.sdk.core.JsonMissing
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.core.NoAutoDetect
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/** Response containing an Event entity. */
@NoAutoDetect
class EventResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dtActioned")
    @ExcludeMissing
    private val dtActioned: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("eventName")
    @ExcludeMissing
    private val eventName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("eventTime")
    @ExcludeMissing
    private val eventTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("m3terEvent")
    @ExcludeMissing
    private val m3terEvent: JsonValue = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The uniqie identifier (UUID) of the Event.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * When an Event was actioned. It follows the ISO 8601 date and time format.
     *
     * You can action an Event to indicate that it has been followed up and resolved - this is
     * useful when dealing with integration error Events or ingest failure Events.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dtActioned(): OffsetDateTime = dtActioned.getRequired("dtActioned")

    /**
     * The name of the Event as it is registered in the system. This name is used to categorize and
     * trigger associated actions.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventName(): String = eventName.getRequired("eventName")

    /**
     * The time when the Event was triggered, using the ISO 8601 date and time format.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventTime(): OffsetDateTime = eventTime.getRequired("eventTime")

    /** The Data Transfer Object (DTO) containing the details of the Event. */
    @JsonProperty("m3terEvent") @ExcludeMissing fun _m3terEvent(): JsonValue = m3terEvent

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [dtActioned].
     *
     * Unlike [dtActioned], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dtActioned")
    @ExcludeMissing
    fun _dtActioned(): JsonField<OffsetDateTime> = dtActioned

    /**
     * Returns the raw JSON value of [eventName].
     *
     * Unlike [eventName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventName") @ExcludeMissing fun _eventName(): JsonField<String> = eventName

    /**
     * Returns the raw JSON value of [eventTime].
     *
     * Unlike [eventTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eventTime")
    @ExcludeMissing
    fun _eventTime(): JsonField<OffsetDateTime> = eventTime

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EventResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        dtActioned()
        eventName()
        eventTime()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .dtActioned()
         * .eventName()
         * .eventTime()
         * .m3terEvent()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var dtActioned: JsonField<OffsetDateTime>? = null
        private var eventName: JsonField<String>? = null
        private var eventTime: JsonField<OffsetDateTime>? = null
        private var m3terEvent: JsonValue? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventResponse: EventResponse) = apply {
            id = eventResponse.id
            dtActioned = eventResponse.dtActioned
            eventName = eventResponse.eventName
            eventTime = eventResponse.eventTime
            m3terEvent = eventResponse.m3terEvent
            additionalProperties = eventResponse.additionalProperties.toMutableMap()
        }

        /** The uniqie identifier (UUID) of the Event. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * When an Event was actioned. It follows the ISO 8601 date and time format.
         *
         * You can action an Event to indicate that it has been followed up and resolved - this is
         * useful when dealing with integration error Events or ingest failure Events.
         */
        fun dtActioned(dtActioned: OffsetDateTime) = dtActioned(JsonField.of(dtActioned))

        /**
         * Sets [Builder.dtActioned] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtActioned] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtActioned(dtActioned: JsonField<OffsetDateTime>) = apply {
            this.dtActioned = dtActioned
        }

        /**
         * The name of the Event as it is registered in the system. This name is used to categorize
         * and trigger associated actions.
         */
        fun eventName(eventName: String) = eventName(JsonField.of(eventName))

        /**
         * Sets [Builder.eventName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventName(eventName: JsonField<String>) = apply { this.eventName = eventName }

        /** The time when the Event was triggered, using the ISO 8601 date and time format. */
        fun eventTime(eventTime: OffsetDateTime) = eventTime(JsonField.of(eventTime))

        /**
         * Sets [Builder.eventTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventTime(eventTime: JsonField<OffsetDateTime>) = apply { this.eventTime = eventTime }

        /** The Data Transfer Object (DTO) containing the details of the Event. */
        fun m3terEvent(m3terEvent: JsonValue) = apply { this.m3terEvent = m3terEvent }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [EventResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .dtActioned()
         * .eventName()
         * .eventTime()
         * .m3terEvent()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventResponse =
            EventResponse(
                checkRequired("id", id),
                checkRequired("dtActioned", dtActioned),
                checkRequired("eventName", eventName),
                checkRequired("eventTime", eventTime),
                checkRequired("m3terEvent", m3terEvent),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventResponse && id == other.id && dtActioned == other.dtActioned && eventName == other.eventName && eventTime == other.eventTime && m3terEvent == other.m3terEvent && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, dtActioned, eventName, eventTime, m3terEvent, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventResponse{id=$id, dtActioned=$dtActioned, eventName=$eventName, eventTime=$eventTime, m3terEvent=$m3terEvent, additionalProperties=$additionalProperties}"
}
