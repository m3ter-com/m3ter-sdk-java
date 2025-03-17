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
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class BalanceTransactionSummaryResponse
@JsonCreator
private constructor(
    @JsonProperty("initialCreditAmount")
    @ExcludeMissing
    private val initialCreditAmount: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("totalCreditAmount")
    @ExcludeMissing
    private val totalCreditAmount: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("totalDebitAmount")
    @ExcludeMissing
    private val totalDebitAmount: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun initialCreditAmount(): Optional<Double> =
        Optional.ofNullable(initialCreditAmount.getNullable("initialCreditAmount"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalCreditAmount(): Optional<Double> =
        Optional.ofNullable(totalCreditAmount.getNullable("totalCreditAmount"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalDebitAmount(): Optional<Double> =
        Optional.ofNullable(totalDebitAmount.getNullable("totalDebitAmount"))

    /**
     * Returns the raw JSON value of [initialCreditAmount].
     *
     * Unlike [initialCreditAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("initialCreditAmount")
    @ExcludeMissing
    fun _initialCreditAmount(): JsonField<Double> = initialCreditAmount

    /**
     * Returns the raw JSON value of [totalCreditAmount].
     *
     * Unlike [totalCreditAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("totalCreditAmount")
    @ExcludeMissing
    fun _totalCreditAmount(): JsonField<Double> = totalCreditAmount

    /**
     * Returns the raw JSON value of [totalDebitAmount].
     *
     * Unlike [totalDebitAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("totalDebitAmount")
    @ExcludeMissing
    fun _totalDebitAmount(): JsonField<Double> = totalDebitAmount

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BalanceTransactionSummaryResponse = apply {
        if (validated) {
            return@apply
        }

        initialCreditAmount()
        totalCreditAmount()
        totalDebitAmount()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BalanceTransactionSummaryResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceTransactionSummaryResponse]. */
    class Builder internal constructor() {

        private var initialCreditAmount: JsonField<Double> = JsonMissing.of()
        private var totalCreditAmount: JsonField<Double> = JsonMissing.of()
        private var totalDebitAmount: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(balanceTransactionSummaryResponse: BalanceTransactionSummaryResponse) =
            apply {
                initialCreditAmount = balanceTransactionSummaryResponse.initialCreditAmount
                totalCreditAmount = balanceTransactionSummaryResponse.totalCreditAmount
                totalDebitAmount = balanceTransactionSummaryResponse.totalDebitAmount
                additionalProperties =
                    balanceTransactionSummaryResponse.additionalProperties.toMutableMap()
            }

        fun initialCreditAmount(initialCreditAmount: Double) =
            initialCreditAmount(JsonField.of(initialCreditAmount))

        /**
         * Sets [Builder.initialCreditAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.initialCreditAmount] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun initialCreditAmount(initialCreditAmount: JsonField<Double>) = apply {
            this.initialCreditAmount = initialCreditAmount
        }

        fun totalCreditAmount(totalCreditAmount: Double) =
            totalCreditAmount(JsonField.of(totalCreditAmount))

        /**
         * Sets [Builder.totalCreditAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCreditAmount] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalCreditAmount(totalCreditAmount: JsonField<Double>) = apply {
            this.totalCreditAmount = totalCreditAmount
        }

        fun totalDebitAmount(totalDebitAmount: Double) =
            totalDebitAmount(JsonField.of(totalDebitAmount))

        /**
         * Sets [Builder.totalDebitAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalDebitAmount] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalDebitAmount(totalDebitAmount: JsonField<Double>) = apply {
            this.totalDebitAmount = totalDebitAmount
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
         * Returns an immutable instance of [BalanceTransactionSummaryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BalanceTransactionSummaryResponse =
            BalanceTransactionSummaryResponse(
                initialCreditAmount,
                totalCreditAmount,
                totalDebitAmount,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceTransactionSummaryResponse && initialCreditAmount == other.initialCreditAmount && totalCreditAmount == other.totalCreditAmount && totalDebitAmount == other.totalDebitAmount && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(initialCreditAmount, totalCreditAmount, totalDebitAmount, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BalanceTransactionSummaryResponse{initialCreditAmount=$initialCreditAmount, totalCreditAmount=$totalCreditAmount, totalDebitAmount=$totalDebitAmount, additionalProperties=$additionalProperties}"
}
