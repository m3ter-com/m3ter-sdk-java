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
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update CounterPricing for the given UUID.
 *
 * **Note:** Either `planId` or `planTemplateId` request parameters are required for this call to be
 * valid. If you omit both, then you will receive a validation error.
 */
class CounterPricingUpdateParams
private constructor(
    private val orgId: String,
    private val id: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    fun id(): String = id

    /**
     * UUID of the Counter used to create the pricing.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun counterId(): String = body.counterId()

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pricingBands(): List<PricingBand> = body.pricingBands()

    /**
     * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the Plan
     * of Plan Template._(Required)_
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startDate(): OffsetDateTime = body.startDate()

    /**
     * Optional Product ID this Pricing should be attributed to for accounting purposes
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountingProductId(): Optional<String> = body.accountingProductId()

    /**
     * Unique short code for the Pricing.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<String> = body.code()

    /**
     * Controls whether or not charge rates under a set of pricing bands configured for a Pricing
     * are applied according to each separate band or at the highest band reached.
     *
     * _(Optional)_. The default value is **FALSE**.
     * - When TRUE, at billing charge rates are applied according to each separate band.
     * - When FALSE, at billing charge rates are applied according to highest band reached.
     *
     * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require. For
     * example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to **FALSE**.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cumulative(): Optional<Boolean> = body.cumulative()

    /**
     * Displayed on Bill line items.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan or
     * Plan Template.
     *
     * _(Optional)_ If not specified, the Pricing remains active indefinitely.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): Optional<OffsetDateTime> = body.endDate()

    /**
     * UUID of the Plan the Pricing is created for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun planId(): Optional<String> = body.planId()

    /**
     * UUID of the Plan Template the Pricing is created for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun planTemplateId(): Optional<String> = body.planTemplateId()

    /**
     * The default value is **TRUE**.
     * - When TRUE, counter adjustment credits are prorated and are billed according to the number
     *   of days in billing period.
     * - When FALSE, counter adjustment credits are not prorated and are billed for the entire
     *   billing period.
     *
     * _(Optional)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun proRateAdjustmentCredit(): Optional<Boolean> = body.proRateAdjustmentCredit()

    /**
     * The default value is **TRUE**.
     * - When TRUE, counter adjustment debits are prorated and are billed according to the number of
     *   days in billing period.
     * - When FALSE, counter adjustment debits are not prorated and are billed for the entire
     *   billing period.
     *
     * _(Optional)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun proRateAdjustmentDebit(): Optional<Boolean> = body.proRateAdjustmentDebit()

    /**
     * The default value is **TRUE**.
     * - When TRUE, counter running total charges are prorated and are billed according to the
     *   number of days in billing period.
     * - When FALSE, counter running total charges are not prorated and are billed for the entire
     *   billing period.
     *
     * _(Optional)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun proRateRunningTotal(): Optional<Boolean> = body.proRateRunningTotal()

    /**
     * The default value is **TRUE**.
     * - When TRUE, running totals are billed at the start of each billing period.
     * - When FALSE, running totals are billed at the end of each billing period.
     *
     * _(Optional)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun runningTotalBillInAdvance(): Optional<Boolean> = body.runningTotalBillInAdvance()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun version(): Optional<Long> = body.version()

    /**
     * Returns the raw JSON value of [counterId].
     *
     * Unlike [counterId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _counterId(): JsonField<String> = body._counterId()

    /**
     * Returns the raw JSON value of [pricingBands].
     *
     * Unlike [pricingBands], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pricingBands(): JsonField<List<PricingBand>> = body._pricingBands()

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startDate(): JsonField<OffsetDateTime> = body._startDate()

    /**
     * Returns the raw JSON value of [accountingProductId].
     *
     * Unlike [accountingProductId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _accountingProductId(): JsonField<String> = body._accountingProductId()

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _code(): JsonField<String> = body._code()

    /**
     * Returns the raw JSON value of [cumulative].
     *
     * Unlike [cumulative], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cumulative(): JsonField<Boolean> = body._cumulative()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _endDate(): JsonField<OffsetDateTime> = body._endDate()

    /**
     * Returns the raw JSON value of [planId].
     *
     * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _planId(): JsonField<String> = body._planId()

    /**
     * Returns the raw JSON value of [planTemplateId].
     *
     * Unlike [planTemplateId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _planTemplateId(): JsonField<String> = body._planTemplateId()

    /**
     * Returns the raw JSON value of [proRateAdjustmentCredit].
     *
     * Unlike [proRateAdjustmentCredit], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _proRateAdjustmentCredit(): JsonField<Boolean> = body._proRateAdjustmentCredit()

    /**
     * Returns the raw JSON value of [proRateAdjustmentDebit].
     *
     * Unlike [proRateAdjustmentDebit], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _proRateAdjustmentDebit(): JsonField<Boolean> = body._proRateAdjustmentDebit()

    /**
     * Returns the raw JSON value of [proRateRunningTotal].
     *
     * Unlike [proRateRunningTotal], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _proRateRunningTotal(): JsonField<Boolean> = body._proRateRunningTotal()

    /**
     * Returns the raw JSON value of [runningTotalBillInAdvance].
     *
     * Unlike [runningTotalBillInAdvance], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _runningTotalBillInAdvance(): JsonField<Boolean> = body._runningTotalBillInAdvance()

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CounterPricingUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .id()
         * .counterId()
         * .pricingBands()
         * .startDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CounterPricingUpdateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(counterPricingUpdateParams: CounterPricingUpdateParams) = apply {
            orgId = counterPricingUpdateParams.orgId
            id = counterPricingUpdateParams.id
            body = counterPricingUpdateParams.body.toBuilder()
            additionalHeaders = counterPricingUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = counterPricingUpdateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        fun id(id: String) = apply { this.id = id }

        /** UUID of the Counter used to create the pricing. */
        fun counterId(counterId: String) = apply { body.counterId(counterId) }

        /**
         * Sets [Builder.counterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counterId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun counterId(counterId: JsonField<String>) = apply { body.counterId(counterId) }

        fun pricingBands(pricingBands: List<PricingBand>) = apply {
            body.pricingBands(pricingBands)
        }

        /**
         * Sets [Builder.pricingBands] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricingBands] with a well-typed `List<PricingBand>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun pricingBands(pricingBands: JsonField<List<PricingBand>>) = apply {
            body.pricingBands(pricingBands)
        }

        /**
         * Adds a single [PricingBand] to [pricingBands].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPricingBand(pricingBand: PricingBand) = apply { body.addPricingBand(pricingBand) }

        /**
         * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the
         * Plan of Plan Template._(Required)_
         */
        fun startDate(startDate: OffsetDateTime) = apply { body.startDate(startDate) }

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { body.startDate(startDate) }

        /** Optional Product ID this Pricing should be attributed to for accounting purposes */
        fun accountingProductId(accountingProductId: String) = apply {
            body.accountingProductId(accountingProductId)
        }

        /**
         * Sets [Builder.accountingProductId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountingProductId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountingProductId(accountingProductId: JsonField<String>) = apply {
            body.accountingProductId(accountingProductId)
        }

        /** Unique short code for the Pricing. */
        fun code(code: String) = apply { body.code(code) }

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /**
         * Controls whether or not charge rates under a set of pricing bands configured for a
         * Pricing are applied according to each separate band or at the highest band reached.
         *
         * _(Optional)_. The default value is **FALSE**.
         * - When TRUE, at billing charge rates are applied according to each separate band.
         * - When FALSE, at billing charge rates are applied according to highest band reached.
         *
         * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require. For
         * example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to **FALSE**.
         */
        fun cumulative(cumulative: Boolean) = apply { body.cumulative(cumulative) }

        /**
         * Sets [Builder.cumulative] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cumulative] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cumulative(cumulative: JsonField<Boolean>) = apply { body.cumulative(cumulative) }

        /** Displayed on Bill line items. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan
         * or Plan Template.
         *
         * _(Optional)_ If not specified, the Pricing remains active indefinitely.
         */
        fun endDate(endDate: OffsetDateTime) = apply { body.endDate(endDate) }

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { body.endDate(endDate) }

        /** UUID of the Plan the Pricing is created for. */
        fun planId(planId: String) = apply { body.planId(planId) }

        /**
         * Sets [Builder.planId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun planId(planId: JsonField<String>) = apply { body.planId(planId) }

        /** UUID of the Plan Template the Pricing is created for. */
        fun planTemplateId(planTemplateId: String) = apply { body.planTemplateId(planTemplateId) }

        /**
         * Sets [Builder.planTemplateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planTemplateId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun planTemplateId(planTemplateId: JsonField<String>) = apply {
            body.planTemplateId(planTemplateId)
        }

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter adjustment credits are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter adjustment credits are not prorated and are billed for the entire
         *   billing period.
         *
         * _(Optional)_.
         */
        fun proRateAdjustmentCredit(proRateAdjustmentCredit: Boolean) = apply {
            body.proRateAdjustmentCredit(proRateAdjustmentCredit)
        }

        /**
         * Sets [Builder.proRateAdjustmentCredit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proRateAdjustmentCredit] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun proRateAdjustmentCredit(proRateAdjustmentCredit: JsonField<Boolean>) = apply {
            body.proRateAdjustmentCredit(proRateAdjustmentCredit)
        }

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter adjustment debits are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter adjustment debits are not prorated and are billed for the entire
         *   billing period.
         *
         * _(Optional)_.
         */
        fun proRateAdjustmentDebit(proRateAdjustmentDebit: Boolean) = apply {
            body.proRateAdjustmentDebit(proRateAdjustmentDebit)
        }

        /**
         * Sets [Builder.proRateAdjustmentDebit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proRateAdjustmentDebit] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun proRateAdjustmentDebit(proRateAdjustmentDebit: JsonField<Boolean>) = apply {
            body.proRateAdjustmentDebit(proRateAdjustmentDebit)
        }

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter running total charges are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter running total charges are not prorated and are billed for the
         *   entire billing period.
         *
         * _(Optional)_.
         */
        fun proRateRunningTotal(proRateRunningTotal: Boolean) = apply {
            body.proRateRunningTotal(proRateRunningTotal)
        }

        /**
         * Sets [Builder.proRateRunningTotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proRateRunningTotal] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun proRateRunningTotal(proRateRunningTotal: JsonField<Boolean>) = apply {
            body.proRateRunningTotal(proRateRunningTotal)
        }

        /**
         * The default value is **TRUE**.
         * - When TRUE, running totals are billed at the start of each billing period.
         * - When FALSE, running totals are billed at the end of each billing period.
         *
         * _(Optional)_.
         */
        fun runningTotalBillInAdvance(runningTotalBillInAdvance: Boolean) = apply {
            body.runningTotalBillInAdvance(runningTotalBillInAdvance)
        }

        /**
         * Sets [Builder.runningTotalBillInAdvance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.runningTotalBillInAdvance] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun runningTotalBillInAdvance(runningTotalBillInAdvance: JsonField<Boolean>) = apply {
            body.runningTotalBillInAdvance(runningTotalBillInAdvance)
        }

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
         * Sets [Builder.version] to an arbitrary JSON value.
         *
         * You should usually call [Builder.version] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [CounterPricingUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .id()
         * .counterId()
         * .pricingBands()
         * .startDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CounterPricingUpdateParams =
            CounterPricingUpdateParams(
                checkRequired("orgId", orgId),
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @JvmSynthetic internal fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId
            1 -> id
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val counterId: JsonField<String>,
        private val pricingBands: JsonField<List<PricingBand>>,
        private val startDate: JsonField<OffsetDateTime>,
        private val accountingProductId: JsonField<String>,
        private val code: JsonField<String>,
        private val cumulative: JsonField<Boolean>,
        private val description: JsonField<String>,
        private val endDate: JsonField<OffsetDateTime>,
        private val planId: JsonField<String>,
        private val planTemplateId: JsonField<String>,
        private val proRateAdjustmentCredit: JsonField<Boolean>,
        private val proRateAdjustmentDebit: JsonField<Boolean>,
        private val proRateRunningTotal: JsonField<Boolean>,
        private val runningTotalBillInAdvance: JsonField<Boolean>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("counterId")
            @ExcludeMissing
            counterId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pricingBands")
            @ExcludeMissing
            pricingBands: JsonField<List<PricingBand>> = JsonMissing.of(),
            @JsonProperty("startDate")
            @ExcludeMissing
            startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("accountingProductId")
            @ExcludeMissing
            accountingProductId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("cumulative")
            @ExcludeMissing
            cumulative: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("endDate")
            @ExcludeMissing
            endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("planId") @ExcludeMissing planId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("planTemplateId")
            @ExcludeMissing
            planTemplateId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("proRateAdjustmentCredit")
            @ExcludeMissing
            proRateAdjustmentCredit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("proRateAdjustmentDebit")
            @ExcludeMissing
            proRateAdjustmentDebit: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("proRateRunningTotal")
            @ExcludeMissing
            proRateRunningTotal: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("runningTotalBillInAdvance")
            @ExcludeMissing
            runningTotalBillInAdvance: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            counterId,
            pricingBands,
            startDate,
            accountingProductId,
            code,
            cumulative,
            description,
            endDate,
            planId,
            planTemplateId,
            proRateAdjustmentCredit,
            proRateAdjustmentDebit,
            proRateRunningTotal,
            runningTotalBillInAdvance,
            version,
            mutableMapOf(),
        )

        /**
         * UUID of the Counter used to create the pricing.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun counterId(): String = counterId.getRequired("counterId")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pricingBands(): List<PricingBand> = pricingBands.getRequired("pricingBands")

        /**
         * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for the
         * Plan of Plan Template._(Required)_
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): OffsetDateTime = startDate.getRequired("startDate")

        /**
         * Optional Product ID this Pricing should be attributed to for accounting purposes
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountingProductId(): Optional<String> =
            Optional.ofNullable(accountingProductId.getNullable("accountingProductId"))

        /**
         * Unique short code for the Pricing.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

        /**
         * Controls whether or not charge rates under a set of pricing bands configured for a
         * Pricing are applied according to each separate band or at the highest band reached.
         *
         * _(Optional)_. The default value is **FALSE**.
         * - When TRUE, at billing charge rates are applied according to each separate band.
         * - When FALSE, at billing charge rates are applied according to highest band reached.
         *
         * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require. For
         * example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to **FALSE**.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cumulative(): Optional<Boolean> =
            Optional.ofNullable(cumulative.getNullable("cumulative"))

        /**
         * Displayed on Bill line items.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /**
         * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the Plan
         * or Plan Template.
         *
         * _(Optional)_ If not specified, the Pricing remains active indefinitely.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(endDate.getNullable("endDate"))

        /**
         * UUID of the Plan the Pricing is created for.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planId(): Optional<String> = Optional.ofNullable(planId.getNullable("planId"))

        /**
         * UUID of the Plan Template the Pricing is created for.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planTemplateId(): Optional<String> =
            Optional.ofNullable(planTemplateId.getNullable("planTemplateId"))

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter adjustment credits are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter adjustment credits are not prorated and are billed for the entire
         *   billing period.
         *
         * _(Optional)_.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun proRateAdjustmentCredit(): Optional<Boolean> =
            Optional.ofNullable(proRateAdjustmentCredit.getNullable("proRateAdjustmentCredit"))

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter adjustment debits are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter adjustment debits are not prorated and are billed for the entire
         *   billing period.
         *
         * _(Optional)_.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun proRateAdjustmentDebit(): Optional<Boolean> =
            Optional.ofNullable(proRateAdjustmentDebit.getNullable("proRateAdjustmentDebit"))

        /**
         * The default value is **TRUE**.
         * - When TRUE, counter running total charges are prorated and are billed according to the
         *   number of days in billing period.
         * - When FALSE, counter running total charges are not prorated and are billed for the
         *   entire billing period.
         *
         * _(Optional)_.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun proRateRunningTotal(): Optional<Boolean> =
            Optional.ofNullable(proRateRunningTotal.getNullable("proRateRunningTotal"))

        /**
         * The default value is **TRUE**.
         * - When TRUE, running totals are billed at the start of each billing period.
         * - When FALSE, running totals are billed at the end of each billing period.
         *
         * _(Optional)_.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun runningTotalBillInAdvance(): Optional<Boolean> =
            Optional.ofNullable(runningTotalBillInAdvance.getNullable("runningTotalBillInAdvance"))

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /**
         * Returns the raw JSON value of [counterId].
         *
         * Unlike [counterId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("counterId") @ExcludeMissing fun _counterId(): JsonField<String> = counterId

        /**
         * Returns the raw JSON value of [pricingBands].
         *
         * Unlike [pricingBands], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pricingBands")
        @ExcludeMissing
        fun _pricingBands(): JsonField<List<PricingBand>> = pricingBands

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("startDate")
        @ExcludeMissing
        fun _startDate(): JsonField<OffsetDateTime> = startDate

        /**
         * Returns the raw JSON value of [accountingProductId].
         *
         * Unlike [accountingProductId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("accountingProductId")
        @ExcludeMissing
        fun _accountingProductId(): JsonField<String> = accountingProductId

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [cumulative].
         *
         * Unlike [cumulative], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cumulative")
        @ExcludeMissing
        fun _cumulative(): JsonField<Boolean> = cumulative

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

        /**
         * Returns the raw JSON value of [planId].
         *
         * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("planId") @ExcludeMissing fun _planId(): JsonField<String> = planId

        /**
         * Returns the raw JSON value of [planTemplateId].
         *
         * Unlike [planTemplateId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("planTemplateId")
        @ExcludeMissing
        fun _planTemplateId(): JsonField<String> = planTemplateId

        /**
         * Returns the raw JSON value of [proRateAdjustmentCredit].
         *
         * Unlike [proRateAdjustmentCredit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("proRateAdjustmentCredit")
        @ExcludeMissing
        fun _proRateAdjustmentCredit(): JsonField<Boolean> = proRateAdjustmentCredit

        /**
         * Returns the raw JSON value of [proRateAdjustmentDebit].
         *
         * Unlike [proRateAdjustmentDebit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("proRateAdjustmentDebit")
        @ExcludeMissing
        fun _proRateAdjustmentDebit(): JsonField<Boolean> = proRateAdjustmentDebit

        /**
         * Returns the raw JSON value of [proRateRunningTotal].
         *
         * Unlike [proRateRunningTotal], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("proRateRunningTotal")
        @ExcludeMissing
        fun _proRateRunningTotal(): JsonField<Boolean> = proRateRunningTotal

        /**
         * Returns the raw JSON value of [runningTotalBillInAdvance].
         *
         * Unlike [runningTotalBillInAdvance], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("runningTotalBillInAdvance")
        @ExcludeMissing
        fun _runningTotalBillInAdvance(): JsonField<Boolean> = runningTotalBillInAdvance

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .counterId()
             * .pricingBands()
             * .startDate()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var counterId: JsonField<String>? = null
            private var pricingBands: JsonField<MutableList<PricingBand>>? = null
            private var startDate: JsonField<OffsetDateTime>? = null
            private var accountingProductId: JsonField<String> = JsonMissing.of()
            private var code: JsonField<String> = JsonMissing.of()
            private var cumulative: JsonField<Boolean> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var planId: JsonField<String> = JsonMissing.of()
            private var planTemplateId: JsonField<String> = JsonMissing.of()
            private var proRateAdjustmentCredit: JsonField<Boolean> = JsonMissing.of()
            private var proRateAdjustmentDebit: JsonField<Boolean> = JsonMissing.of()
            private var proRateRunningTotal: JsonField<Boolean> = JsonMissing.of()
            private var runningTotalBillInAdvance: JsonField<Boolean> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                counterId = body.counterId
                pricingBands = body.pricingBands.map { it.toMutableList() }
                startDate = body.startDate
                accountingProductId = body.accountingProductId
                code = body.code
                cumulative = body.cumulative
                description = body.description
                endDate = body.endDate
                planId = body.planId
                planTemplateId = body.planTemplateId
                proRateAdjustmentCredit = body.proRateAdjustmentCredit
                proRateAdjustmentDebit = body.proRateAdjustmentDebit
                proRateRunningTotal = body.proRateRunningTotal
                runningTotalBillInAdvance = body.runningTotalBillInAdvance
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** UUID of the Counter used to create the pricing. */
            fun counterId(counterId: String) = counterId(JsonField.of(counterId))

            /**
             * Sets [Builder.counterId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.counterId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun counterId(counterId: JsonField<String>) = apply { this.counterId = counterId }

            fun pricingBands(pricingBands: List<PricingBand>) =
                pricingBands(JsonField.of(pricingBands))

            /**
             * Sets [Builder.pricingBands] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricingBands] with a well-typed `List<PricingBand>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun pricingBands(pricingBands: JsonField<List<PricingBand>>) = apply {
                this.pricingBands = pricingBands.map { it.toMutableList() }
            }

            /**
             * Adds a single [PricingBand] to [pricingBands].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPricingBand(pricingBand: PricingBand) = apply {
                pricingBands =
                    (pricingBands ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pricingBands", it).add(pricingBand)
                    }
            }

            /**
             * The start date _(in ISO-8601 format)_ for when the Pricing starts to be active for
             * the Plan of Plan Template._(Required)_
             */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /** Optional Product ID this Pricing should be attributed to for accounting purposes */
            fun accountingProductId(accountingProductId: String) =
                accountingProductId(JsonField.of(accountingProductId))

            /**
             * Sets [Builder.accountingProductId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountingProductId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun accountingProductId(accountingProductId: JsonField<String>) = apply {
                this.accountingProductId = accountingProductId
            }

            /** Unique short code for the Pricing. */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /**
             * Controls whether or not charge rates under a set of pricing bands configured for a
             * Pricing are applied according to each separate band or at the highest band reached.
             *
             * _(Optional)_. The default value is **FALSE**.
             * - When TRUE, at billing charge rates are applied according to each separate band.
             * - When FALSE, at billing charge rates are applied according to highest band reached.
             *
             * **NOTE:** Use the `cumulative` parameter to create the type of Pricing you require.
             * For example, for Tiered Pricing set to **TRUE**; for Volume Pricing, set to
             * **FALSE**.
             */
            fun cumulative(cumulative: Boolean) = cumulative(JsonField.of(cumulative))

            /**
             * Sets [Builder.cumulative] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cumulative] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cumulative(cumulative: JsonField<Boolean>) = apply { this.cumulative = cumulative }

            /** Displayed on Bill line items. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * The end date _(in ISO-8601 format)_ for when the Pricing ceases to be active for the
             * Plan or Plan Template.
             *
             * _(Optional)_ If not specified, the Pricing remains active indefinitely.
             */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /** UUID of the Plan the Pricing is created for. */
            fun planId(planId: String) = planId(JsonField.of(planId))

            /**
             * Sets [Builder.planId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planId(planId: JsonField<String>) = apply { this.planId = planId }

            /** UUID of the Plan Template the Pricing is created for. */
            fun planTemplateId(planTemplateId: String) =
                planTemplateId(JsonField.of(planTemplateId))

            /**
             * Sets [Builder.planTemplateId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planTemplateId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planTemplateId(planTemplateId: JsonField<String>) = apply {
                this.planTemplateId = planTemplateId
            }

            /**
             * The default value is **TRUE**.
             * - When TRUE, counter adjustment credits are prorated and are billed according to the
             *   number of days in billing period.
             * - When FALSE, counter adjustment credits are not prorated and are billed for the
             *   entire billing period.
             *
             * _(Optional)_.
             */
            fun proRateAdjustmentCredit(proRateAdjustmentCredit: Boolean) =
                proRateAdjustmentCredit(JsonField.of(proRateAdjustmentCredit))

            /**
             * Sets [Builder.proRateAdjustmentCredit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.proRateAdjustmentCredit] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun proRateAdjustmentCredit(proRateAdjustmentCredit: JsonField<Boolean>) = apply {
                this.proRateAdjustmentCredit = proRateAdjustmentCredit
            }

            /**
             * The default value is **TRUE**.
             * - When TRUE, counter adjustment debits are prorated and are billed according to the
             *   number of days in billing period.
             * - When FALSE, counter adjustment debits are not prorated and are billed for the
             *   entire billing period.
             *
             * _(Optional)_.
             */
            fun proRateAdjustmentDebit(proRateAdjustmentDebit: Boolean) =
                proRateAdjustmentDebit(JsonField.of(proRateAdjustmentDebit))

            /**
             * Sets [Builder.proRateAdjustmentDebit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.proRateAdjustmentDebit] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun proRateAdjustmentDebit(proRateAdjustmentDebit: JsonField<Boolean>) = apply {
                this.proRateAdjustmentDebit = proRateAdjustmentDebit
            }

            /**
             * The default value is **TRUE**.
             * - When TRUE, counter running total charges are prorated and are billed according to
             *   the number of days in billing period.
             * - When FALSE, counter running total charges are not prorated and are billed for the
             *   entire billing period.
             *
             * _(Optional)_.
             */
            fun proRateRunningTotal(proRateRunningTotal: Boolean) =
                proRateRunningTotal(JsonField.of(proRateRunningTotal))

            /**
             * Sets [Builder.proRateRunningTotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.proRateRunningTotal] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun proRateRunningTotal(proRateRunningTotal: JsonField<Boolean>) = apply {
                this.proRateRunningTotal = proRateRunningTotal
            }

            /**
             * The default value is **TRUE**.
             * - When TRUE, running totals are billed at the start of each billing period.
             * - When FALSE, running totals are billed at the end of each billing period.
             *
             * _(Optional)_.
             */
            fun runningTotalBillInAdvance(runningTotalBillInAdvance: Boolean) =
                runningTotalBillInAdvance(JsonField.of(runningTotalBillInAdvance))

            /**
             * Sets [Builder.runningTotalBillInAdvance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.runningTotalBillInAdvance] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun runningTotalBillInAdvance(runningTotalBillInAdvance: JsonField<Boolean>) = apply {
                this.runningTotalBillInAdvance = runningTotalBillInAdvance
            }

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
             * Sets [Builder.version] to an arbitrary JSON value.
             *
             * You should usually call [Builder.version] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .counterId()
             * .pricingBands()
             * .startDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("counterId", counterId),
                    checkRequired("pricingBands", pricingBands).map { it.toImmutable() },
                    checkRequired("startDate", startDate),
                    accountingProductId,
                    code,
                    cumulative,
                    description,
                    endDate,
                    planId,
                    planTemplateId,
                    proRateAdjustmentCredit,
                    proRateAdjustmentDebit,
                    proRateRunningTotal,
                    runningTotalBillInAdvance,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            counterId()
            pricingBands().forEach { it.validate() }
            startDate()
            accountingProductId()
            code()
            cumulative()
            description()
            endDate()
            planId()
            planTemplateId()
            proRateAdjustmentCredit()
            proRateAdjustmentDebit()
            proRateRunningTotal()
            runningTotalBillInAdvance()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (counterId.asKnown().isPresent) 1 else 0) +
                (pricingBands.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (startDate.asKnown().isPresent) 1 else 0) +
                (if (accountingProductId.asKnown().isPresent) 1 else 0) +
                (if (code.asKnown().isPresent) 1 else 0) +
                (if (cumulative.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (endDate.asKnown().isPresent) 1 else 0) +
                (if (planId.asKnown().isPresent) 1 else 0) +
                (if (planTemplateId.asKnown().isPresent) 1 else 0) +
                (if (proRateAdjustmentCredit.asKnown().isPresent) 1 else 0) +
                (if (proRateAdjustmentDebit.asKnown().isPresent) 1 else 0) +
                (if (proRateRunningTotal.asKnown().isPresent) 1 else 0) +
                (if (runningTotalBillInAdvance.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && counterId == other.counterId && pricingBands == other.pricingBands && startDate == other.startDate && accountingProductId == other.accountingProductId && code == other.code && cumulative == other.cumulative && description == other.description && endDate == other.endDate && planId == other.planId && planTemplateId == other.planTemplateId && proRateAdjustmentCredit == other.proRateAdjustmentCredit && proRateAdjustmentDebit == other.proRateAdjustmentDebit && proRateRunningTotal == other.proRateRunningTotal && runningTotalBillInAdvance == other.runningTotalBillInAdvance && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(counterId, pricingBands, startDate, accountingProductId, code, cumulative, description, endDate, planId, planTemplateId, proRateAdjustmentCredit, proRateAdjustmentDebit, proRateRunningTotal, runningTotalBillInAdvance, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{counterId=$counterId, pricingBands=$pricingBands, startDate=$startDate, accountingProductId=$accountingProductId, code=$code, cumulative=$cumulative, description=$description, endDate=$endDate, planId=$planId, planTemplateId=$planTemplateId, proRateAdjustmentCredit=$proRateAdjustmentCredit, proRateAdjustmentDebit=$proRateAdjustmentDebit, proRateRunningTotal=$proRateRunningTotal, runningTotalBillInAdvance=$runningTotalBillInAdvance, version=$version, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterPricingUpdateParams && orgId == other.orgId && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CounterPricingUpdateParams{orgId=$orgId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
