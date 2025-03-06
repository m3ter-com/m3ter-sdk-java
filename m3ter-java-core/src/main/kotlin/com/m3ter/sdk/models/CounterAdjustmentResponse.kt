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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class CounterAdjustmentResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("accountId")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("counterId")
    @ExcludeMissing
    private val counterId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("date") @ExcludeMissing private val date: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("purchaseOrderNumber")
    @ExcludeMissing
    private val purchaseOrderNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("value") @ExcludeMissing private val value: JsonField<Long> = JsonMissing.of(),
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

    /** The Account ID the CounterAdjustment was created for. */
    fun accountId(): Optional<String> = Optional.ofNullable(accountId.getNullable("accountId"))

    /** The ID of the Counter that was used to make the CounterAdjustment on the Account. */
    fun counterId(): Optional<String> = Optional.ofNullable(counterId.getNullable("counterId"))

    /** The ID of the user who created this item. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** The date the CounterAdjustment was created for the Account _(in ISO-8601 date format)_. */
    fun date(): Optional<LocalDate> = Optional.ofNullable(date.getNullable("date"))

    /** The DateTime when this item was created _(in ISO-8601 format)_. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The ID of the user who last modified this item. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** Purchase Order Number for the Counter Adjustment. _(Optional)_ */
    fun purchaseOrderNumber(): Optional<String> =
        Optional.ofNullable(purchaseOrderNumber.getNullable("purchaseOrderNumber"))

    /** Integer Value of the Counter that was used to make the CounterAdjustment. */
    fun value(): Optional<Long> = Optional.ofNullable(value.getNullable("value"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /** The Account ID the CounterAdjustment was created for. */
    @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /** The ID of the Counter that was used to make the CounterAdjustment on the Account. */
    @JsonProperty("counterId") @ExcludeMissing fun _counterId(): JsonField<String> = counterId

    /** The ID of the user who created this item. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** The date the CounterAdjustment was created for the Account _(in ISO-8601 date format)_. */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

    /** The DateTime when this item was created _(in ISO-8601 format)_. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** The ID of the user who last modified this item. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /** Purchase Order Number for the Counter Adjustment. _(Optional)_ */
    @JsonProperty("purchaseOrderNumber")
    @ExcludeMissing
    fun _purchaseOrderNumber(): JsonField<String> = purchaseOrderNumber

    /** Integer Value of the Counter that was used to make the CounterAdjustment. */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CounterAdjustmentResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        accountId()
        counterId()
        createdBy()
        date()
        dtCreated()
        dtLastModified()
        lastModifiedBy()
        purchaseOrderNumber()
        value()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CounterAdjustmentResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CounterAdjustmentResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var accountId: JsonField<String> = JsonMissing.of()
        private var counterId: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var date: JsonField<LocalDate> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var purchaseOrderNumber: JsonField<String> = JsonMissing.of()
        private var value: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(counterAdjustmentResponse: CounterAdjustmentResponse) = apply {
            id = counterAdjustmentResponse.id
            version = counterAdjustmentResponse.version
            accountId = counterAdjustmentResponse.accountId
            counterId = counterAdjustmentResponse.counterId
            createdBy = counterAdjustmentResponse.createdBy
            date = counterAdjustmentResponse.date
            dtCreated = counterAdjustmentResponse.dtCreated
            dtLastModified = counterAdjustmentResponse.dtLastModified
            lastModifiedBy = counterAdjustmentResponse.lastModifiedBy
            purchaseOrderNumber = counterAdjustmentResponse.purchaseOrderNumber
            value = counterAdjustmentResponse.value
            additionalProperties = counterAdjustmentResponse.additionalProperties.toMutableMap()
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

        /** The Account ID the CounterAdjustment was created for. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account ID the CounterAdjustment was created for. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The ID of the Counter that was used to make the CounterAdjustment on the Account. */
        fun counterId(counterId: String) = counterId(JsonField.of(counterId))

        /** The ID of the Counter that was used to make the CounterAdjustment on the Account. */
        fun counterId(counterId: JsonField<String>) = apply { this.counterId = counterId }

        /** The ID of the user who created this item. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The ID of the user who created this item. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /**
         * The date the CounterAdjustment was created for the Account _(in ISO-8601 date format)_.
         */
        fun date(date: LocalDate) = date(JsonField.of(date))

        /**
         * The date the CounterAdjustment was created for the Account _(in ISO-8601 date format)_.
         */
        fun date(date: JsonField<LocalDate>) = apply { this.date = date }

        /** The DateTime when this item was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The DateTime when this item was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The ID of the user who last modified this item. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The ID of the user who last modified this item. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /** Purchase Order Number for the Counter Adjustment. _(Optional)_ */
        fun purchaseOrderNumber(purchaseOrderNumber: String) =
            purchaseOrderNumber(JsonField.of(purchaseOrderNumber))

        /** Purchase Order Number for the Counter Adjustment. _(Optional)_ */
        fun purchaseOrderNumber(purchaseOrderNumber: JsonField<String>) = apply {
            this.purchaseOrderNumber = purchaseOrderNumber
        }

        /** Integer Value of the Counter that was used to make the CounterAdjustment. */
        fun value(value: Long) = value(JsonField.of(value))

        /** Integer Value of the Counter that was used to make the CounterAdjustment. */
        fun value(value: JsonField<Long>) = apply { this.value = value }

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

        fun build(): CounterAdjustmentResponse =
            CounterAdjustmentResponse(
                checkRequired("id", id),
                checkRequired("version", version),
                accountId,
                counterId,
                createdBy,
                date,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                purchaseOrderNumber,
                value,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterAdjustmentResponse && id == other.id && version == other.version && accountId == other.accountId && counterId == other.counterId && createdBy == other.createdBy && date == other.date && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && purchaseOrderNumber == other.purchaseOrderNumber && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, accountId, counterId, createdBy, date, dtCreated, dtLastModified, lastModifiedBy, purchaseOrderNumber, value, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CounterAdjustmentResponse{id=$id, version=$version, accountId=$accountId, counterId=$counterId, createdBy=$createdBy, date=$date, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, purchaseOrderNumber=$purchaseOrderNumber, value=$value, additionalProperties=$additionalProperties}"
}
