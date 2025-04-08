// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.core.Enum
import com.m3ter.core.ExcludeMissing
import com.m3ter.core.JsonField
import com.m3ter.core.JsonMissing
import com.m3ter.core.JsonValue
import com.m3ter.core.checkRequired
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class IntegrationConfigurationEnableResponse
private constructor(
    private val id: JsonField<String>,
    private val destination: JsonField<String>,
    private val entityType: JsonField<String>,
    private val version: JsonField<Long>,
    private val authorized: JsonField<Boolean>,
    private val configData: JsonField<ConfigData>,
    private val createdBy: JsonField<String>,
    private val destinationId: JsonField<String>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val enabled: JsonField<Boolean>,
    private val entityId: JsonField<String>,
    private val integrationCredentialsId: JsonField<String>,
    private val lastModifiedBy: JsonField<String>,
    private val name: JsonField<String>,
    private val triggerType: JsonField<TriggerType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destination")
        @ExcludeMissing
        destination: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entityType")
        @ExcludeMissing
        entityType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("authorized")
        @ExcludeMissing
        authorized: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("configData")
        @ExcludeMissing
        configData: JsonField<ConfigData> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destinationId")
        @ExcludeMissing
        destinationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("entityId") @ExcludeMissing entityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("integrationCredentialsId")
        @ExcludeMissing
        integrationCredentialsId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("triggerType")
        @ExcludeMissing
        triggerType: JsonField<TriggerType> = JsonMissing.of(),
    ) : this(
        id,
        destination,
        entityType,
        version,
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
        mutableMapOf(),
    )

    /**
     * The UUID of the entity.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The type of destination _(e.g. Netsuite, webhooks)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun destination(): String = destination.getRequired("destination")

    /**
     * The type of entity the integration is for _(e.g. Bill)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entityType(): String = entityType.getRequired("entityType")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Long = version.getRequired("version")

    /**
     * A flag indicating whether the integration configuration is authorized.
     * - TRUE - authorized.
     * - FALSE - not authorized.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorized(): Optional<Boolean> = authorized.getOptional("authorized")

    /**
     * Configuration data for the integration
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun configData(): Optional<ConfigData> = configData.getOptional("configData")

    /**
     * The ID of the user who created this item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * The unique identifier (UUID) of the entity the integration is for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun destinationId(): Optional<String> = destinationId.getOptional("destinationId")

    /**
     * The DateTime when this item was created _(in ISO-8601 format)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The DateTime when this item was last modified _(in ISO-8601 format)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * A flag indicating whether the integration configuration is currently enabled or disabled.
     * - TRUE - enabled.
     * - FALSE - disabled.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun enabled(): Optional<Boolean> = enabled.getOptional("enabled")

    /**
     * The unique identifier (UUID) of the entity this integration is for _(e.g. the ID of a
     * notification configuration. Optional.)_
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entityId(): Optional<String> = entityId.getOptional("entityId")

    /**
     * UUID of the credentials to use for this integration
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun integrationCredentialsId(): Optional<String> =
        integrationCredentialsId.getOptional("integrationCredentialsId")

    /**
     * The ID of the user who last modified this item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * The name of the configuration
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Specifies the type of trigger for the integration.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun triggerType(): Optional<TriggerType> = triggerType.getOptional("triggerType")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destination") @ExcludeMissing fun _destination(): JsonField<String> = destination

    /**
     * Returns the raw JSON value of [entityType].
     *
     * Unlike [entityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entityType") @ExcludeMissing fun _entityType(): JsonField<String> = entityType

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /**
     * Returns the raw JSON value of [authorized].
     *
     * Unlike [authorized], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("authorized") @ExcludeMissing fun _authorized(): JsonField<Boolean> = authorized

    /**
     * Returns the raw JSON value of [configData].
     *
     * Unlike [configData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("configData")
    @ExcludeMissing
    fun _configData(): JsonField<ConfigData> = configData

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [destinationId].
     *
     * Unlike [destinationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destinationId")
    @ExcludeMissing
    fun _destinationId(): JsonField<String> = destinationId

    /**
     * Returns the raw JSON value of [dtCreated].
     *
     * Unlike [dtCreated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /**
     * Returns the raw JSON value of [dtLastModified].
     *
     * Unlike [dtLastModified], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /**
     * Returns the raw JSON value of [enabled].
     *
     * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * Returns the raw JSON value of [entityId].
     *
     * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entityId") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

    /**
     * Returns the raw JSON value of [integrationCredentialsId].
     *
     * Unlike [integrationCredentialsId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("integrationCredentialsId")
    @ExcludeMissing
    fun _integrationCredentialsId(): JsonField<String> = integrationCredentialsId

    /**
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [triggerType].
     *
     * Unlike [triggerType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("triggerType")
    @ExcludeMissing
    fun _triggerType(): JsonField<TriggerType> = triggerType

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [IntegrationConfigurationEnableResponse].
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

    /** A builder for [IntegrationConfigurationEnableResponse]. */
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
            integrationConfigurationEnableResponse: IntegrationConfigurationEnableResponse
        ) = apply {
            id = integrationConfigurationEnableResponse.id
            destination = integrationConfigurationEnableResponse.destination
            entityType = integrationConfigurationEnableResponse.entityType
            version = integrationConfigurationEnableResponse.version
            authorized = integrationConfigurationEnableResponse.authorized
            configData = integrationConfigurationEnableResponse.configData
            createdBy = integrationConfigurationEnableResponse.createdBy
            destinationId = integrationConfigurationEnableResponse.destinationId
            dtCreated = integrationConfigurationEnableResponse.dtCreated
            dtLastModified = integrationConfigurationEnableResponse.dtLastModified
            enabled = integrationConfigurationEnableResponse.enabled
            entityId = integrationConfigurationEnableResponse.entityId
            integrationCredentialsId =
                integrationConfigurationEnableResponse.integrationCredentialsId
            lastModifiedBy = integrationConfigurationEnableResponse.lastModifiedBy
            name = integrationConfigurationEnableResponse.name
            triggerType = integrationConfigurationEnableResponse.triggerType
            additionalProperties =
                integrationConfigurationEnableResponse.additionalProperties.toMutableMap()
        }

        /** The UUID of the entity. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The type of destination _(e.g. Netsuite, webhooks)_. */
        fun destination(destination: String) = destination(JsonField.of(destination))

        /**
         * Sets [Builder.destination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destination] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun destination(destination: JsonField<String>) = apply { this.destination = destination }

        /** The type of entity the integration is for _(e.g. Bill)_. */
        fun entityType(entityType: String) = entityType(JsonField.of(entityType))

        /**
         * Sets [Builder.entityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun entityType(entityType: JsonField<String>) = apply { this.entityType = entityType }

        /**
         * The version number:
         * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
         *   response.
         * - **Update:** On successful Update, the version is incremented by 1 in the response.
         */
        fun version(version: Long) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<Long>) = apply { this.version = version }

        /**
         * A flag indicating whether the integration configuration is authorized.
         * - TRUE - authorized.
         * - FALSE - not authorized.
         */
        fun authorized(authorized: Boolean) = authorized(JsonField.of(authorized))

        /**
         * Sets [Builder.authorized] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorized] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun authorized(authorized: JsonField<Boolean>) = apply { this.authorized = authorized }

        /** Configuration data for the integration */
        fun configData(configData: ConfigData) = configData(JsonField.of(configData))

        /**
         * Sets [Builder.configData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.configData] with a well-typed [ConfigData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun configData(configData: JsonField<ConfigData>) = apply { this.configData = configData }

        /** The ID of the user who created this item. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The unique identifier (UUID) of the entity the integration is for. */
        fun destinationId(destinationId: String) = destinationId(JsonField.of(destinationId))

        /**
         * Sets [Builder.destinationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun destinationId(destinationId: JsonField<String>) = apply {
            this.destinationId = destinationId
        }

        /** The DateTime when this item was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /**
         * Sets [Builder.dtLastModified] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtLastModified] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Sets [Builder.enabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /**
         * The unique identifier (UUID) of the entity this integration is for _(e.g. the ID of a
         * notification configuration. Optional.)_
         */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /**
         * Sets [Builder.entityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /** UUID of the credentials to use for this integration */
        fun integrationCredentialsId(integrationCredentialsId: String) =
            integrationCredentialsId(JsonField.of(integrationCredentialsId))

        /**
         * Sets [Builder.integrationCredentialsId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrationCredentialsId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun integrationCredentialsId(integrationCredentialsId: JsonField<String>) = apply {
            this.integrationCredentialsId = integrationCredentialsId
        }

        /** The ID of the user who last modified this item. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /**
         * Sets [Builder.lastModifiedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastModifiedBy] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /** The name of the configuration */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Specifies the type of trigger for the integration. */
        @Deprecated("deprecated")
        fun triggerType(triggerType: TriggerType) = triggerType(JsonField.of(triggerType))

        /**
         * Sets [Builder.triggerType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.triggerType] with a well-typed [TriggerType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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

        /**
         * Returns an immutable instance of [IntegrationConfigurationEnableResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .destination()
         * .entityType()
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IntegrationConfigurationEnableResponse =
            IntegrationConfigurationEnableResponse(
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
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): IntegrationConfigurationEnableResponse = apply {
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
        triggerType().ifPresent { it.validate() }
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
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (destination.asKnown().isPresent) 1 else 0) +
            (if (entityType.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0) +
            (if (authorized.asKnown().isPresent) 1 else 0) +
            (configData.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (destinationId.asKnown().isPresent) 1 else 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (enabled.asKnown().isPresent) 1 else 0) +
            (if (entityId.asKnown().isPresent) 1 else 0) +
            (if (integrationCredentialsId.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (triggerType.asKnown().getOrNull()?.validity() ?: 0)

    /** Configuration data for the integration */
    class ConfigData
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

            /**
             * Returns an immutable instance of [ConfigData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ConfigData = ConfigData(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): ConfigData = apply {
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

        private var validated: Boolean = false

        fun validate(): TriggerType = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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

        return /* spotless:off */ other is IntegrationConfigurationEnableResponse && id == other.id && destination == other.destination && entityType == other.entityType && version == other.version && authorized == other.authorized && configData == other.configData && createdBy == other.createdBy && destinationId == other.destinationId && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && enabled == other.enabled && entityId == other.entityId && integrationCredentialsId == other.integrationCredentialsId && lastModifiedBy == other.lastModifiedBy && name == other.name && triggerType == other.triggerType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, destination, entityType, version, authorized, configData, createdBy, destinationId, dtCreated, dtLastModified, enabled, entityId, integrationCredentialsId, lastModifiedBy, name, triggerType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IntegrationConfigurationEnableResponse{id=$id, destination=$destination, entityType=$entityType, version=$version, authorized=$authorized, configData=$configData, createdBy=$createdBy, destinationId=$destinationId, dtCreated=$dtCreated, dtLastModified=$dtLastModified, enabled=$enabled, entityId=$entityId, integrationCredentialsId=$integrationCredentialsId, lastModifiedBy=$lastModifiedBy, name=$name, triggerType=$triggerType, additionalProperties=$additionalProperties}"
}
