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
import com.m3ter.core.checkKnown
import com.m3ter.core.checkRequired
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ContractResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<String>,
    private val applyContractPeriodLimits: JsonField<Boolean>,
    private val billGroupingKeyId: JsonField<String>,
    private val code: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val customFields: JsonField<CustomFields>,
    private val description: JsonField<String>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val endDate: JsonField<LocalDate>,
    private val lastModifiedBy: JsonField<String>,
    private val name: JsonField<String>,
    private val purchaseOrderNumber: JsonField<String>,
    private val startDate: JsonField<LocalDate>,
    private val usageFilters: JsonField<List<UsageFilter>>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountId") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("applyContractPeriodLimits")
        @ExcludeMissing
        applyContractPeriodLimits: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("billGroupingKeyId")
        @ExcludeMissing
        billGroupingKeyId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customFields")
        @ExcludeMissing
        customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("endDate") @ExcludeMissing endDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("purchaseOrderNumber")
        @ExcludeMissing
        purchaseOrderNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("startDate")
        @ExcludeMissing
        startDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("usageFilters")
        @ExcludeMissing
        usageFilters: JsonField<List<UsageFilter>> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        applyContractPeriodLimits,
        billGroupingKeyId,
        code,
        createdBy,
        customFields,
        description,
        dtCreated,
        dtLastModified,
        endDate,
        lastModifiedBy,
        name,
        purchaseOrderNumber,
        startDate,
        usageFilters,
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
     * The unique identifier (UUID) of the Account associated with this Contract.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountId(): Optional<String> = accountId.getOptional("accountId")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applyContractPeriodLimits(): Optional<Boolean> =
        applyContractPeriodLimits.getOptional("applyContractPeriodLimits")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billGroupingKeyId(): Optional<String> = billGroupingKeyId.getOptional("billGroupingKeyId")

    /**
     * The short code of the Contract.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<String> = code.getOptional("code")

    /**
     * The unique identifier (UUID) of the user who created this Contract.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * User defined fields enabling you to attach custom data. The value for a custom field can be
     * either a string or a number.
     *
     * If `customFields` can also be defined for this entity at the Organizational
     * level,`customField` values defined at individual level override values of `customFields` with
     * the same name defined at Organization level.
     *
     * See
     * [Working with Custom Fields](https://www.m3ter.com/docs/guides/creating-and-managing-products/working-with-custom-fields)
     * in the m3ter documentation for more information.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<CustomFields> = customFields.getOptional("customFields")

    /**
     * The description of the Contract, which provides context and information.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The date and time *(in ISO-8601 format)* when the Contract was created.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The date and time *(in ISO-8601 format)* when the Contract was last modified.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * The exclusive end date of the Contract *(in ISO-8601 format)*. This means the Contract is
     * active until midnight on the day ***before*** this date.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endDate(): Optional<LocalDate> = endDate.getOptional("endDate")

    /**
     * The unique identifier (UUID) of the user who last modified this Contract.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * The name of the Contract.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The Purchase Order Number associated with the Contract.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun purchaseOrderNumber(): Optional<String> =
        purchaseOrderNumber.getOptional("purchaseOrderNumber")

    /**
     * The start date for the Contract *(in ISO-8601 format)*. This date is inclusive, meaning the
     * Contract is active from this date onward.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startDate(): Optional<LocalDate> = startDate.getOptional("startDate")

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usageFilters(): Optional<List<UsageFilter>> = usageFilters.getOptional("usageFilters")

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
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [applyContractPeriodLimits].
     *
     * Unlike [applyContractPeriodLimits], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("applyContractPeriodLimits")
    @ExcludeMissing
    fun _applyContractPeriodLimits(): JsonField<Boolean> = applyContractPeriodLimits

    /**
     * Returns the raw JSON value of [billGroupingKeyId].
     *
     * Unlike [billGroupingKeyId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("billGroupingKeyId")
    @ExcludeMissing
    fun _billGroupingKeyId(): JsonField<String> = billGroupingKeyId

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customFields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

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
     * Returns the raw JSON value of [endDate].
     *
     * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("endDate") @ExcludeMissing fun _endDate(): JsonField<LocalDate> = endDate

    /**
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [purchaseOrderNumber].
     *
     * Unlike [purchaseOrderNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("purchaseOrderNumber")
    @ExcludeMissing
    fun _purchaseOrderNumber(): JsonField<String> = purchaseOrderNumber

    /**
     * Returns the raw JSON value of [startDate].
     *
     * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("startDate") @ExcludeMissing fun _startDate(): JsonField<LocalDate> = startDate

    /**
     * Returns the raw JSON value of [usageFilters].
     *
     * Unlike [usageFilters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usageFilters")
    @ExcludeMissing
    fun _usageFilters(): JsonField<List<UsageFilter>> = usageFilters

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
         * Returns a mutable builder for constructing an instance of [ContractResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String> = JsonMissing.of()
        private var applyContractPeriodLimits: JsonField<Boolean> = JsonMissing.of()
        private var billGroupingKeyId: JsonField<String> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endDate: JsonField<LocalDate> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var purchaseOrderNumber: JsonField<String> = JsonMissing.of()
        private var startDate: JsonField<LocalDate> = JsonMissing.of()
        private var usageFilters: JsonField<MutableList<UsageFilter>>? = null
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractResponse: ContractResponse) = apply {
            id = contractResponse.id
            accountId = contractResponse.accountId
            applyContractPeriodLimits = contractResponse.applyContractPeriodLimits
            billGroupingKeyId = contractResponse.billGroupingKeyId
            code = contractResponse.code
            createdBy = contractResponse.createdBy
            customFields = contractResponse.customFields
            description = contractResponse.description
            dtCreated = contractResponse.dtCreated
            dtLastModified = contractResponse.dtLastModified
            endDate = contractResponse.endDate
            lastModifiedBy = contractResponse.lastModifiedBy
            name = contractResponse.name
            purchaseOrderNumber = contractResponse.purchaseOrderNumber
            startDate = contractResponse.startDate
            usageFilters = contractResponse.usageFilters.map { it.toMutableList() }
            version = contractResponse.version
            additionalProperties = contractResponse.additionalProperties.toMutableMap()
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

        /** The unique identifier (UUID) of the Account associated with this Contract. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        fun applyContractPeriodLimits(applyContractPeriodLimits: Boolean) =
            applyContractPeriodLimits(JsonField.of(applyContractPeriodLimits))

        /**
         * Sets [Builder.applyContractPeriodLimits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applyContractPeriodLimits] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun applyContractPeriodLimits(applyContractPeriodLimits: JsonField<Boolean>) = apply {
            this.applyContractPeriodLimits = applyContractPeriodLimits
        }

        fun billGroupingKeyId(billGroupingKeyId: String) =
            billGroupingKeyId(JsonField.of(billGroupingKeyId))

        /**
         * Sets [Builder.billGroupingKeyId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billGroupingKeyId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billGroupingKeyId(billGroupingKeyId: JsonField<String>) = apply {
            this.billGroupingKeyId = billGroupingKeyId
        }

        /** The short code of the Contract. */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** The unique identifier (UUID) of the user who created this Contract. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /**
         * User defined fields enabling you to attach custom data. The value for a custom field can
         * be either a string or a number.
         *
         * If `customFields` can also be defined for this entity at the Organizational
         * level,`customField` values defined at individual level override values of `customFields`
         * with the same name defined at Organization level.
         *
         * See
         * [Working with Custom Fields](https://www.m3ter.com/docs/guides/creating-and-managing-products/working-with-custom-fields)
         * in the m3ter documentation for more information.
         */
        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        /** The description of the Contract, which provides context and information. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The date and time *(in ISO-8601 format)* when the Contract was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The date and time *(in ISO-8601 format)* when the Contract was last modified. */
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

        /**
         * The exclusive end date of the Contract *(in ISO-8601 format)*. This means the Contract is
         * active until midnight on the day ***before*** this date.
         */
        fun endDate(endDate: LocalDate) = endDate(JsonField.of(endDate))

        /**
         * Sets [Builder.endDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endDate(endDate: JsonField<LocalDate>) = apply { this.endDate = endDate }

        /** The unique identifier (UUID) of the user who last modified this Contract. */
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

        /** The name of the Contract. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The Purchase Order Number associated with the Contract. */
        fun purchaseOrderNumber(purchaseOrderNumber: String) =
            purchaseOrderNumber(JsonField.of(purchaseOrderNumber))

        /**
         * Sets [Builder.purchaseOrderNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purchaseOrderNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun purchaseOrderNumber(purchaseOrderNumber: JsonField<String>) = apply {
            this.purchaseOrderNumber = purchaseOrderNumber
        }

        /**
         * The start date for the Contract *(in ISO-8601 format)*. This date is inclusive, meaning
         * the Contract is active from this date onward.
         */
        fun startDate(startDate: LocalDate) = startDate(JsonField.of(startDate))

        /**
         * Sets [Builder.startDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun startDate(startDate: JsonField<LocalDate>) = apply { this.startDate = startDate }

        fun usageFilters(usageFilters: List<UsageFilter>) = usageFilters(JsonField.of(usageFilters))

        /**
         * Sets [Builder.usageFilters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usageFilters] with a well-typed `List<UsageFilter>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun usageFilters(usageFilters: JsonField<List<UsageFilter>>) = apply {
            this.usageFilters = usageFilters.map { it.toMutableList() }
        }

        /**
         * Adds a single [UsageFilter] to [usageFilters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUsageFilter(usageFilter: UsageFilter) = apply {
            usageFilters =
                (usageFilters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("usageFilters", it).add(usageFilter)
                }
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
         * Returns an immutable instance of [ContractResponse].
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
        fun build(): ContractResponse =
            ContractResponse(
                checkRequired("id", id),
                accountId,
                applyContractPeriodLimits,
                billGroupingKeyId,
                code,
                createdBy,
                customFields,
                description,
                dtCreated,
                dtLastModified,
                endDate,
                lastModifiedBy,
                name,
                purchaseOrderNumber,
                startDate,
                (usageFilters ?: JsonMissing.of()).map { it.toImmutable() },
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContractResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        applyContractPeriodLimits()
        billGroupingKeyId()
        code()
        createdBy()
        customFields().ifPresent { it.validate() }
        description()
        dtCreated()
        dtLastModified()
        endDate()
        lastModifiedBy()
        name()
        purchaseOrderNumber()
        startDate()
        usageFilters().ifPresent { it.forEach { it.validate() } }
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
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (applyContractPeriodLimits.asKnown().isPresent) 1 else 0) +
            (if (billGroupingKeyId.asKnown().isPresent) 1 else 0) +
            (if (code.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (customFields.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (endDate.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (purchaseOrderNumber.asKnown().isPresent) 1 else 0) +
            (if (startDate.asKnown().isPresent) 1 else 0) +
            (usageFilters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    /**
     * User defined fields enabling you to attach custom data. The value for a custom field can be
     * either a string or a number.
     *
     * If `customFields` can also be defined for this entity at the Organizational
     * level,`customField` values defined at individual level override values of `customFields` with
     * the same name defined at Organization level.
     *
     * See
     * [Working with Custom Fields](https://www.m3ter.com/docs/guides/creating-and-managing-products/working-with-custom-fields)
     * in the m3ter documentation for more information.
     */
    class CustomFields
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CustomFields]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomFields]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties = customFields.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [CustomFields].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomFields && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    /** Filters that determine which usage records are included in contract billing */
    class UsageFilter
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dimensionCode: JsonField<String>,
        private val mode: JsonField<Mode>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("dimensionCode")
            @ExcludeMissing
            dimensionCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mode") @ExcludeMissing mode: JsonField<Mode> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(dimensionCode, mode, value, mutableMapOf())

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dimensionCode(): String = dimensionCode.getRequired("dimensionCode")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun mode(): Mode = mode.getRequired("mode")

        /**
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): String = value.getRequired("value")

        /**
         * Returns the raw JSON value of [dimensionCode].
         *
         * Unlike [dimensionCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dimensionCode")
        @ExcludeMissing
        fun _dimensionCode(): JsonField<String> = dimensionCode

        /**
         * Returns the raw JSON value of [mode].
         *
         * Unlike [mode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mode") @ExcludeMissing fun _mode(): JsonField<Mode> = mode

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
             * Returns a mutable builder for constructing an instance of [UsageFilter].
             *
             * The following fields are required:
             * ```java
             * .dimensionCode()
             * .mode()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [UsageFilter]. */
        class Builder internal constructor() {

            private var dimensionCode: JsonField<String>? = null
            private var mode: JsonField<Mode>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usageFilter: UsageFilter) = apply {
                dimensionCode = usageFilter.dimensionCode
                mode = usageFilter.mode
                value = usageFilter.value
                additionalProperties = usageFilter.additionalProperties.toMutableMap()
            }

            fun dimensionCode(dimensionCode: String) = dimensionCode(JsonField.of(dimensionCode))

            /**
             * Sets [Builder.dimensionCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensionCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dimensionCode(dimensionCode: JsonField<String>) = apply {
                this.dimensionCode = dimensionCode
            }

            fun mode(mode: Mode) = mode(JsonField.of(mode))

            /**
             * Sets [Builder.mode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mode] with a well-typed [Mode] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mode(mode: JsonField<Mode>) = apply { this.mode = mode }

            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [UsageFilter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .dimensionCode()
             * .mode()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UsageFilter =
                UsageFilter(
                    checkRequired("dimensionCode", dimensionCode),
                    checkRequired("mode", mode),
                    checkRequired("value", value),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UsageFilter = apply {
            if (validated) {
                return@apply
            }

            dimensionCode()
            mode().validate()
            value()
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
            (if (dimensionCode.asKnown().isPresent) 1 else 0) +
                (mode.asKnown().getOrNull()?.validity() ?: 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        class Mode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val INCLUDE = of("INCLUDE")

                @JvmField val EXCLUDE = of("EXCLUDE")

                @JvmStatic fun of(value: String) = Mode(JsonField.of(value))
            }

            /** An enum containing [Mode]'s known values. */
            enum class Known {
                INCLUDE,
                EXCLUDE,
            }

            /**
             * An enum containing [Mode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Mode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INCLUDE,
                EXCLUDE,
                /** An enum member indicating that [Mode] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    INCLUDE -> Value.INCLUDE
                    EXCLUDE -> Value.EXCLUDE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws M3terInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    INCLUDE -> Known.INCLUDE
                    EXCLUDE -> Known.EXCLUDE
                    else -> throw M3terInvalidDataException("Unknown Mode: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws M3terInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    M3terInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Mode = apply {
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

                return other is Mode && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UsageFilter &&
                dimensionCode == other.dimensionCode &&
                mode == other.mode &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(dimensionCode, mode, value, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UsageFilter{dimensionCode=$dimensionCode, mode=$mode, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractResponse &&
            id == other.id &&
            accountId == other.accountId &&
            applyContractPeriodLimits == other.applyContractPeriodLimits &&
            billGroupingKeyId == other.billGroupingKeyId &&
            code == other.code &&
            createdBy == other.createdBy &&
            customFields == other.customFields &&
            description == other.description &&
            dtCreated == other.dtCreated &&
            dtLastModified == other.dtLastModified &&
            endDate == other.endDate &&
            lastModifiedBy == other.lastModifiedBy &&
            name == other.name &&
            purchaseOrderNumber == other.purchaseOrderNumber &&
            startDate == other.startDate &&
            usageFilters == other.usageFilters &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountId,
            applyContractPeriodLimits,
            billGroupingKeyId,
            code,
            createdBy,
            customFields,
            description,
            dtCreated,
            dtLastModified,
            endDate,
            lastModifiedBy,
            name,
            purchaseOrderNumber,
            startDate,
            usageFilters,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContractResponse{id=$id, accountId=$accountId, applyContractPeriodLimits=$applyContractPeriodLimits, billGroupingKeyId=$billGroupingKeyId, code=$code, createdBy=$createdBy, customFields=$customFields, description=$description, dtCreated=$dtCreated, dtLastModified=$dtLastModified, endDate=$endDate, lastModifiedBy=$lastModifiedBy, name=$name, purchaseOrderNumber=$purchaseOrderNumber, startDate=$startDate, usageFilters=$usageFilters, version=$version, additionalProperties=$additionalProperties}"
}
