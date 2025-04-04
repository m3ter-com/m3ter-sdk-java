// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.sdk.core.ExcludeMissing
import com.m3ter.sdk.core.JsonField
import com.m3ter.sdk.core.JsonMissing
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/**
 * An array of currency conversion rates from Bill currency to Organization currency. For example,
 * if Account is billed in GBP and Organization is set to USD, Bill line items are calculated in GBP
 * and then converted to USD using the defined rate.
 */
class CurrencyConversion
private constructor(
    private val from: JsonField<String>,
    private val to: JsonField<String>,
    private val multiplier: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
        @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
        @JsonProperty("multiplier") @ExcludeMissing multiplier: JsonField<Double> = JsonMissing.of(),
    ) : this(from, to, multiplier, mutableMapOf())

    /**
     * Currency to convert from. For example: GBP.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun from(): String = from.getRequired("from")

    /**
     * Currency to convert to. For example: USD.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): String = to.getRequired("to")

    /**
     * Conversion rate between currencies.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun multiplier(): Optional<Double> = multiplier.getOptional("multiplier")

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

    /**
     * Returns the raw JSON value of [multiplier].
     *
     * Unlike [multiplier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("multiplier") @ExcludeMissing fun _multiplier(): JsonField<Double> = multiplier

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
         * Returns a mutable builder for constructing an instance of [CurrencyConversion].
         *
         * The following fields are required:
         * ```java
         * .from()
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CurrencyConversion]. */
    class Builder internal constructor() {

        private var from: JsonField<String>? = null
        private var to: JsonField<String>? = null
        private var multiplier: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(currencyConversion: CurrencyConversion) = apply {
            from = currencyConversion.from
            to = currencyConversion.to
            multiplier = currencyConversion.multiplier
            additionalProperties = currencyConversion.additionalProperties.toMutableMap()
        }

        /** Currency to convert from. For example: GBP. */
        fun from(from: String) = from(JsonField.of(from))

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: JsonField<String>) = apply { this.from = from }

        /** Currency to convert to. For example: USD. */
        fun to(to: String) = to(JsonField.of(to))

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<String>) = apply { this.to = to }

        /** Conversion rate between currencies. */
        fun multiplier(multiplier: Double) = multiplier(JsonField.of(multiplier))

        /**
         * Sets [Builder.multiplier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.multiplier] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun multiplier(multiplier: JsonField<Double>) = apply { this.multiplier = multiplier }

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
         * Returns an immutable instance of [CurrencyConversion].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .from()
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CurrencyConversion =
            CurrencyConversion(
                checkRequired("from", from),
                checkRequired("to", to),
                multiplier,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CurrencyConversion = apply {
        if (validated) {
            return@apply
        }

        from()
        to()
        multiplier()
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
        (if (from.asKnown().isPresent) 1 else 0) +
            (if (to.asKnown().isPresent) 1 else 0) +
            (if (multiplier.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CurrencyConversion && from == other.from && to == other.to && multiplier == other.multiplier && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(from, to, multiplier, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CurrencyConversion{from=$from, to=$to, multiplier=$multiplier, additionalProperties=$additionalProperties}"
}
