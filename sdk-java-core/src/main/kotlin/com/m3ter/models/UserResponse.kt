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

class UserResponse
private constructor(
    private val id: JsonField<String>,
    private val contactNumber: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtEndAccess: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val email: JsonField<String>,
    private val firstAcceptedTermsAndConditions: JsonField<OffsetDateTime>,
    private val firstName: JsonField<String>,
    private val lastAcceptedTermsAndConditions: JsonField<OffsetDateTime>,
    private val lastModifiedBy: JsonField<String>,
    private val lastName: JsonField<String>,
    private val organizations: JsonField<List<String>>,
    private val permissionPolicy: JsonField<List<PermissionStatementResponse>>,
    private val supportUser: JsonField<Boolean>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contactNumber")
        @ExcludeMissing
        contactNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtEndAccess")
        @ExcludeMissing
        dtEndAccess: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstAcceptedTermsAndConditions")
        @ExcludeMissing
        firstAcceptedTermsAndConditions: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastAcceptedTermsAndConditions")
        @ExcludeMissing
        lastAcceptedTermsAndConditions: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastName") @ExcludeMissing lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organizations")
        @ExcludeMissing
        organizations: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("permissionPolicy")
        @ExcludeMissing
        permissionPolicy: JsonField<List<PermissionStatementResponse>> = JsonMissing.of(),
        @JsonProperty("supportUser")
        @ExcludeMissing
        supportUser: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
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
        organizations,
        permissionPolicy,
        supportUser,
        version,
        mutableMapOf(),
    )

    /**
     * The unique identifier (UUID) of this user.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * The user's contact telephone number.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactNumber(): Optional<String> = contactNumber.getOptional("contactNumber")

    /**
     * The user who created this user.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * The date and time *(in ISO-8601 format)* when the user was created.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The date and time *(in ISO 8601 format)* when the user's access will end. Used to set or
     * update the date and time a user's access expires.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtEndAccess(): Optional<OffsetDateTime> = dtEndAccess.getOptional("dtEndAccess")

    /**
     * The date and time *(in ISO-8601 format)* when the user was last modified.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * The email address for this user.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * The date and time *(in ISO 8601 format)* when this user first accepted the the m3ter terms
     * and conditions.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstAcceptedTermsAndConditions(): Optional<OffsetDateTime> =
        firstAcceptedTermsAndConditions.getOptional("firstAcceptedTermsAndConditions")

    /**
     * The first name of the user.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun firstName(): Optional<String> = firstName.getOptional("firstName")

    /**
     * The date and time *(in ISO 8601 format)* when this user last accepted the the m3ter terms and
     * conditions.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastAcceptedTermsAndConditions(): Optional<OffsetDateTime> =
        lastAcceptedTermsAndConditions.getOptional("lastAcceptedTermsAndConditions")

    /**
     * The unique identifier (UUID) of the user who last modified this user record.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * The surname of the user.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastName(): Optional<String> = lastName.getOptional("lastName")

    /**
     * An array listing the Organizations where this user has access.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organizations(): Optional<List<String>> = organizations.getOptional("organizations")

    /**
     * An array of permission statements for the user. Each permission statement defines a specific
     * permission for the user.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun permissionPolicy(): Optional<List<PermissionStatementResponse>> =
        permissionPolicy.getOptional("permissionPolicy")

    /**
     * Indicates whether this is a m3ter Support user.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun supportUser(): Optional<Boolean> = supportUser.getOptional("supportUser")

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
     * Returns the raw JSON value of [contactNumber].
     *
     * Unlike [contactNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contactNumber")
    @ExcludeMissing
    fun _contactNumber(): JsonField<String> = contactNumber

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
     * Returns the raw JSON value of [firstAcceptedTermsAndConditions].
     *
     * Unlike [firstAcceptedTermsAndConditions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("firstAcceptedTermsAndConditions")
    @ExcludeMissing
    fun _firstAcceptedTermsAndConditions(): JsonField<OffsetDateTime> =
        firstAcceptedTermsAndConditions

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

    /**
     * Returns the raw JSON value of [lastAcceptedTermsAndConditions].
     *
     * Unlike [lastAcceptedTermsAndConditions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("lastAcceptedTermsAndConditions")
    @ExcludeMissing
    fun _lastAcceptedTermsAndConditions(): JsonField<OffsetDateTime> =
        lastAcceptedTermsAndConditions

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
     * Returns the raw JSON value of [organizations].
     *
     * Unlike [organizations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organizations")
    @ExcludeMissing
    fun _organizations(): JsonField<List<String>> = organizations

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
     * Returns the raw JSON value of [supportUser].
     *
     * Unlike [supportUser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("supportUser")
    @ExcludeMissing
    fun _supportUser(): JsonField<Boolean> = supportUser

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

        /** Returns a mutable builder for constructing an instance of [UserResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserResponse]. */
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
        private var permissionPolicy: JsonField<MutableList<PermissionStatementResponse>>? = null
        private var supportUser: JsonField<Boolean> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userResponse: UserResponse) = apply {
            id = userResponse.id
            contactNumber = userResponse.contactNumber
            createdBy = userResponse.createdBy
            dtCreated = userResponse.dtCreated
            dtEndAccess = userResponse.dtEndAccess
            dtLastModified = userResponse.dtLastModified
            email = userResponse.email
            firstAcceptedTermsAndConditions = userResponse.firstAcceptedTermsAndConditions
            firstName = userResponse.firstName
            lastAcceptedTermsAndConditions = userResponse.lastAcceptedTermsAndConditions
            lastModifiedBy = userResponse.lastModifiedBy
            lastName = userResponse.lastName
            organizations = userResponse.organizations.map { it.toMutableList() }
            permissionPolicy = userResponse.permissionPolicy.map { it.toMutableList() }
            supportUser = userResponse.supportUser
            version = userResponse.version
            additionalProperties = userResponse.additionalProperties.toMutableMap()
        }

        /** The unique identifier (UUID) of this user. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The user's contact telephone number. */
        fun contactNumber(contactNumber: String) = contactNumber(JsonField.of(contactNumber))

        /**
         * Sets [Builder.contactNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactNumber(contactNumber: JsonField<String>) = apply {
            this.contactNumber = contactNumber
        }

        /** The user who created this user. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The date and time *(in ISO-8601 format)* when the user was created. */
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
         * The date and time *(in ISO 8601 format)* when the user's access will end. Used to set or
         * update the date and time a user's access expires.
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

        /** The date and time *(in ISO-8601 format)* when the user was last modified. */
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

        /** The email address for this user. */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /**
         * The date and time *(in ISO 8601 format)* when this user first accepted the the m3ter
         * terms and conditions.
         */
        fun firstAcceptedTermsAndConditions(firstAcceptedTermsAndConditions: OffsetDateTime) =
            firstAcceptedTermsAndConditions(JsonField.of(firstAcceptedTermsAndConditions))

        /**
         * Sets [Builder.firstAcceptedTermsAndConditions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstAcceptedTermsAndConditions] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun firstAcceptedTermsAndConditions(
            firstAcceptedTermsAndConditions: JsonField<OffsetDateTime>
        ) = apply { this.firstAcceptedTermsAndConditions = firstAcceptedTermsAndConditions }

        /** The first name of the user. */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

        /**
         * The date and time *(in ISO 8601 format)* when this user last accepted the the m3ter terms
         * and conditions.
         */
        fun lastAcceptedTermsAndConditions(lastAcceptedTermsAndConditions: OffsetDateTime) =
            lastAcceptedTermsAndConditions(JsonField.of(lastAcceptedTermsAndConditions))

        /**
         * Sets [Builder.lastAcceptedTermsAndConditions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastAcceptedTermsAndConditions] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun lastAcceptedTermsAndConditions(
            lastAcceptedTermsAndConditions: JsonField<OffsetDateTime>
        ) = apply { this.lastAcceptedTermsAndConditions = lastAcceptedTermsAndConditions }

        /** The unique identifier (UUID) of the user who last modified this user record. */
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

        /** The surname of the user. */
        fun lastName(lastName: String) = lastName(JsonField.of(lastName))

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

        /** An array listing the Organizations where this user has access. */
        fun organizations(organizations: List<String>) = organizations(JsonField.of(organizations))

        /**
         * Sets [Builder.organizations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organizations] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organizations(organizations: JsonField<List<String>>) = apply {
            this.organizations = organizations.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [organizations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOrganization(organization: String) = apply {
            organizations =
                (organizations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("organizations", it).add(organization)
                }
        }

        /**
         * An array of permission statements for the user. Each permission statement defines a
         * specific permission for the user.
         */
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

        /** Indicates whether this is a m3ter Support user. */
        fun supportUser(supportUser: Boolean) = supportUser(JsonField.of(supportUser))

        /**
         * Sets [Builder.supportUser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportUser] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun supportUser(supportUser: JsonField<Boolean>) = apply { this.supportUser = supportUser }

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
         * Returns an immutable instance of [UserResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserResponse =
            UserResponse(
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
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UserResponse = apply {
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
            (if (contactNumber.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtEndAccess.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (firstAcceptedTermsAndConditions.asKnown().isPresent) 1 else 0) +
            (if (firstName.asKnown().isPresent) 1 else 0) +
            (if (lastAcceptedTermsAndConditions.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (if (lastName.asKnown().isPresent) 1 else 0) +
            (organizations.asKnown().getOrNull()?.size ?: 0) +
            (permissionPolicy.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (supportUser.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UserResponse &&
            id == other.id &&
            contactNumber == other.contactNumber &&
            createdBy == other.createdBy &&
            dtCreated == other.dtCreated &&
            dtEndAccess == other.dtEndAccess &&
            dtLastModified == other.dtLastModified &&
            email == other.email &&
            firstAcceptedTermsAndConditions == other.firstAcceptedTermsAndConditions &&
            firstName == other.firstName &&
            lastAcceptedTermsAndConditions == other.lastAcceptedTermsAndConditions &&
            lastModifiedBy == other.lastModifiedBy &&
            lastName == other.lastName &&
            organizations == other.organizations &&
            permissionPolicy == other.permissionPolicy &&
            supportUser == other.supportUser &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
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
            organizations,
            permissionPolicy,
            supportUser,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserResponse{id=$id, contactNumber=$contactNumber, createdBy=$createdBy, dtCreated=$dtCreated, dtEndAccess=$dtEndAccess, dtLastModified=$dtLastModified, email=$email, firstAcceptedTermsAndConditions=$firstAcceptedTermsAndConditions, firstName=$firstName, lastAcceptedTermsAndConditions=$lastAcceptedTermsAndConditions, lastModifiedBy=$lastModifiedBy, lastName=$lastName, organizations=$organizations, permissionPolicy=$permissionPolicy, supportUser=$supportUser, version=$version, additionalProperties=$additionalProperties}"
}
