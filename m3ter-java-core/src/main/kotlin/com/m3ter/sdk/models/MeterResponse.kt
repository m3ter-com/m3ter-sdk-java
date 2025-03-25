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
import com.m3ter.sdk.core.checkKnown
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

class MeterResponse
private constructor(
    private val id: JsonField<String>,
    private val version: JsonField<Long>,
    private val code: JsonField<String>,
    private val createdBy: JsonField<String>,
    private val customFields: JsonField<CustomFields>,
    private val dataFields: JsonField<List<DataFieldResponse>>,
    private val derivedFields: JsonField<List<DerivedField>>,
    private val dtCreated: JsonField<OffsetDateTime>,
    private val dtLastModified: JsonField<OffsetDateTime>,
    private val groupId: JsonField<String>,
    private val lastModifiedBy: JsonField<String>,
    private val name: JsonField<String>,
    private val productId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customFields")
        @ExcludeMissing
        customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("dataFields")
        @ExcludeMissing
        dataFields: JsonField<List<DataFieldResponse>> = JsonMissing.of(),
        @JsonProperty("derivedFields")
        @ExcludeMissing
        derivedFields: JsonField<List<DerivedField>> = JsonMissing.of(),
        @JsonProperty("dtCreated")
        @ExcludeMissing
        dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("dtLastModified")
        @ExcludeMissing
        dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("groupId") @ExcludeMissing groupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("productId") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        version,
        code,
        createdBy,
        customFields,
        dataFields,
        derivedFields,
        dtCreated,
        dtLastModified,
        groupId,
        lastModifiedBy,
        name,
        productId,
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
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun version(): Long = version.getRequired("version")

    /**
     * Code of the Meter - unique short code used to identify the Meter.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

    /**
     * The id of the user who created this meter.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

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
    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("customFields"))

    /**
     * Used to submit categorized raw usage data values for ingest into the platform - either
     * numeric quantitative values or non-numeric data values. At least one required per Meter;
     * maximum 15 per Meter.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataFields(): Optional<List<DataFieldResponse>> =
        Optional.ofNullable(dataFields.getNullable("dataFields"))

    /**
     * Used to submit usage data values for ingest into the platform that are the result of a
     * calculation performed on `dataFields`, `customFields`, or system `Timestamp` fields. Raw
     * usage data is not submitted using `derivedFields`. Maximum 15 per Meter. _(Optional)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun derivedFields(): Optional<List<DerivedField>> =
        Optional.ofNullable(derivedFields.getNullable("derivedFields"))

    /**
     * The DateTime when the meter was created _(in ISO-8601 format)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /**
     * The DateTime when the meter was last modified _(in ISO-8601 format)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /**
     * UUID of the MeterGroup the Meter belongs to. _(Optional)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupId(): Optional<String> = Optional.ofNullable(groupId.getNullable("groupId"))

    /**
     * The id of the user who last modified this meter.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /**
     * Descriptive name for the Meter.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /**
     * UUID of the Product the Meter belongs to. _(Optional)_ - if blank, the Meter is global.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("productId"))

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

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
     * Returns the raw JSON value of [dataFields].
     *
     * Unlike [dataFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataFields")
    @ExcludeMissing
    fun _dataFields(): JsonField<List<DataFieldResponse>> = dataFields

    /**
     * Returns the raw JSON value of [derivedFields].
     *
     * Unlike [derivedFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("derivedFields")
    @ExcludeMissing
    fun _derivedFields(): JsonField<List<DerivedField>> = derivedFields

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
     * Returns the raw JSON value of [groupId].
     *
     * Unlike [groupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("groupId") @ExcludeMissing fun _groupId(): JsonField<String> = groupId

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
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

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
         * Returns a mutable builder for constructing an instance of [MeterResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MeterResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var code: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var dataFields: JsonField<MutableList<DataFieldResponse>>? = null
        private var derivedFields: JsonField<MutableList<DerivedField>>? = null
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var groupId: JsonField<String> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var productId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(meterResponse: MeterResponse) = apply {
            id = meterResponse.id
            version = meterResponse.version
            code = meterResponse.code
            createdBy = meterResponse.createdBy
            customFields = meterResponse.customFields
            dataFields = meterResponse.dataFields.map { it.toMutableList() }
            derivedFields = meterResponse.derivedFields.map { it.toMutableList() }
            dtCreated = meterResponse.dtCreated
            dtLastModified = meterResponse.dtLastModified
            groupId = meterResponse.groupId
            lastModifiedBy = meterResponse.lastModifiedBy
            name = meterResponse.name
            productId = meterResponse.productId
            additionalProperties = meterResponse.additionalProperties.toMutableMap()
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

        /** Code of the Meter - unique short code used to identify the Meter. */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** The id of the user who created this meter. */
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

        /**
         * Used to submit categorized raw usage data values for ingest into the platform - either
         * numeric quantitative values or non-numeric data values. At least one required per Meter;
         * maximum 15 per Meter.
         */
        fun dataFields(dataFields: List<DataFieldResponse>) = dataFields(JsonField.of(dataFields))

        /**
         * Sets [Builder.dataFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataFields] with a well-typed `List<DataFieldResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dataFields(dataFields: JsonField<List<DataFieldResponse>>) = apply {
            this.dataFields = dataFields.map { it.toMutableList() }
        }

        /**
         * Adds a single [DataFieldResponse] to [dataFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDataField(dataField: DataFieldResponse) = apply {
            dataFields =
                (dataFields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dataFields", it).add(dataField)
                }
        }

        /**
         * Used to submit usage data values for ingest into the platform that are the result of a
         * calculation performed on `dataFields`, `customFields`, or system `Timestamp` fields. Raw
         * usage data is not submitted using `derivedFields`. Maximum 15 per Meter. _(Optional)_.
         */
        fun derivedFields(derivedFields: List<DerivedField>) =
            derivedFields(JsonField.of(derivedFields))

        /**
         * Sets [Builder.derivedFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.derivedFields] with a well-typed `List<DerivedField>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun derivedFields(derivedFields: JsonField<List<DerivedField>>) = apply {
            this.derivedFields = derivedFields.map { it.toMutableList() }
        }

        /**
         * Adds a single [DerivedField] to [derivedFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDerivedField(derivedField: DerivedField) = apply {
            derivedFields =
                (derivedFields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("derivedFields", it).add(derivedField)
                }
        }

        /** The DateTime when the meter was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /**
         * Sets [Builder.dtCreated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dtCreated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when the meter was last modified _(in ISO-8601 format)_. */
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

        /** UUID of the MeterGroup the Meter belongs to. _(Optional)_. */
        fun groupId(groupId: String) = groupId(JsonField.of(groupId))

        /**
         * Sets [Builder.groupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

        /** The id of the user who last modified this meter. */
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

        /** Descriptive name for the Meter. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * UUID of the Product the Meter belongs to. _(Optional)_ - if blank, the Meter is global.
         */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

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
         * Returns an immutable instance of [MeterResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .version()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MeterResponse =
            MeterResponse(
                checkRequired("id", id),
                checkRequired("version", version),
                code,
                createdBy,
                customFields,
                (dataFields ?: JsonMissing.of()).map { it.toImmutable() },
                (derivedFields ?: JsonMissing.of()).map { it.toImmutable() },
                dtCreated,
                dtLastModified,
                groupId,
                lastModifiedBy,
                name,
                productId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MeterResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        version()
        code()
        createdBy()
        customFields().ifPresent { it.validate() }
        dataFields().ifPresent { it.forEach { it.validate() } }
        derivedFields().ifPresent { it.forEach { it.validate() } }
        dtCreated()
        dtLastModified()
        groupId()
        lastModifiedBy()
        name()
        productId()
        validated = true
    }

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
    private constructor(private val additionalProperties: MutableMap<String, JsonValue>) {

        @JsonCreator private constructor() : this(mutableMapOf())

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
            fun build(): CustomFields = CustomFields(additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    class DerivedField
    private constructor(
        private val category: JsonField<DataFieldResponse.Category>,
        private val code: JsonField<String>,
        private val name: JsonField<String>,
        private val unit: JsonField<String>,
        private val calculation: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<DataFieldResponse.Category> = JsonMissing.of(),
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("calculation")
            @ExcludeMissing
            calculation: JsonField<String> = JsonMissing.of(),
        ) : this(category, code, name, unit, calculation, mutableMapOf())

        fun toDataFieldResponse(): DataFieldResponse =
            DataFieldResponse.builder().category(category).code(code).name(name).unit(unit).build()

        /**
         * The type of field (WHO, WHAT, WHERE, MEASURE, METADATA, INCOME, COST, OTHER).
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): DataFieldResponse.Category = category.getRequired("category")

        /**
         * Short code to identify the field
         *
         * **NOTE:** Code has a maximum length of 80 characters and can only contain letters,
         * numbers, underscore, and the dollar character, and must not start with a number.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun code(): String = code.getRequired("code")

        /**
         * Descriptive name of the field.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * The units to measure the data with. Should conform to _Unified Code for Units of Measure_
         * (UCUM). Required only for numeric field categories.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun unit(): Optional<String> = Optional.ofNullable(unit.getNullable("unit"))

        /**
         * The calculation used to transform the value of submitted `dataFields` in usage data.
         * Calculation can reference `dataFields`, `customFields`, or system `Timestamp` fields.
         * _(Example: datafieldms datafieldgb)_
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun calculation(): String = calculation.getRequired("calculation")

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category")
        @ExcludeMissing
        fun _category(): JsonField<DataFieldResponse.Category> = category

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [unit].
         *
         * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

        /**
         * Returns the raw JSON value of [calculation].
         *
         * Unlike [calculation], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("calculation")
        @ExcludeMissing
        fun _calculation(): JsonField<String> = calculation

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
             * Returns a mutable builder for constructing an instance of [DerivedField].
             *
             * The following fields are required:
             * ```java
             * .category()
             * .code()
             * .name()
             * .calculation()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DerivedField]. */
        class Builder internal constructor() {

            private var category: JsonField<DataFieldResponse.Category>? = null
            private var code: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var unit: JsonField<String> = JsonMissing.of()
            private var calculation: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(derivedField: DerivedField) = apply {
                category = derivedField.category
                code = derivedField.code
                name = derivedField.name
                unit = derivedField.unit
                calculation = derivedField.calculation
                additionalProperties = derivedField.additionalProperties.toMutableMap()
            }

            /** The type of field (WHO, WHAT, WHERE, MEASURE, METADATA, INCOME, COST, OTHER). */
            fun category(category: DataFieldResponse.Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed
             * [DataFieldResponse.Category] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun category(category: JsonField<DataFieldResponse.Category>) = apply {
                this.category = category
            }

            /**
             * Short code to identify the field
             *
             * **NOTE:** Code has a maximum length of 80 characters and can only contain letters,
             * numbers, underscore, and the dollar character, and must not start with a number.
             */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** Descriptive name of the field. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The units to measure the data with. Should conform to _Unified Code for Units of
             * Measure_ (UCUM). Required only for numeric field categories.
             */
            fun unit(unit: String) = unit(JsonField.of(unit))

            /**
             * Sets [Builder.unit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unit] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun unit(unit: JsonField<String>) = apply { this.unit = unit }

            /**
             * The calculation used to transform the value of submitted `dataFields` in usage data.
             * Calculation can reference `dataFields`, `customFields`, or system `Timestamp` fields.
             * _(Example: datafieldms datafieldgb)_
             */
            fun calculation(calculation: String) = calculation(JsonField.of(calculation))

            /**
             * Sets [Builder.calculation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.calculation] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun calculation(calculation: JsonField<String>) = apply {
                this.calculation = calculation
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
             * Returns an immutable instance of [DerivedField].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .category()
             * .code()
             * .name()
             * .calculation()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DerivedField =
                DerivedField(
                    checkRequired("category", category),
                    checkRequired("code", code),
                    checkRequired("name", name),
                    unit,
                    checkRequired("calculation", calculation),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DerivedField = apply {
            if (validated) {
                return@apply
            }

            category()
            code()
            name()
            unit()
            calculation()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DerivedField && category == other.category && code == other.code && name == other.name && unit == other.unit && calculation == other.calculation && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(category, code, name, unit, calculation, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DerivedField{category=$category, code=$code, name=$name, unit=$unit, calculation=$calculation, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MeterResponse && id == other.id && version == other.version && code == other.code && createdBy == other.createdBy && customFields == other.customFields && dataFields == other.dataFields && derivedFields == other.derivedFields && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && groupId == other.groupId && lastModifiedBy == other.lastModifiedBy && name == other.name && productId == other.productId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, version, code, createdBy, customFields, dataFields, derivedFields, dtCreated, dtLastModified, groupId, lastModifiedBy, name, productId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MeterResponse{id=$id, version=$version, code=$code, createdBy=$createdBy, customFields=$customFields, dataFields=$dataFields, derivedFields=$derivedFields, dtCreated=$dtCreated, dtLastModified=$dtLastModified, groupId=$groupId, lastModifiedBy=$lastModifiedBy, name=$name, productId=$productId, additionalProperties=$additionalProperties}"
}
