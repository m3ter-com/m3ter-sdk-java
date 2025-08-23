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
 * Create a batch of StatementJobs for multiple bills.
 *
 * Initiate the creation of multiple StatementJobs asynchronously for the list of bills with the
 * given UUIDs:
 * - The default format for generating Bill Statements is in JSON format and according to the Bill
 *   Statement Definition you've specified at either Organization level or Account level.
 * - If you also want to generate the Statements in CSV format, use the `includeCsvFormat` request
 *   body parameter.
 * - The response body provides a time-bound pre-signed URL, which you can use to download the JSON
 *   format Statement.
 * - When you have generated a Statement for a Bill, you can also obtain a time-bound pre-signed
 *   download URL using either the
 *   [Retrieve Bill Statement in JSON Format](https://www.m3ter.com/docs/api#tag/Bill/operation/GetBillJsonStatement)
 *   and
 *   [Retrieve Bill Statement in CSV Format](https://www.m3ter.com/docs/api#tag/Bill/operation/GetBillCsvStatement)
 *   calls found in the [Bill](https://www.m3ter.com/docs/api#tag/Bill) section of this API
 *   Reference.
 *
 * **Notes:**
 * - If the response to the Create StatementJob call shows the `statementJobStatus` as `PENDING` or
 *   `RUNNING`, you will not receive the pre-signed URL in the response. Wait a few minutes to allow
 *   the StatementJob to complete and then use the
 *   [Get StatmentJob](https://www.m3ter.com/docs/api#tag/StatementJob/operation/GetStatementJob)
 *   call in this section to obtain the pre-signed download URL for the generated Bill Statement.
 * - When you have submitted a StatementJob and a Bill Statement has been generated, you can also
 *   download the Statement directly from a Bill Details page in the Console. See
 *   [Working with Bill Statements](https://www.m3ter.com/docs/guides/billing-and-usage-data/running-viewing-and-managing-bills/working-with-bill-statements)
 *   in our user Documentation.
 */
class StatementStatementJobCreateBatchParams
private constructor(
    private val orgId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /**
     * The list of unique identifiers (UUIDs) of the bills associated with the StatementJob.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billIds(): List<String> = body.billIds()

    /**
     * A Boolean value indicating whether the generated statement includes a CSV format.
     * - TRUE - includes the statement in CSV format.
     * - FALSE - no CSV format statement.
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeCsvFormat(): Optional<Boolean> = body.includeCsvFormat()

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
     * Returns the raw JSON value of [billIds].
     *
     * Unlike [billIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billIds(): JsonField<List<String>> = body._billIds()

    /**
     * Returns the raw JSON value of [includeCsvFormat].
     *
     * Unlike [includeCsvFormat], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _includeCsvFormat(): JsonField<Boolean> = body._includeCsvFormat()

    /**
     * Returns the raw JSON value of [version].
     *
     * Unlike [version], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _version(): JsonField<Long> = body._version()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [StatementStatementJobCreateBatchParams].
         *
         * The following fields are required:
         * ```java
         * .billIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [StatementStatementJobCreateBatchParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            statementStatementJobCreateBatchParams: StatementStatementJobCreateBatchParams
        ) = apply {
            orgId = statementStatementJobCreateBatchParams.orgId
            body = statementStatementJobCreateBatchParams.body.toBuilder()
            additionalHeaders = statementStatementJobCreateBatchParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                statementStatementJobCreateBatchParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [billIds]
         * - [includeCsvFormat]
         * - [version]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The list of unique identifiers (UUIDs) of the bills associated with the StatementJob. */
        fun billIds(billIds: List<String>) = apply { body.billIds(billIds) }

        /**
         * Sets [Builder.billIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billIds] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun billIds(billIds: JsonField<List<String>>) = apply { body.billIds(billIds) }

        /**
         * Adds a single [String] to [billIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBillId(billId: String) = apply { body.addBillId(billId) }

        /**
         * A Boolean value indicating whether the generated statement includes a CSV format.
         * - TRUE - includes the statement in CSV format.
         * - FALSE - no CSV format statement.
         */
        fun includeCsvFormat(includeCsvFormat: Boolean) = apply {
            body.includeCsvFormat(includeCsvFormat)
        }

        /**
         * Sets [Builder.includeCsvFormat] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeCsvFormat] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeCsvFormat(includeCsvFormat: JsonField<Boolean>) = apply {
            body.includeCsvFormat(includeCsvFormat)
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
         * Returns an immutable instance of [StatementStatementJobCreateBatchParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .billIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): StatementStatementJobCreateBatchParams =
            StatementStatementJobCreateBatchParams(
                orgId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> orgId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val billIds: JsonField<List<String>>,
        private val includeCsvFormat: JsonField<Boolean>,
        private val version: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billIds")
            @ExcludeMissing
            billIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("includeCsvFormat")
            @ExcludeMissing
            includeCsvFormat: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("version") @ExcludeMissing version: JsonField<Long> = JsonMissing.of(),
        ) : this(billIds, includeCsvFormat, version, mutableMapOf())

        /**
         * The list of unique identifiers (UUIDs) of the bills associated with the StatementJob.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billIds(): List<String> = billIds.getRequired("billIds")

        /**
         * A Boolean value indicating whether the generated statement includes a CSV format.
         * - TRUE - includes the statement in CSV format.
         * - FALSE - no CSV format statement.
         *
         * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun includeCsvFormat(): Optional<Boolean> = includeCsvFormat.getOptional("includeCsvFormat")

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
         * Returns the raw JSON value of [billIds].
         *
         * Unlike [billIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("billIds") @ExcludeMissing fun _billIds(): JsonField<List<String>> = billIds

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
             * .billIds()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var billIds: JsonField<MutableList<String>>? = null
            private var includeCsvFormat: JsonField<Boolean> = JsonMissing.of()
            private var version: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                billIds = body.billIds.map { it.toMutableList() }
                includeCsvFormat = body.includeCsvFormat
                version = body.version
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The list of unique identifiers (UUIDs) of the bills associated with the StatementJob.
             */
            fun billIds(billIds: List<String>) = billIds(JsonField.of(billIds))

            /**
             * Sets [Builder.billIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billIds(billIds: JsonField<List<String>>) = apply {
                this.billIds = billIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [billIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBillId(billId: String) = apply {
                billIds =
                    (billIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("billIds", it).add(billId)
                    }
            }

            /**
             * A Boolean value indicating whether the generated statement includes a CSV format.
             * - TRUE - includes the statement in CSV format.
             * - FALSE - no CSV format statement.
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
             * .billIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("billIds", billIds).map { it.toImmutable() },
                    includeCsvFormat,
                    version,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            billIds()
            includeCsvFormat()
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
            (billIds.asKnown().getOrNull()?.size ?: 0) +
                (if (includeCsvFormat.asKnown().isPresent) 1 else 0) +
                (if (version.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                billIds == other.billIds &&
                includeCsvFormat == other.includeCsvFormat &&
                version == other.version &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(billIds, includeCsvFormat, version, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{billIds=$billIds, includeCsvFormat=$includeCsvFormat, version=$version, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StatementStatementJobCreateBatchParams &&
            orgId == other.orgId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(orgId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "StatementStatementJobCreateBatchParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
