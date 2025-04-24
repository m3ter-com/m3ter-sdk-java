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

class DataExportDestinationS3Request
private constructor(
    private val bucketName: JsonField<String>,
    private val iamRoleArn: JsonField<String>,
    private val partitionOrder: JsonField<PartitionOrder>,
    private val prefix: JsonField<String>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bucketName")
        @ExcludeMissing
        bucketName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("iamRoleArn")
        @ExcludeMissing
        iamRoleArn: JsonField<String> = JsonMissing.of(),
        @JsonProperty("partitionOrder")
        @ExcludeMissing
        partitionOrder: JsonField<PartitionOrder> = JsonMissing.of(),
        @JsonProperty("prefix") @ExcludeMissing prefix: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(bucketName, iamRoleArn, partitionOrder, prefix, version, mutableMapOf())

    /**
     * Name of the S3 bucket for the Export Destination.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bucketName(): String = bucketName.getRequired("bucketName")

    /**
     * To enable m3ter to upload a Data Exports to your S3 bucket, the service has to assume an IAM
     * role with PutObject permission for the specified `bucketName`. Create a suitable IAM role in
     * your AWS account and enter ARN:
     *
     * **Formatting Constraints:**
     * - The IAM role ARN must begin with "arn:aws:iam".
     * - The general format required is: "arn:aws:iam::<aws account id>:role/<role name>". For
     *   example: "arn:aws:iam::922609978421:role/IAMRole636".
     * - If the `iamRoleArn` used doesn't comply with this format, then an error message will be
     *   returned.
     *
     * **More Details:** For more details and examples of the Permission and Trust Policies you can
     * use to create the required IAM Role ARN, see
     * [Creating Data Export Destinations](https://www.m3ter.com/docs/guides/data-exports/creating-data-export-destinations)
     * in our main User documentation.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun iamRoleArn(): String = iamRoleArn.getRequired("iamRoleArn")

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
     * Location in specified S3 bucket for the Export Destination. If you omit a `prefix`, then the
     * root of the bucket will be used.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prefix(): Optional<String> = prefix.getOptional("prefix")

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
     * Returns the raw JSON value of [iamRoleArn].
     *
     * Unlike [iamRoleArn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("iamRoleArn") @ExcludeMissing fun _iamRoleArn(): JsonField<String> = iamRoleArn

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
         * [DataExportDestinationS3Request].
         *
         * The following fields are required:
         * ```java
         * .bucketName()
         * .iamRoleArn()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExportDestinationS3Request]. */
    class Builder internal constructor() {

        private var bucketName: JsonField<String>? = null
        private var iamRoleArn: JsonField<String>? = null
        private var partitionOrder: JsonField<PartitionOrder> = JsonMissing.of()
        private var prefix: JsonField<String> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataExportDestinationS3Request: DataExportDestinationS3Request) = apply {
            bucketName = dataExportDestinationS3Request.bucketName
            iamRoleArn = dataExportDestinationS3Request.iamRoleArn
            partitionOrder = dataExportDestinationS3Request.partitionOrder
            prefix = dataExportDestinationS3Request.prefix
            version = dataExportDestinationS3Request.version
            additionalProperties =
                dataExportDestinationS3Request.additionalProperties.toMutableMap()
        }

        /** Name of the S3 bucket for the Export Destination. */
        fun bucketName(bucketName: String) = bucketName(JsonField.of(bucketName))

        /**
         * Sets [Builder.bucketName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bucketName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun bucketName(bucketName: JsonField<String>) = apply { this.bucketName = bucketName }

        /**
         * To enable m3ter to upload a Data Exports to your S3 bucket, the service has to assume an
         * IAM role with PutObject permission for the specified `bucketName`. Create a suitable IAM
         * role in your AWS account and enter ARN:
         *
         * **Formatting Constraints:**
         * - The IAM role ARN must begin with "arn:aws:iam".
         * - The general format required is: "arn:aws:iam::<aws account id>:role/<role name>". For
         *   example: "arn:aws:iam::922609978421:role/IAMRole636".
         * - If the `iamRoleArn` used doesn't comply with this format, then an error message will be
         *   returned.
         *
         * **More Details:** For more details and examples of the Permission and Trust Policies you
         * can use to create the required IAM Role ARN, see
         * [Creating Data Export Destinations](https://www.m3ter.com/docs/guides/data-exports/creating-data-export-destinations)
         * in our main User documentation.
         */
        fun iamRoleArn(iamRoleArn: String) = iamRoleArn(JsonField.of(iamRoleArn))

        /**
         * Sets [Builder.iamRoleArn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.iamRoleArn] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun iamRoleArn(iamRoleArn: JsonField<String>) = apply { this.iamRoleArn = iamRoleArn }

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

        /**
         * Location in specified S3 bucket for the Export Destination. If you omit a `prefix`, then
         * the root of the bucket will be used.
         */
        fun prefix(prefix: String) = prefix(JsonField.of(prefix))

        /**
         * Sets [Builder.prefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prefix] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

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
         * Returns an immutable instance of [DataExportDestinationS3Request].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .bucketName()
         * .iamRoleArn()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataExportDestinationS3Request =
            DataExportDestinationS3Request(
                checkRequired("bucketName", bucketName),
                checkRequired("iamRoleArn", iamRoleArn),
                partitionOrder,
                prefix,
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DataExportDestinationS3Request = apply {
        if (validated) {
            return@apply
        }

        bucketName()
        iamRoleArn()
        partitionOrder().ifPresent { it.validate() }
        prefix()
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
            (if (iamRoleArn.asKnown().isPresent) 1 else 0) +
            (partitionOrder.asKnown().getOrNull()?.validity() ?: 0) +
            (if (prefix.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

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

        return /* spotless:off */ other is DataExportDestinationS3Request && bucketName == other.bucketName && iamRoleArn == other.iamRoleArn && partitionOrder == other.partitionOrder && prefix == other.prefix && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(bucketName, iamRoleArn, partitionOrder, prefix, version, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataExportDestinationS3Request{bucketName=$bucketName, iamRoleArn=$iamRoleArn, partitionOrder=$partitionOrder, prefix=$prefix, version=$version, additionalProperties=$additionalProperties}"
}
