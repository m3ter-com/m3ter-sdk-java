// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.core.ExcludeMissing
import com.m3ter.core.JsonField
import com.m3ter.core.JsonMissing
import com.m3ter.core.JsonValue
import com.m3ter.core.checkRequired
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class PricingBand
private constructor(
    private val fixedPrice: JsonField<Double>,
    private val lowerLimit: JsonField<Double>,
    private val unitPrice: JsonField<Double>,
    private val id: JsonField<String>,
    private val creditTypeId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("fixedPrice")
        @ExcludeMissing
        fixedPrice: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("lowerLimit")
        @ExcludeMissing
        lowerLimit: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("unitPrice") @ExcludeMissing unitPrice: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("creditTypeId")
        @ExcludeMissing
        creditTypeId: JsonField<String> = JsonMissing.of(),
    ) : this(fixedPrice, lowerLimit, unitPrice, id, creditTypeId, mutableMapOf())

    /**
     * Fixed price charged for the Pricing band.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fixedPrice(): Double = fixedPrice.getRequired("fixedPrice")

    /**
     * Lower limit for the Pricing band.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lowerLimit(): Double = lowerLimit.getRequired("lowerLimit")

    /**
     * Unit price charged for the Pricing band.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun unitPrice(): Double = unitPrice.getRequired("unitPrice")

    /**
     * The ID for the Pricing band.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * **OBSOLETE - this is deprecated and no longer used.**
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun creditTypeId(): Optional<String> = creditTypeId.getOptional("creditTypeId")

    /**
     * Returns the raw JSON value of [fixedPrice].
     *
     * Unlike [fixedPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fixedPrice") @ExcludeMissing fun _fixedPrice(): JsonField<Double> = fixedPrice

    /**
     * Returns the raw JSON value of [lowerLimit].
     *
     * Unlike [lowerLimit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lowerLimit") @ExcludeMissing fun _lowerLimit(): JsonField<Double> = lowerLimit

    /**
     * Returns the raw JSON value of [unitPrice].
     *
     * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unitPrice") @ExcludeMissing fun _unitPrice(): JsonField<Double> = unitPrice

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [creditTypeId].
     *
     * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("creditTypeId")
    @ExcludeMissing
    fun _creditTypeId(): JsonField<String> = creditTypeId

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

        /**
         * Sets [Builder.fixedPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fixedPrice] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fixedPrice(fixedPrice: JsonField<Double>) = apply { this.fixedPrice = fixedPrice }

        /** Lower limit for the Pricing band. */
        fun lowerLimit(lowerLimit: Double) = lowerLimit(JsonField.of(lowerLimit))

        /**
         * Sets [Builder.lowerLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lowerLimit] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lowerLimit(lowerLimit: JsonField<Double>) = apply { this.lowerLimit = lowerLimit }

        /** Unit price charged for the Pricing band. */
        fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

        /**
         * Sets [Builder.unitPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unitPrice] with a well-typed [Double] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

        /** The ID for the Pricing band. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** **OBSOLETE - this is deprecated and no longer used.** */
        fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

        /**
         * Sets [Builder.creditTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditTypeId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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

        /**
         * Returns an immutable instance of [PricingBand].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fixedPrice()
         * .lowerLimit()
         * .unitPrice()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PricingBand =
            PricingBand(
                checkRequired("fixedPrice", fixedPrice),
                checkRequired("lowerLimit", lowerLimit),
                checkRequired("unitPrice", unitPrice),
                id,
                creditTypeId,
                additionalProperties.toMutableMap(),
            )
    }

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
        (if (fixedPrice.asKnown().isPresent) 1 else 0) +
            (if (lowerLimit.asKnown().isPresent) 1 else 0) +
            (if (unitPrice.asKnown().isPresent) 1 else 0) +
            (if (id.asKnown().isPresent) 1 else 0) +
            (if (creditTypeId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PricingBand &&
            fixedPrice == other.fixedPrice &&
            lowerLimit == other.lowerLimit &&
            unitPrice == other.unitPrice &&
            id == other.id &&
            creditTypeId == other.creditTypeId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(fixedPrice, lowerLimit, unitPrice, id, creditTypeId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PricingBand{fixedPrice=$fixedPrice, lowerLimit=$lowerLimit, unitPrice=$unitPrice, id=$id, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
}
