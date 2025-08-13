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

class TransactionResponse
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<Double>,
    private val appliedDate: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val currencyPaid: JsonField<String>,
    private val description: JsonField<String>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val entityId: JsonField<String>,
    private val entityType: JsonField<EntityType>,
    private val lastModifiedBy: JsonField<String>,
    private val paid: JsonField<Double>,
    private val transactionDate: JsonField<OffsetDateTime>,
    private val transactionTypeId: JsonField<String>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("appliedDate")
        @ExcludeMissing
        appliedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currencyPaid")
        @ExcludeMissing
        currencyPaid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("entityId") @ExcludeMissing entityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entityType")
        @ExcludeMissing
        entityType: JsonField<EntityType> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("paid") @ExcludeMissing paid: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("transactionDate")
        @ExcludeMissing
        transactionDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("transactionTypeId")
        @ExcludeMissing
        transactionTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
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
     * The financial value of the transaction, as recorded in the balance.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<Double> = amount.getOptional("amount")

    /**
     * The date _(in ISO 8601 format)_ when the balance transaction was applied, i.e., when the
     * balance was affected.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun appliedDate(): Optional<OffsetDateTime> = appliedDate.getOptional("appliedDate")

    /**
     * The unique identifier (UUID) for the user who created the balance transaction.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * The currency code such as USD, GBP, EUR of the payment, if it differs from the balance
     * currency.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currencyPaid(): Optional<String> = currencyPaid.getOptional("currencyPaid")

    /**
     * A brief description explaining the purpose or context of the transaction.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * The date and time _(in ISO 8601 format)_ when the balance transaction was first created.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The date and time _(in ISO 8601 format)_ when the balance transaction was last modified.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * The unique identifier (UUID) for the entity associated with the Transaction, as specified by
     * the `entityType`.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entityId(): Optional<String> = entityId.getOptional("entityId")

    /**
     * The type of entity associated with the Transaction - identifies who or what was responsible
     * for the Transaction being added to the Balance - such as a **User**, a **Service User**, or a
     * **Bill**.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun entityType(): Optional<EntityType> = entityType.getOptional("entityType")

    /**
     * The unique identifier (UUID) for the user who last modified the balance transaction.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * The actual payment amount if the payment currency differs from the Balance currency.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun paid(): Optional<Double> = paid.getOptional("paid")

    /**
     * The date _(in ISO 8601 format)_ when the transaction was recorded in the system.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionDate(): Optional<OffsetDateTime> = transactionDate.getOptional("transactionDate")

    /**
     * The unique identifier (UUID) for the Transaction type. This is obtained from the list of
     * created Transaction Types within the Organization Configuration.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transactionTypeId(): Optional<String> = transactionTypeId.getOptional("transactionTypeId")

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
     * Returns the raw JSON value of [appliedDate].
     *
     * Unlike [appliedDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("appliedDate")
    @ExcludeMissing
    fun _appliedDate(): JsonField<OffsetDateTime> = appliedDate

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [currencyPaid].
     *
     * Unlike [currencyPaid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currencyPaid")
    @ExcludeMissing
    fun _currencyPaid(): JsonField<String> = currencyPaid

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
     * Returns the raw JSON value of [entityId].
     *
     * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entityId") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

    /**
     * Returns the raw JSON value of [entityType].
     *
     * Unlike [entityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entityType")
    @ExcludeMissing
    fun _entityType(): JsonField<EntityType> = entityType

    /**
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Returns the raw JSON value of [paid].
     *
     * Unlike [paid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paid") @ExcludeMissing fun _paid(): JsonField<Double> = paid

    /**
     * Returns the raw JSON value of [transactionDate].
     *
     * Unlike [transactionDate], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of [TransactionResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransactionResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
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
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transactionResponse: TransactionResponse) = apply {
            id = transactionResponse.id
            amount = transactionResponse.amount
            appliedDate = transactionResponse.appliedDate
            createdBy = transactionResponse.createdBy
            currencyPaid = transactionResponse.currencyPaid
            description = transactionResponse.description
            dtCreated = transactionResponse.dtCreated
            dtLastModified = transactionResponse.dtLastModified
            entityId = transactionResponse.entityId
            entityType = transactionResponse.entityType
            lastModifiedBy = transactionResponse.lastModifiedBy
            paid = transactionResponse.paid
            transactionDate = transactionResponse.transactionDate
            transactionTypeId = transactionResponse.transactionTypeId
            version = transactionResponse.version
            additionalProperties = transactionResponse.additionalProperties.toMutableMap()
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

        /** The financial value of the transaction, as recorded in the balance. */
        fun amount(amount: Double) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

        /**
         * The date _(in ISO 8601 format)_ when the balance transaction was applied, i.e., when the
         * balance was affected.
         */
        fun appliedDate(appliedDate: OffsetDateTime) = appliedDate(JsonField.of(appliedDate))

        /**
         * Sets [Builder.appliedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appliedDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun appliedDate(appliedDate: JsonField<OffsetDateTime>) = apply {
            this.appliedDate = appliedDate
        }

        /** The unique identifier (UUID) for the user who created the balance transaction. */
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
         * The currency code such as USD, GBP, EUR of the payment, if it differs from the balance
         * currency.
         */
        fun currencyPaid(currencyPaid: String) = currencyPaid(JsonField.of(currencyPaid))

        /**
         * Sets [Builder.currencyPaid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyPaid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyPaid(currencyPaid: JsonField<String>) = apply {
            this.currencyPaid = currencyPaid
        }

        /** A brief description explaining the purpose or context of the transaction. */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The date and time _(in ISO 8601 format)_ when the balance transaction was first created.
         */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /**
         * The date and time _(in ISO 8601 format)_ when the balance transaction was last modified.
         */
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
         * The unique identifier (UUID) for the entity associated with the Transaction, as specified
         * by the `entityType`.
         */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /**
         * Sets [Builder.entityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /**
         * The type of entity associated with the Transaction - identifies who or what was
         * responsible for the Transaction being added to the Balance - such as a **User**, a
         * **Service User**, or a **Bill**.
         */
        fun entityType(entityType: EntityType) = entityType(JsonField.of(entityType))

        /**
         * Sets [Builder.entityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityType] with a well-typed [EntityType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entityType(entityType: JsonField<EntityType>) = apply { this.entityType = entityType }

        /** The unique identifier (UUID) for the user who last modified the balance transaction. */
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

        /** The actual payment amount if the payment currency differs from the Balance currency. */
        fun paid(paid: Double) = paid(JsonField.of(paid))

        /**
         * Sets [Builder.paid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paid] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun paid(paid: JsonField<Double>) = apply { this.paid = paid }

        /** The date _(in ISO 8601 format)_ when the transaction was recorded in the system. */
        fun transactionDate(transactionDate: OffsetDateTime) =
            transactionDate(JsonField.of(transactionDate))

        /**
         * Sets [Builder.transactionDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
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
         * Returns an immutable instance of [TransactionResponse].
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
        fun build(): TransactionResponse =
            TransactionResponse(
                checkRequired("id", id),
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
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TransactionResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        amount()
        appliedDate()
        createdBy()
        currencyPaid()
        description()
        dtCreated()
        dtLastModified()
        entityId()
        entityType().ifPresent { it.validate() }
        lastModifiedBy()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (appliedDate.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (currencyPaid.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (entityId.asKnown().isPresent) 1 else 0) +
            (entityType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (if (paid.asKnown().isPresent) 1 else 0) +
            (if (transactionDate.asKnown().isPresent) 1 else 0) +
            (if (transactionTypeId.asKnown().isPresent) 1 else 0) +
            (if (version.asKnown().isPresent) 1 else 0)

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

            @JvmField val SCHEDULER = of("SCHEDULER")

            @JvmStatic fun of(value: String) = EntityType(JsonField.of(value))
        }

        /** An enum containing [EntityType]'s known values. */
        enum class Known {
            BILL,
            COMMITMENT,
            USER,
            SERVICE_USER,
            SCHEDULER,
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
            SCHEDULER,
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
                SCHEDULER -> Value.SCHEDULER
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
                SCHEDULER -> Known.SCHEDULER
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

        private var validated: Boolean = false

        fun validate(): EntityType = apply {
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

            return other is EntityType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionResponse &&
            id == other.id &&
            amount == other.amount &&
            appliedDate == other.appliedDate &&
            createdBy == other.createdBy &&
            currencyPaid == other.currencyPaid &&
            description == other.description &&
            dtCreated == other.dtCreated &&
            dtLastModified == other.dtLastModified &&
            entityId == other.entityId &&
            entityType == other.entityType &&
            lastModifiedBy == other.lastModifiedBy &&
            paid == other.paid &&
            transactionDate == other.transactionDate &&
            transactionTypeId == other.transactionTypeId &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
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
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TransactionResponse{id=$id, amount=$amount, appliedDate=$appliedDate, createdBy=$createdBy, currencyPaid=$currencyPaid, description=$description, dtCreated=$dtCreated, dtLastModified=$dtLastModified, entityId=$entityId, entityType=$entityType, lastModifiedBy=$lastModifiedBy, paid=$paid, transactionDate=$transactionDate, transactionTypeId=$transactionTypeId, version=$version, additionalProperties=$additionalProperties}"
}
