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
import com.m3ter.core.checkKnown
import com.m3ter.core.checkRequired
import com.m3ter.core.getOrThrow
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UsageDataExportScheduleResponse
private constructor(
    private val id: JsonField<String>,
    private val version: JsonField<Long>,
    private val accountIds: JsonField<List<String>>,
    private val aggregations: JsonField<List<Aggregation>>,
    private val dimensionFilters: JsonField<List<DimensionFilter>>,
    private val groups: JsonField<List<Group>>,
    private val meterIds: JsonField<List<String>>,
    private val timePeriod: JsonField<TimePeriod>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("accountIds")
        @ExcludeMissing
        accountIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("aggregations")
        @ExcludeMissing
        aggregations: JsonField<List<Aggregation>> = JsonMissing.of(),
        @JsonProperty("dimensionFilters")
        @ExcludeMissing
        dimensionFilters: JsonField<List<DimensionFilter>> = JsonMissing.of(),
        @JsonProperty("groups") @ExcludeMissing groups: JsonField<List<Group>> = JsonMissing.of(),
        @JsonProperty("meterIds")
        @ExcludeMissing
        meterIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("timePeriod")
        @ExcludeMissing
        timePeriod: JsonField<TimePeriod> = JsonMissing.of(),
    ) : this(
        id,
        version,
        accountIds,
        aggregations,
        dimensionFilters,
        groups,
        meterIds,
        timePeriod,
        mutableMapOf(),
    )

    /**
     * The id of the schedule configuration.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Long = version.getRequired("version")

    /**
     * List of account IDs for which the usage data will be exported.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountIds(): Optional<List<String>> = accountIds.getOptional("accountIds")

    /**
     * List of aggregations to apply
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aggregations(): Optional<List<Aggregation>> = aggregations.getOptional("aggregations")

    /**
     * List of dimension filters to apply
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dimensionFilters(): Optional<List<DimensionFilter>> =
        dimensionFilters.getOptional("dimensionFilters")

    /**
     * List of groups to apply
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groups(): Optional<List<Group>> = groups.getOptional("groups")

    /**
     * List of meter IDs for which the usage data will be exported.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun meterIds(): Optional<List<String>> = meterIds.getOptional("meterIds")

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
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timePeriod(): Optional<TimePeriod> = timePeriod.getOptional("timePeriod")

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
     * Returns the raw JSON value of [accountIds].
     *
     * Unlike [accountIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountIds")
    @ExcludeMissing
    fun _accountIds(): JsonField<List<String>> = accountIds

    /**
     * Returns the raw JSON value of [aggregations].
     *
     * Unlike [aggregations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("aggregations")
    @ExcludeMissing
    fun _aggregations(): JsonField<List<Aggregation>> = aggregations

    /**
     * Returns the raw JSON value of [dimensionFilters].
     *
     * Unlike [dimensionFilters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dimensionFilters")
    @ExcludeMissing
    fun _dimensionFilters(): JsonField<List<DimensionFilter>> = dimensionFilters

    /**
     * Returns the raw JSON value of [groups].
     *
     * Unlike [groups], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("groups") @ExcludeMissing fun _groups(): JsonField<List<Group>> = groups

    /**
     * Returns the raw JSON value of [meterIds].
     *
     * Unlike [meterIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meterIds") @ExcludeMissing fun _meterIds(): JsonField<List<String>> = meterIds

    /**
     * Returns the raw JSON value of [timePeriod].
     *
     * Unlike [timePeriod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timePeriod")
    @ExcludeMissing
    fun _timePeriod(): JsonField<TimePeriod> = timePeriod

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
         * [UsageDataExportScheduleResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageDataExportScheduleResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var accountIds: JsonField<MutableList<String>>? = null
        private var aggregations: JsonField<MutableList<Aggregation>>? = null
        private var dimensionFilters: JsonField<MutableList<DimensionFilter>>? = null
        private var groups: JsonField<MutableList<Group>>? = null
        private var meterIds: JsonField<MutableList<String>>? = null
        private var timePeriod: JsonField<TimePeriod> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(usageDataExportScheduleResponse: UsageDataExportScheduleResponse) =
            apply {
                id = usageDataExportScheduleResponse.id
                version = usageDataExportScheduleResponse.version
                accountIds = usageDataExportScheduleResponse.accountIds.map { it.toMutableList() }
                aggregations =
                    usageDataExportScheduleResponse.aggregations.map { it.toMutableList() }
                dimensionFilters =
                    usageDataExportScheduleResponse.dimensionFilters.map { it.toMutableList() }
                groups = usageDataExportScheduleResponse.groups.map { it.toMutableList() }
                meterIds = usageDataExportScheduleResponse.meterIds.map { it.toMutableList() }
                timePeriod = usageDataExportScheduleResponse.timePeriod
                additionalProperties =
                    usageDataExportScheduleResponse.additionalProperties.toMutableMap()
            }

        /** The id of the schedule configuration. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

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

        /** List of account IDs for which the usage data will be exported. */
        fun accountIds(accountIds: List<String>) = accountIds(JsonField.of(accountIds))

        /**
         * Sets [Builder.accountIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountIds(accountIds: JsonField<List<String>>) = apply {
            this.accountIds = accountIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [accountIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccountId(accountId: String) = apply {
            accountIds =
                (accountIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("accountIds", it).add(accountId)
                }
        }

        /** List of aggregations to apply */
        fun aggregations(aggregations: List<Aggregation>) = aggregations(JsonField.of(aggregations))

        /**
         * Sets [Builder.aggregations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregations] with a well-typed `List<Aggregation>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun aggregations(aggregations: JsonField<List<Aggregation>>) = apply {
            this.aggregations = aggregations.map { it.toMutableList() }
        }

        /**
         * Adds a single [Aggregation] to [aggregations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAggregation(aggregation: Aggregation) = apply {
            aggregations =
                (aggregations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("aggregations", it).add(aggregation)
                }
        }

        /** List of dimension filters to apply */
        fun dimensionFilters(dimensionFilters: List<DimensionFilter>) =
            dimensionFilters(JsonField.of(dimensionFilters))

        /**
         * Sets [Builder.dimensionFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dimensionFilters] with a well-typed
         * `List<DimensionFilter>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun dimensionFilters(dimensionFilters: JsonField<List<DimensionFilter>>) = apply {
            this.dimensionFilters = dimensionFilters.map { it.toMutableList() }
        }

        /**
         * Adds a single [DimensionFilter] to [dimensionFilters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDimensionFilter(dimensionFilter: DimensionFilter) = apply {
            dimensionFilters =
                (dimensionFilters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dimensionFilters", it).add(dimensionFilter)
                }
        }

        /** List of groups to apply */
        fun groups(groups: List<Group>) = groups(JsonField.of(groups))

        /**
         * Sets [Builder.groups] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groups] with a well-typed `List<Group>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun groups(groups: JsonField<List<Group>>) = apply {
            this.groups = groups.map { it.toMutableList() }
        }

        /**
         * Adds a single [Group] to [groups].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addGroup(group: Group) = apply {
            groups =
                (groups ?: JsonField.of(mutableListOf())).also {
                    checkKnown("groups", it).add(group)
                }
        }

        /**
         * Alias for calling [addGroup] with
         * `Group.ofDataExportsDataExplorerAccount(dataExportsDataExplorerAccount)`.
         */
        fun addGroup(dataExportsDataExplorerAccount: Group.DataExportsDataExplorerAccountGroup) =
            addGroup(Group.ofDataExportsDataExplorerAccount(dataExportsDataExplorerAccount))

        /**
         * Alias for calling [addGroup] with
         * `Group.ofDataExportsDataExplorerDimension(dataExportsDataExplorerDimension)`.
         */
        fun addGroup(
            dataExportsDataExplorerDimension: Group.DataExportsDataExplorerDimensionGroup
        ) = addGroup(Group.ofDataExportsDataExplorerDimension(dataExportsDataExplorerDimension))

        /**
         * Alias for calling [addGroup] with
         * `Group.ofDataExportsDataExplorerTime(dataExportsDataExplorerTime)`.
         */
        fun addGroup(dataExportsDataExplorerTime: Group.DataExportsDataExplorerTimeGroup) =
            addGroup(Group.ofDataExportsDataExplorerTime(dataExportsDataExplorerTime))

        /** List of meter IDs for which the usage data will be exported. */
        fun meterIds(meterIds: List<String>) = meterIds(JsonField.of(meterIds))

        /**
         * Sets [Builder.meterIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meterIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun meterIds(meterIds: JsonField<List<String>>) = apply {
            this.meterIds = meterIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [meterIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMeterId(meterId: String) = apply {
            meterIds =
                (meterIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("meterIds", it).add(meterId)
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
         * Sets [Builder.timePeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timePeriod] with a well-typed [TimePeriod] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        /**
         * Returns an immutable instance of [UsageDataExportScheduleResponse].
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
        fun build(): UsageDataExportScheduleResponse =
            UsageDataExportScheduleResponse(
                checkRequired("id", id),
                checkRequired("version", version),
                (accountIds ?: JsonMissing.of()).map { it.toImmutable() },
                (aggregations ?: JsonMissing.of()).map { it.toImmutable() },
                (dimensionFilters ?: JsonMissing.of()).map { it.toImmutable() },
                (groups ?: JsonMissing.of()).map { it.toImmutable() },
                (meterIds ?: JsonMissing.of()).map { it.toImmutable() },
                timePeriod,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UsageDataExportScheduleResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        accountIds()
        aggregations().ifPresent { it.forEach { it.validate() } }
        dimensionFilters().ifPresent { it.forEach { it.validate() } }
        groups().ifPresent { it.forEach { it.validate() } }
        meterIds()
        timePeriod().ifPresent { it.validate() }
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
            (if (version.asKnown().isPresent) 1 else 0) +
            (accountIds.asKnown().getOrNull()?.size ?: 0) +
            (aggregations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (dimensionFilters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (groups.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (meterIds.asKnown().getOrNull()?.size ?: 0) +
            (timePeriod.asKnown().getOrNull()?.validity() ?: 0)

    class Aggregation
    private constructor(
        private val fieldCode: JsonField<String>,
        private val fieldType: JsonField<FieldType>,
        private val function: JsonField<Function>,
        private val meterId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("fieldCode")
            @ExcludeMissing
            fieldCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fieldType")
            @ExcludeMissing
            fieldType: JsonField<FieldType> = JsonMissing.of(),
            @JsonProperty("function")
            @ExcludeMissing
            function: JsonField<Function> = JsonMissing.of(),
            @JsonProperty("meterId") @ExcludeMissing meterId: JsonField<String> = JsonMissing.of(),
        ) : this(fieldCode, fieldType, function, meterId, mutableMapOf())

        /**
         * Field code
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fieldCode(): String = fieldCode.getRequired("fieldCode")

        /**
         * Type of field
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fieldType(): FieldType = fieldType.getRequired("fieldType")

        /**
         * Aggregation function
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun function(): Function = function.getRequired("function")

        /**
         * Meter ID
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun meterId(): String = meterId.getRequired("meterId")

        /**
         * Returns the raw JSON value of [fieldCode].
         *
         * Unlike [fieldCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fieldCode") @ExcludeMissing fun _fieldCode(): JsonField<String> = fieldCode

        /**
         * Returns the raw JSON value of [fieldType].
         *
         * Unlike [fieldType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fieldType")
        @ExcludeMissing
        fun _fieldType(): JsonField<FieldType> = fieldType

        /**
         * Returns the raw JSON value of [function].
         *
         * Unlike [function], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("function") @ExcludeMissing fun _function(): JsonField<Function> = function

        /**
         * Returns the raw JSON value of [meterId].
         *
         * Unlike [meterId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meterId") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

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
             * Returns a mutable builder for constructing an instance of [Aggregation].
             *
             * The following fields are required:
             * ```java
             * .fieldCode()
             * .fieldType()
             * .function()
             * .meterId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Aggregation]. */
        class Builder internal constructor() {

            private var fieldCode: JsonField<String>? = null
            private var fieldType: JsonField<FieldType>? = null
            private var function: JsonField<Function>? = null
            private var meterId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(aggregation: Aggregation) = apply {
                fieldCode = aggregation.fieldCode
                fieldType = aggregation.fieldType
                function = aggregation.function
                meterId = aggregation.meterId
                additionalProperties = aggregation.additionalProperties.toMutableMap()
            }

            /** Field code */
            fun fieldCode(fieldCode: String) = fieldCode(JsonField.of(fieldCode))

            /**
             * Sets [Builder.fieldCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fieldCode(fieldCode: JsonField<String>) = apply { this.fieldCode = fieldCode }

            /** Type of field */
            fun fieldType(fieldType: FieldType) = fieldType(JsonField.of(fieldType))

            /**
             * Sets [Builder.fieldType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldType] with a well-typed [FieldType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fieldType(fieldType: JsonField<FieldType>) = apply { this.fieldType = fieldType }

            /** Aggregation function */
            fun function(function: Function) = function(JsonField.of(function))

            /**
             * Sets [Builder.function] to an arbitrary JSON value.
             *
             * You should usually call [Builder.function] with a well-typed [Function] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun function(function: JsonField<Function>) = apply { this.function = function }

            /** Meter ID */
            fun meterId(meterId: String) = meterId(JsonField.of(meterId))

            /**
             * Sets [Builder.meterId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meterId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

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
             * Returns an immutable instance of [Aggregation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .fieldCode()
             * .fieldType()
             * .function()
             * .meterId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Aggregation =
                Aggregation(
                    checkRequired("fieldCode", fieldCode),
                    checkRequired("fieldType", fieldType),
                    checkRequired("function", function),
                    checkRequired("meterId", meterId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Aggregation = apply {
            if (validated) {
                return@apply
            }

            fieldCode()
            fieldType().validate()
            function().validate()
            meterId()
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
            (if (fieldCode.asKnown().isPresent) 1 else 0) +
                (fieldType.asKnown().getOrNull()?.validity() ?: 0) +
                (function.asKnown().getOrNull()?.validity() ?: 0) +
                (if (meterId.asKnown().isPresent) 1 else 0)

        /** Type of field */
        class FieldType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val DIMENSION = of("DIMENSION")

                @JvmField val MEASURE = of("MEASURE")

                @JvmStatic fun of(value: String) = FieldType(JsonField.of(value))
            }

            /** An enum containing [FieldType]'s known values. */
            enum class Known {
                DIMENSION,
                MEASURE,
            }

            /**
             * An enum containing [FieldType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [FieldType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DIMENSION,
                MEASURE,
                /**
                 * An enum member indicating that [FieldType] was instantiated with an unknown
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
                    DIMENSION -> Value.DIMENSION
                    MEASURE -> Value.MEASURE
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
                    DIMENSION -> Known.DIMENSION
                    MEASURE -> Known.MEASURE
                    else -> throw M3terInvalidDataException("Unknown FieldType: $value")
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

            fun validate(): FieldType = apply {
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

                return /* spotless:off */ other is FieldType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Aggregation function */
        class Function @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                @JvmField val SUM = of("SUM")

                @JvmField val MIN = of("MIN")

                @JvmField val MAX = of("MAX")

                @JvmField val COUNT = of("COUNT")

                @JvmField val LATEST = of("LATEST")

                @JvmField val MEAN = of("MEAN")

                @JvmField val UNIQUE = of("UNIQUE")

                @JvmStatic fun of(value: String) = Function(JsonField.of(value))
            }

            /** An enum containing [Function]'s known values. */
            enum class Known {
                SUM,
                MIN,
                MAX,
                COUNT,
                LATEST,
                MEAN,
                UNIQUE,
            }

            /**
             * An enum containing [Function]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Function] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SUM,
                MIN,
                MAX,
                COUNT,
                LATEST,
                MEAN,
                UNIQUE,
                /**
                 * An enum member indicating that [Function] was instantiated with an unknown value.
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
                    SUM -> Value.SUM
                    MIN -> Value.MIN
                    MAX -> Value.MAX
                    COUNT -> Value.COUNT
                    LATEST -> Value.LATEST
                    MEAN -> Value.MEAN
                    UNIQUE -> Value.UNIQUE
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
                    SUM -> Known.SUM
                    MIN -> Known.MIN
                    MAX -> Known.MAX
                    COUNT -> Known.COUNT
                    LATEST -> Known.LATEST
                    MEAN -> Known.MEAN
                    UNIQUE -> Known.UNIQUE
                    else -> throw M3terInvalidDataException("Unknown Function: $value")
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

            fun validate(): Function = apply {
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

                return /* spotless:off */ other is Function && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Aggregation && fieldCode == other.fieldCode && fieldType == other.fieldType && function == other.function && meterId == other.meterId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(fieldCode, fieldType, function, meterId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Aggregation{fieldCode=$fieldCode, fieldType=$fieldType, function=$function, meterId=$meterId, additionalProperties=$additionalProperties}"
    }

    class DimensionFilter
    private constructor(
        private val fieldCode: JsonField<String>,
        private val meterId: JsonField<String>,
        private val values: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("fieldCode")
            @ExcludeMissing
            fieldCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("meterId") @ExcludeMissing meterId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("values")
            @ExcludeMissing
            values: JsonField<List<String>> = JsonMissing.of(),
        ) : this(fieldCode, meterId, values, mutableMapOf())

        /**
         * Field code
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fieldCode(): String = fieldCode.getRequired("fieldCode")

        /**
         * Meter ID
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun meterId(): String = meterId.getRequired("meterId")

        /**
         * Values to filter by
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun values(): List<String> = values.getRequired("values")

        /**
         * Returns the raw JSON value of [fieldCode].
         *
         * Unlike [fieldCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fieldCode") @ExcludeMissing fun _fieldCode(): JsonField<String> = fieldCode

        /**
         * Returns the raw JSON value of [meterId].
         *
         * Unlike [meterId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meterId") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

        /**
         * Returns the raw JSON value of [values].
         *
         * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<String>> = values

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
             * Returns a mutable builder for constructing an instance of [DimensionFilter].
             *
             * The following fields are required:
             * ```java
             * .fieldCode()
             * .meterId()
             * .values()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DimensionFilter]. */
        class Builder internal constructor() {

            private var fieldCode: JsonField<String>? = null
            private var meterId: JsonField<String>? = null
            private var values: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dimensionFilter: DimensionFilter) = apply {
                fieldCode = dimensionFilter.fieldCode
                meterId = dimensionFilter.meterId
                values = dimensionFilter.values.map { it.toMutableList() }
                additionalProperties = dimensionFilter.additionalProperties.toMutableMap()
            }

            /** Field code */
            fun fieldCode(fieldCode: String) = fieldCode(JsonField.of(fieldCode))

            /**
             * Sets [Builder.fieldCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fieldCode(fieldCode: JsonField<String>) = apply { this.fieldCode = fieldCode }

            /** Meter ID */
            fun meterId(meterId: String) = meterId(JsonField.of(meterId))

            /**
             * Sets [Builder.meterId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meterId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

            /** Values to filter by */
            fun values(values: List<String>) = values(JsonField.of(values))

            /**
             * Sets [Builder.values] to an arbitrary JSON value.
             *
             * You should usually call [Builder.values] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun values(values: JsonField<List<String>>) = apply {
                this.values = values.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [values].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addValue(value: String) = apply {
                values =
                    (values ?: JsonField.of(mutableListOf())).also {
                        checkKnown("values", it).add(value)
                    }
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
             * Returns an immutable instance of [DimensionFilter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .fieldCode()
             * .meterId()
             * .values()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DimensionFilter =
                DimensionFilter(
                    checkRequired("fieldCode", fieldCode),
                    checkRequired("meterId", meterId),
                    checkRequired("values", values).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DimensionFilter = apply {
            if (validated) {
                return@apply
            }

            fieldCode()
            meterId()
            values()
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
            (if (fieldCode.asKnown().isPresent) 1 else 0) +
                (if (meterId.asKnown().isPresent) 1 else 0) +
                (values.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DimensionFilter && fieldCode == other.fieldCode && meterId == other.meterId && values == other.values && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(fieldCode, meterId, values, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DimensionFilter{fieldCode=$fieldCode, meterId=$meterId, values=$values, additionalProperties=$additionalProperties}"
    }

    /** Group by a field */
    @JsonDeserialize(using = Group.Deserializer::class)
    @JsonSerialize(using = Group.Serializer::class)
    class Group
    private constructor(
        private val dataExportsDataExplorerAccount: DataExportsDataExplorerAccountGroup? = null,
        private val dataExportsDataExplorerDimension: DataExportsDataExplorerDimensionGroup? = null,
        private val dataExportsDataExplorerTime: DataExportsDataExplorerTimeGroup? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Group by account */
        fun dataExportsDataExplorerAccount(): Optional<DataExportsDataExplorerAccountGroup> =
            Optional.ofNullable(dataExportsDataExplorerAccount)

        /** Group by dimension */
        fun dataExportsDataExplorerDimension(): Optional<DataExportsDataExplorerDimensionGroup> =
            Optional.ofNullable(dataExportsDataExplorerDimension)

        /** Group by time */
        fun dataExportsDataExplorerTime(): Optional<DataExportsDataExplorerTimeGroup> =
            Optional.ofNullable(dataExportsDataExplorerTime)

        fun isDataExportsDataExplorerAccount(): Boolean = dataExportsDataExplorerAccount != null

        fun isDataExportsDataExplorerDimension(): Boolean = dataExportsDataExplorerDimension != null

        fun isDataExportsDataExplorerTime(): Boolean = dataExportsDataExplorerTime != null

        /** Group by account */
        fun asDataExportsDataExplorerAccount(): DataExportsDataExplorerAccountGroup =
            dataExportsDataExplorerAccount.getOrThrow("dataExportsDataExplorerAccount")

        /** Group by dimension */
        fun asDataExportsDataExplorerDimension(): DataExportsDataExplorerDimensionGroup =
            dataExportsDataExplorerDimension.getOrThrow("dataExportsDataExplorerDimension")

        /** Group by time */
        fun asDataExportsDataExplorerTime(): DataExportsDataExplorerTimeGroup =
            dataExportsDataExplorerTime.getOrThrow("dataExportsDataExplorerTime")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                dataExportsDataExplorerAccount != null ->
                    visitor.visitDataExportsDataExplorerAccount(dataExportsDataExplorerAccount)
                dataExportsDataExplorerDimension != null ->
                    visitor.visitDataExportsDataExplorerDimension(dataExportsDataExplorerDimension)
                dataExportsDataExplorerTime != null ->
                    visitor.visitDataExportsDataExplorerTime(dataExportsDataExplorerTime)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Group = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitDataExportsDataExplorerAccount(
                        dataExportsDataExplorerAccount: DataExportsDataExplorerAccountGroup
                    ) {
                        dataExportsDataExplorerAccount.validate()
                    }

                    override fun visitDataExportsDataExplorerDimension(
                        dataExportsDataExplorerDimension: DataExportsDataExplorerDimensionGroup
                    ) {
                        dataExportsDataExplorerDimension.validate()
                    }

                    override fun visitDataExportsDataExplorerTime(
                        dataExportsDataExplorerTime: DataExportsDataExplorerTimeGroup
                    ) {
                        dataExportsDataExplorerTime.validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitDataExportsDataExplorerAccount(
                        dataExportsDataExplorerAccount: DataExportsDataExplorerAccountGroup
                    ) = dataExportsDataExplorerAccount.validity()

                    override fun visitDataExportsDataExplorerDimension(
                        dataExportsDataExplorerDimension: DataExportsDataExplorerDimensionGroup
                    ) = dataExportsDataExplorerDimension.validity()

                    override fun visitDataExportsDataExplorerTime(
                        dataExportsDataExplorerTime: DataExportsDataExplorerTimeGroup
                    ) = dataExportsDataExplorerTime.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Group && dataExportsDataExplorerAccount == other.dataExportsDataExplorerAccount && dataExportsDataExplorerDimension == other.dataExportsDataExplorerDimension && dataExportsDataExplorerTime == other.dataExportsDataExplorerTime /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(dataExportsDataExplorerAccount, dataExportsDataExplorerDimension, dataExportsDataExplorerTime) /* spotless:on */

        override fun toString(): String =
            when {
                dataExportsDataExplorerAccount != null ->
                    "Group{dataExportsDataExplorerAccount=$dataExportsDataExplorerAccount}"
                dataExportsDataExplorerDimension != null ->
                    "Group{dataExportsDataExplorerDimension=$dataExportsDataExplorerDimension}"
                dataExportsDataExplorerTime != null ->
                    "Group{dataExportsDataExplorerTime=$dataExportsDataExplorerTime}"
                _json != null -> "Group{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Group")
            }

        companion object {

            /** Group by account */
            @JvmStatic
            fun ofDataExportsDataExplorerAccount(
                dataExportsDataExplorerAccount: DataExportsDataExplorerAccountGroup
            ) = Group(dataExportsDataExplorerAccount = dataExportsDataExplorerAccount)

            /** Group by dimension */
            @JvmStatic
            fun ofDataExportsDataExplorerDimension(
                dataExportsDataExplorerDimension: DataExportsDataExplorerDimensionGroup
            ) = Group(dataExportsDataExplorerDimension = dataExportsDataExplorerDimension)

            /** Group by time */
            @JvmStatic
            fun ofDataExportsDataExplorerTime(
                dataExportsDataExplorerTime: DataExportsDataExplorerTimeGroup
            ) = Group(dataExportsDataExplorerTime = dataExportsDataExplorerTime)
        }

        /** An interface that defines how to map each variant of [Group] to a value of type [T]. */
        interface Visitor<out T> {

            /** Group by account */
            fun visitDataExportsDataExplorerAccount(
                dataExportsDataExplorerAccount: DataExportsDataExplorerAccountGroup
            ): T

            /** Group by dimension */
            fun visitDataExportsDataExplorerDimension(
                dataExportsDataExplorerDimension: DataExportsDataExplorerDimensionGroup
            ): T

            /** Group by time */
            fun visitDataExportsDataExplorerTime(
                dataExportsDataExplorerTime: DataExportsDataExplorerTimeGroup
            ): T

            /**
             * Maps an unknown variant of [Group] to a value of type [T].
             *
             * An instance of [Group] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws M3terInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw M3terInvalidDataException("Unknown Group: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Group>(Group::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Group {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<DataExportsDataExplorerAccountGroup>(),
                                )
                                ?.let { Group(dataExportsDataExplorerAccount = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<DataExportsDataExplorerDimensionGroup>(),
                                )
                                ?.let {
                                    Group(dataExportsDataExplorerDimension = it, _json = json)
                                },
                            tryDeserialize(node, jacksonTypeRef<DataExportsDataExplorerTimeGroup>())
                                ?.let { Group(dataExportsDataExplorerTime = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Group(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Group>(Group::class) {

            override fun serialize(
                value: Group,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.dataExportsDataExplorerAccount != null ->
                        generator.writeObject(value.dataExportsDataExplorerAccount)
                    value.dataExportsDataExplorerDimension != null ->
                        generator.writeObject(value.dataExportsDataExplorerDimension)
                    value.dataExportsDataExplorerTime != null ->
                        generator.writeObject(value.dataExportsDataExplorerTime)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Group")
                }
            }
        }

        /** Group by account */
        class DataExportsDataExplorerAccountGroup
        private constructor(
            private val groupType: JsonField<DataExplorerAccountGroup.GroupType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("groupType")
                @ExcludeMissing
                groupType: JsonField<DataExplorerAccountGroup.GroupType> = JsonMissing.of()
            ) : this(groupType, mutableMapOf())

            fun toDataExplorerAccountGroup(): DataExplorerAccountGroup =
                DataExplorerAccountGroup.builder().groupType(groupType).build()

            /**
             * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun groupType(): Optional<DataExplorerAccountGroup.GroupType> =
                groupType.getOptional("groupType")

            /**
             * Returns the raw JSON value of [groupType].
             *
             * Unlike [groupType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("groupType")
            @ExcludeMissing
            fun _groupType(): JsonField<DataExplorerAccountGroup.GroupType> = groupType

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
                 * [DataExportsDataExplorerAccountGroup].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DataExportsDataExplorerAccountGroup]. */
            class Builder internal constructor() {

                private var groupType: JsonField<DataExplorerAccountGroup.GroupType> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    dataExportsDataExplorerAccountGroup: DataExportsDataExplorerAccountGroup
                ) = apply {
                    groupType = dataExportsDataExplorerAccountGroup.groupType
                    additionalProperties =
                        dataExportsDataExplorerAccountGroup.additionalProperties.toMutableMap()
                }

                fun groupType(groupType: DataExplorerAccountGroup.GroupType) =
                    groupType(JsonField.of(groupType))

                /**
                 * Sets [Builder.groupType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groupType] with a well-typed
                 * [DataExplorerAccountGroup.GroupType] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun groupType(groupType: JsonField<DataExplorerAccountGroup.GroupType>) = apply {
                    this.groupType = groupType
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DataExportsDataExplorerAccountGroup].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DataExportsDataExplorerAccountGroup =
                    DataExportsDataExplorerAccountGroup(
                        groupType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DataExportsDataExplorerAccountGroup = apply {
                if (validated) {
                    return@apply
                }

                groupType().ifPresent { it.validate() }
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
            internal fun validity(): Int = (groupType.asKnown().getOrNull()?.validity() ?: 0)

            class GroupType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ACCOUNT = of("ACCOUNT")

                    @JvmField val DIMENSION = of("DIMENSION")

                    @JvmField val TIME = of("TIME")

                    @JvmStatic fun of(value: String) = GroupType(JsonField.of(value))
                }

                /** An enum containing [GroupType]'s known values. */
                enum class Known {
                    ACCOUNT,
                    DIMENSION,
                    TIME,
                }

                /**
                 * An enum containing [GroupType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [GroupType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACCOUNT,
                    DIMENSION,
                    TIME,
                    /**
                     * An enum member indicating that [GroupType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACCOUNT -> Value.ACCOUNT
                        DIMENSION -> Value.DIMENSION
                        TIME -> Value.TIME
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
                        ACCOUNT -> Known.ACCOUNT
                        DIMENSION -> Known.DIMENSION
                        TIME -> Known.TIME
                        else -> throw M3terInvalidDataException("Unknown GroupType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws M3terInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        M3terInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): GroupType = apply {
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

                    return /* spotless:off */ other is GroupType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DataExportsDataExplorerAccountGroup && groupType == other.groupType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(groupType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DataExportsDataExplorerAccountGroup{groupType=$groupType, additionalProperties=$additionalProperties}"
        }

        /** Group by dimension */
        class DataExportsDataExplorerDimensionGroup
        private constructor(
            private val fieldCode: JsonField<String>,
            private val meterId: JsonField<String>,
            private val groupType: JsonField<DataExplorerDimensionGroup.GroupType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("fieldCode")
                @ExcludeMissing
                fieldCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("meterId")
                @ExcludeMissing
                meterId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("groupType")
                @ExcludeMissing
                groupType: JsonField<DataExplorerDimensionGroup.GroupType> = JsonMissing.of(),
            ) : this(fieldCode, meterId, groupType, mutableMapOf())

            fun toDataExplorerDimensionGroup(): DataExplorerDimensionGroup =
                DataExplorerDimensionGroup.builder()
                    .fieldCode(fieldCode)
                    .meterId(meterId)
                    .groupType(groupType)
                    .build()

            /**
             * Field code to group by
             *
             * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun fieldCode(): String = fieldCode.getRequired("fieldCode")

            /**
             * Meter ID to group by
             *
             * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun meterId(): String = meterId.getRequired("meterId")

            /**
             * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun groupType(): Optional<DataExplorerDimensionGroup.GroupType> =
                groupType.getOptional("groupType")

            /**
             * Returns the raw JSON value of [fieldCode].
             *
             * Unlike [fieldCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fieldCode")
            @ExcludeMissing
            fun _fieldCode(): JsonField<String> = fieldCode

            /**
             * Returns the raw JSON value of [meterId].
             *
             * Unlike [meterId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("meterId") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

            /**
             * Returns the raw JSON value of [groupType].
             *
             * Unlike [groupType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("groupType")
            @ExcludeMissing
            fun _groupType(): JsonField<DataExplorerDimensionGroup.GroupType> = groupType

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
                 * [DataExportsDataExplorerDimensionGroup].
                 *
                 * The following fields are required:
                 * ```java
                 * .fieldCode()
                 * .meterId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DataExportsDataExplorerDimensionGroup]. */
            class Builder internal constructor() {

                private var fieldCode: JsonField<String>? = null
                private var meterId: JsonField<String>? = null
                private var groupType: JsonField<DataExplorerDimensionGroup.GroupType> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    dataExportsDataExplorerDimensionGroup: DataExportsDataExplorerDimensionGroup
                ) = apply {
                    fieldCode = dataExportsDataExplorerDimensionGroup.fieldCode
                    meterId = dataExportsDataExplorerDimensionGroup.meterId
                    groupType = dataExportsDataExplorerDimensionGroup.groupType
                    additionalProperties =
                        dataExportsDataExplorerDimensionGroup.additionalProperties.toMutableMap()
                }

                /** Field code to group by */
                fun fieldCode(fieldCode: String) = fieldCode(JsonField.of(fieldCode))

                /**
                 * Sets [Builder.fieldCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fieldCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fieldCode(fieldCode: JsonField<String>) = apply { this.fieldCode = fieldCode }

                /** Meter ID to group by */
                fun meterId(meterId: String) = meterId(JsonField.of(meterId))

                /**
                 * Sets [Builder.meterId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.meterId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

                fun groupType(groupType: DataExplorerDimensionGroup.GroupType) =
                    groupType(JsonField.of(groupType))

                /**
                 * Sets [Builder.groupType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groupType] with a well-typed
                 * [DataExplorerDimensionGroup.GroupType] value instead. This method is primarily
                 * for setting the field to an undocumented or not yet supported value.
                 */
                fun groupType(groupType: JsonField<DataExplorerDimensionGroup.GroupType>) = apply {
                    this.groupType = groupType
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DataExportsDataExplorerDimensionGroup].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .fieldCode()
                 * .meterId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DataExportsDataExplorerDimensionGroup =
                    DataExportsDataExplorerDimensionGroup(
                        checkRequired("fieldCode", fieldCode),
                        checkRequired("meterId", meterId),
                        groupType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DataExportsDataExplorerDimensionGroup = apply {
                if (validated) {
                    return@apply
                }

                fieldCode()
                meterId()
                groupType().ifPresent { it.validate() }
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
                (if (fieldCode.asKnown().isPresent) 1 else 0) +
                    (if (meterId.asKnown().isPresent) 1 else 0) +
                    (groupType.asKnown().getOrNull()?.validity() ?: 0)

            class GroupType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ACCOUNT = of("ACCOUNT")

                    @JvmField val DIMENSION = of("DIMENSION")

                    @JvmField val TIME = of("TIME")

                    @JvmStatic fun of(value: String) = GroupType(JsonField.of(value))
                }

                /** An enum containing [GroupType]'s known values. */
                enum class Known {
                    ACCOUNT,
                    DIMENSION,
                    TIME,
                }

                /**
                 * An enum containing [GroupType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [GroupType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACCOUNT,
                    DIMENSION,
                    TIME,
                    /**
                     * An enum member indicating that [GroupType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACCOUNT -> Value.ACCOUNT
                        DIMENSION -> Value.DIMENSION
                        TIME -> Value.TIME
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
                        ACCOUNT -> Known.ACCOUNT
                        DIMENSION -> Known.DIMENSION
                        TIME -> Known.TIME
                        else -> throw M3terInvalidDataException("Unknown GroupType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws M3terInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        M3terInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): GroupType = apply {
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

                    return /* spotless:off */ other is GroupType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DataExportsDataExplorerDimensionGroup && fieldCode == other.fieldCode && meterId == other.meterId && groupType == other.groupType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(fieldCode, meterId, groupType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DataExportsDataExplorerDimensionGroup{fieldCode=$fieldCode, meterId=$meterId, groupType=$groupType, additionalProperties=$additionalProperties}"
        }

        /** Group by time */
        class DataExportsDataExplorerTimeGroup
        private constructor(
            private val frequency: JsonField<DataExplorerTimeGroup.Frequency>,
            private val groupType: JsonField<DataExplorerTimeGroup.GroupType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("frequency")
                @ExcludeMissing
                frequency: JsonField<DataExplorerTimeGroup.Frequency> = JsonMissing.of(),
                @JsonProperty("groupType")
                @ExcludeMissing
                groupType: JsonField<DataExplorerTimeGroup.GroupType> = JsonMissing.of(),
            ) : this(frequency, groupType, mutableMapOf())

            fun toDataExplorerTimeGroup(): DataExplorerTimeGroup =
                DataExplorerTimeGroup.builder().frequency(frequency).groupType(groupType).build()

            /**
             * Frequency of usage data
             *
             * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun frequency(): DataExplorerTimeGroup.Frequency = frequency.getRequired("frequency")

            /**
             * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun groupType(): Optional<DataExplorerTimeGroup.GroupType> =
                groupType.getOptional("groupType")

            /**
             * Returns the raw JSON value of [frequency].
             *
             * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("frequency")
            @ExcludeMissing
            fun _frequency(): JsonField<DataExplorerTimeGroup.Frequency> = frequency

            /**
             * Returns the raw JSON value of [groupType].
             *
             * Unlike [groupType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("groupType")
            @ExcludeMissing
            fun _groupType(): JsonField<DataExplorerTimeGroup.GroupType> = groupType

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
                 * [DataExportsDataExplorerTimeGroup].
                 *
                 * The following fields are required:
                 * ```java
                 * .frequency()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DataExportsDataExplorerTimeGroup]. */
            class Builder internal constructor() {

                private var frequency: JsonField<DataExplorerTimeGroup.Frequency>? = null
                private var groupType: JsonField<DataExplorerTimeGroup.GroupType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    dataExportsDataExplorerTimeGroup: DataExportsDataExplorerTimeGroup
                ) = apply {
                    frequency = dataExportsDataExplorerTimeGroup.frequency
                    groupType = dataExportsDataExplorerTimeGroup.groupType
                    additionalProperties =
                        dataExportsDataExplorerTimeGroup.additionalProperties.toMutableMap()
                }

                /** Frequency of usage data */
                fun frequency(frequency: DataExplorerTimeGroup.Frequency) =
                    frequency(JsonField.of(frequency))

                /**
                 * Sets [Builder.frequency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.frequency] with a well-typed
                 * [DataExplorerTimeGroup.Frequency] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun frequency(frequency: JsonField<DataExplorerTimeGroup.Frequency>) = apply {
                    this.frequency = frequency
                }

                fun groupType(groupType: DataExplorerTimeGroup.GroupType) =
                    groupType(JsonField.of(groupType))

                /**
                 * Sets [Builder.groupType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groupType] with a well-typed
                 * [DataExplorerTimeGroup.GroupType] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun groupType(groupType: JsonField<DataExplorerTimeGroup.GroupType>) = apply {
                    this.groupType = groupType
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DataExportsDataExplorerTimeGroup].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .frequency()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): DataExportsDataExplorerTimeGroup =
                    DataExportsDataExplorerTimeGroup(
                        checkRequired("frequency", frequency),
                        groupType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): DataExportsDataExplorerTimeGroup = apply {
                if (validated) {
                    return@apply
                }

                frequency().validate()
                groupType().ifPresent { it.validate() }
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
                (frequency.asKnown().getOrNull()?.validity() ?: 0) +
                    (groupType.asKnown().getOrNull()?.validity() ?: 0)

            class GroupType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ACCOUNT = of("ACCOUNT")

                    @JvmField val DIMENSION = of("DIMENSION")

                    @JvmField val TIME = of("TIME")

                    @JvmStatic fun of(value: String) = GroupType(JsonField.of(value))
                }

                /** An enum containing [GroupType]'s known values. */
                enum class Known {
                    ACCOUNT,
                    DIMENSION,
                    TIME,
                }

                /**
                 * An enum containing [GroupType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [GroupType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACCOUNT,
                    DIMENSION,
                    TIME,
                    /**
                     * An enum member indicating that [GroupType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACCOUNT -> Value.ACCOUNT
                        DIMENSION -> Value.DIMENSION
                        TIME -> Value.TIME
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
                        ACCOUNT -> Known.ACCOUNT
                        DIMENSION -> Known.DIMENSION
                        TIME -> Known.TIME
                        else -> throw M3terInvalidDataException("Unknown GroupType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws M3terInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        M3terInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): GroupType = apply {
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

                    return /* spotless:off */ other is GroupType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DataExportsDataExplorerTimeGroup && frequency == other.frequency && groupType == other.groupType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(frequency, groupType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DataExportsDataExplorerTimeGroup{frequency=$frequency, groupType=$groupType, additionalProperties=$additionalProperties}"
        }
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

            @JvmField val LAST_12_HOURS = of("LAST_12_HOURS")

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
            LAST_12_HOURS,
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
            LAST_12_HOURS,
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
                LAST_12_HOURS -> Value.LAST_12_HOURS
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
                LAST_12_HOURS -> Known.LAST_12_HOURS
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

        private var validated: Boolean = false

        fun validate(): TimePeriod = apply {
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

            return /* spotless:off */ other is TimePeriod && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UsageDataExportScheduleResponse && id == other.id && version == other.version && accountIds == other.accountIds && aggregations == other.aggregations && dimensionFilters == other.dimensionFilters && groups == other.groups && meterIds == other.meterIds && timePeriod == other.timePeriod && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, accountIds, aggregations, dimensionFilters, groups, meterIds, timePeriod, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageDataExportScheduleResponse{id=$id, version=$version, accountIds=$accountIds, aggregations=$aggregations, dimensionFilters=$dimensionFilters, groups=$groups, meterIds=$meterIds, timePeriod=$timePeriod, additionalProperties=$additionalProperties}"
}
