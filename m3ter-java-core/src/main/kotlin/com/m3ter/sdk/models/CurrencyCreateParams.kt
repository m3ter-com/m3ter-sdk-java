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
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Creates a new Currency for the specified Organization.
 *
 * Used to create a Currency that your Organization will start to use.
 */
class CurrencyCreateParams
private constructor(
    private val orgId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /** The name of the entity. */
    fun name(): String = body.name()

    /**
     * A Boolean TRUE / FALSE flag indicating whether the entity is archived. An entity can be
     * archived if it is obsolete.
     * - TRUE - the entity is in the archived state.
     * - FALSE - the entity is not in the archived state.
     */
    fun archived(): Optional<Boolean> = body.archived()

    /** The short code for the entity. */
    fun code(): Optional<String> = body.code()

    /** Indicates the maximum number of decimal places to use for this Currency. */
    fun maxDecimalPlaces(): Optional<Long> = body.maxDecimalPlaces()

    fun roundingMode(): Optional<RoundingMode> = body.roundingMode()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun version(): Optional<Long> = body.version()

    /** The name of the entity. */
    fun _name(): JsonField<String> = body._name()

    /**
     * A Boolean TRUE / FALSE flag indicating whether the entity is archived. An entity can be
     * archived if it is obsolete.
     * - TRUE - the entity is in the archived state.
     * - FALSE - the entity is not in the archived state.
     */
    fun _archived(): JsonField<Boolean> = body._archived()

    /** The short code for the entity. */
    fun _code(): JsonField<String> = body._code()

    /** Indicates the maximum number of decimal places to use for this Currency. */
    fun _maxDecimalPlaces(): JsonField<Long> = body._maxDecimalPlaces()

    fun _roundingMode(): JsonField<RoundingMode> = body._roundingMode()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> orgId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("archived")
        @ExcludeMissing
        private val archived: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("code")
        @ExcludeMissing
        private val code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maxDecimalPlaces")
        @ExcludeMissing
        private val maxDecimalPlaces: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("roundingMode")
        @ExcludeMissing
        private val roundingMode: JsonField<RoundingMode> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The name of the entity. */
        fun name(): String = name.getRequired("name")

        /**
         * A Boolean TRUE / FALSE flag indicating whether the entity is archived. An entity can be
         * archived if it is obsolete.
         * - TRUE - the entity is in the archived state.
         * - FALSE - the entity is not in the archived state.
         */
        fun archived(): Optional<Boolean> = Optional.ofNullable(archived.getNullable("archived"))

        /** The short code for the entity. */
        fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

        /** Indicates the maximum number of decimal places to use for this Currency. */
        fun maxDecimalPlaces(): Optional<Long> =
            Optional.ofNullable(maxDecimalPlaces.getNullable("maxDecimalPlaces"))

        fun roundingMode(): Optional<RoundingMode> =
            Optional.ofNullable(roundingMode.getNullable("roundingMode"))

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /** The name of the entity. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * A Boolean TRUE / FALSE flag indicating whether the entity is archived. An entity can be
         * archived if it is obsolete.
         * - TRUE - the entity is in the archived state.
         * - FALSE - the entity is not in the archived state.
         */
        @JsonProperty("archived") @ExcludeMissing fun _archived(): JsonField<Boolean> = archived

        /** The short code for the entity. */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /** Indicates the maximum number of decimal places to use for this Currency. */
        @JsonProperty("maxDecimalPlaces")
        @ExcludeMissing
        fun _maxDecimalPlaces(): JsonField<Long> = maxDecimalPlaces

        @JsonProperty("roundingMode")
        @ExcludeMissing
        fun _roundingMode(): JsonField<RoundingMode> = roundingMode

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            archived()
            code()
            maxDecimalPlaces()
            roundingMode()
            version()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var archived: JsonField<Boolean> = JsonMissing.of()
            private var code: JsonField<String> = JsonMissing.of()
            private var maxDecimalPlaces: JsonField<Long> = JsonMissing.of()
            private var roundingMode: JsonField<RoundingMode> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                archived = body.archived
                code = body.code
                maxDecimalPlaces = body.maxDecimalPlaces
                roundingMode = body.roundingMode
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The name of the entity. */
            fun name(name: String) = name(JsonField.of(name))

            /** The name of the entity. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * A Boolean TRUE / FALSE flag indicating whether the entity is archived. An entity can
             * be archived if it is obsolete.
             * - TRUE - the entity is in the archived state.
             * - FALSE - the entity is not in the archived state.
             */
            fun archived(archived: Boolean) = archived(JsonField.of(archived))

            /**
             * A Boolean TRUE / FALSE flag indicating whether the entity is archived. An entity can
             * be archived if it is obsolete.
             * - TRUE - the entity is in the archived state.
             * - FALSE - the entity is not in the archived state.
             */
            fun archived(archived: JsonField<Boolean>) = apply { this.archived = archived }

            /** The short code for the entity. */
            fun code(code: String) = code(JsonField.of(code))

            /** The short code for the entity. */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** Indicates the maximum number of decimal places to use for this Currency. */
            fun maxDecimalPlaces(maxDecimalPlaces: Long) =
                maxDecimalPlaces(JsonField.of(maxDecimalPlaces))

            /** Indicates the maximum number of decimal places to use for this Currency. */
            fun maxDecimalPlaces(maxDecimalPlaces: JsonField<Long>) = apply {
                this.maxDecimalPlaces = maxDecimalPlaces
            }

            fun roundingMode(roundingMode: RoundingMode) = roundingMode(JsonField.of(roundingMode))

            fun roundingMode(roundingMode: JsonField<RoundingMode>) = apply {
                this.roundingMode = roundingMode
            }

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
             * The version number of the entity:
             * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
             *   Create_. On initial Create, version is set at 1 and listed in the response.
             * - **Update Entity:** On Update, version is required and must match the existing
             *   version because a check is performed to ensure sequential versioning is preserved.
             *   Version is incremented by 1 and listed in the response.
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

            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    archived,
                    code,
                    maxDecimalPlaces,
                    roundingMode,
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && name == other.name && archived == other.archived && code == other.code && maxDecimalPlaces == other.maxDecimalPlaces && roundingMode == other.roundingMode && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, archived, code, maxDecimalPlaces, roundingMode, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, archived=$archived, code=$code, maxDecimalPlaces=$maxDecimalPlaces, roundingMode=$roundingMode, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CurrencyCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(currencyCreateParams: CurrencyCreateParams) = apply {
            orgId = currencyCreateParams.orgId
            body = currencyCreateParams.body.toBuilder()
            additionalHeaders = currencyCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = currencyCreateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /** The name of the entity. */
        fun name(name: String) = apply { body.name(name) }

        /** The name of the entity. */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * A Boolean TRUE / FALSE flag indicating whether the entity is archived. An entity can be
         * archived if it is obsolete.
         * - TRUE - the entity is in the archived state.
         * - FALSE - the entity is not in the archived state.
         */
        fun archived(archived: Boolean) = apply { body.archived(archived) }

        /**
         * A Boolean TRUE / FALSE flag indicating whether the entity is archived. An entity can be
         * archived if it is obsolete.
         * - TRUE - the entity is in the archived state.
         * - FALSE - the entity is not in the archived state.
         */
        fun archived(archived: JsonField<Boolean>) = apply { body.archived(archived) }

        /** The short code for the entity. */
        fun code(code: String) = apply { body.code(code) }

        /** The short code for the entity. */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /** Indicates the maximum number of decimal places to use for this Currency. */
        fun maxDecimalPlaces(maxDecimalPlaces: Long) = apply {
            body.maxDecimalPlaces(maxDecimalPlaces)
        }

        /** Indicates the maximum number of decimal places to use for this Currency. */
        fun maxDecimalPlaces(maxDecimalPlaces: JsonField<Long>) = apply {
            body.maxDecimalPlaces(maxDecimalPlaces)
        }

        fun roundingMode(roundingMode: RoundingMode) = apply { body.roundingMode(roundingMode) }

        fun roundingMode(roundingMode: JsonField<RoundingMode>) = apply {
            body.roundingMode(roundingMode)
        }

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
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
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

        fun build(): CurrencyCreateParams =
            CurrencyCreateParams(
                checkRequired("orgId", orgId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
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

        return /* spotless:off */ other is CurrencyCreateParams && orgId == other.orgId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CurrencyCreateParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
