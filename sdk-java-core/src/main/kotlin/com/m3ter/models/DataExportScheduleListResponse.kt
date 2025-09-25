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
import com.m3ter.core.checkKnown
import com.m3ter.core.checkRequired
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class DataExportScheduleListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val code: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val destinationIds: JsonField<List<String>>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val exportFileFormat: JsonField<ExportFileFormat>,
    private val lastModifiedBy: JsonField<String>,
    private val name: JsonField<String>,
    private val period: JsonField<Int>,
    private val scheduleType: JsonField<ScheduleType>,
    private val sourceType: JsonField<SourceType>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destinationIds")
        @ExcludeMissing
        destinationIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("exportFileFormat")
        @ExcludeMissing
        exportFileFormat: JsonField<ExportFileFormat> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("period") @ExcludeMissing period: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("scheduleType")
        @ExcludeMissing
        scheduleType: JsonField<ScheduleType> = JsonMissing.of(),
        @JsonProperty("sourceType")
        @ExcludeMissing
        sourceType: JsonField<SourceType> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        code,
        createdBy,
        destinationIds,
        dtCreated,
        dtLastModified,
        exportFileFormat,
        lastModifiedBy,
        name,
        period,
        scheduleType,
        sourceType,
        version,
        mutableMapOf(),
    )

    /**
     * The id of the Data Export Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Unique short code of the Data Export Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<String> = code.getOptional("code")

    /**
     * The id of the user who created this Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * The Export Destination ids.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun destinationIds(): Optional<List<String>> = destinationIds.getOptional("destinationIds")

    /**
     * The DateTime when the Data Export Schedule was created.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The DateTime when the Schedule was last modified.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exportFileFormat(): Optional<ExportFileFormat> =
        exportFileFormat.getOptional("exportFileFormat")

    /**
     * The id of the user who last modified this Data Export Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * The name of the Data Export Schedule.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Defines the Schedule frequency for the Data Export to run in Hours, Days, or Minutes. Used in
     * conjunction with the `scheduleType` parameter.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun period(): Optional<Int> = period.getOptional("period")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduleType(): Optional<ScheduleType> = scheduleType.getOptional("scheduleType")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceType(): Optional<SourceType> = sourceType.getOptional("sourceType")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
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
     * Returns the raw JSON value of [destinationIds].
     *
     * Unlike [destinationIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destinationIds")
    @ExcludeMissing
    fun _destinationIds(): JsonField<List<String>> = destinationIds

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
     * Unlike [dtLastModified], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /**
     * Returns the raw JSON value of [exportFileFormat].
     *
     * Unlike [exportFileFormat], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("exportFileFormat")
    @ExcludeMissing
    fun _exportFileFormat(): JsonField<ExportFileFormat> = exportFileFormat

    /**
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
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
     * Returns the raw JSON value of [period].
     *
     * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<Int> = period

    /**
     * Returns the raw JSON value of [scheduleType].
     *
     * Unlike [scheduleType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("scheduleType")
    @ExcludeMissing
    fun _scheduleType(): JsonField<ScheduleType> = scheduleType

    /**
     * Returns the raw JSON value of [sourceType].
     *
     * Unlike [sourceType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceType")
    @ExcludeMissing
    fun _sourceType(): JsonField<SourceType> = sourceType

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
         * [DataExportScheduleListResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExportScheduleListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var code: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var destinationIds: JsonField<MutableList<String>>? = null
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var exportFileFormat: JsonField<ExportFileFormat> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var period: JsonField<Int> = JsonMissing.of()
        private var scheduleType: JsonField<ScheduleType> = JsonMissing.of()
        private var sourceType: JsonField<SourceType> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataExportScheduleListResponse: DataExportScheduleListResponse) = apply {
            id = dataExportScheduleListResponse.id
            code = dataExportScheduleListResponse.code
            createdBy = dataExportScheduleListResponse.createdBy
            destinationIds =
                dataExportScheduleListResponse.destinationIds.map { it.toMutableList() }
            dtCreated = dataExportScheduleListResponse.dtCreated
            dtLastModified = dataExportScheduleListResponse.dtLastModified
            exportFileFormat = dataExportScheduleListResponse.exportFileFormat
            lastModifiedBy = dataExportScheduleListResponse.lastModifiedBy
            name = dataExportScheduleListResponse.name
            period = dataExportScheduleListResponse.period
            scheduleType = dataExportScheduleListResponse.scheduleType
            sourceType = dataExportScheduleListResponse.sourceType
            version = dataExportScheduleListResponse.version
            additionalProperties =
                dataExportScheduleListResponse.additionalProperties.toMutableMap()
        }

        /** The id of the Data Export Schedule. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Unique short code of the Data Export Schedule. */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** The id of the user who created this Schedule. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The Export Destination ids. */
        fun destinationIds(destinationIds: List<String>) =
            destinationIds(JsonField.of(destinationIds))

        /**
         * Sets [Builder.destinationIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinationIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun destinationIds(destinationIds: JsonField<List<String>>) = apply {
            this.destinationIds = destinationIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [destinationIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDestinationId(destinationId: String) = apply {
            destinationIds =
                (destinationIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("destinationIds", it).add(destinationId)
                }
        }

        /** The DateTime when the Data Export Schedule was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when the Schedule was last modified. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /**
         * Sets [Builder.dtLastModified] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtLastModified] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        fun exportFileFormat(exportFileFormat: ExportFileFormat) =
            exportFileFormat(JsonField.of(exportFileFormat))

        /**
         * Sets [Builder.exportFileFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exportFileFormat] with a well-typed [ExportFileFormat]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun exportFileFormat(exportFileFormat: JsonField<ExportFileFormat>) = apply {
            this.exportFileFormat = exportFileFormat
        }

        /** The id of the user who last modified this Data Export Schedule. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

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

        /** The name of the Data Export Schedule. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Defines the Schedule frequency for the Data Export to run in Hours, Days, or Minutes.
         * Used in conjunction with the `scheduleType` parameter.
         */
        fun period(period: Int) = period(JsonField.of(period))

        /**
         * Sets [Builder.period] to an arbitrary JSON value.
         *
         * You should usually call [Builder.period] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun period(period: JsonField<Int>) = apply { this.period = period }

        fun scheduleType(scheduleType: ScheduleType) = scheduleType(JsonField.of(scheduleType))

        /**
         * Sets [Builder.scheduleType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduleType] with a well-typed [ScheduleType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scheduleType(scheduleType: JsonField<ScheduleType>) = apply {
            this.scheduleType = scheduleType
        }

        fun sourceType(sourceType: SourceType) = sourceType(JsonField.of(sourceType))

        /**
         * Sets [Builder.sourceType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceType] with a well-typed [SourceType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceType(sourceType: JsonField<SourceType>) = apply { this.sourceType = sourceType }

        /**
         * The version number:
         * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
         *   response.
         * - **Update:** On successful Update, the version is incremented by 1 in the response.
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
         * Returns an immutable instance of [DataExportScheduleListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataExportScheduleListResponse =
            DataExportScheduleListResponse(
                checkRequired("id", id),
                code,
                createdBy,
                (destinationIds ?: JsonMissing.of()).map { it.toImmutable() },
                dtCreated,
                dtLastModified,
                exportFileFormat,
                lastModifiedBy,
                name,
                period,
                scheduleType,
                sourceType,
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DataExportScheduleListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        code()
        createdBy()
        destinationIds()
        dtCreated()
        dtLastModified()
        exportFileFormat().ifPresent { it.validate() }
        lastModifiedBy()
        name()
        period()
        scheduleType().ifPresent { it.validate() }
        sourceType().ifPresent { it.validate() }
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
            (if (code.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (destinationIds.asKnown().getOrNull()?.size ?: 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (exportFileFormat.asKnown().getOrNull()?.validity() ?: 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (period.asKnown().isPresent) 1 else 0) +
            (scheduleType.asKnown().getOrNull()?.validity() ?: 0) +
            (sourceType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    class ExportFileFormat @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val CSV = of("CSV")

            @JvmField val JSON = of("JSON")

            @JvmField val JSONL = of("JSONL")

            @JvmStatic fun of(value: String) = ExportFileFormat(JsonField.of(value))
        }

        /** An enum containing [ExportFileFormat]'s known values. */
        enum class Known {
            CSV,
            JSON,
            JSONL,
        }

        /**
         * An enum containing [ExportFileFormat]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ExportFileFormat] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CSV,
            JSON,
            JSONL,
            /**
             * An enum member indicating that [ExportFileFormat] was instantiated with an unknown
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
                CSV -> Value.CSV
                JSON -> Value.JSON
                JSONL -> Value.JSONL
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
                CSV -> Known.CSV
                JSON -> Known.JSON
                JSONL -> Known.JSONL
                else -> throw M3terInvalidDataException("Unknown ExportFileFormat: $value")
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

        fun validate(): ExportFileFormat = apply {
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

            return other is ExportFileFormat && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ScheduleType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val HOUR = of("HOUR")

            @JvmField val DAY = of("DAY")

            @JvmField val MINUTE = of("MINUTE")

            @JvmField val AD_HOC = of("AD_HOC")

            @JvmStatic fun of(value: String) = ScheduleType(JsonField.of(value))
        }

        /** An enum containing [ScheduleType]'s known values. */
        enum class Known {
            HOUR,
            DAY,
            MINUTE,
            AD_HOC,
        }

        /**
         * An enum containing [ScheduleType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ScheduleType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            HOUR,
            DAY,
            MINUTE,
            AD_HOC,
            /**
             * An enum member indicating that [ScheduleType] was instantiated with an unknown value.
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
                HOUR -> Value.HOUR
                DAY -> Value.DAY
                MINUTE -> Value.MINUTE
                AD_HOC -> Value.AD_HOC
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
                HOUR -> Known.HOUR
                DAY -> Known.DAY
                MINUTE -> Known.MINUTE
                AD_HOC -> Known.AD_HOC
                else -> throw M3terInvalidDataException("Unknown ScheduleType: $value")
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

        fun validate(): ScheduleType = apply {
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

            return other is ScheduleType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class SourceType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val USAGE = of("USAGE")

            @JvmField val OPERATIONAL = of("OPERATIONAL")

            @JvmStatic fun of(value: String) = SourceType(JsonField.of(value))
        }

        /** An enum containing [SourceType]'s known values. */
        enum class Known {
            USAGE,
            OPERATIONAL,
        }

        /**
         * An enum containing [SourceType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SourceType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USAGE,
            OPERATIONAL,
            /**
             * An enum member indicating that [SourceType] was instantiated with an unknown value.
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
                USAGE -> Value.USAGE
                OPERATIONAL -> Value.OPERATIONAL
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
                USAGE -> Known.USAGE
                OPERATIONAL -> Known.OPERATIONAL
                else -> throw M3terInvalidDataException("Unknown SourceType: $value")
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

        fun validate(): SourceType = apply {
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

            return other is SourceType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataExportScheduleListResponse &&
            id == other.id &&
            code == other.code &&
            createdBy == other.createdBy &&
            destinationIds == other.destinationIds &&
            dtCreated == other.dtCreated &&
            dtLastModified == other.dtLastModified &&
            exportFileFormat == other.exportFileFormat &&
            lastModifiedBy == other.lastModifiedBy &&
            name == other.name &&
            period == other.period &&
            scheduleType == other.scheduleType &&
            sourceType == other.sourceType &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            code,
            createdBy,
            destinationIds,
            dtCreated,
            dtLastModified,
            exportFileFormat,
            lastModifiedBy,
            name,
            period,
            scheduleType,
            sourceType,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataExportScheduleListResponse{id=$id, code=$code, createdBy=$createdBy, destinationIds=$destinationIds, dtCreated=$dtCreated, dtLastModified=$dtLastModified, exportFileFormat=$exportFileFormat, lastModifiedBy=$lastModifiedBy, name=$name, period=$period, scheduleType=$scheduleType, sourceType=$sourceType, version=$version, additionalProperties=$additionalProperties}"
}
