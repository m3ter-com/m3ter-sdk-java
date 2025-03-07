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
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import java.time.OffsetDateTime
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

    fun email(): String = body.email()

    fun firstName(): String = body.firstName()

    fun lastName(): String = body.lastName()

    fun contactNumber(): Optional<String> = body.contactNumber()

    /**
     * The date when access will end for the user _(in ISO-8601 format)_. Leave blank for no end
     * date, which gives the user permanent access.
     */
    fun dtEndAccess(): Optional<OffsetDateTime> = body.dtEndAccess()

    /**
     * The date when the invite expires _(in ISO-8601 format)_. After this date the invited user can
     * no longer accept the invite. By default, any invite is valid for 30 days from the date the
     * invite is sent.
     */
    fun dtExpiry(): Optional<OffsetDateTime> = body.dtExpiry()

    fun m3terUser(): Optional<Boolean> = body.m3terUser()

    /**
     * The IDs of the permission policies the invited user has been assigned. This controls the
     * access rights and privileges that this user will have when working in the m3ter Organization.
     */
    fun permissionPolicyIds(): Optional<List<String>> = body.permissionPolicyIds()

    fun version(): Optional<Long> = body.version()

    fun _email(): JsonField<String> = body._email()

    fun _firstName(): JsonField<String> = body._firstName()

    fun _lastName(): JsonField<String> = body._lastName()

    fun _contactNumber(): JsonField<String> = body._contactNumber()

    /**
     * The date when access will end for the user _(in ISO-8601 format)_. Leave blank for no end
     * date, which gives the user permanent access.
     */
    fun _dtEndAccess(): JsonField<OffsetDateTime> = body._dtEndAccess()

    /**
     * The date when the invite expires _(in ISO-8601 format)_. After this date the invited user can
     * no longer accept the invite. By default, any invite is valid for 30 days from the date the
     * invite is sent.
     */
    fun _dtExpiry(): JsonField<OffsetDateTime> = body._dtExpiry()

    fun _m3terUser(): JsonField<Boolean> = body._m3terUser()

    /**
     * The IDs of the permission policies the invited user has been assigned. This controls the
     * access rights and privileges that this user will have when working in the m3ter Organization.
     */
    fun _permissionPolicyIds(): JsonField<List<String>> = body._permissionPolicyIds()

    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> orgId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("firstName")
        @ExcludeMissing
        private val firstName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastName")
        @ExcludeMissing
        private val lastName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contactNumber")
        @ExcludeMissing
        private val contactNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dtEndAccess")
        @ExcludeMissing
        private val dtEndAccess: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtExpiry")
        @ExcludeMissing
        private val dtExpiry: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("m3terUser")
        @ExcludeMissing
        private val m3terUser: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("permissionPolicyIds")
        @ExcludeMissing
        private val permissionPolicyIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun email(): String = email.getRequired("email")

        fun firstName(): String = firstName.getRequired("firstName")

        fun lastName(): String = lastName.getRequired("lastName")

        fun contactNumber(): Optional<String> =
            Optional.ofNullable(contactNumber.getNullable("contactNumber"))

        /**
         * The date when access will end for the user _(in ISO-8601 format)_. Leave blank for no end
         * date, which gives the user permanent access.
         */
        fun dtEndAccess(): Optional<OffsetDateTime> =
            Optional.ofNullable(dtEndAccess.getNullable("dtEndAccess"))

        /**
         * The date when the invite expires _(in ISO-8601 format)_. After this date the invited user
         * can no longer accept the invite. By default, any invite is valid for 30 days from the
         * date the invite is sent.
         */
        fun dtExpiry(): Optional<OffsetDateTime> =
            Optional.ofNullable(dtExpiry.getNullable("dtExpiry"))

        fun m3terUser(): Optional<Boolean> = Optional.ofNullable(m3terUser.getNullable("m3terUser"))

        /**
         * The IDs of the permission policies the invited user has been assigned. This controls the
         * access rights and privileges that this user will have when working in the m3ter
         * Organization.
         */
        fun permissionPolicyIds(): Optional<List<String>> =
            Optional.ofNullable(permissionPolicyIds.getNullable("permissionPolicyIds"))

        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        @JsonProperty("contactNumber")
        @ExcludeMissing
        fun _contactNumber(): JsonField<String> = contactNumber

        /**
         * The date when access will end for the user _(in ISO-8601 format)_. Leave blank for no end
         * date, which gives the user permanent access.
         */
        @JsonProperty("dtEndAccess")
        @ExcludeMissing
        fun _dtEndAccess(): JsonField<OffsetDateTime> = dtEndAccess

        /**
         * The date when the invite expires _(in ISO-8601 format)_. After this date the invited user
         * can no longer accept the invite. By default, any invite is valid for 30 days from the
         * date the invite is sent.
         */
        @JsonProperty("dtExpiry")
        @ExcludeMissing
        fun _dtExpiry(): JsonField<OffsetDateTime> = dtExpiry

        @JsonProperty("m3terUser") @ExcludeMissing fun _m3terUser(): JsonField<Boolean> = m3terUser

        /**
         * The IDs of the permission policies the invited user has been assigned. This controls the
         * access rights and privileges that this user will have when working in the m3ter
         * Organization.
         */
        @JsonProperty("permissionPolicyIds")
        @ExcludeMissing
        fun _permissionPolicyIds(): JsonField<List<String>> = permissionPolicyIds

        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun email(email: JsonField<String>) = apply { this.email = email }

            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            fun contactNumber(contactNumber: String) = contactNumber(JsonField.of(contactNumber))

            fun contactNumber(contactNumber: JsonField<String>) = apply {
                this.contactNumber = contactNumber
            }

            /**
             * The date when access will end for the user _(in ISO-8601 format)_. Leave blank for no
             * end date, which gives the user permanent access.
             */
            fun dtEndAccess(dtEndAccess: OffsetDateTime) = dtEndAccess(JsonField.of(dtEndAccess))

            /**
             * The date when access will end for the user _(in ISO-8601 format)_. Leave blank for no
             * end date, which gives the user permanent access.
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
             * The date when the invite expires _(in ISO-8601 format)_. After this date the invited
             * user can no longer accept the invite. By default, any invite is valid for 30 days
             * from the date the invite is sent.
             */
            fun dtExpiry(dtExpiry: JsonField<OffsetDateTime>) = apply { this.dtExpiry = dtExpiry }

            fun m3terUser(m3terUser: Boolean) = m3terUser(JsonField.of(m3terUser))

            fun m3terUser(m3terUser: JsonField<Boolean>) = apply { this.m3terUser = m3terUser }

            /**
             * The IDs of the permission policies the invited user has been assigned. This controls
             * the access rights and privileges that this user will have when working in the m3ter
             * Organization.
             */
            fun permissionPolicyIds(permissionPolicyIds: List<String>) =
                permissionPolicyIds(JsonField.of(permissionPolicyIds))

            /**
             * The IDs of the permission policies the invited user has been assigned. This controls
             * the access rights and privileges that this user will have when working in the m3ter
             * Organization.
             */
            fun permissionPolicyIds(permissionPolicyIds: JsonField<List<String>>) = apply {
                this.permissionPolicyIds = permissionPolicyIds.map { it.toMutableList() }
            }

            /**
             * The IDs of the permission policies the invited user has been assigned. This controls
             * the access rights and privileges that this user will have when working in the m3ter
             * Organization.
             */
            fun addPermissionPolicyId(permissionPolicyId: String) = apply {
                permissionPolicyIds =
                    (permissionPolicyIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("permissionPolicyIds", it).add(permissionPolicyId)
                    }
            }

            fun version(version: Long) = version(JsonField.of(version))

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
                    additionalProperties.toImmutable(),
                )
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
    @NoAutoDetect
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

        fun email(email: JsonField<String>) = apply { body.email(email) }

        fun firstName(firstName: String) = apply { body.firstName(firstName) }

        fun firstName(firstName: JsonField<String>) = apply { body.firstName(firstName) }

        fun lastName(lastName: String) = apply { body.lastName(lastName) }

        fun lastName(lastName: JsonField<String>) = apply { body.lastName(lastName) }

        fun contactNumber(contactNumber: String) = apply { body.contactNumber(contactNumber) }

        fun contactNumber(contactNumber: JsonField<String>) = apply {
            body.contactNumber(contactNumber)
        }

        /**
         * The date when access will end for the user _(in ISO-8601 format)_. Leave blank for no end
         * date, which gives the user permanent access.
         */
        fun dtEndAccess(dtEndAccess: OffsetDateTime) = apply { body.dtEndAccess(dtEndAccess) }

        /**
         * The date when access will end for the user _(in ISO-8601 format)_. Leave blank for no end
         * date, which gives the user permanent access.
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
         * The date when the invite expires _(in ISO-8601 format)_. After this date the invited user
         * can no longer accept the invite. By default, any invite is valid for 30 days from the
         * date the invite is sent.
         */
        fun dtExpiry(dtExpiry: JsonField<OffsetDateTime>) = apply { body.dtExpiry(dtExpiry) }

        fun m3terUser(m3terUser: Boolean) = apply { body.m3terUser(m3terUser) }

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
         * The IDs of the permission policies the invited user has been assigned. This controls the
         * access rights and privileges that this user will have when working in the m3ter
         * Organization.
         */
        fun permissionPolicyIds(permissionPolicyIds: JsonField<List<String>>) = apply {
            body.permissionPolicyIds(permissionPolicyIds)
        }

        /**
         * The IDs of the permission policies the invited user has been assigned. This controls the
         * access rights and privileges that this user will have when working in the m3ter
         * Organization.
         */
        fun addPermissionPolicyId(permissionPolicyId: String) = apply {
            body.addPermissionPolicyId(permissionPolicyId)
        }

        fun version(version: Long) = apply { body.version(version) }

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

        fun build(): UserInvitationCreateParams =
            UserInvitationCreateParams(
                checkRequired("orgId", orgId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
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
