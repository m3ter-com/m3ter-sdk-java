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
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Update the Meter with the given UUID.
 *
 * **Note:** If you have created Custom Fields for a Meter, when you use this endpoint to update the
 * Meter use the `customFields` parameter to preserve those Custom Fields. If you omit them from the
 * update request, they will be lost.
 */
class MeterUpdateParams
private constructor(
    private val orgId: String,
    private val id: String,
    private val body: MeterUpdateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    fun id(): String = id

    /**
     * Code of the Meter - unique short code used to identify the Meter.
     *
     * **NOTE:** Code has a maximum length of 80 characters and must not contain non-printable or
     * whitespace characters (except space), and cannot start/end with whitespace.
     */
    fun code(): String = body.code()

    /**
     * Used to submit categorized raw usage data values for ingest into the platform - either
     * numeric quantitative values or non-numeric data values. At least one required per Meter;
     * maximum 15 per Meter.
     */
    fun dataFields(): List<DataField> = body.dataFields()

    /**
     * Used to submit usage data values for ingest into the platform that are the result of a
     * calculation performed on `dataFields`, `customFields`, or system `Timestamp` fields. Raw
     * usage data is not submitted using `derivedFields`. Maximum 15 per Meter. _(Optional)_.
     *
     * **Note:** Required parameter. If you want to create a Meter without Derived Fields, use an
     * empty array `[]`. If you use a `null`, you'll receive an error.
     */
    fun derivedFields(): List<DerivedField> = body.derivedFields()

    /** Descriptive name for the Meter. */
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
     */
    fun customFields(): Optional<CustomFields> = body.customFields()

    /** UUID of the group the Meter belongs to. _(Optional)_. */
    fun groupId(): Optional<String> = body.groupId()

    /**
     * UUID of the product the Meter belongs to. _(Optional)_ - if left blank, the Meter is global.
     */
    fun productId(): Optional<String> = body.productId()

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun version(): Optional<Long> = body.version()

    /**
     * Code of the Meter - unique short code used to identify the Meter.
     *
     * **NOTE:** Code has a maximum length of 80 characters and must not contain non-printable or
     * whitespace characters (except space), and cannot start/end with whitespace.
     */
    fun _code(): JsonField<String> = body._code()

    /**
     * Used to submit categorized raw usage data values for ingest into the platform - either
     * numeric quantitative values or non-numeric data values. At least one required per Meter;
     * maximum 15 per Meter.
     */
    fun _dataFields(): JsonField<List<DataField>> = body._dataFields()

    /**
     * Used to submit usage data values for ingest into the platform that are the result of a
     * calculation performed on `dataFields`, `customFields`, or system `Timestamp` fields. Raw
     * usage data is not submitted using `derivedFields`. Maximum 15 per Meter. _(Optional)_.
     *
     * **Note:** Required parameter. If you want to create a Meter without Derived Fields, use an
     * empty array `[]`. If you use a `null`, you'll receive an error.
     */
    fun _derivedFields(): JsonField<List<DerivedField>> = body._derivedFields()

    /** Descriptive name for the Meter. */
    fun _name(): JsonField<String> = body._name()

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
    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /** UUID of the group the Meter belongs to. _(Optional)_. */
    fun _groupId(): JsonField<String> = body._groupId()

    /**
     * UUID of the product the Meter belongs to. _(Optional)_ - if left blank, the Meter is global.
     */
    fun _productId(): JsonField<String> = body._productId()

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

    @JvmSynthetic internal fun _body(): MeterUpdateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> orgId
            1 -> id
            else -> ""
        }
    }

    @NoAutoDetect
    class MeterUpdateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("code")
        @ExcludeMissing
        private val code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dataFields")
        @ExcludeMissing
        private val dataFields: JsonField<List<DataField>> = JsonMissing.of(),
        @JsonProperty("derivedFields")
        @ExcludeMissing
        private val derivedFields: JsonField<List<DerivedField>> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customFields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("groupId")
        @ExcludeMissing
        private val groupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("productId")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("version")
        @ExcludeMissing
        private val version: JsonField<Long> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * Code of the Meter - unique short code used to identify the Meter.
         *
         * **NOTE:** Code has a maximum length of 80 characters and must not contain non-printable
         * or whitespace characters (except space), and cannot start/end with whitespace.
         */
        fun code(): String = code.getRequired("code")

        /**
         * Used to submit categorized raw usage data values for ingest into the platform - either
         * numeric quantitative values or non-numeric data values. At least one required per Meter;
         * maximum 15 per Meter.
         */
        fun dataFields(): List<DataField> = dataFields.getRequired("dataFields")

        /**
         * Used to submit usage data values for ingest into the platform that are the result of a
         * calculation performed on `dataFields`, `customFields`, or system `Timestamp` fields. Raw
         * usage data is not submitted using `derivedFields`. Maximum 15 per Meter. _(Optional)_.
         *
         * **Note:** Required parameter. If you want to create a Meter without Derived Fields, use
         * an empty array `[]`. If you use a `null`, you'll receive an error.
         */
        fun derivedFields(): List<DerivedField> = derivedFields.getRequired("derivedFields")

        /** Descriptive name for the Meter. */
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
         */
        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("customFields"))

        /** UUID of the group the Meter belongs to. _(Optional)_. */
        fun groupId(): Optional<String> = Optional.ofNullable(groupId.getNullable("groupId"))

        /**
         * UUID of the product the Meter belongs to. _(Optional)_ - if left blank, the Meter is
         * global.
         */
        fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("productId"))

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

        /**
         * Code of the Meter - unique short code used to identify the Meter.
         *
         * **NOTE:** Code has a maximum length of 80 characters and must not contain non-printable
         * or whitespace characters (except space), and cannot start/end with whitespace.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Used to submit categorized raw usage data values for ingest into the platform - either
         * numeric quantitative values or non-numeric data values. At least one required per Meter;
         * maximum 15 per Meter.
         */
        @JsonProperty("dataFields")
        @ExcludeMissing
        fun _dataFields(): JsonField<List<DataField>> = dataFields

        /**
         * Used to submit usage data values for ingest into the platform that are the result of a
         * calculation performed on `dataFields`, `customFields`, or system `Timestamp` fields. Raw
         * usage data is not submitted using `derivedFields`. Maximum 15 per Meter. _(Optional)_.
         *
         * **Note:** Required parameter. If you want to create a Meter without Derived Fields, use
         * an empty array `[]`. If you use a `null`, you'll receive an error.
         */
        @JsonProperty("derivedFields")
        @ExcludeMissing
        fun _derivedFields(): JsonField<List<DerivedField>> = derivedFields

        /** Descriptive name for the Meter. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
        @JsonProperty("customFields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /** UUID of the group the Meter belongs to. _(Optional)_. */
        @JsonProperty("groupId") @ExcludeMissing fun _groupId(): JsonField<String> = groupId

        /**
         * UUID of the product the Meter belongs to. _(Optional)_ - if left blank, the Meter is
         * global.
         */
        @JsonProperty("productId") @ExcludeMissing fun _productId(): JsonField<String> = productId

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

        fun validate(): MeterUpdateBody = apply {
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

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MeterUpdateBody]. */
        class Builder internal constructor() {

            private var code: JsonField<String>? = null
            private var dataFields: JsonField<MutableList<DataField>>? = null
            private var derivedFields: JsonField<MutableList<DerivedField>>? = null
            private var name: JsonField<String>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var groupId: JsonField<String> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meterUpdateBody: MeterUpdateBody) = apply {
                code = meterUpdateBody.code
                dataFields = meterUpdateBody.dataFields.map { it.toMutableList() }
                derivedFields = meterUpdateBody.derivedFields.map { it.toMutableList() }
                name = meterUpdateBody.name
                customFields = meterUpdateBody.customFields
                groupId = meterUpdateBody.groupId
                productId = meterUpdateBody.productId
                version = meterUpdateBody.version
                additionalProperties = meterUpdateBody.additionalProperties.toMutableMap()
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
             * Code of the Meter - unique short code used to identify the Meter.
             *
             * **NOTE:** Code has a maximum length of 80 characters and must not contain
             * non-printable or whitespace characters (except space), and cannot start/end with
             * whitespace.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /**
             * Used to submit categorized raw usage data values for ingest into the platform -
             * either numeric quantitative values or non-numeric data values. At least one required
             * per Meter; maximum 15 per Meter.
             */
            fun dataFields(dataFields: List<DataField>) = dataFields(JsonField.of(dataFields))

            /**
             * Used to submit categorized raw usage data values for ingest into the platform -
             * either numeric quantitative values or non-numeric data values. At least one required
             * per Meter; maximum 15 per Meter.
             */
            fun dataFields(dataFields: JsonField<List<DataField>>) = apply {
                this.dataFields = dataFields.map { it.toMutableList() }
            }

            /**
             * Used to submit categorized raw usage data values for ingest into the platform -
             * either numeric quantitative values or non-numeric data values. At least one required
             * per Meter; maximum 15 per Meter.
             */
            fun addDataField(dataField: DataField) = apply {
                dataFields =
                    (dataFields ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(dataField)
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
             * Used to submit usage data values for ingest into the platform that are the result of
             * a calculation performed on `dataFields`, `customFields`, or system `Timestamp`
             * fields. Raw usage data is not submitted using `derivedFields`. Maximum 15 per Meter.
             * _(Optional)_.
             *
             * **Note:** Required parameter. If you want to create a Meter without Derived Fields,
             * use an empty array `[]`. If you use a `null`, you'll receive an error.
             */
            fun derivedFields(derivedFields: JsonField<List<DerivedField>>) = apply {
                this.derivedFields = derivedFields.map { it.toMutableList() }
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
            fun addDerivedField(derivedField: DerivedField) = apply {
                derivedFields =
                    (derivedFields ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(derivedField)
                    }
            }

            /** Descriptive name for the Meter. */
            fun name(name: String) = name(JsonField.of(name))

            /** Descriptive name for the Meter. */
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
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** UUID of the group the Meter belongs to. _(Optional)_. */
            fun groupId(groupId: String) = groupId(JsonField.of(groupId))

            /** UUID of the group the Meter belongs to. _(Optional)_. */
            fun groupId(groupId: JsonField<String>) = apply { this.groupId = groupId }

            /**
             * UUID of the product the Meter belongs to. _(Optional)_ - if left blank, the Meter is
             * global.
             */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * UUID of the product the Meter belongs to. _(Optional)_ - if left blank, the Meter is
             * global.
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

            fun build(): MeterUpdateBody =
                MeterUpdateBody(
                    checkRequired("code", code),
                    checkRequired("dataFields", dataFields).map { it.toImmutable() },
                    checkRequired("derivedFields", derivedFields).map { it.toImmutable() },
                    checkRequired("name", name),
                    customFields,
                    groupId,
                    productId,
                    version,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MeterUpdateBody && code == other.code && dataFields == other.dataFields && derivedFields == other.derivedFields && name == other.name && customFields == other.customFields && groupId == other.groupId && productId == other.productId && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(code, dataFields, derivedFields, name, customFields, groupId, productId, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MeterUpdateBody{code=$code, dataFields=$dataFields, derivedFields=$derivedFields, name=$name, customFields=$customFields, groupId=$groupId, productId=$productId, version=$version, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MeterUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var id: String? = null
        private var body: MeterUpdateBody.Builder = MeterUpdateBody.builder()
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

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        fun id(id: String) = apply { this.id = id }

        /**
         * Code of the Meter - unique short code used to identify the Meter.
         *
         * **NOTE:** Code has a maximum length of 80 characters and must not contain non-printable
         * or whitespace characters (except space), and cannot start/end with whitespace.
         */
        fun code(code: String) = apply { body.code(code) }

        /**
         * Code of the Meter - unique short code used to identify the Meter.
         *
         * **NOTE:** Code has a maximum length of 80 characters and must not contain non-printable
         * or whitespace characters (except space), and cannot start/end with whitespace.
         */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /**
         * Used to submit categorized raw usage data values for ingest into the platform - either
         * numeric quantitative values or non-numeric data values. At least one required per Meter;
         * maximum 15 per Meter.
         */
        fun dataFields(dataFields: List<DataField>) = apply { body.dataFields(dataFields) }

        /**
         * Used to submit categorized raw usage data values for ingest into the platform - either
         * numeric quantitative values or non-numeric data values. At least one required per Meter;
         * maximum 15 per Meter.
         */
        fun dataFields(dataFields: JsonField<List<DataField>>) = apply {
            body.dataFields(dataFields)
        }

        /**
         * Used to submit categorized raw usage data values for ingest into the platform - either
         * numeric quantitative values or non-numeric data values. At least one required per Meter;
         * maximum 15 per Meter.
         */
        fun addDataField(dataField: DataField) = apply { body.addDataField(dataField) }

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
         * Used to submit usage data values for ingest into the platform that are the result of a
         * calculation performed on `dataFields`, `customFields`, or system `Timestamp` fields. Raw
         * usage data is not submitted using `derivedFields`. Maximum 15 per Meter. _(Optional)_.
         *
         * **Note:** Required parameter. If you want to create a Meter without Derived Fields, use
         * an empty array `[]`. If you use a `null`, you'll receive an error.
         */
        fun derivedFields(derivedFields: JsonField<List<DerivedField>>) = apply {
            body.derivedFields(derivedFields)
        }

        /**
         * Used to submit usage data values for ingest into the platform that are the result of a
         * calculation performed on `dataFields`, `customFields`, or system `Timestamp` fields. Raw
         * usage data is not submitted using `derivedFields`. Maximum 15 per Meter. _(Optional)_.
         *
         * **Note:** Required parameter. If you want to create a Meter without Derived Fields, use
         * an empty array `[]`. If you use a `null`, you'll receive an error.
         */
        fun addDerivedField(derivedField: DerivedField) = apply {
            body.addDerivedField(derivedField)
        }

        /** Descriptive name for the Meter. */
        fun name(name: String) = apply { body.name(name) }

        /** Descriptive name for the Meter. */
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
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            body.customFields(customFields)
        }

        /** UUID of the group the Meter belongs to. _(Optional)_. */
        fun groupId(groupId: String) = apply { body.groupId(groupId) }

        /** UUID of the group the Meter belongs to. _(Optional)_. */
        fun groupId(groupId: JsonField<String>) = apply { body.groupId(groupId) }

        /**
         * UUID of the product the Meter belongs to. _(Optional)_ - if left blank, the Meter is
         * global.
         */
        fun productId(productId: String) = apply { body.productId(productId) }

        /**
         * UUID of the product the Meter belongs to. _(Optional)_ - if left blank, the Meter is
         * global.
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

        fun build(): MeterUpdateParams =
            MeterUpdateParams(
                checkRequired("orgId", orgId),
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class DataField
    @JsonCreator
    private constructor(
        @JsonProperty("category")
        @ExcludeMissing
        private val category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("code")
        @ExcludeMissing
        private val code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unit")
        @ExcludeMissing
        private val unit: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The type of field (WHO, WHAT, WHERE, MEASURE, METADATA, INCOME, COST, OTHER). */
        fun category(): Category = category.getRequired("category")

        /**
         * Short code to identify the field
         *
         * **NOTE:** Code has a maximum length of 80 characters and can only contain letters,
         * numbers, underscore, and the dollar character, and must not start with a number.
         */
        fun code(): String = code.getRequired("code")

        /** Descriptive name of the field. */
        fun name(): String = name.getRequired("name")

        /**
         * The units to measure the data with. Should conform to _Unified Code for Units of Measure_
         * (UCUM). Required only for numeric field categories.
         */
        fun unit(): Optional<String> = Optional.ofNullable(unit.getNullable("unit"))

        /** The type of field (WHO, WHAT, WHERE, MEASURE, METADATA, INCOME, COST, OTHER). */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Short code to identify the field
         *
         * **NOTE:** Code has a maximum length of 80 characters and can only contain letters,
         * numbers, underscore, and the dollar character, and must not start with a number.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /** Descriptive name of the field. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * The units to measure the data with. Should conform to _Unified Code for Units of Measure_
         * (UCUM). Required only for numeric field categories.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DataField = apply {
            if (validated) {
                return@apply
            }

            category()
            code()
            name()
            unit()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DataField]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var code: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var unit: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dataField: DataField) = apply {
                category = dataField.category
                code = dataField.code
                name = dataField.name
                unit = dataField.unit
                additionalProperties = dataField.additionalProperties.toMutableMap()
            }

            /** The type of field (WHO, WHAT, WHERE, MEASURE, METADATA, INCOME, COST, OTHER). */
            fun category(category: Category) = category(JsonField.of(category))

            /** The type of field (WHO, WHAT, WHERE, MEASURE, METADATA, INCOME, COST, OTHER). */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /**
             * Short code to identify the field
             *
             * **NOTE:** Code has a maximum length of 80 characters and can only contain letters,
             * numbers, underscore, and the dollar character, and must not start with a number.
             */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Short code to identify the field
             *
             * **NOTE:** Code has a maximum length of 80 characters and can only contain letters,
             * numbers, underscore, and the dollar character, and must not start with a number.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** Descriptive name of the field. */
            fun name(name: String) = name(JsonField.of(name))

            /** Descriptive name of the field. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The units to measure the data with. Should conform to _Unified Code for Units of
             * Measure_ (UCUM). Required only for numeric field categories.
             */
            fun unit(unit: String) = unit(JsonField.of(unit))

            /**
             * The units to measure the data with. Should conform to _Unified Code for Units of
             * Measure_ (UCUM). Required only for numeric field categories.
             */
            fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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

            fun build(): DataField =
                DataField(
                    checkRequired("category", category),
                    checkRequired("code", code),
                    checkRequired("name", name),
                    unit,
                    additionalProperties.toImmutable(),
                )
        }

        /** The type of field (WHO, WHAT, WHERE, MEASURE, METADATA, INCOME, COST, OTHER). */
        class Category
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val WHO = of("WHO")

                @JvmField val WHERE = of("WHERE")

                @JvmField val WHAT = of("WHAT")

                @JvmField val OTHER = of("OTHER")

                @JvmField val METADATA = of("METADATA")

                @JvmField val MEASURE = of("MEASURE")

                @JvmField val INCOME = of("INCOME")

                @JvmField val COST = of("COST")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                WHO,
                WHERE,
                WHAT,
                OTHER,
                METADATA,
                MEASURE,
                INCOME,
                COST,
            }

            /**
             * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Category] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                WHO,
                WHERE,
                WHAT,
                OTHER,
                METADATA,
                MEASURE,
                INCOME,
                COST,
                /**
                 * An enum member indicating that [Category] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    WHO -> Value.WHO
                    WHERE -> Value.WHERE
                    WHAT -> Value.WHAT
                    OTHER -> Value.OTHER
                    METADATA -> Value.METADATA
                    MEASURE -> Value.MEASURE
                    INCOME -> Value.INCOME
                    COST -> Value.COST
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws M3terInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    WHO -> Known.WHO
                    WHERE -> Known.WHERE
                    WHAT -> Known.WHAT
                    OTHER -> Known.OTHER
                    METADATA -> Known.METADATA
                    MEASURE -> Known.MEASURE
                    INCOME -> Known.INCOME
                    COST -> Known.COST
                    else -> throw M3terInvalidDataException("Unknown Category: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Category && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DataField && category == other.category && code == other.code && name == other.name && unit == other.unit && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(category, code, name, unit, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DataField{category=$category, code=$code, name=$name, unit=$unit, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class DerivedField
    @JsonCreator
    private constructor(
        @JsonProperty("category")
        @ExcludeMissing
        private val category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("code")
        @ExcludeMissing
        private val code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unit")
        @ExcludeMissing
        private val unit: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The type of field (WHO, WHAT, WHERE, MEASURE, METADATA, INCOME, COST, OTHER). */
        fun category(): Category = category.getRequired("category")

        /**
         * Short code to identify the field
         *
         * **NOTE:** Code has a maximum length of 80 characters and can only contain letters,
         * numbers, underscore, and the dollar character, and must not start with a number.
         */
        fun code(): String = code.getRequired("code")

        /** Descriptive name of the field. */
        fun name(): String = name.getRequired("name")

        /**
         * The units to measure the data with. Should conform to _Unified Code for Units of Measure_
         * (UCUM). Required only for numeric field categories.
         */
        fun unit(): Optional<String> = Optional.ofNullable(unit.getNullable("unit"))

        /** The type of field (WHO, WHAT, WHERE, MEASURE, METADATA, INCOME, COST, OTHER). */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Short code to identify the field
         *
         * **NOTE:** Code has a maximum length of 80 characters and can only contain letters,
         * numbers, underscore, and the dollar character, and must not start with a number.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /** Descriptive name of the field. */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * The units to measure the data with. Should conform to _Unified Code for Units of Measure_
         * (UCUM). Required only for numeric field categories.
         */
        @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DerivedField = apply {
            if (validated) {
                return@apply
            }

            category()
            code()
            name()
            unit()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DerivedField]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var code: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var unit: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(derivedField: DerivedField) = apply {
                category = derivedField.category
                code = derivedField.code
                name = derivedField.name
                unit = derivedField.unit
                additionalProperties = derivedField.additionalProperties.toMutableMap()
            }

            /** The type of field (WHO, WHAT, WHERE, MEASURE, METADATA, INCOME, COST, OTHER). */
            fun category(category: Category) = category(JsonField.of(category))

            /** The type of field (WHO, WHAT, WHERE, MEASURE, METADATA, INCOME, COST, OTHER). */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /**
             * Short code to identify the field
             *
             * **NOTE:** Code has a maximum length of 80 characters and can only contain letters,
             * numbers, underscore, and the dollar character, and must not start with a number.
             */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Short code to identify the field
             *
             * **NOTE:** Code has a maximum length of 80 characters and can only contain letters,
             * numbers, underscore, and the dollar character, and must not start with a number.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** Descriptive name of the field. */
            fun name(name: String) = name(JsonField.of(name))

            /** Descriptive name of the field. */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The units to measure the data with. Should conform to _Unified Code for Units of
             * Measure_ (UCUM). Required only for numeric field categories.
             */
            fun unit(unit: String) = unit(JsonField.of(unit))

            /**
             * The units to measure the data with. Should conform to _Unified Code for Units of
             * Measure_ (UCUM). Required only for numeric field categories.
             */
            fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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

            fun build(): DerivedField =
                DerivedField(
                    checkRequired("category", category),
                    checkRequired("code", code),
                    checkRequired("name", name),
                    unit,
                    additionalProperties.toImmutable(),
                )
        }

        /** The type of field (WHO, WHAT, WHERE, MEASURE, METADATA, INCOME, COST, OTHER). */
        class Category
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val WHO = of("WHO")

                @JvmField val WHERE = of("WHERE")

                @JvmField val WHAT = of("WHAT")

                @JvmField val OTHER = of("OTHER")

                @JvmField val METADATA = of("METADATA")

                @JvmField val MEASURE = of("MEASURE")

                @JvmField val INCOME = of("INCOME")

                @JvmField val COST = of("COST")

                @JvmStatic fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                WHO,
                WHERE,
                WHAT,
                OTHER,
                METADATA,
                MEASURE,
                INCOME,
                COST,
            }

            /**
             * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Category] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                WHO,
                WHERE,
                WHAT,
                OTHER,
                METADATA,
                MEASURE,
                INCOME,
                COST,
                /**
                 * An enum member indicating that [Category] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    WHO -> Value.WHO
                    WHERE -> Value.WHERE
                    WHAT -> Value.WHAT
                    OTHER -> Value.OTHER
                    METADATA -> Value.METADATA
                    MEASURE -> Value.MEASURE
                    INCOME -> Value.INCOME
                    COST -> Value.COST
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws M3terInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    WHO -> Known.WHO
                    WHERE -> Known.WHERE
                    WHAT -> Known.WHAT
                    OTHER -> Known.OTHER
                    METADATA -> Known.METADATA
                    MEASURE -> Known.MEASURE
                    INCOME -> Known.INCOME
                    COST -> Known.COST
                    else -> throw M3terInvalidDataException("Unknown Category: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Category && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DerivedField && category == other.category && code == other.code && name == other.name && unit == other.unit && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(category, code, name, unit, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DerivedField{category=$category, code=$code, name=$name, unit=$unit, additionalProperties=$additionalProperties}"
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
    @NoAutoDetect
    class CustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
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
