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
class ResourceGroupResponse
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
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The unique identifier (UUID) of the Resource Group. */
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /** The unique identifier (UUID) of the user who created this Resource Group. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** The date and time _(in ISO-8601 format)_ when the Resource Group was created. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The date and time _(in ISO-8601 format)_ when the Resource Group was last modified. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The unique identifier (UUID) of the user who last modified this Resource Group. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** The name of the Resource Group. */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** The version number. Default value when newly created is one. */
    fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

    /** The unique identifier (UUID) of the Resource Group. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The unique identifier (UUID) of the user who created this Resource Group. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** The date and time _(in ISO-8601 format)_ when the Resource Group was created. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The date and time _(in ISO-8601 format)_ when the Resource Group was last modified. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** The unique identifier (UUID) of the user who last modified this Resource Group. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /** The name of the Resource Group. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** The version number. Default value when newly created is one. */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ResourceGroupResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdBy()
        dtCreated()
        dtLastModified()
        lastModifiedBy()
        name()
        version()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [ResourceGroupResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ResourceGroupResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(resourceGroupResponse: ResourceGroupResponse) = apply {
            id = resourceGroupResponse.id
            createdBy = resourceGroupResponse.createdBy
            dtCreated = resourceGroupResponse.dtCreated
            dtLastModified = resourceGroupResponse.dtLastModified
            lastModifiedBy = resourceGroupResponse.lastModifiedBy
            name = resourceGroupResponse.name
            version = resourceGroupResponse.version
            additionalProperties = resourceGroupResponse.additionalProperties.toMutableMap()
        }

        /** The unique identifier (UUID) of the Resource Group. */
        fun id(id: String) = id(JsonField.of(id))

        /** The unique identifier (UUID) of the Resource Group. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The unique identifier (UUID) of the user who created this Resource Group. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The unique identifier (UUID) of the user who created this Resource Group. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The date and time _(in ISO-8601 format)_ when the Resource Group was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The date and time _(in ISO-8601 format)_ when the Resource Group was created. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The date and time _(in ISO-8601 format)_ when the Resource Group was last modified. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The date and time _(in ISO-8601 format)_ when the Resource Group was last modified. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The unique identifier (UUID) of the user who last modified this Resource Group. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The unique identifier (UUID) of the user who last modified this Resource Group. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /** The name of the Resource Group. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the Resource Group. */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun build(): ResourceGroupResponse =
            ResourceGroupResponse(
                id,
                createdBy,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                name,
                version,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ResourceGroupResponse && id == other.id && createdBy == other.createdBy && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && name == other.name && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdBy, dtCreated, dtLastModified, lastModifiedBy, name, version, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ResourceGroupResponse{id=$id, createdBy=$createdBy, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, name=$name, version=$version, additionalProperties=$additionalProperties}"
}
