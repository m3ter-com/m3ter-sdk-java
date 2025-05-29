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

class StatementDefinitionResponse
private constructor(
    private val id: JsonField<String>,
    private val version: JsonField<Long>,
    private val aggregationFrequency: JsonField<AggregationFrequency>,
    private val createdBy: JsonField<String>,
    private val dimensions: JsonField<List<Dimension>>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val includePricePerUnit: JsonField<Boolean>,
    private val lastModifiedBy: JsonField<String>,
    private val measures: JsonField<List<Measure>>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("aggregationFrequency")
        @ExcludeMissing
        aggregationFrequency: JsonField<AggregationFrequency> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dimensions")
        @ExcludeMissing
        dimensions: JsonField<List<Dimension>> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("includePricePerUnit")
        @ExcludeMissing
        includePricePerUnit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("measures")
        @ExcludeMissing
        measures: JsonField<List<Measure>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        version,
        aggregationFrequency,
        createdBy,
        dimensions,
        dtCreated,
        dtLastModified,
        includePricePerUnit,
        lastModifiedBy,
        measures,
        name,
        mutableMapOf(),
    )

    /**
     * The UUID of the entity.
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
     * This specifies how often the Statement should aggregate data.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun aggregationFrequency(): Optional<AggregationFrequency> =
        aggregationFrequency.getOptional("aggregationFrequency")

    /**
     * The unique identifier (UUID) of the user who created this StatementDefinition.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * An array of objects, each representing a Dimension data field from a Meter _(for Meters that
     * have Dimensions setup)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dimensions(): Optional<List<Dimension>> = dimensions.getOptional("dimensions")

    /**
     * The date and time _(in ISO-8601 format)_ when the StatementDefinition was created.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The date and time _(in ISO-8601 format)_ when the StatementDefinition was last modified.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * A Boolean indicating whether to include the price per unit in the Statement.
     * - TRUE - includes the price per unit.
     * - FALSE - excludes the price per unit.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includePricePerUnit(): Optional<Boolean> =
        includePricePerUnit.getOptional("includePricePerUnit")

    /**
     * The unique identifier (UUID) of the user who last modified this StatementDefinition.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * An array of objects, each representing a Measure data field from a Meter.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun measures(): Optional<List<Measure>> = measures.getOptional("measures")

    /**
     * Descriptive name for the StatementDefinition providing context and information.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

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
     * Returns the raw JSON value of [aggregationFrequency].
     *
     * Unlike [aggregationFrequency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("aggregationFrequency")
    @ExcludeMissing
    fun _aggregationFrequency(): JsonField<AggregationFrequency> = aggregationFrequency

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [dimensions].
     *
     * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dimensions")
    @ExcludeMissing
    fun _dimensions(): JsonField<List<Dimension>> = dimensions

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
     * Returns the raw JSON value of [includePricePerUnit].
     *
     * Unlike [includePricePerUnit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("includePricePerUnit")
    @ExcludeMissing
    fun _includePricePerUnit(): JsonField<Boolean> = includePricePerUnit

    /**
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Returns the raw JSON value of [measures].
     *
     * Unlike [measures], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("measures") @ExcludeMissing fun _measures(): JsonField<List<Measure>> = measures

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [StatementDefinitionResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StatementDefinitionResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var aggregationFrequency: JsonField<AggregationFrequency> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dimensions: JsonField<MutableList<Dimension>>? = null
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var includePricePerUnit: JsonField<Boolean> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var measures: JsonField<MutableList<Measure>>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(statementDefinitionResponse: StatementDefinitionResponse) = apply {
            id = statementDefinitionResponse.id
            version = statementDefinitionResponse.version
            aggregationFrequency = statementDefinitionResponse.aggregationFrequency
            createdBy = statementDefinitionResponse.createdBy
            dimensions = statementDefinitionResponse.dimensions.map { it.toMutableList() }
            dtCreated = statementDefinitionResponse.dtCreated
            dtLastModified = statementDefinitionResponse.dtLastModified
            includePricePerUnit = statementDefinitionResponse.includePricePerUnit
            lastModifiedBy = statementDefinitionResponse.lastModifiedBy
            measures = statementDefinitionResponse.measures.map { it.toMutableList() }
            name = statementDefinitionResponse.name
            additionalProperties = statementDefinitionResponse.additionalProperties.toMutableMap()
        }

        /** The UUID of the entity. */
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

        /** This specifies how often the Statement should aggregate data. */
        fun aggregationFrequency(aggregationFrequency: AggregationFrequency) =
            aggregationFrequency(JsonField.of(aggregationFrequency))

        /**
         * Sets [Builder.aggregationFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregationFrequency] with a well-typed
         * [AggregationFrequency] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun aggregationFrequency(aggregationFrequency: JsonField<AggregationFrequency>) = apply {
            this.aggregationFrequency = aggregationFrequency
        }

        /** The unique identifier (UUID) of the user who created this StatementDefinition. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /**
         * An array of objects, each representing a Dimension data field from a Meter _(for Meters
         * that have Dimensions setup)_.
         */
        fun dimensions(dimensions: List<Dimension>) = dimensions(JsonField.of(dimensions))

        /**
         * Sets [Builder.dimensions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dimensions] with a well-typed `List<Dimension>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dimensions(dimensions: JsonField<List<Dimension>>) = apply {
            this.dimensions = dimensions.map { it.toMutableList() }
        }

        /**
         * Adds a single [Dimension] to [dimensions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDimension(dimension: Dimension) = apply {
            dimensions =
                (dimensions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dimensions", it).add(dimension)
                }
        }

        /** The date and time _(in ISO-8601 format)_ when the StatementDefinition was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /**
         * The date and time _(in ISO-8601 format)_ when the StatementDefinition was last modified.
         */
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

        /**
         * A Boolean indicating whether to include the price per unit in the Statement.
         * - TRUE - includes the price per unit.
         * - FALSE - excludes the price per unit.
         */
        fun includePricePerUnit(includePricePerUnit: Boolean) =
            includePricePerUnit(JsonField.of(includePricePerUnit))

        /**
         * Sets [Builder.includePricePerUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includePricePerUnit] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includePricePerUnit(includePricePerUnit: JsonField<Boolean>) = apply {
            this.includePricePerUnit = includePricePerUnit
        }

        /** The unique identifier (UUID) of the user who last modified this StatementDefinition. */
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

        /** An array of objects, each representing a Measure data field from a Meter. */
        fun measures(measures: List<Measure>) = measures(JsonField.of(measures))

        /**
         * Sets [Builder.measures] to an arbitrary JSON value.
         *
         * You should usually call [Builder.measures] with a well-typed `List<Measure>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun measures(measures: JsonField<List<Measure>>) = apply {
            this.measures = measures.map { it.toMutableList() }
        }

        /**
         * Adds a single [Measure] to [measures].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMeasure(measure: Measure) = apply {
            measures =
                (measures ?: JsonField.of(mutableListOf())).also {
                    checkKnown("measures", it).add(measure)
                }
        }

        /** Descriptive name for the StatementDefinition providing context and information. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [StatementDefinitionResponse].
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
        fun build(): StatementDefinitionResponse =
            StatementDefinitionResponse(
                checkRequired("id", id),
                checkRequired("version", version),
                aggregationFrequency,
                createdBy,
                (dimensions ?: JsonMissing.of()).map { it.toImmutable() },
                dtCreated,
                dtLastModified,
                includePricePerUnit,
                lastModifiedBy,
                (measures ?: JsonMissing.of()).map { it.toImmutable() },
                name,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StatementDefinitionResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        aggregationFrequency().ifPresent { it.validate() }
        createdBy()
        dimensions().ifPresent { it.forEach { it.validate() } }
        dtCreated()
        dtLastModified()
        includePricePerUnit()
        lastModifiedBy()
        measures().ifPresent { it.forEach { it.validate() } }
        name()
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
            (aggregationFrequency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (dimensions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (includePricePerUnit.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (measures.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0)

    /** This specifies how often the Statement should aggregate data. */
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

            @JvmField val DAY = of("DAY")

            @JvmField val WEEK = of("WEEK")

            @JvmField val MONTH = of("MONTH")

            @JvmField val QUARTER = of("QUARTER")

            @JvmField val YEAR = of("YEAR")

            @JvmField val WHOLE_PERIOD = of("WHOLE_PERIOD")

            @JvmStatic fun of(value: String) = AggregationFrequency(JsonField.of(value))
        }

        /** An enum containing [AggregationFrequency]'s known values. */
        enum class Known {
            DAY,
            WEEK,
            MONTH,
            QUARTER,
            YEAR,
            WHOLE_PERIOD,
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
            DAY,
            WEEK,
            MONTH,
            QUARTER,
            YEAR,
            WHOLE_PERIOD,
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
                DAY -> Value.DAY
                WEEK -> Value.WEEK
                MONTH -> Value.MONTH
                QUARTER -> Value.QUARTER
                YEAR -> Value.YEAR
                WHOLE_PERIOD -> Value.WHOLE_PERIOD
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
                DAY -> Known.DAY
                WEEK -> Known.WEEK
                MONTH -> Known.MONTH
                QUARTER -> Known.QUARTER
                YEAR -> Known.YEAR
                WHOLE_PERIOD -> Known.WHOLE_PERIOD
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

        private var validated: Boolean = false

        fun validate(): AggregationFrequency = apply {
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

            return /* spotless:off */ other is AggregationFrequency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** A Dimension belonging to a Meter. */
    class Dimension
    private constructor(
        private val filter: JsonField<List<String>>,
        private val name: JsonField<String>,
        private val attributes: JsonField<List<String>>,
        private val meterId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("filter")
            @ExcludeMissing
            filter: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("attributes")
            @ExcludeMissing
            attributes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("meterId") @ExcludeMissing meterId: JsonField<String> = JsonMissing.of(),
        ) : this(filter, name, attributes, meterId, mutableMapOf())

        /**
         * The value of a Dimension to use as a filter. Use "\*" as a wildcard to filter on all
         * Dimension values.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun filter(): List<String> = filter.getRequired("filter")

        /**
         * The name of the Dimension to target in the Meter.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The Dimension attribute to target.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun attributes(): Optional<List<String>> = attributes.getOptional("attributes")

        /**
         * The unique identifier (UUID) of the Meter containing this Dimension.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun meterId(): Optional<String> = meterId.getOptional("meterId")

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<List<String>> = filter

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [attributes].
         *
         * Unlike [attributes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attributes")
        @ExcludeMissing
        fun _attributes(): JsonField<List<String>> = attributes

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
             * Returns a mutable builder for constructing an instance of [Dimension].
             *
             * The following fields are required:
             * ```java
             * .filter()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Dimension]. */
        class Builder internal constructor() {

            private var filter: JsonField<MutableList<String>>? = null
            private var name: JsonField<String>? = null
            private var attributes: JsonField<MutableList<String>>? = null
            private var meterId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dimension: Dimension) = apply {
                filter = dimension.filter.map { it.toMutableList() }
                name = dimension.name
                attributes = dimension.attributes.map { it.toMutableList() }
                meterId = dimension.meterId
                additionalProperties = dimension.additionalProperties.toMutableMap()
            }

            /**
             * The value of a Dimension to use as a filter. Use "\*" as a wildcard to filter on all
             * Dimension values.
             */
            fun filter(filter: List<String>) = filter(JsonField.of(filter))

            /**
             * Sets [Builder.filter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filter] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filter(filter: JsonField<List<String>>) = apply {
                this.filter = filter.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.filter].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFilter(filter: String) = apply {
                this.filter =
                    (this.filter ?: JsonField.of(mutableListOf())).also {
                        checkKnown("filter", it).add(filter)
                    }
            }

            /** The name of the Dimension to target in the Meter. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The Dimension attribute to target. */
            fun attributes(attributes: List<String>) = attributes(JsonField.of(attributes))

            /**
             * Sets [Builder.attributes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attributes] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attributes(attributes: JsonField<List<String>>) = apply {
                this.attributes = attributes.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [attributes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAttribute(attribute: String) = apply {
                attributes =
                    (attributes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("attributes", it).add(attribute)
                    }
            }

            /** The unique identifier (UUID) of the Meter containing this Dimension. */
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
             * Returns an immutable instance of [Dimension].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .filter()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Dimension =
                Dimension(
                    checkRequired("filter", filter).map { it.toImmutable() },
                    checkRequired("name", name),
                    (attributes ?: JsonMissing.of()).map { it.toImmutable() },
                    meterId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Dimension = apply {
            if (validated) {
                return@apply
            }

            filter()
            name()
            attributes()
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
            (filter.asKnown().getOrNull()?.size ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (attributes.asKnown().getOrNull()?.size ?: 0) +
                (if (meterId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Dimension && filter == other.filter && name == other.name && attributes == other.attributes && meterId == other.meterId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(filter, name, attributes, meterId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Dimension{filter=$filter, name=$name, attributes=$attributes, meterId=$meterId, additionalProperties=$additionalProperties}"
    }

    class Measure
    private constructor(
        private val aggregations: JsonField<List<Aggregation>>,
        private val meterId: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("aggregations")
            @ExcludeMissing
            aggregations: JsonField<List<Aggregation>> = JsonMissing.of(),
            @JsonProperty("meterId") @ExcludeMissing meterId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        ) : this(aggregations, meterId, name, mutableMapOf())

        /**
         * A list of Aggregations to apply to the Measure.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun aggregations(): Optional<List<Aggregation>> = aggregations.getOptional("aggregations")

        /**
         * The unique identifier (UUID) of the Meter containing this Measure.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun meterId(): Optional<String> = meterId.getOptional("meterId")

        /**
         * The name of a Measure data field _(or blank to indicate a wildcard, i.e. all fields)_.
         * Default value is blank.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * Returns the raw JSON value of [aggregations].
         *
         * Unlike [aggregations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aggregations")
        @ExcludeMissing
        fun _aggregations(): JsonField<List<Aggregation>> = aggregations

        /**
         * Returns the raw JSON value of [meterId].
         *
         * Unlike [meterId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meterId") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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

            /** Returns a mutable builder for constructing an instance of [Measure]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Measure]. */
        class Builder internal constructor() {

            private var aggregations: JsonField<MutableList<Aggregation>>? = null
            private var meterId: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(measure: Measure) = apply {
                aggregations = measure.aggregations.map { it.toMutableList() }
                meterId = measure.meterId
                name = measure.name
                additionalProperties = measure.additionalProperties.toMutableMap()
            }

            /** A list of Aggregations to apply to the Measure. */
            fun aggregations(aggregations: List<Aggregation>) =
                aggregations(JsonField.of(aggregations))

            /**
             * Sets [Builder.aggregations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aggregations] with a well-typed `List<Aggregation>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /** The unique identifier (UUID) of the Meter containing this Measure. */
            fun meterId(meterId: String) = meterId(JsonField.of(meterId))

            /**
             * Sets [Builder.meterId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meterId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

            /**
             * The name of a Measure data field _(or blank to indicate a wildcard, i.e. all
             * fields)_. Default value is blank.
             */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Measure].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Measure =
                Measure(
                    (aggregations ?: JsonMissing.of()).map { it.toImmutable() },
                    meterId,
                    name,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Measure = apply {
            if (validated) {
                return@apply
            }

            aggregations().ifPresent { it.forEach { it.validate() } }
            meterId()
            name()
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
            (aggregations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (meterId.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0)

        /**
         * Specifies the computation method applied to usage data collected in `targetField`.
         * Aggregation unit value depends on the **Category** configured for the selected
         * targetField.
         * - **SUM**. Adds the values. Can be applied to a **Measure**, **Income**, or **Cost**
         *   `targetField`.
         * - **MIN**. Uses the minimum value. Can be applied to a **Measure**, **Income**, or
         *   **Cost** `targetField`.
         * - **MAX**. Uses the maximum value. Can be applied to a **Measure**, **Income**, or
         *   **Cost** `targetField`.
         * - **COUNT**. Counts the number of values. Can be applied to a **Measure**, **Income**, or
         *   **Cost** `targetField`.
         * - **LATEST**. Uses the most recent value. Can be applied to a **Measure**, **Income**, or
         *   **Cost** `targetField`. Note: Based on the timestamp `ts` value of usage data
         *   measurement submissions. If using this method, please ensure _distinct_ `ts` values are
         *   used for usage data measurement submissions.
         * - **MEAN**. Uses the arithmetic mean of the values. Can be applied to a **Measure**,
         *   **Income**, or **Cost** `targetField`.
         * - **UNIQUE**. Uses unique values and returns a count of the number of unique values. Can
         *   be applied to a **Metadata** `targetField`.
         */
        class Aggregation @JsonCreator private constructor(private val value: JsonField<String>) :
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

                @JvmField val CUSTOM_SQL = of("CUSTOM_SQL")

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
                UNIQUE,
                CUSTOM_SQL,
            }

            /**
             * An enum containing [Aggregation]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Aggregation] can contain an unknown value in a couple of cases:
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
                CUSTOM_SQL,
                /**
                 * An enum member indicating that [Aggregation] was instantiated with an unknown
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
                    SUM -> Value.SUM
                    MIN -> Value.MIN
                    MAX -> Value.MAX
                    COUNT -> Value.COUNT
                    LATEST -> Value.LATEST
                    MEAN -> Value.MEAN
                    UNIQUE -> Value.UNIQUE
                    CUSTOM_SQL -> Value.CUSTOM_SQL
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
                    CUSTOM_SQL -> Known.CUSTOM_SQL
                    else -> throw M3terInvalidDataException("Unknown Aggregation: $value")
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

            fun validate(): Aggregation = apply {
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

                return /* spotless:off */ other is Aggregation && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Measure && aggregations == other.aggregations && meterId == other.meterId && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(aggregations, meterId, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Measure{aggregations=$aggregations, meterId=$meterId, name=$name, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StatementDefinitionResponse && id == other.id && version == other.version && aggregationFrequency == other.aggregationFrequency && createdBy == other.createdBy && dimensions == other.dimensions && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && includePricePerUnit == other.includePricePerUnit && lastModifiedBy == other.lastModifiedBy && measures == other.measures && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, aggregationFrequency, createdBy, dimensions, dtCreated, dtLastModified, includePricePerUnit, lastModifiedBy, measures, name, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StatementDefinitionResponse{id=$id, version=$version, aggregationFrequency=$aggregationFrequency, createdBy=$createdBy, dimensions=$dimensions, dtCreated=$dtCreated, dtLastModified=$dtLastModified, includePricePerUnit=$includePricePerUnit, lastModifiedBy=$lastModifiedBy, measures=$measures, name=$name, additionalProperties=$additionalProperties}"
}
