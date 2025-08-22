// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.core.ExcludeMissing
import com.m3ter.core.JsonField
import com.m3ter.core.JsonMissing
import com.m3ter.core.JsonValue
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response containing the list of Fields for an Event Type. */
class EventGetFieldsResponse
private constructor(
    private val events: JsonField<Events>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("events") @ExcludeMissing events: JsonField<Events> = JsonMissing.of()
    ) : this(events, mutableMapOf())

    /**
     * An object containing the list of Fields for the queried Event Type.
     *
     * See the 200 Response sample where we have queried to get the Fields for the
     * `configuration.commitment.created` Event Type.
     *
     * **Note:** `new` represents the attributes the newly created object has.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun events(): Optional<Events> = events.getOptional("events")

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<Events> = events

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [EventGetFieldsResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventGetFieldsResponse]. */
    class Builder internal constructor() {

        private var events: JsonField<Events> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(eventGetFieldsResponse: EventGetFieldsResponse) = apply {
            events = eventGetFieldsResponse.events
            additionalProperties = eventGetFieldsResponse.additionalProperties.toMutableMap()
        }

        /**
         * An object containing the list of Fields for the queried Event Type.
         *
         * See the 200 Response sample where we have queried to get the Fields for the
         * `configuration.commitment.created` Event Type.
         *
         * **Note:** `new` represents the attributes the newly created object has.
         */
        fun events(events: Events) = events(JsonField.of(events))

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed [Events] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun events(events: JsonField<Events>) = apply { this.events = events }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [EventGetFieldsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EventGetFieldsResponse =
            EventGetFieldsResponse(events, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): EventGetFieldsResponse = apply {
        if (validated) {
            return@apply
        }

        events().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = (events.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * An object containing the list of Fields for the queried Event Type.
     *
     * See the 200 Response sample where we have queried to get the Fields for the
     * `configuration.commitment.created` Event Type.
     *
     * **Note:** `new` represents the attributes the newly created object has.
     */
    class Events
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Events]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Events]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(events: Events) = apply {
                additionalProperties = events.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Events].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Events = Events(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Events = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Events && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Events{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventGetFieldsResponse &&
            events == other.events &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(events, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventGetFieldsResponse{events=$events, additionalProperties=$additionalProperties}"
}
