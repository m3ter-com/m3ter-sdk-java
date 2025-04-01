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
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * Invite a new user to your Organization.
 *
 * This sends an email to someone inviting them to join your m3ter Organization.
 */
class UserInvitationCreateParams
private constructor(
    private val orgId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun email(): String = body.email()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun firstName(): String = body.firstName()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lastName(): String = body.lastName()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contactNumber(): Optional<String> = body.contactNumber()

    /**
     * The date when access will end for the user _(in ISO-8601 format)_. Leave blank for no end
     * date, which gives the user permanent access.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtEndAccess(): Optional<OffsetDateTime> = body.dtEndAccess()

    /**
     * The date when the invite expires _(in ISO-8601 format)_. After this date the invited user can
     * no longer accept the invite. By default, any invite is valid for 30 days from the date the
     * invite is sent.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtExpiry(): Optional<OffsetDateTime> = body.dtExpiry()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun m3terUser(): Optional<Boolean> = body.m3terUser()

    /**
     * The IDs of the permission policies the invited user has been assigned. This controls the
     * access rights and privileges that this user will have when working in the m3ter Organization.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun permissionPolicyIds(): Optional<List<String>> = body.permissionPolicyIds()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<Long> = body.version()

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _email(): JsonField<String> = body._email()

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _firstName(): JsonField<String> = body._firstName()

    /**
     * Returns the raw JSON value of [lastName].
     *
     * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lastName(): JsonField<String> = body._lastName()

    /**
     * Returns the raw JSON value of [contactNumber].
     *
     * Unlike [contactNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contactNumber(): JsonField<String> = body._contactNumber()

    /**
     * Returns the raw JSON value of [dtEndAccess].
     *
     * Unlike [dtEndAccess], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dtEndAccess(): JsonField<OffsetDateTime> = body._dtEndAccess()

    /**
     * Returns the raw JSON value of [dtExpiry].
     *
     * Unlike [dtExpiry], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dtExpiry(): JsonField<OffsetDateTime> = body._dtExpiry()

    /**
     * Returns the raw JSON value of [m3terUser].
     *
     * Unlike [m3terUser], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _m3terUser(): JsonField<Boolean> = body._m3terUser()

    /**
     * Returns the raw JSON value of [permissionPolicyIds].
     *
     * Unlike [permissionPolicyIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _permissionPolicyIds(): JsonField<List<String>> = body._permissionPolicyIds()

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UserInvitationCreateParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .email()
         * .firstName()
         * .lastName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserInvitationCreateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(userInvitationCreateParams: UserInvitationCreateParams) = apply {
            orgId = userInvitationCreateParams.orgId
            body = userInvitationCreateParams.body.toBuilder()
            additionalHeaders = userInvitationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = userInvitationCreateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        fun email(email: String) = apply { body.email(email) }

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        fun firstName(firstName: String) = apply { body.firstName(firstName) }

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { body.firstName(firstName) }

        fun lastName(lastName: String) = apply { body.lastName(lastName) }

        /**
         * Sets [Builder.lastName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lastName(lastName: JsonField<String>) = apply { body.lastName(lastName) }

        fun contactNumber(contactNumber: String) = apply { body.contactNumber(contactNumber) }

        /**
         * Sets [Builder.contactNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contactNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contactNumber(contactNumber: JsonField<String>) = apply {
            body.contactNumber(contactNumber)
        }

        /**
         * The date when access will end for the user _(in ISO-8601 format)_. Leave blank for no end
         * date, which gives the user permanent access.
         */
        fun dtEndAccess(dtEndAccess: OffsetDateTime) = apply { body.dtEndAccess(dtEndAccess) }

        /**
         * Sets [Builder.dtEndAccess] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtEndAccess] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtEndAccess(dtEndAccess: JsonField<OffsetDateTime>) = apply {
            body.dtEndAccess(dtEndAccess)
        }

        /**
         * The date when the invite expires _(in ISO-8601 format)_. After this date the invited user
         * can no longer accept the invite. By default, any invite is valid for 30 days from the
         * date the invite is sent.
         */
        fun dtExpiry(dtExpiry: OffsetDateTime) = apply { body.dtExpiry(dtExpiry) }

        /**
         * Sets [Builder.dtExpiry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtExpiry] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtExpiry(dtExpiry: JsonField<OffsetDateTime>) = apply { body.dtExpiry(dtExpiry) }

        fun m3terUser(m3terUser: Boolean) = apply { body.m3terUser(m3terUser) }

        /**
         * Sets [Builder.m3terUser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.m3terUser] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun m3terUser(m3terUser: JsonField<Boolean>) = apply { body.m3terUser(m3terUser) }

        /**
         * The IDs of the permission policies the invited user has been assigned. This controls the
         * access rights and privileges that this user will have when working in the m3ter
         * Organization.
         */
        fun permissionPolicyIds(permissionPolicyIds: List<String>) = apply {
            body.permissionPolicyIds(permissionPolicyIds)
        }

        /**
         * Sets [Builder.permissionPolicyIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.permissionPolicyIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun permissionPolicyIds(permissionPolicyIds: JsonField<List<String>>) = apply {
            body.permissionPolicyIds(permissionPolicyIds)
        }

        /**
         * Adds a single [String] to [permissionPolicyIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPermissionPolicyId(permissionPolicyId: String) = apply {
            body.addPermissionPolicyId(permissionPolicyId)
        }

        fun version(version: Long) = apply { body.version(version) }

        /**
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun version(version: JsonField<Long>) = apply { body.version(version) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [UserInvitationCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .email()
         * .firstName()
         * .lastName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UserInvitationCreateParams =
            UserInvitationCreateParams(
                checkRequired("orgId", orgId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JvmSynthetic internal fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val email: JsonField<String>,
        private val firstName: JsonField<String>,
        private val lastName: JsonField<String>,
        private val contactNumber: JsonField<String>,
        private val dtEndAccess: JsonField<OffsetDateTime>,
        private val dtExpiry: JsonField<OffsetDateTime>,
        private val m3terUser: JsonField<Boolean>,
        private val permissionPolicyIds: JsonField<List<String>>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("firstName")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lastName")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("contactNumber")
            @ExcludeMissing
            contactNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dtEndAccess")
            @ExcludeMissing
            dtEndAccess: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dtExpiry")
            @ExcludeMissing
            dtExpiry: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("m3terUser")
            @ExcludeMissing
            m3terUser: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("permissionPolicyIds")
            @ExcludeMissing
            permissionPolicyIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            email,
            firstName,
            lastName,
            contactNumber,
            dtEndAccess,
            dtExpiry,
            m3terUser,
            permissionPolicyIds,
            version,
            mutableMapOf(),
        )

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun email(): String = email.getRequired("email")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun firstName(): String = firstName.getRequired("firstName")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lastName(): String = lastName.getRequired("lastName")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contactNumber(): Optional<String> =
            Optional.ofNullable(contactNumber.getNullable("contactNumber"))

        /**
         * The date when access will end for the user _(in ISO-8601 format)_. Leave blank for no end
         * date, which gives the user permanent access.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dtEndAccess(): Optional<OffsetDateTime> =
            Optional.ofNullable(dtEndAccess.getNullable("dtEndAccess"))

        /**
         * The date when the invite expires _(in ISO-8601 format)_. After this date the invited user
         * can no longer accept the invite. By default, any invite is valid for 30 days from the
         * date the invite is sent.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dtExpiry(): Optional<OffsetDateTime> =
            Optional.ofNullable(dtExpiry.getNullable("dtExpiry"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun m3terUser(): Optional<Boolean> = Optional.ofNullable(m3terUser.getNullable("m3terUser"))

        /**
         * The IDs of the permission policies the invited user has been assigned. This controls the
         * access rights and privileges that this user will have when working in the m3ter
         * Organization.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun permissionPolicyIds(): Optional<List<String>> =
            Optional.ofNullable(permissionPolicyIds.getNullable("permissionPolicyIds"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

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
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /**
         * Returns the raw JSON value of [contactNumber].
         *
         * Unlike [contactNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contactNumber")
        @ExcludeMissing
        fun _contactNumber(): JsonField<String> = contactNumber

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
        @JsonProperty("dtExpiry")
        @ExcludeMissing
        fun _dtExpiry(): JsonField<OffsetDateTime> = dtExpiry

        /**
         * Returns the raw JSON value of [m3terUser].
         *
         * Unlike [m3terUser], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("m3terUser") @ExcludeMissing fun _m3terUser(): JsonField<Boolean> = m3terUser

        /**
         * Returns the raw JSON value of [permissionPolicyIds].
         *
         * Unlike [permissionPolicyIds], this method doesn't throw if the JSON field has an
         * unexpected type.
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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .email()
             * .firstName()
             * .lastName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var email: JsonField<String>? = null
            private var firstName: JsonField<String>? = null
            private var lastName: JsonField<String>? = null
            private var contactNumber: JsonField<String> = JsonMissing.of()
            private var dtEndAccess: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dtExpiry: JsonField<OffsetDateTime> = JsonMissing.of()
            private var m3terUser: JsonField<Boolean> = JsonMissing.of()
            private var permissionPolicyIds: JsonField<MutableList<String>>? = null
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                email = body.email
                firstName = body.firstName
                lastName = body.lastName
                contactNumber = body.contactNumber
                dtEndAccess = body.dtEndAccess
                dtExpiry = body.dtExpiry
                m3terUser = body.m3terUser
                permissionPolicyIds = body.permissionPolicyIds.map { it.toMutableList() }
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            fun contactNumber(contactNumber: String) = contactNumber(JsonField.of(contactNumber))

            /**
             * Sets [Builder.contactNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contactNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contactNumber(contactNumber: JsonField<String>) = apply {
                this.contactNumber = contactNumber
            }

            /**
             * The date when access will end for the user _(in ISO-8601 format)_. Leave blank for no
             * end date, which gives the user permanent access.
             */
            fun dtEndAccess(dtEndAccess: OffsetDateTime) = dtEndAccess(JsonField.of(dtEndAccess))

            /**
             * Sets [Builder.dtEndAccess] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dtEndAccess] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dtEndAccess(dtEndAccess: JsonField<OffsetDateTime>) = apply {
                this.dtEndAccess = dtEndAccess
            }

            /**
             * The date when the invite expires _(in ISO-8601 format)_. After this date the invited
             * user can no longer accept the invite. By default, any invite is valid for 30 days
             * from the date the invite is sent.
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

            fun m3terUser(m3terUser: Boolean) = m3terUser(JsonField.of(m3terUser))

            /**
             * Sets [Builder.m3terUser] to an arbitrary JSON value.
             *
             * You should usually call [Builder.m3terUser] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun m3terUser(m3terUser: JsonField<Boolean>) = apply { this.m3terUser = m3terUser }

            /**
             * The IDs of the permission policies the invited user has been assigned. This controls
             * the access rights and privileges that this user will have when working in the m3ter
             * Organization.
             */
            fun permissionPolicyIds(permissionPolicyIds: List<String>) =
                permissionPolicyIds(JsonField.of(permissionPolicyIds))

            /**
             * Sets [Builder.permissionPolicyIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.permissionPolicyIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
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

            fun version(version: Long) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .email()
             * .firstName()
             * .lastName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("email", email),
                    checkRequired("firstName", firstName),
                    checkRequired("lastName", lastName),
                    contactNumber,
                    dtEndAccess,
                    dtExpiry,
                    m3terUser,
                    (permissionPolicyIds ?: JsonMissing.of()).map { it.toImmutable() },
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            email()
            firstName()
            lastName()
            contactNumber()
            dtEndAccess()
            dtExpiry()
            m3terUser()
            permissionPolicyIds()
            version()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && email == other.email && firstName == other.firstName && lastName == other.lastName && contactNumber == other.contactNumber && dtEndAccess == other.dtEndAccess && dtExpiry == other.dtExpiry && m3terUser == other.m3terUser && permissionPolicyIds == other.permissionPolicyIds && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(email, firstName, lastName, contactNumber, dtEndAccess, dtExpiry, m3terUser, permissionPolicyIds, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{email=$email, firstName=$firstName, lastName=$lastName, contactNumber=$contactNumber, dtEndAccess=$dtEndAccess, dtExpiry=$dtExpiry, m3terUser=$m3terUser, permissionPolicyIds=$permissionPolicyIds, version=$version, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UserInvitationCreateParams && orgId == other.orgId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "UserInvitationCreateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
