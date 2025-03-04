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
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import java.util.Objects
import java.util.Optional

/** Response containing list of Event Types that can have Notification rules configured. */
@NoAutoDetect
class EventGetTypesResponse
@JsonCreator
private constructor(
    @JsonProperty("events")
    @ExcludeMissing
    private val events: JsonField<List<String>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * An array containing a list of all Event Types for which Notification rules can be configured.
     * Each Event Type is represented by a string.
     */
    fun events(): Optional<List<String>> = Optional.ofNullable(events.getNullable("events"))

    /**
     * An array containing a list of all Event Types for which Notification rules can be configured.
     * Each Event Type is represented by a string.
     */
    @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<String>> = events

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EventGetTypesResponse = apply {
        if (validated) {
            return@apply
        }

        events()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [EventGetTypesResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventGetTypesResponse]. */
    class Builder internal constructor() {

        private var events: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventGetTypesResponse: EventGetTypesResponse) = apply {
            events = eventGetTypesResponse.events.map { it.toMutableList() }
            additionalProperties = eventGetTypesResponse.additionalProperties.toMutableMap()
        }

        /**
         * An array containing a list of all Event Types for which Notification rules can be
         * configured. Each Event Type is represented by a string.
         */
        fun events(events: List<String>) = events(JsonField.of(events))

        /**
         * An array containing a list of all Event Types for which Notification rules can be
         * configured. Each Event Type is represented by a string.
         */
        fun events(events: JsonField<List<String>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * An array containing a list of all Event Types for which Notification rules can be
         * configured. Each Event Type is represented by a string.
         */
        fun addEvent(event: String) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

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

        fun build(): EventGetTypesResponse =
            EventGetTypesResponse(
                (events ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventGetTypesResponse && events == other.events && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(events, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventGetTypesResponse{events=$events, additionalProperties=$additionalProperties}"
}
