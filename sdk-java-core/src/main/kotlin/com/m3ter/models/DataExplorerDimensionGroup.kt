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
import com.m3ter.core.checkRequired
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Group by dimension */
class DataExplorerDimensionGroup
private constructor(
    private val groupType: JsonField<DataExplorerGroup.GroupType>,
    private val fieldCode: JsonField<String>,
    private val meterId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("groupType")
        @ExcludeMissing
        groupType: JsonField<DataExplorerGroup.GroupType> = JsonMissing.of(),
        @JsonProperty("fieldCode") @ExcludeMissing fieldCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("meterId") @ExcludeMissing meterId: JsonField<String> = JsonMissing.of(),
    ) : this(groupType, fieldCode, meterId, mutableMapOf())

    fun toDataExplorerGroup(): DataExplorerGroup =
        DataExplorerGroup.builder().groupType(groupType).build()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupType(): Optional<DataExplorerGroup.GroupType> = groupType.getOptional("groupType")

    /**
     * Field code to group by
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fieldCode(): String = fieldCode.getRequired("fieldCode")

    /**
     * Meter ID to group by
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meterId(): String = meterId.getRequired("meterId")

    /**
     * Returns the raw JSON value of [groupType].
     *
     * Unlike [groupType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("groupType")
    @ExcludeMissing
    fun _groupType(): JsonField<DataExplorerGroup.GroupType> = groupType

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
         * Returns a mutable builder for constructing an instance of [DataExplorerDimensionGroup].
         *
         * The following fields are required:
         * ```java
         * .fieldCode()
         * .meterId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExplorerDimensionGroup]. */
    class Builder internal constructor() {

        private var groupType: JsonField<DataExplorerGroup.GroupType> = JsonMissing.of()
        private var fieldCode: JsonField<String>? = null
        private var meterId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dataExplorerDimensionGroup: DataExplorerDimensionGroup) = apply {
            groupType = dataExplorerDimensionGroup.groupType
            fieldCode = dataExplorerDimensionGroup.fieldCode
            meterId = dataExplorerDimensionGroup.meterId
            additionalProperties = dataExplorerDimensionGroup.additionalProperties.toMutableMap()
        }

        fun groupType(groupType: DataExplorerGroup.GroupType) = groupType(JsonField.of(groupType))

        /**
         * Sets [Builder.groupType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupType] with a well-typed
         * [DataExplorerGroup.GroupType] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun groupType(groupType: JsonField<DataExplorerGroup.GroupType>) = apply {
            this.groupType = groupType
        }

        /** Field code to group by */
        fun fieldCode(fieldCode: String) = fieldCode(JsonField.of(fieldCode))

        /**
         * Sets [Builder.fieldCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fieldCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fieldCode(fieldCode: JsonField<String>) = apply { this.fieldCode = fieldCode }

        /** Meter ID to group by */
        fun meterId(meterId: String) = meterId(JsonField.of(meterId))

        /**
         * Sets [Builder.meterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meterId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAlladditional_properties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAlladditional_properties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [DataExplorerDimensionGroup].
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
        fun build(): DataExplorerDimensionGroup =
            DataExplorerDimensionGroup(
                groupType,
                checkRequired("fieldCode", fieldCode),
                checkRequired("meterId", meterId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DataExplorerDimensionGroup = apply {
        if (validated) {
            return@apply
        }

        groupType().ifPresent { it.validate() }
        fieldCode()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (groupType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (fieldCode.asKnown().isPresent) 1 else 0) +
            (if (meterId.asKnown().isPresent) 1 else 0)

    class GroupType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCOUNT,
            DIMENSION,
            TIME,
            /**
             * An enum member indicating that [GroupType] was instantiated with an unknown value.
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
                ACCOUNT -> Value.ACCOUNT
                DIMENSION -> Value.DIMENSION
                TIME -> Value.TIME
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
                ACCOUNT -> Known.ACCOUNT
                DIMENSION -> Known.DIMENSION
                TIME -> Known.TIME
                else -> throw M3terInvalidDataException("Unknown GroupType: $value")
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

            return other is GroupType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataExplorerDimensionGroup &&
            groupType == other.groupType &&
            fieldCode == other.fieldCode &&
            meterId == other.meterId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(groupType, fieldCode, meterId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataExplorerDimensionGroup{groupType=$groupType, fieldCode=$fieldCode, meterId=$meterId, additionalProperties=$additionalProperties}"
}
