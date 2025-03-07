// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.sdk.core.Enum
import com.m3ter.sdk.core.ExcludeMissing
import com.m3ter.sdk.core.JsonField
import com.m3ter.sdk.core.JsonMissing
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.core.NoAutoDetect
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Create a new Debit line item for the given bill.
 *
 * When creating Debit line items for Bills, use the Debit Reasons created for your Organization.
 * See [DebitReason](https://www.m3ter.com/docs/api#tag/DebitReason).
 */
class BillDebitLineItemCreateParams
private constructor(
    private val orgId: String,
    private val billId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    fun billId(): String = billId

    /** The amount for the line item. */
    fun amount(): Double = body.amount()

    /** The description for the line item. */
    fun description(): String = body.description()

    /** The UUID of the Product. */
    fun productId(): String = body.productId()

    /** The UUID of the bill for the line item. */
    fun referencedBillId(): String = body.referencedBillId()

    /** The UUID of the line item. */
    fun referencedLineItemId(): String = body.referencedLineItemId()

    /** The service period end date in ISO-8601 format._(exclusive of the ending date)_. */
    fun servicePeriodEndDate(): OffsetDateTime = body.servicePeriodEndDate()

    /** The service period start date in ISO-8601 format. _(inclusive of the starting date)_. */
    fun servicePeriodStartDate(): OffsetDateTime = body.servicePeriodStartDate()

    /** The ID of the Debit Reason given for this debit line item. */
    fun debitReasonId(): Optional<String> = body.debitReasonId()

    fun lineItemType(): Optional<LineItemType> = body.lineItemType()

    /** The UUID of the line item reason. */
    fun reasonId(): Optional<String> = body.reasonId()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun version(): Optional<Long> = body.version()

    /** The amount for the line item. */
    fun _amount(): JsonField<Double> = body._amount()

    /** The description for the line item. */
    fun _description(): JsonField<String> = body._description()

    /** The UUID of the Product. */
    fun _productId(): JsonField<String> = body._productId()

    /** The UUID of the bill for the line item. */
    fun _referencedBillId(): JsonField<String> = body._referencedBillId()

    /** The UUID of the line item. */
    fun _referencedLineItemId(): JsonField<String> = body._referencedLineItemId()

    /** The service period end date in ISO-8601 format._(exclusive of the ending date)_. */
    fun _servicePeriodEndDate(): JsonField<OffsetDateTime> = body._servicePeriodEndDate()

    /** The service period start date in ISO-8601 format. _(inclusive of the starting date)_. */
    fun _servicePeriodStartDate(): JsonField<OffsetDateTime> = body._servicePeriodStartDate()

    /** The ID of the Debit Reason given for this debit line item. */
    fun _debitReasonId(): JsonField<String> = body._debitReasonId()

    fun _lineItemType(): JsonField<LineItemType> = body._lineItemType()

    /** The UUID of the line item reason. */
    fun _reasonId(): JsonField<String> = body._reasonId()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> orgId
            1 -> billId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
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
        @JsonProperty("debitReasonId")
        @ExcludeMissing
        private val debitReasonId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lineItemType")
        @ExcludeMissing
        private val lineItemType: JsonField<LineItemType> = JsonMissing.of(),
        @JsonProperty("reasonId")
        @ExcludeMissing
        private val reasonId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The amount for the line item. */
        fun amount(): Double = amount.getRequired("amount")

        /** The description for the line item. */
        fun description(): String = description.getRequired("description")

        /** The UUID of the Product. */
        fun productId(): String = productId.getRequired("productId")

        /** The UUID of the bill for the line item. */
        fun referencedBillId(): String = referencedBillId.getRequired("referencedBillId")

        /** The UUID of the line item. */
        fun referencedLineItemId(): String =
            referencedLineItemId.getRequired("referencedLineItemId")

        /** The service period end date in ISO-8601 format._(exclusive of the ending date)_. */
        fun servicePeriodEndDate(): OffsetDateTime =
            servicePeriodEndDate.getRequired("servicePeriodEndDate")

        /** The service period start date in ISO-8601 format. _(inclusive of the starting date)_. */
        fun servicePeriodStartDate(): OffsetDateTime =
            servicePeriodStartDate.getRequired("servicePeriodStartDate")

        /** The ID of the Debit Reason given for this debit line item. */
        fun debitReasonId(): Optional<String> =
            Optional.ofNullable(debitReasonId.getNullable("debitReasonId"))

        fun lineItemType(): Optional<LineItemType> =
            Optional.ofNullable(lineItemType.getNullable("lineItemType"))

        /** The UUID of the line item reason. */
        fun reasonId(): Optional<String> = Optional.ofNullable(reasonId.getNullable("reasonId"))

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /** The amount for the line item. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /** The description for the line item. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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

        /** The service period end date in ISO-8601 format._(exclusive of the ending date)_. */
        @JsonProperty("servicePeriodEndDate")
        @ExcludeMissing
        fun _servicePeriodEndDate(): JsonField<OffsetDateTime> = servicePeriodEndDate

        /** The service period start date in ISO-8601 format. _(inclusive of the starting date)_. */
        @JsonProperty("servicePeriodStartDate")
        @ExcludeMissing
        fun _servicePeriodStartDate(): JsonField<OffsetDateTime> = servicePeriodStartDate

        /** The ID of the Debit Reason given for this debit line item. */
        @JsonProperty("debitReasonId")
        @ExcludeMissing
        fun _debitReasonId(): JsonField<String> = debitReasonId

        @JsonProperty("lineItemType")
        @ExcludeMissing
        fun _lineItemType(): JsonField<LineItemType> = lineItemType

        /** The UUID of the line item reason. */
        @JsonProperty("reasonId") @ExcludeMissing fun _reasonId(): JsonField<String> = reasonId

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            amount()
            description()
            productId()
            referencedBillId()
            referencedLineItemId()
            servicePeriodEndDate()
            servicePeriodStartDate()
            debitReasonId()
            lineItemType()
            reasonId()
            version()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
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

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double>? = null
            private var description: JsonField<String>? = null
            private var productId: JsonField<String>? = null
            private var referencedBillId: JsonField<String>? = null
            private var referencedLineItemId: JsonField<String>? = null
            private var servicePeriodEndDate: JsonField<OffsetDateTime>? = null
            private var servicePeriodStartDate: JsonField<OffsetDateTime>? = null
            private var debitReasonId: JsonField<String> = JsonMissing.of()
            private var lineItemType: JsonField<LineItemType> = JsonMissing.of()
            private var reasonId: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                amount = body.amount
                description = body.description
                productId = body.productId
                referencedBillId = body.referencedBillId
                referencedLineItemId = body.referencedLineItemId
                servicePeriodEndDate = body.servicePeriodEndDate
                servicePeriodStartDate = body.servicePeriodStartDate
                debitReasonId = body.debitReasonId
                lineItemType = body.lineItemType
                reasonId = body.reasonId
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The amount for the line item. */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /** The amount for the line item. */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** The description for the line item. */
            fun description(description: String) = description(JsonField.of(description))

            /** The description for the line item. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

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

            /** The service period end date in ISO-8601 format._(exclusive of the ending date)_. */
            fun servicePeriodEndDate(servicePeriodEndDate: OffsetDateTime) =
                servicePeriodEndDate(JsonField.of(servicePeriodEndDate))

            /** The service period end date in ISO-8601 format._(exclusive of the ending date)_. */
            fun servicePeriodEndDate(servicePeriodEndDate: JsonField<OffsetDateTime>) = apply {
                this.servicePeriodEndDate = servicePeriodEndDate
            }

            /**
             * The service period start date in ISO-8601 format. _(inclusive of the starting date)_.
             */
            fun servicePeriodStartDate(servicePeriodStartDate: OffsetDateTime) =
                servicePeriodStartDate(JsonField.of(servicePeriodStartDate))

            /**
             * The service period start date in ISO-8601 format. _(inclusive of the starting date)_.
             */
            fun servicePeriodStartDate(servicePeriodStartDate: JsonField<OffsetDateTime>) = apply {
                this.servicePeriodStartDate = servicePeriodStartDate
            }

            /** The ID of the Debit Reason given for this debit line item. */
            fun debitReasonId(debitReasonId: String) = debitReasonId(JsonField.of(debitReasonId))

            /** The ID of the Debit Reason given for this debit line item. */
            fun debitReasonId(debitReasonId: JsonField<String>) = apply {
                this.debitReasonId = debitReasonId
            }

            fun lineItemType(lineItemType: LineItemType) = lineItemType(JsonField.of(lineItemType))

            fun lineItemType(lineItemType: JsonField<LineItemType>) = apply {
                this.lineItemType = lineItemType
            }

            /** The UUID of the line item reason. */
            fun reasonId(reasonId: String) = reasonId(JsonField.of(reasonId))

            /** The UUID of the line item reason. */
            fun reasonId(reasonId: JsonField<String>) = apply { this.reasonId = reasonId }

            /**
             * The version number of the entity:
             * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
             *   Create_. On initial Create, version is set at 1 and listed in the response.
             * - **Update Entity:** On Update, version is required and must match the existing
             *   version because a check is performed to ensure sequential versioning is preserved.
             *   Version is incremented by 1 and listed in the response.
             */
            fun version(version: Long) = version(JsonField.of(version))

            /**
             * The version number of the entity:
             * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
             *   Create_. On initial Create, version is set at 1 and listed in the response.
             * - **Update Entity:** On Update, version is required and must match the existing
             *   version because a check is performed to ensure sequential versioning is preserved.
             *   Version is incremented by 1 and listed in the response.
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

            fun build(): Body =
                Body(
                    checkRequired("amount", amount),
                    checkRequired("description", description),
                    checkRequired("productId", productId),
                    checkRequired("referencedBillId", referencedBillId),
                    checkRequired("referencedLineItemId", referencedLineItemId),
                    checkRequired("servicePeriodEndDate", servicePeriodEndDate),
                    checkRequired("servicePeriodStartDate", servicePeriodStartDate),
                    debitReasonId,
                    lineItemType,
                    reasonId,
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && amount == other.amount && description == other.description && productId == other.productId && referencedBillId == other.referencedBillId && referencedLineItemId == other.referencedLineItemId && servicePeriodEndDate == other.servicePeriodEndDate && servicePeriodStartDate == other.servicePeriodStartDate && debitReasonId == other.debitReasonId && lineItemType == other.lineItemType && reasonId == other.reasonId && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, description, productId, referencedBillId, referencedLineItemId, servicePeriodEndDate, servicePeriodStartDate, debitReasonId, lineItemType, reasonId, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amount=$amount, description=$description, productId=$productId, referencedBillId=$referencedBillId, referencedLineItemId=$referencedLineItemId, servicePeriodEndDate=$servicePeriodEndDate, servicePeriodStartDate=$servicePeriodStartDate, debitReasonId=$debitReasonId, lineItemType=$lineItemType, reasonId=$reasonId, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BillDebitLineItemCreateParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .billId()
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

    /** A builder for [BillDebitLineItemCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var billId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(billDebitLineItemCreateParams: BillDebitLineItemCreateParams) = apply {
            orgId = billDebitLineItemCreateParams.orgId
            billId = billDebitLineItemCreateParams.billId
            body = billDebitLineItemCreateParams.body.toBuilder()
            additionalHeaders = billDebitLineItemCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = billDebitLineItemCreateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        fun billId(billId: String) = apply { this.billId = billId }

        /** The amount for the line item. */
        fun amount(amount: Double) = apply { body.amount(amount) }

        /** The amount for the line item. */
        fun amount(amount: JsonField<Double>) = apply { body.amount(amount) }

        /** The description for the line item. */
        fun description(description: String) = apply { body.description(description) }

        /** The description for the line item. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The UUID of the Product. */
        fun productId(productId: String) = apply { body.productId(productId) }

        /** The UUID of the Product. */
        fun productId(productId: JsonField<String>) = apply { body.productId(productId) }

        /** The UUID of the bill for the line item. */
        fun referencedBillId(referencedBillId: String) = apply {
            body.referencedBillId(referencedBillId)
        }

        /** The UUID of the bill for the line item. */
        fun referencedBillId(referencedBillId: JsonField<String>) = apply {
            body.referencedBillId(referencedBillId)
        }

        /** The UUID of the line item. */
        fun referencedLineItemId(referencedLineItemId: String) = apply {
            body.referencedLineItemId(referencedLineItemId)
        }

        /** The UUID of the line item. */
        fun referencedLineItemId(referencedLineItemId: JsonField<String>) = apply {
            body.referencedLineItemId(referencedLineItemId)
        }

        /** The service period end date in ISO-8601 format._(exclusive of the ending date)_. */
        fun servicePeriodEndDate(servicePeriodEndDate: OffsetDateTime) = apply {
            body.servicePeriodEndDate(servicePeriodEndDate)
        }

        /** The service period end date in ISO-8601 format._(exclusive of the ending date)_. */
        fun servicePeriodEndDate(servicePeriodEndDate: JsonField<OffsetDateTime>) = apply {
            body.servicePeriodEndDate(servicePeriodEndDate)
        }

        /** The service period start date in ISO-8601 format. _(inclusive of the starting date)_. */
        fun servicePeriodStartDate(servicePeriodStartDate: OffsetDateTime) = apply {
            body.servicePeriodStartDate(servicePeriodStartDate)
        }

        /** The service period start date in ISO-8601 format. _(inclusive of the starting date)_. */
        fun servicePeriodStartDate(servicePeriodStartDate: JsonField<OffsetDateTime>) = apply {
            body.servicePeriodStartDate(servicePeriodStartDate)
        }

        /** The ID of the Debit Reason given for this debit line item. */
        fun debitReasonId(debitReasonId: String) = apply { body.debitReasonId(debitReasonId) }

        /** The ID of the Debit Reason given for this debit line item. */
        fun debitReasonId(debitReasonId: JsonField<String>) = apply {
            body.debitReasonId(debitReasonId)
        }

        fun lineItemType(lineItemType: LineItemType) = apply { body.lineItemType(lineItemType) }

        fun lineItemType(lineItemType: JsonField<LineItemType>) = apply {
            body.lineItemType(lineItemType)
        }

        /** The UUID of the line item reason. */
        fun reasonId(reasonId: String) = apply { body.reasonId(reasonId) }

        /** The UUID of the line item reason. */
        fun reasonId(reasonId: JsonField<String>) = apply { body.reasonId(reasonId) }

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(version: Long) = apply { body.version(version) }

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(version: JsonField<Long>) = apply { body.version(version) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): BillDebitLineItemCreateParams =
            BillDebitLineItemCreateParams(
                checkRequired("orgId", orgId),
                checkRequired("billId", billId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LineItemType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillDebitLineItemCreateParams && orgId == other.orgId && billId == other.billId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, billId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BillDebitLineItemCreateParams{orgId=$orgId, billId=$billId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
