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
import com.m3ter.core.checkKnown
import com.m3ter.core.checkRequired
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.core.toImmutable
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update the Meter with the given UUID.
 *
 * **Note:** If you have created Custom Fields for a Meter, when you use this endpoint to update the
 * Meter use the `customFields` parameter to preserve those Custom Fields. If you omit them from the
 * update request, they will be lost.
 */
class MeterUpdateParams
private constructor(
    private val orgId: String?,
    private val id: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun id(): String = id

    /**
     * Code of the Meter - unique short code used to identify the Meter.
     *
     * **NOTE:** Code has a maximum length of 80 characters and must not contain non-printable or
     * whitespace characters (except space), and cannot start/end with whitespace.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): String = body.code()

    /**
     * Used to submit categorized raw usage data values for ingest into the platform - either
     * numeric quantitative values or non-numeric data values. At least one required per Meter;
     * maximum 15 per Meter.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dataFields(): List<DataFieldResponse> = body.dataFields()

    /**
     * Used to submit usage data values for ingest into the platform that are the result of a
     * calculation performed on `dataFields`, `customFields`, or system `Timestamp` fields. Raw
     * usage data is not submitted using `derivedFields`. Maximum 15 per Meter. _(Optional)_.
     *
     * **Note:** Required parameter. If you want to create a Meter without Derived Fields, use an
     * empty array `[]`. If you use a `null`, you'll receive an error.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun derivedFields(): List<DerivedField> = body.derivedFields()

    /**
     * Descriptive name for the Meter.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * User defined fields enabling you to attach custom data. The value for a custom field can be
     * either a string or a number.
     *
     * If `customFields` can also be defined for this entity at the Organizational level,
     * `customField` values defined at individual level override values of `customFields` with the
     * same name defined at Organization level.
     *
     * See
     * [Working with Custom Fields](https://www.m3ter.com/docs/guides/creating-and-managing-products/working-with-custom-fields)
     * in the m3ter documentation for more information.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<CustomFields> = body.customFields()

    /**
     * UUID of the group the Meter belongs to. _(Optional)_.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun groupId(): Optional<String> = body.groupId()

    /**
     * UUID of the product the Meter belongs to. _(Optional)_ - if left blank, the Meter is global.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productId(): Optional<String> = body.productId()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
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
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _code(): JsonField<String> = body._code()

    /**
     * Returns the raw JSON value of [dataFields].
     *
     * Unlike [dataFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dataFields(): JsonField<List<DataFieldResponse>> = body._dataFields()

    /**
     * Returns the raw JSON value of [derivedFields].
     *
     * Unlike [derivedFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _derivedFields(): JsonField<List<DerivedField>> = body._derivedFields()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /**
     * Returns the raw JSON value of [groupId].
     *
     * Unlike [groupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _groupId(): JsonField<String> = body._groupId()

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _productId(): JsonField<String> = body._productId()

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MeterUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .code()
         * .dataFields()
         * .derivedFields()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MeterUpdateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(meterUpdateParams: MeterUpdateParams) = apply {
            orgId = meterUpdateParams.orgId
            id = meterUpdateParams.id
            body = meterUpdateParams.body.toBuilder()
            additionalHeaders = meterUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = meterUpdateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun id(id: String) = apply { this.id = id }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [code]
         * - [dataFields]
         * - [derivedFields]
         * - [name]
         * - [customFields]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Code of the Meter - unique short code used to identify the Meter.
         *
         * **NOTE:** Code has a maximum length of 80 characters and must not contain non-printable
         * or whitespace characters (except space), and cannot start/end with whitespace.
         */
        fun code(code: String) = apply { body.code(code) }

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /**
         * Used to submit categorized raw usage data values for ingest into the platform - either
         * numeric quantitative values or non-numeric data values. At least one required per Meter;
         * maximum 15 per Meter.
         */
        fun dataFields(dataFields: List<DataFieldResponse>) = apply { body.dataFields(dataFields) }

        /**
         * Sets [Builder.dataFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataFields] with a well-typed `List<DataFieldResponse>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dataFields(dataFields: JsonField<List<DataFieldResponse>>) = apply {
            body.dataFields(dataFields)
        }

        /**
         * Adds a single [DataFieldResponse] to [dataFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDataField(dataField: DataFieldResponse) = apply { body.addDataField(dataField) }

        /**
         * Used to submit usage data values for ingest into the platform that are the result of a
         * calculation performed on `dataFields`, `customFields`, or system `Timestamp` fields. Raw
         * usage data is not submitted using `derivedFields`. Maximum 15 per Meter. _(Optional)_.
         *
         * **Note:** Required parameter. If you want to create a Meter without Derived Fields, use
         * an empty array `[]`. If you use a `null`, you'll receive an error.
         */
        fun derivedFields(derivedFields: List<DerivedField>) = apply {
            body.derivedFields(derivedFields)
        }

        /**
         * Sets [Builder.derivedFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.derivedFields] with a well-typed `List<DerivedField>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun derivedFields(derivedFields: JsonField<List<DerivedField>>) = apply {
            body.derivedFields(derivedFields)
        }

        /**
         * Adds a single [DerivedField] to [derivedFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDerivedField(derivedField: DerivedField) = apply {
            body.addDerivedField(derivedField)
        }

        /** Descriptive name for the Meter. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * User defined fields enabling you to attach custom data. The value for a custom field can
         * be either a string or a number.
         *
         * If `customFields` can also be defined for this entity at the Organizational level,
         * `customField` values defined at individual level override values of `customFields` with
         * the same name defined at Organization level.
         *
         * See
         * [Working with Custom Fields](https://www.m3ter.com/docs/guides/creating-and-managing-products/working-with-custom-fields)
         * in the m3ter documentation for more information.
         */
        fun customFields(customFields: CustomFields) = apply { body.customFields(customFields) }

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            body.customFields(customFields)
        }

        /** UUID of the group the Meter belongs to. _(Optional)_. */
        fun groupId(groupId: String) = apply { body.groupId(groupId) }

        /**
         * Sets [Builder.groupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.groupId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun groupId(groupId: JsonField<String>) = apply { body.groupId(groupId) }

        /**
         * UUID of the product the Meter belongs to. _(Optional)_ - if left blank, the Meter is
         * global.
         */
        fun productId(productId: String) = apply { body.productId(productId) }

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { body.productId(productId) }

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
         * Returns an immutable instance of [MeterUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .code()
         * .dataFields()
         * .derivedFields()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MeterUpdateParams =
            MeterUpdateParams(
                orgId,
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            1 -> id
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val code: JsonField<String>,
        private val dataFields: JsonField<List<DataFieldResponse>>,
        private val derivedFields: JsonField<List<DerivedField>>,
        private val name: JsonField<String>,
        private val customFields: JsonField<CustomFields>,
        private val groupId: JsonField<String>,
        private val productId: JsonField<String>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dataFields")
            @ExcludeMissing
            dataFields: JsonField<List<DataFieldResponse>> = JsonMissing.of(),
            @JsonProperty("derivedFields")
            @ExcludeMissing
            derivedFields: JsonField<List<DerivedField>> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customFields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("groupId") @ExcludeMissing groupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("productId")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(
            code,
            dataFields,
            derivedFields,
            name,
            customFields,
            groupId,
            productId,
            version,
            mutableMapOf(),
        )

        /**
         * Code of the Meter - unique short code used to identify the Meter.
         *
         * **NOTE:** Code has a maximum length of 80 characters and must not contain non-printable
         * or whitespace characters (except space), and cannot start/end with whitespace.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun code(): String = code.getRequired("code")

        /**
         * Used to submit categorized raw usage data values for ingest into the platform - either
         * numeric quantitative values or non-numeric data values. At least one required per Meter;
         * maximum 15 per Meter.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dataFields(): List<DataFieldResponse> = dataFields.getRequired("dataFields")

        /**
         * Used to submit usage data values for ingest into the platform that are the result of a
         * calculation performed on `dataFields`, `customFields`, or system `Timestamp` fields. Raw
         * usage data is not submitted using `derivedFields`. Maximum 15 per Meter. _(Optional)_.
         *
         * **Note:** Required parameter. If you want to create a Meter without Derived Fields, use
         * an empty array `[]`. If you use a `null`, you'll receive an error.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun derivedFields(): List<DerivedField> = derivedFields.getRequired("derivedFields")

        /**
         * Descriptive name for the Meter.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * User defined fields enabling you to attach custom data. The value for a custom field can
         * be either a string or a number.
         *
         * If `customFields` can also be defined for this entity at the Organizational level,
         * `customField` values defined at individual level override values of `customFields` with
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
         * UUID of the group the Meter belongs to. _(Optional)_.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun groupId(): Optional<String> = groupId.getOptional("groupId")

        /**
         * UUID of the product the Meter belongs to. _(Optional)_ - if left blank, the Meter is
         * global.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun productId(): Optional<String> = productId.getOptional("productId")

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun version(): Optional<Long> = version.getOptional("version")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

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
         * Unlike [derivedFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("derivedFields")
        @ExcludeMissing
        fun _derivedFields(): JsonField<List<DerivedField>> = derivedFields

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customFields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * Returns the raw JSON value of [groupId].
         *
         * Unlike [groupId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("groupId") @ExcludeMissing fun _groupId(): JsonField<String> = groupId

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

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
             * .code()
             * .dataFields()
             * .derivedFields()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var code: JsonField<String>? = null
            private var dataFields: JsonField<MutableList<DataFieldResponse>>? = null
            private var derivedFields: JsonField<MutableList<DerivedField>>? = null
            private var name: JsonField<String>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var groupId: JsonField<String> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                code = body.code
                dataFields = body.dataFields.map { it.toMutableList() }
                derivedFields = body.derivedFields.map { it.toMutableList() }
                name = body.name
                customFields = body.customFields
                groupId = body.groupId
                productId = body.productId
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Code of the Meter - unique short code used to identify the Meter.
             *
             * **NOTE:** Code has a maximum length of 80 characters and must not contain
             * non-printable or whitespace characters (except space), and cannot start/end with
             * whitespace.
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

            /**
             * Used to submit categorized raw usage data values for ingest into the platform -
             * either numeric quantitative values or non-numeric data values. At least one required
             * per Meter; maximum 15 per Meter.
             */
            fun dataFields(dataFields: List<DataFieldResponse>) =
                dataFields(JsonField.of(dataFields))

            /**
             * Sets [Builder.dataFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dataFields] with a well-typed
             * `List<DataFieldResponse>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
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
             * Used to submit usage data values for ingest into the platform that are the result of
             * a calculation performed on `dataFields`, `customFields`, or system `Timestamp`
             * fields. Raw usage data is not submitted using `derivedFields`. Maximum 15 per Meter.
             * _(Optional)_.
             *
             * **Note:** Required parameter. If you want to create a Meter without Derived Fields,
             * use an empty array `[]`. If you use a `null`, you'll receive an error.
             */
            fun derivedFields(derivedFields: List<DerivedField>) =
                derivedFields(JsonField.of(derivedFields))

            /**
             * Sets [Builder.derivedFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.derivedFields] with a well-typed
             * `List<DerivedField>` value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
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

            /** Descriptive name for the Meter. */
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
             * User defined fields enabling you to attach custom data. The value for a custom field
             * can be either a string or a number.
             *
             * If `customFields` can also be defined for this entity at the Organizational level,
             * `customField` values defined at individual level override values of `customFields`
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

            /** UUID of the group the Meter belongs to. _(Optional)_. */
            fun groupId(groupId: String) = groupId(JsonField.of(groupId))

            /**
             * Sets [Builder.groupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

            /**
             * UUID of the product the Meter belongs to. _(Optional)_ - if left blank, the Meter is
             * global.
             */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

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
             * .code()
             * .dataFields()
             * .derivedFields()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("code", code),
                    checkRequired("dataFields", dataFields).map { it.toImmutable() },
                    checkRequired("derivedFields", derivedFields).map { it.toImmutable() },
                    checkRequired("name", name),
                    customFields,
                    groupId,
                    productId,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            code()
            dataFields().forEach { it.validate() }
            derivedFields().forEach { it.validate() }
            name()
            customFields().ifPresent { it.validate() }
            groupId()
            productId()
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
            (if (code.asKnown().isPresent) 1 else 0) +
                (dataFields.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (derivedFields.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (groupId.asKnown().isPresent) 1 else 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && code == other.code && dataFields == other.dataFields && derivedFields == other.derivedFields && name == other.name && customFields == other.customFields && groupId == other.groupId && productId == other.productId && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(code, dataFields, derivedFields, name, customFields, groupId, productId, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{code=$code, dataFields=$dataFields, derivedFields=$derivedFields, name=$name, customFields=$customFields, groupId=$groupId, productId=$productId, version=$version, additionalProperties=$additionalProperties}"
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
        fun unit(): Optional<String> = unit.getOptional("unit")

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

            category().validate()
            code()
            name()
            unit()
            calculation()
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
            (category.asKnown().getOrNull()?.validity() ?: 0) +
                (if (code.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (unit.asKnown().isPresent) 1 else 0) +
                (if (calculation.asKnown().isPresent) 1 else 0)

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

    /**
     * User defined fields enabling you to attach custom data. The value for a custom field can be
     * either a string or a number.
     *
     * If `customFields` can also be defined for this entity at the Organizational level,
     * `customField` values defined at individual level override values of `customFields` with the
     * same name defined at Organization level.
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

            return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is MeterUpdateParams && orgId == other.orgId && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "MeterUpdateParams{orgId=$orgId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
