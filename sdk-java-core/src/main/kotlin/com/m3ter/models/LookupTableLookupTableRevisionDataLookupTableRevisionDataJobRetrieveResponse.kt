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
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response containing the LookupTableRevisionData job details */
class LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val destinationLookupTableRevisionId: JsonField<String>,
    private val downloadUrl: JsonField<String>,
    private val downloadUrlExpiry: JsonField<String>,
    private val failureReason: JsonField<String>,
    private val fileName: JsonField<String>,
    private val jobDate: JsonField<String>,
    private val lookupTableId: JsonField<String>,
    private val lookupTableRevisionId: JsonField<String>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destinationLookupTableRevisionId")
        @ExcludeMissing
        destinationLookupTableRevisionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("downloadUrl")
        @ExcludeMissing
        downloadUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("downloadUrlExpiry")
        @ExcludeMissing
        downloadUrlExpiry: JsonField<String> = JsonMissing.of(),
        @JsonProperty("failureReason")
        @ExcludeMissing
        failureReason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fileName") @ExcludeMissing fileName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("jobDate") @ExcludeMissing jobDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lookupTableId")
        @ExcludeMissing
        lookupTableId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lookupTableRevisionId")
        @ExcludeMissing
        lookupTableRevisionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        destinationLookupTableRevisionId,
        downloadUrl,
        downloadUrlExpiry,
        failureReason,
        fileName,
        jobDate,
        lookupTableId,
        lookupTableRevisionId,
        status,
        type,
        version,
        mutableMapOf(),
    )

    /**
     * UUID of the Lookup Table Revision Data job.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * UUID of the destination Lookup Table Revision if the Lookup Table Revision Data job is a COPY
     * job.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun destinationLookupTableRevisionId(): Optional<String> =
        destinationLookupTableRevisionId.getOptional("destinationLookupTableRevisionId")

    /**
     * The download Url if the Lookup Table Revision Data job is a DOWNLOAD job.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun downloadUrl(): Optional<String> = downloadUrl.getOptional("downloadUrl")

    /**
     * The download Url expiry if the Lookup Table Revision Data job is a DOWNLOAD job.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun downloadUrlExpiry(): Optional<String> = downloadUrlExpiry.getOptional("downloadUrlExpiry")

    /**
     * The failure reason if the Lookup Table Revision Data job failed.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failureReason(): Optional<String> = failureReason.getOptional("failureReason")

    /**
     * The file name for a Lookup Table Revision Data UPLOAD or DOWNLOAD job.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileName(): Optional<String> = fileName.getOptional("fileName")

    /**
     * The date when the Lookup Table Revision Data job was created.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun jobDate(): Optional<String> = jobDate.getOptional("jobDate")

    /**
     * UUID of the Lookup Table.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lookupTableId(): Optional<String> = lookupTableId.getOptional("lookupTableId")

    /**
     * UUID of the Lookup Table Revision.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lookupTableRevisionId(): Optional<String> =
        lookupTableRevisionId.getOptional("lookupTableRevisionId")

    /**
     * The status of a job
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = status.getOptional("status")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun type(): Optional<Type> = type.getOptional("type")

    /**
     * Version of the Lookup Table Revision Data job.
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
     * Returns the raw JSON value of [destinationLookupTableRevisionId].
     *
     * Unlike [destinationLookupTableRevisionId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("destinationLookupTableRevisionId")
    @ExcludeMissing
    fun _destinationLookupTableRevisionId(): JsonField<String> = destinationLookupTableRevisionId

    /**
     * Returns the raw JSON value of [downloadUrl].
     *
     * Unlike [downloadUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("downloadUrl") @ExcludeMissing fun _downloadUrl(): JsonField<String> = downloadUrl

    /**
     * Returns the raw JSON value of [downloadUrlExpiry].
     *
     * Unlike [downloadUrlExpiry], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("downloadUrlExpiry")
    @ExcludeMissing
    fun _downloadUrlExpiry(): JsonField<String> = downloadUrlExpiry

    /**
     * Returns the raw JSON value of [failureReason].
     *
     * Unlike [failureReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failureReason")
    @ExcludeMissing
    fun _failureReason(): JsonField<String> = failureReason

    /**
     * Returns the raw JSON value of [fileName].
     *
     * Unlike [fileName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fileName") @ExcludeMissing fun _fileName(): JsonField<String> = fileName

    /**
     * Returns the raw JSON value of [jobDate].
     *
     * Unlike [jobDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("jobDate") @ExcludeMissing fun _jobDate(): JsonField<String> = jobDate

    /**
     * Returns the raw JSON value of [lookupTableId].
     *
     * Unlike [lookupTableId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lookupTableId")
    @ExcludeMissing
    fun _lookupTableId(): JsonField<String> = lookupTableId

    /**
     * Returns the raw JSON value of [lookupTableRevisionId].
     *
     * Unlike [lookupTableRevisionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("lookupTableRevisionId")
    @ExcludeMissing
    fun _lookupTableRevisionId(): JsonField<String> = lookupTableRevisionId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * [LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /**
     * A builder for [LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse].
     */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var destinationLookupTableRevisionId: JsonField<String> = JsonMissing.of()
        private var downloadUrl: JsonField<String> = JsonMissing.of()
        private var downloadUrlExpiry: JsonField<String> = JsonMissing.of()
        private var failureReason: JsonField<String> = JsonMissing.of()
        private var fileName: JsonField<String> = JsonMissing.of()
        private var jobDate: JsonField<String> = JsonMissing.of()
        private var lookupTableId: JsonField<String> = JsonMissing.of()
        private var lookupTableRevisionId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse:
                LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
        ) = apply {
            id = lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse.id
            destinationLookupTableRevisionId =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                    .destinationLookupTableRevisionId
            downloadUrl =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                    .downloadUrl
            downloadUrlExpiry =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                    .downloadUrlExpiry
            failureReason =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                    .failureReason
            fileName =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                    .fileName
            jobDate =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse.jobDate
            lookupTableId =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                    .lookupTableId
            lookupTableRevisionId =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                    .lookupTableRevisionId
            status =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse.status
            type = lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse.type
            version =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse.version
            additionalProperties =
                lookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse
                    .additionalProperties
                    .toMutableMap()
        }

        /** UUID of the Lookup Table Revision Data job. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * UUID of the destination Lookup Table Revision if the Lookup Table Revision Data job is a
         * COPY job.
         */
        fun destinationLookupTableRevisionId(destinationLookupTableRevisionId: String) =
            destinationLookupTableRevisionId(JsonField.of(destinationLookupTableRevisionId))

        /**
         * Sets [Builder.destinationLookupTableRevisionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinationLookupTableRevisionId] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun destinationLookupTableRevisionId(destinationLookupTableRevisionId: JsonField<String>) =
            apply {
                this.destinationLookupTableRevisionId = destinationLookupTableRevisionId
            }

        /** The download Url if the Lookup Table Revision Data job is a DOWNLOAD job. */
        fun downloadUrl(downloadUrl: String) = downloadUrl(JsonField.of(downloadUrl))

        /**
         * Sets [Builder.downloadUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downloadUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun downloadUrl(downloadUrl: JsonField<String>) = apply { this.downloadUrl = downloadUrl }

        /** The download Url expiry if the Lookup Table Revision Data job is a DOWNLOAD job. */
        fun downloadUrlExpiry(downloadUrlExpiry: String) =
            downloadUrlExpiry(JsonField.of(downloadUrlExpiry))

        /**
         * Sets [Builder.downloadUrlExpiry] to an arbitrary JSON value.
         *
         * You should usually call [Builder.downloadUrlExpiry] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun downloadUrlExpiry(downloadUrlExpiry: JsonField<String>) = apply {
            this.downloadUrlExpiry = downloadUrlExpiry
        }

        /** The failure reason if the Lookup Table Revision Data job failed. */
        fun failureReason(failureReason: String) = failureReason(JsonField.of(failureReason))

        /**
         * Sets [Builder.failureReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failureReason] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun failureReason(failureReason: JsonField<String>) = apply {
            this.failureReason = failureReason
        }

        /** The file name for a Lookup Table Revision Data UPLOAD or DOWNLOAD job. */
        fun fileName(fileName: String) = fileName(JsonField.of(fileName))

        /**
         * Sets [Builder.fileName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileName(fileName: JsonField<String>) = apply { this.fileName = fileName }

        /** The date when the Lookup Table Revision Data job was created. */
        fun jobDate(jobDate: String) = jobDate(JsonField.of(jobDate))

        /**
         * Sets [Builder.jobDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.jobDate] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun jobDate(jobDate: JsonField<String>) = apply { this.jobDate = jobDate }

        /** UUID of the Lookup Table. */
        fun lookupTableId(lookupTableId: String) = lookupTableId(JsonField.of(lookupTableId))

        /**
         * Sets [Builder.lookupTableId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lookupTableId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lookupTableId(lookupTableId: JsonField<String>) = apply {
            this.lookupTableId = lookupTableId
        }

        /** UUID of the Lookup Table Revision. */
        fun lookupTableRevisionId(lookupTableRevisionId: String) =
            lookupTableRevisionId(JsonField.of(lookupTableRevisionId))

        /**
         * Sets [Builder.lookupTableRevisionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lookupTableRevisionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lookupTableRevisionId(lookupTableRevisionId: JsonField<String>) = apply {
            this.lookupTableRevisionId = lookupTableRevisionId
        }

        /** The status of a job */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Version of the Lookup Table Revision Data job. */
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
         * Returns an immutable instance of
         * [LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse =
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse(
                id,
                destinationLookupTableRevisionId,
                downloadUrl,
                downloadUrlExpiry,
                failureReason,
                fileName,
                jobDate,
                lookupTableId,
                lookupTableRevisionId,
                status,
                type,
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse =
        apply {
            if (validated) {
                return@apply
            }

            id()
            destinationLookupTableRevisionId()
            downloadUrl()
            downloadUrlExpiry()
            failureReason()
            fileName()
            jobDate()
            lookupTableId()
            lookupTableRevisionId()
            status().ifPresent { it.validate() }
            type().ifPresent { it.validate() }
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
            (if (destinationLookupTableRevisionId.asKnown().isPresent) 1 else 0) +
            (if (downloadUrl.asKnown().isPresent) 1 else 0) +
            (if (downloadUrlExpiry.asKnown().isPresent) 1 else 0) +
            (if (failureReason.asKnown().isPresent) 1 else 0) +
            (if (fileName.asKnown().isPresent) 1 else 0) +
            (if (jobDate.asKnown().isPresent) 1 else 0) +
            (if (lookupTableId.asKnown().isPresent) 1 else 0) +
            (if (lookupTableRevisionId.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    /** The status of a job */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PENDING = of("PENDING")

            @JvmField val FAILED = of("FAILED")

            @JvmField val SUCCEEDED = of("SUCCEEDED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            FAILED,
            SUCCEEDED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            FAILED,
            SUCCEEDED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                PENDING -> Value.PENDING
                FAILED -> Value.FAILED
                SUCCEEDED -> Value.SUCCEEDED
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
                PENDING -> Known.PENDING
                FAILED -> Known.FAILED
                SUCCEEDED -> Known.SUCCEEDED
                else -> throw M3terInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val COPY = of("COPY")

            @JvmField val UPLOAD = of("UPLOAD")

            @JvmField val DOWNLOAD = of("DOWNLOAD")

            @JvmField val ARCHIVE = of("ARCHIVE")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            COPY,
            UPLOAD,
            DOWNLOAD,
            ARCHIVE,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COPY,
            UPLOAD,
            DOWNLOAD,
            ARCHIVE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                COPY -> Value.COPY
                UPLOAD -> Value.UPLOAD
                DOWNLOAD -> Value.DOWNLOAD
                ARCHIVE -> Value.ARCHIVE
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
                COPY -> Known.COPY
                UPLOAD -> Known.UPLOAD
                DOWNLOAD -> Known.DOWNLOAD
                ARCHIVE -> Known.ARCHIVE
                else -> throw M3terInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is
            LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse &&
            id == other.id &&
            destinationLookupTableRevisionId == other.destinationLookupTableRevisionId &&
            downloadUrl == other.downloadUrl &&
            downloadUrlExpiry == other.downloadUrlExpiry &&
            failureReason == other.failureReason &&
            fileName == other.fileName &&
            jobDate == other.jobDate &&
            lookupTableId == other.lookupTableId &&
            lookupTableRevisionId == other.lookupTableRevisionId &&
            status == other.status &&
            type == other.type &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            destinationLookupTableRevisionId,
            downloadUrl,
            downloadUrlExpiry,
            failureReason,
            fileName,
            jobDate,
            lookupTableId,
            lookupTableRevisionId,
            status,
            type,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LookupTableLookupTableRevisionDataLookupTableRevisionDataJobRetrieveResponse{id=$id, destinationLookupTableRevisionId=$destinationLookupTableRevisionId, downloadUrl=$downloadUrl, downloadUrlExpiry=$downloadUrlExpiry, failureReason=$failureReason, fileName=$fileName, jobDate=$jobDate, lookupTableId=$lookupTableId, lookupTableRevisionId=$lookupTableRevisionId, status=$status, type=$type, version=$version, additionalProperties=$additionalProperties}"
}
