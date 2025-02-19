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
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Transaction
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("amount")
    @ExcludeMissing
    private val amount: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("appliedDate")
    @ExcludeMissing
    private val appliedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("currencyPaid")
    @ExcludeMissing
    private val currencyPaid: JsonField<String> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("entityId")
    @ExcludeMissing
    private val entityId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("entityType")
    @ExcludeMissing
    private val entityType: JsonField<EntityType> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("paid") @ExcludeMissing private val paid: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("transactionDate")
    @ExcludeMissing
    private val transactionDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("transactionTypeId")
    @ExcludeMissing
    private val transactionTypeId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The UUID of the entity. */
    fun id(): String = id.getRequired("id")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    fun version(): Long = version.getRequired("version")

    /** The financial value of the transaction, as recorded in the balance. */
    fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

    /**
     * The date _(in ISO 8601 format)_ when the balance transaction was applied, i.e., when the
     * balance was affected.
     */
    fun appliedDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(appliedDate.getNullable("appliedDate"))

    /** The unique identifier (UUID) for the user who created the balance transaction. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /**
     * The currency code such as USD, GBP, EUR of the payment, if it differs from the balance
     * currency.
     */
    fun currencyPaid(): Optional<String> =
        Optional.ofNullable(currencyPaid.getNullable("currencyPaid"))

    /** A brief description explaining the purpose or context of the transaction. */
    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** The date and time _(in ISO 8601 format)_ when the balance transaction was first created. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The date and time _(in ISO 8601 format)_ when the balance transaction was last modified. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /**
     * The unique identifier (UUID) for the entity associated with the Transaction, as specified by
     * the `entityType`.
     */
    fun entityId(): Optional<String> = Optional.ofNullable(entityId.getNullable("entityId"))

    /**
     * The type of entity associated with the Transaction - identifies who or what was responsible
     * for the Transaction being added to the Balance - such as a **User**, a **Service User**, or a
     * **Bill**.
     */
    fun entityType(): Optional<EntityType> =
        Optional.ofNullable(entityType.getNullable("entityType"))

    /** The unique identifier (UUID) for the user who last modified the balance transaction. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** The actual payment amount if the payment currency differs from the Balance currency. */
    fun paid(): Optional<Double> = Optional.ofNullable(paid.getNullable("paid"))

    /** The date _(in ISO 8601 format)_ when the transaction was recorded in the system. */
    fun transactionDate(): Optional<OffsetDateTime> =
        Optional.ofNullable(transactionDate.getNullable("transactionDate"))

    /**
     * The unique identifier (UUID) for the Transaction type. This is obtained from the list of
     * created Transaction Types within the Organization Configuration.
     */
    fun transactionTypeId(): Optional<String> =
        Optional.ofNullable(transactionTypeId.getNullable("transactionTypeId"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /** The financial value of the transaction, as recorded in the balance. */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

    /**
     * The date _(in ISO 8601 format)_ when the balance transaction was applied, i.e., when the
     * balance was affected.
     */
    @JsonProperty("appliedDate")
    @ExcludeMissing
    fun _appliedDate(): JsonField<OffsetDateTime> = appliedDate

    /** The unique identifier (UUID) for the user who created the balance transaction. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * The currency code such as USD, GBP, EUR of the payment, if it differs from the balance
     * currency.
     */
    @JsonProperty("currencyPaid")
    @ExcludeMissing
    fun _currencyPaid(): JsonField<String> = currencyPaid

    /** A brief description explaining the purpose or context of the transaction. */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** The date and time _(in ISO 8601 format)_ when the balance transaction was first created. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The date and time _(in ISO 8601 format)_ when the balance transaction was last modified. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /**
     * The unique identifier (UUID) for the entity associated with the Transaction, as specified by
     * the `entityType`.
     */
    @JsonProperty("entityId") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

    /**
     * The type of entity associated with the Transaction - identifies who or what was responsible
     * for the Transaction being added to the Balance - such as a **User**, a **Service User**, or a
     * **Bill**.
     */
    @JsonProperty("entityType")
    @ExcludeMissing
    fun _entityType(): JsonField<EntityType> = entityType

    /** The unique identifier (UUID) for the user who last modified the balance transaction. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /** The actual payment amount if the payment currency differs from the Balance currency. */
    @JsonProperty("paid") @ExcludeMissing fun _paid(): JsonField<Double> = paid

    /** The date _(in ISO 8601 format)_ when the transaction was recorded in the system. */
    @JsonProperty("transactionDate")
    @ExcludeMissing
    fun _transactionDate(): JsonField<OffsetDateTime> = transactionDate

    /**
     * The unique identifier (UUID) for the Transaction type. This is obtained from the list of
     * created Transaction Types within the Organization Configuration.
     */
    @JsonProperty("transactionTypeId")
    @ExcludeMissing
    fun _transactionTypeId(): JsonField<String> = transactionTypeId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Transaction = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        amount()
        appliedDate()
        createdBy()
        currencyPaid()
        description()
        dtCreated()
        dtLastModified()
        entityId()
        entityType()
        lastModifiedBy()
        paid()
        transactionDate()
        transactionTypeId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Transaction]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var amount: JsonField<Double> = JsonMissing.of()
        private var appliedDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var currencyPaid: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var entityId: JsonField<String> = JsonMissing.of()
        private var entityType: JsonField<EntityType> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var paid: JsonField<Double> = JsonMissing.of()
        private var transactionDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var transactionTypeId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transaction: Transaction) = apply {
            id = transaction.id
            version = transaction.version
            amount = transaction.amount
            appliedDate = transaction.appliedDate
            createdBy = transaction.createdBy
            currencyPaid = transaction.currencyPaid
            description = transaction.description
            dtCreated = transaction.dtCreated
            dtLastModified = transaction.dtLastModified
            entityId = transaction.entityId
            entityType = transaction.entityType
            lastModifiedBy = transaction.lastModifiedBy
            paid = transaction.paid
            transactionDate = transaction.transactionDate
            transactionTypeId = transaction.transactionTypeId
            additionalProperties = transaction.additionalProperties.toMutableMap()
        }

        /** The UUID of the entity. */
        fun id(id: String) = id(JsonField.of(id))

        /** The UUID of the entity. */
        fun id(id: JsonField<String>) = apply { this.id = id }

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

        /** The financial value of the transaction, as recorded in the balance. */
        fun amount(amount: Double) = amount(JsonField.of(amount))

        /** The financial value of the transaction, as recorded in the balance. */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        /**
         * The date _(in ISO 8601 format)_ when the balance transaction was applied, i.e., when the
         * balance was affected.
         */
        fun appliedDate(appliedDate: OffsetDateTime) = appliedDate(JsonField.of(appliedDate))

        /**
         * The date _(in ISO 8601 format)_ when the balance transaction was applied, i.e., when the
         * balance was affected.
         */
        fun appliedDate(appliedDate: JsonField<OffsetDateTime>) = apply {
            this.appliedDate = appliedDate
        }

        /** The unique identifier (UUID) for the user who created the balance transaction. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The unique identifier (UUID) for the user who created the balance transaction. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /**
         * The currency code such as USD, GBP, EUR of the payment, if it differs from the balance
         * currency.
         */
        fun currencyPaid(currencyPaid: String) = currencyPaid(JsonField.of(currencyPaid))

        /**
         * The currency code such as USD, GBP, EUR of the payment, if it differs from the balance
         * currency.
         */
        fun currencyPaid(currencyPaid: JsonField<String>) = apply {
            this.currencyPaid = currencyPaid
        }

        /** A brief description explaining the purpose or context of the transaction. */
        fun description(description: String) = description(JsonField.of(description))

        /** A brief description explaining the purpose or context of the transaction. */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The date and time _(in ISO 8601 format)_ when the balance transaction was first created.
         */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * The date and time _(in ISO 8601 format)_ when the balance transaction was first created.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /**
         * The date and time _(in ISO 8601 format)_ when the balance transaction was last modified.
         */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /**
         * The date and time _(in ISO 8601 format)_ when the balance transaction was last modified.
         */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /**
         * The unique identifier (UUID) for the entity associated with the Transaction, as specified
         * by the `entityType`.
         */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /**
         * The unique identifier (UUID) for the entity associated with the Transaction, as specified
         * by the `entityType`.
         */
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /**
         * The type of entity associated with the Transaction - identifies who or what was
         * responsible for the Transaction being added to the Balance - such as a **User**, a
         * **Service User**, or a **Bill**.
         */
        fun entityType(entityType: EntityType) = entityType(JsonField.of(entityType))

        /**
         * The type of entity associated with the Transaction - identifies who or what was
         * responsible for the Transaction being added to the Balance - such as a **User**, a
         * **Service User**, or a **Bill**.
         */
        fun entityType(entityType: JsonField<EntityType>) = apply { this.entityType = entityType }

        /** The unique identifier (UUID) for the user who last modified the balance transaction. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The unique identifier (UUID) for the user who last modified the balance transaction. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /** The actual payment amount if the payment currency differs from the Balance currency. */
        fun paid(paid: Double) = paid(JsonField.of(paid))

        /** The actual payment amount if the payment currency differs from the Balance currency. */
        fun paid(paid: JsonField<Double>) = apply { this.paid = paid }

        /** The date _(in ISO 8601 format)_ when the transaction was recorded in the system. */
        fun transactionDate(transactionDate: OffsetDateTime) =
            transactionDate(JsonField.of(transactionDate))

        /** The date _(in ISO 8601 format)_ when the transaction was recorded in the system. */
        fun transactionDate(transactionDate: JsonField<OffsetDateTime>) = apply {
            this.transactionDate = transactionDate
        }

        /**
         * The unique identifier (UUID) for the Transaction type. This is obtained from the list of
         * created Transaction Types within the Organization Configuration.
         */
        fun transactionTypeId(transactionTypeId: String) =
            transactionTypeId(JsonField.of(transactionTypeId))

        /**
         * The unique identifier (UUID) for the Transaction type. This is obtained from the list of
         * created Transaction Types within the Organization Configuration.
         */
        fun transactionTypeId(transactionTypeId: JsonField<String>) = apply {
            this.transactionTypeId = transactionTypeId
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

        fun build(): Transaction =
            Transaction(
                checkRequired("id", id),
                checkRequired("version", version),
                amount,
                appliedDate,
                createdBy,
                currencyPaid,
                description,
                dtCreated,
                dtLastModified,
                entityId,
                entityType,
                lastModifiedBy,
                paid,
                transactionDate,
                transactionTypeId,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * The type of entity associated with the Transaction - identifies who or what was responsible
     * for the Transaction being added to the Balance - such as a **User**, a **Service User**, or a
     * **Bill**.
     */
    class EntityType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val BILL = of("BILL")

            @JvmField val COMMITMENT = of("COMMITMENT")

            @JvmField val USER = of("USER")

            @JvmField val SERVICE_USER = of("SERVICE_USER")

            @JvmStatic fun of(value: String) = EntityType(JsonField.of(value))
        }

        /** An enum containing [EntityType]'s known values. */
        enum class Known {
            BILL,
            COMMITMENT,
            USER,
            SERVICE_USER,
        }

        /**
         * An enum containing [EntityType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EntityType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BILL,
            COMMITMENT,
            USER,
            SERVICE_USER,
            /**
             * An enum member indicating that [EntityType] was instantiated with an unknown value.
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
                BILL -> Value.BILL
                COMMITMENT -> Value.COMMITMENT
                USER -> Value.USER
                SERVICE_USER -> Value.SERVICE_USER
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
                BILL -> Known.BILL
                COMMITMENT -> Known.COMMITMENT
                USER -> Known.USER
                SERVICE_USER -> Known.SERVICE_USER
                else -> throw M3terInvalidDataException("Unknown EntityType: $value")
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

            return /* spotless:off */ other is EntityType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Transaction && id == other.id && version == other.version && amount == other.amount && appliedDate == other.appliedDate && createdBy == other.createdBy && currencyPaid == other.currencyPaid && description == other.description && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && entityId == other.entityId && entityType == other.entityType && lastModifiedBy == other.lastModifiedBy && paid == other.paid && transactionDate == other.transactionDate && transactionTypeId == other.transactionTypeId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, amount, appliedDate, createdBy, currencyPaid, description, dtCreated, dtLastModified, entityId, entityType, lastModifiedBy, paid, transactionDate, transactionTypeId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Transaction{id=$id, version=$version, amount=$amount, appliedDate=$appliedDate, createdBy=$createdBy, currencyPaid=$currencyPaid, description=$description, dtCreated=$dtCreated, dtLastModified=$dtLastModified, entityId=$entityId, entityType=$entityType, lastModifiedBy=$lastModifiedBy, paid=$paid, transactionDate=$transactionDate, transactionTypeId=$transactionTypeId, additionalProperties=$additionalProperties}"
}
