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

@NoAutoDetect
class PricingBand
@JsonCreator
private constructor(
    @JsonProperty("fixedPrice")
    @ExcludeMissing
    private val fixedPrice: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("lowerLimit")
    @ExcludeMissing
    private val lowerLimit: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("unitPrice")
    @ExcludeMissing
    private val unitPrice: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("creditTypeId")
    @ExcludeMissing
    private val creditTypeId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Fixed price charged for the Pricing band. */
    fun fixedPrice(): Double = fixedPrice.getRequired("fixedPrice")

    /** Lower limit for the Pricing band. */
    fun lowerLimit(): Double = lowerLimit.getRequired("lowerLimit")

    /** Unit price charged for the Pricing band. */
    fun unitPrice(): Double = unitPrice.getRequired("unitPrice")

    /** The ID for the Pricing band. */
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /** **OBSOLETE - this is deprecated and no longer used.** */
    fun creditTypeId(): Optional<String> =
        Optional.ofNullable(creditTypeId.getNullable("creditTypeId"))

    /** Fixed price charged for the Pricing band. */
    @JsonProperty("fixedPrice") @ExcludeMissing fun _fixedPrice(): JsonField<Double> = fixedPrice

    /** Lower limit for the Pricing band. */
    @JsonProperty("lowerLimit") @ExcludeMissing fun _lowerLimit(): JsonField<Double> = lowerLimit

    /** Unit price charged for the Pricing band. */
    @JsonProperty("unitPrice") @ExcludeMissing fun _unitPrice(): JsonField<Double> = unitPrice

    /** The ID for the Pricing band. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** **OBSOLETE - this is deprecated and no longer used.** */
    @JsonProperty("creditTypeId")
    @ExcludeMissing
    fun _creditTypeId(): JsonField<String> = creditTypeId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PricingBand = apply {
        if (validated) {
            return@apply
        }

        fixedPrice()
        lowerLimit()
        unitPrice()
        id()
        creditTypeId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PricingBand].
         *
         * The following fields are required:
         * ```java
         * .fixedPrice()
         * .lowerLimit()
         * .unitPrice()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PricingBand]. */
    class Builder internal constructor() {

        private var fixedPrice: JsonField<Double>? = null
        private var lowerLimit: JsonField<Double>? = null
        private var unitPrice: JsonField<Double>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var creditTypeId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(pricingBand: PricingBand) = apply {
            fixedPrice = pricingBand.fixedPrice
            lowerLimit = pricingBand.lowerLimit
            unitPrice = pricingBand.unitPrice
            id = pricingBand.id
            creditTypeId = pricingBand.creditTypeId
            additionalProperties = pricingBand.additionalProperties.toMutableMap()
        }

        /** Fixed price charged for the Pricing band. */
        fun fixedPrice(fixedPrice: Double) = fixedPrice(JsonField.of(fixedPrice))

        /** Fixed price charged for the Pricing band. */
        fun fixedPrice(fixedPrice: JsonField<Double>) = apply { this.fixedPrice = fixedPrice }

        /** Lower limit for the Pricing band. */
        fun lowerLimit(lowerLimit: Double) = lowerLimit(JsonField.of(lowerLimit))

        /** Lower limit for the Pricing band. */
        fun lowerLimit(lowerLimit: JsonField<Double>) = apply { this.lowerLimit = lowerLimit }

        /** Unit price charged for the Pricing band. */
        fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

        /** Unit price charged for the Pricing band. */
        fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

        /** The ID for the Pricing band. */
        fun id(id: String) = id(JsonField.of(id))

        /** The ID for the Pricing band. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** **OBSOLETE - this is deprecated and no longer used.** */
        fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

        /** **OBSOLETE - this is deprecated and no longer used.** */
        fun creditTypeId(creditTypeId: JsonField<String>) = apply {
            this.creditTypeId = creditTypeId
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

        fun build(): PricingBand =
            PricingBand(
                checkRequired("fixedPrice", fixedPrice),
                checkRequired("lowerLimit", lowerLimit),
                checkRequired("unitPrice", unitPrice),
                id,
                creditTypeId,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PricingBand && fixedPrice == other.fixedPrice && lowerLimit == other.lowerLimit && unitPrice == other.unitPrice && id == other.id && creditTypeId == other.creditTypeId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(fixedPrice, lowerLimit, unitPrice, id, creditTypeId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PricingBand{fixedPrice=$fixedPrice, lowerLimit=$lowerLimit, unitPrice=$unitPrice, id=$id, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
}
