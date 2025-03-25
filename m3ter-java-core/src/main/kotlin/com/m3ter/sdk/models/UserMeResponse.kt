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
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

class UserMeResponse
private constructor(
    private val organization: JsonField<Organization>,
    private val serviceUser: JsonField<ServiceUser>,
    private val user: JsonField<User>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("organization")
        @ExcludeMissing
        organization: JsonField<Organization> = JsonMissing.of(),
        @JsonProperty("serviceUser")
        @ExcludeMissing
        serviceUser: JsonField<ServiceUser> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing user: JsonField<User> = JsonMissing.of(),
    ) : this(organization, serviceUser, user, mutableMapOf())

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun organization(): Optional<Organization> =
        Optional.ofNullable(organization.getNullable("organization"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceUser(): Optional<ServiceUser> =
        Optional.ofNullable(serviceUser.getNullable("serviceUser"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun user(): Optional<User> = Optional.ofNullable(user.getNullable("user"))

    /**
     * Returns the raw JSON value of [organization].
     *
     * Unlike [organization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("organization")
    @ExcludeMissing
    fun _organization(): JsonField<Organization> = organization

    /**
     * Returns the raw JSON value of [serviceUser].
     *
     * Unlike [serviceUser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("serviceUser")
    @ExcludeMissing
    fun _serviceUser(): JsonField<ServiceUser> = serviceUser

    /**
     * Returns the raw JSON value of [user].
     *
     * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<User> = user

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

        /** Returns a mutable builder for constructing an instance of [UserMeResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UserMeResponse]. */
    class Builder internal constructor() {

        private var organization: JsonField<Organization> = JsonMissing.of()
        private var serviceUser: JsonField<ServiceUser> = JsonMissing.of()
        private var user: JsonField<User> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(userMeResponse: UserMeResponse) = apply {
            organization = userMeResponse.organization
            serviceUser = userMeResponse.serviceUser
            user = userMeResponse.user
            additionalProperties = userMeResponse.additionalProperties.toMutableMap()
        }

        fun organization(organization: Organization) = organization(JsonField.of(organization))

        /**
         * Sets [Builder.organization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.organization] with a well-typed [Organization] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun organization(organization: JsonField<Organization>) = apply {
            this.organization = organization
        }

        fun serviceUser(serviceUser: ServiceUser) = serviceUser(JsonField.of(serviceUser))

        /**
         * Sets [Builder.serviceUser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceUser] with a well-typed [ServiceUser] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun serviceUser(serviceUser: JsonField<ServiceUser>) = apply {
            this.serviceUser = serviceUser
        }

        fun user(user: User) = user(JsonField.of(user))

        /**
         * Sets [Builder.user] to an arbitrary JSON value.
         *
         * You should usually call [Builder.user] with a well-typed [User] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun user(user: JsonField<User>) = apply { this.user = user }

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
         * Returns an immutable instance of [UserMeResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UserMeResponse =
            UserMeResponse(organization, serviceUser, user, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): UserMeResponse = apply {
        if (validated) {
            return@apply
        }

        organization().ifPresent { it.validate() }
        serviceUser().ifPresent { it.validate() }
        user().ifPresent { it.validate() }
        validated = true
    }

    class Organization
    private constructor(
        private val id: JsonField<String>,
        private val version: JsonField<Long>,
        private val addressLine1: JsonField<String>,
        private val addressLine2: JsonField<String>,
        private val addressLine3: JsonField<String>,
        private val addressLine4: JsonField<String>,
        private val billingContactUserId1: JsonField<String>,
        private val billingContactUserId2: JsonField<String>,
        private val billingContactUserId3: JsonField<String>,
        private val country: JsonField<String>,
        private val createdBy: JsonField<String>,
        private val customerId: JsonField<String>,
        private val dtCreated: JsonField<OffsetDateTime>,
        private val dtLastModified: JsonField<OffsetDateTime>,
        private val invoiceGeneralReference: JsonField<String>,
        private val lastModifiedBy: JsonField<String>,
        private val locality: JsonField<String>,
        private val organizationName: JsonField<String>,
        private val orgId: JsonField<String>,
        private val postCode: JsonField<String>,
        private val purchaseOrderNumber: JsonField<String>,
        private val region: JsonField<String>,
        private val shortName: JsonField<String>,
        private val status: JsonField<Status>,
        private val taxId: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("addressLine1")
            @ExcludeMissing
            addressLine1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("addressLine2")
            @ExcludeMissing
            addressLine2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("addressLine3")
            @ExcludeMissing
            addressLine3: JsonField<String> = JsonMissing.of(),
            @JsonProperty("addressLine4")
            @ExcludeMissing
            addressLine4: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billingContactUserId1")
            @ExcludeMissing
            billingContactUserId1: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billingContactUserId2")
            @ExcludeMissing
            billingContactUserId2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billingContactUserId3")
            @ExcludeMissing
            billingContactUserId3: JsonField<String> = JsonMissing.of(),
            @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customerId")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dtCreated")
            @ExcludeMissing
            dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dtLastModified")
            @ExcludeMissing
            dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("invoiceGeneralReference")
            @ExcludeMissing
            invoiceGeneralReference: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lastModifiedBy")
            @ExcludeMissing
            lastModifiedBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locality")
            @ExcludeMissing
            locality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("organizationName")
            @ExcludeMissing
            organizationName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("orgId") @ExcludeMissing orgId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("postCode")
            @ExcludeMissing
            postCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("purchaseOrderNumber")
            @ExcludeMissing
            purchaseOrderNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("shortName")
            @ExcludeMissing
            shortName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("taxId") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(
            id,
            version,
            addressLine1,
            addressLine2,
            addressLine3,
            addressLine4,
            billingContactUserId1,
            billingContactUserId2,
            billingContactUserId3,
            country,
            createdBy,
            customerId,
            dtCreated,
            dtLastModified,
            invoiceGeneralReference,
            lastModifiedBy,
            locality,
            organizationName,
            orgId,
            postCode,
            purchaseOrderNumber,
            region,
            shortName,
            status,
            taxId,
            type,
            mutableMapOf(),
        )

        /**
         * The UUID of the entity.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The version number:
         * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
         *   response.
         * - **Update:** On successful Update, the version is incremented by 1 in the response.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun version(): Long = version.getRequired("version")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addressLine1(): Optional<String> =
            Optional.ofNullable(addressLine1.getNullable("addressLine1"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addressLine2(): Optional<String> =
            Optional.ofNullable(addressLine2.getNullable("addressLine2"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addressLine3(): Optional<String> =
            Optional.ofNullable(addressLine3.getNullable("addressLine3"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addressLine4(): Optional<String> =
            Optional.ofNullable(addressLine4.getNullable("addressLine4"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingContactUserId1(): Optional<String> =
            Optional.ofNullable(billingContactUserId1.getNullable("billingContactUserId1"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingContactUserId2(): Optional<String> =
            Optional.ofNullable(billingContactUserId2.getNullable("billingContactUserId2"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingContactUserId3(): Optional<String> =
            Optional.ofNullable(billingContactUserId3.getNullable("billingContactUserId3"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun country(): Optional<String> = Optional.ofNullable(country.getNullable("country"))

        /**
         * The id of the user who created this organization.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customerId(): Optional<String> =
            Optional.ofNullable(customerId.getNullable("customerId"))

        /**
         * The DateTime when the organization was created.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dtCreated(): Optional<OffsetDateTime> =
            Optional.ofNullable(dtCreated.getNullable("dtCreated"))

        /**
         * The DateTime when the organization was last modified.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dtLastModified(): Optional<OffsetDateTime> =
            Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invoiceGeneralReference(): Optional<String> =
            Optional.ofNullable(invoiceGeneralReference.getNullable("invoiceGeneralReference"))

        /**
         * The id of the user who last modified this organization.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastModifiedBy(): Optional<String> =
            Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun locality(): Optional<String> = Optional.ofNullable(locality.getNullable("locality"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organizationName(): Optional<String> =
            Optional.ofNullable(organizationName.getNullable("organizationName"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun orgId(): Optional<String> = Optional.ofNullable(orgId.getNullable("orgId"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun postCode(): Optional<String> = Optional.ofNullable(postCode.getNullable("postCode"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun purchaseOrderNumber(): Optional<String> =
            Optional.ofNullable(purchaseOrderNumber.getNullable("purchaseOrderNumber"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun region(): Optional<String> = Optional.ofNullable(region.getNullable("region"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun shortName(): Optional<String> = Optional.ofNullable(shortName.getNullable("shortName"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun taxId(): Optional<String> = Optional.ofNullable(taxId.getNullable("taxId"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [version].
         *
         * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

        /**
         * Returns the raw JSON value of [addressLine1].
         *
         * Unlike [addressLine1], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("addressLine1")
        @ExcludeMissing
        fun _addressLine1(): JsonField<String> = addressLine1

        /**
         * Returns the raw JSON value of [addressLine2].
         *
         * Unlike [addressLine2], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("addressLine2")
        @ExcludeMissing
        fun _addressLine2(): JsonField<String> = addressLine2

        /**
         * Returns the raw JSON value of [addressLine3].
         *
         * Unlike [addressLine3], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("addressLine3")
        @ExcludeMissing
        fun _addressLine3(): JsonField<String> = addressLine3

        /**
         * Returns the raw JSON value of [addressLine4].
         *
         * Unlike [addressLine4], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("addressLine4")
        @ExcludeMissing
        fun _addressLine4(): JsonField<String> = addressLine4

        /**
         * Returns the raw JSON value of [billingContactUserId1].
         *
         * Unlike [billingContactUserId1], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("billingContactUserId1")
        @ExcludeMissing
        fun _billingContactUserId1(): JsonField<String> = billingContactUserId1

        /**
         * Returns the raw JSON value of [billingContactUserId2].
         *
         * Unlike [billingContactUserId2], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("billingContactUserId2")
        @ExcludeMissing
        fun _billingContactUserId2(): JsonField<String> = billingContactUserId2

        /**
         * Returns the raw JSON value of [billingContactUserId3].
         *
         * Unlike [billingContactUserId3], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("billingContactUserId3")
        @ExcludeMissing
        fun _billingContactUserId3(): JsonField<String> = billingContactUserId3

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /**
         * Returns the raw JSON value of [createdBy].
         *
         * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customerId")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

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
         * Unlike [dtLastModified], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

        /**
         * Returns the raw JSON value of [invoiceGeneralReference].
         *
         * Unlike [invoiceGeneralReference], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("invoiceGeneralReference")
        @ExcludeMissing
        fun _invoiceGeneralReference(): JsonField<String> = invoiceGeneralReference

        /**
         * Returns the raw JSON value of [lastModifiedBy].
         *
         * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

        /**
         * Returns the raw JSON value of [locality].
         *
         * Unlike [locality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

        /**
         * Returns the raw JSON value of [organizationName].
         *
         * Unlike [organizationName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organizationName")
        @ExcludeMissing
        fun _organizationName(): JsonField<String> = organizationName

        /**
         * Returns the raw JSON value of [orgId].
         *
         * Unlike [orgId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("orgId") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

        /**
         * Returns the raw JSON value of [postCode].
         *
         * Unlike [postCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("postCode") @ExcludeMissing fun _postCode(): JsonField<String> = postCode

        /**
         * Returns the raw JSON value of [purchaseOrderNumber].
         *
         * Unlike [purchaseOrderNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("purchaseOrderNumber")
        @ExcludeMissing
        fun _purchaseOrderNumber(): JsonField<String> = purchaseOrderNumber

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        /**
         * Returns the raw JSON value of [shortName].
         *
         * Unlike [shortName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shortName") @ExcludeMissing fun _shortName(): JsonField<String> = shortName

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [taxId].
         *
         * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("taxId") @ExcludeMissing fun _taxId(): JsonField<String> = taxId

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [Organization].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .version()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Organization]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var version: JsonField<Long>? = null
            private var addressLine1: JsonField<String> = JsonMissing.of()
            private var addressLine2: JsonField<String> = JsonMissing.of()
            private var addressLine3: JsonField<String> = JsonMissing.of()
            private var addressLine4: JsonField<String> = JsonMissing.of()
            private var billingContactUserId1: JsonField<String> = JsonMissing.of()
            private var billingContactUserId2: JsonField<String> = JsonMissing.of()
            private var billingContactUserId3: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var customerId: JsonField<String> = JsonMissing.of()
            private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
            private var invoiceGeneralReference: JsonField<String> = JsonMissing.of()
            private var lastModifiedBy: JsonField<String> = JsonMissing.of()
            private var locality: JsonField<String> = JsonMissing.of()
            private var organizationName: JsonField<String> = JsonMissing.of()
            private var orgId: JsonField<String> = JsonMissing.of()
            private var postCode: JsonField<String> = JsonMissing.of()
            private var purchaseOrderNumber: JsonField<String> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var shortName: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var taxId: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(organization: Organization) = apply {
                id = organization.id
                version = organization.version
                addressLine1 = organization.addressLine1
                addressLine2 = organization.addressLine2
                addressLine3 = organization.addressLine3
                addressLine4 = organization.addressLine4
                billingContactUserId1 = organization.billingContactUserId1
                billingContactUserId2 = organization.billingContactUserId2
                billingContactUserId3 = organization.billingContactUserId3
                country = organization.country
                createdBy = organization.createdBy
                customerId = organization.customerId
                dtCreated = organization.dtCreated
                dtLastModified = organization.dtLastModified
                invoiceGeneralReference = organization.invoiceGeneralReference
                lastModifiedBy = organization.lastModifiedBy
                locality = organization.locality
                organizationName = organization.organizationName
                orgId = organization.orgId
                postCode = organization.postCode
                purchaseOrderNumber = organization.purchaseOrderNumber
                region = organization.region
                shortName = organization.shortName
                status = organization.status
                taxId = organization.taxId
                type = organization.type
                additionalProperties = organization.additionalProperties.toMutableMap()
            }

            /** The UUID of the entity. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * The version number:
             * - **Create:** On initial Create to insert a new entity, the version is set at 1 in
             *   the response.
             * - **Update:** On successful Update, the version is incremented by 1 in the response.
             */
            fun version(version: Long) = version(JsonField.of(version))

            /**
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun version(version: JsonField<Long>) = apply { this.version = version }

            fun addressLine1(addressLine1: String) = addressLine1(JsonField.of(addressLine1))

            /**
             * Sets [Builder.addressLine1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addressLine1] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addressLine1(addressLine1: JsonField<String>) = apply {
                this.addressLine1 = addressLine1
            }

            fun addressLine2(addressLine2: String) = addressLine2(JsonField.of(addressLine2))

            /**
             * Sets [Builder.addressLine2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addressLine2] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addressLine2(addressLine2: JsonField<String>) = apply {
                this.addressLine2 = addressLine2
            }

            fun addressLine3(addressLine3: String) = addressLine3(JsonField.of(addressLine3))

            /**
             * Sets [Builder.addressLine3] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addressLine3] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addressLine3(addressLine3: JsonField<String>) = apply {
                this.addressLine3 = addressLine3
            }

            fun addressLine4(addressLine4: String) = addressLine4(JsonField.of(addressLine4))

            /**
             * Sets [Builder.addressLine4] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addressLine4] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addressLine4(addressLine4: JsonField<String>) = apply {
                this.addressLine4 = addressLine4
            }

            fun billingContactUserId1(billingContactUserId1: String) =
                billingContactUserId1(JsonField.of(billingContactUserId1))

            /**
             * Sets [Builder.billingContactUserId1] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingContactUserId1] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingContactUserId1(billingContactUserId1: JsonField<String>) = apply {
                this.billingContactUserId1 = billingContactUserId1
            }

            fun billingContactUserId2(billingContactUserId2: String) =
                billingContactUserId2(JsonField.of(billingContactUserId2))

            /**
             * Sets [Builder.billingContactUserId2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingContactUserId2] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingContactUserId2(billingContactUserId2: JsonField<String>) = apply {
                this.billingContactUserId2 = billingContactUserId2
            }

            fun billingContactUserId3(billingContactUserId3: String) =
                billingContactUserId3(JsonField.of(billingContactUserId3))

            /**
             * Sets [Builder.billingContactUserId3] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingContactUserId3] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingContactUserId3(billingContactUserId3: JsonField<String>) = apply {
                this.billingContactUserId3 = billingContactUserId3
            }

            fun country(country: String) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** The id of the user who created this organization. */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** The DateTime when the organization was created. */
            fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

            /**
             * Sets [Builder.dtCreated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply {
                this.dtCreated = dtCreated
            }

            /** The DateTime when the organization was last modified. */
            fun dtLastModified(dtLastModified: OffsetDateTime) =
                dtLastModified(JsonField.of(dtLastModified))

            /**
             * Sets [Builder.dtLastModified] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dtLastModified] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
                this.dtLastModified = dtLastModified
            }

            fun invoiceGeneralReference(invoiceGeneralReference: String) =
                invoiceGeneralReference(JsonField.of(invoiceGeneralReference))

            /**
             * Sets [Builder.invoiceGeneralReference] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceGeneralReference] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun invoiceGeneralReference(invoiceGeneralReference: JsonField<String>) = apply {
                this.invoiceGeneralReference = invoiceGeneralReference
            }

            /** The id of the user who last modified this organization. */
            fun lastModifiedBy(lastModifiedBy: String) =
                lastModifiedBy(JsonField.of(lastModifiedBy))

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

            fun locality(locality: String) = locality(JsonField.of(locality))

            /**
             * Sets [Builder.locality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locality] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            fun organizationName(organizationName: String) =
                organizationName(JsonField.of(organizationName))

            /**
             * Sets [Builder.organizationName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organizationName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun organizationName(organizationName: JsonField<String>) = apply {
                this.organizationName = organizationName
            }

            fun orgId(orgId: String) = orgId(JsonField.of(orgId))

            /**
             * Sets [Builder.orgId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orgId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

            fun postCode(postCode: String) = postCode(JsonField.of(postCode))

            /**
             * Sets [Builder.postCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun postCode(postCode: JsonField<String>) = apply { this.postCode = postCode }

            fun purchaseOrderNumber(purchaseOrderNumber: String) =
                purchaseOrderNumber(JsonField.of(purchaseOrderNumber))

            /**
             * Sets [Builder.purchaseOrderNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.purchaseOrderNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun purchaseOrderNumber(purchaseOrderNumber: JsonField<String>) = apply {
                this.purchaseOrderNumber = purchaseOrderNumber
            }

            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

            fun shortName(shortName: String) = shortName(JsonField.of(shortName))

            /**
             * Sets [Builder.shortName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shortName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shortName(shortName: JsonField<String>) = apply { this.shortName = shortName }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun taxId(taxId: String) = taxId(JsonField.of(taxId))

            /**
             * Sets [Builder.taxId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxId(taxId: JsonField<String>) = apply { this.taxId = taxId }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Organization].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .version()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Organization =
                Organization(
                    checkRequired("id", id),
                    checkRequired("version", version),
                    addressLine1,
                    addressLine2,
                    addressLine3,
                    addressLine4,
                    billingContactUserId1,
                    billingContactUserId2,
                    billingContactUserId3,
                    country,
                    createdBy,
                    customerId,
                    dtCreated,
                    dtLastModified,
                    invoiceGeneralReference,
                    lastModifiedBy,
                    locality,
                    organizationName,
                    orgId,
                    postCode,
                    purchaseOrderNumber,
                    region,
                    shortName,
                    status,
                    taxId,
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Organization = apply {
            if (validated) {
                return@apply
            }

            id()
            version()
            addressLine1()
            addressLine2()
            addressLine3()
            addressLine4()
            billingContactUserId1()
            billingContactUserId2()
            billingContactUserId3()
            country()
            createdBy()
            customerId()
            dtCreated()
            dtLastModified()
            invoiceGeneralReference()
            lastModifiedBy()
            locality()
            organizationName()
            orgId()
            postCode()
            purchaseOrderNumber()
            region()
            shortName()
            status()
            taxId()
            type()
            validated = true
        }

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ACTIVE = of("ACTIVE")

                @JvmField val ARCHIVED = of("ARCHIVED")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                ACTIVE,
                ARCHIVED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACTIVE,
                ARCHIVED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACTIVE -> Value.ACTIVE
                    ARCHIVED -> Value.ARCHIVED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws M3terInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ACTIVE -> Known.ACTIVE
                    ARCHIVED -> Known.ARCHIVED
                    else -> throw M3terInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws M3terInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    M3terInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Status && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PRODUCTION = of("PRODUCTION")

                @JvmField val SANDBOX = of("SANDBOX")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                PRODUCTION,
                SANDBOX,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PRODUCTION,
                SANDBOX,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PRODUCTION -> Value.PRODUCTION
                    SANDBOX -> Value.SANDBOX
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws M3terInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PRODUCTION -> Known.PRODUCTION
                    SANDBOX -> Known.SANDBOX
                    else -> throw M3terInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws M3terInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    M3terInvalidDataException("Value is not a String")
                }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Organization && id == other.id && version == other.version && addressLine1 == other.addressLine1 && addressLine2 == other.addressLine2 && addressLine3 == other.addressLine3 && addressLine4 == other.addressLine4 && billingContactUserId1 == other.billingContactUserId1 && billingContactUserId2 == other.billingContactUserId2 && billingContactUserId3 == other.billingContactUserId3 && country == other.country && createdBy == other.createdBy && customerId == other.customerId && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && invoiceGeneralReference == other.invoiceGeneralReference && lastModifiedBy == other.lastModifiedBy && locality == other.locality && organizationName == other.organizationName && orgId == other.orgId && postCode == other.postCode && purchaseOrderNumber == other.purchaseOrderNumber && region == other.region && shortName == other.shortName && status == other.status && taxId == other.taxId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, version, addressLine1, addressLine2, addressLine3, addressLine4, billingContactUserId1, billingContactUserId2, billingContactUserId3, country, createdBy, customerId, dtCreated, dtLastModified, invoiceGeneralReference, lastModifiedBy, locality, organizationName, orgId, postCode, purchaseOrderNumber, region, shortName, status, taxId, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Organization{id=$id, version=$version, addressLine1=$addressLine1, addressLine2=$addressLine2, addressLine3=$addressLine3, addressLine4=$addressLine4, billingContactUserId1=$billingContactUserId1, billingContactUserId2=$billingContactUserId2, billingContactUserId3=$billingContactUserId3, country=$country, createdBy=$createdBy, customerId=$customerId, dtCreated=$dtCreated, dtLastModified=$dtLastModified, invoiceGeneralReference=$invoiceGeneralReference, lastModifiedBy=$lastModifiedBy, locality=$locality, organizationName=$organizationName, orgId=$orgId, postCode=$postCode, purchaseOrderNumber=$purchaseOrderNumber, region=$region, shortName=$shortName, status=$status, taxId=$taxId, type=$type, additionalProperties=$additionalProperties}"
    }

    class ServiceUser
    private constructor(
        private val id: JsonField<String>,
        private val createdBy: JsonField<String>,
        private val dtCreated: JsonField<OffsetDateTime>,
        private val dtLastModified: JsonField<OffsetDateTime>,
        private val lastModifiedBy: JsonField<String>,
        private val name: JsonField<String>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dtCreated")
            @ExcludeMissing
            dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dtLastModified")
            @ExcludeMissing
            dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("lastModifiedBy")
            @ExcludeMissing
            lastModifiedBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            id,
            createdBy,
            dtCreated,
            dtLastModified,
            lastModifiedBy,
            name,
            version,
            mutableMapOf(),
        )

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

        /**
         * The id of the user who created this service user.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

        /**
         * The DateTime when the service user was created.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dtCreated(): Optional<OffsetDateTime> =
            Optional.ofNullable(dtCreated.getNullable("dtCreated"))

        /**
         * The DateTime when the service user was last modified.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dtLastModified(): Optional<OffsetDateTime> =
            Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

        /**
         * The id of the user who last modified this service user.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastModifiedBy(): Optional<String> =
            Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

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
         * Unlike [dtLastModified], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

        /**
         * Returns the raw JSON value of [lastModifiedBy].
         *
         * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

            /** Returns a mutable builder for constructing an instance of [ServiceUser]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ServiceUser]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
            private var lastModifiedBy: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(serviceUser: ServiceUser) = apply {
                id = serviceUser.id
                createdBy = serviceUser.createdBy
                dtCreated = serviceUser.dtCreated
                dtLastModified = serviceUser.dtLastModified
                lastModifiedBy = serviceUser.lastModifiedBy
                name = serviceUser.name
                version = serviceUser.version
                additionalProperties = serviceUser.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The id of the user who created this service user. */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            /** The DateTime when the service user was created. */
            fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

            /**
             * Sets [Builder.dtCreated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply {
                this.dtCreated = dtCreated
            }

            /** The DateTime when the service user was last modified. */
            fun dtLastModified(dtLastModified: OffsetDateTime) =
                dtLastModified(JsonField.of(dtLastModified))

            /**
             * Sets [Builder.dtLastModified] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dtLastModified] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
                this.dtLastModified = dtLastModified
            }

            /** The id of the user who last modified this service user. */
            fun lastModifiedBy(lastModifiedBy: String) =
                lastModifiedBy(JsonField.of(lastModifiedBy))

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

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [ServiceUser].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ServiceUser =
                ServiceUser(
                    id,
                    createdBy,
                    dtCreated,
                    dtLastModified,
                    lastModifiedBy,
                    name,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ServiceUser = apply {
            if (validated) {
                return@apply
            }

            id()
            createdBy()
            dtCreated()
            dtLastModified()
            lastModifiedBy()
            name()
            version()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ServiceUser && id == other.id && createdBy == other.createdBy && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && name == other.name && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, createdBy, dtCreated, dtLastModified, lastModifiedBy, name, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ServiceUser{id=$id, createdBy=$createdBy, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, name=$name, version=$version, additionalProperties=$additionalProperties}"
    }

    class User
    private constructor(
        private val id: JsonField<String>,
        private val contactNumber: JsonField<String>,
        private val createdBy: JsonField<String>,
        private val dtCreated: JsonField<OffsetDateTime>,
        private val dtLastModified: JsonField<OffsetDateTime>,
        private val email: JsonField<String>,
        private val firstAcceptedTermsAndConditions: JsonField<OffsetDateTime>,
        private val firstName: JsonField<String>,
        private val lastAcceptedTermsAndConditions: JsonField<OffsetDateTime>,
        private val lastModifiedBy: JsonField<String>,
        private val lastName: JsonField<String>,
        private val organizations: JsonField<List<String>>,
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
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dtCreated")
            @ExcludeMissing
            dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("dtLastModified")
            @ExcludeMissing
            dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("firstAcceptedTermsAndConditions")
            @ExcludeMissing
            firstAcceptedTermsAndConditions: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("firstName")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lastAcceptedTermsAndConditions")
            @ExcludeMissing
            lastAcceptedTermsAndConditions: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("lastModifiedBy")
            @ExcludeMissing
            lastModifiedBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("lastName")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("organizations")
            @ExcludeMissing
            organizations: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("supportUser")
            @ExcludeMissing
            supportUser: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            id,
            contactNumber,
            createdBy,
            dtCreated,
            dtLastModified,
            email,
            firstAcceptedTermsAndConditions,
            firstName,
            lastAcceptedTermsAndConditions,
            lastModifiedBy,
            lastName,
            organizations,
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
        fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

        /**
         * The user's contact telephone number.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun contactNumber(): Optional<String> =
            Optional.ofNullable(contactNumber.getNullable("contactNumber"))

        /**
         * The user who created this user.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

        /**
         * The date and time _(in ISO-8601 format)_ when the user was created.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dtCreated(): Optional<OffsetDateTime> =
            Optional.ofNullable(dtCreated.getNullable("dtCreated"))

        /**
         * The date and time _(in ISO-8601 format)_ when the user was last modified.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dtLastModified(): Optional<OffsetDateTime> =
            Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

        /**
         * The email address for this user.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

        /**
         * The date and time _(in ISO 8601 format)_ when this user first accepted the the m3ter
         * terms and conditions.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun firstAcceptedTermsAndConditions(): Optional<OffsetDateTime> =
            Optional.ofNullable(
                firstAcceptedTermsAndConditions.getNullable("firstAcceptedTermsAndConditions")
            )

        /**
         * The first name of the user.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun firstName(): Optional<String> = Optional.ofNullable(firstName.getNullable("firstName"))

        /**
         * The date and time _(in ISO 8601 format)_ when this user last accepted the the m3ter terms
         * and conditions.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastAcceptedTermsAndConditions(): Optional<OffsetDateTime> =
            Optional.ofNullable(
                lastAcceptedTermsAndConditions.getNullable("lastAcceptedTermsAndConditions")
            )

        /**
         * The unique identifier (UUID) of the user who last modified this user record.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastModifiedBy(): Optional<String> =
            Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

        /**
         * The surname of the user.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastName(): Optional<String> = Optional.ofNullable(lastName.getNullable("lastName"))

        /**
         * An array listing the Organizations where this user has access.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun organizations(): Optional<List<String>> =
            Optional.ofNullable(organizations.getNullable("organizations"))

        /**
         * Indicates whether this is a m3ter Support user.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun supportUser(): Optional<Boolean> =
            Optional.ofNullable(supportUser.getNullable("supportUser"))

        /**
         * The version number:
         * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
         *   response.
         * - **Update:** On successful Update, the version is incremented by 1 in the response.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
         * Unlike [dtLastModified], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [firstAcceptedTermsAndConditions], this method doesn't throw if the JSON field has
         * an unexpected type.
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
         * Unlike [lastAcceptedTermsAndConditions], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("lastAcceptedTermsAndConditions")
        @ExcludeMissing
        fun _lastAcceptedTermsAndConditions(): JsonField<OffsetDateTime> =
            lastAcceptedTermsAndConditions

        /**
         * Returns the raw JSON value of [lastModifiedBy].
         *
         * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [organizations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("organizations")
        @ExcludeMissing
        fun _organizations(): JsonField<List<String>> = organizations

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

            /** Returns a mutable builder for constructing an instance of [User]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [User]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var contactNumber: JsonField<String> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var firstAcceptedTermsAndConditions: JsonField<OffsetDateTime> =
                JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var lastAcceptedTermsAndConditions: JsonField<OffsetDateTime> = JsonMissing.of()
            private var lastModifiedBy: JsonField<String> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var organizations: JsonField<MutableList<String>>? = null
            private var supportUser: JsonField<Boolean> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(user: User) = apply {
                id = user.id
                contactNumber = user.contactNumber
                createdBy = user.createdBy
                dtCreated = user.dtCreated
                dtLastModified = user.dtLastModified
                email = user.email
                firstAcceptedTermsAndConditions = user.firstAcceptedTermsAndConditions
                firstName = user.firstName
                lastAcceptedTermsAndConditions = user.lastAcceptedTermsAndConditions
                lastModifiedBy = user.lastModifiedBy
                lastName = user.lastName
                organizations = user.organizations.map { it.toMutableList() }
                supportUser = user.supportUser
                version = user.version
                additionalProperties = user.additionalProperties.toMutableMap()
            }

            /** The unique identifier (UUID) of this user. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The user's contact telephone number. */
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

            /** The user who created this user. */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            /** The date and time _(in ISO-8601 format)_ when the user was created. */
            fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

            /**
             * Sets [Builder.dtCreated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply {
                this.dtCreated = dtCreated
            }

            /** The date and time _(in ISO-8601 format)_ when the user was last modified. */
            fun dtLastModified(dtLastModified: OffsetDateTime) =
                dtLastModified(JsonField.of(dtLastModified))

            /**
             * Sets [Builder.dtLastModified] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dtLastModified] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
                this.dtLastModified = dtLastModified
            }

            /** The email address for this user. */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /**
             * The date and time _(in ISO 8601 format)_ when this user first accepted the the m3ter
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
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /**
             * The date and time _(in ISO 8601 format)_ when this user last accepted the the m3ter
             * terms and conditions.
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
            fun lastModifiedBy(lastModifiedBy: String) =
                lastModifiedBy(JsonField.of(lastModifiedBy))

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
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** An array listing the Organizations where this user has access. */
            fun organizations(organizations: List<String>) =
                organizations(JsonField.of(organizations))

            /**
             * Sets [Builder.organizations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.organizations] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /** Indicates whether this is a m3ter Support user. */
            fun supportUser(supportUser: Boolean) = supportUser(JsonField.of(supportUser))

            /**
             * Sets [Builder.supportUser] to an arbitrary JSON value.
             *
             * You should usually call [Builder.supportUser] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun supportUser(supportUser: JsonField<Boolean>) = apply {
                this.supportUser = supportUser
            }

            /**
             * The version number:
             * - **Create:** On initial Create to insert a new entity, the version is set at 1 in
             *   the response.
             * - **Update:** On successful Update, the version is incremented by 1 in the response.
             */
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
             * Returns an immutable instance of [User].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): User =
                User(
                    id,
                    contactNumber,
                    createdBy,
                    dtCreated,
                    dtLastModified,
                    email,
                    firstAcceptedTermsAndConditions,
                    firstName,
                    lastAcceptedTermsAndConditions,
                    lastModifiedBy,
                    lastName,
                    (organizations ?: JsonMissing.of()).map { it.toImmutable() },
                    supportUser,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): User = apply {
            if (validated) {
                return@apply
            }

            id()
            contactNumber()
            createdBy()
            dtCreated()
            dtLastModified()
            email()
            firstAcceptedTermsAndConditions()
            firstName()
            lastAcceptedTermsAndConditions()
            lastModifiedBy()
            lastName()
            organizations()
            supportUser()
            version()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is User && id == other.id && contactNumber == other.contactNumber && createdBy == other.createdBy && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && email == other.email && firstAcceptedTermsAndConditions == other.firstAcceptedTermsAndConditions && firstName == other.firstName && lastAcceptedTermsAndConditions == other.lastAcceptedTermsAndConditions && lastModifiedBy == other.lastModifiedBy && lastName == other.lastName && organizations == other.organizations && supportUser == other.supportUser && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, contactNumber, createdBy, dtCreated, dtLastModified, email, firstAcceptedTermsAndConditions, firstName, lastAcceptedTermsAndConditions, lastModifiedBy, lastName, organizations, supportUser, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "User{id=$id, contactNumber=$contactNumber, createdBy=$createdBy, dtCreated=$dtCreated, dtLastModified=$dtLastModified, email=$email, firstAcceptedTermsAndConditions=$firstAcceptedTermsAndConditions, firstName=$firstName, lastAcceptedTermsAndConditions=$lastAcceptedTermsAndConditions, lastModifiedBy=$lastModifiedBy, lastName=$lastName, organizations=$organizations, supportUser=$supportUser, version=$version, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UserMeResponse && organization == other.organization && serviceUser == other.serviceUser && user == other.user && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(organization, serviceUser, user, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UserMeResponse{organization=$organization, serviceUser=$serviceUser, user=$user, additionalProperties=$additionalProperties}"
}
