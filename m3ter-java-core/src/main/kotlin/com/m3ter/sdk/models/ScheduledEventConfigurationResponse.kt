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
class ScheduledEventConfigurationResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("entity")
    @ExcludeMissing
    private val entity: JsonField<String> = JsonMissing.of(),
    @JsonProperty("field") @ExcludeMissing private val field: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("offset") @ExcludeMissing private val offset: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The UUID of the entity. */
    fun id(): String = id.getRequired("id")

    /**
     * The referenced configuration or billing entity for which the desired scheduled Event will
     * trigger.
     */
    fun entity(): String = entity.getRequired("entity")

    /**
     * A DateTime field for which the desired scheduled Event will trigger - this must be a DateTime
     * field on the referenced billing or configuration entity.
     */
    fun field(): String = field.getRequired("field")

    /** The name of the custom Scheduled Event Configuration. */
    fun name(): String = name.getRequired("name")

    /**
     * The offset in days from the specified DateTime field on the referenced entity when the
     * scheduled Event will trigger.
     */
    fun offset(): Long = offset.getRequired("offset")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    fun version(): Long = version.getRequired("version")

    /** The ID of the user who created this item. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** The DateTime when this item was created _(in ISO-8601 format)_. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The ID of the user who last modified this item. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The referenced configuration or billing entity for which the desired scheduled Event will
     * trigger.
     */
    @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<String> = entity

    /**
     * A DateTime field for which the desired scheduled Event will trigger - this must be a DateTime
     * field on the referenced billing or configuration entity.
     */
    @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<String> = field

    /** The name of the custom Scheduled Event Configuration. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * The offset in days from the specified DateTime field on the referenced entity when the
     * scheduled Event will trigger.
     */
    @JsonProperty("offset") @ExcludeMissing fun _offset(): JsonField<Long> = offset

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

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

    /** The ID of the user who last modified this item. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ScheduledEventConfigurationResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        entity()
        field()
        name()
        offset()
        version()
        createdBy()
        dtCreated()
        dtLastModified()
        lastModifiedBy()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ScheduledEventConfigurationResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .entity()
         * .field()
         * .name()
         * .offset()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ScheduledEventConfigurationResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var entity: JsonField<String>? = null
        private var field: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var offset: JsonField<Long>? = null
        private var version: JsonField<Long>? = null
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            scheduledEventConfigurationResponse: ScheduledEventConfigurationResponse
        ) = apply {
            id = scheduledEventConfigurationResponse.id
            entity = scheduledEventConfigurationResponse.entity
            field = scheduledEventConfigurationResponse.field
            name = scheduledEventConfigurationResponse.name
            offset = scheduledEventConfigurationResponse.offset
            version = scheduledEventConfigurationResponse.version
            createdBy = scheduledEventConfigurationResponse.createdBy
            dtCreated = scheduledEventConfigurationResponse.dtCreated
            dtLastModified = scheduledEventConfigurationResponse.dtLastModified
            lastModifiedBy = scheduledEventConfigurationResponse.lastModifiedBy
            additionalProperties =
                scheduledEventConfigurationResponse.additionalProperties.toMutableMap()
        }

        /** The UUID of the entity. */
        fun id(id: String) = id(JsonField.of(id))

        /** The UUID of the entity. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The referenced configuration or billing entity for which the desired scheduled Event will
         * trigger.
         */
        fun entity(entity: String) = entity(JsonField.of(entity))

        /**
         * The referenced configuration or billing entity for which the desired scheduled Event will
         * trigger.
         */
        fun entity(entity: JsonField<String>) = apply { this.entity = entity }

        /**
         * A DateTime field for which the desired scheduled Event will trigger - this must be a
         * DateTime field on the referenced billing or configuration entity.
         */
        fun field(field: String) = field(JsonField.of(field))

        /**
         * A DateTime field for which the desired scheduled Event will trigger - this must be a
         * DateTime field on the referenced billing or configuration entity.
         */
        fun field(field: JsonField<String>) = apply { this.field = field }

        /** The name of the custom Scheduled Event Configuration. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the custom Scheduled Event Configuration. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The offset in days from the specified DateTime field on the referenced entity when the
         * scheduled Event will trigger.
         */
        fun offset(offset: Long) = offset(JsonField.of(offset))

        /**
         * The offset in days from the specified DateTime field on the referenced entity when the
         * scheduled Event will trigger.
         */
        fun offset(offset: JsonField<Long>) = apply { this.offset = offset }

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

        fun build(): ScheduledEventConfigurationResponse =
            ScheduledEventConfigurationResponse(
                checkRequired("id", id),
                checkRequired("entity", entity),
                checkRequired("field", field),
                checkRequired("name", name),
                checkRequired("offset", offset),
                checkRequired("version", version),
                createdBy,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ScheduledEventConfigurationResponse && id == other.id && entity == other.entity && field == other.field && name == other.name && offset == other.offset && version == other.version && createdBy == other.createdBy && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, entity, field, name, offset, version, createdBy, dtCreated, dtLastModified, lastModifiedBy, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ScheduledEventConfigurationResponse{id=$id, entity=$entity, field=$field, name=$name, offset=$offset, version=$version, createdBy=$createdBy, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, additionalProperties=$additionalProperties}"
}
