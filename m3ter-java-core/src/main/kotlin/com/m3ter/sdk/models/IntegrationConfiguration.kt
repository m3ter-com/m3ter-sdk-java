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
class IntegrationConfiguration
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("destination")
    @ExcludeMissing
    private val destination: JsonField<String> = JsonMissing.of(),
    @JsonProperty("entityId")
    @ExcludeMissing
    private val entityId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("entityType")
    @ExcludeMissing
    private val entityType: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dtCompleted")
    @ExcludeMissing
    private val dtCompleted: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtStarted")
    @ExcludeMissing
    private val dtStarted: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("error") @ExcludeMissing private val error: JsonField<String> = JsonMissing.of(),
    @JsonProperty("externalId")
    @ExcludeMissing
    private val externalId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The UUID of the entity. */
    fun id(): String = id.getRequired("id")

    /** The destination system for the integration. */
    fun destination(): String = destination.getRequired("destination")

    /** The unique identifier (UUID) of the entity the integration is for. */
    fun entityId(): String = entityId.getRequired("entityId")

    /** The type of entity the integration is for _(e.g. Bill)_. */
    fun entityType(): String = entityType.getRequired("entityType")

    fun status(): Status = status.getRequired("status")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    fun version(): Long = version.getRequired("version")

    /** The ID of the user who created this item. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** The date and time the integration was completed _(in ISO-8601 format)_. */
    fun dtCompleted(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCompleted.getNullable("dtCompleted"))

    /** The DateTime when this item was created _(in ISO-8601 format)_. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The date and time the integration was started _(in ISO-8601 format)_. */
    fun dtStarted(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtStarted.getNullable("dtStarted"))

    /** Describes any errors encountered during the integration run. */
    fun error(): Optional<String> = Optional.ofNullable(error.getNullable("error"))

    /** The external ID in the destination system if available. */
    fun externalId(): Optional<String> = Optional.ofNullable(externalId.getNullable("externalId"))

    /** The ID of the user who last modified this item. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** The URL of the entity in the destination system if available. */
    fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The destination system for the integration. */
    @JsonProperty("destination") @ExcludeMissing fun _destination(): JsonField<String> = destination

    /** The unique identifier (UUID) of the entity the integration is for. */
    @JsonProperty("entityId") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

    /** The type of entity the integration is for _(e.g. Bill)_. */
    @JsonProperty("entityType") @ExcludeMissing fun _entityType(): JsonField<String> = entityType

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /** The ID of the user who created this item. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** The date and time the integration was completed _(in ISO-8601 format)_. */
    @JsonProperty("dtCompleted")
    @ExcludeMissing
    fun _dtCompleted(): JsonField<OffsetDateTime> = dtCompleted

    /** The DateTime when this item was created _(in ISO-8601 format)_. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** The date and time the integration was started _(in ISO-8601 format)_. */
    @JsonProperty("dtStarted")
    @ExcludeMissing
    fun _dtStarted(): JsonField<OffsetDateTime> = dtStarted

    /** Describes any errors encountered during the integration run. */
    @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<String> = error

    /** The external ID in the destination system if available. */
    @JsonProperty("externalId") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /** The ID of the user who last modified this item. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /** The URL of the entity in the destination system if available. */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): IntegrationConfiguration = apply {
        if (validated) {
            return@apply
        }

        id()
        destination()
        entityId()
        entityType()
        status()
        version()
        createdBy()
        dtCompleted()
        dtCreated()
        dtLastModified()
        dtStarted()
        error()
        externalId()
        lastModifiedBy()
        url()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [IntegrationConfiguration].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .destination()
         * .entityId()
         * .entityType()
         * .status()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntegrationConfiguration]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var destination: JsonField<String>? = null
        private var entityId: JsonField<String>? = null
        private var entityType: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var version: JsonField<Long>? = null
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dtCompleted: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtStarted: JsonField<OffsetDateTime> = JsonMissing.of()
        private var error: JsonField<String> = JsonMissing.of()
        private var externalId: JsonField<String> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(integrationConfiguration: IntegrationConfiguration) = apply {
            id = integrationConfiguration.id
            destination = integrationConfiguration.destination
            entityId = integrationConfiguration.entityId
            entityType = integrationConfiguration.entityType
            status = integrationConfiguration.status
            version = integrationConfiguration.version
            createdBy = integrationConfiguration.createdBy
            dtCompleted = integrationConfiguration.dtCompleted
            dtCreated = integrationConfiguration.dtCreated
            dtLastModified = integrationConfiguration.dtLastModified
            dtStarted = integrationConfiguration.dtStarted
            error = integrationConfiguration.error
            externalId = integrationConfiguration.externalId
            lastModifiedBy = integrationConfiguration.lastModifiedBy
            url = integrationConfiguration.url
            additionalProperties = integrationConfiguration.additionalProperties.toMutableMap()
        }

        /** The UUID of the entity. */
        fun id(id: String) = id(JsonField.of(id))

        /** The UUID of the entity. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The destination system for the integration. */
        fun destination(destination: String) = destination(JsonField.of(destination))

        /** The destination system for the integration. */
        fun destination(destination: JsonField<String>) = apply { this.destination = destination }

        /** The unique identifier (UUID) of the entity the integration is for. */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /** The unique identifier (UUID) of the entity the integration is for. */
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /** The type of entity the integration is for _(e.g. Bill)_. */
        fun entityType(entityType: String) = entityType(JsonField.of(entityType))

        /** The type of entity the integration is for _(e.g. Bill)_. */
        fun entityType(entityType: JsonField<String>) = apply { this.entityType = entityType }

        fun status(status: Status) = status(JsonField.of(status))

        fun status(status: JsonField<Status>) = apply { this.status = status }

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

        /** The ID of the user who created this item. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The ID of the user who created this item. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The date and time the integration was completed _(in ISO-8601 format)_. */
        fun dtCompleted(dtCompleted: OffsetDateTime) = dtCompleted(JsonField.of(dtCompleted))

        /** The date and time the integration was completed _(in ISO-8601 format)_. */
        fun dtCompleted(dtCompleted: JsonField<OffsetDateTime>) = apply {
            this.dtCompleted = dtCompleted
        }

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

        /** The date and time the integration was started _(in ISO-8601 format)_. */
        fun dtStarted(dtStarted: OffsetDateTime) = dtStarted(JsonField.of(dtStarted))

        /** The date and time the integration was started _(in ISO-8601 format)_. */
        fun dtStarted(dtStarted: JsonField<OffsetDateTime>) = apply { this.dtStarted = dtStarted }

        /** Describes any errors encountered during the integration run. */
        fun error(error: String) = error(JsonField.of(error))

        /** Describes any errors encountered during the integration run. */
        fun error(error: JsonField<String>) = apply { this.error = error }

        /** The external ID in the destination system if available. */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /** The external ID in the destination system if available. */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /** The ID of the user who last modified this item. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The ID of the user who last modified this item. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /** The URL of the entity in the destination system if available. */
        fun url(url: String) = url(JsonField.of(url))

        /** The URL of the entity in the destination system if available. */
        fun url(url: JsonField<String>) = apply { this.url = url }

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

        fun build(): IntegrationConfiguration =
            IntegrationConfiguration(
                checkRequired("id", id),
                checkRequired("destination", destination),
                checkRequired("entityId", entityId),
                checkRequired("entityType", entityType),
                checkRequired("status", status),
                checkRequired("version", version),
                createdBy,
                dtCompleted,
                dtCreated,
                dtLastModified,
                dtStarted,
                error,
                externalId,
                lastModifiedBy,
                url,
                additionalProperties.toImmutable(),
            )
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val WAITING = of("WAITING")

            @JvmField val STARTED = of("STARTED")

            @JvmField val COMPLETE = of("COMPLETE")

            @JvmField val ERROR = of("ERROR")

            @JvmField val AWAITING_RETRY = of("AWAITING_RETRY")

            @JvmField val AUTH_FAILED = of("AUTH_FAILED")

            @JvmField val ACCOUNTING_PERIOD_CLOSED = of("ACCOUNTING_PERIOD_CLOSED")

            @JvmField val INVOICE_ALREADY_PAID = of("INVOICE_ALREADY_PAID")

            @JvmField val DISABLED = of("DISABLED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            WAITING,
            STARTED,
            COMPLETE,
            ERROR,
            AWAITING_RETRY,
            AUTH_FAILED,
            ACCOUNTING_PERIOD_CLOSED,
            INVOICE_ALREADY_PAID,
            DISABLED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            WAITING,
            STARTED,
            COMPLETE,
            ERROR,
            AWAITING_RETRY,
            AUTH_FAILED,
            ACCOUNTING_PERIOD_CLOSED,
            INVOICE_ALREADY_PAID,
            DISABLED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                WAITING -> Value.WAITING
                STARTED -> Value.STARTED
                COMPLETE -> Value.COMPLETE
                ERROR -> Value.ERROR
                AWAITING_RETRY -> Value.AWAITING_RETRY
                AUTH_FAILED -> Value.AUTH_FAILED
                ACCOUNTING_PERIOD_CLOSED -> Value.ACCOUNTING_PERIOD_CLOSED
                INVOICE_ALREADY_PAID -> Value.INVOICE_ALREADY_PAID
                DISABLED -> Value.DISABLED
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
                WAITING -> Known.WAITING
                STARTED -> Known.STARTED
                COMPLETE -> Known.COMPLETE
                ERROR -> Known.ERROR
                AWAITING_RETRY -> Known.AWAITING_RETRY
                AUTH_FAILED -> Known.AUTH_FAILED
                ACCOUNTING_PERIOD_CLOSED -> Known.ACCOUNTING_PERIOD_CLOSED
                INVOICE_ALREADY_PAID -> Known.INVOICE_ALREADY_PAID
                DISABLED -> Known.DISABLED
                else -> throw M3terInvalidDataException("Unknown Status: $value")
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IntegrationConfiguration && id == other.id && destination == other.destination && entityId == other.entityId && entityType == other.entityType && status == other.status && version == other.version && createdBy == other.createdBy && dtCompleted == other.dtCompleted && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && dtStarted == other.dtStarted && error == other.error && externalId == other.externalId && lastModifiedBy == other.lastModifiedBy && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, destination, entityId, entityType, status, version, createdBy, dtCompleted, dtCreated, dtLastModified, dtStarted, error, externalId, lastModifiedBy, url, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IntegrationConfiguration{id=$id, destination=$destination, entityId=$entityId, entityType=$entityType, status=$status, version=$version, createdBy=$createdBy, dtCompleted=$dtCompleted, dtCreated=$dtCreated, dtLastModified=$dtLastModified, dtStarted=$dtStarted, error=$error, externalId=$externalId, lastModifiedBy=$lastModifiedBy, url=$url, additionalProperties=$additionalProperties}"
}
