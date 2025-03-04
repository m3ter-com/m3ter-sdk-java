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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class DebitLineItem
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("productId")
    @ExcludeMissing
    private val productId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("referencedBillId")
    @ExcludeMissing
    private val referencedBillId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("referencedLineItemId")
    @ExcludeMissing
    private val referencedLineItemId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("servicePeriodEndDate")
    @ExcludeMissing
    private val servicePeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("servicePeriodStartDate")
    @ExcludeMissing
    private val servicePeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("debitReasonId")
    @ExcludeMissing
    private val debitReasonId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The UUID of the entity. */
    fun id(): String = id.getRequired("id")

    /** The amount for the line item. */
    fun amount(): Double = amount.getRequired("amount")

    /** The description of the line item. */
    fun description(): String = description.getRequired("description")

    /** The UUID of the Product. */
    fun productId(): String = productId.getRequired("productId")

    /** The UUID of the bill for the line item. */
    fun referencedBillId(): String = referencedBillId.getRequired("referencedBillId")

    /** The UUID of the line item. */
    fun referencedLineItemId(): String = referencedLineItemId.getRequired("referencedLineItemId")

    /** The service period end date in ISO-8601 format. _(exclusive of the ending date)_. */
    fun servicePeriodEndDate(): OffsetDateTime =
        servicePeriodEndDate.getRequired("servicePeriodEndDate")

    /** The service period start date in ISO-8601 format. _(inclusive of the starting date)_. */
    fun servicePeriodStartDate(): OffsetDateTime =
        servicePeriodStartDate.getRequired("servicePeriodStartDate")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    fun version(): Long = version.getRequired("version")

    /** The id of the user who created this debit line item. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** The UUID of the debit reason for this debit line item. */
    fun debitReasonId(): Optional<String> =
        Optional.ofNullable(debitReasonId.getNullable("debitReasonId"))

    /** The DateTime when the debit line item was created _(in ISO-8601 format)_. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The DateTime when the debit line item was last modified _(in ISO-8601 format)_. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The id of the user who last modified this debit line item. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The amount for the line item. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

    /** The description of the line item. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** The UUID of the Product. */
    @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /** The UUID of the bill for the line item. */
    @JsonProperty("referencedBillId")
    @ExcludeMissing
    fun _referencedBillId(): JsonField<String> = referencedBillId

    /** The UUID of the line item. */
    @JsonProperty("referencedLineItemId")
    @ExcludeMissing
    fun _referencedLineItemId(): JsonField<String> = referencedLineItemId

    /** The service period end date in ISO-8601 format. _(exclusive of the ending date)_. */
    @JsonProperty("servicePeriodEndDate")
    @ExcludeMissing
    fun _servicePeriodEndDate(): JsonField<OffsetDateTime> = servicePeriodEndDate

    /** The service period start date in ISO-8601 format. _(inclusive of the starting date)_. */
    @JsonProperty("servicePeriodStartDate")
    @ExcludeMissing
    fun _servicePeriodStartDate(): JsonField<OffsetDateTime> = servicePeriodStartDate

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /** The id of the user who created this debit line item. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** The UUID of the debit reason for this debit line item. */
    @JsonProperty("debitReasonId")
    @ExcludeMissing
    fun _debitReasonId(): JsonField<String> = debitReasonId

    /** The DateTime when the debit line item was created _(in ISO-8601 format)_. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The DateTime when the debit line item was last modified _(in ISO-8601 format)_. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** The id of the user who last modified this debit line item. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DebitLineItem = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        description()
        productId()
        referencedBillId()
        referencedLineItemId()
        servicePeriodEndDate()
        servicePeriodStartDate()
        version()
        createdBy()
        debitReasonId()
        dtCreated()
        dtLastModified()
        lastModifiedBy()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DebitLineItem].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .amount()
         * .description()
         * .productId()
         * .referencedBillId()
         * .referencedLineItemId()
         * .servicePeriodEndDate()
         * .servicePeriodStartDate()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DebitLineItem]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Double>? = null
        private var description: JsonField<String>? = null
        private var productId: JsonField<String>? = null
        private var referencedBillId: JsonField<String>? = null
        private var referencedLineItemId: JsonField<String>? = null
        private var servicePeriodEndDate: JsonField<OffsetDateTime>? = null
        private var servicePeriodStartDate: JsonField<OffsetDateTime>? = null
        private var version: JsonField<Long>? = null
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var debitReasonId: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(debitLineItem: DebitLineItem) = apply {
            id = debitLineItem.id
            amount = debitLineItem.amount
            description = debitLineItem.description
            productId = debitLineItem.productId
            referencedBillId = debitLineItem.referencedBillId
            referencedLineItemId = debitLineItem.referencedLineItemId
            servicePeriodEndDate = debitLineItem.servicePeriodEndDate
            servicePeriodStartDate = debitLineItem.servicePeriodStartDate
            version = debitLineItem.version
            createdBy = debitLineItem.createdBy
            debitReasonId = debitLineItem.debitReasonId
            dtCreated = debitLineItem.dtCreated
            dtLastModified = debitLineItem.dtLastModified
            lastModifiedBy = debitLineItem.lastModifiedBy
            additionalProperties = debitLineItem.additionalProperties.toMutableMap()
        }

        /** The UUID of the entity. */
        fun id(id: String) = id(JsonField.of(id))

        /** The UUID of the entity. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The amount for the line item. */
        fun amount(amount: Double) = amount(JsonField.of(amount))

        /** The amount for the line item. */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        /** The description of the line item. */
        fun description(description: String) = description(JsonField.of(description))

        /** The description of the line item. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The UUID of the Product. */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /** The UUID of the Product. */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /** The UUID of the bill for the line item. */
        fun referencedBillId(referencedBillId: String) =
            referencedBillId(JsonField.of(referencedBillId))

        /** The UUID of the bill for the line item. */
        fun referencedBillId(referencedBillId: JsonField<String>) = apply {
            this.referencedBillId = referencedBillId
        }

        /** The UUID of the line item. */
        fun referencedLineItemId(referencedLineItemId: String) =
            referencedLineItemId(JsonField.of(referencedLineItemId))

        /** The UUID of the line item. */
        fun referencedLineItemId(referencedLineItemId: JsonField<String>) = apply {
            this.referencedLineItemId = referencedLineItemId
        }

        /** The service period end date in ISO-8601 format. _(exclusive of the ending date)_. */
        fun servicePeriodEndDate(servicePeriodEndDate: OffsetDateTime) =
            servicePeriodEndDate(JsonField.of(servicePeriodEndDate))

        /** The service period end date in ISO-8601 format. _(exclusive of the ending date)_. */
        fun servicePeriodEndDate(servicePeriodEndDate: JsonField<OffsetDateTime>) = apply {
            this.servicePeriodEndDate = servicePeriodEndDate
        }

        /** The service period start date in ISO-8601 format. _(inclusive of the starting date)_. */
        fun servicePeriodStartDate(servicePeriodStartDate: OffsetDateTime) =
            servicePeriodStartDate(JsonField.of(servicePeriodStartDate))

        /** The service period start date in ISO-8601 format. _(inclusive of the starting date)_. */
        fun servicePeriodStartDate(servicePeriodStartDate: JsonField<OffsetDateTime>) = apply {
            this.servicePeriodStartDate = servicePeriodStartDate
        }

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

        /** The id of the user who created this debit line item. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The id of the user who created this debit line item. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The UUID of the debit reason for this debit line item. */
        fun debitReasonId(debitReasonId: String) = debitReasonId(JsonField.of(debitReasonId))

        /** The UUID of the debit reason for this debit line item. */
        fun debitReasonId(debitReasonId: JsonField<String>) = apply {
            this.debitReasonId = debitReasonId
        }

        /** The DateTime when the debit line item was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The DateTime when the debit line item was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when the debit line item was last modified _(in ISO-8601 format)_. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The DateTime when the debit line item was last modified _(in ISO-8601 format)_. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The id of the user who last modified this debit line item. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The id of the user who last modified this debit line item. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
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

        fun build(): DebitLineItem =
            DebitLineItem(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("description", description),
                checkRequired("productId", productId),
                checkRequired("referencedBillId", referencedBillId),
                checkRequired("referencedLineItemId", referencedLineItemId),
                checkRequired("servicePeriodEndDate", servicePeriodEndDate),
                checkRequired("servicePeriodStartDate", servicePeriodStartDate),
                checkRequired("version", version),
                createdBy,
                debitReasonId,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DebitLineItem && id == other.id && amount == other.amount && description == other.description && productId == other.productId && referencedBillId == other.referencedBillId && referencedLineItemId == other.referencedLineItemId && servicePeriodEndDate == other.servicePeriodEndDate && servicePeriodStartDate == other.servicePeriodStartDate && version == other.version && createdBy == other.createdBy && debitReasonId == other.debitReasonId && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amount, description, productId, referencedBillId, referencedLineItemId, servicePeriodEndDate, servicePeriodStartDate, version, createdBy, debitReasonId, dtCreated, dtLastModified, lastModifiedBy, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DebitLineItem{id=$id, amount=$amount, description=$description, productId=$productId, referencedBillId=$referencedBillId, referencedLineItemId=$referencedLineItemId, servicePeriodEndDate=$servicePeriodEndDate, servicePeriodStartDate=$servicePeriodStartDate, version=$version, createdBy=$createdBy, debitReasonId=$debitReasonId, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, additionalProperties=$additionalProperties}"
}
