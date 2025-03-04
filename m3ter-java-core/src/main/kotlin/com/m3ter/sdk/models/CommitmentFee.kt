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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class CommitmentFee
@JsonCreator
private constructor(
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("date") @ExcludeMissing private val date: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("servicePeriodEndDate")
    @ExcludeMissing
    private val servicePeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("servicePeriodStartDate")
    @ExcludeMissing
    private val servicePeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun amount(): Double = amount.getRequired("amount")

    fun date(): LocalDate = date.getRequired("date")

    fun servicePeriodEndDate(): OffsetDateTime =
        servicePeriodEndDate.getRequired("servicePeriodEndDate")

    fun servicePeriodStartDate(): OffsetDateTime =
        servicePeriodStartDate.getRequired("servicePeriodStartDate")

    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

    @JsonProperty("servicePeriodEndDate")
    @ExcludeMissing
    fun _servicePeriodEndDate(): JsonField<OffsetDateTime> = servicePeriodEndDate

    @JsonProperty("servicePeriodStartDate")
    @ExcludeMissing
    fun _servicePeriodStartDate(): JsonField<OffsetDateTime> = servicePeriodStartDate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CommitmentFee = apply {
        if (validated) {
            return@apply
        }

        amount()
        date()
        servicePeriodEndDate()
        servicePeriodStartDate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CommitmentFee]. */
    class Builder internal constructor() {

        private var amount: JsonField<Double>? = null
        private var date: JsonField<LocalDate>? = null
        private var servicePeriodEndDate: JsonField<OffsetDateTime>? = null
        private var servicePeriodStartDate: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(commitmentFee: CommitmentFee) = apply {
            amount = commitmentFee.amount
            date = commitmentFee.date
            servicePeriodEndDate = commitmentFee.servicePeriodEndDate
            servicePeriodStartDate = commitmentFee.servicePeriodStartDate
            additionalProperties = commitmentFee.additionalProperties.toMutableMap()
        }

        fun amount(amount: Double) = amount(JsonField.of(amount))

        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        fun date(date: LocalDate) = date(JsonField.of(date))

        fun date(date: JsonField<LocalDate>) = apply { this.date = date }

        fun servicePeriodEndDate(servicePeriodEndDate: OffsetDateTime) =
            servicePeriodEndDate(JsonField.of(servicePeriodEndDate))

        fun servicePeriodEndDate(servicePeriodEndDate: JsonField<OffsetDateTime>) = apply {
            this.servicePeriodEndDate = servicePeriodEndDate
        }

        fun servicePeriodStartDate(servicePeriodStartDate: OffsetDateTime) =
            servicePeriodStartDate(JsonField.of(servicePeriodStartDate))

        fun servicePeriodStartDate(servicePeriodStartDate: JsonField<OffsetDateTime>) = apply {
            this.servicePeriodStartDate = servicePeriodStartDate
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

        fun build(): CommitmentFee =
            CommitmentFee(
                checkRequired("amount", amount),
                checkRequired("date", date),
                checkRequired("servicePeriodEndDate", servicePeriodEndDate),
                checkRequired("servicePeriodStartDate", servicePeriodStartDate),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CommitmentFee && amount == other.amount && date == other.date && servicePeriodEndDate == other.servicePeriodEndDate && servicePeriodStartDate == other.servicePeriodStartDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amount, date, servicePeriodEndDate, servicePeriodStartDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CommitmentFee{amount=$amount, date=$date, servicePeriodEndDate=$servicePeriodEndDate, servicePeriodStartDate=$servicePeriodStartDate, additionalProperties=$additionalProperties}"
}
