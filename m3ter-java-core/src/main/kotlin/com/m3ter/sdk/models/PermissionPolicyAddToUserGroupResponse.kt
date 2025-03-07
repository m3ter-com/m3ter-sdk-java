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
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class PermissionPolicyAddToUserGroupResponse
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
    @JsonProperty("permissionPolicyId")
    @ExcludeMissing
    private val permissionPolicyId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("principalId")
    @ExcludeMissing
    private val principalId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("principalType")
    @ExcludeMissing
    private val principalType: JsonField<PrincipalType> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /** The id of the user who created this principal permission. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** The DateTime _(in ISO-8601 format)_ when the principal permission was created. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The DateTime _(in ISO-8601 format)_ when the principal permission was last modified. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The id of the user who last modified this principal permission. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    fun permissionPolicyId(): Optional<String> =
        Optional.ofNullable(permissionPolicyId.getNullable("permissionPolicyId"))

    fun principalId(): Optional<String> =
        Optional.ofNullable(principalId.getNullable("principalId"))

    fun principalType(): Optional<PrincipalType> =
        Optional.ofNullable(principalType.getNullable("principalType"))

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The id of the user who created this principal permission. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** The DateTime _(in ISO-8601 format)_ when the principal permission was created. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The DateTime _(in ISO-8601 format)_ when the principal permission was last modified. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** The id of the user who last modified this principal permission. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    @JsonProperty("permissionPolicyId")
    @ExcludeMissing
    fun _permissionPolicyId(): JsonField<String> = permissionPolicyId

    @JsonProperty("principalId") @ExcludeMissing fun _principalId(): JsonField<String> = principalId

    @JsonProperty("principalType")
    @ExcludeMissing
    fun _principalType(): JsonField<PrincipalType> = principalType

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PermissionPolicyAddToUserGroupResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdBy()
        dtCreated()
        dtLastModified()
        lastModifiedBy()
        permissionPolicyId()
        principalId()
        principalType()
        version()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PermissionPolicyAddToUserGroupResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PermissionPolicyAddToUserGroupResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var permissionPolicyId: JsonField<String> = JsonMissing.of()
        private var principalId: JsonField<String> = JsonMissing.of()
        private var principalType: JsonField<PrincipalType> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            permissionPolicyAddToUserGroupResponse: PermissionPolicyAddToUserGroupResponse
        ) = apply {
            id = permissionPolicyAddToUserGroupResponse.id
            createdBy = permissionPolicyAddToUserGroupResponse.createdBy
            dtCreated = permissionPolicyAddToUserGroupResponse.dtCreated
            dtLastModified = permissionPolicyAddToUserGroupResponse.dtLastModified
            lastModifiedBy = permissionPolicyAddToUserGroupResponse.lastModifiedBy
            permissionPolicyId = permissionPolicyAddToUserGroupResponse.permissionPolicyId
            principalId = permissionPolicyAddToUserGroupResponse.principalId
            principalType = permissionPolicyAddToUserGroupResponse.principalType
            version = permissionPolicyAddToUserGroupResponse.version
            additionalProperties =
                permissionPolicyAddToUserGroupResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The id of the user who created this principal permission. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The id of the user who created this principal permission. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The DateTime _(in ISO-8601 format)_ when the principal permission was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The DateTime _(in ISO-8601 format)_ when the principal permission was created. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime _(in ISO-8601 format)_ when the principal permission was last modified. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The DateTime _(in ISO-8601 format)_ when the principal permission was last modified. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The id of the user who last modified this principal permission. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The id of the user who last modified this principal permission. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        fun permissionPolicyId(permissionPolicyId: String) =
            permissionPolicyId(JsonField.of(permissionPolicyId))

        fun permissionPolicyId(permissionPolicyId: JsonField<String>) = apply {
            this.permissionPolicyId = permissionPolicyId
        }

        fun principalId(principalId: String) = principalId(JsonField.of(principalId))

        fun principalId(principalId: JsonField<String>) = apply { this.principalId = principalId }

        fun principalType(principalType: PrincipalType) = principalType(JsonField.of(principalType))

        fun principalType(principalType: JsonField<PrincipalType>) = apply {
            this.principalType = principalType
        }

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

        fun build(): PermissionPolicyAddToUserGroupResponse =
            PermissionPolicyAddToUserGroupResponse(
                id,
                createdBy,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                permissionPolicyId,
                principalId,
                principalType,
                version,
                additionalProperties.toImmutable(),
            )
    }

    class PrincipalType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val USER = of("USER")

            @JvmField val USERGROUP = of("USERGROUP")

            @JvmField val SERVICEUSER = of("SERVICEUSER")

            @JvmField val SUPPORTUSERS = of("SUPPORTUSERS")

            @JvmStatic fun of(value: String) = PrincipalType(JsonField.of(value))
        }

        /** An enum containing [PrincipalType]'s known values. */
        enum class Known {
            USER,
            USERGROUP,
            SERVICEUSER,
            SUPPORTUSERS,
        }

        /**
         * An enum containing [PrincipalType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PrincipalType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USER,
            USERGROUP,
            SERVICEUSER,
            SUPPORTUSERS,
            /**
             * An enum member indicating that [PrincipalType] was instantiated with an unknown
             * value.
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
                USER -> Value.USER
                USERGROUP -> Value.USERGROUP
                SERVICEUSER -> Value.SERVICEUSER
                SUPPORTUSERS -> Value.SUPPORTUSERS
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
                USER -> Known.USER
                USERGROUP -> Known.USERGROUP
                SERVICEUSER -> Known.SERVICEUSER
                SUPPORTUSERS -> Known.SUPPORTUSERS
                else -> throw M3terInvalidDataException("Unknown PrincipalType: $value")
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

            return /* spotless:off */ other is PrincipalType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PermissionPolicyAddToUserGroupResponse && id == other.id && createdBy == other.createdBy && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && permissionPolicyId == other.permissionPolicyId && principalId == other.principalId && principalType == other.principalType && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdBy, dtCreated, dtLastModified, lastModifiedBy, permissionPolicyId, principalId, principalType, version, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PermissionPolicyAddToUserGroupResponse{id=$id, createdBy=$createdBy, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, permissionPolicyId=$permissionPolicyId, principalId=$principalId, principalType=$principalType, version=$version, additionalProperties=$additionalProperties}"
}
