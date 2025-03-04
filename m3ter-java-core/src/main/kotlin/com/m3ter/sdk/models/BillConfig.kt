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
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class BillConfig
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("billLockDate")
    @ExcludeMissing
    private val billLockDate: JsonField<LocalDate> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The Organization UUID. The Organization represents your company as a direct customer of the
     * m3ter service.
     */
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /**
     * The global lock date _(in ISO 8601 format)_ when all Bills will be locked.
     *
     * For example: `"2024-03-01"`.
     */
    fun billLockDate(): Optional<LocalDate> =
        Optional.ofNullable(billLockDate.getNullable("billLockDate"))

    /** The id of the user who created this bill config. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** The DateTime _(in ISO-8601 format)_ when the bill config was first created. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The DateTime _(in ISO-8601 format)_ when the bill config was last modified. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The id of the user who last modified this bill config. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /**
     * The version number:
     * - Default value when newly created is one.
     * - Incremented by 1 each time it is updated.
     */
    fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

    /**
     * The Organization UUID. The Organization represents your company as a direct customer of the
     * m3ter service.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * The global lock date _(in ISO 8601 format)_ when all Bills will be locked.
     *
     * For example: `"2024-03-01"`.
     */
    @JsonProperty("billLockDate")
    @ExcludeMissing
    fun _billLockDate(): JsonField<LocalDate> = billLockDate

    /** The id of the user who created this bill config. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** The DateTime _(in ISO-8601 format)_ when the bill config was first created. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The DateTime _(in ISO-8601 format)_ when the bill config was last modified. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** The id of the user who last modified this bill config. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * The version number:
     * - Default value when newly created is one.
     * - Incremented by 1 each time it is updated.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BillConfig = apply {
        if (validated) {
            return@apply
        }

        id()
        billLockDate()
        createdBy()
        dtCreated()
        dtLastModified()
        lastModifiedBy()
        version()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [BillConfig]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillConfig]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var billLockDate: JsonField<LocalDate> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(billConfig: BillConfig) = apply {
            id = billConfig.id
            billLockDate = billConfig.billLockDate
            createdBy = billConfig.createdBy
            dtCreated = billConfig.dtCreated
            dtLastModified = billConfig.dtLastModified
            lastModifiedBy = billConfig.lastModifiedBy
            version = billConfig.version
            additionalProperties = billConfig.additionalProperties.toMutableMap()
        }

        /**
         * The Organization UUID. The Organization represents your company as a direct customer of
         * the m3ter service.
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * The Organization UUID. The Organization represents your company as a direct customer of
         * the m3ter service.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The global lock date _(in ISO 8601 format)_ when all Bills will be locked.
         *
         * For example: `"2024-03-01"`.
         */
        fun billLockDate(billLockDate: LocalDate) = billLockDate(JsonField.of(billLockDate))

        /**
         * The global lock date _(in ISO 8601 format)_ when all Bills will be locked.
         *
         * For example: `"2024-03-01"`.
         */
        fun billLockDate(billLockDate: JsonField<LocalDate>) = apply {
            this.billLockDate = billLockDate
        }

        /** The id of the user who created this bill config. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The id of the user who created this bill config. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The DateTime _(in ISO-8601 format)_ when the bill config was first created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The DateTime _(in ISO-8601 format)_ when the bill config was first created. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime _(in ISO-8601 format)_ when the bill config was last modified. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The DateTime _(in ISO-8601 format)_ when the bill config was last modified. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The id of the user who last modified this bill config. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The id of the user who last modified this bill config. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /**
         * The version number:
         * - Default value when newly created is one.
         * - Incremented by 1 each time it is updated.
         */
        fun version(version: Long) = version(JsonField.of(version))

        /**
         * The version number:
         * - Default value when newly created is one.
         * - Incremented by 1 each time it is updated.
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

        fun build(): BillConfig =
            BillConfig(
                id,
                billLockDate,
                createdBy,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                version,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillConfig && id == other.id && billLockDate == other.billLockDate && createdBy == other.createdBy && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, billLockDate, createdBy, dtCreated, dtLastModified, lastModifiedBy, version, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillConfig{id=$id, billLockDate=$billLockDate, createdBy=$createdBy, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, version=$version, additionalProperties=$additionalProperties}"
}
