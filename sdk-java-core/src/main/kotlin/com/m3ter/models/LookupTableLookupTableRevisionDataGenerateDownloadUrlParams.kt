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
import com.m3ter.core.Params
import com.m3ter.core.checkRequired
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Generate a URL which can be used to upload a data file for creating or updating the Lookup Table
 * Revision's data:
 * * An upload URL is returned together with an UPLOAD `jobId`.
 * * You can then upload your data file using a PUT request using the returned upload URL as the
 *   endpoint. For the PUT request, map the headers returned and their values and in the request
 *   body select the specified CSV or JSONL file containing the Revision Data to upload.
 * * You can use the returned UPLOAD `jobId` with the
 *   [List LookupTableRevisionData Jobs](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/ListLookupTableRevisionDataJobs)
 *   or the
 *   [Get LookupTableRevisionData Job Response](https://www.m3ter.com/docs/api#tag/LookupTableRevisionData/operation/GetLookupTableRevisionDataJobResponse)
 *   endpoints for any follow-up or troubleshooting.
 *
 * **Important:**
 * * The `contentLength` request parameter is required.
 * * The upload URL is time limited - it is valid for ***one minute***.
 */
class LookupTableLookupTableRevisionDataGenerateDownloadUrlParams
private constructor(
    private val orgId: String?,
    private val lookupTableId: String,
    private val lookupTableRevisionId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun lookupTableId(): String = lookupTableId

    fun lookupTableRevisionId(): Optional<String> = Optional.ofNullable(lookupTableRevisionId)

    /**
     * The size of the file body in bytes. For example: `"contentLength": 485`, where 485 is the
     * size in bytes of the file to upload.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contentLength(): Long = body.contentLength()

    /**
     * The content type
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contentType(): ContentType = body.contentType()

    /**
     * The name of the file to be uploaded.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileName(): String = body.fileName()

    /**
     * Version of the Lookup Table Revision Data.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<Long> = body.version()

    /**
     * Returns the raw JSON value of [contentLength].
     *
     * Unlike [contentLength], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contentLength(): JsonField<Long> = body._contentLength()

    /**
     * Returns the raw JSON value of [contentType].
     *
     * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contentType(): JsonField<ContentType> = body._contentType()

    /**
     * Returns the raw JSON value of [fileName].
     *
     * Unlike [fileName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fileName(): JsonField<String> = body._fileName()

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LookupTableLookupTableRevisionDataGenerateDownloadUrlParams].
         *
         * The following fields are required:
         * ```java
         * .lookupTableId()
         * .contentLength()
         * .contentType()
         * .fileName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LookupTableLookupTableRevisionDataGenerateDownloadUrlParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var lookupTableId: String? = null
        private var lookupTableRevisionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            lookupTableLookupTableRevisionDataGenerateDownloadUrlParams:
                LookupTableLookupTableRevisionDataGenerateDownloadUrlParams
        ) = apply {
            orgId = lookupTableLookupTableRevisionDataGenerateDownloadUrlParams.orgId
            lookupTableId =
                lookupTableLookupTableRevisionDataGenerateDownloadUrlParams.lookupTableId
            lookupTableRevisionId =
                lookupTableLookupTableRevisionDataGenerateDownloadUrlParams.lookupTableRevisionId
            body = lookupTableLookupTableRevisionDataGenerateDownloadUrlParams.body.toBuilder()
            additionalHeaders =
                lookupTableLookupTableRevisionDataGenerateDownloadUrlParams.additionalHeaders
                    .toBuilder()
            additionalQueryParams =
                lookupTableLookupTableRevisionDataGenerateDownloadUrlParams.additionalQueryParams
                    .toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun lookupTableId(lookupTableId: String) = apply { this.lookupTableId = lookupTableId }

        fun lookupTableRevisionId(lookupTableRevisionId: String?) = apply {
            this.lookupTableRevisionId = lookupTableRevisionId
        }

        /**
         * Alias for calling [Builder.lookupTableRevisionId] with
         * `lookupTableRevisionId.orElse(null)`.
         */
        fun lookupTableRevisionId(lookupTableRevisionId: Optional<String>) =
            lookupTableRevisionId(lookupTableRevisionId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [contentLength]
         * - [contentType]
         * - [fileName]
         * - [version]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The size of the file body in bytes. For example: `"contentLength": 485`, where 485 is the
         * size in bytes of the file to upload.
         */
        fun contentLength(contentLength: Long) = apply { body.contentLength(contentLength) }

        /**
         * Sets [Builder.contentLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentLength] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contentLength(contentLength: JsonField<Long>) = apply {
            body.contentLength(contentLength)
        }

        /** The content type */
        fun contentType(contentType: ContentType) = apply { body.contentType(contentType) }

        /**
         * Sets [Builder.contentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentType] with a well-typed [ContentType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contentType(contentType: JsonField<ContentType>) = apply {
            body.contentType(contentType)
        }

        /** The name of the file to be uploaded. */
        fun fileName(fileName: String) = apply { body.fileName(fileName) }

        /**
         * Sets [Builder.fileName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileName(fileName: JsonField<String>) = apply { body.fileName(fileName) }

        /** Version of the Lookup Table Revision Data. */
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
         * Returns an immutable instance of
         * [LookupTableLookupTableRevisionDataGenerateDownloadUrlParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .lookupTableId()
         * .contentLength()
         * .contentType()
         * .fileName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LookupTableLookupTableRevisionDataGenerateDownloadUrlParams =
            LookupTableLookupTableRevisionDataGenerateDownloadUrlParams(
                orgId,
                checkRequired("lookupTableId", lookupTableId),
                lookupTableRevisionId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            1 -> lookupTableId
            2 -> lookupTableRevisionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request containing the file details when generating an upload URL */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val contentLength: JsonField<Long>,
        private val contentType: JsonField<ContentType>,
        private val fileName: JsonField<String>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("contentLength")
            @ExcludeMissing
            contentLength: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("contentType")
            @ExcludeMissing
            contentType: JsonField<ContentType> = JsonMissing.of(),
            @JsonProperty("fileName")
            @ExcludeMissing
            fileName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(contentLength, contentType, fileName, version, mutableMapOf())

        /**
         * The size of the file body in bytes. For example: `"contentLength": 485`, where 485 is the
         * size in bytes of the file to upload.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contentLength(): Long = contentLength.getRequired("contentLength")

        /**
         * The content type
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contentType(): ContentType = contentType.getRequired("contentType")

        /**
         * The name of the file to be uploaded.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fileName(): String = fileName.getRequired("fileName")

        /**
         * Version of the Lookup Table Revision Data.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun version(): Optional<Long> = version.getOptional("version")

        /**
         * Returns the raw JSON value of [contentLength].
         *
         * Unlike [contentLength], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("contentLength")
        @ExcludeMissing
        fun _contentLength(): JsonField<Long> = contentLength

        /**
         * Returns the raw JSON value of [contentType].
         *
         * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contentType")
        @ExcludeMissing
        fun _contentType(): JsonField<ContentType> = contentType

        /**
         * Returns the raw JSON value of [fileName].
         *
         * Unlike [fileName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fileName") @ExcludeMissing fun _fileName(): JsonField<String> = fileName

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
             * .contentLength()
             * .contentType()
             * .fileName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var contentLength: JsonField<Long>? = null
            private var contentType: JsonField<ContentType>? = null
            private var fileName: JsonField<String>? = null
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                contentLength = body.contentLength
                contentType = body.contentType
                fileName = body.fileName
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The size of the file body in bytes. For example: `"contentLength": 485`, where 485 is
             * the size in bytes of the file to upload.
             */
            fun contentLength(contentLength: Long) = contentLength(JsonField.of(contentLength))

            /**
             * Sets [Builder.contentLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentLength] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentLength(contentLength: JsonField<Long>) = apply {
                this.contentLength = contentLength
            }

            /** The content type */
            fun contentType(contentType: ContentType) = contentType(JsonField.of(contentType))

            /**
             * Sets [Builder.contentType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contentType] with a well-typed [ContentType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contentType(contentType: JsonField<ContentType>) = apply {
                this.contentType = contentType
            }

            /** The name of the file to be uploaded. */
            fun fileName(fileName: String) = fileName(JsonField.of(fileName))

            /**
             * Sets [Builder.fileName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileName(fileName: JsonField<String>) = apply { this.fileName = fileName }

            /** Version of the Lookup Table Revision Data. */
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
             * .contentLength()
             * .contentType()
             * .fileName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("contentLength", contentLength),
                    checkRequired("contentType", contentType),
                    checkRequired("fileName", fileName),
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            contentLength()
            contentType().validate()
            fileName()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (contentLength.asKnown().isPresent) 1 else 0) +
                (contentType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (fileName.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                contentLength == other.contentLength &&
                contentType == other.contentType &&
                fileName == other.fileName &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(contentLength, contentType, fileName, version, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{contentLength=$contentLength, contentType=$contentType, fileName=$fileName, version=$version, additionalProperties=$additionalProperties}"
    }

    /** The content type */
    class ContentType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val APPLICATION_JSONL = of("application/jsonl")

            @JvmField val TEXT_CSV = of("text/csv")

            @JvmStatic fun of(value: String) = ContentType(JsonField.of(value))
        }

        /** An enum containing [ContentType]'s known values. */
        enum class Known {
            APPLICATION_JSONL,
            TEXT_CSV,
        }

        /**
         * An enum containing [ContentType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ContentType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APPLICATION_JSONL,
            TEXT_CSV,
            /**
             * An enum member indicating that [ContentType] was instantiated with an unknown value.
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
                APPLICATION_JSONL -> Value.APPLICATION_JSONL
                TEXT_CSV -> Value.TEXT_CSV
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
                APPLICATION_JSONL -> Known.APPLICATION_JSONL
                TEXT_CSV -> Known.TEXT_CSV
                else -> throw M3terInvalidDataException("Unknown ContentType: $value")
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

        fun validate(): ContentType = apply {
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

            return other is ContentType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LookupTableLookupTableRevisionDataGenerateDownloadUrlParams &&
            orgId == other.orgId &&
            lookupTableId == other.lookupTableId &&
            lookupTableRevisionId == other.lookupTableRevisionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            orgId,
            lookupTableId,
            lookupTableRevisionId,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "LookupTableLookupTableRevisionDataGenerateDownloadUrlParams{orgId=$orgId, lookupTableId=$lookupTableId, lookupTableRevisionId=$lookupTableRevisionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
