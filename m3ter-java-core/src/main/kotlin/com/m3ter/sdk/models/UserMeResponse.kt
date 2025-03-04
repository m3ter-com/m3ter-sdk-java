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
class UserMeResponse
@JsonCreator
private constructor(
    @JsonProperty("organization")
    @ExcludeMissing
    private val organization: JsonField<Organization> = JsonMissing.of(),
    @JsonProperty("serviceUser")
    @ExcludeMissing
    private val serviceUser: JsonField<ServiceUser> = JsonMissing.of(),
    @JsonProperty("user") @ExcludeMissing private val user: JsonField<User> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun organization(): Optional<Organization> =
        Optional.ofNullable(organization.getNullable("organization"))

    fun serviceUser(): Optional<ServiceUser> =
        Optional.ofNullable(serviceUser.getNullable("serviceUser"))

    fun user(): Optional<User> = Optional.ofNullable(user.getNullable("user"))

    @JsonProperty("organization")
    @ExcludeMissing
    fun _organization(): JsonField<Organization> = organization

    @JsonProperty("serviceUser")
    @ExcludeMissing
    fun _serviceUser(): JsonField<ServiceUser> = serviceUser

    @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<User> = user

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

    fun toBuilder() = Builder().from(this)

    companion object {

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

        fun organization(organization: JsonField<Organization>) = apply {
            this.organization = organization
        }

        fun serviceUser(serviceUser: ServiceUser) = serviceUser(JsonField.of(serviceUser))

        fun serviceUser(serviceUser: JsonField<ServiceUser>) = apply {
            this.serviceUser = serviceUser
        }

        fun user(user: User) = user(JsonField.of(user))

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

        fun build(): UserMeResponse =
            UserMeResponse(organization, serviceUser, user, additionalProperties.toImmutable())
    }

    @NoAutoDetect
    class Organization
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("addressLine1")
        @ExcludeMissing
        private val addressLine1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("addressLine2")
        @ExcludeMissing
        private val addressLine2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("addressLine3")
        @ExcludeMissing
        private val addressLine3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("addressLine4")
        @ExcludeMissing
        private val addressLine4: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billingContactUserId1")
        @ExcludeMissing
        private val billingContactUserId1: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billingContactUserId2")
        @ExcludeMissing
        private val billingContactUserId2: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billingContactUserId3")
        @ExcludeMissing
        private val billingContactUserId3: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdBy")
        @ExcludeMissing
        private val createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customerId")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("invoiceGeneralReference")
        @ExcludeMissing
        private val invoiceGeneralReference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locality")
        @ExcludeMissing
        private val locality: JsonField<String> = JsonMissing.of(),
        @JsonProperty("organizationName")
        @ExcludeMissing
        private val organizationName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("orgId")
        @ExcludeMissing
        private val orgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postCode")
        @ExcludeMissing
        private val postCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("purchaseOrderNumber")
        @ExcludeMissing
        private val purchaseOrderNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("region")
        @ExcludeMissing
        private val region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shortName")
        @ExcludeMissing
        private val shortName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        private val status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("taxId")
        @ExcludeMissing
        private val taxId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The UUID of the entity. */
        fun id(): String = id.getRequired("id")

        /**
         * The version number:
         * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
         *   response.
         * - **Update:** On successful Update, the version is incremented by 1 in the response.
         */
        fun version(): Long = version.getRequired("version")

        fun addressLine1(): Optional<String> =
            Optional.ofNullable(addressLine1.getNullable("addressLine1"))

        fun addressLine2(): Optional<String> =
            Optional.ofNullable(addressLine2.getNullable("addressLine2"))

        fun addressLine3(): Optional<String> =
            Optional.ofNullable(addressLine3.getNullable("addressLine3"))

        fun addressLine4(): Optional<String> =
            Optional.ofNullable(addressLine4.getNullable("addressLine4"))

        fun billingContactUserId1(): Optional<String> =
            Optional.ofNullable(billingContactUserId1.getNullable("billingContactUserId1"))

        fun billingContactUserId2(): Optional<String> =
            Optional.ofNullable(billingContactUserId2.getNullable("billingContactUserId2"))

        fun billingContactUserId3(): Optional<String> =
            Optional.ofNullable(billingContactUserId3.getNullable("billingContactUserId3"))

        fun country(): Optional<String> = Optional.ofNullable(country.getNullable("country"))

        /** The id of the user who created this organization. */
        fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

        fun customerId(): Optional<String> =
            Optional.ofNullable(customerId.getNullable("customerId"))

        /** The DateTime when the organization was created. */
        fun dtCreated(): Optional<OffsetDateTime> =
            Optional.ofNullable(dtCreated.getNullable("dtCreated"))

        /** The DateTime when the organization was last modified. */
        fun dtLastModified(): Optional<OffsetDateTime> =
            Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

        fun invoiceGeneralReference(): Optional<String> =
            Optional.ofNullable(invoiceGeneralReference.getNullable("invoiceGeneralReference"))

        /** The id of the user who last modified this organization. */
        fun lastModifiedBy(): Optional<String> =
            Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

        fun locality(): Optional<String> = Optional.ofNullable(locality.getNullable("locality"))

        fun organizationName(): Optional<String> =
            Optional.ofNullable(organizationName.getNullable("organizationName"))

        fun orgId(): Optional<String> = Optional.ofNullable(orgId.getNullable("orgId"))

        fun postCode(): Optional<String> = Optional.ofNullable(postCode.getNullable("postCode"))

        fun purchaseOrderNumber(): Optional<String> =
            Optional.ofNullable(purchaseOrderNumber.getNullable("purchaseOrderNumber"))

        fun region(): Optional<String> = Optional.ofNullable(region.getNullable("region"))

        fun shortName(): Optional<String> = Optional.ofNullable(shortName.getNullable("shortName"))

        fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

        fun taxId(): Optional<String> = Optional.ofNullable(taxId.getNullable("taxId"))

        fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

        /** The UUID of the entity. */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * The version number:
         * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
         *   response.
         * - **Update:** On successful Update, the version is incremented by 1 in the response.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

        @JsonProperty("addressLine1")
        @ExcludeMissing
        fun _addressLine1(): JsonField<String> = addressLine1

        @JsonProperty("addressLine2")
        @ExcludeMissing
        fun _addressLine2(): JsonField<String> = addressLine2

        @JsonProperty("addressLine3")
        @ExcludeMissing
        fun _addressLine3(): JsonField<String> = addressLine3

        @JsonProperty("addressLine4")
        @ExcludeMissing
        fun _addressLine4(): JsonField<String> = addressLine4

        @JsonProperty("billingContactUserId1")
        @ExcludeMissing
        fun _billingContactUserId1(): JsonField<String> = billingContactUserId1

        @JsonProperty("billingContactUserId2")
        @ExcludeMissing
        fun _billingContactUserId2(): JsonField<String> = billingContactUserId2

        @JsonProperty("billingContactUserId3")
        @ExcludeMissing
        fun _billingContactUserId3(): JsonField<String> = billingContactUserId3

        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /** The id of the user who created this organization. */
        @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

        @JsonProperty("customerId")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /** The DateTime when the organization was created. */
        @JsonProperty("dtCreated")
        @ExcludeMissing
        fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

        /** The DateTime when the organization was last modified. */
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

        @JsonProperty("invoiceGeneralReference")
        @ExcludeMissing
        fun _invoiceGeneralReference(): JsonField<String> = invoiceGeneralReference

        /** The id of the user who last modified this organization. */
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

        @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

        @JsonProperty("organizationName")
        @ExcludeMissing
        fun _organizationName(): JsonField<String> = organizationName

        @JsonProperty("orgId") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

        @JsonProperty("postCode") @ExcludeMissing fun _postCode(): JsonField<String> = postCode

        @JsonProperty("purchaseOrderNumber")
        @ExcludeMissing
        fun _purchaseOrderNumber(): JsonField<String> = purchaseOrderNumber

        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

        @JsonProperty("shortName") @ExcludeMissing fun _shortName(): JsonField<String> = shortName

        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        @JsonProperty("taxId") @ExcludeMissing fun _taxId(): JsonField<String> = taxId

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** The UUID of the entity. */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * The version number:
             * - **Create:** On initial Create to insert a new entity, the version is set at 1 in
             *   the response.
             * - **Update:** On successful Update, the version is incremented by 1 in the response.
             */
            fun version(version: Long) = version(JsonField.of(version))

            /**
             * The version number:
             * - **Create:** On initial Create to insert a new entity, the version is set at 1 in
             *   the response.
             * - **Update:** On successful Update, the version is incremented by 1 in the response.
             */
            fun version(version: JsonField<Long>) = apply { this.version = version }

            fun addressLine1(addressLine1: String) = addressLine1(JsonField.of(addressLine1))

            fun addressLine1(addressLine1: JsonField<String>) = apply {
                this.addressLine1 = addressLine1
            }

            fun addressLine2(addressLine2: String) = addressLine2(JsonField.of(addressLine2))

            fun addressLine2(addressLine2: JsonField<String>) = apply {
                this.addressLine2 = addressLine2
            }

            fun addressLine3(addressLine3: String) = addressLine3(JsonField.of(addressLine3))

            fun addressLine3(addressLine3: JsonField<String>) = apply {
                this.addressLine3 = addressLine3
            }

            fun addressLine4(addressLine4: String) = addressLine4(JsonField.of(addressLine4))

            fun addressLine4(addressLine4: JsonField<String>) = apply {
                this.addressLine4 = addressLine4
            }

            fun billingContactUserId1(billingContactUserId1: String) =
                billingContactUserId1(JsonField.of(billingContactUserId1))

            fun billingContactUserId1(billingContactUserId1: JsonField<String>) = apply {
                this.billingContactUserId1 = billingContactUserId1
            }

            fun billingContactUserId2(billingContactUserId2: String) =
                billingContactUserId2(JsonField.of(billingContactUserId2))

            fun billingContactUserId2(billingContactUserId2: JsonField<String>) = apply {
                this.billingContactUserId2 = billingContactUserId2
            }

            fun billingContactUserId3(billingContactUserId3: String) =
                billingContactUserId3(JsonField.of(billingContactUserId3))

            fun billingContactUserId3(billingContactUserId3: JsonField<String>) = apply {
                this.billingContactUserId3 = billingContactUserId3
            }

            fun country(country: String) = country(JsonField.of(country))

            fun country(country: JsonField<String>) = apply { this.country = country }

            /** The id of the user who created this organization. */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /** The id of the user who created this organization. */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** The DateTime when the organization was created. */
            fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

            /** The DateTime when the organization was created. */
            fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply {
                this.dtCreated = dtCreated
            }

            /** The DateTime when the organization was last modified. */
            fun dtLastModified(dtLastModified: OffsetDateTime) =
                dtLastModified(JsonField.of(dtLastModified))

            /** The DateTime when the organization was last modified. */
            fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
                this.dtLastModified = dtLastModified
            }

            fun invoiceGeneralReference(invoiceGeneralReference: String) =
                invoiceGeneralReference(JsonField.of(invoiceGeneralReference))

            fun invoiceGeneralReference(invoiceGeneralReference: JsonField<String>) = apply {
                this.invoiceGeneralReference = invoiceGeneralReference
            }

            /** The id of the user who last modified this organization. */
            fun lastModifiedBy(lastModifiedBy: String) =
                lastModifiedBy(JsonField.of(lastModifiedBy))

            /** The id of the user who last modified this organization. */
            fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
                this.lastModifiedBy = lastModifiedBy
            }

            fun locality(locality: String) = locality(JsonField.of(locality))

            fun locality(locality: JsonField<String>) = apply { this.locality = locality }

            fun organizationName(organizationName: String) =
                organizationName(JsonField.of(organizationName))

            fun organizationName(organizationName: JsonField<String>) = apply {
                this.organizationName = organizationName
            }

            fun orgId(orgId: String) = orgId(JsonField.of(orgId))

            fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

            fun postCode(postCode: String) = postCode(JsonField.of(postCode))

            fun postCode(postCode: JsonField<String>) = apply { this.postCode = postCode }

            fun purchaseOrderNumber(purchaseOrderNumber: String) =
                purchaseOrderNumber(JsonField.of(purchaseOrderNumber))

            fun purchaseOrderNumber(purchaseOrderNumber: JsonField<String>) = apply {
                this.purchaseOrderNumber = purchaseOrderNumber
            }

            fun region(region: String) = region(JsonField.of(region))

            fun region(region: JsonField<String>) = apply { this.region = region }

            fun shortName(shortName: String) = shortName(JsonField.of(shortName))

            fun shortName(shortName: JsonField<String>) = apply { this.shortName = shortName }

            fun status(status: Status) = status(JsonField.of(status))

            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun taxId(taxId: String) = taxId(JsonField.of(taxId))

            fun taxId(taxId: JsonField<String>) = apply { this.taxId = taxId }

            fun type(type: Type) = type(JsonField.of(type))

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
                    additionalProperties.toImmutable(),
                )
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

    @NoAutoDetect
    class ServiceUser
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

        /** The id of the user who created this service user. */
        fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

        /** The DateTime when the service user was created. */
        fun dtCreated(): Optional<OffsetDateTime> =
            Optional.ofNullable(dtCreated.getNullable("dtCreated"))

        /** The DateTime when the service user was last modified. */
        fun dtLastModified(): Optional<OffsetDateTime> =
            Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

        /** The id of the user who last modified this service user. */
        fun lastModifiedBy(): Optional<String> =
            Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /** The id of the user who created this service user. */
        @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

        /** The DateTime when the service user was created. */
        @JsonProperty("dtCreated")
        @ExcludeMissing
        fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

        /** The DateTime when the service user was last modified. */
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

        /** The id of the user who last modified this service user. */
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The id of the user who created this service user. */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /** The id of the user who created this service user. */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            /** The DateTime when the service user was created. */
            fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

            /** The DateTime when the service user was created. */
            fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply {
                this.dtCreated = dtCreated
            }

            /** The DateTime when the service user was last modified. */
            fun dtLastModified(dtLastModified: OffsetDateTime) =
                dtLastModified(JsonField.of(dtLastModified))

            /** The DateTime when the service user was last modified. */
            fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
                this.dtLastModified = dtLastModified
            }

            /** The id of the user who last modified this service user. */
            fun lastModifiedBy(lastModifiedBy: String) =
                lastModifiedBy(JsonField.of(lastModifiedBy))

            /** The id of the user who last modified this service user. */
            fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
                this.lastModifiedBy = lastModifiedBy
            }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

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

            fun build(): ServiceUser =
                ServiceUser(
                    id,
                    createdBy,
                    dtCreated,
                    dtLastModified,
                    lastModifiedBy,
                    name,
                    version,
                    additionalProperties.toImmutable(),
                )
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
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("supportUser")
        @ExcludeMissing
        private val supportUser: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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

        /** The date and time _(in ISO-8601 format)_ when the user was last modified. */
        fun dtLastModified(): Optional<OffsetDateTime> =
            Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

        /** The email address for this user. */
        fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

        /**
         * The date and time _(in ISO 8601 format)_ when this user first accepted the the m3ter
         * terms and conditions.
         */
        fun firstAcceptedTermsAndConditions(): Optional<OffsetDateTime> =
            Optional.ofNullable(
                firstAcceptedTermsAndConditions.getNullable("firstAcceptedTermsAndConditions")
            )

        /** The first name of the user. */
        fun firstName(): Optional<String> = Optional.ofNullable(firstName.getNullable("firstName"))

        /**
         * The date and time _(in ISO 8601 format)_ when this user last accepted the the m3ter terms
         * and conditions.
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

        /** The date and time _(in ISO-8601 format)_ when the user was last modified. */
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

        /** The email address for this user. */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * The date and time _(in ISO 8601 format)_ when this user first accepted the the m3ter
         * terms and conditions.
         */
        @JsonProperty("firstAcceptedTermsAndConditions")
        @ExcludeMissing
        fun _firstAcceptedTermsAndConditions(): JsonField<OffsetDateTime> =
            firstAcceptedTermsAndConditions

        /** The first name of the user. */
        @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * The date and time _(in ISO 8601 format)_ when this user last accepted the the m3ter terms
         * and conditions.
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
            fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply {
                this.dtCreated = dtCreated
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
             * The date and time _(in ISO 8601 format)_ when this user last accepted the the m3ter
             * terms and conditions.
             */
            fun lastAcceptedTermsAndConditions(lastAcceptedTermsAndConditions: OffsetDateTime) =
                lastAcceptedTermsAndConditions(JsonField.of(lastAcceptedTermsAndConditions))

            /**
             * The date and time _(in ISO 8601 format)_ when this user last accepted the the m3ter
             * terms and conditions.
             */
            fun lastAcceptedTermsAndConditions(
                lastAcceptedTermsAndConditions: JsonField<OffsetDateTime>
            ) = apply { this.lastAcceptedTermsAndConditions = lastAcceptedTermsAndConditions }

            /** The unique identifier (UUID) of the user who last modified this user record. */
            fun lastModifiedBy(lastModifiedBy: String) =
                lastModifiedBy(JsonField.of(lastModifiedBy))

            /** The unique identifier (UUID) of the user who last modified this user record. */
            fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
                this.lastModifiedBy = lastModifiedBy
            }

            /** The surname of the user. */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /** The surname of the user. */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** An array listing the Organizations where this user has access. */
            fun organizations(organizations: List<String>) =
                organizations(JsonField.of(organizations))

            /** An array listing the Organizations where this user has access. */
            fun organizations(organizations: JsonField<List<String>>) = apply {
                this.organizations = organizations.map { it.toMutableList() }
            }

            /** An array listing the Organizations where this user has access. */
            fun addOrganization(organization: String) = apply {
                organizations =
                    (organizations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("organizations", it).add(organization)
                    }
            }

            /** Indicates whether this is a m3ter Support user. */
            fun supportUser(supportUser: Boolean) = supportUser(JsonField.of(supportUser))

            /** Indicates whether this is a m3ter Support user. */
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
             * The version number:
             * - **Create:** On initial Create to insert a new entity, the version is set at 1 in
             *   the response.
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
                    additionalProperties.toImmutable(),
                )
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
