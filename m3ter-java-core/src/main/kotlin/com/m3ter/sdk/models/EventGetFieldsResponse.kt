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
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Objects
import java.util.Optional

/** Response containing the list of Fields for an Event Type. */
@NoAutoDetect
class EventGetFieldsResponse
@JsonCreator
private constructor(
    @JsonProperty("events")
    @ExcludeMissing
    private val events: JsonField<Events> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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
    fun events(): Optional<Events> = Optional.ofNullable(events.getNullable("events"))

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<Events> = events

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EventGetFieldsResponse = apply {
        if (validated) {
            return@apply
        }

        events().ifPresent { it.validate() }
        validated = true
    }

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
         * Returns an immutable instance of [EventGetFieldsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): EventGetFieldsResponse =
            EventGetFieldsResponse(events, additionalProperties.toImmutable())
    }

    /**
     * An object containing the list of Fields for the queried Event Type.
     *
     * See the 200 Response sample where we have queried to get the Fields for the
     * `configuration.commitment.created` Event Type.
     *
     * **Note:** `new` represents the attributes the newly created object has.
     */
    @NoAutoDetect
    class Events
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Events = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

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
             * Returns an immutable instance of [Events].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Events = Events(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Events && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Events{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventGetFieldsResponse && events == other.events && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(events, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventGetFieldsResponse{events=$events, additionalProperties=$additionalProperties}"
}
