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
import com.m3ter.core.checkRequired
import com.m3ter.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

class ExternalMappingResponse
private constructor(
    private val id: JsonField<String>,
    private val externalId: JsonField<String>,
    private val externalSystem: JsonField<String>,
    private val externalTable: JsonField<String>,
    private val m3terEntity: JsonField<String>,
    private val m3terId: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val integrationConfigId: JsonField<String>,
    private val lastModifiedBy: JsonField<String>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalId")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalSystem")
        @ExcludeMissing
        externalSystem: JsonField<String> = JsonMissing.of(),
        @JsonProperty("externalTable")
        @ExcludeMissing
        externalTable: JsonField<String> = JsonMissing.of(),
        @JsonProperty("m3terEntity")
        @ExcludeMissing
        m3terEntity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("m3terId") @ExcludeMissing m3terId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("integrationConfigId")
        @ExcludeMissing
        integrationConfigId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        externalId,
        externalSystem,
        externalTable,
        m3terEntity,
        m3terId,
        createdBy,
        dtCreated,
        dtLastModified,
        integrationConfigId,
        lastModifiedBy,
        version,
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
     * The unique identifier (UUID) of the entity in the external system.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalId(): String = externalId.getRequired("externalId")

    /**
     * The name of the external system where the entity you are mapping resides.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalSystem(): String = externalSystem.getRequired("externalSystem")

    /**
     * The name of the table in the external system where the entity resides.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalTable(): String = externalTable.getRequired("externalTable")

    /**
     * The name of the m3ter entity that is part of the External Mapping. For example, this could be
     * "Account".
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun m3terEntity(): String = m3terEntity.getRequired("m3terEntity")

    /**
     * The unique identifier (UUID) of the m3ter entity.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun m3terId(): String = m3terId.getRequired("m3terId")

    /**
     * The ID of the user who created this item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

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
     * UUID of the configuration this mapping is for
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun integrationConfigId(): Optional<String> =
        integrationConfigId.getOptional("integrationConfigId")

    /**
     * The ID of the user who last modified this item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<Long> = version.getOptional("version")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalId") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [externalSystem].
     *
     * Unlike [externalSystem], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalSystem")
    @ExcludeMissing
    fun _externalSystem(): JsonField<String> = externalSystem

    /**
     * Returns the raw JSON value of [externalTable].
     *
     * Unlike [externalTable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("externalTable")
    @ExcludeMissing
    fun _externalTable(): JsonField<String> = externalTable

    /**
     * Returns the raw JSON value of [m3terEntity].
     *
     * Unlike [m3terEntity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("m3terEntity") @ExcludeMissing fun _m3terEntity(): JsonField<String> = m3terEntity

    /**
     * Returns the raw JSON value of [m3terId].
     *
     * Unlike [m3terId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("m3terId") @ExcludeMissing fun _m3terId(): JsonField<String> = m3terId

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

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
     * Returns the raw JSON value of [integrationConfigId].
     *
     * Unlike [integrationConfigId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("integrationConfigId")
    @ExcludeMissing
    fun _integrationConfigId(): JsonField<String> = integrationConfigId

    /**
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

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
         * Returns a mutable builder for constructing an instance of [ExternalMappingResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .externalId()
         * .externalSystem()
         * .externalTable()
         * .m3terEntity()
         * .m3terId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalMappingResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var externalId: JsonField<String>? = null
        private var externalSystem: JsonField<String>? = null
        private var externalTable: JsonField<String>? = null
        private var m3terEntity: JsonField<String>? = null
        private var m3terId: JsonField<String>? = null
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var integrationConfigId: JsonField<String> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalMappingResponse: ExternalMappingResponse) = apply {
            id = externalMappingResponse.id
            externalId = externalMappingResponse.externalId
            externalSystem = externalMappingResponse.externalSystem
            externalTable = externalMappingResponse.externalTable
            m3terEntity = externalMappingResponse.m3terEntity
            m3terId = externalMappingResponse.m3terId
            createdBy = externalMappingResponse.createdBy
            dtCreated = externalMappingResponse.dtCreated
            dtLastModified = externalMappingResponse.dtLastModified
            integrationConfigId = externalMappingResponse.integrationConfigId
            lastModifiedBy = externalMappingResponse.lastModifiedBy
            version = externalMappingResponse.version
            additionalProperties = externalMappingResponse.additionalProperties.toMutableMap()
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

        /** The unique identifier (UUID) of the entity in the external system. */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /** The name of the external system where the entity you are mapping resides. */
        fun externalSystem(externalSystem: String) = externalSystem(JsonField.of(externalSystem))

        /**
         * Sets [Builder.externalSystem] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalSystem] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalSystem(externalSystem: JsonField<String>) = apply {
            this.externalSystem = externalSystem
        }

        /** The name of the table in the external system where the entity resides. */
        fun externalTable(externalTable: String) = externalTable(JsonField.of(externalTable))

        /**
         * Sets [Builder.externalTable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalTable] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalTable(externalTable: JsonField<String>) = apply {
            this.externalTable = externalTable
        }

        /**
         * The name of the m3ter entity that is part of the External Mapping. For example, this
         * could be "Account".
         */
        fun m3terEntity(m3terEntity: String) = m3terEntity(JsonField.of(m3terEntity))

        /**
         * Sets [Builder.m3terEntity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m3terEntity] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun m3terEntity(m3terEntity: JsonField<String>) = apply { this.m3terEntity = m3terEntity }

        /** The unique identifier (UUID) of the m3ter entity. */
        fun m3terId(m3terId: String) = m3terId(JsonField.of(m3terId))

        /**
         * Sets [Builder.m3terId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m3terId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun m3terId(m3terId: JsonField<String>) = apply { this.m3terId = m3terId }

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

        /** UUID of the configuration this mapping is for */
        fun integrationConfigId(integrationConfigId: String) =
            integrationConfigId(JsonField.of(integrationConfigId))

        /**
         * Sets [Builder.integrationConfigId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.integrationConfigId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun integrationConfigId(integrationConfigId: JsonField<String>) = apply {
            this.integrationConfigId = integrationConfigId
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
         * Returns an immutable instance of [ExternalMappingResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .externalId()
         * .externalSystem()
         * .externalTable()
         * .m3terEntity()
         * .m3terId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalMappingResponse =
            ExternalMappingResponse(
                checkRequired("id", id),
                checkRequired("externalId", externalId),
                checkRequired("externalSystem", externalSystem),
                checkRequired("externalTable", externalTable),
                checkRequired("m3terEntity", m3terEntity),
                checkRequired("m3terId", m3terId),
                createdBy,
                dtCreated,
                dtLastModified,
                integrationConfigId,
                lastModifiedBy,
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ExternalMappingResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        externalId()
        externalSystem()
        externalTable()
        m3terEntity()
        m3terId()
        createdBy()
        dtCreated()
        dtLastModified()
        integrationConfigId()
        lastModifiedBy()
        version()
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
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (if (externalSystem.asKnown().isPresent) 1 else 0) +
            (if (externalTable.asKnown().isPresent) 1 else 0) +
            (if (m3terEntity.asKnown().isPresent) 1 else 0) +
            (if (m3terId.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (integrationConfigId.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalMappingResponse && id == other.id && externalId == other.externalId && externalSystem == other.externalSystem && externalTable == other.externalTable && m3terEntity == other.m3terEntity && m3terId == other.m3terId && createdBy == other.createdBy && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && integrationConfigId == other.integrationConfigId && lastModifiedBy == other.lastModifiedBy && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, externalId, externalSystem, externalTable, m3terEntity, m3terId, createdBy, dtCreated, dtLastModified, integrationConfigId, lastModifiedBy, version, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExternalMappingResponse{id=$id, externalId=$externalId, externalSystem=$externalSystem, externalTable=$externalTable, m3terEntity=$m3terEntity, m3terId=$m3terId, createdBy=$createdBy, dtCreated=$dtCreated, dtLastModified=$dtLastModified, integrationConfigId=$integrationConfigId, lastModifiedBy=$lastModifiedBy, version=$version, additionalProperties=$additionalProperties}"
}
