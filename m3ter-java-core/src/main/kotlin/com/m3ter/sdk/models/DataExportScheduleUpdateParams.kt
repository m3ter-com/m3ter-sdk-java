// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

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
import com.m3ter.sdk.core.BaseDeserializer
import com.m3ter.sdk.core.BaseSerializer
import com.m3ter.sdk.core.Enum
import com.m3ter.sdk.core.ExcludeMissing
import com.m3ter.sdk.core.JsonField
import com.m3ter.sdk.core.JsonMissing
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.core.NoAutoDetect
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.getOrThrow
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update a Data Export Schedule for the given UUID. Each Schedule can be configured for exporting
 * _only one_ of either Usage or Operational data:
 *
 * **Operational Data Exports**.
 * - Use the `operationalDataTypes` parameter to specify the entities whose operational data you
 *   want to include in the export each time the Export Schedule runs.
 * - For each of the entity types you select, each time the Export Schedule runs a separate file is
 *   compiled containing the operational data for all entities of that type that exist in your
 *   Organization
 *
 * **Usage Data Exports**.
 * - Select the Meters and Accounts whose usage data you want to include in the export each time the
 *   Export Schedule runs.
 * - If _don't want to aggregate_ the usage data collected by the selected Meters, use **ORIGINAL**
 *   for `aggregationFrequency`, which is the _default_. This means the raw usage data collected by
 *   any type of Data Fields and the values for any Derived Fields on the selected Meters will be
 *   included in the export.
 * - If you _do want to aggregate_ the usage data collected by the selected Meters, use one of the
 *   other options for `aggregationFrequency`: **HOUR**, **DAY**, **WEEK**, or **MONTH**. You _must_
 *   then also specified an `aggregation` method to be used on the usage data before export.
 *   Importantly, if you do aggregate usage data, only the usage data collected by any numeric Data
 *   Fields on the selected Meters - those of type **MEASURE**, **INCOME**, or **COST** - will be
 *   included in the export each time the Export Schedule runs.
 */
