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
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class DataExportDestinationRetrieveResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<String> = JsonMissing.of(),
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
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("bucketName")
    @ExcludeMissing
    private val bucketName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("iamRoleArn")
    @ExcludeMissing
    private val iamRoleArn: JsonField<String> = JsonMissing.of(),
    @JsonProperty("partitionOrder")
    @ExcludeMissing
    private val partitionOrder: JsonField<PartitionOrder> = JsonMissing.of(),
    @JsonProperty("prefix")
    @ExcludeMissing
    private val prefix: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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

    /** The code of the data Export Destination. */
    fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

    /** The id of the user who created the Export Destination. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** The DateTime when the Export Destination was created. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The DateTime when the Export Destination was last modified. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The id of the user who last modified the Export Destination. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** The name of the data Export Destination. */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /** Name of the S3 bucket for the Export Destination. */
    fun bucketName(): Optional<String> = Optional.ofNullable(bucketName.getNullable("bucketName"))

    /**
     * The specified IAM role ARN with PutObject permission for the specified `bucketName`, which
     * allows the service to upload Data Exports to your S3 bucket.
     */
    fun iamRoleArn(): Optional<String> = Optional.ofNullable(iamRoleArn.getNullable("iamRoleArn"))

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
    fun partitionOrder(): Optional<PartitionOrder> =
        Optional.ofNullable(partitionOrder.getNullable("partitionOrder"))

    /**
     * Location in specified S3 bucket for the Export Destination. If no `prefix` is specified, then
     * the root of the bucket is used.
     */
    fun prefix(): Optional<String> = Optional.ofNullable(prefix.getNullable("prefix"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /** The code of the data Export Destination. */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /** The id of the user who created the Export Destination. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** The DateTime when the Export Destination was created. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The DateTime when the Export Destination was last modified. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** The id of the user who last modified the Export Destination. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /** The name of the data Export Destination. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** Name of the S3 bucket for the Export Destination. */
    @JsonProperty("bucketName") @ExcludeMissing fun _bucketName(): JsonField<String> = bucketName

    /**
     * The specified IAM role ARN with PutObject permission for the specified `bucketName`, which
     * allows the service to upload Data Exports to your S3 bucket.
     */
    @JsonProperty("iamRoleArn") @ExcludeMissing fun _iamRoleArn(): JsonField<String> = iamRoleArn

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
    @JsonProperty("partitionOrder")
    @ExcludeMissing
    fun _partitionOrder(): JsonField<PartitionOrder> = partitionOrder

    /**
     * Location in specified S3 bucket for the Export Destination. If no `prefix` is specified, then
     * the root of the bucket is used.
     */
    @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toDataExportDestinationResponse(): DataExportDestinationResponse =
        DataExportDestinationResponse.builder()
            .id(id)
            .version(version)
            .code(code)
            .createdBy(createdBy)
            .dtCreated(dtCreated)
            .dtLastModified(dtLastModified)
            .lastModifiedBy(lastModifiedBy)
            .name(name)
            .build()

    private var validated: Boolean = false

    fun validate(): DataExportDestinationRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        code()
        createdBy()
        dtCreated()
        dtLastModified()
        lastModifiedBy()
        name()
        bucketName()
        iamRoleArn()
        partitionOrder()
        prefix()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DataExportDestinationRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExportDestinationRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var code: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var bucketName: JsonField<String> = JsonMissing.of()
        private var iamRoleArn: JsonField<String> = JsonMissing.of()
        private var partitionOrder: JsonField<PartitionOrder> = JsonMissing.of()
        private var prefix: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            dataExportDestinationRetrieveResponse: DataExportDestinationRetrieveResponse
        ) = apply {
            id = dataExportDestinationRetrieveResponse.id
            version = dataExportDestinationRetrieveResponse.version
            code = dataExportDestinationRetrieveResponse.code
            createdBy = dataExportDestinationRetrieveResponse.createdBy
            dtCreated = dataExportDestinationRetrieveResponse.dtCreated
            dtLastModified = dataExportDestinationRetrieveResponse.dtLastModified
            lastModifiedBy = dataExportDestinationRetrieveResponse.lastModifiedBy
            name = dataExportDestinationRetrieveResponse.name
            bucketName = dataExportDestinationRetrieveResponse.bucketName
            iamRoleArn = dataExportDestinationRetrieveResponse.iamRoleArn
            partitionOrder = dataExportDestinationRetrieveResponse.partitionOrder
            prefix = dataExportDestinationRetrieveResponse.prefix
            additionalProperties =
                dataExportDestinationRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** The UUID of the entity. */
        fun id(id: String) = id(JsonField.of(id))

        /** The UUID of the entity. */
        fun id(id: JsonField<String>) = apply { this.id = id }

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

        /** The code of the data Export Destination. */
        fun code(code: String) = code(JsonField.of(code))

        /** The code of the data Export Destination. */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** The id of the user who created the Export Destination. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The id of the user who created the Export Destination. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The DateTime when the Export Destination was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The DateTime when the Export Destination was created. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when the Export Destination was last modified. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The DateTime when the Export Destination was last modified. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The id of the user who last modified the Export Destination. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The id of the user who last modified the Export Destination. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /** The name of the data Export Destination. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the data Export Destination. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Name of the S3 bucket for the Export Destination. */
        fun bucketName(bucketName: String) = bucketName(JsonField.of(bucketName))

        /** Name of the S3 bucket for the Export Destination. */
        fun bucketName(bucketName: JsonField<String>) = apply { this.bucketName = bucketName }

        /**
         * The specified IAM role ARN with PutObject permission for the specified `bucketName`,
         * which allows the service to upload Data Exports to your S3 bucket.
         */
        fun iamRoleArn(iamRoleArn: String) = iamRoleArn(JsonField.of(iamRoleArn))

        /**
         * The specified IAM role ARN with PutObject permission for the specified `bucketName`,
         * which allows the service to upload Data Exports to your S3 bucket.
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
        fun partitionOrder(partitionOrder: PartitionOrder) =
            partitionOrder(JsonField.of(partitionOrder))

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
        fun partitionOrder(partitionOrder: JsonField<PartitionOrder>) = apply {
            this.partitionOrder = partitionOrder
        }

        /**
         * Location in specified S3 bucket for the Export Destination. If no `prefix` is specified,
         * then the root of the bucket is used.
         */
        fun prefix(prefix: String) = prefix(JsonField.of(prefix))

        /**
         * Location in specified S3 bucket for the Export Destination. If no `prefix` is specified,
         * then the root of the bucket is used.
         */
        fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

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

        fun build(): DataExportDestinationRetrieveResponse =
            DataExportDestinationRetrieveResponse(
                checkRequired("id", id),
                checkRequired("version", version),
                code,
                createdBy,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                name,
                bucketName,
                iamRoleArn,
                partitionOrder,
                prefix,
                additionalProperties.toImmutable(),
            )
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

        return /* spotless:off */ other is DataExportDestinationRetrieveResponse && id == other.id && version == other.version && code == other.code && createdBy == other.createdBy && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && name == other.name && bucketName == other.bucketName && iamRoleArn == other.iamRoleArn && partitionOrder == other.partitionOrder && prefix == other.prefix && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, code, createdBy, dtCreated, dtLastModified, lastModifiedBy, name, bucketName, iamRoleArn, partitionOrder, prefix, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataExportDestinationRetrieveResponse{id=$id, version=$version, code=$code, createdBy=$createdBy, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, name=$name, bucketName=$bucketName, iamRoleArn=$iamRoleArn, partitionOrder=$partitionOrder, prefix=$prefix, additionalProperties=$additionalProperties}"
}
