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
import com.m3ter.core.checkKnown
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PermissionPolicyResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val lastModifiedBy: JsonField<String>,
    private val managedPolicy: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val permissionPolicy: JsonField<List<PermissionStatementResponse>>,
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
        @JsonProperty("managedPolicy")
        @ExcludeMissing
        managedPolicy: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("permissionPolicy")
        @ExcludeMissing
        permissionPolicy: JsonField<List<PermissionStatementResponse>> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        createdBy,
        dtCreated,
        dtLastModified,
        lastModifiedBy,
        managedPolicy,
        name,
        permissionPolicy,
        version,
        mutableMapOf(),
    )

    /**
     * The unique identifier (UUID) for this Permission Policy.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The unique identifier (UUID) of the user who created this Permission Policy.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * The date and time *(in ISO-8601 format)* when the Permission Policy was created.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The date and time *(in ISO-8601 format)* when the Permission Policy was last modified.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * The unique identifier (UUID) of the user who last modified this Permission Policy.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * Indicates whether this is a system generated Managed Permission Policy.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun managedPolicy(): Optional<Boolean> = managedPolicy.getOptional("managedPolicy")

    /**
     * The name of the Permission Policy.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Array containing the Permission Policies information.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun permissionPolicy(): Optional<List<PermissionStatementResponse>> =
        permissionPolicy.getOptional("permissionPolicy")

    /**
     * The version number. Default value when newly created is one.
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
     * Returns the raw JSON value of [managedPolicy].
     *
     * Unlike [managedPolicy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("managedPolicy")
    @ExcludeMissing
    fun _managedPolicy(): JsonField<Boolean> = managedPolicy

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [permissionPolicy].
     *
     * Unlike [permissionPolicy], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("permissionPolicy")
    @ExcludeMissing
    fun _permissionPolicy(): JsonField<List<PermissionStatementResponse>> = permissionPolicy

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

        /** Returns a mutable builder for constructing an instance of [PermissionPolicyResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PermissionPolicyResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var managedPolicy: JsonField<Boolean> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var permissionPolicy: JsonField<MutableList<PermissionStatementResponse>>? = null
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(permissionPolicyResponse: PermissionPolicyResponse) = apply {
            id = permissionPolicyResponse.id
            createdBy = permissionPolicyResponse.createdBy
            dtCreated = permissionPolicyResponse.dtCreated
            dtLastModified = permissionPolicyResponse.dtLastModified
            lastModifiedBy = permissionPolicyResponse.lastModifiedBy
            managedPolicy = permissionPolicyResponse.managedPolicy
            name = permissionPolicyResponse.name
            permissionPolicy = permissionPolicyResponse.permissionPolicy.map { it.toMutableList() }
            version = permissionPolicyResponse.version
            additionalProperties = permissionPolicyResponse.additionalProperties.toMutableMap()
        }

        /** The unique identifier (UUID) for this Permission Policy. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The unique identifier (UUID) of the user who created this Permission Policy. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The date and time *(in ISO-8601 format)* when the Permission Policy was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /**
         * The date and time *(in ISO-8601 format)* when the Permission Policy was last modified.
         */
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

        /** The unique identifier (UUID) of the user who last modified this Permission Policy. */
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

        /** Indicates whether this is a system generated Managed Permission Policy. */
        fun managedPolicy(managedPolicy: Boolean) = managedPolicy(JsonField.of(managedPolicy))

        /**
         * Sets [Builder.managedPolicy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.managedPolicy] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun managedPolicy(managedPolicy: JsonField<Boolean>) = apply {
            this.managedPolicy = managedPolicy
        }

        /** The name of the Permission Policy. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Array containing the Permission Policies information. */
        fun permissionPolicy(permissionPolicy: List<PermissionStatementResponse>) =
            permissionPolicy(JsonField.of(permissionPolicy))

        /**
         * Sets [Builder.permissionPolicy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.permissionPolicy] with a well-typed
         * `List<PermissionStatementResponse>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun permissionPolicy(permissionPolicy: JsonField<List<PermissionStatementResponse>>) =
            apply {
                this.permissionPolicy = permissionPolicy.map { it.toMutableList() }
            }

        /**
         * Adds a single [PermissionStatementResponse] to [Builder.permissionPolicy].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPermissionPolicy(permissionPolicy: PermissionStatementResponse) = apply {
            this.permissionPolicy =
                (this.permissionPolicy ?: JsonField.of(mutableListOf())).also {
                    checkKnown("permissionPolicy", it).add(permissionPolicy)
                }
        }

        /** The version number. Default value when newly created is one. */
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
         * Returns an immutable instance of [PermissionPolicyResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PermissionPolicyResponse =
            PermissionPolicyResponse(
                id,
                createdBy,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                managedPolicy,
                name,
                (permissionPolicy ?: JsonMissing.of()).map { it.toImmutable() },
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PermissionPolicyResponse = apply {
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
            (if (managedPolicy.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (permissionPolicy.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PermissionPolicyResponse &&
            id == other.id &&
            createdBy == other.createdBy &&
            dtCreated == other.dtCreated &&
            dtLastModified == other.dtLastModified &&
            lastModifiedBy == other.lastModifiedBy &&
            managedPolicy == other.managedPolicy &&
            name == other.name &&
            permissionPolicy == other.permissionPolicy &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdBy,
            dtCreated,
            dtLastModified,
            lastModifiedBy,
            managedPolicy,
            name,
            permissionPolicy,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PermissionPolicyResponse{id=$id, createdBy=$createdBy, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, managedPolicy=$managedPolicy, name=$name, permissionPolicy=$permissionPolicy, version=$version, additionalProperties=$additionalProperties}"
}
