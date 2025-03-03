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
class Invitation
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

    /** The UUID of the invitation. */
    fun id(): String = id.getRequired("id")

    /**
     * Boolean indicating whether the user has accepted the invitation.
     * - TRUE - the invite has been accepted.
     * - FALSE - the invite has not yet been accepted.
     */
    fun accepted(): Boolean = accepted.getRequired("accepted")

    /**
     * The date that access will end for the user _(in ISO-8601 format)_. If this is blank, there is
     * no end date meaning that the user has permanent access.
     */
    fun dtEndAccess(): OffsetDateTime = dtEndAccess.getRequired("dtEndAccess")

    /**
     * The date when the invite expires _(in ISO-8601 format)_. After this date the invited user can
     * no longer accept the invite. By default, any invite is valid for 30 days from the date the
     * invite is sent.
     */
    fun dtExpiry(): OffsetDateTime = dtExpiry.getRequired("dtExpiry")

    /** The email address of the invitee. The invitation will be sent to this email address. */
    fun email(): String = email.getRequired("email")

    /** The first name of the invitee. */
    fun firstName(): String = firstName.getRequired("firstName")

    /** The UUID of the user who sent the invite. */
    fun invitingPrincipalId(): String = invitingPrincipalId.getRequired("invitingPrincipalId")

    /** The surname of the invitee. */
    fun lastName(): String = lastName.getRequired("lastName")

    /**
     * The IDs of the permission policies the invited user has been assigned. This controls the
     * access rights and privileges that this user will have when working in the m3ter Organization.
     */
    fun permissionPolicyIds(): List<String> = permissionPolicyIds.getRequired("permissionPolicyIds")

    /** The version number. Default value when newly created is one. */
    fun version(): Long = version.getRequired("version")

    /** The UUID of the user who created the invitation. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** The DateTime when the invitation was created _(in ISO-8601 format)_. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The DateTime when the invitation was last modified _(in ISO-8601 format)_. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The UUID of the user who last modified the invitation. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** The UUID of the invitation. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Boolean indicating whether the user has accepted the invitation.
     * - TRUE - the invite has been accepted.
     * - FALSE - the invite has not yet been accepted.
     */
    @JsonProperty("accepted") @ExcludeMissing fun _accepted(): JsonField<Boolean> = accepted

    /**
     * The date that access will end for the user _(in ISO-8601 format)_. If this is blank, there is
     * no end date meaning that the user has permanent access.
     */
    @JsonProperty("dtEndAccess")
    @ExcludeMissing
    fun _dtEndAccess(): JsonField<OffsetDateTime> = dtEndAccess

    /**
     * The date when the invite expires _(in ISO-8601 format)_. After this date the invited user can
     * no longer accept the invite. By default, any invite is valid for 30 days from the date the
     * invite is sent.
     */
    @JsonProperty("dtExpiry") @ExcludeMissing fun _dtExpiry(): JsonField<OffsetDateTime> = dtExpiry

    /** The email address of the invitee. The invitation will be sent to this email address. */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /** The first name of the invitee. */
    @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /** The UUID of the user who sent the invite. */
    @JsonProperty("invitingPrincipalId")
    @ExcludeMissing
    fun _invitingPrincipalId(): JsonField<String> = invitingPrincipalId

    /** The surname of the invitee. */
    @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /**
     * The IDs of the permission policies the invited user has been assigned. This controls the
     * access rights and privileges that this user will have when working in the m3ter Organization.
     */
    @JsonProperty("permissionPolicyIds")
    @ExcludeMissing
    fun _permissionPolicyIds(): JsonField<List<String>> = permissionPolicyIds

    /** The version number. Default value when newly created is one. */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /** The UUID of the user who created the invitation. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** The DateTime when the invitation was created _(in ISO-8601 format)_. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The DateTime when the invitation was last modified _(in ISO-8601 format)_. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** The UUID of the user who last modified the invitation. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Invitation = apply {
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

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Invitation]. */
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
        internal fun from(invitation: Invitation) = apply {
            id = invitation.id
            accepted = invitation.accepted
            dtEndAccess = invitation.dtEndAccess
            dtExpiry = invitation.dtExpiry
            email = invitation.email
            firstName = invitation.firstName
            invitingPrincipalId = invitation.invitingPrincipalId
            lastName = invitation.lastName
            permissionPolicyIds = invitation.permissionPolicyIds.map { it.toMutableList() }
            version = invitation.version
            createdBy = invitation.createdBy
            dtCreated = invitation.dtCreated
            dtLastModified = invitation.dtLastModified
            lastModifiedBy = invitation.lastModifiedBy
            additionalProperties = invitation.additionalProperties.toMutableMap()
        }

        /** The UUID of the invitation. */
        fun id(id: String) = id(JsonField.of(id))

        /** The UUID of the invitation. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * Boolean indicating whether the user has accepted the invitation.
         * - TRUE - the invite has been accepted.
         * - FALSE - the invite has not yet been accepted.
         */
        fun accepted(accepted: Boolean) = accepted(JsonField.of(accepted))

        /**
         * Boolean indicating whether the user has accepted the invitation.
         * - TRUE - the invite has been accepted.
         * - FALSE - the invite has not yet been accepted.
         */
        fun accepted(accepted: JsonField<Boolean>) = apply { this.accepted = accepted }

        /**
         * The date that access will end for the user _(in ISO-8601 format)_. If this is blank,
         * there is no end date meaning that the user has permanent access.
         */
        fun dtEndAccess(dtEndAccess: OffsetDateTime) = dtEndAccess(JsonField.of(dtEndAccess))

        /**
         * The date that access will end for the user _(in ISO-8601 format)_. If this is blank,
         * there is no end date meaning that the user has permanent access.
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
         * The date when the invite expires _(in ISO-8601 format)_. After this date the invited user
         * can no longer accept the invite. By default, any invite is valid for 30 days from the
         * date the invite is sent.
         */
        fun dtExpiry(dtExpiry: JsonField<OffsetDateTime>) = apply { this.dtExpiry = dtExpiry }

        /** The email address of the invitee. The invitation will be sent to this email address. */
        fun email(email: String) = email(JsonField.of(email))

        /** The email address of the invitee. The invitation will be sent to this email address. */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** The first name of the invitee. */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /** The first name of the invitee. */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /** The UUID of the user who sent the invite. */
        fun invitingPrincipalId(invitingPrincipalId: String) =
            invitingPrincipalId(JsonField.of(invitingPrincipalId))

        /** The UUID of the user who sent the invite. */
        fun invitingPrincipalId(invitingPrincipalId: JsonField<String>) = apply {
            this.invitingPrincipalId = invitingPrincipalId
        }

        /** The surname of the invitee. */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /** The surname of the invitee. */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /**
         * The IDs of the permission policies the invited user has been assigned. This controls the
         * access rights and privileges that this user will have when working in the m3ter
         * Organization.
         */
        fun permissionPolicyIds(permissionPolicyIds: List<String>) =
            permissionPolicyIds(JsonField.of(permissionPolicyIds))

        /**
         * The IDs of the permission policies the invited user has been assigned. This controls the
         * access rights and privileges that this user will have when working in the m3ter
         * Organization.
         */
        fun permissionPolicyIds(permissionPolicyIds: JsonField<List<String>>) = apply {
            this.permissionPolicyIds = permissionPolicyIds.map { it.toMutableList() }
        }

        /**
         * The IDs of the permission policies the invited user has been assigned. This controls the
         * access rights and privileges that this user will have when working in the m3ter
         * Organization.
         */
        fun addPermissionPolicyId(permissionPolicyId: String) = apply {
            permissionPolicyIds =
                (permissionPolicyIds ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(permissionPolicyId)
                }
        }

        /** The version number. Default value when newly created is one. */
        fun version(version: Long) = version(JsonField.of(version))

        /** The version number. Default value when newly created is one. */
        fun version(version: JsonField<Long>) = apply { this.version = version }

        /** The UUID of the user who created the invitation. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The UUID of the user who created the invitation. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The DateTime when the invitation was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The DateTime when the invitation was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when the invitation was last modified _(in ISO-8601 format)_. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The DateTime when the invitation was last modified _(in ISO-8601 format)_. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The UUID of the user who last modified the invitation. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The UUID of the user who last modified the invitation. */
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

        fun build(): Invitation =
            Invitation(
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

        return /* spotless:off */ other is Invitation && id == other.id && accepted == other.accepted && dtEndAccess == other.dtEndAccess && dtExpiry == other.dtExpiry && email == other.email && firstName == other.firstName && invitingPrincipalId == other.invitingPrincipalId && lastName == other.lastName && permissionPolicyIds == other.permissionPolicyIds && version == other.version && createdBy == other.createdBy && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accepted, dtEndAccess, dtExpiry, email, firstName, invitingPrincipalId, lastName, permissionPolicyIds, version, createdBy, dtCreated, dtLastModified, lastModifiedBy, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Invitation{id=$id, accepted=$accepted, dtEndAccess=$dtEndAccess, dtExpiry=$dtExpiry, email=$email, firstName=$firstName, invitingPrincipalId=$invitingPrincipalId, lastName=$lastName, permissionPolicyIds=$permissionPolicyIds, version=$version, createdBy=$createdBy, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, additionalProperties=$additionalProperties}"
}
