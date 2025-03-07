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
class CurrencyResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("archived")
    @ExcludeMissing
    private val archived: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<String> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("maxDecimalPlaces")
    @ExcludeMissing
    private val maxDecimalPlaces: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("roundingMode")
    @ExcludeMissing
    private val roundingMode: JsonField<RoundingMode> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The UUID of the entity. */
    fun id(): String = id.getRequired("id")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    fun version(): Long = version.getRequired("version")

    /**
     * TRUE / FALSE flag indicating whether the data entity is archived. An entity can be archived
     * if it is obsolete.
     */
    fun archived(): Optional<Boolean> = Optional.ofNullable(archived.getNullable("archived"))

    /** The short code of the data entity. */
    fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

    /** The unique identifier (UUID) of the user who created this Currency. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** The date and time _(in ISO-8601 format)_ when the Currency was created. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The date and time _(in ISO-8601 format)_ when the Currency was last modified. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The unique identifier (UUID) of the user who last modified this Currency. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** This indicates the maximum number of decimal places to use for this Currency. */
    fun maxDecimalPlaces(): Optional<Long> =
        Optional.ofNullable(maxDecimalPlaces.getNullable("maxDecimalPlaces"))

    /** The name of the data entity. */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    fun roundingMode(): Optional<RoundingMode> =
        Optional.ofNullable(roundingMode.getNullable("roundingMode"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /**
     * TRUE / FALSE flag indicating whether the data entity is archived. An entity can be archived
     * if it is obsolete.
     */
    @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

    /** The short code of the data entity. */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /** The unique identifier (UUID) of the user who created this Currency. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** The date and time _(in ISO-8601 format)_ when the Currency was created. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The date and time _(in ISO-8601 format)_ when the Currency was last modified. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** The unique identifier (UUID) of the user who last modified this Currency. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /** This indicates the maximum number of decimal places to use for this Currency. */
    @JsonProperty("maxDecimalPlaces")
    @ExcludeMissing
    fun _maxDecimalPlaces(): JsonField<Long> = maxDecimalPlaces

    /** The name of the data entity. */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonProperty("roundingMode")
    @ExcludeMissing
    fun _roundingMode(): JsonField<RoundingMode> = roundingMode

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CurrencyResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        archived()
        code()
        createdBy()
        dtCreated()
        dtLastModified()
        lastModifiedBy()
        maxDecimalPlaces()
        name()
        roundingMode()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CurrencyResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CurrencyResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var archived: JsonField<Boolean> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var maxDecimalPlaces: JsonField<Long> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var roundingMode: JsonField<RoundingMode> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(currencyResponse: CurrencyResponse) = apply {
            id = currencyResponse.id
            version = currencyResponse.version
            archived = currencyResponse.archived
            code = currencyResponse.code
            createdBy = currencyResponse.createdBy
            dtCreated = currencyResponse.dtCreated
            dtLastModified = currencyResponse.dtLastModified
            lastModifiedBy = currencyResponse.lastModifiedBy
            maxDecimalPlaces = currencyResponse.maxDecimalPlaces
            name = currencyResponse.name
            roundingMode = currencyResponse.roundingMode
            additionalProperties = currencyResponse.additionalProperties.toMutableMap()
        }

        /** The UUID of the entity. */
        fun id(id: String) = id(JsonField.of(id))

        /** The UUID of the entity. */
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

        /**
         * TRUE / FALSE flag indicating whether the data entity is archived. An entity can be
         * archived if it is obsolete.
         */
        fun archived(archived: Boolean) = archived(JsonField.of(archived))

        /**
         * TRUE / FALSE flag indicating whether the data entity is archived. An entity can be
         * archived if it is obsolete.
         */
        fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

        /** The short code of the data entity. */
        fun code(code: String) = code(JsonField.of(code))

        /** The short code of the data entity. */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** The unique identifier (UUID) of the user who created this Currency. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The unique identifier (UUID) of the user who created this Currency. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The date and time _(in ISO-8601 format)_ when the Currency was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The date and time _(in ISO-8601 format)_ when the Currency was created. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The date and time _(in ISO-8601 format)_ when the Currency was last modified. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The date and time _(in ISO-8601 format)_ when the Currency was last modified. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The unique identifier (UUID) of the user who last modified this Currency. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The unique identifier (UUID) of the user who last modified this Currency. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /** This indicates the maximum number of decimal places to use for this Currency. */
        fun maxDecimalPlaces(maxDecimalPlaces: Long) =
            maxDecimalPlaces(JsonField.of(maxDecimalPlaces))

        /** This indicates the maximum number of decimal places to use for this Currency. */
        fun maxDecimalPlaces(maxDecimalPlaces: JsonField<Long>) = apply {
            this.maxDecimalPlaces = maxDecimalPlaces
        }

        /** The name of the data entity. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name of the data entity. */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun roundingMode(roundingMode: RoundingMode) = roundingMode(JsonField.of(roundingMode))

        fun roundingMode(roundingMode: JsonField<RoundingMode>) = apply {
            this.roundingMode = roundingMode
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

        fun build(): CurrencyResponse =
            CurrencyResponse(
                checkRequired("id", id),
                checkRequired("version", version),
                archived,
                code,
                createdBy,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                maxDecimalPlaces,
                name,
                roundingMode,
                additionalProperties.toImmutable(),
            )
    }

    class RoundingMode @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val UP = of("UP")

            @JvmField val DOWN = of("DOWN")

            @JvmField val CEILING = of("CEILING")

            @JvmField val FLOOR = of("FLOOR")

            @JvmField val HALF_UP = of("HALF_UP")

            @JvmField val HALF_DOWN = of("HALF_DOWN")

            @JvmField val HALF_EVEN = of("HALF_EVEN")

            @JvmField val UNNECESSARY = of("UNNECESSARY")

            @JvmStatic fun of(value: String) = RoundingMode(JsonField.of(value))
        }

        /** An enum containing [RoundingMode]'s known values. */
        enum class Known {
            UP,
            DOWN,
            CEILING,
            FLOOR,
            HALF_UP,
            HALF_DOWN,
            HALF_EVEN,
            UNNECESSARY,
        }

        /**
         * An enum containing [RoundingMode]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RoundingMode] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UP,
            DOWN,
            CEILING,
            FLOOR,
            HALF_UP,
            HALF_DOWN,
            HALF_EVEN,
            UNNECESSARY,
            /**
             * An enum member indicating that [RoundingMode] was instantiated with an unknown value.
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
                UP -> Value.UP
                DOWN -> Value.DOWN
                CEILING -> Value.CEILING
                FLOOR -> Value.FLOOR
                HALF_UP -> Value.HALF_UP
                HALF_DOWN -> Value.HALF_DOWN
                HALF_EVEN -> Value.HALF_EVEN
                UNNECESSARY -> Value.UNNECESSARY
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
                UP -> Known.UP
                DOWN -> Known.DOWN
                CEILING -> Known.CEILING
                FLOOR -> Known.FLOOR
                HALF_UP -> Known.HALF_UP
                HALF_DOWN -> Known.HALF_DOWN
                HALF_EVEN -> Known.HALF_EVEN
                UNNECESSARY -> Known.UNNECESSARY
                else -> throw M3terInvalidDataException("Unknown RoundingMode: $value")
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

            return /* spotless:off */ other is RoundingMode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CurrencyResponse && id == other.id && version == other.version && archived == other.archived && code == other.code && createdBy == other.createdBy && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && maxDecimalPlaces == other.maxDecimalPlaces && name == other.name && roundingMode == other.roundingMode && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, archived, code, createdBy, dtCreated, dtLastModified, lastModifiedBy, maxDecimalPlaces, name, roundingMode, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CurrencyResponse{id=$id, version=$version, archived=$archived, code=$code, createdBy=$createdBy, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, maxDecimalPlaces=$maxDecimalPlaces, name=$name, roundingMode=$roundingMode, additionalProperties=$additionalProperties}"
}
