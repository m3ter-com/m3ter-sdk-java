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
class ExternalMapping
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("externalId")
    @ExcludeMissing
    private val externalId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("externalSystem")
    @ExcludeMissing
    private val externalSystem: JsonField<String> = JsonMissing.of(),
    @JsonProperty("externalTable")
    @ExcludeMissing
    private val externalTable: JsonField<String> = JsonMissing.of(),
    @JsonProperty("m3terEntity")
    @ExcludeMissing
    private val m3terEntity: JsonField<String> = JsonMissing.of(),
    @JsonProperty("m3terId")
    @ExcludeMissing
    private val m3terId: JsonField<String> = JsonMissing.of(),
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
    @JsonProperty("integrationConfigId")
    @ExcludeMissing
    private val integrationConfigId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The UUID of the entity. */
    fun id(): String = id.getRequired("id")

    /** The unique identifier (UUID) of the entity in the external system. */
    fun externalId(): String = externalId.getRequired("externalId")

    /** The name of the external system where the entity you are mapping resides. */
    fun externalSystem(): String = externalSystem.getRequired("externalSystem")

    /** The name of the table in the external system where the entity resides. */
    fun externalTable(): String = externalTable.getRequired("externalTable")

    /**
     * The name of the m3ter entity that is part of the External Mapping. For example, this could be
     * "Account".
     */
    fun m3terEntity(): String = m3terEntity.getRequired("m3terEntity")

    /** The unique identifier (UUID) of the m3ter entity. */
    fun m3terId(): String = m3terId.getRequired("m3terId")

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

    /** UUID of the configuration this mapping is for */
    fun integrationConfigId(): Optional<String> =
        Optional.ofNullable(integrationConfigId.getNullable("integrationConfigId"))

    /** The ID of the user who last modified this item. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The unique identifier (UUID) of the entity in the external system. */
    @JsonProperty("externalId") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /** The name of the external system where the entity you are mapping resides. */
    @JsonProperty("externalSystem")
    @ExcludeMissing
    fun _externalSystem(): JsonField<String> = externalSystem

    /** The name of the table in the external system where the entity resides. */
    @JsonProperty("externalTable")
    @ExcludeMissing
    fun _externalTable(): JsonField<String> = externalTable

    /**
     * The name of the m3ter entity that is part of the External Mapping. For example, this could be
     * "Account".
     */
    @JsonProperty("m3terEntity") @ExcludeMissing fun _m3terEntity(): JsonField<String> = m3terEntity

    /** The unique identifier (UUID) of the m3ter entity. */
    @JsonProperty("m3terId") @ExcludeMissing fun _m3terId(): JsonField<String> = m3terId

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

    /** UUID of the configuration this mapping is for */
    @JsonProperty("integrationConfigId")
    @ExcludeMissing
    fun _integrationConfigId(): JsonField<String> = integrationConfigId

    /** The ID of the user who last modified this item. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ExternalMapping = apply {
        if (validated) {
            return@apply
        }

        id()
        externalId()
        externalSystem()
        externalTable()
        m3terEntity()
        m3terId()
        version()
        createdBy()
        dtCreated()
        dtLastModified()
        integrationConfigId()
        lastModifiedBy()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalMapping].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .externalId()
         * .externalSystem()
         * .externalTable()
         * .m3terEntity()
         * .m3terId()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalMapping]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var externalId: JsonField<String>? = null
        private var externalSystem: JsonField<String>? = null
        private var externalTable: JsonField<String>? = null
        private var m3terEntity: JsonField<String>? = null
        private var m3terId: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var integrationConfigId: JsonField<String> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalMapping: ExternalMapping) = apply {
            id = externalMapping.id
            externalId = externalMapping.externalId
            externalSystem = externalMapping.externalSystem
            externalTable = externalMapping.externalTable
            m3terEntity = externalMapping.m3terEntity
            m3terId = externalMapping.m3terId
            version = externalMapping.version
            createdBy = externalMapping.createdBy
            dtCreated = externalMapping.dtCreated
            dtLastModified = externalMapping.dtLastModified
            integrationConfigId = externalMapping.integrationConfigId
            lastModifiedBy = externalMapping.lastModifiedBy
            additionalProperties = externalMapping.additionalProperties.toMutableMap()
        }

        /** The UUID of the entity. */
        fun id(id: String) = id(JsonField.of(id))

        /** The UUID of the entity. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The unique identifier (UUID) of the entity in the external system. */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /** The unique identifier (UUID) of the entity in the external system. */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /** The name of the external system where the entity you are mapping resides. */
        fun externalSystem(externalSystem: String) = externalSystem(JsonField.of(externalSystem))

        /** The name of the external system where the entity you are mapping resides. */
        fun externalSystem(externalSystem: JsonField<String>) = apply {
            this.externalSystem = externalSystem
        }

        /** The name of the table in the external system where the entity resides. */
        fun externalTable(externalTable: String) = externalTable(JsonField.of(externalTable))

        /** The name of the table in the external system where the entity resides. */
        fun externalTable(externalTable: JsonField<String>) = apply {
            this.externalTable = externalTable
        }

        /**
         * The name of the m3ter entity that is part of the External Mapping. For example, this
         * could be "Account".
         */
        fun m3terEntity(m3terEntity: String) = m3terEntity(JsonField.of(m3terEntity))

        /**
         * The name of the m3ter entity that is part of the External Mapping. For example, this
         * could be "Account".
         */
        fun m3terEntity(m3terEntity: JsonField<String>) = apply { this.m3terEntity = m3terEntity }

        /** The unique identifier (UUID) of the m3ter entity. */
        fun m3terId(m3terId: String) = m3terId(JsonField.of(m3terId))

        /** The unique identifier (UUID) of the m3ter entity. */
        fun m3terId(m3terId: JsonField<String>) = apply { this.m3terId = m3terId }

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

        /** UUID of the configuration this mapping is for */
        fun integrationConfigId(integrationConfigId: String) =
            integrationConfigId(JsonField.of(integrationConfigId))

        /** UUID of the configuration this mapping is for */
        fun integrationConfigId(integrationConfigId: JsonField<String>) = apply {
            this.integrationConfigId = integrationConfigId
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

        fun build(): ExternalMapping =
            ExternalMapping(
                checkRequired("id", id),
                checkRequired("externalId", externalId),
                checkRequired("externalSystem", externalSystem),
                checkRequired("externalTable", externalTable),
                checkRequired("m3terEntity", m3terEntity),
                checkRequired("m3terId", m3terId),
                checkRequired("version", version),
                createdBy,
                dtCreated,
                dtLastModified,
                integrationConfigId,
                lastModifiedBy,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalMapping && id == other.id && externalId == other.externalId && externalSystem == other.externalSystem && externalTable == other.externalTable && m3terEntity == other.m3terEntity && m3terId == other.m3terId && version == other.version && createdBy == other.createdBy && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && integrationConfigId == other.integrationConfigId && lastModifiedBy == other.lastModifiedBy && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, externalId, externalSystem, externalTable, m3terEntity, m3terId, version, createdBy, dtCreated, dtLastModified, integrationConfigId, lastModifiedBy, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalMapping{id=$id, externalId=$externalId, externalSystem=$externalSystem, externalTable=$externalTable, m3terEntity=$m3terEntity, m3terId=$m3terId, version=$version, createdBy=$createdBy, dtCreated=$dtCreated, dtLastModified=$dtLastModified, integrationConfigId=$integrationConfigId, lastModifiedBy=$lastModifiedBy, additionalProperties=$additionalProperties}"
}
