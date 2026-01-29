// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.core.Enum
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
import kotlin.jvm.optionals.getOrNull

class DebitLineItemResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Double>,
    private val createdBy: JsonField<String>,
    private val debitReasonId: JsonField<String>,
    private val description: JsonField<String>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val lastModifiedBy: JsonField<String>,
    private val lineItemType: JsonField<LineItemType>,
    private val productId: JsonField<String>,
    private val referencedBillId: JsonField<String>,
    private val referencedLineItemId: JsonField<String>,
    private val servicePeriodEndDate: JsonField<OffsetDateTime>,
    private val servicePeriodStartDate: JsonField<OffsetDateTime>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("debitReasonId")
        @ExcludeMissing
        debitReasonId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lineItemType")
        @ExcludeMissing
        lineItemType: JsonField<LineItemType> = JsonMissing.of(),
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
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        amount,
        createdBy,
        debitReasonId,
        description,
        dtCreated,
        dtLastModified,
        lastModifiedBy,
        lineItemType,
        productId,
        referencedBillId,
        referencedLineItemId,
        servicePeriodEndDate,
        servicePeriodStartDate,
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
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<Double> = amount.getOptional("amount")

    /**
     * The ID of the user who created this line item.
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
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The DateTime when the line item was created.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The DateTime when the line item was last modified.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * The ID of the user who last modified this line item.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lineItemType(): Optional<LineItemType> = lineItemType.getOptional("lineItemType")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productId(): Optional<String> = productId.getOptional("productId")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referencedBillId(): Optional<String> = referencedBillId.getOptional("referencedBillId")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun referencedLineItemId(): Optional<String> =
        referencedLineItemId.getOptional("referencedLineItemId")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun servicePeriodEndDate(): Optional<OffsetDateTime> =
        servicePeriodEndDate.getOptional("servicePeriodEndDate")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun servicePeriodStartDate(): Optional<OffsetDateTime> =
        servicePeriodStartDate.getOptional("servicePeriodStartDate")

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
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

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
     * Returns the raw JSON value of [lineItemType].
     *
     * Unlike [lineItemType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lineItemType")
    @ExcludeMissing
    fun _lineItemType(): JsonField<LineItemType> = lineItemType

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
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DebitLineItemResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<Double> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var debitReasonId: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var lineItemType: JsonField<LineItemType> = JsonMissing.of()
        private var productId: JsonField<String> = JsonMissing.of()
        private var referencedBillId: JsonField<String> = JsonMissing.of()
        private var referencedLineItemId: JsonField<String> = JsonMissing.of()
        private var servicePeriodEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var servicePeriodStartDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(debitLineItemResponse: DebitLineItemResponse) = apply {
            id = debitLineItemResponse.id
            amount = debitLineItemResponse.amount
            createdBy = debitLineItemResponse.createdBy
            debitReasonId = debitLineItemResponse.debitReasonId
            description = debitLineItemResponse.description
            dtCreated = debitLineItemResponse.dtCreated
            dtLastModified = debitLineItemResponse.dtLastModified
            lastModifiedBy = debitLineItemResponse.lastModifiedBy
            lineItemType = debitLineItemResponse.lineItemType
            productId = debitLineItemResponse.productId
            referencedBillId = debitLineItemResponse.referencedBillId
            referencedLineItemId = debitLineItemResponse.referencedLineItemId
            servicePeriodEndDate = debitLineItemResponse.servicePeriodEndDate
            servicePeriodStartDate = debitLineItemResponse.servicePeriodStartDate
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

        fun amount(amount: Double) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        /** The ID of the user who created this line item. */
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

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The DateTime when the line item was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when the line item was last modified. */
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

        /** The ID of the user who last modified this line item. */
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

        fun lineItemType(lineItemType: LineItemType) = lineItemType(JsonField.of(lineItemType))

        /**
         * Sets [Builder.lineItemType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineItemType] with a well-typed [LineItemType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lineItemType(lineItemType: JsonField<LineItemType>) = apply {
            this.lineItemType = lineItemType
        }

        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

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
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DebitLineItemResponse =
            DebitLineItemResponse(
                checkRequired("id", id),
                amount,
                createdBy,
                debitReasonId,
                description,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                lineItemType,
                productId,
                referencedBillId,
                referencedLineItemId,
                servicePeriodEndDate,
                servicePeriodStartDate,
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
        createdBy()
        debitReasonId()
        description()
        dtCreated()
        dtLastModified()
        lastModifiedBy()
        lineItemType().ifPresent { it.validate() }
        productId()
        referencedBillId()
        referencedLineItemId()
        servicePeriodEndDate()
        servicePeriodStartDate()
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
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (debitReasonId.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (lineItemType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (productId.asKnown().isPresent) 1 else 0) +
            (if (referencedBillId.asKnown().isPresent) 1 else 0) +
            (if (referencedLineItemId.asKnown().isPresent) 1 else 0) +
            (if (servicePeriodEndDate.asKnown().isPresent) 1 else 0) +
            (if (servicePeriodStartDate.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    class LineItemType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val STANDING_CHARGE = of("STANDING_CHARGE")

            @JvmField val USAGE = of("USAGE")

            @JvmField val COUNTER_RUNNING_TOTAL_CHARGE = of("COUNTER_RUNNING_TOTAL_CHARGE")

            @JvmField val COUNTER_ADJUSTMENT_DEBIT = of("COUNTER_ADJUSTMENT_DEBIT")

            @JvmField val COUNTER_ADJUSTMENT_CREDIT = of("COUNTER_ADJUSTMENT_CREDIT")

            @JvmField val USAGE_CREDIT = of("USAGE_CREDIT")

            @JvmField val MINIMUM_SPEND = of("MINIMUM_SPEND")

            @JvmField val MINIMUM_SPEND_REFUND = of("MINIMUM_SPEND_REFUND")

            @JvmField val CREDIT_DEDUCTION = of("CREDIT_DEDUCTION")

            @JvmField val MANUAL_ADJUSTMENT = of("MANUAL_ADJUSTMENT")

            @JvmField val CREDIT_MEMO = of("CREDIT_MEMO")

            @JvmField val DEBIT_MEMO = of("DEBIT_MEMO")

            @JvmField val COMMITMENT_CONSUMED = of("COMMITMENT_CONSUMED")

            @JvmField val COMMITMENT_FEE = of("COMMITMENT_FEE")

            @JvmField val OVERAGE_SURCHARGE = of("OVERAGE_SURCHARGE")

            @JvmField val OVERAGE_USAGE = of("OVERAGE_USAGE")

            @JvmField val BALANCE_CONSUMED = of("BALANCE_CONSUMED")

            @JvmField val BALANCE_FEE = of("BALANCE_FEE")

            @JvmField val AD_HOC = of("AD_HOC")

            @JvmStatic fun of(value: String) = LineItemType(JsonField.of(value))
        }

        /** An enum containing [LineItemType]'s known values. */
        enum class Known {
            STANDING_CHARGE,
            USAGE,
            COUNTER_RUNNING_TOTAL_CHARGE,
            COUNTER_ADJUSTMENT_DEBIT,
            COUNTER_ADJUSTMENT_CREDIT,
            USAGE_CREDIT,
            MINIMUM_SPEND,
            MINIMUM_SPEND_REFUND,
            CREDIT_DEDUCTION,
            MANUAL_ADJUSTMENT,
            CREDIT_MEMO,
            DEBIT_MEMO,
            COMMITMENT_CONSUMED,
            COMMITMENT_FEE,
            OVERAGE_SURCHARGE,
            OVERAGE_USAGE,
            BALANCE_CONSUMED,
            BALANCE_FEE,
            AD_HOC,
        }

        /**
         * An enum containing [LineItemType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LineItemType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            STANDING_CHARGE,
            USAGE,
            COUNTER_RUNNING_TOTAL_CHARGE,
            COUNTER_ADJUSTMENT_DEBIT,
            COUNTER_ADJUSTMENT_CREDIT,
            USAGE_CREDIT,
            MINIMUM_SPEND,
            MINIMUM_SPEND_REFUND,
            CREDIT_DEDUCTION,
            MANUAL_ADJUSTMENT,
            CREDIT_MEMO,
            DEBIT_MEMO,
            COMMITMENT_CONSUMED,
            COMMITMENT_FEE,
            OVERAGE_SURCHARGE,
            OVERAGE_USAGE,
            BALANCE_CONSUMED,
            BALANCE_FEE,
            AD_HOC,
            /**
             * An enum member indicating that [LineItemType] was instantiated with an unknown value.
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
                STANDING_CHARGE -> Value.STANDING_CHARGE
                USAGE -> Value.USAGE
                COUNTER_RUNNING_TOTAL_CHARGE -> Value.COUNTER_RUNNING_TOTAL_CHARGE
                COUNTER_ADJUSTMENT_DEBIT -> Value.COUNTER_ADJUSTMENT_DEBIT
                COUNTER_ADJUSTMENT_CREDIT -> Value.COUNTER_ADJUSTMENT_CREDIT
                USAGE_CREDIT -> Value.USAGE_CREDIT
                MINIMUM_SPEND -> Value.MINIMUM_SPEND
                MINIMUM_SPEND_REFUND -> Value.MINIMUM_SPEND_REFUND
                CREDIT_DEDUCTION -> Value.CREDIT_DEDUCTION
                MANUAL_ADJUSTMENT -> Value.MANUAL_ADJUSTMENT
                CREDIT_MEMO -> Value.CREDIT_MEMO
                DEBIT_MEMO -> Value.DEBIT_MEMO
                COMMITMENT_CONSUMED -> Value.COMMITMENT_CONSUMED
                COMMITMENT_FEE -> Value.COMMITMENT_FEE
                OVERAGE_SURCHARGE -> Value.OVERAGE_SURCHARGE
                OVERAGE_USAGE -> Value.OVERAGE_USAGE
                BALANCE_CONSUMED -> Value.BALANCE_CONSUMED
                BALANCE_FEE -> Value.BALANCE_FEE
                AD_HOC -> Value.AD_HOC
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
                STANDING_CHARGE -> Known.STANDING_CHARGE
                USAGE -> Known.USAGE
                COUNTER_RUNNING_TOTAL_CHARGE -> Known.COUNTER_RUNNING_TOTAL_CHARGE
                COUNTER_ADJUSTMENT_DEBIT -> Known.COUNTER_ADJUSTMENT_DEBIT
                COUNTER_ADJUSTMENT_CREDIT -> Known.COUNTER_ADJUSTMENT_CREDIT
                USAGE_CREDIT -> Known.USAGE_CREDIT
                MINIMUM_SPEND -> Known.MINIMUM_SPEND
                MINIMUM_SPEND_REFUND -> Known.MINIMUM_SPEND_REFUND
                CREDIT_DEDUCTION -> Known.CREDIT_DEDUCTION
                MANUAL_ADJUSTMENT -> Known.MANUAL_ADJUSTMENT
                CREDIT_MEMO -> Known.CREDIT_MEMO
                DEBIT_MEMO -> Known.DEBIT_MEMO
                COMMITMENT_CONSUMED -> Known.COMMITMENT_CONSUMED
                COMMITMENT_FEE -> Known.COMMITMENT_FEE
                OVERAGE_SURCHARGE -> Known.OVERAGE_SURCHARGE
                OVERAGE_USAGE -> Known.OVERAGE_USAGE
                BALANCE_CONSUMED -> Known.BALANCE_CONSUMED
                BALANCE_FEE -> Known.BALANCE_FEE
                AD_HOC -> Known.AD_HOC
                else -> throw M3terInvalidDataException("Unknown LineItemType: $value")
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

        private var validated: Boolean = false

        fun validate(): LineItemType = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LineItemType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DebitLineItemResponse &&
            id == other.id &&
            amount == other.amount &&
            createdBy == other.createdBy &&
            debitReasonId == other.debitReasonId &&
            description == other.description &&
            dtCreated == other.dtCreated &&
            dtLastModified == other.dtLastModified &&
            lastModifiedBy == other.lastModifiedBy &&
            lineItemType == other.lineItemType &&
            productId == other.productId &&
            referencedBillId == other.referencedBillId &&
            referencedLineItemId == other.referencedLineItemId &&
            servicePeriodEndDate == other.servicePeriodEndDate &&
            servicePeriodStartDate == other.servicePeriodStartDate &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            amount,
            createdBy,
            debitReasonId,
            description,
            dtCreated,
            dtLastModified,
            lastModifiedBy,
            lineItemType,
            productId,
            referencedBillId,
            referencedLineItemId,
            servicePeriodEndDate,
            servicePeriodStartDate,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DebitLineItemResponse{id=$id, amount=$amount, createdBy=$createdBy, debitReasonId=$debitReasonId, description=$description, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, lineItemType=$lineItemType, productId=$productId, referencedBillId=$referencedBillId, referencedLineItemId=$referencedLineItemId, servicePeriodEndDate=$servicePeriodEndDate, servicePeriodStartDate=$servicePeriodStartDate, version=$version, additionalProperties=$additionalProperties}"
}
