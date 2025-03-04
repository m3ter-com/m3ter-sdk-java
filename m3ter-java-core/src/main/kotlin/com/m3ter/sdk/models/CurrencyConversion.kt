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
import com.m3ter.sdk.core.NoAutoDetect
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import java.util.Objects
import java.util.Optional

/**
 * An array of currency conversion rates from Bill currency to Organization currency. For example,
 * if Account is billed in GBP and Organization is set to USD, Bill line items are calculated in GBP
 * and then converted to USD using the defined rate.
 */
@NoAutoDetect
class CurrencyConversion
@JsonCreator
private constructor(
    @JsonProperty("from") @ExcludeMissing private val from: JsonField<String> = JsonMissing.of(),
    @JsonProperty("to") @ExcludeMissing private val to: JsonField<String> = JsonMissing.of(),
    @JsonProperty("multiplier")
    @ExcludeMissing
    private val multiplier: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Currency to convert from. For example: GBP. */
    fun from(): String = from.getRequired("from")

    /** Currency to convert to. For example: USD. */
    fun to(): String = to.getRequired("to")

    /** Conversion rate between currencies. */
    fun multiplier(): Optional<Double> = Optional.ofNullable(multiplier.getNullable("multiplier"))

    /** Currency to convert from. For example: GBP. */
    @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

    /** Currency to convert to. For example: USD. */
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

    /** Conversion rate between currencies. */
    @JsonProperty("multiplier") @ExcludeMissing fun _multiplier(): JsonField<Double> = multiplier

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        /** Currency to convert from. For example: GBP. */
        fun from(from: JsonField<String>) = apply { this.from = from }

        /** Currency to convert to. For example: USD. */
        fun to(to: String) = to(JsonField.of(to))

        /** Currency to convert to. For example: USD. */
        fun to(to: JsonField<String>) = apply { this.to = to }

        /** Conversion rate between currencies. */
        fun multiplier(multiplier: Double) = multiplier(JsonField.of(multiplier))

        /** Conversion rate between currencies. */
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

        fun build(): CurrencyConversion =
            CurrencyConversion(
                checkRequired("from", from),
                checkRequired("to", to),
                multiplier,
                additionalProperties.toImmutable(),
            )
    }

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
