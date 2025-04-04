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
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response containing the upload job details. */
class FileUploadJobResponse
private constructor(
    private val id: JsonField<String>,
    private val contentLength: JsonField<Long>,
    private val failedRows: JsonField<Long>,
    private val fileName: JsonField<String>,
    private val processedRows: JsonField<Long>,
    private val status: JsonField<Status>,
    private val totalRows: JsonField<Long>,
    private val uploadDate: JsonField<String>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contentLength")
        @ExcludeMissing
        contentLength: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("failedRows") @ExcludeMissing failedRows: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("fileName") @ExcludeMissing fileName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("processedRows")
        @ExcludeMissing
        processedRows: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("totalRows") @ExcludeMissing totalRows: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("uploadDate")
        @ExcludeMissing
        uploadDate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        contentLength,
        failedRows,
        fileName,
        processedRows,
        status,
        totalRows,
        uploadDate,
        version,
        mutableMapOf(),
    )

    /**
     * UUID of the file upload job.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /**
     * The size of the body in bytes. For example: `"contentLength": 485`, where 485 is the size in
     * bytes of the file uploaded.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contentLength(): Optional<Long> =
        Optional.ofNullable(contentLength.getNullable("contentLength"))

    /**
     * The number of rows that failed processing during ingest.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun failedRows(): Optional<Long> = Optional.ofNullable(failedRows.getNullable("failedRows"))

    /**
     * The name of the measurements file for the upload job.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileName(): Optional<String> = Optional.ofNullable(fileName.getNullable("fileName"))

    /**
     * The number of rows that were processed during ingest.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun processedRows(): Optional<Long> =
        Optional.ofNullable(processedRows.getNullable("processedRows"))

    /**
     * The status of the file upload job.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

    /**
     * The total number of rows in the file.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalRows(): Optional<Long> = Optional.ofNullable(totalRows.getNullable("totalRows"))

    /**
     * The upload date for the upload job _(in ISO-8601 format)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun uploadDate(): Optional<String> = Optional.ofNullable(uploadDate.getNullable("uploadDate"))

    /**
     * The version number. Default value when newly created is one.
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
     * Returns the raw JSON value of [contentLength].
     *
     * Unlike [contentLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contentLength")
    @ExcludeMissing
    fun _contentLength(): JsonField<Long> = contentLength

    /**
     * Returns the raw JSON value of [failedRows].
     *
     * Unlike [failedRows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("failedRows") @ExcludeMissing fun _failedRows(): JsonField<Long> = failedRows

    /**
     * Returns the raw JSON value of [fileName].
     *
     * Unlike [fileName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fileName") @ExcludeMissing fun _fileName(): JsonField<String> = fileName

    /**
     * Returns the raw JSON value of [processedRows].
     *
     * Unlike [processedRows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("processedRows")
    @ExcludeMissing
    fun _processedRows(): JsonField<Long> = processedRows

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [totalRows].
     *
     * Unlike [totalRows], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalRows") @ExcludeMissing fun _totalRows(): JsonField<Long> = totalRows

    /**
     * Returns the raw JSON value of [uploadDate].
     *
     * Unlike [uploadDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uploadDate") @ExcludeMissing fun _uploadDate(): JsonField<String> = uploadDate

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

        /** Returns a mutable builder for constructing an instance of [FileUploadJobResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileUploadJobResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var contentLength: JsonField<Long> = JsonMissing.of()
        private var failedRows: JsonField<Long> = JsonMissing.of()
        private var fileName: JsonField<String> = JsonMissing.of()
        private var processedRows: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var totalRows: JsonField<Long> = JsonMissing.of()
        private var uploadDate: JsonField<String> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fileUploadJobResponse: FileUploadJobResponse) = apply {
            id = fileUploadJobResponse.id
            contentLength = fileUploadJobResponse.contentLength
            failedRows = fileUploadJobResponse.failedRows
            fileName = fileUploadJobResponse.fileName
            processedRows = fileUploadJobResponse.processedRows
            status = fileUploadJobResponse.status
            totalRows = fileUploadJobResponse.totalRows
            uploadDate = fileUploadJobResponse.uploadDate
            version = fileUploadJobResponse.version
            additionalProperties = fileUploadJobResponse.additionalProperties.toMutableMap()
        }

        /** UUID of the file upload job. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The size of the body in bytes. For example: `"contentLength": 485`, where 485 is the size
         * in bytes of the file uploaded.
         */
        fun contentLength(contentLength: Long) = contentLength(JsonField.of(contentLength))

        /**
         * Sets [Builder.contentLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentLength] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contentLength(contentLength: JsonField<Long>) = apply {
            this.contentLength = contentLength
        }

        /** The number of rows that failed processing during ingest. */
        fun failedRows(failedRows: Long) = failedRows(JsonField.of(failedRows))

        /**
         * Sets [Builder.failedRows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.failedRows] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun failedRows(failedRows: JsonField<Long>) = apply { this.failedRows = failedRows }

        /** The name of the measurements file for the upload job. */
        fun fileName(fileName: String) = fileName(JsonField.of(fileName))

        /**
         * Sets [Builder.fileName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileName(fileName: JsonField<String>) = apply { this.fileName = fileName }

        /** The number of rows that were processed during ingest. */
        fun processedRows(processedRows: Long) = processedRows(JsonField.of(processedRows))

        /**
         * Sets [Builder.processedRows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.processedRows] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun processedRows(processedRows: JsonField<Long>) = apply {
            this.processedRows = processedRows
        }

        /** The status of the file upload job. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The total number of rows in the file. */
        fun totalRows(totalRows: Long) = totalRows(JsonField.of(totalRows))

        /**
         * Sets [Builder.totalRows] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalRows] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalRows(totalRows: JsonField<Long>) = apply { this.totalRows = totalRows }

        /** The upload date for the upload job _(in ISO-8601 format)_. */
        fun uploadDate(uploadDate: String) = uploadDate(JsonField.of(uploadDate))

        /**
         * Sets [Builder.uploadDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uploadDate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun uploadDate(uploadDate: JsonField<String>) = apply { this.uploadDate = uploadDate }

        /** The version number. Default value when newly created is one. */
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
         * Returns an immutable instance of [FileUploadJobResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FileUploadJobResponse =
            FileUploadJobResponse(
                id,
                contentLength,
                failedRows,
                fileName,
                processedRows,
                status,
                totalRows,
                uploadDate,
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FileUploadJobResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        contentLength()
        failedRows()
        fileName()
        processedRows()
        status().ifPresent { it.validate() }
        totalRows()
        uploadDate()
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
            (if (contentLength.asKnown().isPresent) 1 else 0) +
            (if (failedRows.asKnown().isPresent) 1 else 0) +
            (if (fileName.asKnown().isPresent) 1 else 0) +
            (if (processedRows.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (totalRows.asKnown().isPresent) 1 else 0) +
            (if (uploadDate.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    /** The status of the file upload job. */
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

            @JvmField val NOT_UPLOADED = of("notUploaded")

            @JvmField val RUNNING = of("running")

            @JvmField val FAILED = of("failed")

            @JvmField val SUCCEEDED = of("succeeded")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            NOT_UPLOADED,
            RUNNING,
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
            NOT_UPLOADED,
            RUNNING,
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
                NOT_UPLOADED -> Value.NOT_UPLOADED
                RUNNING -> Value.RUNNING
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
                NOT_UPLOADED -> Known.NOT_UPLOADED
                RUNNING -> Known.RUNNING
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FileUploadJobResponse && id == other.id && contentLength == other.contentLength && failedRows == other.failedRows && fileName == other.fileName && processedRows == other.processedRows && status == other.status && totalRows == other.totalRows && uploadDate == other.uploadDate && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, contentLength, failedRows, fileName, processedRows, status, totalRows, uploadDate, version, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FileUploadJobResponse{id=$id, contentLength=$contentLength, failedRows=$failedRows, fileName=$fileName, processedRows=$processedRows, status=$status, totalRows=$totalRows, uploadDate=$uploadDate, version=$version, additionalProperties=$additionalProperties}"
}
