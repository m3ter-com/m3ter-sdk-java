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
import com.m3ter.core.checkRequired
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.errors.M3terInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Update a CounterAdjustment for an Account. */
class CounterAdjustmentUpdateParams
private constructor(
    private val orgId: String?,
    private val id: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    fun id(): Optional<String> = Optional.ofNullable(id)

    /**
     * The Account ID the CounterAdjustment is created for.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = body.accountId()

    /**
     * The ID of the Counter used for the CounterAdjustment on the Account.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun counterId(): String = body.counterId()

    /**
     * The date the CounterAdjustment is created for the Account _(in ISO-8601 date format)_.
     *
     * **Note:** CounterAdjustments on Accounts are supported down to a _specific day_ of
     * granularity - you cannot create more than one CounterAdjustment for any given day using the
     * same Counter and you'll receive an error if you try to do this.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun date(): String = body.date()

    /**
     * Integer Value of the Counter used for the CounterAdjustment.
     *
     * **Note:** Use the new absolute value for the Counter for the selected date - if it was 15 and
     * has increased to 20, enter 20; if it was 15 and has decreased to 10, enter 10. _Do not enter_
     * the plus or minus value relative to the previous Counter value on the Account.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): Long = body.value()

    /**
     * Purchase Order Number for the Counter Adjustment. _(Optional)_
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun purchaseOrderNumber(): Optional<String> = body.purchaseOrderNumber()

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
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountId(): JsonField<String> = body._accountId()

    /**
     * Returns the raw JSON value of [counterId].
     *
     * Unlike [counterId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _counterId(): JsonField<String> = body._counterId()

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _date(): JsonField<String> = body._date()

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _value(): JsonField<Long> = body._value()

    /**
     * Returns the raw JSON value of [purchaseOrderNumber].
     *
     * Unlike [purchaseOrderNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _purchaseOrderNumber(): JsonField<String> = body._purchaseOrderNumber()

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
         * Returns a mutable builder for constructing an instance of
         * [CounterAdjustmentUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .counterId()
         * .date()
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CounterAdjustmentUpdateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(counterAdjustmentUpdateParams: CounterAdjustmentUpdateParams) = apply {
            orgId = counterAdjustmentUpdateParams.orgId
            id = counterAdjustmentUpdateParams.id
            body = counterAdjustmentUpdateParams.body.toBuilder()
            additionalHeaders = counterAdjustmentUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = counterAdjustmentUpdateParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountId]
         * - [counterId]
         * - [date]
         * - [value]
         * - [purchaseOrderNumber]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The Account ID the CounterAdjustment is created for. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** The ID of the Counter used for the CounterAdjustment on the Account. */
        fun counterId(counterId: String) = apply { body.counterId(counterId) }

        /**
         * Sets [Builder.counterId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.counterId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun counterId(counterId: JsonField<String>) = apply { body.counterId(counterId) }

        /**
         * The date the CounterAdjustment is created for the Account _(in ISO-8601 date format)_.
         *
         * **Note:** CounterAdjustments on Accounts are supported down to a _specific day_ of
         * granularity - you cannot create more than one CounterAdjustment for any given day using
         * the same Counter and you'll receive an error if you try to do this.
         */
        fun date(date: String) = apply { body.date(date) }

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun date(date: JsonField<String>) = apply { body.date(date) }

        /**
         * Integer Value of the Counter used for the CounterAdjustment.
         *
         * **Note:** Use the new absolute value for the Counter for the selected date - if it was 15
         * and has increased to 20, enter 20; if it was 15 and has decreased to 10, enter 10. _Do
         * not enter_ the plus or minus value relative to the previous Counter value on the Account.
         */
        fun value(value: Long) = apply { body.value(value) }

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<Long>) = apply { body.value(value) }

        /** Purchase Order Number for the Counter Adjustment. _(Optional)_ */
        fun purchaseOrderNumber(purchaseOrderNumber: String) = apply {
            body.purchaseOrderNumber(purchaseOrderNumber)
        }

        /**
         * Sets [Builder.purchaseOrderNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purchaseOrderNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun purchaseOrderNumber(purchaseOrderNumber: JsonField<String>) = apply {
            body.purchaseOrderNumber(purchaseOrderNumber)
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
         * Returns an immutable instance of [CounterAdjustmentUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .counterId()
         * .date()
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CounterAdjustmentUpdateParams =
            CounterAdjustmentUpdateParams(
                orgId,
                id,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            1 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val accountId: JsonField<String>,
        private val counterId: JsonField<String>,
        private val date: JsonField<String>,
        private val value: JsonField<Long>,
        private val purchaseOrderNumber: JsonField<String>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountId")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("counterId")
            @ExcludeMissing
            counterId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("date") @ExcludeMissing date: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("purchaseOrderNumber")
            @ExcludeMissing
            purchaseOrderNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(accountId, counterId, date, value, purchaseOrderNumber, version, mutableMapOf())

        /**
         * The Account ID the CounterAdjustment is created for.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("accountId")

        /**
         * The ID of the Counter used for the CounterAdjustment on the Account.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun counterId(): String = counterId.getRequired("counterId")

        /**
         * The date the CounterAdjustment is created for the Account _(in ISO-8601 date format)_.
         *
         * **Note:** CounterAdjustments on Accounts are supported down to a _specific day_ of
         * granularity - you cannot create more than one CounterAdjustment for any given day using
         * the same Counter and you'll receive an error if you try to do this.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun date(): String = date.getRequired("date")

        /**
         * Integer Value of the Counter used for the CounterAdjustment.
         *
         * **Note:** Use the new absolute value for the Counter for the selected date - if it was 15
         * and has increased to 20, enter 20; if it was 15 and has decreased to 10, enter 10. _Do
         * not enter_ the plus or minus value relative to the previous Counter value on the Account.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): Long = value.getRequired("value")

        /**
         * Purchase Order Number for the Counter Adjustment. _(Optional)_
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun purchaseOrderNumber(): Optional<String> =
            purchaseOrderNumber.getOptional("purchaseOrderNumber")

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
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [counterId].
         *
         * Unlike [counterId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("counterId") @ExcludeMissing fun _counterId(): JsonField<String> = counterId

        /**
         * Returns the raw JSON value of [date].
         *
         * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<String> = date

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Long> = value

        /**
         * Returns the raw JSON value of [purchaseOrderNumber].
         *
         * Unlike [purchaseOrderNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("purchaseOrderNumber")
        @ExcludeMissing
        fun _purchaseOrderNumber(): JsonField<String> = purchaseOrderNumber

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
             * .accountId()
             * .counterId()
             * .date()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var counterId: JsonField<String>? = null
            private var date: JsonField<String>? = null
            private var value: JsonField<Long>? = null
            private var purchaseOrderNumber: JsonField<String> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                counterId = body.counterId
                date = body.date
                value = body.value
                purchaseOrderNumber = body.purchaseOrderNumber
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The Account ID the CounterAdjustment is created for. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The ID of the Counter used for the CounterAdjustment on the Account. */
            fun counterId(counterId: String) = counterId(JsonField.of(counterId))

            /**
             * Sets [Builder.counterId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.counterId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun counterId(counterId: JsonField<String>) = apply { this.counterId = counterId }

            /**
             * The date the CounterAdjustment is created for the Account _(in ISO-8601 date
             * format)_.
             *
             * **Note:** CounterAdjustments on Accounts are supported down to a _specific day_ of
             * granularity - you cannot create more than one CounterAdjustment for any given day
             * using the same Counter and you'll receive an error if you try to do this.
             */
            fun date(date: String) = date(JsonField.of(date))

            /**
             * Sets [Builder.date] to an arbitrary JSON value.
             *
             * You should usually call [Builder.date] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun date(date: JsonField<String>) = apply { this.date = date }

            /**
             * Integer Value of the Counter used for the CounterAdjustment.
             *
             * **Note:** Use the new absolute value for the Counter for the selected date - if it
             * was 15 and has increased to 20, enter 20; if it was 15 and has decreased to 10,
             * enter 10. _Do not enter_ the plus or minus value relative to the previous Counter
             * value on the Account.
             */
            fun value(value: Long) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun value(value: JsonField<Long>) = apply { this.value = value }

            /** Purchase Order Number for the Counter Adjustment. _(Optional)_ */
            fun purchaseOrderNumber(purchaseOrderNumber: String) =
                purchaseOrderNumber(JsonField.of(purchaseOrderNumber))

            /**
             * Sets [Builder.purchaseOrderNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.purchaseOrderNumber] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun purchaseOrderNumber(purchaseOrderNumber: JsonField<String>) = apply {
                this.purchaseOrderNumber = purchaseOrderNumber
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
             * .accountId()
             * .counterId()
             * .date()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountId", accountId),
                    checkRequired("counterId", counterId),
                    checkRequired("date", date),
                    checkRequired("value", value),
                    purchaseOrderNumber,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountId()
            counterId()
            date()
            value()
            purchaseOrderNumber()
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
            (if (accountId.asKnown().isPresent) 1 else 0) +
                (if (counterId.asKnown().isPresent) 1 else 0) +
                (if (date.asKnown().isPresent) 1 else 0) +
                (if (value.asKnown().isPresent) 1 else 0) +
                (if (purchaseOrderNumber.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && accountId == other.accountId && counterId == other.counterId && date == other.date && value == other.value && purchaseOrderNumber == other.purchaseOrderNumber && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, counterId, date, value, purchaseOrderNumber, version, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, counterId=$counterId, date=$date, value=$value, purchaseOrderNumber=$purchaseOrderNumber, version=$version, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CounterAdjustmentUpdateParams && orgId == other.orgId && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CounterAdjustmentUpdateParams{orgId=$orgId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
