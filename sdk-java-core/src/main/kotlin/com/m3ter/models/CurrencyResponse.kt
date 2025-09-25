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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CurrencyResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val archived: JsonField<Boolean>,
    private val code: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val lastModifiedBy: JsonField<String>,
    private val maxDecimalPlaces: JsonField<Int>,
    private val name: JsonField<String>,
    private val roundingMode: JsonField<RoundingMode>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("archived") @ExcludeMissing archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maxDecimalPlaces")
        @ExcludeMissing
        maxDecimalPlaces: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("roundingMode")
        @ExcludeMissing
        roundingMode: JsonField<RoundingMode> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        archived,
        code,
        createdBy,
        dtCreated,
        dtLastModified,
        lastModifiedBy,
        maxDecimalPlaces,
        name,
        roundingMode,
        version,
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
     * TRUE / FALSE flag indicating whether the data entity is archived. An entity can be archived
     * if it is obsolete.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archived(): Optional<Boolean> = archived.getOptional("archived")

    /**
     * The short code of the data entity.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<String> = code.getOptional("code")

    /**
     * The unique identifier (UUID) of the user who created this Currency.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * The date and time *(in ISO-8601 format)* when the Currency was created.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The date and time *(in ISO-8601 format)* when the Currency was last modified.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * The unique identifier (UUID) of the user who last modified this Currency.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * This indicates the maximum number of decimal places to use for this Currency.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxDecimalPlaces(): Optional<Int> = maxDecimalPlaces.getOptional("maxDecimalPlaces")

    /**
     * The name of the data entity.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun roundingMode(): Optional<RoundingMode> = roundingMode.getOptional("roundingMode")

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
     * Returns the raw JSON value of [archived].
     *
     * Unlike [archived], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

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
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Returns the raw JSON value of [maxDecimalPlaces].
     *
     * Unlike [maxDecimalPlaces], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxDecimalPlaces")
    @ExcludeMissing
    fun _maxDecimalPlaces(): JsonField<Int> = maxDecimalPlaces

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [roundingMode].
     *
     * Unlike [roundingMode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("roundingMode")
    @ExcludeMissing
    fun _roundingMode(): JsonField<RoundingMode> = roundingMode

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
         * Returns a mutable builder for constructing an instance of [CurrencyResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CurrencyResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var archived: JsonField<Boolean> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var maxDecimalPlaces: JsonField<Int> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var roundingMode: JsonField<RoundingMode> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(currencyResponse: CurrencyResponse) = apply {
            id = currencyResponse.id
            archived = currencyResponse.archived
            code = currencyResponse.code
            createdBy = currencyResponse.createdBy
            dtCreated = currencyResponse.dtCreated
            dtLastModified = currencyResponse.dtLastModified
            lastModifiedBy = currencyResponse.lastModifiedBy
            maxDecimalPlaces = currencyResponse.maxDecimalPlaces
            name = currencyResponse.name
            roundingMode = currencyResponse.roundingMode
            version = currencyResponse.version
            additionalProperties = currencyResponse.additionalProperties.toMutableMap()
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
         * TRUE / FALSE flag indicating whether the data entity is archived. An entity can be
         * archived if it is obsolete.
         */
        fun archived(archived: Boolean) = archived(JsonField.of(archived))

        /**
         * Sets [Builder.archived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archived] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

        /** The short code of the data entity. */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** The unique identifier (UUID) of the user who created this Currency. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The date and time *(in ISO-8601 format)* when the Currency was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The date and time *(in ISO-8601 format)* when the Currency was last modified. */
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

        /** The unique identifier (UUID) of the user who last modified this Currency. */
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

        /** This indicates the maximum number of decimal places to use for this Currency. */
        fun maxDecimalPlaces(maxDecimalPlaces: Int) =
            maxDecimalPlaces(JsonField.of(maxDecimalPlaces))

        /**
         * Sets [Builder.maxDecimalPlaces] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxDecimalPlaces] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxDecimalPlaces(maxDecimalPlaces: JsonField<Int>) = apply {
            this.maxDecimalPlaces = maxDecimalPlaces
        }

        /** The name of the data entity. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun roundingMode(roundingMode: RoundingMode) = roundingMode(JsonField.of(roundingMode))

        /**
         * Sets [Builder.roundingMode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roundingMode] with a well-typed [RoundingMode] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun roundingMode(roundingMode: JsonField<RoundingMode>) = apply {
            this.roundingMode = roundingMode
        }

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
         * Returns an immutable instance of [CurrencyResponse].
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
        fun build(): CurrencyResponse =
            CurrencyResponse(
                checkRequired("id", id),
                archived,
                code,
                createdBy,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                maxDecimalPlaces,
                name,
                roundingMode,
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CurrencyResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        archived()
        code()
        createdBy()
        dtCreated()
        dtLastModified()
        lastModifiedBy()
        maxDecimalPlaces()
        name()
        roundingMode().ifPresent { it.validate() }
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
            (if (archived.asKnown().isPresent) 1 else 0) +
            (if (code.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (if (maxDecimalPlaces.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (roundingMode.asKnown().getOrNull()?.validity() ?: 0) +
            (if (version.asKnown().isPresent) 1 else 0)

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

        private var validated: Boolean = false

        fun validate(): RoundingMode = apply {
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

            return other is RoundingMode && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CurrencyResponse &&
            id == other.id &&
            archived == other.archived &&
            code == other.code &&
            createdBy == other.createdBy &&
            dtCreated == other.dtCreated &&
            dtLastModified == other.dtLastModified &&
            lastModifiedBy == other.lastModifiedBy &&
            maxDecimalPlaces == other.maxDecimalPlaces &&
            name == other.name &&
            roundingMode == other.roundingMode &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            archived,
            code,
            createdBy,
            dtCreated,
            dtLastModified,
            lastModifiedBy,
            maxDecimalPlaces,
            name,
            roundingMode,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CurrencyResponse{id=$id, archived=$archived, code=$code, createdBy=$createdBy, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, maxDecimalPlaces=$maxDecimalPlaces, name=$name, roundingMode=$roundingMode, version=$version, additionalProperties=$additionalProperties}"
}
