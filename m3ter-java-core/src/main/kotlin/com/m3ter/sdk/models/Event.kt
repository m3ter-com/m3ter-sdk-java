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
import java.time.OffsetDateTime
import java.util.Objects

/** Response containing an Event entity. */
@NoAutoDetect
class Event
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

    /** The uniqie identifier (UUID) of the Event. */
    fun id(): String = id.getRequired("id")

    /**
     * When an Event was actioned. It follows the ISO 8601 date and time format.
     *
     * You can action an Event to indicate that it has been followed up and resolved - this is
     * useful when dealing with integration error Events or ingest failure Events.
     */
    fun dtActioned(): OffsetDateTime = dtActioned.getRequired("dtActioned")

    /**
     * The name of the Event as it is registered in the system. This name is used to categorize and
     * trigger associated actions.
     */
    fun eventName(): String = eventName.getRequired("eventName")

    /** The time when the Event was triggered, using the ISO 8601 date and time format. */
    fun eventTime(): OffsetDateTime = eventTime.getRequired("eventTime")

    /** The Data Transfer Object (DTO) containing the details of the Event. */
    @JsonProperty("m3terEvent") @ExcludeMissing fun _m3terEvent(): JsonValue = m3terEvent

    /** The uniqie identifier (UUID) of the Event. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * When an Event was actioned. It follows the ISO 8601 date and time format.
     *
     * You can action an Event to indicate that it has been followed up and resolved - this is
     * useful when dealing with integration error Events or ingest failure Events.
     */
    @JsonProperty("dtActioned")
    @ExcludeMissing
    fun _dtActioned(): JsonField<OffsetDateTime> = dtActioned

    /**
     * The name of the Event as it is registered in the system. This name is used to categorize and
     * trigger associated actions.
     */
    @JsonProperty("eventName") @ExcludeMissing fun _eventName(): JsonField<String> = eventName

    /** The time when the Event was triggered, using the ISO 8601 date and time format. */
    @JsonProperty("eventTime")
    @ExcludeMissing
    fun _eventTime(): JsonField<OffsetDateTime> = eventTime

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Event = apply {
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

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Event]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var dtActioned: JsonField<OffsetDateTime>? = null
        private var eventName: JsonField<String>? = null
        private var eventTime: JsonField<OffsetDateTime>? = null
        private var m3terEvent: JsonValue? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(event: Event) = apply {
            id = event.id
            dtActioned = event.dtActioned
            eventName = event.eventName
            eventTime = event.eventTime
            m3terEvent = event.m3terEvent
            additionalProperties = event.additionalProperties.toMutableMap()
        }

        /** The uniqie identifier (UUID) of the Event. */
        fun id(id: String) = id(JsonField.of(id))

        /** The uniqie identifier (UUID) of the Event. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * When an Event was actioned. It follows the ISO 8601 date and time format.
         *
         * You can action an Event to indicate that it has been followed up and resolved - this is
         * useful when dealing with integration error Events or ingest failure Events.
         */
        fun dtActioned(dtActioned: OffsetDateTime) = dtActioned(JsonField.of(dtActioned))

        /**
         * When an Event was actioned. It follows the ISO 8601 date and time format.
         *
         * You can action an Event to indicate that it has been followed up and resolved - this is
         * useful when dealing with integration error Events or ingest failure Events.
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
         * The name of the Event as it is registered in the system. This name is used to categorize
         * and trigger associated actions.
         */
        fun eventName(eventName: JsonField<String>) = apply { this.eventName = eventName }

        /** The time when the Event was triggered, using the ISO 8601 date and time format. */
        fun eventTime(eventTime: OffsetDateTime) = eventTime(JsonField.of(eventTime))

        /** The time when the Event was triggered, using the ISO 8601 date and time format. */
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

        fun build(): Event =
            Event(
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

        return /* spotless:off */ other is Event && id == other.id && dtActioned == other.dtActioned && eventName == other.eventName && eventTime == other.eventTime && m3terEvent == other.m3terEvent && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, dtActioned, eventName, eventTime, m3terEvent, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Event{id=$id, dtActioned=$dtActioned, eventName=$eventName, eventTime=$eventTime, m3terEvent=$m3terEvent, additionalProperties=$additionalProperties}"
}
