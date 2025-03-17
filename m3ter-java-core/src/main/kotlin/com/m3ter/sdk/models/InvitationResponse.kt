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
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class InvitationResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("accepted")
    @ExcludeMissing
    private val accepted: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("dtEndAccess")
    @ExcludeMissing
    private val dtEndAccess: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtExpiry")
    @ExcludeMissing
    private val dtExpiry: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("email") @ExcludeMissing private val email: JsonField<String> = JsonMissing.of(),
    @JsonProperty("firstName")
    @ExcludeMissing
    private val firstName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("invitingPrincipalId")
    @ExcludeMissing
    private val invitingPrincipalId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("lastName")
    @ExcludeMissing
    private val lastName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("permissionPolicyIds")
    @ExcludeMissing
    private val permissionPolicyIds: JsonField<List<String>> = JsonMissing.of(),
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

    /**
     * The UUID of the invitation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Boolean indicating whether the user has accepted the invitation.
     * - TRUE - the invite has been accepted.
     * - FALSE - the invite has not yet been accepted.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accepted(): Boolean = accepted.getRequired("accepted")

    /**
     * The date that access will end for the user _(in ISO-8601 format)_. If this is blank, there is
     * no end date meaning that the user has permanent access.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dtEndAccess(): OffsetDateTime = dtEndAccess.getRequired("dtEndAccess")

    /**
     * The date when the invite expires _(in ISO-8601 format)_. After this date the invited user can
     * no longer accept the invite. By default, any invite is valid for 30 days from the date the
     * invite is sent.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dtExpiry(): OffsetDateTime = dtExpiry.getRequired("dtExpiry")

    /**
     * The email address of the invitee. The invitation will be sent to this email address.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = email.getRequired("email")

    /**
     * The first name of the invitee.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun firstName(): String = firstName.getRequired("firstName")

    /**
     * The UUID of the user who sent the invite.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invitingPrincipalId(): String = invitingPrincipalId.getRequired("invitingPrincipalId")

    /**
     * The surname of the invitee.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastName(): String = lastName.getRequired("lastName")

    /**
     * The IDs of the permission policies the invited user has been assigned. This controls the
     * access rights and privileges that this user will have when working in the m3ter Organization.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun permissionPolicyIds(): List<String> = permissionPolicyIds.getRequired("permissionPolicyIds")

    /**
     * The version number. Default value when newly created is one.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Long = version.getRequired("version")

    /**
     * The UUID of the user who created the invitation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /**
     * The DateTime when the invitation was created _(in ISO-8601 format)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /**
     * The DateTime when the invitation was last modified _(in ISO-8601 format)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /**
     * The UUID of the user who last modified the invitation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

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

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InvitationResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        accepted()
        dtEndAccess()
        dtExpiry()
        email()
        firstName()
        invitingPrincipalId()
        lastName()
        permissionPolicyIds()
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
         * Returns a mutable builder for constructing an instance of [InvitationResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .accepted()
         * .dtEndAccess()
         * .dtExpiry()
         * .email()
         * .firstName()
         * .invitingPrincipalId()
         * .lastName()
         * .permissionPolicyIds()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvitationResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accepted: JsonField<Boolean>? = null
        private var dtEndAccess: JsonField<OffsetDateTime>? = null
        private var dtExpiry: JsonField<OffsetDateTime>? = null
        private var email: JsonField<String>? = null
        private var firstName: JsonField<String>? = null
        private var invitingPrincipalId: JsonField<String>? = null
        private var lastName: JsonField<String>? = null
        private var permissionPolicyIds: JsonField<MutableList<String>>? = null
        private var version: JsonField<Long>? = null
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(invitationResponse: InvitationResponse) = apply {
            id = invitationResponse.id
            accepted = invitationResponse.accepted
            dtEndAccess = invitationResponse.dtEndAccess
            dtExpiry = invitationResponse.dtExpiry
            email = invitationResponse.email
            firstName = invitationResponse.firstName
            invitingPrincipalId = invitationResponse.invitingPrincipalId
            lastName = invitationResponse.lastName
            permissionPolicyIds = invitationResponse.permissionPolicyIds.map { it.toMutableList() }
            version = invitationResponse.version
            createdBy = invitationResponse.createdBy
            dtCreated = invitationResponse.dtCreated
            dtLastModified = invitationResponse.dtLastModified
            lastModifiedBy = invitationResponse.lastModifiedBy
            additionalProperties = invitationResponse.additionalProperties.toMutableMap()
        }

        /** The UUID of the invitation. */
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
         * - TRUE - the invite has been accepted.
         * - FALSE - the invite has not yet been accepted.
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

        /**
         * The date that access will end for the user _(in ISO-8601 format)_. If this is blank,
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
         * The date when the invite expires _(in ISO-8601 format)_. After this date the invited user
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

        /** The version number. Default value when newly created is one. */
        fun version(version: Long) = version(JsonField.of(version))

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<Long>) = apply { this.version = version }

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

        /** The DateTime when the invitation was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when the invitation was last modified _(in ISO-8601 format)_. */
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
         * .accepted()
         * .dtEndAccess()
         * .dtExpiry()
         * .email()
         * .firstName()
         * .invitingPrincipalId()
         * .lastName()
         * .permissionPolicyIds()
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvitationResponse =
            InvitationResponse(
                checkRequired("id", id),
                checkRequired("accepted", accepted),
                checkRequired("dtEndAccess", dtEndAccess),
                checkRequired("dtExpiry", dtExpiry),
                checkRequired("email", email),
                checkRequired("firstName", firstName),
                checkRequired("invitingPrincipalId", invitingPrincipalId),
                checkRequired("lastName", lastName),
                checkRequired("permissionPolicyIds", permissionPolicyIds).map { it.toImmutable() },
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

        return /* spotless:off */ other is InvitationResponse && id == other.id && accepted == other.accepted && dtEndAccess == other.dtEndAccess && dtExpiry == other.dtExpiry && email == other.email && firstName == other.firstName && invitingPrincipalId == other.invitingPrincipalId && lastName == other.lastName && permissionPolicyIds == other.permissionPolicyIds && version == other.version && createdBy == other.createdBy && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accepted, dtEndAccess, dtExpiry, email, firstName, invitingPrincipalId, lastName, permissionPolicyIds, version, createdBy, dtCreated, dtLastModified, lastModifiedBy, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvitationResponse{id=$id, accepted=$accepted, dtEndAccess=$dtEndAccess, dtExpiry=$dtExpiry, email=$email, firstName=$firstName, invitingPrincipalId=$invitingPrincipalId, lastName=$lastName, permissionPolicyIds=$permissionPolicyIds, version=$version, createdBy=$createdBy, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, additionalProperties=$additionalProperties}"
}
