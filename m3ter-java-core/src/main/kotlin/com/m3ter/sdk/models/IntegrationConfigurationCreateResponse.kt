// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.sdk.core.Enum
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
import java.util.Optional

@NoAutoDetect
class IntegrationConfigurationCreateResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("destination")
    @ExcludeMissing
    private val destination: JsonField<String> = JsonMissing.of(),
    @JsonProperty("entityType")
    @ExcludeMissing
    private val entityType: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("authorized")
    @ExcludeMissing
    private val authorized: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("configData")
    @ExcludeMissing
    private val configData: JsonField<ConfigData> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("destinationId")
    @ExcludeMissing
    private val destinationId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("enabled")
    @ExcludeMissing
    private val enabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("entityId")
    @ExcludeMissing
    private val entityId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("integrationCredentialsId")
    @ExcludeMissing
    private val integrationCredentialsId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("triggerType")
    @ExcludeMissing
    private val triggerType: JsonField<TriggerType> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The UUID of the entity. */
    fun id(): String = id.getRequired("id")

    /** The type of destination _(e.g. Netsuite, webhooks)_. */
    fun destination(): String = destination.getRequired("destination")

    /** The type of entity the integration is for _(e.g. Bill)_. */
    fun entityType(): String = entityType.getRequired("entityType")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    fun version(): Long = version.getRequired("version")

    /**
     * A flag indicating whether the integration configuration is authorized.
     * - TRUE - authorized.
     * - FALSE - not authorized.
     */
    fun authorized(): Optional<Boolean> = Optional.ofNullable(authorized.getNullable("authorized"))

    /** Configuration data for the integration */
    fun configData(): Optional<ConfigData> =
        Optional.ofNullable(configData.getNullable("configData"))

    /** The ID of the user who created this item. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** The unique identifier (UUID) of the entity the integration is for. */
    fun destinationId(): Optional<String> =
        Optional.ofNullable(destinationId.getNullable("destinationId"))

    /** The DateTime when this item was created _(in ISO-8601 format)_. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /**
     * A flag indicating whether the integration configuration is currently enabled or disabled.
     * - TRUE - enabled.
     * - FALSE - disabled.
     */
    fun enabled(): Optional<Boolean> = Optional.ofNullable(enabled.getNullable("enabled"))

    /**
     * The unique identifier (UUID) of the entity this integration is for _(e.g. the ID of a
     * notification configuration. Optional.)_
     */
    fun entityId(): Optional<String> = Optional.ofNullable(entityId.getNullable("entityId"))

    /** UUID of the credentials to use for this integration */
    fun integrationCredentialsId(): Optional<String> =
        Optional.ofNullable(integrationCredentialsId.getNullable("integrationCredentialsId"))

    /** The ID of the user who last modified this item. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** The name of the configuration */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** Specifies the type of trigger for the integration. */
    @Deprecated("deprecated")
    fun triggerType(): Optional<TriggerType> =
        Optional.ofNullable(triggerType.getNullable("triggerType"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The type of destination _(e.g. Netsuite, webhooks)_. */
    @JsonProperty("destination") @ExcludeMissing fun _destination(): JsonField<String> = destination

    /** The type of entity the integration is for _(e.g. Bill)_. */
    @JsonProperty("entityType") @ExcludeMissing fun _entityType(): JsonField<String> = entityType

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /**
     * A flag indicating whether the integration configuration is authorized.
     * - TRUE - authorized.
     * - FALSE - not authorized.
     */
    @JsonProperty("authorized") @ExcludeMissing fun _authorized(): JsonField<Boolean> = authorized

    /** Configuration data for the integration */
    @JsonProperty("configData")
    @ExcludeMissing
    fun _configData(): JsonField<ConfigData> = configData

    /** The ID of the user who created this item. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** The unique identifier (UUID) of the entity the integration is for. */
    @JsonProperty("destinationId")
    @ExcludeMissing
    fun _destinationId(): JsonField<String> = destinationId

    /** The DateTime when this item was created _(in ISO-8601 format)_. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /**
     * A flag indicating whether the integration configuration is currently enabled or disabled.
     * - TRUE - enabled.
     * - FALSE - disabled.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * The unique identifier (UUID) of the entity this integration is for _(e.g. the ID of a
     * notification configuration. Optional.)_
     */
    @JsonProperty("entityId") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

    /** UUID of the credentials to use for this integration */
    @JsonProperty("integrationCredentialsId")
    @ExcludeMissing
    fun _integrationCredentialsId(): JsonField<String> = integrationCredentialsId

    /** The ID of the user who last modified this item. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /** The name of the configuration */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** Specifies the type of trigger for the integration. */
    @Deprecated("deprecated")
    @JsonProperty("triggerType")
    @ExcludeMissing
    fun _triggerType(): JsonField<TriggerType> = triggerType

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): IntegrationConfigurationCreateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        destination()
        entityType()
        version()
        authorized()
        configData().ifPresent { it.validate() }
        createdBy()
        destinationId()
        dtCreated()
        dtLastModified()
        enabled()
        entityId()
        integrationCredentialsId()
        lastModifiedBy()
        name()
        triggerType()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [IntegrationConfigurationCreateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .destination()
         * .entityType()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntegrationConfigurationCreateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var destination: JsonField<String>? = null
        private var entityType: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var authorized: JsonField<Boolean> = JsonMissing.of()
        private var configData: JsonField<ConfigData> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var destinationId: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var enabled: JsonField<Boolean> = JsonMissing.of()
        private var entityId: JsonField<String> = JsonMissing.of()
        private var integrationCredentialsId: JsonField<String> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var triggerType: JsonField<TriggerType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            integrationConfigurationCreateResponse: IntegrationConfigurationCreateResponse
        ) = apply {
            id = integrationConfigurationCreateResponse.id
            destination = integrationConfigurationCreateResponse.destination
            entityType = integrationConfigurationCreateResponse.entityType
            version = integrationConfigurationCreateResponse.version
            authorized = integrationConfigurationCreateResponse.authorized
            configData = integrationConfigurationCreateResponse.configData
            createdBy = integrationConfigurationCreateResponse.createdBy
            destinationId = integrationConfigurationCreateResponse.destinationId
            dtCreated = integrationConfigurationCreateResponse.dtCreated
            dtLastModified = integrationConfigurationCreateResponse.dtLastModified
            enabled = integrationConfigurationCreateResponse.enabled
            entityId = integrationConfigurationCreateResponse.entityId
            integrationCredentialsId =
                integrationConfigurationCreateResponse.integrationCredentialsId
            lastModifiedBy = integrationConfigurationCreateResponse.lastModifiedBy
            name = integrationConfigurationCreateResponse.name
            triggerType = integrationConfigurationCreateResponse.triggerType
            additionalProperties =
                integrationConfigurationCreateResponse.additionalProperties.toMutableMap()
        }

        /** The UUID of the entity. */
        fun id(id: String) = id(JsonField.of(id))

        /** The UUID of the entity. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The type of destination _(e.g. Netsuite, webhooks)_. */
        fun destination(destination: String) = destination(JsonField.of(destination))

        /** The type of destination _(e.g. Netsuite, webhooks)_. */
        fun destination(destination: JsonField<String>) = apply { this.destination = destination }

        /** The type of entity the integration is for _(e.g. Bill)_. */
        fun entityType(entityType: String) = entityType(JsonField.of(entityType))

        /** The type of entity the integration is for _(e.g. Bill)_. */
        fun entityType(entityType: JsonField<String>) = apply { this.entityType = entityType }

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
         * A flag indicating whether the integration configuration is authorized.
         * - TRUE - authorized.
         * - FALSE - not authorized.
         */
        fun authorized(authorized: Boolean) = authorized(JsonField.of(authorized))

        /**
         * A flag indicating whether the integration configuration is authorized.
         * - TRUE - authorized.
         * - FALSE - not authorized.
         */
        fun authorized(authorized: JsonField<Boolean>) = apply { this.authorized = authorized }

        /** Configuration data for the integration */
        fun configData(configData: ConfigData) = configData(JsonField.of(configData))

        /** Configuration data for the integration */
        fun configData(configData: JsonField<ConfigData>) = apply { this.configData = configData }

        /** The ID of the user who created this item. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The ID of the user who created this item. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The unique identifier (UUID) of the entity the integration is for. */
        fun destinationId(destinationId: String) = destinationId(JsonField.of(destinationId))

        /** The unique identifier (UUID) of the entity the integration is for. */
        fun destinationId(destinationId: JsonField<String>) = apply {
            this.destinationId = destinationId
        }

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
         * A flag indicating whether the integration configuration is currently enabled or disabled.
         * - TRUE - enabled.
         * - FALSE - disabled.
         */
        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /**
         * A flag indicating whether the integration configuration is currently enabled or disabled.
         * - TRUE - enabled.
         * - FALSE - disabled.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /**
         * The unique identifier (UUID) of the entity this integration is for _(e.g. the ID of a
         * notification configuration. Optional.)_
         */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /**
         * The unique identifier (UUID) of the entity this integration is for _(e.g. the ID of a
         * notification configuration. Optional.)_
         */
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /** UUID of the credentials to use for this integration */
        fun integrationCredentialsId(integrationCredentialsId: String) =
            integrationCredentialsId(JsonField.of(integrationCredentialsId))

        /** UUID of the credentials to use for this integration */
        fun integrationCredentialsId(integrationCredentialsId: JsonField<String>) = apply {
            this.integrationCredentialsId = integrationCredentialsId
        }

        /** The ID of the user who last modified this item. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The ID of the user who last modified this item. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /** The name of the configuration */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the configuration */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Specifies the type of trigger for the integration. */
        @Deprecated("deprecated")
        fun triggerType(triggerType: TriggerType) = triggerType(JsonField.of(triggerType))

        /** Specifies the type of trigger for the integration. */
        @Deprecated("deprecated")
        fun triggerType(triggerType: JsonField<TriggerType>) = apply {
            this.triggerType = triggerType
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

        fun build(): IntegrationConfigurationCreateResponse =
            IntegrationConfigurationCreateResponse(
                checkRequired("id", id),
                checkRequired("destination", destination),
                checkRequired("entityType", entityType),
                checkRequired("version", version),
                authorized,
                configData,
                createdBy,
                destinationId,
                dtCreated,
                dtLastModified,
                enabled,
                entityId,
                integrationCredentialsId,
                lastModifiedBy,
                name,
                triggerType,
                additionalProperties.toImmutable(),
            )
    }

    /** Configuration data for the integration */
    @NoAutoDetect
    class ConfigData
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ConfigData = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ConfigData]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConfigData]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(configData: ConfigData) = apply {
                additionalProperties = configData.additionalProperties.toMutableMap()
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

            fun build(): ConfigData = ConfigData(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ConfigData && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "ConfigData{additionalProperties=$additionalProperties}"
    }

    /** Specifies the type of trigger for the integration. */
    @Deprecated("deprecated")
    class TriggerType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val EVENT = of("EVENT")

            @JvmField val SCHEDULE = of("SCHEDULE")

            @JvmStatic fun of(value: String) = TriggerType(JsonField.of(value))
        }

        /** An enum containing [TriggerType]'s known values. */
        enum class Known {
            EVENT,
            SCHEDULE,
        }

        /**
         * An enum containing [TriggerType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TriggerType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EVENT,
            SCHEDULE,
            /**
             * An enum member indicating that [TriggerType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                EVENT -> Value.EVENT
                SCHEDULE -> Value.SCHEDULE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws M3terInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                EVENT -> Known.EVENT
                SCHEDULE -> Known.SCHEDULE
                else -> throw M3terInvalidDataException("Unknown TriggerType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws M3terInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { M3terInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TriggerType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IntegrationConfigurationCreateResponse && id == other.id && destination == other.destination && entityType == other.entityType && version == other.version && authorized == other.authorized && configData == other.configData && createdBy == other.createdBy && destinationId == other.destinationId && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && enabled == other.enabled && entityId == other.entityId && integrationCredentialsId == other.integrationCredentialsId && lastModifiedBy == other.lastModifiedBy && name == other.name && triggerType == other.triggerType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, destination, entityType, version, authorized, configData, createdBy, destinationId, dtCreated, dtLastModified, enabled, entityId, integrationCredentialsId, lastModifiedBy, name, triggerType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IntegrationConfigurationCreateResponse{id=$id, destination=$destination, entityType=$entityType, version=$version, authorized=$authorized, configData=$configData, createdBy=$createdBy, destinationId=$destinationId, dtCreated=$dtCreated, dtLastModified=$dtLastModified, enabled=$enabled, entityId=$entityId, integrationCredentialsId=$integrationCredentialsId, lastModifiedBy=$lastModifiedBy, name=$name, triggerType=$triggerType, additionalProperties=$additionalProperties}"
}
