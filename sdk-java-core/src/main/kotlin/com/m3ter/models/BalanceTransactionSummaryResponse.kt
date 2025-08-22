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
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

class BalanceTransactionSummaryResponse
private constructor(
    private val balanceConsumed: JsonField<Double>,
    private val expiredBalanceAmount: JsonField<Double>,
    private val initialCreditAmount: JsonField<Double>,
    private val rolloverConsumed: JsonField<Double>,
    private val totalCreditAmount: JsonField<Double>,
    private val totalDebitAmount: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("balanceConsumed")
        @ExcludeMissing
        balanceConsumed: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("expiredBalanceAmount")
        @ExcludeMissing
        expiredBalanceAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("initialCreditAmount")
        @ExcludeMissing
        initialCreditAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("rolloverConsumed")
        @ExcludeMissing
        rolloverConsumed: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("totalCreditAmount")
        @ExcludeMissing
        totalCreditAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("totalDebitAmount")
        @ExcludeMissing
        totalDebitAmount: JsonField<Double> = JsonMissing.of(),
    ) : this(
        balanceConsumed,
        expiredBalanceAmount,
        initialCreditAmount,
        rolloverConsumed,
        totalCreditAmount,
        totalDebitAmount,
        mutableMapOf(),
    )

    /**
     * Amount consumed from the original balance
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun balanceConsumed(): Optional<Double> = balanceConsumed.getOptional("balanceConsumed")

    /**
     * Amount of the balance that expired without being used
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiredBalanceAmount(): Optional<Double> =
        expiredBalanceAmount.getOptional("expiredBalanceAmount")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun initialCreditAmount(): Optional<Double> =
        initialCreditAmount.getOptional("initialCreditAmount")

    /**
     * Amount consumed from rollover credit
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rolloverConsumed(): Optional<Double> = rolloverConsumed.getOptional("rolloverConsumed")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalCreditAmount(): Optional<Double> = totalCreditAmount.getOptional("totalCreditAmount")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalDebitAmount(): Optional<Double> = totalDebitAmount.getOptional("totalDebitAmount")

    /**
     * Returns the raw JSON value of [balanceConsumed].
     *
     * Unlike [balanceConsumed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("balanceConsumed")
    @ExcludeMissing
    fun _balanceConsumed(): JsonField<Double> = balanceConsumed

    /**
     * Returns the raw JSON value of [expiredBalanceAmount].
     *
     * Unlike [expiredBalanceAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("expiredBalanceAmount")
    @ExcludeMissing
    fun _expiredBalanceAmount(): JsonField<Double> = expiredBalanceAmount

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
     * Returns the raw JSON value of [rolloverConsumed].
     *
     * Unlike [rolloverConsumed], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("rolloverConsumed")
    @ExcludeMissing
    fun _rolloverConsumed(): JsonField<Double> = rolloverConsumed

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
         * Returns a mutable builder for constructing an instance of
         * [BalanceTransactionSummaryResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceTransactionSummaryResponse]. */
    class Builder internal constructor() {

        private var balanceConsumed: JsonField<Double> = JsonMissing.of()
        private var expiredBalanceAmount: JsonField<Double> = JsonMissing.of()
        private var initialCreditAmount: JsonField<Double> = JsonMissing.of()
        private var rolloverConsumed: JsonField<Double> = JsonMissing.of()
        private var totalCreditAmount: JsonField<Double> = JsonMissing.of()
        private var totalDebitAmount: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(balanceTransactionSummaryResponse: BalanceTransactionSummaryResponse) =
            apply {
                balanceConsumed = balanceTransactionSummaryResponse.balanceConsumed
                expiredBalanceAmount = balanceTransactionSummaryResponse.expiredBalanceAmount
                initialCreditAmount = balanceTransactionSummaryResponse.initialCreditAmount
                rolloverConsumed = balanceTransactionSummaryResponse.rolloverConsumed
                totalCreditAmount = balanceTransactionSummaryResponse.totalCreditAmount
                totalDebitAmount = balanceTransactionSummaryResponse.totalDebitAmount
                additionalProperties =
                    balanceTransactionSummaryResponse.additionalProperties.toMutableMap()
            }

        /** Amount consumed from the original balance */
        fun balanceConsumed(balanceConsumed: Double) =
            balanceConsumed(JsonField.of(balanceConsumed))

        /**
         * Sets [Builder.balanceConsumed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balanceConsumed] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun balanceConsumed(balanceConsumed: JsonField<Double>) = apply {
            this.balanceConsumed = balanceConsumed
        }

        /** Amount of the balance that expired without being used */
        fun expiredBalanceAmount(expiredBalanceAmount: Double) =
            expiredBalanceAmount(JsonField.of(expiredBalanceAmount))

        /**
         * Sets [Builder.expiredBalanceAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiredBalanceAmount] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiredBalanceAmount(expiredBalanceAmount: JsonField<Double>) = apply {
            this.expiredBalanceAmount = expiredBalanceAmount
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

        /** Amount consumed from rollover credit */
        fun rolloverConsumed(rolloverConsumed: Double) =
            rolloverConsumed(JsonField.of(rolloverConsumed))

        /**
         * Sets [Builder.rolloverConsumed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rolloverConsumed] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rolloverConsumed(rolloverConsumed: JsonField<Double>) = apply {
            this.rolloverConsumed = rolloverConsumed
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
         * Returns an immutable instance of [BalanceTransactionSummaryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BalanceTransactionSummaryResponse =
            BalanceTransactionSummaryResponse(
                balanceConsumed,
                expiredBalanceAmount,
                initialCreditAmount,
                rolloverConsumed,
                totalCreditAmount,
                totalDebitAmount,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BalanceTransactionSummaryResponse = apply {
        if (validated) {
            return@apply
        }

        balanceConsumed()
        expiredBalanceAmount()
        initialCreditAmount()
        rolloverConsumed()
        totalCreditAmount()
        totalDebitAmount()
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
        (if (balanceConsumed.asKnown().isPresent) 1 else 0) +
            (if (expiredBalanceAmount.asKnown().isPresent) 1 else 0) +
            (if (initialCreditAmount.asKnown().isPresent) 1 else 0) +
            (if (rolloverConsumed.asKnown().isPresent) 1 else 0) +
            (if (totalCreditAmount.asKnown().isPresent) 1 else 0) +
            (if (totalDebitAmount.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceTransactionSummaryResponse &&
            balanceConsumed == other.balanceConsumed &&
            expiredBalanceAmount == other.expiredBalanceAmount &&
            initialCreditAmount == other.initialCreditAmount &&
            rolloverConsumed == other.rolloverConsumed &&
            totalCreditAmount == other.totalCreditAmount &&
            totalDebitAmount == other.totalDebitAmount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            balanceConsumed,
            expiredBalanceAmount,
            initialCreditAmount,
            rolloverConsumed,
            totalCreditAmount,
            totalDebitAmount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BalanceTransactionSummaryResponse{balanceConsumed=$balanceConsumed, expiredBalanceAmount=$expiredBalanceAmount, initialCreditAmount=$initialCreditAmount, rolloverConsumed=$rolloverConsumed, totalCreditAmount=$totalCreditAmount, totalDebitAmount=$totalDebitAmount, additionalProperties=$additionalProperties}"
}
