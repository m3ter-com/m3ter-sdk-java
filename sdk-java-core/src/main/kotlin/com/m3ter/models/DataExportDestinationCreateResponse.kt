// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.BaseDeserializer
import com.m3ter.core.BaseSerializer
import com.m3ter.core.Enum
import com.m3ter.core.ExcludeMissing
import com.m3ter.core.JsonField
import com.m3ter.core.JsonMissing
import com.m3ter.core.JsonValue
import com.m3ter.core.allMaxBy
import com.m3ter.core.checkRequired
import com.m3ter.core.getOrThrow
import com.m3ter.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The response containing the details of an Google Cloud Storage export destination. */
@JsonDeserialize(using = DataExportDestinationCreateResponse.Deserializer::class)
@JsonSerialize(using = DataExportDestinationCreateResponse.Serializer::class)
class DataExportDestinationCreateResponse
private constructor(
    private val exportDestinationS3: ExportDestinationS3Response? = null,
    private val exportDestinationGoogleCloudStorage: ExportDestinationGoogleCloudStorageResponse? =
        null,
    private val _json: JsonValue? = null,
) {

    fun exportDestinationS3(): Optional<ExportDestinationS3Response> =
        Optional.ofNullable(exportDestinationS3)

    /** The response containing the details of an Google Cloud Storage export destination. */
    fun exportDestinationGoogleCloudStorage():
        Optional<ExportDestinationGoogleCloudStorageResponse> =
        Optional.ofNullable(exportDestinationGoogleCloudStorage)

    fun isExportDestinationS3(): Boolean = exportDestinationS3 != null

    fun isExportDestinationGoogleCloudStorage(): Boolean =
        exportDestinationGoogleCloudStorage != null

    fun asExportDestinationS3(): ExportDestinationS3Response =
        exportDestinationS3.getOrThrow("exportDestinationS3")

    /** The response containing the details of an Google Cloud Storage export destination. */
    fun asExportDestinationGoogleCloudStorage(): ExportDestinationGoogleCloudStorageResponse =
        exportDestinationGoogleCloudStorage.getOrThrow("exportDestinationGoogleCloudStorage")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            exportDestinationS3 != null -> visitor.visitExportDestinationS3(exportDestinationS3)
            exportDestinationGoogleCloudStorage != null ->
                visitor.visitExportDestinationGoogleCloudStorage(
                    exportDestinationGoogleCloudStorage
                )
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): DataExportDestinationCreateResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitExportDestinationS3(
                    exportDestinationS3: ExportDestinationS3Response
                ) {
                    exportDestinationS3.validate()
                }

                override fun visitExportDestinationGoogleCloudStorage(
                    exportDestinationGoogleCloudStorage: ExportDestinationGoogleCloudStorageResponse
                ) {
                    exportDestinationGoogleCloudStorage.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitExportDestinationS3(
                    exportDestinationS3: ExportDestinationS3Response
                ) = exportDestinationS3.validity()

                override fun visitExportDestinationGoogleCloudStorage(
                    exportDestinationGoogleCloudStorage: ExportDestinationGoogleCloudStorageResponse
                ) = exportDestinationGoogleCloudStorage.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportDestinationCreateResponse && exportDestinationS3 == other.exportDestinationS3 && exportDestinationGoogleCloudStorage == other.exportDestinationGoogleCloudStorage /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(exportDestinationS3, exportDestinationGoogleCloudStorage) /* spotless:on */

    override fun toString(): String =
        when {
            exportDestinationS3 != null ->
                "DataExportDestinationCreateResponse{exportDestinationS3=$exportDestinationS3}"
            exportDestinationGoogleCloudStorage != null ->
                "DataExportDestinationCreateResponse{exportDestinationGoogleCloudStorage=$exportDestinationGoogleCloudStorage}"
            _json != null -> "DataExportDestinationCreateResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid DataExportDestinationCreateResponse")
        }

    companion object {

        @JvmStatic
        fun ofExportDestinationS3(exportDestinationS3: ExportDestinationS3Response) =
            DataExportDestinationCreateResponse(exportDestinationS3 = exportDestinationS3)

        /** The response containing the details of an Google Cloud Storage export destination. */
        @JvmStatic
        fun ofExportDestinationGoogleCloudStorage(
            exportDestinationGoogleCloudStorage: ExportDestinationGoogleCloudStorageResponse
        ) =
            DataExportDestinationCreateResponse(
                exportDestinationGoogleCloudStorage = exportDestinationGoogleCloudStorage
            )
    }

    /**
     * An interface that defines how to map each variant of [DataExportDestinationCreateResponse] to
     * a value of type [T].
     */
    interface Visitor<out T> {

        fun visitExportDestinationS3(exportDestinationS3: ExportDestinationS3Response): T

        /** The response containing the details of an Google Cloud Storage export destination. */
        fun visitExportDestinationGoogleCloudStorage(
            exportDestinationGoogleCloudStorage: ExportDestinationGoogleCloudStorageResponse
        ): T

        /**
         * Maps an unknown variant of [DataExportDestinationCreateResponse] to a value of type [T].
         *
         * An instance of [DataExportDestinationCreateResponse] can contain an unknown variant if it
         * was deserialized from data that doesn't match any known variant. For example, if the SDK
         * is on an older version than the API, then the API may respond with new variants that the
         * SDK is unaware of.
         *
         * @throws M3terInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw M3terInvalidDataException("Unknown DataExportDestinationCreateResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<DataExportDestinationCreateResponse>(
            DataExportDestinationCreateResponse::class
        ) {

        override fun ObjectCodec.deserialize(node: JsonNode): DataExportDestinationCreateResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<ExportDestinationS3Response>())?.let {
                            DataExportDestinationCreateResponse(
                                exportDestinationS3 = it,
                                _json = json,
                            )
                        },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<ExportDestinationGoogleCloudStorageResponse>(),
                            )
                            ?.let {
                                DataExportDestinationCreateResponse(
                                    exportDestinationGoogleCloudStorage = it,
                                    _json = json,
                                )
                            },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> DataExportDestinationCreateResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<DataExportDestinationCreateResponse>(
            DataExportDestinationCreateResponse::class
        ) {

        override fun serialize(
            value: DataExportDestinationCreateResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.exportDestinationS3 != null ->
                    generator.writeObject(value.exportDestinationS3)
                value.exportDestinationGoogleCloudStorage != null ->
                    generator.writeObject(value.exportDestinationGoogleCloudStorage)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid DataExportDestinationCreateResponse")
            }
        }
    }

    class ExportDestinationS3Response
    private constructor(
        private val id: JsonField<String>,
        private val version: JsonField<Long>,
        private val code: JsonField<String>,
        private val createdBy: JsonField<String>,
        private val destinationType: JsonField<DataExportDestinationResponse.DestinationType>,
        private val dtCreated: JsonField<OffsetDateTime>,
        private val dtLastModified: JsonField<OffsetDateTime>,
        private val lastModifiedBy: JsonField<String>,
        private val name: JsonField<String>,
        private val bucketName: JsonField<String>,
        private val iamRoleArn: JsonField<String>,
        private val partitionOrder: JsonField<PartitionOrder>,
        private val prefix: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destinationType")
            @ExcludeMissing
            destinationType: JsonField<DataExportDestinationResponse.DestinationType> =
                JsonMissing.of(),
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
        ) : this(
            id,
            version,
            code,
            createdBy,
            destinationType,
            dtCreated,
            dtLastModified,
            lastModifiedBy,
            name,
            bucketName,
            iamRoleArn,
            partitionOrder,
            prefix,
            mutableMapOf(),
        )

        fun toDataExportDestinationResponse(): DataExportDestinationResponse =
            DataExportDestinationResponse.builder()
                .id(id)
                .version(version)
                .code(code)
                .createdBy(createdBy)
                .destinationType(destinationType)
                .dtCreated(dtCreated)
                .dtLastModified(dtLastModified)
                .lastModifiedBy(lastModifiedBy)
                .name(name)
                .build()

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
         * The code of the data Export Destination.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun code(): Optional<String> = code.getOptional("code")

        /**
         * The id of the user who created the Export Destination.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun destinationType(): Optional<DataExportDestinationResponse.DestinationType> =
            destinationType.getOptional("destinationType")

        /**
         * The DateTime when the Export Destination was created.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

        /**
         * The DateTime when the Export Destination was last modified.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dtLastModified(): Optional<OffsetDateTime> =
            dtLastModified.getOptional("dtLastModified")

        /**
         * The id of the user who last modified the Export Destination.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

        /**
         * The name of the data Export Destination.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Name of the S3 bucket for the Export Destination.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bucketName(): Optional<String> = bucketName.getOptional("bucketName")

        /**
         * The specified IAM role ARN with PutObject permission for the specified `bucketName`,
         * which allows the service to upload Data Exports to your S3 bucket.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun iamRoleArn(): Optional<String> = iamRoleArn.getOptional("iamRoleArn")

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
        fun partitionOrder(): Optional<PartitionOrder> =
            partitionOrder.getOptional("partitionOrder")

        /**
         * Location in specified S3 bucket for the Export Destination. If no `prefix` is specified,
         * then the root of the bucket is used.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun prefix(): Optional<String> = prefix.getOptional("prefix")

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
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [createdBy].
         *
         * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

        /**
         * Returns the raw JSON value of [destinationType].
         *
         * Unlike [destinationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("destinationType")
        @ExcludeMissing
        fun _destinationType(): JsonField<DataExportDestinationResponse.DestinationType> =
            destinationType

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
         * Returns the raw JSON value of [bucketName].
         *
         * Unlike [bucketName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bucketName")
        @ExcludeMissing
        fun _bucketName(): JsonField<String> = bucketName

        /**
         * Returns the raw JSON value of [iamRoleArn].
         *
         * Unlike [iamRoleArn], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("iamRoleArn")
        @ExcludeMissing
        fun _iamRoleArn(): JsonField<String> = iamRoleArn

        /**
         * Returns the raw JSON value of [partitionOrder].
         *
         * Unlike [partitionOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * [ExportDestinationS3Response].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .version()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExportDestinationS3Response]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var version: JsonField<Long>? = null
            private var code: JsonField<String> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var destinationType: JsonField<DataExportDestinationResponse.DestinationType> =
                JsonMissing.of()
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
            internal fun from(exportDestinationS3Response: ExportDestinationS3Response) = apply {
                id = exportDestinationS3Response.id
                version = exportDestinationS3Response.version
                code = exportDestinationS3Response.code
                createdBy = exportDestinationS3Response.createdBy
                destinationType = exportDestinationS3Response.destinationType
                dtCreated = exportDestinationS3Response.dtCreated
                dtLastModified = exportDestinationS3Response.dtLastModified
                lastModifiedBy = exportDestinationS3Response.lastModifiedBy
                name = exportDestinationS3Response.name
                bucketName = exportDestinationS3Response.bucketName
                iamRoleArn = exportDestinationS3Response.iamRoleArn
                partitionOrder = exportDestinationS3Response.partitionOrder
                prefix = exportDestinationS3Response.prefix
                additionalProperties =
                    exportDestinationS3Response.additionalProperties.toMutableMap()
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

            /** The code of the data Export Destination. */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** The id of the user who created the Export Destination. */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            fun destinationType(destinationType: DataExportDestinationResponse.DestinationType) =
                destinationType(JsonField.of(destinationType))

            /**
             * Sets [Builder.destinationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationType] with a well-typed
             * [DataExportDestinationResponse.DestinationType] value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun destinationType(
                destinationType: JsonField<DataExportDestinationResponse.DestinationType>
            ) = apply { this.destinationType = destinationType }

            /** The DateTime when the Export Destination was created. */
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

            /** The DateTime when the Export Destination was last modified. */
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

            /** The id of the user who last modified the Export Destination. */
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

            /** The name of the data Export Destination. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** Name of the S3 bucket for the Export Destination. */
            fun bucketName(bucketName: String) = bucketName(JsonField.of(bucketName))

            /**
             * Sets [Builder.bucketName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bucketName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bucketName(bucketName: JsonField<String>) = apply { this.bucketName = bucketName }

            /**
             * The specified IAM role ARN with PutObject permission for the specified `bucketName`,
             * which allows the service to upload Data Exports to your S3 bucket.
             */
            fun iamRoleArn(iamRoleArn: String) = iamRoleArn(JsonField.of(iamRoleArn))

            /**
             * Sets [Builder.iamRoleArn] to an arbitrary JSON value.
             *
             * You should usually call [Builder.iamRoleArn] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun iamRoleArn(iamRoleArn: JsonField<String>) = apply { this.iamRoleArn = iamRoleArn }

            /**
             * Specify how you want the file path to be structured in your bucket destination - by
             * Time first (Default) or Type first.
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
             * Sets [Builder.partitionOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partitionOrder] with a well-typed [PartitionOrder]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun partitionOrder(partitionOrder: JsonField<PartitionOrder>) = apply {
                this.partitionOrder = partitionOrder
            }

            /**
             * Location in specified S3 bucket for the Export Destination. If no `prefix` is
             * specified, then the root of the bucket is used.
             */
            fun prefix(prefix: String) = prefix(JsonField.of(prefix))

            /**
             * Sets [Builder.prefix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prefix] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            /**
             * Returns an immutable instance of [ExportDestinationS3Response].
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
            fun build(): ExportDestinationS3Response =
                ExportDestinationS3Response(
                    checkRequired("id", id),
                    checkRequired("version", version),
                    code,
                    createdBy,
                    destinationType,
                    dtCreated,
                    dtLastModified,
                    lastModifiedBy,
                    name,
                    bucketName,
                    iamRoleArn,
                    partitionOrder,
                    prefix,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ExportDestinationS3Response = apply {
            if (validated) {
                return@apply
            }

            id()
            version()
            code()
            createdBy()
            destinationType().ifPresent { it.validate() }
            dtCreated()
            dtLastModified()
            lastModifiedBy()
            name()
            bucketName()
            iamRoleArn()
            partitionOrder().ifPresent { it.validate() }
            prefix()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0) +
                (if (code.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (destinationType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (dtCreated.asKnown().isPresent) 1 else 0) +
                (if (dtLastModified.asKnown().isPresent) 1 else 0) +
                (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (bucketName.asKnown().isPresent) 1 else 0) +
                (if (iamRoleArn.asKnown().isPresent) 1 else 0) +
                (partitionOrder.asKnown().getOrNull()?.validity() ?: 0) +
                (if (prefix.asKnown().isPresent) 1 else 0)

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
        class PartitionOrder
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws M3terInvalidDataException if this class instance's value is a not a known
             *   member.
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

            return /* spotless:off */ other is ExportDestinationS3Response && id == other.id && version == other.version && code == other.code && createdBy == other.createdBy && destinationType == other.destinationType && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && name == other.name && bucketName == other.bucketName && iamRoleArn == other.iamRoleArn && partitionOrder == other.partitionOrder && prefix == other.prefix && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, version, code, createdBy, destinationType, dtCreated, dtLastModified, lastModifiedBy, name, bucketName, iamRoleArn, partitionOrder, prefix, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExportDestinationS3Response{id=$id, version=$version, code=$code, createdBy=$createdBy, destinationType=$destinationType, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, name=$name, bucketName=$bucketName, iamRoleArn=$iamRoleArn, partitionOrder=$partitionOrder, prefix=$prefix, additionalProperties=$additionalProperties}"
    }

    /** The response containing the details of an Google Cloud Storage export destination. */
    class ExportDestinationGoogleCloudStorageResponse
    private constructor(
        private val id: JsonField<String>,
        private val version: JsonField<Long>,
        private val code: JsonField<String>,
        private val createdBy: JsonField<String>,
        private val destinationType: JsonField<DataExportDestinationResponse.DestinationType>,
        private val dtCreated: JsonField<OffsetDateTime>,
        private val dtLastModified: JsonField<OffsetDateTime>,
        private val lastModifiedBy: JsonField<String>,
        private val name: JsonField<String>,
        private val bucketName: JsonField<String>,
        private val partitionOrder: JsonField<PartitionOrder>,
        private val poolId: JsonField<String>,
        private val prefix: JsonField<String>,
        private val projectNumber: JsonField<String>,
        private val providerId: JsonField<String>,
        private val serviceAccountEmail: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdBy")
            @ExcludeMissing
            createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destinationType")
            @ExcludeMissing
            destinationType: JsonField<DataExportDestinationResponse.DestinationType> =
                JsonMissing.of(),
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
            @JsonProperty("bucketName")
            @ExcludeMissing
            bucketName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("partitionOrder")
            @ExcludeMissing
            partitionOrder: JsonField<PartitionOrder> = JsonMissing.of(),
            @JsonProperty("poolId") @ExcludeMissing poolId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("prefix") @ExcludeMissing prefix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("projectNumber")
            @ExcludeMissing
            projectNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("providerId")
            @ExcludeMissing
            providerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("serviceAccountEmail")
            @ExcludeMissing
            serviceAccountEmail: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            version,
            code,
            createdBy,
            destinationType,
            dtCreated,
            dtLastModified,
            lastModifiedBy,
            name,
            bucketName,
            partitionOrder,
            poolId,
            prefix,
            projectNumber,
            providerId,
            serviceAccountEmail,
            mutableMapOf(),
        )

        fun toDataExportDestinationResponse(): DataExportDestinationResponse =
            DataExportDestinationResponse.builder()
                .id(id)
                .version(version)
                .code(code)
                .createdBy(createdBy)
                .destinationType(destinationType)
                .dtCreated(dtCreated)
                .dtLastModified(dtLastModified)
                .lastModifiedBy(lastModifiedBy)
                .name(name)
                .build()

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
         * The code of the data Export Destination.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun code(): Optional<String> = code.getOptional("code")

        /**
         * The id of the user who created the Export Destination.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun destinationType(): Optional<DataExportDestinationResponse.DestinationType> =
            destinationType.getOptional("destinationType")

        /**
         * The DateTime when the Export Destination was created.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

        /**
         * The DateTime when the Export Destination was last modified.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dtLastModified(): Optional<OffsetDateTime> =
            dtLastModified.getOptional("dtLastModified")

        /**
         * The id of the user who last modified the Export Destination.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

        /**
         * The name of the data Export Destination.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * The bucket name.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun bucketName(): Optional<String> = bucketName.getOptional("bucketName")

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
        fun partitionOrder(): Optional<PartitionOrder> =
            partitionOrder.getOptional("partitionOrder")

        /**
         * The export destination Web Identity Federation poolId.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun poolId(): Optional<String> = poolId.getOptional("poolId")

        /**
         * The prefix.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun prefix(): Optional<String> = prefix.getOptional("prefix")

        /**
         * The export destination GCP projectNumber.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun projectNumber(): Optional<String> = projectNumber.getOptional("projectNumber")

        /**
         * The export destination Web Identity Federation identity providerId.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun providerId(): Optional<String> = providerId.getOptional("providerId")

        /**
         * The export destination service account email.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun serviceAccountEmail(): Optional<String> =
            serviceAccountEmail.getOptional("serviceAccountEmail")

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
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [createdBy].
         *
         * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

        /**
         * Returns the raw JSON value of [destinationType].
         *
         * Unlike [destinationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("destinationType")
        @ExcludeMissing
        fun _destinationType(): JsonField<DataExportDestinationResponse.DestinationType> =
            destinationType

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
         * Returns the raw JSON value of [bucketName].
         *
         * Unlike [bucketName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bucketName")
        @ExcludeMissing
        fun _bucketName(): JsonField<String> = bucketName

        /**
         * Returns the raw JSON value of [partitionOrder].
         *
         * Unlike [partitionOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("partitionOrder")
        @ExcludeMissing
        fun _partitionOrder(): JsonField<PartitionOrder> = partitionOrder

        /**
         * Returns the raw JSON value of [poolId].
         *
         * Unlike [poolId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("poolId") @ExcludeMissing fun _poolId(): JsonField<String> = poolId

        /**
         * Returns the raw JSON value of [prefix].
         *
         * Unlike [prefix], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("prefix") @ExcludeMissing fun _prefix(): JsonField<String> = prefix

        /**
         * Returns the raw JSON value of [projectNumber].
         *
         * Unlike [projectNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("projectNumber")
        @ExcludeMissing
        fun _projectNumber(): JsonField<String> = projectNumber

        /**
         * Returns the raw JSON value of [providerId].
         *
         * Unlike [providerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("providerId")
        @ExcludeMissing
        fun _providerId(): JsonField<String> = providerId

        /**
         * Returns the raw JSON value of [serviceAccountEmail].
         *
         * Unlike [serviceAccountEmail], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("serviceAccountEmail")
        @ExcludeMissing
        fun _serviceAccountEmail(): JsonField<String> = serviceAccountEmail

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
             * [ExportDestinationGoogleCloudStorageResponse].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .version()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExportDestinationGoogleCloudStorageResponse]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var version: JsonField<Long>? = null
            private var code: JsonField<String> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var destinationType: JsonField<DataExportDestinationResponse.DestinationType> =
                JsonMissing.of()
            private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
            private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
            private var lastModifiedBy: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var bucketName: JsonField<String> = JsonMissing.of()
            private var partitionOrder: JsonField<PartitionOrder> = JsonMissing.of()
            private var poolId: JsonField<String> = JsonMissing.of()
            private var prefix: JsonField<String> = JsonMissing.of()
            private var projectNumber: JsonField<String> = JsonMissing.of()
            private var providerId: JsonField<String> = JsonMissing.of()
            private var serviceAccountEmail: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                exportDestinationGoogleCloudStorageResponse:
                    ExportDestinationGoogleCloudStorageResponse
            ) = apply {
                id = exportDestinationGoogleCloudStorageResponse.id
                version = exportDestinationGoogleCloudStorageResponse.version
                code = exportDestinationGoogleCloudStorageResponse.code
                createdBy = exportDestinationGoogleCloudStorageResponse.createdBy
                destinationType = exportDestinationGoogleCloudStorageResponse.destinationType
                dtCreated = exportDestinationGoogleCloudStorageResponse.dtCreated
                dtLastModified = exportDestinationGoogleCloudStorageResponse.dtLastModified
                lastModifiedBy = exportDestinationGoogleCloudStorageResponse.lastModifiedBy
                name = exportDestinationGoogleCloudStorageResponse.name
                bucketName = exportDestinationGoogleCloudStorageResponse.bucketName
                partitionOrder = exportDestinationGoogleCloudStorageResponse.partitionOrder
                poolId = exportDestinationGoogleCloudStorageResponse.poolId
                prefix = exportDestinationGoogleCloudStorageResponse.prefix
                projectNumber = exportDestinationGoogleCloudStorageResponse.projectNumber
                providerId = exportDestinationGoogleCloudStorageResponse.providerId
                serviceAccountEmail =
                    exportDestinationGoogleCloudStorageResponse.serviceAccountEmail
                additionalProperties =
                    exportDestinationGoogleCloudStorageResponse.additionalProperties.toMutableMap()
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

            /** The code of the data Export Destination. */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** The id of the user who created the Export Destination. */
            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            /**
             * Sets [Builder.createdBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            fun destinationType(destinationType: DataExportDestinationResponse.DestinationType) =
                destinationType(JsonField.of(destinationType))

            /**
             * Sets [Builder.destinationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationType] with a well-typed
             * [DataExportDestinationResponse.DestinationType] value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun destinationType(
                destinationType: JsonField<DataExportDestinationResponse.DestinationType>
            ) = apply { this.destinationType = destinationType }

            /** The DateTime when the Export Destination was created. */
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

            /** The DateTime when the Export Destination was last modified. */
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

            /** The id of the user who last modified the Export Destination. */
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

            /** The name of the data Export Destination. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The bucket name. */
            fun bucketName(bucketName: String) = bucketName(JsonField.of(bucketName))

            /**
             * Sets [Builder.bucketName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bucketName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bucketName(bucketName: JsonField<String>) = apply { this.bucketName = bucketName }

            /**
             * Specify how you want the file path to be structured in your bucket destination - by
             * Time first (Default) or Type first.
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
             * Sets [Builder.partitionOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partitionOrder] with a well-typed [PartitionOrder]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun partitionOrder(partitionOrder: JsonField<PartitionOrder>) = apply {
                this.partitionOrder = partitionOrder
            }

            /** The export destination Web Identity Federation poolId. */
            fun poolId(poolId: String) = poolId(JsonField.of(poolId))

            /**
             * Sets [Builder.poolId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.poolId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun poolId(poolId: JsonField<String>) = apply { this.poolId = poolId }

            /** The prefix. */
            fun prefix(prefix: String) = prefix(JsonField.of(prefix))

            /**
             * Sets [Builder.prefix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prefix] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun prefix(prefix: JsonField<String>) = apply { this.prefix = prefix }

            /** The export destination GCP projectNumber. */
            fun projectNumber(projectNumber: String) = projectNumber(JsonField.of(projectNumber))

            /**
             * Sets [Builder.projectNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.projectNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun projectNumber(projectNumber: JsonField<String>) = apply {
                this.projectNumber = projectNumber
            }

            /** The export destination Web Identity Federation identity providerId. */
            fun providerId(providerId: String) = providerId(JsonField.of(providerId))

            /**
             * Sets [Builder.providerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.providerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun providerId(providerId: JsonField<String>) = apply { this.providerId = providerId }

            /** The export destination service account email. */
            fun serviceAccountEmail(serviceAccountEmail: String) =
                serviceAccountEmail(JsonField.of(serviceAccountEmail))

            /**
             * Sets [Builder.serviceAccountEmail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.serviceAccountEmail] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun serviceAccountEmail(serviceAccountEmail: JsonField<String>) = apply {
                this.serviceAccountEmail = serviceAccountEmail
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

            /**
             * Returns an immutable instance of [ExportDestinationGoogleCloudStorageResponse].
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
            fun build(): ExportDestinationGoogleCloudStorageResponse =
                ExportDestinationGoogleCloudStorageResponse(
                    checkRequired("id", id),
                    checkRequired("version", version),
                    code,
                    createdBy,
                    destinationType,
                    dtCreated,
                    dtLastModified,
                    lastModifiedBy,
                    name,
                    bucketName,
                    partitionOrder,
                    poolId,
                    prefix,
                    projectNumber,
                    providerId,
                    serviceAccountEmail,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ExportDestinationGoogleCloudStorageResponse = apply {
            if (validated) {
                return@apply
            }

            id()
            version()
            code()
            createdBy()
            destinationType().ifPresent { it.validate() }
            dtCreated()
            dtLastModified()
            lastModifiedBy()
            name()
            bucketName()
            partitionOrder().ifPresent { it.validate() }
            poolId()
            prefix()
            projectNumber()
            providerId()
            serviceAccountEmail()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0) +
                (if (code.asKnown().isPresent) 1 else 0) +
                (if (createdBy.asKnown().isPresent) 1 else 0) +
                (destinationType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (dtCreated.asKnown().isPresent) 1 else 0) +
                (if (dtLastModified.asKnown().isPresent) 1 else 0) +
                (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (bucketName.asKnown().isPresent) 1 else 0) +
                (partitionOrder.asKnown().getOrNull()?.validity() ?: 0) +
                (if (poolId.asKnown().isPresent) 1 else 0) +
                (if (prefix.asKnown().isPresent) 1 else 0) +
                (if (projectNumber.asKnown().isPresent) 1 else 0) +
                (if (providerId.asKnown().isPresent) 1 else 0) +
                (if (serviceAccountEmail.asKnown().isPresent) 1 else 0)

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
        class PartitionOrder
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws M3terInvalidDataException if this class instance's value is a not a known
             *   member.
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

            return /* spotless:off */ other is ExportDestinationGoogleCloudStorageResponse && id == other.id && version == other.version && code == other.code && createdBy == other.createdBy && destinationType == other.destinationType && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && name == other.name && bucketName == other.bucketName && partitionOrder == other.partitionOrder && poolId == other.poolId && prefix == other.prefix && projectNumber == other.projectNumber && providerId == other.providerId && serviceAccountEmail == other.serviceAccountEmail && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, version, code, createdBy, destinationType, dtCreated, dtLastModified, lastModifiedBy, name, bucketName, partitionOrder, poolId, prefix, projectNumber, providerId, serviceAccountEmail, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExportDestinationGoogleCloudStorageResponse{id=$id, version=$version, code=$code, createdBy=$createdBy, destinationType=$destinationType, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, name=$name, bucketName=$bucketName, partitionOrder=$partitionOrder, poolId=$poolId, prefix=$prefix, projectNumber=$projectNumber, providerId=$providerId, serviceAccountEmail=$serviceAccountEmail, additionalProperties=$additionalProperties}"
    }
}
