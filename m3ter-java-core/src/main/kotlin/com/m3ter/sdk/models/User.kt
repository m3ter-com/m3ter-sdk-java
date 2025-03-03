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
class User
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("contactNumber")
    @ExcludeMissing
    private val contactNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtEndAccess")
    @ExcludeMissing
    private val dtEndAccess: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("email") @ExcludeMissing private val email: JsonField<String> = JsonMissing.of(),
    @JsonProperty("firstAcceptedTermsAndConditions")
    @ExcludeMissing
    private val firstAcceptedTermsAndConditions: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("firstName")
    @ExcludeMissing
    private val firstName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("lastAcceptedTermsAndConditions")
    @ExcludeMissing
    private val lastAcceptedTermsAndConditions: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("lastName")
    @ExcludeMissing
    private val lastName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("organizations")
    @ExcludeMissing
    private val organizations: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("permissionPolicy")
    @ExcludeMissing
    private val permissionPolicy: JsonField<List<PermissionStatement>> = JsonMissing.of(),
    @JsonProperty("supportUser")
    @ExcludeMissing
    private val supportUser: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The unique identifier (UUID) of this user. */
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /** The user's contact telephone number. */
    fun contactNumber(): Optional<String> =
        Optional.ofNullable(contactNumber.getNullable("contactNumber"))

    /** The user who created this user. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** The date and time _(in ISO-8601 format)_ when the user was created. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /**
     * The date and time _(in ISO 8601 format)_ when the user's access will end. Used to set or
     * update the date and time a user's access expires.
     */
    fun dtEndAccess(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtEndAccess.getNullable("dtEndAccess"))

    /** The date and time _(in ISO-8601 format)_ when the user was last modified. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The email address for this user. */
    fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

    /**
     * The date and time _(in ISO 8601 format)_ when this user first accepted the the m3ter terms
     * and conditions.
     */
    fun firstAcceptedTermsAndConditions(): Optional<OffsetDateTime> =
        Optional.ofNullable(
            firstAcceptedTermsAndConditions.getNullable("firstAcceptedTermsAndConditions")
        )

    /** The first name of the user. */
    fun firstName(): Optional<String> = Optional.ofNullable(firstName.getNullable("firstName"))

    /**
     * The date and time _(in ISO 8601 format)_ when this user last accepted the the m3ter terms and
     * conditions.
     */
    fun lastAcceptedTermsAndConditions(): Optional<OffsetDateTime> =
        Optional.ofNullable(
            lastAcceptedTermsAndConditions.getNullable("lastAcceptedTermsAndConditions")
        )

    /** The unique identifier (UUID) of the user who last modified this user record. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** The surname of the user. */
    fun lastName(): Optional<String> = Optional.ofNullable(lastName.getNullable("lastName"))

    /** An array listing the Organizations where this user has access. */
    fun organizations(): Optional<List<String>> =
        Optional.ofNullable(organizations.getNullable("organizations"))

    /**
     * An array of permission statements for the user. Each permission statement defines a specific
     * permission for the user.
     */
    fun permissionPolicy(): Optional<List<PermissionStatement>> =
        Optional.ofNullable(permissionPolicy.getNullable("permissionPolicy"))

    /** Indicates whether this is a m3ter Support user. */
    fun supportUser(): Optional<Boolean> =
        Optional.ofNullable(supportUser.getNullable("supportUser"))

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

    /** The unique identifier (UUID) of this user. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The user's contact telephone number. */
    @JsonProperty("contactNumber")
    @ExcludeMissing
    fun _contactNumber(): JsonField<String> = contactNumber

    /** The user who created this user. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** The date and time _(in ISO-8601 format)_ when the user was created. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /**
     * The date and time _(in ISO 8601 format)_ when the user's access will end. Used to set or
     * update the date and time a user's access expires.
     */
    @JsonProperty("dtEndAccess")
    @ExcludeMissing
    fun _dtEndAccess(): JsonField<OffsetDateTime> = dtEndAccess

    /** The date and time _(in ISO-8601 format)_ when the user was last modified. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** The email address for this user. */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * The date and time _(in ISO 8601 format)_ when this user first accepted the the m3ter terms
     * and conditions.
     */
    @JsonProperty("firstAcceptedTermsAndConditions")
    @ExcludeMissing
    fun _firstAcceptedTermsAndConditions(): JsonField<OffsetDateTime> =
        firstAcceptedTermsAndConditions

    /** The first name of the user. */
    @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * The date and time _(in ISO 8601 format)_ when this user last accepted the the m3ter terms and
     * conditions.
     */
    @JsonProperty("lastAcceptedTermsAndConditions")
    @ExcludeMissing
    fun _lastAcceptedTermsAndConditions(): JsonField<OffsetDateTime> =
        lastAcceptedTermsAndConditions

    /** The unique identifier (UUID) of the user who last modified this user record. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /** The surname of the user. */
    @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

    /** An array listing the Organizations where this user has access. */
    @JsonProperty("organizations")
    @ExcludeMissing
    fun _organizations(): JsonField<List<String>> = organizations

    /**
     * An array of permission statements for the user. Each permission statement defines a specific
     * permission for the user.
     */
    @JsonProperty("permissionPolicy")
    @ExcludeMissing
    fun _permissionPolicy(): JsonField<List<PermissionStatement>> = permissionPolicy

    /** Indicates whether this is a m3ter Support user. */
    @JsonProperty("supportUser")
    @ExcludeMissing
    fun _supportUser(): JsonField<Boolean> = supportUser

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

    fun validate(): User = apply {
        if (validated) {
            return@apply
        }

        id()
        contactNumber()
        createdBy()
        dtCreated()
        dtEndAccess()
        dtLastModified()
        email()
        firstAcceptedTermsAndConditions()
        firstName()
        lastAcceptedTermsAndConditions()
        lastModifiedBy()
        lastName()
        organizations()
        permissionPolicy().ifPresent { it.forEach { it.validate() } }
        supportUser()
        version()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [User]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var contactNumber: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtEndAccess: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var firstAcceptedTermsAndConditions: JsonField<OffsetDateTime> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var lastAcceptedTermsAndConditions: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var lastName: JsonField<String> = JsonMissing.of()
        private var organizations: JsonField<MutableList<String>>? = null
        private var permissionPolicy: JsonField<MutableList<PermissionStatement>>? = null
        private var supportUser: JsonField<Boolean> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(user: User) = apply {
            id = user.id
            contactNumber = user.contactNumber
            createdBy = user.createdBy
            dtCreated = user.dtCreated
            dtEndAccess = user.dtEndAccess
            dtLastModified = user.dtLastModified
            email = user.email
            firstAcceptedTermsAndConditions = user.firstAcceptedTermsAndConditions
            firstName = user.firstName
            lastAcceptedTermsAndConditions = user.lastAcceptedTermsAndConditions
            lastModifiedBy = user.lastModifiedBy
            lastName = user.lastName
            organizations = user.organizations.map { it.toMutableList() }
            permissionPolicy = user.permissionPolicy.map { it.toMutableList() }
            supportUser = user.supportUser
            version = user.version
            additionalProperties = user.additionalProperties.toMutableMap()
        }

        /** The unique identifier (UUID) of this user. */
        fun id(id: String) = id(JsonField.of(id))

        /** The unique identifier (UUID) of this user. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The user's contact telephone number. */
        fun contactNumber(contactNumber: String) = contactNumber(JsonField.of(contactNumber))

        /** The user's contact telephone number. */
        fun contactNumber(contactNumber: JsonField<String>) = apply {
            this.contactNumber = contactNumber
        }

        /** The user who created this user. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The user who created this user. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The date and time _(in ISO-8601 format)_ when the user was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The date and time _(in ISO-8601 format)_ when the user was created. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /**
         * The date and time _(in ISO 8601 format)_ when the user's access will end. Used to set or
         * update the date and time a user's access expires.
         */
        fun dtEndAccess(dtEndAccess: OffsetDateTime) = dtEndAccess(JsonField.of(dtEndAccess))

        /**
         * The date and time _(in ISO 8601 format)_ when the user's access will end. Used to set or
         * update the date and time a user's access expires.
         */
        fun dtEndAccess(dtEndAccess: JsonField<OffsetDateTime>) = apply {
            this.dtEndAccess = dtEndAccess
        }

        /** The date and time _(in ISO-8601 format)_ when the user was last modified. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The date and time _(in ISO-8601 format)_ when the user was last modified. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The email address for this user. */
        fun email(email: String) = email(JsonField.of(email))

        /** The email address for this user. */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /**
         * The date and time _(in ISO 8601 format)_ when this user first accepted the the m3ter
         * terms and conditions.
         */
        fun firstAcceptedTermsAndConditions(firstAcceptedTermsAndConditions: OffsetDateTime) =
            firstAcceptedTermsAndConditions(JsonField.of(firstAcceptedTermsAndConditions))

        /**
         * The date and time _(in ISO 8601 format)_ when this user first accepted the the m3ter
         * terms and conditions.
         */
        fun firstAcceptedTermsAndConditions(
            firstAcceptedTermsAndConditions: JsonField<OffsetDateTime>
        ) = apply { this.firstAcceptedTermsAndConditions = firstAcceptedTermsAndConditions }

        /** The first name of the user. */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /** The first name of the user. */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /**
         * The date and time _(in ISO 8601 format)_ when this user last accepted the the m3ter terms
         * and conditions.
         */
        fun lastAcceptedTermsAndConditions(lastAcceptedTermsAndConditions: OffsetDateTime) =
            lastAcceptedTermsAndConditions(JsonField.of(lastAcceptedTermsAndConditions))

        /**
         * The date and time _(in ISO 8601 format)_ when this user last accepted the the m3ter terms
         * and conditions.
         */
        fun lastAcceptedTermsAndConditions(
            lastAcceptedTermsAndConditions: JsonField<OffsetDateTime>
        ) = apply { this.lastAcceptedTermsAndConditions = lastAcceptedTermsAndConditions }

        /** The unique identifier (UUID) of the user who last modified this user record. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The unique identifier (UUID) of the user who last modified this user record. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /** The surname of the user. */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /** The surname of the user. */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** An array listing the Organizations where this user has access. */
        fun organizations(organizations: List<String>) = organizations(JsonField.of(organizations))

        /** An array listing the Organizations where this user has access. */
        fun organizations(organizations: JsonField<List<String>>) = apply {
            this.organizations = organizations.map { it.toMutableList() }
        }

        /** An array listing the Organizations where this user has access. */
        fun addOrganization(organization: String) = apply {
            organizations =
                (organizations ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(organization)
                }
        }

        /**
         * An array of permission statements for the user. Each permission statement defines a
         * specific permission for the user.
         */
        fun permissionPolicy(permissionPolicy: List<PermissionStatement>) =
            permissionPolicy(JsonField.of(permissionPolicy))

        /**
         * An array of permission statements for the user. Each permission statement defines a
         * specific permission for the user.
         */
        fun permissionPolicy(permissionPolicy: JsonField<List<PermissionStatement>>) = apply {
            this.permissionPolicy = permissionPolicy.map { it.toMutableList() }
        }

        /**
         * An array of permission statements for the user. Each permission statement defines a
         * specific permission for the user.
         */
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

        /** Indicates whether this is a m3ter Support user. */
        fun supportUser(supportUser: Boolean) = supportUser(JsonField.of(supportUser))

        /** Indicates whether this is a m3ter Support user. */
        fun supportUser(supportUser: JsonField<Boolean>) = apply { this.supportUser = supportUser }

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

        fun build(): User =
            User(
                id,
                contactNumber,
                createdBy,
                dtCreated,
                dtEndAccess,
                dtLastModified,
                email,
                firstAcceptedTermsAndConditions,
                firstName,
                lastAcceptedTermsAndConditions,
                lastModifiedBy,
                lastName,
                (organizations ?: JsonMissing.of()).map { it.toImmutable() },
                (permissionPolicy ?: JsonMissing.of()).map { it.toImmutable() },
                supportUser,
                version,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is User && id == other.id && contactNumber == other.contactNumber && createdBy == other.createdBy && dtCreated == other.dtCreated && dtEndAccess == other.dtEndAccess && dtLastModified == other.dtLastModified && email == other.email && firstAcceptedTermsAndConditions == other.firstAcceptedTermsAndConditions && firstName == other.firstName && lastAcceptedTermsAndConditions == other.lastAcceptedTermsAndConditions && lastModifiedBy == other.lastModifiedBy && lastName == other.lastName && organizations == other.organizations && permissionPolicy == other.permissionPolicy && supportUser == other.supportUser && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, contactNumber, createdBy, dtCreated, dtEndAccess, dtLastModified, email, firstAcceptedTermsAndConditions, firstName, lastAcceptedTermsAndConditions, lastModifiedBy, lastName, organizations, permissionPolicy, supportUser, version, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "User{id=$id, contactNumber=$contactNumber, createdBy=$createdBy, dtCreated=$dtCreated, dtEndAccess=$dtEndAccess, dtLastModified=$dtLastModified, email=$email, firstAcceptedTermsAndConditions=$firstAcceptedTermsAndConditions, firstName=$firstName, lastAcceptedTermsAndConditions=$lastAcceptedTermsAndConditions, lastModifiedBy=$lastModifiedBy, lastName=$lastName, organizations=$organizations, permissionPolicy=$permissionPolicy, supportUser=$supportUser, version=$version, additionalProperties=$additionalProperties}"
}
