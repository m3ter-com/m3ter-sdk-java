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

class StatementJobResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val billId: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val includeCsvFormat: JsonField<Boolean>,
    private val lastModifiedBy: JsonField<String>,
    private val orgId: JsonField<String>,
    private val presignedJsonStatementUrl: JsonField<String>,
    private val statementJobStatus: JsonField<StatementJobStatus>,
    private val version: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billId") @ExcludeMissing billId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("includeCsvFormat")
        @ExcludeMissing
        includeCsvFormat: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("orgId") @ExcludeMissing orgId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("presignedJsonStatementUrl")
        @ExcludeMissing
        presignedJsonStatementUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("statementJobStatus")
        @ExcludeMissing
        statementJobStatus: JsonField<StatementJobStatus> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
    ) : this(
        id,
        billId,
        createdBy,
        dtCreated,
        dtLastModified,
        includeCsvFormat,
        lastModifiedBy,
        orgId,
        presignedJsonStatementUrl,
        statementJobStatus,
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
     * The unique identifier (UUID) of the bill associated with the StatementJob.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billId(): Optional<String> = billId.getOptional("billId")

    /**
     * The unique identifier (UUID) of the user who created this StatementJob.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * The date and time *(in ISO-8601 format)* when the StatementJob was created.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> = dtCreated.getOptional("dtCreated")

    /**
     * The date and time *(in ISO-8601 format)* when the StatementJob was last modified.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> = dtLastModified.getOptional("dtLastModified")

    /**
     * A Boolean value indicating whether the generated statement includes a CSV format.
     * * TRUE - includes the statement in CSV format.
     * * FALSE - no CSV format statement.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeCsvFormat(): Optional<Boolean> = includeCsvFormat.getOptional("includeCsvFormat")

    /**
     * The unique identifier (UUID) of the user who last modified this StatementJob.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * The unique identifier (UUID) of your Organization. The Organization represents your company
     * as a direct customer of our service.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orgId(): Optional<String> = orgId.getOptional("orgId")

    /**
     * The URL to access the generated statement in JSON format. This URL is temporary and has a
     * limited lifetime.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun presignedJsonStatementUrl(): Optional<String> =
        presignedJsonStatementUrl.getOptional("presignedJsonStatementUrl")

    /**
     * The current status of the StatementJob. The status helps track the progress and outcome of a
     * StatementJob.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun statementJobStatus(): Optional<StatementJobStatus> =
        statementJobStatus.getOptional("statementJobStatus")

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
     * Returns the raw JSON value of [billId].
     *
     * Unlike [billId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billId") @ExcludeMissing fun _billId(): JsonField<String> = billId

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

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
     * Returns the raw JSON value of [includeCsvFormat].
     *
     * Unlike [includeCsvFormat], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("includeCsvFormat")
    @ExcludeMissing
    fun _includeCsvFormat(): JsonField<Boolean> = includeCsvFormat

    /**
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Returns the raw JSON value of [orgId].
     *
     * Unlike [orgId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("orgId") @ExcludeMissing fun _orgId(): JsonField<String> = orgId

    /**
     * Returns the raw JSON value of [presignedJsonStatementUrl].
     *
     * Unlike [presignedJsonStatementUrl], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("presignedJsonStatementUrl")
    @ExcludeMissing
    fun _presignedJsonStatementUrl(): JsonField<String> = presignedJsonStatementUrl

    /**
     * Returns the raw JSON value of [statementJobStatus].
     *
     * Unlike [statementJobStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("statementJobStatus")
    @ExcludeMissing
    fun _statementJobStatus(): JsonField<StatementJobStatus> = statementJobStatus

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
         * Returns a mutable builder for constructing an instance of [StatementJobResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StatementJobResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var billId: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var includeCsvFormat: JsonField<Boolean> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var orgId: JsonField<String> = JsonMissing.of()
        private var presignedJsonStatementUrl: JsonField<String> = JsonMissing.of()
        private var statementJobStatus: JsonField<StatementJobStatus> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(statementJobResponse: StatementJobResponse) = apply {
            id = statementJobResponse.id
            billId = statementJobResponse.billId
            createdBy = statementJobResponse.createdBy
            dtCreated = statementJobResponse.dtCreated
            dtLastModified = statementJobResponse.dtLastModified
            includeCsvFormat = statementJobResponse.includeCsvFormat
            lastModifiedBy = statementJobResponse.lastModifiedBy
            orgId = statementJobResponse.orgId
            presignedJsonStatementUrl = statementJobResponse.presignedJsonStatementUrl
            statementJobStatus = statementJobResponse.statementJobStatus
            version = statementJobResponse.version
            additionalProperties = statementJobResponse.additionalProperties.toMutableMap()
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

        /** The unique identifier (UUID) of the bill associated with the StatementJob. */
        fun billId(billId: String) = billId(JsonField.of(billId))

        /**
         * Sets [Builder.billId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun billId(billId: JsonField<String>) = apply { this.billId = billId }

        /** The unique identifier (UUID) of the user who created this StatementJob. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** The date and time *(in ISO-8601 format)* when the StatementJob was created. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The date and time *(in ISO-8601 format)* when the StatementJob was last modified. */
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
         * A Boolean value indicating whether the generated statement includes a CSV format.
         * * TRUE - includes the statement in CSV format.
         * * FALSE - no CSV format statement.
         */
        fun includeCsvFormat(includeCsvFormat: Boolean) =
            includeCsvFormat(JsonField.of(includeCsvFormat))

        /**
         * Sets [Builder.includeCsvFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeCsvFormat] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeCsvFormat(includeCsvFormat: JsonField<Boolean>) = apply {
            this.includeCsvFormat = includeCsvFormat
        }

        /** The unique identifier (UUID) of the user who last modified this StatementJob. */
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

        /**
         * The unique identifier (UUID) of your Organization. The Organization represents your
         * company as a direct customer of our service.
         */
        fun orgId(orgId: String) = orgId(JsonField.of(orgId))

        /**
         * Sets [Builder.orgId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orgId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun orgId(orgId: JsonField<String>) = apply { this.orgId = orgId }

        /**
         * The URL to access the generated statement in JSON format. This URL is temporary and has a
         * limited lifetime.
         */
        fun presignedJsonStatementUrl(presignedJsonStatementUrl: String) =
            presignedJsonStatementUrl(JsonField.of(presignedJsonStatementUrl))

        /**
         * Sets [Builder.presignedJsonStatementUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presignedJsonStatementUrl] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun presignedJsonStatementUrl(presignedJsonStatementUrl: JsonField<String>) = apply {
            this.presignedJsonStatementUrl = presignedJsonStatementUrl
        }

        /**
         * The current status of the StatementJob. The status helps track the progress and outcome
         * of a StatementJob.
         */
        fun statementJobStatus(statementJobStatus: StatementJobStatus) =
            statementJobStatus(JsonField.of(statementJobStatus))

        /**
         * Sets [Builder.statementJobStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statementJobStatus] with a well-typed
         * [StatementJobStatus] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun statementJobStatus(statementJobStatus: JsonField<StatementJobStatus>) = apply {
            this.statementJobStatus = statementJobStatus
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
         * Returns an immutable instance of [StatementJobResponse].
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
        fun build(): StatementJobResponse =
            StatementJobResponse(
                checkRequired("id", id),
                billId,
                createdBy,
                dtCreated,
                dtLastModified,
                includeCsvFormat,
                lastModifiedBy,
                orgId,
                presignedJsonStatementUrl,
                statementJobStatus,
                version,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): StatementJobResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        billId()
        createdBy()
        dtCreated()
        dtLastModified()
        includeCsvFormat()
        lastModifiedBy()
        orgId()
        presignedJsonStatementUrl()
        statementJobStatus().ifPresent { it.validate() }
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
            (if (billId.asKnown().isPresent) 1 else 0) +
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (dtCreated.asKnown().isPresent) 1 else 0) +
            (if (dtLastModified.asKnown().isPresent) 1 else 0) +
            (if (includeCsvFormat.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (if (orgId.asKnown().isPresent) 1 else 0) +
            (if (presignedJsonStatementUrl.asKnown().isPresent) 1 else 0) +
            (statementJobStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (version.asKnown().isPresent) 1 else 0)

    /**
     * The current status of the StatementJob. The status helps track the progress and outcome of a
     * StatementJob.
     */
    class StatementJobStatus
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PENDING = of("PENDING")

            @JvmField val RUNNING = of("RUNNING")

            @JvmField val COMPLETE = of("COMPLETE")

            @JvmField val CANCELLED = of("CANCELLED")

            @JvmField val FAILED = of("FAILED")

            @JvmStatic fun of(value: String) = StatementJobStatus(JsonField.of(value))
        }

        /** An enum containing [StatementJobStatus]'s known values. */
        enum class Known {
            PENDING,
            RUNNING,
            COMPLETE,
            CANCELLED,
            FAILED,
        }

        /**
         * An enum containing [StatementJobStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [StatementJobStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            RUNNING,
            COMPLETE,
            CANCELLED,
            FAILED,
            /**
             * An enum member indicating that [StatementJobStatus] was instantiated with an unknown
             * value.
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
                PENDING -> Value.PENDING
                RUNNING -> Value.RUNNING
                COMPLETE -> Value.COMPLETE
                CANCELLED -> Value.CANCELLED
                FAILED -> Value.FAILED
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
                PENDING -> Known.PENDING
                RUNNING -> Known.RUNNING
                COMPLETE -> Known.COMPLETE
                CANCELLED -> Known.CANCELLED
                FAILED -> Known.FAILED
                else -> throw M3terInvalidDataException("Unknown StatementJobStatus: $value")
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

        fun validate(): StatementJobStatus = apply {
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

            return other is StatementJobStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StatementJobResponse &&
            id == other.id &&
            billId == other.billId &&
            createdBy == other.createdBy &&
            dtCreated == other.dtCreated &&
            dtLastModified == other.dtLastModified &&
            includeCsvFormat == other.includeCsvFormat &&
            lastModifiedBy == other.lastModifiedBy &&
            orgId == other.orgId &&
            presignedJsonStatementUrl == other.presignedJsonStatementUrl &&
            statementJobStatus == other.statementJobStatus &&
            version == other.version &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            billId,
            createdBy,
            dtCreated,
            dtLastModified,
            includeCsvFormat,
            lastModifiedBy,
            orgId,
            presignedJsonStatementUrl,
            statementJobStatus,
            version,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "StatementJobResponse{id=$id, billId=$billId, createdBy=$createdBy, dtCreated=$dtCreated, dtLastModified=$dtLastModified, includeCsvFormat=$includeCsvFormat, lastModifiedBy=$lastModifiedBy, orgId=$orgId, presignedJsonStatementUrl=$presignedJsonStatementUrl, statementJobStatus=$statementJobStatus, version=$version, additionalProperties=$additionalProperties}"
}
