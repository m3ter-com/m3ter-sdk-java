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
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PermissionPolicyRemoveFromServiceUserResponse
private constructor(
    private val id: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val lastModifiedBy: JsonField<String>,
    private val permissionPolicyId: JsonField<String>,
    private val principalId: JsonField<String>,
    private val principalType: JsonField<PrincipalType>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("permissionPolicyId")
        @ExcludeMissing
        permissionPolicyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("principalId")
        @ExcludeMissing
        principalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("principalType")
        @ExcludeMissing
        principalType: JsonField<PrincipalType> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        createdBy,
        dtCreated,
        dtLastModified,
        lastModifiedBy,
        permissionPolicyId,
        principalId,
        principalType,
        version,
        mutableMapOf(),
    )

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The id of the user who created this principal permission.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * The DateTime _(in ISO-8601 format)_ when the principal permission was created.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The DateTime _(in ISO-8601 format)_ when the principal permission was last modified.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * The id of the user who last modified this principal permission.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun permissionPolicyId(): Optional<String> =
        permissionPolicyId.getOptional("permissionPolicyId")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun principalId(): Optional<String> = principalId.getOptional("principalId")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun principalType(): Optional<PrincipalType> = principalType.getOptional("principalType")

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
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Returns the raw JSON value of [permissionPolicyId].
     *
     * Unlike [permissionPolicyId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("permissionPolicyId")
    @ExcludeMissing
    fun _permissionPolicyId(): JsonField<String> = permissionPolicyId

    /**
     * Returns the raw JSON value of [principalId].
     *
     * Unlike [principalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("principalId") @ExcludeMissing fun _principalId(): JsonField<String> = principalId

    /**
     * Returns the raw JSON value of [principalType].
     *
     * Unlike [principalType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("principalType")
    @ExcludeMissing
    fun _principalType(): JsonField<PrincipalType> = principalType

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
         * Returns a mutable builder for constructing an instance of
         * [PermissionPolicyRemoveFromServiceUserResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PermissionPolicyRemoveFromServiceUserResponse]. */
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
            permissionPolicyRemoveFromServiceUserResponse:
                PermissionPolicyRemoveFromServiceUserResponse
        ) = apply {
            id = permissionPolicyRemoveFromServiceUserResponse.id
            createdBy = permissionPolicyRemoveFromServiceUserResponse.createdBy
            dtCreated = permissionPolicyRemoveFromServiceUserResponse.dtCreated
            dtLastModified = permissionPolicyRemoveFromServiceUserResponse.dtLastModified
            lastModifiedBy = permissionPolicyRemoveFromServiceUserResponse.lastModifiedBy
            permissionPolicyId = permissionPolicyRemoveFromServiceUserResponse.permissionPolicyId
            principalId = permissionPolicyRemoveFromServiceUserResponse.principalId
            principalType = permissionPolicyRemoveFromServiceUserResponse.principalType
            version = permissionPolicyRemoveFromServiceUserResponse.version
            additionalProperties =
                permissionPolicyRemoveFromServiceUserResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The id of the user who created this principal permission. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The DateTime _(in ISO-8601 format)_ when the principal permission was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime _(in ISO-8601 format)_ when the principal permission was last modified. */
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

        /** The id of the user who last modified this principal permission. */
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

        fun permissionPolicyId(permissionPolicyId: String) =
            permissionPolicyId(JsonField.of(permissionPolicyId))

        /**
         * Sets [Builder.permissionPolicyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.permissionPolicyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun permissionPolicyId(permissionPolicyId: JsonField<String>) = apply {
            this.permissionPolicyId = permissionPolicyId
        }

        fun principalId(principalId: String) = principalId(JsonField.of(principalId))

        /**
         * Sets [Builder.principalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.principalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun principalId(principalId: JsonField<String>) = apply { this.principalId = principalId }

        fun principalType(principalType: PrincipalType) = principalType(JsonField.of(principalType))

        /**
         * Sets [Builder.principalType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.principalType] with a well-typed [PrincipalType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
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
         * Returns an immutable instance of [PermissionPolicyRemoveFromServiceUserResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PermissionPolicyRemoveFromServiceUserResponse =
            PermissionPolicyRemoveFromServiceUserResponse(
                id,
                createdBy,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                permissionPolicyId,
                principalId,
                principalType,
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PermissionPolicyRemoveFromServiceUserResponse = apply {
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
        principalType().ifPresent { it.validate() }
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
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (if (permissionPolicyId.asKnown().isPresent) 1 else 0) +
            (if (principalId.asKnown().isPresent) 1 else 0) +
            (principalType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (version.asKnown().isPresent) 1 else 0)

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

        private var validated: Boolean = false

        fun validate(): PrincipalType = apply {
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

            return /* spotless:off */ other is PrincipalType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PermissionPolicyRemoveFromServiceUserResponse && id == other.id && createdBy == other.createdBy && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && permissionPolicyId == other.permissionPolicyId && principalId == other.principalId && principalType == other.principalType && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdBy, dtCreated, dtLastModified, lastModifiedBy, permissionPolicyId, principalId, principalType, version, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PermissionPolicyRemoveFromServiceUserResponse{id=$id, createdBy=$createdBy, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, permissionPolicyId=$permissionPolicyId, principalId=$principalId, principalType=$principalType, version=$version, additionalProperties=$additionalProperties}"
}