class DataExportScheduleUpdateParams
private constructor(
    private val orgId: String,
    private val id: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    fun id(): String = id

    fun body(): Body = body

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> orgId
            1 -> id
            else -> ""
        }
    }

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val unionMember0: UnionMember0? = null,
        private val unionMember1: UnionMember1? = null,
        private val _json: JsonValue? = null,
    ) {

        fun unionMember0(): Optional<UnionMember0> = Optional.ofNullable(unionMember0)

        fun unionMember1(): Optional<UnionMember1> = Optional.ofNullable(unionMember1)

        fun isUnionMember0(): Boolean = unionMember0 != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun asUnionMember0(): UnionMember0 = unionMember0.getOrThrow("unionMember0")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                unionMember0 != null -> visitor.visitUnionMember0(unionMember0)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitUnionMember0(unionMember0: UnionMember0) {
                        unionMember0.validate()
                    }

                    override fun visitUnionMember1(unionMember1: UnionMember1) {
                        unionMember1.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && unionMember0 == other.unionMember0 && unionMember1 == other.unionMember1 /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(unionMember0, unionMember1) /* spotless:on */

        override fun toString(): String =
            when {
                unionMember0 != null -> "Body{unionMember0=$unionMember0}"
                unionMember1 != null -> "Body{unionMember1=$unionMember1}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            @JvmStatic
            fun ofUnionMember0(unionMember0: UnionMember0) = Body(unionMember0 = unionMember0)

            @JvmStatic
            fun ofUnionMember1(unionMember1: UnionMember1) = Body(unionMember1 = unionMember1)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitUnionMember0(unionMember0: UnionMember0): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws M3terInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw M3terInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)
                val sourceType =
                    json.asObject().getOrNull()?.get("sourceType")?.asString()?.getOrNull()

                when (sourceType) {}

                tryDeserialize(node, jacksonTypeRef<UnionMember0>()) { it.validate() }
                    ?.let {
                        return Body(unionMember0 = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<UnionMember1>()) { it.validate() }
                    ?.let {
                        return Body(unionMember1 = it, _json = json)
                    }

                return Body(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.unionMember0 != null -> generator.writeObject(value.unionMember0)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        @NoAutoDetect
        class UnionMember0
        @JsonCreator
        private constructor(
            @JsonProperty("operationalDataTypes")
            @ExcludeMissing
            private val operationalDataTypes: JsonField<List<OperationalDataType>> =
                JsonMissing.of(),
            @JsonProperty("sourceType")
            @ExcludeMissing
            private val sourceType: JsonField<SourceType> = JsonMissing.of(),
            @JsonProperty("version")
            @ExcludeMissing
            private val version: JsonField<Long> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** A list of the entities whose operational data is included in the data export. */
            fun operationalDataTypes(): List<OperationalDataType> =
                operationalDataTypes.getRequired("operationalDataTypes")

            fun sourceType(): SourceType = sourceType.getRequired("sourceType")

            /**
             * The version number of the entity:
             * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
             *   Create_. On initial Create, version is set at 1 and listed in the response.
             * - **Update Entity:** On Update, version is required and must match the existing
             *   version because a check is performed to ensure sequential versioning is preserved.
             *   Version is incremented by 1 and listed in the response.
             */
            fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

            /** A list of the entities whose operational data is included in the data export. */
            @JsonProperty("operationalDataTypes")
            @ExcludeMissing
            fun _operationalDataTypes(): JsonField<List<OperationalDataType>> = operationalDataTypes

            @JsonProperty("sourceType")
            @ExcludeMissing
            fun _sourceType(): JsonField<SourceType> = sourceType

            /**
             * The version number of the entity:
             * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
             *   Create_. On initial Create, version is set at 1 and listed in the response.
             * - **Update Entity:** On Update, version is required and must match the existing
             *   version because a check is performed to ensure sequential versioning is preserved.
             *   Version is incremented by 1 and listed in the response.
             */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UnionMember0 = apply {
                if (validated) {
                    return@apply
                }

                operationalDataTypes()
                sourceType()
                version()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember0]. */
            class Builder internal constructor() {

                private var operationalDataTypes: JsonField<MutableList<OperationalDataType>>? =
                    null
                private var sourceType: JsonField<SourceType>? = null
                private var version: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember0: UnionMember0) = apply {
                    operationalDataTypes =
                        unionMember0.operationalDataTypes.map { it.toMutableList() }
                    sourceType = unionMember0.sourceType
                    version = unionMember0.version
                    additionalProperties = unionMember0.additionalProperties.toMutableMap()
                }

                /** A list of the entities whose operational data is included in the data export. */
                fun operationalDataTypes(operationalDataTypes: List<OperationalDataType>) =
                    operationalDataTypes(JsonField.of(operationalDataTypes))

                /** A list of the entities whose operational data is included in the data export. */
                fun operationalDataTypes(
                    operationalDataTypes: JsonField<List<OperationalDataType>>
                ) = apply {
                    this.operationalDataTypes = operationalDataTypes.map { it.toMutableList() }
                }

                /** A list of the entities whose operational data is included in the data export. */
                fun addOperationalDataType(operationalDataType: OperationalDataType) = apply {
                    operationalDataTypes =
                        (operationalDataTypes ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(operationalDataType)
                        }
                }

                fun sourceType(sourceType: SourceType) = sourceType(JsonField.of(sourceType))

                fun sourceType(sourceType: JsonField<SourceType>) = apply {
                    this.sourceType = sourceType
                }

                /**
                 * The version number of the entity:
                 * - **Create entity:** Not valid for initial insertion of new entity - _do not use
                 *   for Create_. On initial Create, version is set at 1 and listed in the response.
                 * - **Update Entity:** On Update, version is required and must match the existing
                 *   version because a check is performed to ensure sequential versioning is
                 *   preserved. Version is incremented by 1 and listed in the response.
                 */
                fun version(version: Long) = version(JsonField.of(version))

                /**
                 * The version number of the entity:
                 * - **Create entity:** Not valid for initial insertion of new entity - _do not use
                 *   for Create_. On initial Create, version is set at 1 and listed in the response.
                 * - **Update Entity:** On Update, version is required and must match the existing
                 *   version because a check is performed to ensure sequential versioning is
                 *   preserved. Version is incremented by 1 and listed in the response.
                 */
                fun version(version: JsonField<Long>) = apply { this.version = version }

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

                fun build(): UnionMember0 =
                    UnionMember0(
                        checkRequired("operationalDataTypes", operationalDataTypes).map {
                            it.toImmutable()
                        },
                        checkRequired("sourceType", sourceType),
                        version,
                        additionalProperties.toImmutable(),
                    )
            }

            class OperationalDataType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    @JvmField val BILLS = of("BILLS")

                    @JvmField val COMMITMENTS = of("COMMITMENTS")

                    @JvmField val ACCOUNTS = of("ACCOUNTS")

                    @JvmField val BALANCES = of("BALANCES")

                    @JvmField val CONTRACTS = of("CONTRACTS")

                    @JvmField val ACCOUNT_PLANS = of("ACCOUNT_PLANS")

                    @JvmField val AGGREGATIONS = of("AGGREGATIONS")

                    @JvmField val PLANS = of("PLANS")

                    @JvmField val PRICING = of("PRICING")

                    @JvmField val PRICING_BANDS = of("PRICING_BANDS")

                    @JvmField val BILL_LINE_ITEMS = of("BILL_LINE_ITEMS")

                    @JvmField val METERS = of("METERS")

                    @JvmField val PRODUCTS = of("PRODUCTS")

                    @JvmField val COMPOUND_AGGREGATIONS = of("COMPOUND_AGGREGATIONS")

                    @JvmField val PLAN_GROUPS = of("PLAN_GROUPS")

                    @JvmField val PLAN_GROUP_LINKS = of("PLAN_GROUP_LINKS")

                    @JvmField val PLAN_TEMPLATES = of("PLAN_TEMPLATES")

                    @JvmField val BALANCE_TRANSACTIONS = of("BALANCE_TRANSACTIONS")

                    @JvmStatic fun of(value: String) = OperationalDataType(JsonField.of(value))
                }

                /** An enum containing [OperationalDataType]'s known values. */
                enum class Known {
                    BILLS,
                    COMMITMENTS,
                    ACCOUNTS,
                    BALANCES,
                    CONTRACTS,
                    ACCOUNT_PLANS,
                    AGGREGATIONS,
                    PLANS,
                    PRICING,
                    PRICING_BANDS,
                    BILL_LINE_ITEMS,
                    METERS,
                    PRODUCTS,
                    COMPOUND_AGGREGATIONS,
                    PLAN_GROUPS,
                    PLAN_GROUP_LINKS,
                    PLAN_TEMPLATES,
                    BALANCE_TRANSACTIONS,
                }

                /**
                 * An enum containing [OperationalDataType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [OperationalDataType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BILLS,
                    COMMITMENTS,
                    ACCOUNTS,
                    BALANCES,
                    CONTRACTS,
                    ACCOUNT_PLANS,
                    AGGREGATIONS,
                    PLANS,
                    PRICING,
                    PRICING_BANDS,
                    BILL_LINE_ITEMS,
                    METERS,
                    PRODUCTS,
                    COMPOUND_AGGREGATIONS,
                    PLAN_GROUPS,
                    PLAN_GROUP_LINKS,
                    PLAN_TEMPLATES,
                    BALANCE_TRANSACTIONS,
                    /**
                     * An enum member indicating that [OperationalDataType] was instantiated with an
                     * unknown value.
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
                        BILLS -> Value.BILLS
                        COMMITMENTS -> Value.COMMITMENTS
                        ACCOUNTS -> Value.ACCOUNTS
                        BALANCES -> Value.BALANCES
                        CONTRACTS -> Value.CONTRACTS
                        ACCOUNT_PLANS -> Value.ACCOUNT_PLANS
                        AGGREGATIONS -> Value.AGGREGATIONS
                        PLANS -> Value.PLANS
                        PRICING -> Value.PRICING
                        PRICING_BANDS -> Value.PRICING_BANDS
                        BILL_LINE_ITEMS -> Value.BILL_LINE_ITEMS
                        METERS -> Value.METERS
                        PRODUCTS -> Value.PRODUCTS
                        COMPOUND_AGGREGATIONS -> Value.COMPOUND_AGGREGATIONS
                        PLAN_GROUPS -> Value.PLAN_GROUPS
                        PLAN_GROUP_LINKS -> Value.PLAN_GROUP_LINKS
                        PLAN_TEMPLATES -> Value.PLAN_TEMPLATES
                        BALANCE_TRANSACTIONS -> Value.BALANCE_TRANSACTIONS
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
                        BILLS -> Known.BILLS
                        COMMITMENTS -> Known.COMMITMENTS
                        ACCOUNTS -> Known.ACCOUNTS
                        BALANCES -> Known.BALANCES
                        CONTRACTS -> Known.CONTRACTS
                        ACCOUNT_PLANS -> Known.ACCOUNT_PLANS
                        AGGREGATIONS -> Known.AGGREGATIONS
                        PLANS -> Known.PLANS
                        PRICING -> Known.PRICING
                        PRICING_BANDS -> Known.PRICING_BANDS
                        BILL_LINE_ITEMS -> Known.BILL_LINE_ITEMS
                        METERS -> Known.METERS
                        PRODUCTS -> Known.PRODUCTS
                        COMPOUND_AGGREGATIONS -> Known.COMPOUND_AGGREGATIONS
                        PLAN_GROUPS -> Known.PLAN_GROUPS
                        PLAN_GROUP_LINKS -> Known.PLAN_GROUP_LINKS
                        PLAN_TEMPLATES -> Known.PLAN_TEMPLATES
                        BALANCE_TRANSACTIONS -> Known.BALANCE_TRANSACTIONS
                        else ->
                            throw M3terInvalidDataException("Unknown OperationalDataType: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is OperationalDataType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class SourceType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    USAGE,
                    OPERATIONAL,
                    /**
                     * An enum member indicating that [SourceType] was instantiated with an unknown
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
                        USAGE -> Value.USAGE
                        OPERATIONAL -> Value.OPERATIONAL
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
                        USAGE -> Known.USAGE
                        OPERATIONAL -> Known.OPERATIONAL
                        else -> throw M3terInvalidDataException("Unknown SourceType: $value")
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

                return /* spotless:off */ other is UnionMember0 && operationalDataTypes == other.operationalDataTypes && sourceType == other.sourceType && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(operationalDataTypes, sourceType, version, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember0{operationalDataTypes=$operationalDataTypes, sourceType=$sourceType, version=$version, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class UnionMember1
        @JsonCreator
        private constructor(
            @JsonProperty("aggregationFrequency")
            @ExcludeMissing
            private val aggregationFrequency: JsonField<AggregationFrequency> = JsonMissing.of(),
            @JsonProperty("sourceType")
            @ExcludeMissing
            private val sourceType: JsonField<SourceType> = JsonMissing.of(),
            @JsonProperty("timePeriod")
            @ExcludeMissing
            private val timePeriod: JsonField<TimePeriod> = JsonMissing.of(),
            @JsonProperty("accountIds")
            @ExcludeMissing
            private val accountIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("aggregation")
            @ExcludeMissing
            private val aggregation: JsonField<Aggregation> = JsonMissing.of(),
            @JsonProperty("meterIds")
            @ExcludeMissing
            private val meterIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("version")
            @ExcludeMissing
            private val version: JsonField<Long> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Specifies the time period for the aggregation of usage data included each time the
             * Data Export Schedule runs:
             * - **ORIGINAL**. Usage data is _not aggregated_. If you select to not aggregate, then
             *   raw usage data measurements collected by all Data Field types and any Derived
             *   Fields on the selected Meters are included in the export. This is the _Default_.
             *
             * If you want to aggregate usage data for the Export Schedule you must define an
             * `aggregationFrequency`:
             * - **HOUR**. Aggregated hourly.
             * - **DAY**. Aggregated daily.
             * - **WEEK**. Aggregated weekly.
             * - **MONTH**. Aggregated monthly.
             * - If you select to aggregate usage data for a Export Schedule, then only the
             *   aggregated usage data collected by numeric Data Fields of type **MEASURE**,
             *   **INCOME**, or **COST** on selected Meters are included in the export.
             *
             * **NOTE**: If you define an `aggregationFrequency` other than **ORIGINAL** and do not
             * define an `aggregation` method, then you'll receive and error.
             */
            fun aggregationFrequency(): AggregationFrequency =
                aggregationFrequency.getRequired("aggregationFrequency")

            fun sourceType(): SourceType = sourceType.getRequired("sourceType")

            /**
             * Define a time period to control the range of usage data you want the data export to
             * contain when it runs:
             * - **TODAY**. Data collected for the current day up until the time the export runs.
             * - **YESTERDAY**. Data collected for the day before the export runs - that is, the 24
             *   hour period from midnight to midnight of the day before.
             * - **WEEK_TO_DATE**. Data collected for the period covering the current week to the
             *   date and time the export runs, and weeks run Monday to Monday.
             * - **CURRENT_MONTH**. Data collected for the current month in which the export is ran
             *   up to and including the date and time the export runs.
             * - **LAST_30_DAYS**. Data collected for the 30 days prior to the date the export is
             *   ran.
             * - **LAST_35_DAYS**. Data collected for the 35 days prior to the date the export is
             *   ran.
             * - **PREVIOUS_WEEK**. Data collected for the previous full week period, and weeks run
             *   Monday to Monday.
             * - **PREVIOUS_MONTH**. Data collected for the previous full month period.
             *
             * For more details and examples, see the
             * [Time Period](https://www.m3ter.com/docs/guides/data-exports/creating-export-schedules#time-period)
             * section in our main User Documentation.
             */
            fun timePeriod(): TimePeriod = timePeriod.getRequired("timePeriod")

            /** List of account IDs for which the usage data will be exported. */
            fun accountIds(): Optional<List<String>> =
                Optional.ofNullable(accountIds.getNullable("accountIds"))

            /**
             * Specifies the aggregation method applied to usage data collected in the numeric Data
             * Fields of Meters included for the Data Export Schedule - that is, Data Fields of type
             * **MEASURE**, **INCOME**, or **COST**:
             * - **SUM**. Adds the values.
             * - **MIN**. Uses the minimum value.
             * - **MAX**. Uses the maximum value.
             * - **COUNT**. Counts the number of values.
             * - **LATEST**. Uses the most recent value. Note: Based on the timestamp `ts` value of
             *   usage data measurement submissions. If using this method, please ensure _distinct_
             *   `ts` values are used for usage data measurement submissions.
             */
            fun aggregation(): Optional<Aggregation> =
                Optional.ofNullable(aggregation.getNullable("aggregation"))

            /** List of meter IDs for which the usage data will be exported. */
            fun meterIds(): Optional<List<String>> =
                Optional.ofNullable(meterIds.getNullable("meterIds"))

            /**
             * The version number of the entity:
             * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
             *   Create_. On initial Create, version is set at 1 and listed in the response.
             * - **Update Entity:** On Update, version is required and must match the existing
             *   version because a check is performed to ensure sequential versioning is preserved.
             *   Version is incremented by 1 and listed in the response.
             */
            fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

            /**
             * Specifies the time period for the aggregation of usage data included each time the
             * Data Export Schedule runs:
             * - **ORIGINAL**. Usage data is _not aggregated_. If you select to not aggregate, then
             *   raw usage data measurements collected by all Data Field types and any Derived
             *   Fields on the selected Meters are included in the export. This is the _Default_.
             *
             * If you want to aggregate usage data for the Export Schedule you must define an
             * `aggregationFrequency`:
             * - **HOUR**. Aggregated hourly.
             * - **DAY**. Aggregated daily.
             * - **WEEK**. Aggregated weekly.
             * - **MONTH**. Aggregated monthly.
             * - If you select to aggregate usage data for a Export Schedule, then only the
             *   aggregated usage data collected by numeric Data Fields of type **MEASURE**,
             *   **INCOME**, or **COST** on selected Meters are included in the export.
             *
             * **NOTE**: If you define an `aggregationFrequency` other than **ORIGINAL** and do not
             * define an `aggregation` method, then you'll receive and error.
             */
            @JsonProperty("aggregationFrequency")
            @ExcludeMissing
            fun _aggregationFrequency(): JsonField<AggregationFrequency> = aggregationFrequency

            @JsonProperty("sourceType")
            @ExcludeMissing
            fun _sourceType(): JsonField<SourceType> = sourceType

            /**
             * Define a time period to control the range of usage data you want the data export to
             * contain when it runs:
             * - **TODAY**. Data collected for the current day up until the time the export runs.
             * - **YESTERDAY**. Data collected for the day before the export runs - that is, the 24
             *   hour period from midnight to midnight of the day before.
             * - **WEEK_TO_DATE**. Data collected for the period covering the current week to the
             *   date and time the export runs, and weeks run Monday to Monday.
             * - **CURRENT_MONTH**. Data collected for the current month in which the export is ran
             *   up to and including the date and time the export runs.
             * - **LAST_30_DAYS**. Data collected for the 30 days prior to the date the export is
             *   ran.
             * - **LAST_35_DAYS**. Data collected for the 35 days prior to the date the export is
             *   ran.
             * - **PREVIOUS_WEEK**. Data collected for the previous full week period, and weeks run
             *   Monday to Monday.
             * - **PREVIOUS_MONTH**. Data collected for the previous full month period.
             *
             * For more details and examples, see the
             * [Time Period](https://www.m3ter.com/docs/guides/data-exports/creating-export-schedules#time-period)
             * section in our main User Documentation.
             */
            @JsonProperty("timePeriod")
            @ExcludeMissing
            fun _timePeriod(): JsonField<TimePeriod> = timePeriod

            /** List of account IDs for which the usage data will be exported. */
            @JsonProperty("accountIds")
            @ExcludeMissing
            fun _accountIds(): JsonField<List<String>> = accountIds

            /**
             * Specifies the aggregation method applied to usage data collected in the numeric Data
             * Fields of Meters included for the Data Export Schedule - that is, Data Fields of type
             * **MEASURE**, **INCOME**, or **COST**:
             * - **SUM**. Adds the values.
             * - **MIN**. Uses the minimum value.
             * - **MAX**. Uses the maximum value.
             * - **COUNT**. Counts the number of values.
             * - **LATEST**. Uses the most recent value. Note: Based on the timestamp `ts` value of
             *   usage data measurement submissions. If using this method, please ensure _distinct_
             *   `ts` values are used for usage data measurement submissions.
             */
            @JsonProperty("aggregation")
            @ExcludeMissing
            fun _aggregation(): JsonField<Aggregation> = aggregation

            /** List of meter IDs for which the usage data will be exported. */
            @JsonProperty("meterIds")
            @ExcludeMissing
            fun _meterIds(): JsonField<List<String>> = meterIds

            /**
             * The version number of the entity:
             * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
             *   Create_. On initial Create, version is set at 1 and listed in the response.
             * - **Update Entity:** On Update, version is required and must match the existing
             *   version because a check is performed to ensure sequential versioning is preserved.
             *   Version is incremented by 1 and listed in the response.
             */
            @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UnionMember1 = apply {
                if (validated) {
                    return@apply
                }

                aggregationFrequency()
                sourceType()
                timePeriod()
                accountIds()
                aggregation()
                meterIds()
                version()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UnionMember1]. */
            class Builder internal constructor() {

                private var aggregationFrequency: JsonField<AggregationFrequency>? = null
                private var sourceType: JsonField<SourceType>? = null
                private var timePeriod: JsonField<TimePeriod>? = null
                private var accountIds: JsonField<MutableList<String>>? = null
                private var aggregation: JsonField<Aggregation> = JsonMissing.of()
                private var meterIds: JsonField<MutableList<String>>? = null
                private var version: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(unionMember1: UnionMember1) = apply {
                    aggregationFrequency = unionMember1.aggregationFrequency
                    sourceType = unionMember1.sourceType
                    timePeriod = unionMember1.timePeriod
                    accountIds = unionMember1.accountIds.map { it.toMutableList() }
                    aggregation = unionMember1.aggregation
                    meterIds = unionMember1.meterIds.map { it.toMutableList() }
                    version = unionMember1.version
                    additionalProperties = unionMember1.additionalProperties.toMutableMap()
                }

                /**
                 * Specifies the time period for the aggregation of usage data included each time
                 * the Data Export Schedule runs:
                 * - **ORIGINAL**. Usage data is _not aggregated_. If you select to not aggregate,
                 *   then raw usage data measurements collected by all Data Field types and any
                 *   Derived Fields on the selected Meters are included in the export. This is the
                 *   _Default_.
                 *
                 * If you want to aggregate usage data for the Export Schedule you must define an
                 * `aggregationFrequency`:
                 * - **HOUR**. Aggregated hourly.
                 * - **DAY**. Aggregated daily.
                 * - **WEEK**. Aggregated weekly.
                 * - **MONTH**. Aggregated monthly.
                 * - If you select to aggregate usage data for a Export Schedule, then only the
                 *   aggregated usage data collected by numeric Data Fields of type **MEASURE**,
                 *   **INCOME**, or **COST** on selected Meters are included in the export.
                 *
                 * **NOTE**: If you define an `aggregationFrequency` other than **ORIGINAL** and do
                 * not define an `aggregation` method, then you'll receive and error.
                 */
                fun aggregationFrequency(aggregationFrequency: AggregationFrequency) =
                    aggregationFrequency(JsonField.of(aggregationFrequency))

                /**
                 * Specifies the time period for the aggregation of usage data included each time
                 * the Data Export Schedule runs:
                 * - **ORIGINAL**. Usage data is _not aggregated_. If you select to not aggregate,
                 *   then raw usage data measurements collected by all Data Field types and any
                 *   Derived Fields on the selected Meters are included in the export. This is the
                 *   _Default_.
                 *
                 * If you want to aggregate usage data for the Export Schedule you must define an
                 * `aggregationFrequency`:
                 * - **HOUR**. Aggregated hourly.
                 * - **DAY**. Aggregated daily.
                 * - **WEEK**. Aggregated weekly.
                 * - **MONTH**. Aggregated monthly.
                 * - If you select to aggregate usage data for a Export Schedule, then only the
                 *   aggregated usage data collected by numeric Data Fields of type **MEASURE**,
                 *   **INCOME**, or **COST** on selected Meters are included in the export.
                 *
                 * **NOTE**: If you define an `aggregationFrequency` other than **ORIGINAL** and do
                 * not define an `aggregation` method, then you'll receive and error.
                 */
                fun aggregationFrequency(aggregationFrequency: JsonField<AggregationFrequency>) =
                    apply {
                        this.aggregationFrequency = aggregationFrequency
                    }

                fun sourceType(sourceType: SourceType) = sourceType(JsonField.of(sourceType))

                fun sourceType(sourceType: JsonField<SourceType>) = apply {
                    this.sourceType = sourceType
                }

                /**
                 * Define a time period to control the range of usage data you want the data export
                 * to contain when it runs:
                 * - **TODAY**. Data collected for the current day up until the time the export
                 *   runs.
                 * - **YESTERDAY**. Data collected for the day before the export runs - that is, the
                 *   24 hour period from midnight to midnight of the day before.
                 * - **WEEK_TO_DATE**. Data collected for the period covering the current week to
                 *   the date and time the export runs, and weeks run Monday to Monday.
                 * - **CURRENT_MONTH**. Data collected for the current month in which the export is
                 *   ran up to and including the date and time the export runs.
                 * - **LAST_30_DAYS**. Data collected for the 30 days prior to the date the export
                 *   is ran.
                 * - **LAST_35_DAYS**. Data collected for the 35 days prior to the date the export
                 *   is ran.
                 * - **PREVIOUS_WEEK**. Data collected for the previous full week period, and weeks
                 *   run Monday to Monday.
                 * - **PREVIOUS_MONTH**. Data collected for the previous full month period.
                 *
                 * For more details and examples, see the
                 * [Time Period](https://www.m3ter.com/docs/guides/data-exports/creating-export-schedules#time-period)
                 * section in our main User Documentation.
                 */
                fun timePeriod(timePeriod: TimePeriod) = timePeriod(JsonField.of(timePeriod))

                /**
                 * Define a time period to control the range of usage data you want the data export
                 * to contain when it runs:
                 * - **TODAY**. Data collected for the current day up until the time the export
                 *   runs.
                 * - **YESTERDAY**. Data collected for the day before the export runs - that is, the
                 *   24 hour period from midnight to midnight of the day before.
                 * - **WEEK_TO_DATE**. Data collected for the period covering the current week to
                 *   the date and time the export runs, and weeks run Monday to Monday.
                 * - **CURRENT_MONTH**. Data collected for the current month in which the export is
                 *   ran up to and including the date and time the export runs.
                 * - **LAST_30_DAYS**. Data collected for the 30 days prior to the date the export
                 *   is ran.
                 * - **LAST_35_DAYS**. Data collected for the 35 days prior to the date the export
                 *   is ran.
                 * - **PREVIOUS_WEEK**. Data collected for the previous full week period, and weeks
                 *   run Monday to Monday.
                 * - **PREVIOUS_MONTH**. Data collected for the previous full month period.
                 *
                 * For more details and examples, see the
                 * [Time Period](https://www.m3ter.com/docs/guides/data-exports/creating-export-schedules#time-period)
                 * section in our main User Documentation.
                 */
                fun timePeriod(timePeriod: JsonField<TimePeriod>) = apply {
                    this.timePeriod = timePeriod
                }

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
                 * Specifies the aggregation method applied to usage data collected in the numeric
                 * Data Fields of Meters included for the Data Export Schedule - that is, Data
                 * Fields of type **MEASURE**, **INCOME**, or **COST**:
                 * - **SUM**. Adds the values.
                 * - **MIN**. Uses the minimum value.
                 * - **MAX**. Uses the maximum value.
                 * - **COUNT**. Counts the number of values.
                 * - **LATEST**. Uses the most recent value. Note: Based on the timestamp `ts` value
                 *   of usage data measurement submissions. If using this method, please ensure
                 *   _distinct_ `ts` values are used for usage data measurement submissions.
                 */
                fun aggregation(aggregation: Aggregation) = aggregation(JsonField.of(aggregation))

                /**
                 * Specifies the aggregation method applied to usage data collected in the numeric
                 * Data Fields of Meters included for the Data Export Schedule - that is, Data
                 * Fields of type **MEASURE**, **INCOME**, or **COST**:
                 * - **SUM**. Adds the values.
                 * - **MIN**. Uses the minimum value.
                 * - **MAX**. Uses the maximum value.
                 * - **COUNT**. Counts the number of values.
                 * - **LATEST**. Uses the most recent value. Note: Based on the timestamp `ts` value
                 *   of usage data measurement submissions. If using this method, please ensure
                 *   _distinct_ `ts` values are used for usage data measurement submissions.
                 */
                fun aggregation(aggregation: JsonField<Aggregation>) = apply {
                    this.aggregation = aggregation
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
                 * The version number of the entity:
                 * - **Create entity:** Not valid for initial insertion of new entity - _do not use
                 *   for Create_. On initial Create, version is set at 1 and listed in the response.
                 * - **Update Entity:** On Update, version is required and must match the existing
                 *   version because a check is performed to ensure sequential versioning is
                 *   preserved. Version is incremented by 1 and listed in the response.
                 */
                fun version(version: Long) = version(JsonField.of(version))

                /**
                 * The version number of the entity:
                 * - **Create entity:** Not valid for initial insertion of new entity - _do not use
                 *   for Create_. On initial Create, version is set at 1 and listed in the response.
                 * - **Update Entity:** On Update, version is required and must match the existing
                 *   version because a check is performed to ensure sequential versioning is
                 *   preserved. Version is incremented by 1 and listed in the response.
                 */
                fun version(version: JsonField<Long>) = apply { this.version = version }

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

                fun build(): UnionMember1 =
                    UnionMember1(
                        checkRequired("aggregationFrequency", aggregationFrequency),
                        checkRequired("sourceType", sourceType),
                        checkRequired("timePeriod", timePeriod),
                        (accountIds ?: JsonMissing.of()).map { it.toImmutable() },
                        aggregation,
                        (meterIds ?: JsonMissing.of()).map { it.toImmutable() },
                        version,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Specifies the time period for the aggregation of usage data included each time the
             * Data Export Schedule runs:
             * - **ORIGINAL**. Usage data is _not aggregated_. If you select to not aggregate, then
             *   raw usage data measurements collected by all Data Field types and any Derived
             *   Fields on the selected Meters are included in the export. This is the _Default_.
             *
             * If you want to aggregate usage data for the Export Schedule you must define an
             * `aggregationFrequency`:
             * - **HOUR**. Aggregated hourly.
             * - **DAY**. Aggregated daily.
             * - **WEEK**. Aggregated weekly.
             * - **MONTH**. Aggregated monthly.
             * - If you select to aggregate usage data for a Export Schedule, then only the
             *   aggregated usage data collected by numeric Data Fields of type **MEASURE**,
             *   **INCOME**, or **COST** on selected Meters are included in the export.
             *
             * **NOTE**: If you define an `aggregationFrequency` other than **ORIGINAL** and do not
             * define an `aggregation` method, then you'll receive and error.
             */
            class AggregationFrequency
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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
                 * An enum containing [AggregationFrequency]'s known values, as well as an
                 * [_UNKNOWN] member.
                 *
                 * An instance of [AggregationFrequency] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ORIGINAL,
                    HOUR,
                    DAY,
                    WEEK,
                    MONTH,
                    /**
                     * An enum member indicating that [AggregationFrequency] was instantiated with
                     * an unknown value.
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
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws M3terInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        ORIGINAL -> Known.ORIGINAL
                        HOUR -> Known.HOUR
                        DAY -> Known.DAY
                        WEEK -> Known.WEEK
                        MONTH -> Known.MONTH
                        else ->
                            throw M3terInvalidDataException("Unknown AggregationFrequency: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AggregationFrequency && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class SourceType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    USAGE,
                    OPERATIONAL,
                    /**
                     * An enum member indicating that [SourceType] was instantiated with an unknown
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
                        USAGE -> Value.USAGE
                        OPERATIONAL -> Value.OPERATIONAL
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
                        USAGE -> Known.USAGE
                        OPERATIONAL -> Known.OPERATIONAL
                        else -> throw M3terInvalidDataException("Unknown SourceType: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is SourceType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Define a time period to control the range of usage data you want the data export to
             * contain when it runs:
             * - **TODAY**. Data collected for the current day up until the time the export runs.
             * - **YESTERDAY**. Data collected for the day before the export runs - that is, the 24
             *   hour period from midnight to midnight of the day before.
             * - **WEEK_TO_DATE**. Data collected for the period covering the current week to the
             *   date and time the export runs, and weeks run Monday to Monday.
             * - **CURRENT_MONTH**. Data collected for the current month in which the export is ran
             *   up to and including the date and time the export runs.
             * - **LAST_30_DAYS**. Data collected for the 30 days prior to the date the export is
             *   ran.
             * - **LAST_35_DAYS**. Data collected for the 35 days prior to the date the export is
             *   ran.
             * - **PREVIOUS_WEEK**. Data collected for the previous full week period, and weeks run
             *   Monday to Monday.
             * - **PREVIOUS_MONTH**. Data collected for the previous full month period.
             *
             * For more details and examples, see the
             * [Time Period](https://www.m3ter.com/docs/guides/data-exports/creating-export-schedules#time-period)
             * section in our main User Documentation.
             */
            class TimePeriod
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                     * An enum member indicating that [TimePeriod] was instantiated with an unknown
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
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws M3terInvalidDataException if this class instance's value is a not a known
                 *   member.
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TimePeriod && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
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
             *   usage data measurement submissions. If using this method, please ensure _distinct_
             *   `ts` values are used for usage data measurement submissions.
             */
            class Aggregation
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                     * An enum member indicating that [Aggregation] was instantiated with an unknown
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
                        else -> throw M3terInvalidDataException("Unknown Aggregation: $value")
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

                return /* spotless:off */ other is UnionMember1 && aggregationFrequency == other.aggregationFrequency && sourceType == other.sourceType && timePeriod == other.timePeriod && accountIds == other.accountIds && aggregation == other.aggregation && meterIds == other.meterIds && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(aggregationFrequency, sourceType, timePeriod, accountIds, aggregation, meterIds, version, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnionMember1{aggregationFrequency=$aggregationFrequency, sourceType=$sourceType, timePeriod=$timePeriod, accountIds=$accountIds, aggregation=$aggregation, meterIds=$meterIds, version=$version, additionalProperties=$additionalProperties}"
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExportScheduleUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var id: String? = null
        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dataExportScheduleUpdateParams: DataExportScheduleUpdateParams) = apply {
            orgId = dataExportScheduleUpdateParams.orgId
            id = dataExportScheduleUpdateParams.id
            body = dataExportScheduleUpdateParams.body
            additionalHeaders = dataExportScheduleUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = dataExportScheduleUpdateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        fun id(id: String) = apply { this.id = id }

        fun body(body: Body) = apply { this.body = body }

        fun body(unionMember0: Body.UnionMember0) = body(Body.ofUnionMember0(unionMember0))

        fun body(unionMember1: Body.UnionMember1) = body(Body.ofUnionMember1(unionMember1))

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

        fun build(): DataExportScheduleUpdateParams =
            DataExportScheduleUpdateParams(
                checkRequired("orgId", orgId),
                checkRequired("id", id),
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportScheduleUpdateParams && orgId == other.orgId && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DataExportScheduleUpdateParams{orgId=$orgId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
