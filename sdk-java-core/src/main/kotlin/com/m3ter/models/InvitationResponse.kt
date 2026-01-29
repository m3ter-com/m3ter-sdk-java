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
import com.m3ter.core.checkRequired
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InvitationResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accepted: JsonField<Boolean>,
    private val createdBy: JsonField<String>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtEndAccess: JsonField<OffsetDateTime>,
    private val dtExpiry: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val email: JsonField<String>,
    private val firstName: JsonField<String>,
    private val invitingPrincipalId: JsonField<String>,
    private val lastModifiedBy: JsonField<String>,
    private val lastName: JsonField<String>,
    private val permissionPolicyIds: JsonField<List<String>>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accepted") @ExcludeMissing accepted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtEndAccess")
        @ExcludeMissing
        dtEndAccess: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtExpiry")
        @ExcludeMissing
        dtExpiry: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invitingPrincipalId")
        @ExcludeMissing
        invitingPrincipalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("permissionPolicyIds")
        @ExcludeMissing
        permissionPolicyIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        accepted,
        createdBy,
        dtCreated,
        dtEndAccess,
        dtExpiry,
        dtLastModified,
        email,
        firstName,
        invitingPrincipalId,
        lastModifiedBy,
        lastName,
        permissionPolicyIds,
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
     * Boolean indicating whether the user has accepted the invitation.
     * * TRUE - the invite has been accepted.
     * * FALSE - the invite has not yet been accepted.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accepted(): Optional<Boolean> = accepted.getOptional("accepted")

    /**
     * The UUID of the user who created the invitation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * The DateTime when the invitation was created *(in ISO-8601 format)*.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The date that access will end for the user *(in ISO-8601 format)*. If this is blank, there is
     * no end date meaning that the user has permanent access.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtEndAccess(): Optional<OffsetDateTime> = dtEndAccess.getOptional("dtEndAccess")

    /**
     * The date when the invite expires *(in ISO-8601 format)*. After this date the invited user can
     * no longer accept the invite. By default, any invite is valid for 30 days from the date the
     * invite is sent.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtExpiry(): Optional<OffsetDateTime> = dtExpiry.getOptional("dtExpiry")

    /**
     * The DateTime when the invitation was last modified *(in ISO-8601 format)*.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * The email address of the invitee. The invitation will be sent to this email address.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * The first name of the invitee.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("firstName")

    /**
     * The UUID of the user who sent the invite.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invitingPrincipalId(): Optional<String> =
        invitingPrincipalId.getOptional("invitingPrincipalId")

    /**
     * The UUID of the user who last modified the invitation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * The surname of the invitee.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("lastName")

    /**
     * The IDs of the permission policies the invited user has been assigned. This controls the
     * access rights and privileges that this user will have when working in the m3ter Organization.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun permissionPolicyIds(): Optional<List<String>> =
        permissionPolicyIds.getOptional("permissionPolicyIds")

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
     * Returns the raw JSON value of [accepted].
     *
     * Unlike [accepted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accepted") @ExcludeMissing fun _accepted(): JsonField<Boolean> = accepted

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
     * Returns the raw JSON value of [dtEndAccess].
     *
     * Unlike [dtEndAccess], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dtEndAccess")
    @ExcludeMissing
    fun _dtEndAccess(): JsonField<OffsetDateTime> = dtEndAccess

    /**
     * Returns the raw JSON value of [dtExpiry].
     *
     * Unlike [dtExpiry], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dtExpiry") @ExcludeMissing fun _dtExpiry(): JsonField<OffsetDateTime> = dtExpiry

    /**
     * Returns the raw JSON value of [dtLastModified].
     *
     * Unlike [dtLastModified], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [invitingPrincipalId].
     *
     * Unlike [invitingPrincipalId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("invitingPrincipalId")
    @ExcludeMissing
    fun _invitingPrincipalId(): JsonField<String> = invitingPrincipalId

    /**
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * Returns the raw JSON value of [permissionPolicyIds].
     *
     * Unlike [permissionPolicyIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("permissionPolicyIds")
    @ExcludeMissing
    fun _permissionPolicyIds(): JsonField<List<String>> = permissionPolicyIds

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
         * Returns a mutable builder for constructing an instance of [InvitationResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvitationResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accepted: JsonField<Boolean> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtEndAccess: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtExpiry: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var invitingPrincipalId: JsonField<String> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var permissionPolicyIds: JsonField<MutableList<String>>? = null
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(invitationResponse: InvitationResponse) = apply {
            id = invitationResponse.id
            accepted = invitationResponse.accepted
            createdBy = invitationResponse.createdBy
            dtCreated = invitationResponse.dtCreated
            dtEndAccess = invitationResponse.dtEndAccess
            dtExpiry = invitationResponse.dtExpiry
            dtLastModified = invitationResponse.dtLastModified
            email = invitationResponse.email
            firstName = invitationResponse.firstName
            invitingPrincipalId = invitationResponse.invitingPrincipalId
            lastModifiedBy = invitationResponse.lastModifiedBy
            lastName = invitationResponse.lastName
            permissionPolicyIds = invitationResponse.permissionPolicyIds.map { it.toMutableList() }
            version = invitationResponse.version
            additionalProperties = invitationResponse.additionalProperties.toMutableMap()
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

        /**
         * Boolean indicating whether the user has accepted the invitation.
         * * TRUE - the invite has been accepted.
         * * FALSE - the invite has not yet been accepted.
         */
        fun accepted(accepted: Boolean) = accepted(JsonField.of(accepted))

        /**
         * Sets [Builder.accepted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accepted] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accepted(accepted: JsonField<Boolean>) = apply { this.accepted = accepted }

        /** The UUID of the user who created the invitation. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The DateTime when the invitation was created *(in ISO-8601 format)*. */
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
         * The date that access will end for the user *(in ISO-8601 format)*. If this is blank,
         * there is no end date meaning that the user has permanent access.
         */
        fun dtEndAccess(dtEndAccess: OffsetDateTime) = dtEndAccess(JsonField.of(dtEndAccess))

        /**
         * Sets [Builder.dtEndAccess] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtEndAccess] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtEndAccess(dtEndAccess: JsonField<OffsetDateTime>) = apply {
            this.dtEndAccess = dtEndAccess
        }

        /**
         * The date when the invite expires *(in ISO-8601 format)*. After this date the invited user
         * can no longer accept the invite. By default, any invite is valid for 30 days from the
         * date the invite is sent.
         */
        fun dtExpiry(dtExpiry: OffsetDateTime) = dtExpiry(JsonField.of(dtExpiry))

        /**
         * Sets [Builder.dtExpiry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtExpiry] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtExpiry(dtExpiry: JsonField<OffsetDateTime>) = apply { this.dtExpiry = dtExpiry }

        /** The DateTime when the invitation was last modified *(in ISO-8601 format)*. */
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

        /** The email address of the invitee. The invitation will be sent to this email address. */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The first name of the invitee. */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** The UUID of the user who sent the invite. */
        fun invitingPrincipalId(invitingPrincipalId: String) =
            invitingPrincipalId(JsonField.of(invitingPrincipalId))

        /**
         * Sets [Builder.invitingPrincipalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invitingPrincipalId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invitingPrincipalId(invitingPrincipalId: JsonField<String>) = apply {
            this.invitingPrincipalId = invitingPrincipalId
        }

        /** The UUID of the user who last modified the invitation. */
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

        /** The surname of the invitee. */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /**
         * The IDs of the permission policies the invited user has been assigned. This controls the
         * access rights and privileges that this user will have when working in the m3ter
         * Organization.
         */
        fun permissionPolicyIds(permissionPolicyIds: List<String>) =
            permissionPolicyIds(JsonField.of(permissionPolicyIds))

        /**
         * Sets [Builder.permissionPolicyIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.permissionPolicyIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun permissionPolicyIds(permissionPolicyIds: JsonField<List<String>>) = apply {
            this.permissionPolicyIds = permissionPolicyIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [permissionPolicyIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPermissionPolicyId(permissionPolicyId: String) = apply {
            permissionPolicyIds =
                (permissionPolicyIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("permissionPolicyIds", it).add(permissionPolicyId)
                }
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
         * Returns an immutable instance of [InvitationResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvitationResponse =
            InvitationResponse(
                checkRequired("id", id),
                accepted,
                createdBy,
                dtCreated,
                dtEndAccess,
                dtExpiry,
                dtLastModified,
                email,
                firstName,
                invitingPrincipalId,
                lastModifiedBy,
                lastName,
                (permissionPolicyIds ?: JsonMissing.of()).map { it.toImmutable() },
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InvitationResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        accepted()
        createdBy()
        dtCreated()
        dtEndAccess()
        dtExpiry()
        dtLastModified()
        email()
        firstName()
        invitingPrincipalId()
        lastModifiedBy()
        lastName()
        permissionPolicyIds()
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
            (if (accepted.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtEndAccess.asKnown().isPresent) 1 else 0) +
            (if (dtExpiry.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (invitingPrincipalId.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (permissionPolicyIds.asKnown().getOrNull()?.size ?: 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvitationResponse &&
            id == other.id &&
            accepted == other.accepted &&
            createdBy == other.createdBy &&
            dtCreated == other.dtCreated &&
            dtEndAccess == other.dtEndAccess &&
            dtExpiry == other.dtExpiry &&
            dtLastModified == other.dtLastModified &&
            email == other.email &&
            firstName == other.firstName &&
            invitingPrincipalId == other.invitingPrincipalId &&
            lastModifiedBy == other.lastModifiedBy &&
            lastName == other.lastName &&
            permissionPolicyIds == other.permissionPolicyIds &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accepted,
            createdBy,
            dtCreated,
            dtEndAccess,
            dtExpiry,
            dtLastModified,
            email,
            firstName,
            invitingPrincipalId,
            lastModifiedBy,
            lastName,
            permissionPolicyIds,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvitationResponse{id=$id, accepted=$accepted, createdBy=$createdBy, dtCreated=$dtCreated, dtEndAccess=$dtEndAccess, dtExpiry=$dtExpiry, dtLastModified=$dtLastModified, email=$email, firstName=$firstName, invitingPrincipalId=$invitingPrincipalId, lastModifiedBy=$lastModifiedBy, lastName=$lastName, permissionPolicyIds=$permissionPolicyIds, version=$version, additionalProperties=$additionalProperties}"
}
