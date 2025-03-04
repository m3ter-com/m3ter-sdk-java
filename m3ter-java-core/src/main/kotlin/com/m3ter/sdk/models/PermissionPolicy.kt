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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class PermissionPolicy
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
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
    @JsonProperty("managedPolicy")
    @ExcludeMissing
    private val managedPolicy: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("permissionPolicy")
    @ExcludeMissing
    private val permissionPolicy: JsonField<List<PermissionStatement>> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The unique identifier (UUID) for this Permission Policy. */
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /** The unique identifier (UUID) of the user who created this Permission Policy. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** The date and time _(in ISO-8601 format)_ when the Permission Policy was created. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The date and time _(in ISO-8601 format)_ when the Permission Policy was last modified. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The unique identifier (UUID) of the user who last modified this Permission Policy. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** Indicates whether this is a system generated Managed Permission Policy. */
    fun managedPolicy(): Optional<Boolean> =
        Optional.ofNullable(managedPolicy.getNullable("managedPolicy"))

    /** The name of the Permission Policy. */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** Array containing the Permission Policies information. */
    fun permissionPolicy(): Optional<List<PermissionStatement>> =
        Optional.ofNullable(permissionPolicy.getNullable("permissionPolicy"))

    /** The version number. Default value when newly created is one. */
    fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

    /** The unique identifier (UUID) for this Permission Policy. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The unique identifier (UUID) of the user who created this Permission Policy. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** The date and time _(in ISO-8601 format)_ when the Permission Policy was created. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The date and time _(in ISO-8601 format)_ when the Permission Policy was last modified. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** The unique identifier (UUID) of the user who last modified this Permission Policy. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /** Indicates whether this is a system generated Managed Permission Policy. */
    @JsonProperty("managedPolicy")
    @ExcludeMissing
    fun _managedPolicy(): JsonField<Boolean> = managedPolicy

    /** The name of the Permission Policy. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** Array containing the Permission Policies information. */
    @JsonProperty("permissionPolicy")
    @ExcludeMissing
    fun _permissionPolicy(): JsonField<List<PermissionStatement>> = permissionPolicy

    /** The version number. Default value when newly created is one. */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PermissionPolicy = apply {
        if (validated) {
            return@apply
        }

        id()
        createdBy()
        dtCreated()
        dtLastModified()
        lastModifiedBy()
        managedPolicy()
        name()
        permissionPolicy().ifPresent { it.forEach { it.validate() } }
        version()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PermissionPolicy]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var managedPolicy: JsonField<Boolean> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var permissionPolicy: JsonField<MutableList<PermissionStatement>>? = null
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(permissionPolicy: PermissionPolicy) = apply {
            id = permissionPolicy.id
            createdBy = permissionPolicy.createdBy
            dtCreated = permissionPolicy.dtCreated
            dtLastModified = permissionPolicy.dtLastModified
            lastModifiedBy = permissionPolicy.lastModifiedBy
            managedPolicy = permissionPolicy.managedPolicy
            name = permissionPolicy.name
            this.permissionPolicy = permissionPolicy.permissionPolicy.map { it.toMutableList() }
            version = permissionPolicy.version
            additionalProperties = permissionPolicy.additionalProperties.toMutableMap()
        }

        /** The unique identifier (UUID) for this Permission Policy. */
        fun id(id: String) = id(JsonField.of(id))

        /** The unique identifier (UUID) for this Permission Policy. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The unique identifier (UUID) of the user who created this Permission Policy. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The unique identifier (UUID) of the user who created this Permission Policy. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The date and time _(in ISO-8601 format)_ when the Permission Policy was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The date and time _(in ISO-8601 format)_ when the Permission Policy was created. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /**
         * The date and time _(in ISO-8601 format)_ when the Permission Policy was last modified.
         */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /**
         * The date and time _(in ISO-8601 format)_ when the Permission Policy was last modified.
         */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The unique identifier (UUID) of the user who last modified this Permission Policy. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The unique identifier (UUID) of the user who last modified this Permission Policy. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /** Indicates whether this is a system generated Managed Permission Policy. */
        fun managedPolicy(managedPolicy: Boolean) = managedPolicy(JsonField.of(managedPolicy))

        /** Indicates whether this is a system generated Managed Permission Policy. */
        fun managedPolicy(managedPolicy: JsonField<Boolean>) = apply {
            this.managedPolicy = managedPolicy
        }

        /** The name of the Permission Policy. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the Permission Policy. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Array containing the Permission Policies information. */
        fun permissionPolicy(permissionPolicy: List<PermissionStatement>) =
            permissionPolicy(JsonField.of(permissionPolicy))

        /** Array containing the Permission Policies information. */
        fun permissionPolicy(permissionPolicy: JsonField<List<PermissionStatement>>) = apply {
            this.permissionPolicy = permissionPolicy.map { it.toMutableList() }
        }

        /** Array containing the Permission Policies information. */
        fun addPermissionPolicy(permissionPolicy: PermissionStatement) = apply {
            this.permissionPolicy =
                (this.permissionPolicy ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(permissionPolicy)
                }
        }

        /** The version number. Default value when newly created is one. */
        fun version(version: Long) = version(JsonField.of(version))

        /** The version number. Default value when newly created is one. */
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

        fun build(): PermissionPolicy =
            PermissionPolicy(
                id,
                createdBy,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                managedPolicy,
                name,
                (permissionPolicy ?: JsonMissing.of()).map { it.toImmutable() },
                version,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PermissionPolicy && id == other.id && createdBy == other.createdBy && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && managedPolicy == other.managedPolicy && name == other.name && permissionPolicy == other.permissionPolicy && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdBy, dtCreated, dtLastModified, lastModifiedBy, managedPolicy, name, permissionPolicy, version, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PermissionPolicy{id=$id, createdBy=$createdBy, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, managedPolicy=$managedPolicy, name=$name, permissionPolicy=$permissionPolicy, version=$version, additionalProperties=$additionalProperties}"
}
