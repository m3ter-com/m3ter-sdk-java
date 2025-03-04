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
import java.util.Optional

@NoAutoDetect
class NotificationConfiguration
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<String> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("active")
    @ExcludeMissing
    private val active: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("alwaysFireEvent")
    @ExcludeMissing
    private val alwaysFireEvent: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("calculation")
    @ExcludeMissing
    private val calculation: JsonField<String> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("eventName")
    @ExcludeMissing
    private val eventName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The UUID of the entity. */
    fun id(): String = id.getRequired("id")

    /** The short code for the Notification. */
    fun code(): String = code.getRequired("code")

    /**
     * The description for the Notification providing a brief overview of its purpose and
     * functionality.
     */
    fun description(): String = description.getRequired("description")

    /** The name of the Notification. */
    fun name(): String = name.getRequired("name")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    fun version(): Long = version.getRequired("version")

    /**
     * A Boolean flag indicating whether or not the Notification is active.
     * - **TRUE** - active Notification.
     * - **FALSE** - inactive Notification.
     */
    fun active(): Optional<Boolean> = Optional.ofNullable(active.getNullable("active"))

    /**
     * A Boolean flag indicating whether the Notification is always triggered, regardless of other
     * conditions and omitting reference to any calculation. This means the Notification will be
     * triggered simply by the Event it is based on occurring and with no further conditions having
     * to be met.
     * - **TRUE** - the Notification is always triggered and omits any reference to the calculation
     *   to check for other conditions being true before triggering the Notification.
     * - **FALSE** - the Notification is only triggered when the Event it is based on occurs and any
     *   calculation is checked and all conditions defined by the calculation are met.
     */
    fun alwaysFireEvent(): Optional<Boolean> =
        Optional.ofNullable(alwaysFireEvent.getNullable("alwaysFireEvent"))

    /**
     * A logical expression that that is evaluated to a Boolean. If it evaluates as `True`, a
     * Notification for the Event is created and sent to the configured destination. Calculations
     * can reference numeric, string, and boolean Event fields.
     *
     * See
     * [Creating Calculations](https://www.m3ter.com/docs/guides/utilizing-events-and-notifications/key-concepts-and-relationships#creating-calculations)
     * in the m3ter documentation for more information.
     */
    fun calculation(): Optional<String> =
        Optional.ofNullable(calculation.getNullable("calculation"))

    /** The ID of the user who created this item. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** The DateTime when this item was created _(in ISO-8601 format)_. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /**
     * The name of the Event that the Notification is based on. When this Event occurs and the
     * calculation evaluates to `True`, the Notification is triggered.
     *
     * **Note:** If the Notification is set to always fire, then the Notification will always be
     * sent when the Event it is based on occurs, and without any other conditions defined by a
     * calculation having to be met.
     */
    fun eventName(): Optional<String> = Optional.ofNullable(eventName.getNullable("eventName"))

    /** The ID of the user who last modified this item. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The short code for the Notification. */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * The description for the Notification providing a brief overview of its purpose and
     * functionality.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** The name of the Notification. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /**
     * A Boolean flag indicating whether or not the Notification is active.
     * - **TRUE** - active Notification.
     * - **FALSE** - inactive Notification.
     */
    @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

    /**
     * A Boolean flag indicating whether the Notification is always triggered, regardless of other
     * conditions and omitting reference to any calculation. This means the Notification will be
     * triggered simply by the Event it is based on occurring and with no further conditions having
     * to be met.
     * - **TRUE** - the Notification is always triggered and omits any reference to the calculation
     *   to check for other conditions being true before triggering the Notification.
     * - **FALSE** - the Notification is only triggered when the Event it is based on occurs and any
     *   calculation is checked and all conditions defined by the calculation are met.
     */
    @JsonProperty("alwaysFireEvent")
    @ExcludeMissing
    fun _alwaysFireEvent(): JsonField<Boolean> = alwaysFireEvent

    /**
     * A logical expression that that is evaluated to a Boolean. If it evaluates as `True`, a
     * Notification for the Event is created and sent to the configured destination. Calculations
     * can reference numeric, string, and boolean Event fields.
     *
     * See
     * [Creating Calculations](https://www.m3ter.com/docs/guides/utilizing-events-and-notifications/key-concepts-and-relationships#creating-calculations)
     * in the m3ter documentation for more information.
     */
    @JsonProperty("calculation") @ExcludeMissing fun _calculation(): JsonField<String> = calculation

    /** The ID of the user who created this item. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** The DateTime when this item was created _(in ISO-8601 format)_. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /**
     * The name of the Event that the Notification is based on. When this Event occurs and the
     * calculation evaluates to `True`, the Notification is triggered.
     *
     * **Note:** If the Notification is set to always fire, then the Notification will always be
     * sent when the Event it is based on occurs, and without any other conditions defined by a
     * calculation having to be met.
     */
    @JsonProperty("eventName") @ExcludeMissing fun _eventName(): JsonField<String> = eventName

    /** The ID of the user who last modified this item. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): NotificationConfiguration = apply {
        if (validated) {
            return@apply
        }

        id()
        code()
        description()
        name()
        version()
        active()
        alwaysFireEvent()
        calculation()
        createdBy()
        dtCreated()
        dtLastModified()
        eventName()
        lastModifiedBy()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NotificationConfiguration].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .code()
         * .description()
         * .name()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotificationConfiguration]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var code: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var active: JsonField<Boolean> = JsonMissing.of()
        private var alwaysFireEvent: JsonField<Boolean> = JsonMissing.of()
        private var calculation: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var eventName: JsonField<String> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(notificationConfiguration: NotificationConfiguration) = apply {
            id = notificationConfiguration.id
            code = notificationConfiguration.code
            description = notificationConfiguration.description
            name = notificationConfiguration.name
            version = notificationConfiguration.version
            active = notificationConfiguration.active
            alwaysFireEvent = notificationConfiguration.alwaysFireEvent
            calculation = notificationConfiguration.calculation
            createdBy = notificationConfiguration.createdBy
            dtCreated = notificationConfiguration.dtCreated
            dtLastModified = notificationConfiguration.dtLastModified
            eventName = notificationConfiguration.eventName
            lastModifiedBy = notificationConfiguration.lastModifiedBy
            additionalProperties = notificationConfiguration.additionalProperties.toMutableMap()
        }

        /** The UUID of the entity. */
        fun id(id: String) = id(JsonField.of(id))

        /** The UUID of the entity. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The short code for the Notification. */
        fun code(code: String) = code(JsonField.of(code))

        /** The short code for the Notification. */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /**
         * The description for the Notification providing a brief overview of its purpose and
         * functionality.
         */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * The description for the Notification providing a brief overview of its purpose and
         * functionality.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The name of the Notification. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the Notification. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The version number:
         * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
         *   response.
         * - **Update:** On successful Update, the version is incremented by 1 in the response.
         */
        fun version(version: Long) = version(JsonField.of(version))

        /**
         * The version number:
         * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
         *   response.
         * - **Update:** On successful Update, the version is incremented by 1 in the response.
         */
        fun version(version: JsonField<Long>) = apply { this.version = version }

        /**
         * A Boolean flag indicating whether or not the Notification is active.
         * - **TRUE** - active Notification.
         * - **FALSE** - inactive Notification.
         */
        fun active(active: Boolean) = active(JsonField.of(active))

        /**
         * A Boolean flag indicating whether or not the Notification is active.
         * - **TRUE** - active Notification.
         * - **FALSE** - inactive Notification.
         */
        fun active(active: JsonField<Boolean>) = apply { this.active = active }

        /**
         * A Boolean flag indicating whether the Notification is always triggered, regardless of
         * other conditions and omitting reference to any calculation. This means the Notification
         * will be triggered simply by the Event it is based on occurring and with no further
         * conditions having to be met.
         * - **TRUE** - the Notification is always triggered and omits any reference to the
         *   calculation to check for other conditions being true before triggering the
         *   Notification.
         * - **FALSE** - the Notification is only triggered when the Event it is based on occurs and
         *   any calculation is checked and all conditions defined by the calculation are met.
         */
        fun alwaysFireEvent(alwaysFireEvent: Boolean) =
            alwaysFireEvent(JsonField.of(alwaysFireEvent))

        /**
         * A Boolean flag indicating whether the Notification is always triggered, regardless of
         * other conditions and omitting reference to any calculation. This means the Notification
         * will be triggered simply by the Event it is based on occurring and with no further
         * conditions having to be met.
         * - **TRUE** - the Notification is always triggered and omits any reference to the
         *   calculation to check for other conditions being true before triggering the
         *   Notification.
         * - **FALSE** - the Notification is only triggered when the Event it is based on occurs and
         *   any calculation is checked and all conditions defined by the calculation are met.
         */
        fun alwaysFireEvent(alwaysFireEvent: JsonField<Boolean>) = apply {
            this.alwaysFireEvent = alwaysFireEvent
        }

        /**
         * A logical expression that that is evaluated to a Boolean. If it evaluates as `True`, a
         * Notification for the Event is created and sent to the configured destination.
         * Calculations can reference numeric, string, and boolean Event fields.
         *
         * See
         * [Creating Calculations](https://www.m3ter.com/docs/guides/utilizing-events-and-notifications/key-concepts-and-relationships#creating-calculations)
         * in the m3ter documentation for more information.
         */
        fun calculation(calculation: String) = calculation(JsonField.of(calculation))

        /**
         * A logical expression that that is evaluated to a Boolean. If it evaluates as `True`, a
         * Notification for the Event is created and sent to the configured destination.
         * Calculations can reference numeric, string, and boolean Event fields.
         *
         * See
         * [Creating Calculations](https://www.m3ter.com/docs/guides/utilizing-events-and-notifications/key-concepts-and-relationships#creating-calculations)
         * in the m3ter documentation for more information.
         */
        fun calculation(calculation: JsonField<String>) = apply { this.calculation = calculation }

        /** The ID of the user who created this item. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The ID of the user who created this item. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The DateTime when this item was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The DateTime when this item was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /**
         * The name of the Event that the Notification is based on. When this Event occurs and the
         * calculation evaluates to `True`, the Notification is triggered.
         *
         * **Note:** If the Notification is set to always fire, then the Notification will always be
         * sent when the Event it is based on occurs, and without any other conditions defined by a
         * calculation having to be met.
         */
        fun eventName(eventName: String) = eventName(JsonField.of(eventName))

        /**
         * The name of the Event that the Notification is based on. When this Event occurs and the
         * calculation evaluates to `True`, the Notification is triggered.
         *
         * **Note:** If the Notification is set to always fire, then the Notification will always be
         * sent when the Event it is based on occurs, and without any other conditions defined by a
         * calculation having to be met.
         */
        fun eventName(eventName: JsonField<String>) = apply { this.eventName = eventName }

        /** The ID of the user who last modified this item. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The ID of the user who last modified this item. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
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

        fun build(): NotificationConfiguration =
            NotificationConfiguration(
                checkRequired("id", id),
                checkRequired("code", code),
                checkRequired("description", description),
                checkRequired("name", name),
                checkRequired("version", version),
                active,
                alwaysFireEvent,
                calculation,
                createdBy,
                dtCreated,
                dtLastModified,
                eventName,
                lastModifiedBy,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NotificationConfiguration && id == other.id && code == other.code && description == other.description && name == other.name && version == other.version && active == other.active && alwaysFireEvent == other.alwaysFireEvent && calculation == other.calculation && createdBy == other.createdBy && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && eventName == other.eventName && lastModifiedBy == other.lastModifiedBy && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, code, description, name, version, active, alwaysFireEvent, calculation, createdBy, dtCreated, dtLastModified, eventName, lastModifiedBy, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NotificationConfiguration{id=$id, code=$code, description=$description, name=$name, version=$version, active=$active, alwaysFireEvent=$alwaysFireEvent, calculation=$calculation, createdBy=$createdBy, dtCreated=$dtCreated, dtLastModified=$dtLastModified, eventName=$eventName, lastModifiedBy=$lastModifiedBy, additionalProperties=$additionalProperties}"
}
