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
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

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
    private val orgId: String,
    private val balanceId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    fun balanceId(): String = balanceId

    /** The financial value of the transaction. */
    fun amount(): Double = body.amount()

    /** The date _(in ISO 8601 format)_ when the Balance transaction was applied. */
    fun appliedDate(): Optional<OffsetDateTime> = body.appliedDate()

    /**
     * The currency code of the payment if it differs from the Balance currency. For example: USD,
     * GBP or EUR.
     */
    fun currencyPaid(): Optional<String> = body.currencyPaid()

    /** A brief description explaining the purpose and context of the transaction. */
    fun description(): Optional<String> = body.description()

    /** The payment amount if the payment currency differs from the Balance currency. */
    fun paid(): Optional<Double> = body.paid()

    /** The date _(in ISO 8601 format)_ when the transaction occurred. */
    fun transactionDate(): Optional<OffsetDateTime> = body.transactionDate()

    /**
     * The unique identifier (UUID) of the transaction type. This is obtained from the list of
     * created Transaction Types within the Organization Configuration.
     */
    fun transactionTypeId(): Optional<String> = body.transactionTypeId()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun version(): Optional<Long> = body.version()

    /** The financial value of the transaction. */
    fun _amount(): JsonField<Double> = body._amount()

    /** The date _(in ISO 8601 format)_ when the Balance transaction was applied. */
    fun _appliedDate(): JsonField<OffsetDateTime> = body._appliedDate()

    /**
     * The currency code of the payment if it differs from the Balance currency. For example: USD,
     * GBP or EUR.
     */
    fun _currencyPaid(): JsonField<String> = body._currencyPaid()

    /** A brief description explaining the purpose and context of the transaction. */
    fun _description(): JsonField<String> = body._description()

    /** The payment amount if the payment currency differs from the Balance currency. */
    fun _paid(): JsonField<Double> = body._paid()

    /** The date _(in ISO 8601 format)_ when the transaction occurred. */
    fun _transactionDate(): JsonField<OffsetDateTime> = body._transactionDate()

    /**
     * The unique identifier (UUID) of the transaction type. This is obtained from the list of
     * created Transaction Types within the Organization Configuration.
     */
    fun _transactionTypeId(): JsonField<String> = body._transactionTypeId()

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
            1 -> balanceId
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
        @JsonProperty("appliedDate")
        @ExcludeMissing
        private val appliedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currencyPaid")
        @ExcludeMissing
        private val currencyPaid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("paid")
        @ExcludeMissing
        private val paid: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("transactionDate")
        @ExcludeMissing
        private val transactionDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("transactionTypeId")
        @ExcludeMissing
        private val transactionTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The financial value of the transaction. */
        fun amount(): Double = amount.getRequired("amount")

        /** The date _(in ISO 8601 format)_ when the Balance transaction was applied. */
        fun appliedDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(appliedDate.getNullable("appliedDate"))

        /**
         * The currency code of the payment if it differs from the Balance currency. For example:
         * USD, GBP or EUR.
         */
        fun currencyPaid(): Optional<String> =
            Optional.ofNullable(currencyPaid.getNullable("currencyPaid"))

        /** A brief description explaining the purpose and context of the transaction. */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** The payment amount if the payment currency differs from the Balance currency. */
        fun paid(): Optional<Double> = Optional.ofNullable(paid.getNullable("paid"))

        /** The date _(in ISO 8601 format)_ when the transaction occurred. */
        fun transactionDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(transactionDate.getNullable("transactionDate"))

        /**
         * The unique identifier (UUID) of the transaction type. This is obtained from the list of
         * created Transaction Types within the Organization Configuration.
         */
        fun transactionTypeId(): Optional<String> =
            Optional.ofNullable(transactionTypeId.getNullable("transactionTypeId"))

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /** The financial value of the transaction. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /** The date _(in ISO 8601 format)_ when the Balance transaction was applied. */
        @JsonProperty("appliedDate")
        @ExcludeMissing
        fun _appliedDate(): JsonField<OffsetDateTime> = appliedDate

        /**
         * The currency code of the payment if it differs from the Balance currency. For example:
         * USD, GBP or EUR.
         */
        @JsonProperty("currencyPaid")
        @ExcludeMissing
        fun _currencyPaid(): JsonField<String> = currencyPaid

        /** A brief description explaining the purpose and context of the transaction. */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** The payment amount if the payment currency differs from the Balance currency. */
        @JsonProperty("paid") @ExcludeMissing fun _paid(): JsonField<Double> = paid

        /** The date _(in ISO 8601 format)_ when the transaction occurred. */
        @JsonProperty("transactionDate")
        @ExcludeMissing
        fun _transactionDate(): JsonField<OffsetDateTime> = transactionDate

        /**
         * The unique identifier (UUID) of the transaction type. This is obtained from the list of
         * created Transaction Types within the Organization Configuration.
         */
        @JsonProperty("transactionTypeId")
        @ExcludeMissing
        fun _transactionTypeId(): JsonField<String> = transactionTypeId

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
            appliedDate()
            currencyPaid()
            description()
            paid()
            transactionDate()
            transactionTypeId()
            version()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** The financial value of the transaction. */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /** The date _(in ISO 8601 format)_ when the Balance transaction was applied. */
            fun appliedDate(appliedDate: OffsetDateTime) = appliedDate(JsonField.of(appliedDate))

            /** The date _(in ISO 8601 format)_ when the Balance transaction was applied. */
            fun appliedDate(appliedDate: JsonField<OffsetDateTime>) = apply {
                this.appliedDate = appliedDate
            }

            /**
             * The currency code of the payment if it differs from the Balance currency. For
             * example: USD, GBP or EUR.
             */
            fun currencyPaid(currencyPaid: String) = currencyPaid(JsonField.of(currencyPaid))

            /**
             * The currency code of the payment if it differs from the Balance currency. For
             * example: USD, GBP or EUR.
             */
            fun currencyPaid(currencyPaid: JsonField<String>) = apply {
                this.currencyPaid = currencyPaid
            }

            /** A brief description explaining the purpose and context of the transaction. */
            fun description(description: String) = description(JsonField.of(description))

            /** A brief description explaining the purpose and context of the transaction. */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** The payment amount if the payment currency differs from the Balance currency. */
            fun paid(paid: Double) = paid(JsonField.of(paid))

            /** The payment amount if the payment currency differs from the Balance currency. */
            fun paid(paid: JsonField<Double>) = apply { this.paid = paid }

            /** The date _(in ISO 8601 format)_ when the transaction occurred. */
            fun transactionDate(transactionDate: OffsetDateTime) =
                transactionDate(JsonField.of(transactionDate))

            /** The date _(in ISO 8601 format)_ when the transaction occurred. */
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
             * The unique identifier (UUID) of the transaction type. This is obtained from the list
             * of created Transaction Types within the Organization Configuration.
             */
            fun transactionTypeId(transactionTypeId: JsonField<String>) = apply {
                this.transactionTypeId = transactionTypeId
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
                    appliedDate,
                    currencyPaid,
                    description,
                    paid,
                    transactionDate,
                    transactionTypeId,
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && amount == other.amount && appliedDate == other.appliedDate && currencyPaid == other.currencyPaid && description == other.description && paid == other.paid && transactionDate == other.transactionDate && transactionTypeId == other.transactionTypeId && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, appliedDate, currencyPaid, description, paid, transactionDate, transactionTypeId, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{amount=$amount, appliedDate=$appliedDate, currencyPaid=$currencyPaid, description=$description, paid=$paid, transactionDate=$transactionDate, transactionTypeId=$transactionTypeId, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceTransactionCreateParams]. */
    @NoAutoDetect
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

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        fun balanceId(balanceId: String) = apply { this.balanceId = balanceId }

        /** The financial value of the transaction. */
        fun amount(amount: Double) = apply { body.amount(amount) }

        /** The financial value of the transaction. */
        fun amount(amount: JsonField<Double>) = apply { body.amount(amount) }

        /** The date _(in ISO 8601 format)_ when the Balance transaction was applied. */
        fun appliedDate(appliedDate: OffsetDateTime) = apply { body.appliedDate(appliedDate) }

        /** The date _(in ISO 8601 format)_ when the Balance transaction was applied. */
        fun appliedDate(appliedDate: JsonField<OffsetDateTime>) = apply {
            body.appliedDate(appliedDate)
        }

        /**
         * The currency code of the payment if it differs from the Balance currency. For example:
         * USD, GBP or EUR.
         */
        fun currencyPaid(currencyPaid: String) = apply { body.currencyPaid(currencyPaid) }

        /**
         * The currency code of the payment if it differs from the Balance currency. For example:
         * USD, GBP or EUR.
         */
        fun currencyPaid(currencyPaid: JsonField<String>) = apply {
            body.currencyPaid(currencyPaid)
        }

        /** A brief description explaining the purpose and context of the transaction. */
        fun description(description: String) = apply { body.description(description) }

        /** A brief description explaining the purpose and context of the transaction. */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** The payment amount if the payment currency differs from the Balance currency. */
        fun paid(paid: Double) = apply { body.paid(paid) }

        /** The payment amount if the payment currency differs from the Balance currency. */
        fun paid(paid: JsonField<Double>) = apply { body.paid(paid) }

        /** The date _(in ISO 8601 format)_ when the transaction occurred. */
        fun transactionDate(transactionDate: OffsetDateTime) = apply {
            body.transactionDate(transactionDate)
        }

        /** The date _(in ISO 8601 format)_ when the transaction occurred. */
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
         * The unique identifier (UUID) of the transaction type. This is obtained from the list of
         * created Transaction Types within the Organization Configuration.
         */
        fun transactionTypeId(transactionTypeId: JsonField<String>) = apply {
            body.transactionTypeId(transactionTypeId)
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

        fun build(): BalanceTransactionCreateParams =
            BalanceTransactionCreateParams(
                checkRequired("orgId", orgId),
                checkRequired("balanceId", balanceId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceTransactionCreateParams && orgId == other.orgId && balanceId == other.balanceId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, balanceId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BalanceTransactionCreateParams{orgId=$orgId, balanceId=$balanceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
