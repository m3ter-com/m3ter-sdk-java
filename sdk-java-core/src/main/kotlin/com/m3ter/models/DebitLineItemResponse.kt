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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

class DebitLineItemResponse
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Double>,
    private val description: JsonField<String>,
    private val productId: JsonField<String>,
    private val referencedBillId: JsonField<String>,
    private val referencedLineItemId: JsonField<String>,
    private val servicePeriodEndDate: JsonField<OffsetDateTime>,
    private val servicePeriodStartDate: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val debitReasonId: JsonField<String>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val lastModifiedBy: JsonField<String>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("productId") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referencedBillId")
        @ExcludeMissing
        referencedBillId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("referencedLineItemId")
        @ExcludeMissing
        referencedLineItemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("servicePeriodEndDate")
        @ExcludeMissing
        servicePeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("servicePeriodStartDate")
        @ExcludeMissing
        servicePeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("debitReasonId")
        @ExcludeMissing
        debitReasonId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        amount,
        description,
        productId,
        referencedBillId,
        referencedLineItemId,
        servicePeriodEndDate,
        servicePeriodStartDate,
        createdBy,
        debitReasonId,
        dtCreated,
        dtLastModified,
        lastModifiedBy,
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
     * The amount for the line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Double = amount.getRequired("amount")

    /**
     * The description of the line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun description(): String = description.getRequired("description")

    /**
     * The UUID of the Product.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productId(): String = productId.getRequired("productId")

    /**
     * The UUID of the bill for the line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referencedBillId(): String = referencedBillId.getRequired("referencedBillId")

    /**
     * The UUID of the line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun referencedLineItemId(): String = referencedLineItemId.getRequired("referencedLineItemId")

    /**
     * The service period end date in ISO-8601 format. *(exclusive of the ending date)*.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun servicePeriodEndDate(): OffsetDateTime =
        servicePeriodEndDate.getRequired("servicePeriodEndDate")

    /**
     * The service period start date in ISO-8601 format. *(inclusive of the starting date)*.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun servicePeriodStartDate(): OffsetDateTime =
        servicePeriodStartDate.getRequired("servicePeriodStartDate")

    /**
     * The id of the user who created this debit line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * The UUID of the debit reason for this debit line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun debitReasonId(): Optional<String> = debitReasonId.getOptional("debitReasonId")

    /**
     * The DateTime when the debit line item was created *(in ISO-8601 format)*.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The DateTime when the debit line item was last modified *(in ISO-8601 format)*.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * The id of the user who last modified this debit line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

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
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /**
     * Returns the raw JSON value of [referencedBillId].
     *
     * Unlike [referencedBillId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("referencedBillId")
    @ExcludeMissing
    fun _referencedBillId(): JsonField<String> = referencedBillId

    /**
     * Returns the raw JSON value of [referencedLineItemId].
     *
     * Unlike [referencedLineItemId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("referencedLineItemId")
    @ExcludeMissing
    fun _referencedLineItemId(): JsonField<String> = referencedLineItemId

    /**
     * Returns the raw JSON value of [servicePeriodEndDate].
     *
     * Unlike [servicePeriodEndDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("servicePeriodEndDate")
    @ExcludeMissing
    fun _servicePeriodEndDate(): JsonField<OffsetDateTime> = servicePeriodEndDate

    /**
     * Returns the raw JSON value of [servicePeriodStartDate].
     *
     * Unlike [servicePeriodStartDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("servicePeriodStartDate")
    @ExcludeMissing
    fun _servicePeriodStartDate(): JsonField<OffsetDateTime> = servicePeriodStartDate

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [debitReasonId].
     *
     * Unlike [debitReasonId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("debitReasonId")
    @ExcludeMissing
    fun _debitReasonId(): JsonField<String> = debitReasonId

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
         * Returns a mutable builder for constructing an instance of [DebitLineItemResponse].
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
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DebitLineItemResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Double>? = null
        private var description: JsonField<String>? = null
        private var productId: JsonField<String>? = null
        private var referencedBillId: JsonField<String>? = null
        private var referencedLineItemId: JsonField<String>? = null
        private var servicePeriodEndDate: JsonField<OffsetDateTime>? = null
        private var servicePeriodStartDate: JsonField<OffsetDateTime>? = null
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var debitReasonId: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(debitLineItemResponse: DebitLineItemResponse) = apply {
            id = debitLineItemResponse.id
            amount = debitLineItemResponse.amount
            description = debitLineItemResponse.description
            productId = debitLineItemResponse.productId
            referencedBillId = debitLineItemResponse.referencedBillId
            referencedLineItemId = debitLineItemResponse.referencedLineItemId
            servicePeriodEndDate = debitLineItemResponse.servicePeriodEndDate
            servicePeriodStartDate = debitLineItemResponse.servicePeriodStartDate
            createdBy = debitLineItemResponse.createdBy
            debitReasonId = debitLineItemResponse.debitReasonId
            dtCreated = debitLineItemResponse.dtCreated
            dtLastModified = debitLineItemResponse.dtLastModified
            lastModifiedBy = debitLineItemResponse.lastModifiedBy
            version = debitLineItemResponse.version
            additionalProperties = debitLineItemResponse.additionalProperties.toMutableMap()
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

        /** The amount for the line item. */
        fun amount(amount: Double) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        /** The description of the line item. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The UUID of the Product. */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /** The UUID of the bill for the line item. */
        fun referencedBillId(referencedBillId: String) =
            referencedBillId(JsonField.of(referencedBillId))

        /**
         * Sets [Builder.referencedBillId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referencedBillId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referencedBillId(referencedBillId: JsonField<String>) = apply {
            this.referencedBillId = referencedBillId
        }

        /** The UUID of the line item. */
        fun referencedLineItemId(referencedLineItemId: String) =
            referencedLineItemId(JsonField.of(referencedLineItemId))

        /**
         * Sets [Builder.referencedLineItemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referencedLineItemId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referencedLineItemId(referencedLineItemId: JsonField<String>) = apply {
            this.referencedLineItemId = referencedLineItemId
        }

        /** The service period end date in ISO-8601 format. *(exclusive of the ending date)*. */
        fun servicePeriodEndDate(servicePeriodEndDate: OffsetDateTime) =
            servicePeriodEndDate(JsonField.of(servicePeriodEndDate))

        /**
         * Sets [Builder.servicePeriodEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.servicePeriodEndDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun servicePeriodEndDate(servicePeriodEndDate: JsonField<OffsetDateTime>) = apply {
            this.servicePeriodEndDate = servicePeriodEndDate
        }

        /** The service period start date in ISO-8601 format. *(inclusive of the starting date)*. */
        fun servicePeriodStartDate(servicePeriodStartDate: OffsetDateTime) =
            servicePeriodStartDate(JsonField.of(servicePeriodStartDate))

        /**
         * Sets [Builder.servicePeriodStartDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.servicePeriodStartDate] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun servicePeriodStartDate(servicePeriodStartDate: JsonField<OffsetDateTime>) = apply {
            this.servicePeriodStartDate = servicePeriodStartDate
        }

        /** The id of the user who created this debit line item. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The UUID of the debit reason for this debit line item. */
        fun debitReasonId(debitReasonId: String) = debitReasonId(JsonField.of(debitReasonId))

        /**
         * Sets [Builder.debitReasonId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.debitReasonId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun debitReasonId(debitReasonId: JsonField<String>) = apply {
            this.debitReasonId = debitReasonId
        }

        /** The DateTime when the debit line item was created *(in ISO-8601 format)*. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when the debit line item was last modified *(in ISO-8601 format)*. */
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

        /** The id of the user who last modified this debit line item. */
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
         * Returns an immutable instance of [DebitLineItemResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
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
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DebitLineItemResponse =
            DebitLineItemResponse(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("description", description),
                checkRequired("productId", productId),
                checkRequired("referencedBillId", referencedBillId),
                checkRequired("referencedLineItemId", referencedLineItemId),
                checkRequired("servicePeriodEndDate", servicePeriodEndDate),
                checkRequired("servicePeriodStartDate", servicePeriodStartDate),
                createdBy,
                debitReasonId,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DebitLineItemResponse = apply {
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
        createdBy()
        debitReasonId()
        dtCreated()
        dtLastModified()
        lastModifiedBy()
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
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (productId.asKnown().isPresent) 1 else 0) +
            (if (referencedBillId.asKnown().isPresent) 1 else 0) +
            (if (referencedLineItemId.asKnown().isPresent) 1 else 0) +
            (if (servicePeriodEndDate.asKnown().isPresent) 1 else 0) +
            (if (servicePeriodStartDate.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (debitReasonId.asKnown().isPresent) 1 else 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DebitLineItemResponse &&
            id == other.id &&
            amount == other.amount &&
            description == other.description &&
            productId == other.productId &&
            referencedBillId == other.referencedBillId &&
            referencedLineItemId == other.referencedLineItemId &&
            servicePeriodEndDate == other.servicePeriodEndDate &&
            servicePeriodStartDate == other.servicePeriodStartDate &&
            createdBy == other.createdBy &&
            debitReasonId == other.debitReasonId &&
            dtCreated == other.dtCreated &&
            dtLastModified == other.dtLastModified &&
            lastModifiedBy == other.lastModifiedBy &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            amount,
            description,
            productId,
            referencedBillId,
            referencedLineItemId,
            servicePeriodEndDate,
            servicePeriodStartDate,
            createdBy,
            debitReasonId,
            dtCreated,
            dtLastModified,
            lastModifiedBy,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DebitLineItemResponse{id=$id, amount=$amount, description=$description, productId=$productId, referencedBillId=$referencedBillId, referencedLineItemId=$referencedLineItemId, servicePeriodEndDate=$servicePeriodEndDate, servicePeriodStartDate=$servicePeriodStartDate, createdBy=$createdBy, debitReasonId=$debitReasonId, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, version=$version, additionalProperties=$additionalProperties}"
}
