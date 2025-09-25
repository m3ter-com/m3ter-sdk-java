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
import com.m3ter.core.Params
import com.m3ter.core.checkRequired
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Add a Transaction to a Balance. This endpoint allows you to create a new Transaction amount for a
 * Balance. This amount then becomes available at billing for draw-down to cover charges due. The
 * Transaction details should be provided in the request body.
 *
 * Before you can add a Transaction amount, you must first set up Transaction Types at the
 * Organization Level - see the
 * [Transaction Type](https://www.m3ter.com/docs/api#tag/TransactionType) section in this API
 * Reference for more details. You can then use this call to add an instance of a Transaction Type
 * to a Balance.
 *
 * **Note:** If you have a customer whose payment is in a different currency to the Balance
 * currency, you can use the `paid` and `paidCurrency` request parameters to record the amount paid
 * and alternative currency respectively. For example, you might add a Transaction amount of 200 USD
 * to a Balance on a customer Account where the customer actually paid you 50 units in virtual
 * currency X.
 */
class BalanceTransactionCreateParams
private constructor(
    private val orgId: String?,
    private val balanceId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun balanceId(): Optional<String> = Optional.ofNullable(balanceId)

    /**
     * The financial value of the transaction.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Double = body.amount()

    /**
     * The date *(in ISO 8601 format)* when the Balance transaction was applied.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun appliedDate(): Optional<OffsetDateTime> = body.appliedDate()

    /**
     * The currency code of the payment if it differs from the Balance currency. For example: USD,
     * GBP or EUR.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyPaid(): Optional<String> = body.currencyPaid()

    /**
     * A brief description explaining the purpose and context of the transaction.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * The payment amount if the payment currency differs from the Balance currency.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paid(): Optional<Double> = body.paid()

    /**
     * The date *(in ISO 8601 format)* when the transaction occurred.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionDate(): Optional<OffsetDateTime> = body.transactionDate()

    /**
     * The unique identifier (UUID) of the transaction type. This is obtained from the list of
     * created Transaction Types within the Organization Configuration.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionTypeId(): Optional<String> = body.transactionTypeId()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - *do not use for Create*.
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
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Double> = body._amount()

    /**
     * Returns the raw JSON value of [appliedDate].
     *
     * Unlike [appliedDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _appliedDate(): JsonField<OffsetDateTime> = body._appliedDate()

    /**
     * Returns the raw JSON value of [currencyPaid].
     *
     * Unlike [currencyPaid], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currencyPaid(): JsonField<String> = body._currencyPaid()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [paid].
     *
     * Unlike [paid], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _paid(): JsonField<Double> = body._paid()

    /**
     * Returns the raw JSON value of [transactionDate].
     *
     * Unlike [transactionDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _transactionDate(): JsonField<OffsetDateTime> = body._transactionDate()

    /**
     * Returns the raw JSON value of [transactionTypeId].
     *
     * Unlike [transactionTypeId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _transactionTypeId(): JsonField<String> = body._transactionTypeId()

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BalanceTransactionCreateParams].
         *
         * The following fields are required:
         * ```java
         * .amount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceTransactionCreateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var balanceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(balanceTransactionCreateParams: BalanceTransactionCreateParams) = apply {
            orgId = balanceTransactionCreateParams.orgId
            balanceId = balanceTransactionCreateParams.balanceId
            body = balanceTransactionCreateParams.body.toBuilder()
            additionalHeaders = balanceTransactionCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = balanceTransactionCreateParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun balanceId(balanceId: String?) = apply { this.balanceId = balanceId }

        /** Alias for calling [Builder.balanceId] with `balanceId.orElse(null)`. */
        fun balanceId(balanceId: Optional<String>) = balanceId(balanceId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [amount]
         * - [appliedDate]
         * - [currencyPaid]
         * - [description]
         * - [paid]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The financial value of the transaction. */
        fun amount(amount: Double) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { body.amount(amount) }

        /** The date *(in ISO 8601 format)* when the Balance transaction was applied. */
        fun appliedDate(appliedDate: OffsetDateTime) = apply { body.appliedDate(appliedDate) }

        /**
         * Sets [Builder.appliedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appliedDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun appliedDate(appliedDate: JsonField<OffsetDateTime>) = apply {
            body.appliedDate(appliedDate)
        }

        /**
         * The currency code of the payment if it differs from the Balance currency. For example:
         * USD, GBP or EUR.
         */
        fun currencyPaid(currencyPaid: String) = apply { body.currencyPaid(currencyPaid) }

        /**
         * Sets [Builder.currencyPaid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyPaid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyPaid(currencyPaid: JsonField<String>) = apply {
            body.currencyPaid(currencyPaid)
        }

        /** A brief description explaining the purpose and context of the transaction. */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The payment amount if the payment currency differs from the Balance currency. */
        fun paid(paid: Double) = apply { body.paid(paid) }

        /**
         * Sets [Builder.paid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paid] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun paid(paid: JsonField<Double>) = apply { body.paid(paid) }

        /** The date *(in ISO 8601 format)* when the transaction occurred. */
        fun transactionDate(transactionDate: OffsetDateTime) = apply {
            body.transactionDate(transactionDate)
        }

        /**
         * Sets [Builder.transactionDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun transactionDate(transactionDate: JsonField<OffsetDateTime>) = apply {
            body.transactionDate(transactionDate)
        }

        /**
         * The unique identifier (UUID) of the transaction type. This is obtained from the list of
         * created Transaction Types within the Organization Configuration.
         */
        fun transactionTypeId(transactionTypeId: String) = apply {
            body.transactionTypeId(transactionTypeId)
        }

        /**
         * Sets [Builder.transactionTypeId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionTypeId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transactionTypeId(transactionTypeId: JsonField<String>) = apply {
            body.transactionTypeId(transactionTypeId)
        }

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - *do not use for
         *   Create*. On initial Create, version is set at 1 and listed in the response.
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
         * Returns an immutable instance of [BalanceTransactionCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .amount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BalanceTransactionCreateParams =
            BalanceTransactionCreateParams(
                orgId,
                balanceId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            1 -> balanceId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val amount: JsonField<Double>,
        private val appliedDate: JsonField<OffsetDateTime>,
        private val currencyPaid: JsonField<String>,
        private val description: JsonField<String>,
        private val paid: JsonField<Double>,
        private val transactionDate: JsonField<OffsetDateTime>,
        private val transactionTypeId: JsonField<String>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("appliedDate")
            @ExcludeMissing
            appliedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("currencyPaid")
            @ExcludeMissing
            currencyPaid: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("paid") @ExcludeMissing paid: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("transactionDate")
            @ExcludeMissing
            transactionDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("transactionTypeId")
            @ExcludeMissing
            transactionTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            amount,
            appliedDate,
            currencyPaid,
            description,
            paid,
            transactionDate,
            transactionTypeId,
            version,
            mutableMapOf(),
        )

        /**
         * The financial value of the transaction.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Double = amount.getRequired("amount")

        /**
         * The date *(in ISO 8601 format)* when the Balance transaction was applied.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun appliedDate(): Optional<OffsetDateTime> = appliedDate.getOptional("appliedDate")

        /**
         * The currency code of the payment if it differs from the Balance currency. For example:
         * USD, GBP or EUR.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun currencyPaid(): Optional<String> = currencyPaid.getOptional("currencyPaid")

        /**
         * A brief description explaining the purpose and context of the transaction.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * The payment amount if the payment currency differs from the Balance currency.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paid(): Optional<Double> = paid.getOptional("paid")

        /**
         * The date *(in ISO 8601 format)* when the transaction occurred.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transactionDate(): Optional<OffsetDateTime> =
            transactionDate.getOptional("transactionDate")

        /**
         * The unique identifier (UUID) of the transaction type. This is obtained from the list of
         * created Transaction Types within the Organization Configuration.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun transactionTypeId(): Optional<String> =
            transactionTypeId.getOptional("transactionTypeId")

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - *do not use for
         *   Create*. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun version(): Optional<Long> = version.getOptional("version")

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [appliedDate].
         *
         * Unlike [appliedDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("appliedDate")
        @ExcludeMissing
        fun _appliedDate(): JsonField<OffsetDateTime> = appliedDate

        /**
         * Returns the raw JSON value of [currencyPaid].
         *
         * Unlike [currencyPaid], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("currencyPaid")
        @ExcludeMissing
        fun _currencyPaid(): JsonField<String> = currencyPaid

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [paid].
         *
         * Unlike [paid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("paid") @ExcludeMissing fun _paid(): JsonField<Double> = paid

        /**
         * Returns the raw JSON value of [transactionDate].
         *
         * Unlike [transactionDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transactionDate")
        @ExcludeMissing
        fun _transactionDate(): JsonField<OffsetDateTime> = transactionDate

        /**
         * Returns the raw JSON value of [transactionTypeId].
         *
         * Unlike [transactionTypeId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("transactionTypeId")
        @ExcludeMissing
        fun _transactionTypeId(): JsonField<String> = transactionTypeId

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
             * .amount()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var amount: JsonField<Double>? = null
            private var appliedDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currencyPaid: JsonField<String> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var paid: JsonField<Double> = JsonMissing.of()
            private var transactionDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transactionTypeId: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                amount = body.amount
                appliedDate = body.appliedDate
                currencyPaid = body.currencyPaid
                description = body.description
                paid = body.paid
                transactionDate = body.transactionDate
                transactionTypeId = body.transactionTypeId
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The financial value of the transaction. */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** The date *(in ISO 8601 format)* when the Balance transaction was applied. */
            fun appliedDate(appliedDate: OffsetDateTime) = appliedDate(JsonField.of(appliedDate))

            /**
             * Sets [Builder.appliedDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appliedDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun appliedDate(appliedDate: JsonField<OffsetDateTime>) = apply {
                this.appliedDate = appliedDate
            }

            /**
             * The currency code of the payment if it differs from the Balance currency. For
             * example: USD, GBP or EUR.
             */
            fun currencyPaid(currencyPaid: String) = currencyPaid(JsonField.of(currencyPaid))

            /**
             * Sets [Builder.currencyPaid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencyPaid] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencyPaid(currencyPaid: JsonField<String>) = apply {
                this.currencyPaid = currencyPaid
            }

            /** A brief description explaining the purpose and context of the transaction. */
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

            /** The payment amount if the payment currency differs from the Balance currency. */
            fun paid(paid: Double) = paid(JsonField.of(paid))

            /**
             * Sets [Builder.paid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paid] with a well-typed [Double] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun paid(paid: JsonField<Double>) = apply { this.paid = paid }

            /** The date *(in ISO 8601 format)* when the transaction occurred. */
            fun transactionDate(transactionDate: OffsetDateTime) =
                transactionDate(JsonField.of(transactionDate))

            /**
             * Sets [Builder.transactionDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun transactionDate(transactionDate: JsonField<OffsetDateTime>) = apply {
                this.transactionDate = transactionDate
            }

            /**
             * The unique identifier (UUID) of the transaction type. This is obtained from the list
             * of created Transaction Types within the Organization Configuration.
             */
            fun transactionTypeId(transactionTypeId: String) =
                transactionTypeId(JsonField.of(transactionTypeId))

            /**
             * Sets [Builder.transactionTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transactionTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transactionTypeId(transactionTypeId: JsonField<String>) = apply {
                this.transactionTypeId = transactionTypeId
            }

            /**
             * The version number of the entity:
             * - **Create entity:** Not valid for initial insertion of new entity - *do not use for
             *   Create*. On initial Create, version is set at 1 and listed in the response.
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
             * .amount()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("amount", amount),
                    appliedDate,
                    currencyPaid,
                    description,
                    paid,
                    transactionDate,
                    transactionTypeId,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            amount()
            appliedDate()
            currencyPaid()
            description()
            paid()
            transactionDate()
            transactionTypeId()
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
            (if (amount.asKnown().isPresent) 1 else 0) +
                (if (appliedDate.asKnown().isPresent) 1 else 0) +
                (if (currencyPaid.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (paid.asKnown().isPresent) 1 else 0) +
                (if (transactionDate.asKnown().isPresent) 1 else 0) +
                (if (transactionTypeId.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                amount == other.amount &&
                appliedDate == other.appliedDate &&
                currencyPaid == other.currencyPaid &&
                description == other.description &&
                paid == other.paid &&
                transactionDate == other.transactionDate &&
                transactionTypeId == other.transactionTypeId &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                amount,
                appliedDate,
                currencyPaid,
                description,
                paid,
                transactionDate,
                transactionTypeId,
                version,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amount=$amount, appliedDate=$appliedDate, currencyPaid=$currencyPaid, description=$description, paid=$paid, transactionDate=$transactionDate, transactionTypeId=$transactionTypeId, version=$version, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceTransactionCreateParams &&
            orgId == other.orgId &&
            balanceId == other.balanceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(orgId, balanceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BalanceTransactionCreateParams{orgId=$orgId, balanceId=$balanceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
