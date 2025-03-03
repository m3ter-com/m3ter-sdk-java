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
class DataExportScheduleListResponse
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
    @JsonProperty("destinationIds")
    @ExcludeMissing
    private val destinationIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("exportFileFormat")
    @ExcludeMissing
    private val exportFileFormat: JsonField<ExportFileFormat> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("period") @ExcludeMissing private val period: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("scheduleType")
    @ExcludeMissing
    private val scheduleType: JsonField<ScheduleType> = JsonMissing.of(),
    @JsonProperty("sourceType")
    @ExcludeMissing
    private val sourceType: JsonField<SourceType> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The id of the Data Export Schedule. */
    fun id(): String = id.getRequired("id")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    fun version(): Long = version.getRequired("version")

    /** Unique short code of the Data Export Schedule. */
    fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

    /** The id of the user who created this Schedule. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** The Export Destination ids. */
    fun destinationIds(): Optional<List<String>> =
        Optional.ofNullable(destinationIds.getNullable("destinationIds"))

    /** The DateTime when the Data Export Schedule was created. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The DateTime when the Schedule was last modified. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    fun exportFileFormat(): Optional<ExportFileFormat> =
        Optional.ofNullable(exportFileFormat.getNullable("exportFileFormat"))

    /** The id of the user who last modified this Data Export Schedule. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** The name of the Data Export Schedule. */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /**
     * Defines the Schedule frequency for the Data Export to run in Hours or Days. Used in
     * conjunction with the `scheduleType` parameter.
     */
    fun period(): Optional<Long> = Optional.ofNullable(period.getNullable("period"))

    fun scheduleType(): Optional<ScheduleType> =
        Optional.ofNullable(scheduleType.getNullable("scheduleType"))

    fun sourceType(): Optional<SourceType> =
        Optional.ofNullable(sourceType.getNullable("sourceType"))

    /** The id of the Data Export Schedule. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /** Unique short code of the Data Export Schedule. */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /** The id of the user who created this Schedule. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** The Export Destination ids. */
    @JsonProperty("destinationIds")
    @ExcludeMissing
    fun _destinationIds(): JsonField<List<String>> = destinationIds

    /** The DateTime when the Data Export Schedule was created. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The DateTime when the Schedule was last modified. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    @JsonProperty("exportFileFormat")
    @ExcludeMissing
    fun _exportFileFormat(): JsonField<ExportFileFormat> = exportFileFormat

    /** The id of the user who last modified this Data Export Schedule. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /** The name of the Data Export Schedule. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Defines the Schedule frequency for the Data Export to run in Hours or Days. Used in
     * conjunction with the `scheduleType` parameter.
     */
    @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<Long> = period

    @JsonProperty("scheduleType")
    @ExcludeMissing
    fun _scheduleType(): JsonField<ScheduleType> = scheduleType

    @JsonProperty("sourceType")
    @ExcludeMissing
    fun _sourceType(): JsonField<SourceType> = sourceType

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DataExportScheduleListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        code()
        createdBy()
        destinationIds()
        dtCreated()
        dtLastModified()
        exportFileFormat()
        lastModifiedBy()
        name()
        period()
        scheduleType()
        sourceType()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExportScheduleListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var code: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var destinationIds: JsonField<MutableList<String>>? = null
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var exportFileFormat: JsonField<ExportFileFormat> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var period: JsonField<Long> = JsonMissing.of()
        private var scheduleType: JsonField<ScheduleType> = JsonMissing.of()
        private var sourceType: JsonField<SourceType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataExportScheduleListResponse: DataExportScheduleListResponse) = apply {
            id = dataExportScheduleListResponse.id
            version = dataExportScheduleListResponse.version
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
            additionalProperties =
                dataExportScheduleListResponse.additionalProperties.toMutableMap()
        }

        /** The id of the Data Export Schedule. */
        fun id(id: String) = id(JsonField.of(id))

        /** The id of the Data Export Schedule. */
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

        /** Unique short code of the Data Export Schedule. */
        fun code(code: String) = code(JsonField.of(code))

        /** Unique short code of the Data Export Schedule. */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** The id of the user who created this Schedule. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The id of the user who created this Schedule. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The Export Destination ids. */
        fun destinationIds(destinationIds: List<String>) =
            destinationIds(JsonField.of(destinationIds))

        /** The Export Destination ids. */
        fun destinationIds(destinationIds: JsonField<List<String>>) = apply {
            this.destinationIds = destinationIds.map { it.toMutableList() }
        }

        /** The Export Destination ids. */
        fun addDestinationId(destinationId: String) = apply {
            destinationIds =
                (destinationIds ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(destinationId)
                }
        }

        /** The DateTime when the Data Export Schedule was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The DateTime when the Data Export Schedule was created. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when the Schedule was last modified. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The DateTime when the Schedule was last modified. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        fun exportFileFormat(exportFileFormat: ExportFileFormat) =
            exportFileFormat(JsonField.of(exportFileFormat))

        fun exportFileFormat(exportFileFormat: JsonField<ExportFileFormat>) = apply {
            this.exportFileFormat = exportFileFormat
        }

        /** The id of the user who last modified this Data Export Schedule. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The id of the user who last modified this Data Export Schedule. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /** The name of the Data Export Schedule. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the Data Export Schedule. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Defines the Schedule frequency for the Data Export to run in Hours or Days. Used in
         * conjunction with the `scheduleType` parameter.
         */
        fun period(period: Long) = period(JsonField.of(period))

        /**
         * Defines the Schedule frequency for the Data Export to run in Hours or Days. Used in
         * conjunction with the `scheduleType` parameter.
         */
        fun period(period: JsonField<Long>) = apply { this.period = period }

        fun scheduleType(scheduleType: ScheduleType) = scheduleType(JsonField.of(scheduleType))

        fun scheduleType(scheduleType: JsonField<ScheduleType>) = apply {
            this.scheduleType = scheduleType
        }

        fun sourceType(sourceType: SourceType) = sourceType(JsonField.of(sourceType))

        fun sourceType(sourceType: JsonField<SourceType>) = apply { this.sourceType = sourceType }

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

        fun build(): DataExportScheduleListResponse =
            DataExportScheduleListResponse(
                checkRequired("id", id),
                checkRequired("version", version),
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
                additionalProperties.toImmutable(),
            )
    }

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

            @JvmStatic fun of(value: String) = ExportFileFormat(JsonField.of(value))
        }

        /** An enum containing [ExportFileFormat]'s known values. */
        enum class Known {
            CSV,
            JSON,
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExportFileFormat && value == other.value /* spotless:on */
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

            @JvmField val HOURLY = of("HOURLY")

            @JvmField val DAILY = of("DAILY")

            @JvmField val AD_HOC = of("AD_HOC")

            @JvmStatic fun of(value: String) = ScheduleType(JsonField.of(value))
        }

        /** An enum containing [ScheduleType]'s known values. */
        enum class Known {
            HOURLY,
            DAILY,
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
            HOURLY,
            DAILY,
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
                HOURLY -> Value.HOURLY
                DAILY -> Value.DAILY
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
                HOURLY -> Known.HOURLY
                DAILY -> Known.DAILY
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ScheduleType && value == other.value /* spotless:on */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SourceType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportScheduleListResponse && id == other.id && version == other.version && code == other.code && createdBy == other.createdBy && destinationIds == other.destinationIds && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && exportFileFormat == other.exportFileFormat && lastModifiedBy == other.lastModifiedBy && name == other.name && period == other.period && scheduleType == other.scheduleType && sourceType == other.sourceType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, code, createdBy, destinationIds, dtCreated, dtLastModified, exportFileFormat, lastModifiedBy, name, period, scheduleType, sourceType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataExportScheduleListResponse{id=$id, version=$version, code=$code, createdBy=$createdBy, destinationIds=$destinationIds, dtCreated=$dtCreated, dtLastModified=$dtLastModified, exportFileFormat=$exportFileFormat, lastModifiedBy=$lastModifiedBy, name=$name, period=$period, scheduleType=$scheduleType, sourceType=$sourceType, additionalProperties=$additionalProperties}"
}
