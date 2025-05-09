// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.core.Enum
import com.m3ter.core.ExcludeMissing
import com.m3ter.core.JsonField
import com.m3ter.core.JsonMissing
import com.m3ter.core.JsonValue
import com.m3ter.core.checkRequired
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DataExportDestinationGoogleCloudStorageRequest
private constructor(
    private val bucketName: JsonField<String>,
    private val poolId: JsonField<String>,
    private val projectNumber: JsonField<String>,
    private val providerId: JsonField<String>,
    private val destinationType: JsonField<DestinationType>,
    private val partitionOrder: JsonField<PartitionOrder>,
    private val prefix: JsonField<String>,
    private val serviceAccountEmail: JsonField<String>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bucketName")
        @ExcludeMissing
        bucketName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("poolId") @ExcludeMissing poolId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("projectNumber")
        @ExcludeMissing
        projectNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("providerId")
        @ExcludeMissing
        providerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destinationType")
        @ExcludeMissing
        destinationType: JsonField<DestinationType> = JsonMissing.of(),
        @JsonProperty("partitionOrder")
        @ExcludeMissing
        partitionOrder: JsonField<PartitionOrder> = JsonMissing.of(),
        @JsonProperty("prefix") @ExcludeMissing prefix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("serviceAccountEmail")
        @ExcludeMissing
        serviceAccountEmail: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        bucketName,
        poolId,
        projectNumber,
        providerId,
        destinationType,
        partitionOrder,
        prefix,
        serviceAccountEmail,
        version,
        mutableMapOf(),
    )

    /**
     * The export destination bucket name.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bucketName(): String = bucketName.getRequired("bucketName")

    /**
     * The export destination Web Identity Federation poolId.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun poolId(): String = poolId.getRequired("poolId")

    /**
     * The export destination GCP projectNumber.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun projectNumber(): String = projectNumber.getRequired("projectNumber")

    /**
     * The export destination Web Identity Federation identity providerId.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun providerId(): String = providerId.getRequired("providerId")

    /**
     * The type of destination to create. Possible values are: GCS
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun destinationType(): Optional<DestinationType> =
        destinationType.getOptional("destinationType")

    /**
     * Specify how you want the file path to be structured in your bucket destination - by Time
     * first (Default) or Type first.
     *
     * Type is dependent on whether the Export is for Usage data or Operational data:
     * - **Usage.** Type is `measurements`.
     * - **Operational.** Type is one of the entities for which operational data exports are
     *   available, such as `account`, `commitment`, `meter`, and so on.
     *
     * Example for Usage Data Export using .CSV format:
     * - Time first:
     *   `{bucketName}/{prefix}/orgId={orgId}/date=2025-01-27/hour=10/type=measurements/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
     * - Type first:
     *   `{bucketName}/{prefix}/orgId={orgId}/type=measurements/date=2025-01-27/hour=10/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun partitionOrder(): Optional<PartitionOrder> = partitionOrder.getOptional("partitionOrder")

    /**
     * The export destination prefix.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prefix(): Optional<String> = prefix.getOptional("prefix")

    /**
     * The export destination service account email.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceAccountEmail(): Optional<String> =
        serviceAccountEmail.getOptional("serviceAccountEmail")

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<Long> = version.getOptional("version")

    /**
     * Returns the raw JSON value of [bucketName].
     *
     * Unlike [bucketName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bucketName") @ExcludeMissing fun _bucketName(): JsonField<String> = bucketName

    /**
     * Returns the raw JSON value of [poolId].
     *
     * Unlike [poolId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("poolId") @ExcludeMissing fun _poolId(): JsonField<String> = poolId

    /**
     * Returns the raw JSON value of [projectNumber].
     *
     * Unlike [projectNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("projectNumber")
    @ExcludeMissing
    fun _projectNumber(): JsonField<String> = projectNumber

    /**
     * Returns the raw JSON value of [providerId].
     *
     * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("providerId") @ExcludeMissing fun _providerId(): JsonField<String> = providerId

    /**
     * Returns the raw JSON value of [destinationType].
     *
     * Unlike [destinationType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destinationType")
    @ExcludeMissing
    fun _destinationType(): JsonField<DestinationType> = destinationType

    /**
     * Returns the raw JSON value of [partitionOrder].
     *
     * Unlike [partitionOrder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("partitionOrder")
    @ExcludeMissing
    fun _partitionOrder(): JsonField<PartitionOrder> = partitionOrder

    /**
     * Returns the raw JSON value of [prefix].
     *
     * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

    /**
     * Returns the raw JSON value of [serviceAccountEmail].
     *
     * Unlike [serviceAccountEmail], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("serviceAccountEmail")
    @ExcludeMissing
    fun _serviceAccountEmail(): JsonField<String> = serviceAccountEmail

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
         * Returns a mutable builder for constructing an instance of
         * [DataExportDestinationGoogleCloudStorageRequest].
         *
         * The following fields are required:
         * ```java
         * .bucketName()
         * .poolId()
         * .projectNumber()
         * .providerId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExportDestinationGoogleCloudStorageRequest]. */
    class Builder internal constructor() {

        private var bucketName: JsonField<String>? = null
        private var poolId: JsonField<String>? = null
        private var projectNumber: JsonField<String>? = null
        private var providerId: JsonField<String>? = null
        private var destinationType: JsonField<DestinationType> = JsonMissing.of()
        private var partitionOrder: JsonField<PartitionOrder> = JsonMissing.of()
        private var prefix: JsonField<String> = JsonMissing.of()
        private var serviceAccountEmail: JsonField<String> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            dataExportDestinationGoogleCloudStorageRequest:
                DataExportDestinationGoogleCloudStorageRequest
        ) = apply {
            bucketName = dataExportDestinationGoogleCloudStorageRequest.bucketName
            poolId = dataExportDestinationGoogleCloudStorageRequest.poolId
            projectNumber = dataExportDestinationGoogleCloudStorageRequest.projectNumber
            providerId = dataExportDestinationGoogleCloudStorageRequest.providerId
            destinationType = dataExportDestinationGoogleCloudStorageRequest.destinationType
            partitionOrder = dataExportDestinationGoogleCloudStorageRequest.partitionOrder
            prefix = dataExportDestinationGoogleCloudStorageRequest.prefix
            serviceAccountEmail = dataExportDestinationGoogleCloudStorageRequest.serviceAccountEmail
            version = dataExportDestinationGoogleCloudStorageRequest.version
            additionalProperties =
                dataExportDestinationGoogleCloudStorageRequest.additionalProperties.toMutableMap()
        }

        /** The export destination bucket name. */
        fun bucketName(bucketName: String) = bucketName(JsonField.of(bucketName))

        /**
         * Sets [Builder.bucketName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bucketName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bucketName(bucketName: JsonField<String>) = apply { this.bucketName = bucketName }

        /** The export destination Web Identity Federation poolId. */
        fun poolId(poolId: String) = poolId(JsonField.of(poolId))

        /**
         * Sets [Builder.poolId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.poolId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun poolId(poolId: JsonField<String>) = apply { this.poolId = poolId }

        /** The export destination GCP projectNumber. */
        fun projectNumber(projectNumber: String) = projectNumber(JsonField.of(projectNumber))

        /**
         * Sets [Builder.projectNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.projectNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun projectNumber(projectNumber: JsonField<String>) = apply {
            this.projectNumber = projectNumber
        }

        /** The export destination Web Identity Federation identity providerId. */
        fun providerId(providerId: String) = providerId(JsonField.of(providerId))

        /**
         * Sets [Builder.providerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.providerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

        /** The type of destination to create. Possible values are: GCS */
        fun destinationType(destinationType: DestinationType) =
            destinationType(JsonField.of(destinationType))

        /**
         * Sets [Builder.destinationType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinationType] with a well-typed [DestinationType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun destinationType(destinationType: JsonField<DestinationType>) = apply {
            this.destinationType = destinationType
        }

        /**
         * Specify how you want the file path to be structured in your bucket destination - by Time
         * first (Default) or Type first.
         *
         * Type is dependent on whether the Export is for Usage data or Operational data:
         * - **Usage.** Type is `measurements`.
         * - **Operational.** Type is one of the entities for which operational data exports are
         *   available, such as `account`, `commitment`, `meter`, and so on.
         *
         * Example for Usage Data Export using .CSV format:
         * - Time first:
         *   `{bucketName}/{prefix}/orgId={orgId}/date=2025-01-27/hour=10/type=measurements/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
         * - Type first:
         *   `{bucketName}/{prefix}/orgId={orgId}/type=measurements/date=2025-01-27/hour=10/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
         */
        fun partitionOrder(partitionOrder: PartitionOrder?) =
            partitionOrder(JsonField.ofNullable(partitionOrder))

        /** Alias for calling [Builder.partitionOrder] with `partitionOrder.orElse(null)`. */
        fun partitionOrder(partitionOrder: Optional<PartitionOrder>) =
            partitionOrder(partitionOrder.getOrNull())

        /**
         * Sets [Builder.partitionOrder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partitionOrder] with a well-typed [PartitionOrder] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun partitionOrder(partitionOrder: JsonField<PartitionOrder>) = apply {
            this.partitionOrder = partitionOrder
        }

        /** The export destination prefix. */
        fun prefix(prefix: String) = prefix(JsonField.of(prefix))

        /**
         * Sets [Builder.prefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prefix] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

        /** The export destination service account email. */
        fun serviceAccountEmail(serviceAccountEmail: String) =
            serviceAccountEmail(JsonField.of(serviceAccountEmail))

        /**
         * Sets [Builder.serviceAccountEmail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceAccountEmail] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun serviceAccountEmail(serviceAccountEmail: JsonField<String>) = apply {
            this.serviceAccountEmail = serviceAccountEmail
        }

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
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
         * Returns an immutable instance of [DataExportDestinationGoogleCloudStorageRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bucketName()
         * .poolId()
         * .projectNumber()
         * .providerId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataExportDestinationGoogleCloudStorageRequest =
            DataExportDestinationGoogleCloudStorageRequest(
                checkRequired("bucketName", bucketName),
                checkRequired("poolId", poolId),
                checkRequired("projectNumber", projectNumber),
                checkRequired("providerId", providerId),
                destinationType,
                partitionOrder,
                prefix,
                serviceAccountEmail,
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DataExportDestinationGoogleCloudStorageRequest = apply {
        if (validated) {
            return@apply
        }

        bucketName()
        poolId()
        projectNumber()
        providerId()
        destinationType().ifPresent { it.validate() }
        partitionOrder().ifPresent { it.validate() }
        prefix()
        serviceAccountEmail()
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
        (if (bucketName.asKnown().isPresent) 1 else 0) +
            (if (poolId.asKnown().isPresent) 1 else 0) +
            (if (projectNumber.asKnown().isPresent) 1 else 0) +
            (if (providerId.asKnown().isPresent) 1 else 0) +
            (destinationType.asKnown().getOrNull()?.validity() ?: 0) +
            (partitionOrder.asKnown().getOrNull()?.validity() ?: 0) +
            (if (prefix.asKnown().isPresent) 1 else 0) +
            (if (serviceAccountEmail.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    /** The type of destination to create. Possible values are: GCS */
    class DestinationType @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val GCS = of("GCS")

            @JvmStatic fun of(value: String) = DestinationType(JsonField.of(value))
        }

        /** An enum containing [DestinationType]'s known values. */
        enum class Known {
            GCS
        }

        /**
         * An enum containing [DestinationType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DestinationType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GCS,
            /**
             * An enum member indicating that [DestinationType] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                GCS -> Value.GCS
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws M3terInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                GCS -> Known.GCS
                else -> throw M3terInvalidDataException("Unknown DestinationType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws M3terInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { M3terInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): DestinationType = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DestinationType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specify how you want the file path to be structured in your bucket destination - by Time
     * first (Default) or Type first.
     *
     * Type is dependent on whether the Export is for Usage data or Operational data:
     * - **Usage.** Type is `measurements`.
     * - **Operational.** Type is one of the entities for which operational data exports are
     *   available, such as `account`, `commitment`, `meter`, and so on.
     *
     * Example for Usage Data Export using .CSV format:
     * - Time first:
     *   `{bucketName}/{prefix}/orgId={orgId}/date=2025-01-27/hour=10/type=measurements/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
     * - Type first:
     *   `{bucketName}/{prefix}/orgId={orgId}/type=measurements/date=2025-01-27/hour=10/b9a317a6-860a-40f9-9bf4-e65c44c72c94_measurements.csv.gz`
     */
    class PartitionOrder @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val TYPE_FIRST = of("TYPE_FIRST")

            @JvmField val TIME_FIRST = of("TIME_FIRST")

            @JvmStatic fun of(value: String) = PartitionOrder(JsonField.of(value))
        }

        /** An enum containing [PartitionOrder]'s known values. */
        enum class Known {
            TYPE_FIRST,
            TIME_FIRST,
        }

        /**
         * An enum containing [PartitionOrder]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PartitionOrder] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TYPE_FIRST,
            TIME_FIRST,
            /**
             * An enum member indicating that [PartitionOrder] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TYPE_FIRST -> Value.TYPE_FIRST
                TIME_FIRST -> Value.TIME_FIRST
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws M3terInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                TYPE_FIRST -> Known.TYPE_FIRST
                TIME_FIRST -> Known.TIME_FIRST
                else -> throw M3terInvalidDataException("Unknown PartitionOrder: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws M3terInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { M3terInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): PartitionOrder = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PartitionOrder && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportDestinationGoogleCloudStorageRequest && bucketName == other.bucketName && poolId == other.poolId && projectNumber == other.projectNumber && providerId == other.providerId && destinationType == other.destinationType && partitionOrder == other.partitionOrder && prefix == other.prefix && serviceAccountEmail == other.serviceAccountEmail && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(bucketName, poolId, projectNumber, providerId, destinationType, partitionOrder, prefix, serviceAccountEmail, version, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataExportDestinationGoogleCloudStorageRequest{bucketName=$bucketName, poolId=$poolId, projectNumber=$projectNumber, providerId=$providerId, destinationType=$destinationType, partitionOrder=$partitionOrder, prefix=$prefix, serviceAccountEmail=$serviceAccountEmail, version=$version, additionalProperties=$additionalProperties}"
}
