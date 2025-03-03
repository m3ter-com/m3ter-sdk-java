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
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class UsageDataExportSchedule
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("accountIds")
    @ExcludeMissing
    private val accountIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("aggregation")
    @ExcludeMissing
    private val aggregation: JsonField<Aggregation> = JsonMissing.of(),
    @JsonProperty("aggregationFrequency")
    @ExcludeMissing
    private val aggregationFrequency: JsonField<AggregationFrequency> = JsonMissing.of(),
    @JsonProperty("meterIds")
    @ExcludeMissing
    private val meterIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("timePeriod")
    @ExcludeMissing
    private val timePeriod: JsonField<TimePeriod> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The id of the schedule */
    fun id(): String = id.getRequired("id")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    fun version(): Long = version.getRequired("version")

    /** List of account IDs for which the usage data will be exported. */
    fun accountIds(): Optional<List<String>> =
        Optional.ofNullable(accountIds.getNullable("accountIds"))

    /**
     * Specifies the aggregation method applied to usage data collected in the numeric Data Fields
     * of Meters included for the Data Export Schedule - that is, Data Fields of type **MEASURE**,
     * **INCOME**, or **COST**:
     * - **SUM**. Adds the values.
     * - **MIN**. Uses the minimum value.
     * - **MAX**. Uses the maximum value.
     * - **COUNT**. Counts the number of values.
     * - **LATEST**. Uses the most recent value. Note: Based on the timestamp `ts` value of usage
     *   data measurement submissions. If using this method, please ensure _distinct_ `ts` values
     *   are used for usage data measurement submissions.
     */
    fun aggregation(): Optional<Aggregation> =
        Optional.ofNullable(aggregation.getNullable("aggregation"))

    /**
     * Specifies the time period for the aggregation of usage data included each time the Data
     * Export Schedule runs:
     * - **ORIGINAL**. Usage data is _not aggregated_. If you select to not aggregate, then raw
     *   usage data measurements collected by all Data Field types and any Derived Fields on the
     *   selected Meters are included in the export. This is the _Default_.
     *
     * If you want to aggregate usage data for the Export Schedule you must define an
     * `aggregationFrequency`:
     * - **HOUR**. Aggregated hourly.
     * - **DAY**. Aggregated daily.
     * - **WEEK**. Aggregated weekly.
     * - **MONTH**. Aggregated monthly.
     * - If you select to aggregate usage data for a Export Schedule, then only the aggregated usage
     *   data collected by numeric Data Fields of type **MEASURE**, **INCOME**, or **COST** on
     *   selected Meters are included in the export.
     *
     * **NOTE**: If you define an `aggregationFrequency` other than **ORIGINAL** and do not define
     * an `aggregation` method, then you'll receive and error.
     */
    fun aggregationFrequency(): Optional<AggregationFrequency> =
        Optional.ofNullable(aggregationFrequency.getNullable("aggregationFrequency"))

    /** List of meter IDs for which the usage data will be exported. */
    fun meterIds(): Optional<List<String>> = Optional.ofNullable(meterIds.getNullable("meterIds"))

    /**
     * Define a time period to control the range of usage data you want the data export to contain
     * when it runs:
     * - **TODAY**. Data collected for the current day up until the time the export runs.
     * - **YESTERDAY**. Data collected for the day before the export runs - that is, the 24 hour
     *   period from midnight to midnight of the day before.
     * - **WEEK_TO_DATE**. Data collected for the period covering the current week to the date and
     *   time the export runs, and weeks run Monday to Monday.
     * - **CURRENT_MONTH**. Data collected for the current month in which the export is ran up to
     *   and including the date and time the export runs.
     * - **LAST_30_DAYS**. Data collected for the 30 days prior to the date the export is ran.
     * - **LAST_35_DAYS**. Data collected for the 35 days prior to the date the export is ran.
     * - **PREVIOUS_WEEK**. Data collected for the previous full week period, and weeks run Monday
     *   to Monday.
     * - **PREVIOUS_MONTH**. Data collected for the previous full month period.
     *
     * For more details and examples, see the
     * [Time Period](https://www.m3ter.com/docs/guides/data-exports/creating-export-schedules#time-period)
     * section in our main User Documentation.
     */
    fun timePeriod(): Optional<TimePeriod> =
        Optional.ofNullable(timePeriod.getNullable("timePeriod"))

    /** The id of the schedule */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /** List of account IDs for which the usage data will be exported. */
    @JsonProperty("accountIds")
    @ExcludeMissing
    fun _accountIds(): JsonField<List<String>> = accountIds

    /**
     * Specifies the aggregation method applied to usage data collected in the numeric Data Fields
     * of Meters included for the Data Export Schedule - that is, Data Fields of type **MEASURE**,
     * **INCOME**, or **COST**:
     * - **SUM**. Adds the values.
     * - **MIN**. Uses the minimum value.
     * - **MAX**. Uses the maximum value.
     * - **COUNT**. Counts the number of values.
     * - **LATEST**. Uses the most recent value. Note: Based on the timestamp `ts` value of usage
     *   data measurement submissions. If using this method, please ensure _distinct_ `ts` values
     *   are used for usage data measurement submissions.
     */
    @JsonProperty("aggregation")
    @ExcludeMissing
    fun _aggregation(): JsonField<Aggregation> = aggregation

    /**
     * Specifies the time period for the aggregation of usage data included each time the Data
     * Export Schedule runs:
     * - **ORIGINAL**. Usage data is _not aggregated_. If you select to not aggregate, then raw
     *   usage data measurements collected by all Data Field types and any Derived Fields on the
     *   selected Meters are included in the export. This is the _Default_.
     *
     * If you want to aggregate usage data for the Export Schedule you must define an
     * `aggregationFrequency`:
     * - **HOUR**. Aggregated hourly.
     * - **DAY**. Aggregated daily.
     * - **WEEK**. Aggregated weekly.
     * - **MONTH**. Aggregated monthly.
     * - If you select to aggregate usage data for a Export Schedule, then only the aggregated usage
     *   data collected by numeric Data Fields of type **MEASURE**, **INCOME**, or **COST** on
     *   selected Meters are included in the export.
     *
     * **NOTE**: If you define an `aggregationFrequency` other than **ORIGINAL** and do not define
     * an `aggregation` method, then you'll receive and error.
     */
    @JsonProperty("aggregationFrequency")
    @ExcludeMissing
    fun _aggregationFrequency(): JsonField<AggregationFrequency> = aggregationFrequency

    /** List of meter IDs for which the usage data will be exported. */
    @JsonProperty("meterIds") @ExcludeMissing fun _meterIds(): JsonField<List<String>> = meterIds

    /**
     * Define a time period to control the range of usage data you want the data export to contain
     * when it runs:
     * - **TODAY**. Data collected for the current day up until the time the export runs.
     * - **YESTERDAY**. Data collected for the day before the export runs - that is, the 24 hour
     *   period from midnight to midnight of the day before.
     * - **WEEK_TO_DATE**. Data collected for the period covering the current week to the date and
     *   time the export runs, and weeks run Monday to Monday.
     * - **CURRENT_MONTH**. Data collected for the current month in which the export is ran up to
     *   and including the date and time the export runs.
     * - **LAST_30_DAYS**. Data collected for the 30 days prior to the date the export is ran.
     * - **LAST_35_DAYS**. Data collected for the 35 days prior to the date the export is ran.
     * - **PREVIOUS_WEEK**. Data collected for the previous full week period, and weeks run Monday
     *   to Monday.
     * - **PREVIOUS_MONTH**. Data collected for the previous full month period.
     *
     * For more details and examples, see the
     * [Time Period](https://www.m3ter.com/docs/guides/data-exports/creating-export-schedules#time-period)
     * section in our main User Documentation.
     */
    @JsonProperty("timePeriod")
    @ExcludeMissing
    fun _timePeriod(): JsonField<TimePeriod> = timePeriod

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): UsageDataExportSchedule = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        accountIds()
        aggregation()
        aggregationFrequency()
        meterIds()
        timePeriod()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageDataExportSchedule]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var accountIds: JsonField<MutableList<String>>? = null
        private var aggregation: JsonField<Aggregation> = JsonMissing.of()
        private var aggregationFrequency: JsonField<AggregationFrequency> = JsonMissing.of()
        private var meterIds: JsonField<MutableList<String>>? = null
        private var timePeriod: JsonField<TimePeriod> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageDataExportSchedule: UsageDataExportSchedule) = apply {
            id = usageDataExportSchedule.id
            version = usageDataExportSchedule.version
            accountIds = usageDataExportSchedule.accountIds.map { it.toMutableList() }
            aggregation = usageDataExportSchedule.aggregation
            aggregationFrequency = usageDataExportSchedule.aggregationFrequency
            meterIds = usageDataExportSchedule.meterIds.map { it.toMutableList() }
            timePeriod = usageDataExportSchedule.timePeriod
            additionalProperties = usageDataExportSchedule.additionalProperties.toMutableMap()
        }

        /** The id of the schedule */
        fun id(id: String) = id(JsonField.of(id))

        /** The id of the schedule */
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

        /** List of account IDs for which the usage data will be exported. */
        fun accountIds(accountIds: List<String>) = accountIds(JsonField.of(accountIds))

        /** List of account IDs for which the usage data will be exported. */
        fun accountIds(accountIds: JsonField<List<String>>) = apply {
            this.accountIds = accountIds.map { it.toMutableList() }
        }

        /** List of account IDs for which the usage data will be exported. */
        fun addAccountId(accountId: String) = apply {
            accountIds =
                (accountIds ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(accountId)
                }
        }

        /**
         * Specifies the aggregation method applied to usage data collected in the numeric Data
         * Fields of Meters included for the Data Export Schedule - that is, Data Fields of type
         * **MEASURE**, **INCOME**, or **COST**:
         * - **SUM**. Adds the values.
         * - **MIN**. Uses the minimum value.
         * - **MAX**. Uses the maximum value.
         * - **COUNT**. Counts the number of values.
         * - **LATEST**. Uses the most recent value. Note: Based on the timestamp `ts` value of
         *   usage data measurement submissions. If using this method, please ensure _distinct_ `ts`
         *   values are used for usage data measurement submissions.
         */
        fun aggregation(aggregation: Aggregation) = aggregation(JsonField.of(aggregation))

        /**
         * Specifies the aggregation method applied to usage data collected in the numeric Data
         * Fields of Meters included for the Data Export Schedule - that is, Data Fields of type
         * **MEASURE**, **INCOME**, or **COST**:
         * - **SUM**. Adds the values.
         * - **MIN**. Uses the minimum value.
         * - **MAX**. Uses the maximum value.
         * - **COUNT**. Counts the number of values.
         * - **LATEST**. Uses the most recent value. Note: Based on the timestamp `ts` value of
         *   usage data measurement submissions. If using this method, please ensure _distinct_ `ts`
         *   values are used for usage data measurement submissions.
         */
        fun aggregation(aggregation: JsonField<Aggregation>) = apply {
            this.aggregation = aggregation
        }

        /**
         * Specifies the time period for the aggregation of usage data included each time the Data
         * Export Schedule runs:
         * - **ORIGINAL**. Usage data is _not aggregated_. If you select to not aggregate, then raw
         *   usage data measurements collected by all Data Field types and any Derived Fields on the
         *   selected Meters are included in the export. This is the _Default_.
         *
         * If you want to aggregate usage data for the Export Schedule you must define an
         * `aggregationFrequency`:
         * - **HOUR**. Aggregated hourly.
         * - **DAY**. Aggregated daily.
         * - **WEEK**. Aggregated weekly.
         * - **MONTH**. Aggregated monthly.
         * - If you select to aggregate usage data for a Export Schedule, then only the aggregated
         *   usage data collected by numeric Data Fields of type **MEASURE**, **INCOME**, or
         *   **COST** on selected Meters are included in the export.
         *
         * **NOTE**: If you define an `aggregationFrequency` other than **ORIGINAL** and do not
         * define an `aggregation` method, then you'll receive and error.
         */
        fun aggregationFrequency(aggregationFrequency: AggregationFrequency) =
            aggregationFrequency(JsonField.of(aggregationFrequency))

        /**
         * Specifies the time period for the aggregation of usage data included each time the Data
         * Export Schedule runs:
         * - **ORIGINAL**. Usage data is _not aggregated_. If you select to not aggregate, then raw
         *   usage data measurements collected by all Data Field types and any Derived Fields on the
         *   selected Meters are included in the export. This is the _Default_.
         *
         * If you want to aggregate usage data for the Export Schedule you must define an
         * `aggregationFrequency`:
         * - **HOUR**. Aggregated hourly.
         * - **DAY**. Aggregated daily.
         * - **WEEK**. Aggregated weekly.
         * - **MONTH**. Aggregated monthly.
         * - If you select to aggregate usage data for a Export Schedule, then only the aggregated
         *   usage data collected by numeric Data Fields of type **MEASURE**, **INCOME**, or
         *   **COST** on selected Meters are included in the export.
         *
         * **NOTE**: If you define an `aggregationFrequency` other than **ORIGINAL** and do not
         * define an `aggregation` method, then you'll receive and error.
         */
        fun aggregationFrequency(aggregationFrequency: JsonField<AggregationFrequency>) = apply {
            this.aggregationFrequency = aggregationFrequency
        }

        /** List of meter IDs for which the usage data will be exported. */
        fun meterIds(meterIds: List<String>) = meterIds(JsonField.of(meterIds))

        /** List of meter IDs for which the usage data will be exported. */
        fun meterIds(meterIds: JsonField<List<String>>) = apply {
            this.meterIds = meterIds.map { it.toMutableList() }
        }

        /** List of meter IDs for which the usage data will be exported. */
        fun addMeterId(meterId: String) = apply {
            meterIds =
                (meterIds ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(meterId)
                }
        }

        /**
         * Define a time period to control the range of usage data you want the data export to
         * contain when it runs:
         * - **TODAY**. Data collected for the current day up until the time the export runs.
         * - **YESTERDAY**. Data collected for the day before the export runs - that is, the 24 hour
         *   period from midnight to midnight of the day before.
         * - **WEEK_TO_DATE**. Data collected for the period covering the current week to the date
         *   and time the export runs, and weeks run Monday to Monday.
         * - **CURRENT_MONTH**. Data collected for the current month in which the export is ran up
         *   to and including the date and time the export runs.
         * - **LAST_30_DAYS**. Data collected for the 30 days prior to the date the export is ran.
         * - **LAST_35_DAYS**. Data collected for the 35 days prior to the date the export is ran.
         * - **PREVIOUS_WEEK**. Data collected for the previous full week period, and weeks run
         *   Monday to Monday.
         * - **PREVIOUS_MONTH**. Data collected for the previous full month period.
         *
         * For more details and examples, see the
         * [Time Period](https://www.m3ter.com/docs/guides/data-exports/creating-export-schedules#time-period)
         * section in our main User Documentation.
         */
        fun timePeriod(timePeriod: TimePeriod) = timePeriod(JsonField.of(timePeriod))

        /**
         * Define a time period to control the range of usage data you want the data export to
         * contain when it runs:
         * - **TODAY**. Data collected for the current day up until the time the export runs.
         * - **YESTERDAY**. Data collected for the day before the export runs - that is, the 24 hour
         *   period from midnight to midnight of the day before.
         * - **WEEK_TO_DATE**. Data collected for the period covering the current week to the date
         *   and time the export runs, and weeks run Monday to Monday.
         * - **CURRENT_MONTH**. Data collected for the current month in which the export is ran up
         *   to and including the date and time the export runs.
         * - **LAST_30_DAYS**. Data collected for the 30 days prior to the date the export is ran.
         * - **LAST_35_DAYS**. Data collected for the 35 days prior to the date the export is ran.
         * - **PREVIOUS_WEEK**. Data collected for the previous full week period, and weeks run
         *   Monday to Monday.
         * - **PREVIOUS_MONTH**. Data collected for the previous full month period.
         *
         * For more details and examples, see the
         * [Time Period](https://www.m3ter.com/docs/guides/data-exports/creating-export-schedules#time-period)
         * section in our main User Documentation.
         */
        fun timePeriod(timePeriod: JsonField<TimePeriod>) = apply { this.timePeriod = timePeriod }

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

        fun build(): UsageDataExportSchedule =
            UsageDataExportSchedule(
                checkRequired("id", id),
                checkRequired("version", version),
                (accountIds ?: JsonMissing.of()).map { it.toImmutable() },
                aggregation,
                aggregationFrequency,
                (meterIds ?: JsonMissing.of()).map { it.toImmutable() },
                timePeriod,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * Specifies the aggregation method applied to usage data collected in the numeric Data Fields
     * of Meters included for the Data Export Schedule - that is, Data Fields of type **MEASURE**,
     * **INCOME**, or **COST**:
     * - **SUM**. Adds the values.
     * - **MIN**. Uses the minimum value.
     * - **MAX**. Uses the maximum value.
     * - **COUNT**. Counts the number of values.
     * - **LATEST**. Uses the most recent value. Note: Based on the timestamp `ts` value of usage
     *   data measurement submissions. If using this method, please ensure _distinct_ `ts` values
     *   are used for usage data measurement submissions.
     */
    class Aggregation @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val SUM = of("SUM")

            @JvmField val MIN = of("MIN")

            @JvmField val MAX = of("MAX")

            @JvmField val COUNT = of("COUNT")

            @JvmField val LATEST = of("LATEST")

            @JvmField val MEAN = of("MEAN")

            @JvmStatic fun of(value: String) = Aggregation(JsonField.of(value))
        }

        /** An enum containing [Aggregation]'s known values. */
        enum class Known {
            SUM,
            MIN,
            MAX,
            COUNT,
            LATEST,
            MEAN,
        }

        /**
         * An enum containing [Aggregation]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Aggregation] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUM,
            MIN,
            MAX,
            COUNT,
            LATEST,
            MEAN,
            /**
             * An enum member indicating that [Aggregation] was instantiated with an unknown value.
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
                SUM -> Value.SUM
                MIN -> Value.MIN
                MAX -> Value.MAX
                COUNT -> Value.COUNT
                LATEST -> Value.LATEST
                MEAN -> Value.MEAN
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
                SUM -> Known.SUM
                MIN -> Known.MIN
                MAX -> Known.MAX
                COUNT -> Known.COUNT
                LATEST -> Known.LATEST
                MEAN -> Known.MEAN
                else -> throw M3terInvalidDataException("Unknown Aggregation: $value")
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

            return /* spotless:off */ other is Aggregation && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Specifies the time period for the aggregation of usage data included each time the Data
     * Export Schedule runs:
     * - **ORIGINAL**. Usage data is _not aggregated_. If you select to not aggregate, then raw
     *   usage data measurements collected by all Data Field types and any Derived Fields on the
     *   selected Meters are included in the export. This is the _Default_.
     *
     * If you want to aggregate usage data for the Export Schedule you must define an
     * `aggregationFrequency`:
     * - **HOUR**. Aggregated hourly.
     * - **DAY**. Aggregated daily.
     * - **WEEK**. Aggregated weekly.
     * - **MONTH**. Aggregated monthly.
     * - If you select to aggregate usage data for a Export Schedule, then only the aggregated usage
     *   data collected by numeric Data Fields of type **MEASURE**, **INCOME**, or **COST** on
     *   selected Meters are included in the export.
     *
     * **NOTE**: If you define an `aggregationFrequency` other than **ORIGINAL** and do not define
     * an `aggregation` method, then you'll receive and error.
     */
    class AggregationFrequency
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ORIGINAL = of("ORIGINAL")

            @JvmField val HOUR = of("HOUR")

            @JvmField val DAY = of("DAY")

            @JvmField val WEEK = of("WEEK")

            @JvmField val MONTH = of("MONTH")

            @JvmStatic fun of(value: String) = AggregationFrequency(JsonField.of(value))
        }

        /** An enum containing [AggregationFrequency]'s known values. */
        enum class Known {
            ORIGINAL,
            HOUR,
            DAY,
            WEEK,
            MONTH,
        }

        /**
         * An enum containing [AggregationFrequency]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AggregationFrequency] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ORIGINAL,
            HOUR,
            DAY,
            WEEK,
            MONTH,
            /**
             * An enum member indicating that [AggregationFrequency] was instantiated with an
             * unknown value.
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
                ORIGINAL -> Value.ORIGINAL
                HOUR -> Value.HOUR
                DAY -> Value.DAY
                WEEK -> Value.WEEK
                MONTH -> Value.MONTH
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
                ORIGINAL -> Known.ORIGINAL
                HOUR -> Known.HOUR
                DAY -> Known.DAY
                WEEK -> Known.WEEK
                MONTH -> Known.MONTH
                else -> throw M3terInvalidDataException("Unknown AggregationFrequency: $value")
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

            return /* spotless:off */ other is AggregationFrequency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Define a time period to control the range of usage data you want the data export to contain
     * when it runs:
     * - **TODAY**. Data collected for the current day up until the time the export runs.
     * - **YESTERDAY**. Data collected for the day before the export runs - that is, the 24 hour
     *   period from midnight to midnight of the day before.
     * - **WEEK_TO_DATE**. Data collected for the period covering the current week to the date and
     *   time the export runs, and weeks run Monday to Monday.
     * - **CURRENT_MONTH**. Data collected for the current month in which the export is ran up to
     *   and including the date and time the export runs.
     * - **LAST_30_DAYS**. Data collected for the 30 days prior to the date the export is ran.
     * - **LAST_35_DAYS**. Data collected for the 35 days prior to the date the export is ran.
     * - **PREVIOUS_WEEK**. Data collected for the previous full week period, and weeks run Monday
     *   to Monday.
     * - **PREVIOUS_MONTH**. Data collected for the previous full month period.
     *
     * For more details and examples, see the
     * [Time Period](https://www.m3ter.com/docs/guides/data-exports/creating-export-schedules#time-period)
     * section in our main User Documentation.
     */
    class TimePeriod @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TODAY = of("TODAY")

            @JvmField val YESTERDAY = of("YESTERDAY")

            @JvmField val WEEK_TO_DATE = of("WEEK_TO_DATE")

            @JvmField val CURRENT_MONTH = of("CURRENT_MONTH")

            @JvmField val LAST_30_DAYS = of("LAST_30_DAYS")

            @JvmField val LAST_35_DAYS = of("LAST_35_DAYS")

            @JvmField val PREVIOUS_WEEK = of("PREVIOUS_WEEK")

            @JvmField val PREVIOUS_MONTH = of("PREVIOUS_MONTH")

            @JvmStatic fun of(value: String) = TimePeriod(JsonField.of(value))
        }

        /** An enum containing [TimePeriod]'s known values. */
        enum class Known {
            TODAY,
            YESTERDAY,
            WEEK_TO_DATE,
            CURRENT_MONTH,
            LAST_30_DAYS,
            LAST_35_DAYS,
            PREVIOUS_WEEK,
            PREVIOUS_MONTH,
        }

        /**
         * An enum containing [TimePeriod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TimePeriod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TODAY,
            YESTERDAY,
            WEEK_TO_DATE,
            CURRENT_MONTH,
            LAST_30_DAYS,
            LAST_35_DAYS,
            PREVIOUS_WEEK,
            PREVIOUS_MONTH,
            /**
             * An enum member indicating that [TimePeriod] was instantiated with an unknown value.
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
                TODAY -> Value.TODAY
                YESTERDAY -> Value.YESTERDAY
                WEEK_TO_DATE -> Value.WEEK_TO_DATE
                CURRENT_MONTH -> Value.CURRENT_MONTH
                LAST_30_DAYS -> Value.LAST_30_DAYS
                LAST_35_DAYS -> Value.LAST_35_DAYS
                PREVIOUS_WEEK -> Value.PREVIOUS_WEEK
                PREVIOUS_MONTH -> Value.PREVIOUS_MONTH
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
                TODAY -> Known.TODAY
                YESTERDAY -> Known.YESTERDAY
                WEEK_TO_DATE -> Known.WEEK_TO_DATE
                CURRENT_MONTH -> Known.CURRENT_MONTH
                LAST_30_DAYS -> Known.LAST_30_DAYS
                LAST_35_DAYS -> Known.LAST_35_DAYS
                PREVIOUS_WEEK -> Known.PREVIOUS_WEEK
                PREVIOUS_MONTH -> Known.PREVIOUS_MONTH
                else -> throw M3terInvalidDataException("Unknown TimePeriod: $value")
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

            return /* spotless:off */ other is TimePeriod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UsageDataExportSchedule && id == other.id && version == other.version && accountIds == other.accountIds && aggregation == other.aggregation && aggregationFrequency == other.aggregationFrequency && meterIds == other.meterIds && timePeriod == other.timePeriod && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, accountIds, aggregation, aggregationFrequency, meterIds, timePeriod, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageDataExportSchedule{id=$id, version=$version, accountIds=$accountIds, aggregation=$aggregation, aggregationFrequency=$aggregationFrequency, meterIds=$meterIds, timePeriod=$timePeriod, additionalProperties=$additionalProperties}"
}
