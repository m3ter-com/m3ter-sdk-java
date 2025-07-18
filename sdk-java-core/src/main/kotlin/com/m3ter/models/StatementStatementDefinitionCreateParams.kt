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
import com.m3ter.core.checkKnown
import com.m3ter.core.checkRequired
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create a new StatementDefinition.
 *
 * This endpoint creates a new StatementDefinition within the specified Organization. The details of
 * the StatementDefinition are provided in the request body.
 */
class StatementStatementDefinitionCreateParams
private constructor(
    private val orgId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /**
     * This specifies how often the Statement should aggregate data.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun aggregationFrequency(): AggregationFrequency = body.aggregationFrequency()

    /**
     * An array of objects, each representing a Dimension data field from a Meter _(for Meters that
     * have Dimensions setup)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dimensions(): Optional<List<Dimension>> = body.dimensions()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun generateSlimStatements(): Optional<Boolean> = body.generateSlimStatements()

    /**
     * A Boolean indicating whether to include the price per unit in the Statement.
     * - TRUE - includes the price per unit.
     * - FALSE - excludes the price per unit.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includePricePerUnit(): Optional<Boolean> = body.includePricePerUnit()

    /**
     * An array of objects, each representing a Measure data field from a Meter.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun measures(): Optional<List<Measure>> = body.measures()

    /**
     * Descriptive name for the StatementDefinition providing context and information.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<Long> = body.version()

    /**
     * Returns the raw JSON value of [aggregationFrequency].
     *
     * Unlike [aggregationFrequency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _aggregationFrequency(): JsonField<AggregationFrequency> = body._aggregationFrequency()

    /**
     * Returns the raw JSON value of [dimensions].
     *
     * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dimensions(): JsonField<List<Dimension>> = body._dimensions()

    /**
     * Returns the raw JSON value of [generateSlimStatements].
     *
     * Unlike [generateSlimStatements], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _generateSlimStatements(): JsonField<Boolean> = body._generateSlimStatements()

    /**
     * Returns the raw JSON value of [includePricePerUnit].
     *
     * Unlike [includePricePerUnit], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _includePricePerUnit(): JsonField<Boolean> = body._includePricePerUnit()

    /**
     * Returns the raw JSON value of [measures].
     *
     * Unlike [measures], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _measures(): JsonField<List<Measure>> = body._measures()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [StatementStatementDefinitionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .aggregationFrequency()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StatementStatementDefinitionCreateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            statementStatementDefinitionCreateParams: StatementStatementDefinitionCreateParams
        ) = apply {
            orgId = statementStatementDefinitionCreateParams.orgId
            body = statementStatementDefinitionCreateParams.body.toBuilder()
            additionalHeaders =
                statementStatementDefinitionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                statementStatementDefinitionCreateParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [aggregationFrequency]
         * - [dimensions]
         * - [generateSlimStatements]
         * - [includePricePerUnit]
         * - [measures]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** This specifies how often the Statement should aggregate data. */
        fun aggregationFrequency(aggregationFrequency: AggregationFrequency) = apply {
            body.aggregationFrequency(aggregationFrequency)
        }

        /**
         * Sets [Builder.aggregationFrequency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.aggregationFrequency] with a well-typed
         * [AggregationFrequency] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun aggregationFrequency(aggregationFrequency: JsonField<AggregationFrequency>) = apply {
            body.aggregationFrequency(aggregationFrequency)
        }

        /**
         * An array of objects, each representing a Dimension data field from a Meter _(for Meters
         * that have Dimensions setup)_.
         */
        fun dimensions(dimensions: List<Dimension>) = apply { body.dimensions(dimensions) }

        /**
         * Sets [Builder.dimensions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dimensions] with a well-typed `List<Dimension>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dimensions(dimensions: JsonField<List<Dimension>>) = apply {
            body.dimensions(dimensions)
        }

        /**
         * Adds a single [Dimension] to [dimensions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDimension(dimension: Dimension) = apply { body.addDimension(dimension) }

        fun generateSlimStatements(generateSlimStatements: Boolean) = apply {
            body.generateSlimStatements(generateSlimStatements)
        }

        /**
         * Sets [Builder.generateSlimStatements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.generateSlimStatements] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun generateSlimStatements(generateSlimStatements: JsonField<Boolean>) = apply {
            body.generateSlimStatements(generateSlimStatements)
        }

        /**
         * A Boolean indicating whether to include the price per unit in the Statement.
         * - TRUE - includes the price per unit.
         * - FALSE - excludes the price per unit.
         */
        fun includePricePerUnit(includePricePerUnit: Boolean) = apply {
            body.includePricePerUnit(includePricePerUnit)
        }

        /**
         * Sets [Builder.includePricePerUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includePricePerUnit] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includePricePerUnit(includePricePerUnit: JsonField<Boolean>) = apply {
            body.includePricePerUnit(includePricePerUnit)
        }

        /** An array of objects, each representing a Measure data field from a Meter. */
        fun measures(measures: List<Measure>) = apply { body.measures(measures) }

        /**
         * Sets [Builder.measures] to an arbitrary JSON value.
         *
         * You should usually call [Builder.measures] with a well-typed `List<Measure>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun measures(measures: JsonField<List<Measure>>) = apply { body.measures(measures) }

        /**
         * Adds a single [Measure] to [measures].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMeasure(measure: Measure) = apply { body.addMeasure(measure) }

        /** Descriptive name for the StatementDefinition providing context and information. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
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
         * Returns an immutable instance of [StatementStatementDefinitionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .aggregationFrequency()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StatementStatementDefinitionCreateParams =
            StatementStatementDefinitionCreateParams(
                orgId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val aggregationFrequency: JsonField<AggregationFrequency>,
        private val dimensions: JsonField<List<Dimension>>,
        private val generateSlimStatements: JsonField<Boolean>,
        private val includePricePerUnit: JsonField<Boolean>,
        private val measures: JsonField<List<Measure>>,
        private val name: JsonField<String>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("aggregationFrequency")
            @ExcludeMissing
            aggregationFrequency: JsonField<AggregationFrequency> = JsonMissing.of(),
            @JsonProperty("dimensions")
            @ExcludeMissing
            dimensions: JsonField<List<Dimension>> = JsonMissing.of(),
            @JsonProperty("generateSlimStatements")
            @ExcludeMissing
            generateSlimStatements: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("includePricePerUnit")
            @ExcludeMissing
            includePricePerUnit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("measures")
            @ExcludeMissing
            measures: JsonField<List<Measure>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            aggregationFrequency,
            dimensions,
            generateSlimStatements,
            includePricePerUnit,
            measures,
            name,
            version,
            mutableMapOf(),
        )

        /**
         * This specifies how often the Statement should aggregate data.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun aggregationFrequency(): AggregationFrequency =
            aggregationFrequency.getRequired("aggregationFrequency")

        /**
         * An array of objects, each representing a Dimension data field from a Meter _(for Meters
         * that have Dimensions setup)_.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dimensions(): Optional<List<Dimension>> = dimensions.getOptional("dimensions")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun generateSlimStatements(): Optional<Boolean> =
            generateSlimStatements.getOptional("generateSlimStatements")

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
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun version(): Optional<Long> = version.getOptional("version")

        /**
         * Returns the raw JSON value of [aggregationFrequency].
         *
         * Unlike [aggregationFrequency], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("aggregationFrequency")
        @ExcludeMissing
        fun _aggregationFrequency(): JsonField<AggregationFrequency> = aggregationFrequency

        /**
         * Returns the raw JSON value of [dimensions].
         *
         * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dimensions")
        @ExcludeMissing
        fun _dimensions(): JsonField<List<Dimension>> = dimensions

        /**
         * Returns the raw JSON value of [generateSlimStatements].
         *
         * Unlike [generateSlimStatements], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("generateSlimStatements")
        @ExcludeMissing
        fun _generateSlimStatements(): JsonField<Boolean> = generateSlimStatements

        /**
         * Returns the raw JSON value of [includePricePerUnit].
         *
         * Unlike [includePricePerUnit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("includePricePerUnit")
        @ExcludeMissing
        fun _includePricePerUnit(): JsonField<Boolean> = includePricePerUnit

        /**
         * Returns the raw JSON value of [measures].
         *
         * Unlike [measures], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("measures")
        @ExcludeMissing
        fun _measures(): JsonField<List<Measure>> = measures

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * .aggregationFrequency()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var aggregationFrequency: JsonField<AggregationFrequency>? = null
            private var dimensions: JsonField<MutableList<Dimension>>? = null
            private var generateSlimStatements: JsonField<Boolean> = JsonMissing.of()
            private var includePricePerUnit: JsonField<Boolean> = JsonMissing.of()
            private var measures: JsonField<MutableList<Measure>>? = null
            private var name: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                aggregationFrequency = body.aggregationFrequency
                dimensions = body.dimensions.map { it.toMutableList() }
                generateSlimStatements = body.generateSlimStatements
                includePricePerUnit = body.includePricePerUnit
                measures = body.measures.map { it.toMutableList() }
                name = body.name
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** This specifies how often the Statement should aggregate data. */
            fun aggregationFrequency(aggregationFrequency: AggregationFrequency) =
                aggregationFrequency(JsonField.of(aggregationFrequency))

            /**
             * Sets [Builder.aggregationFrequency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.aggregationFrequency] with a well-typed
             * [AggregationFrequency] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun aggregationFrequency(aggregationFrequency: JsonField<AggregationFrequency>) =
                apply {
                    this.aggregationFrequency = aggregationFrequency
                }

            /**
             * An array of objects, each representing a Dimension data field from a Meter _(for
             * Meters that have Dimensions setup)_.
             */
            fun dimensions(dimensions: List<Dimension>) = dimensions(JsonField.of(dimensions))

            /**
             * Sets [Builder.dimensions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensions] with a well-typed `List<Dimension>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            fun generateSlimStatements(generateSlimStatements: Boolean) =
                generateSlimStatements(JsonField.of(generateSlimStatements))

            /**
             * Sets [Builder.generateSlimStatements] to an arbitrary JSON value.
             *
             * You should usually call [Builder.generateSlimStatements] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun generateSlimStatements(generateSlimStatements: JsonField<Boolean>) = apply {
                this.generateSlimStatements = generateSlimStatements
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
             * You should usually call [Builder.includePricePerUnit] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun includePricePerUnit(includePricePerUnit: JsonField<Boolean>) = apply {
                this.includePricePerUnit = includePricePerUnit
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
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The version number of the entity:
             * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
             *   Create_. On initial Create, version is set at 1 and listed in the response.
             * - **Update Entity:** On Update, version is required and must match the existing
             *   version because a check is performed to ensure sequential versioning is preserved.
             *   Version is incremented by 1 and listed in the response.
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
             * .aggregationFrequency()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("aggregationFrequency", aggregationFrequency),
                    (dimensions ?: JsonMissing.of()).map { it.toImmutable() },
                    generateSlimStatements,
                    includePricePerUnit,
                    (measures ?: JsonMissing.of()).map { it.toImmutable() },
                    name,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            aggregationFrequency().validate()
            dimensions().ifPresent { it.forEach { it.validate() } }
            generateSlimStatements()
            includePricePerUnit()
            measures().ifPresent { it.forEach { it.validate() } }
            name()
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
            (aggregationFrequency.asKnown().getOrNull()?.validity() ?: 0) +
                (dimensions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (generateSlimStatements.asKnown().isPresent) 1 else 0) +
                (if (includePricePerUnit.asKnown().isPresent) 1 else 0) +
                (measures.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && aggregationFrequency == other.aggregationFrequency && dimensions == other.dimensions && generateSlimStatements == other.generateSlimStatements && includePricePerUnit == other.includePricePerUnit && measures == other.measures && name == other.name && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(aggregationFrequency, dimensions, generateSlimStatements, includePricePerUnit, measures, name, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{aggregationFrequency=$aggregationFrequency, dimensions=$dimensions, generateSlimStatements=$generateSlimStatements, includePricePerUnit=$includePricePerUnit, measures=$measures, name=$name, version=$version, additionalProperties=$additionalProperties}"
    }

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

        return /* spotless:off */ other is StatementStatementDefinitionCreateParams && orgId == other.orgId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "StatementStatementDefinitionCreateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
