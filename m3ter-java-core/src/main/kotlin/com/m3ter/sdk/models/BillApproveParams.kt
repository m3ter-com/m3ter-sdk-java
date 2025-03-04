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
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import java.util.Objects
import java.util.Optional

/**
 * Approve multiple Bills for the specified Organization based on the given criteria.
 *
 * This endpoint allows you to change currently _Pending_ Bills to _Approved_ status for further
 * processing.
 *
 * Query Parameters:
 * - Use `accountIds` to approve Bills for specifed Accounts.
 *
 * Request Body Schema Parameter:
 * - Use `billIds` to specify a collection of Bills for batch approval.
 *
 * **Important!** If you use the `billIds` Request Body Schema parameter, any Query parameters you
 * might have also used are ignored when the call is processed.
 */
class BillApproveParams
private constructor(
    private val orgId: String,
    private val accountIds: String?,
    private val externalInvoiceDateEnd: String?,
    private val externalInvoiceDateStart: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    /**
     * List of Account IDs to filter Bills. This allows you to approve Bills for specific Accounts
     * within the Organization.
     */
    fun accountIds(): Optional<String> = Optional.ofNullable(accountIds)

    /**
     * End date for filtering Bills by external invoice date. Includes Bills with dates earlier than
     * this date.
     */
    fun externalInvoiceDateEnd(): Optional<String> = Optional.ofNullable(externalInvoiceDateEnd)

    /**
     * Start date for filtering Bills by external invoice date. Includes Bills with dates equal to
     * or later than this date.
     */
    fun externalInvoiceDateStart(): Optional<String> = Optional.ofNullable(externalInvoiceDateStart)

    /** Use to specify a collection of Bills by their IDs for batch approval */
    fun billIds(): List<String> = body.billIds()

    /** Use to specify a collection of Bills by their IDs for batch approval */
    fun _billIds(): JsonField<List<String>> = body._billIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.accountIds?.let { queryParams.put("accountIds", listOf(it.toString())) }
        this.externalInvoiceDateEnd?.let {
            queryParams.put("externalInvoiceDateEnd", listOf(it.toString()))
        }
        this.externalInvoiceDateStart?.let {
            queryParams.put("externalInvoiceDateStart", listOf(it.toString()))
        }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> orgId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("billIds")
        @ExcludeMissing
        private val billIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Use to specify a collection of Bills by their IDs for batch approval */
        fun billIds(): List<String> = billIds.getRequired("billIds")

        /** Use to specify a collection of Bills by their IDs for batch approval */
        @JsonProperty("billIds") @ExcludeMissing fun _billIds(): JsonField<List<String>> = billIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            billIds()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var billIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                billIds = body.billIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Use to specify a collection of Bills by their IDs for batch approval */
            fun billIds(billIds: List<String>) = billIds(JsonField.of(billIds))

            /** Use to specify a collection of Bills by their IDs for batch approval */
            fun billIds(billIds: JsonField<List<String>>) = apply {
                this.billIds = billIds.map { it.toMutableList() }
            }

            /** Use to specify a collection of Bills by their IDs for batch approval */
            fun addBillId(billId: String) = apply {
                billIds =
                    (billIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(billId)
                    }
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

            fun build(): Body =
                Body(
                    checkRequired("billIds", billIds).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && billIds == other.billIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(billIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{billIds=$billIds, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BillApproveParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var accountIds: String? = null
        private var externalInvoiceDateEnd: String? = null
        private var externalInvoiceDateStart: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(billApproveParams: BillApproveParams) = apply {
            orgId = billApproveParams.orgId
            accountIds = billApproveParams.accountIds
            externalInvoiceDateEnd = billApproveParams.externalInvoiceDateEnd
            externalInvoiceDateStart = billApproveParams.externalInvoiceDateStart
            body = billApproveParams.body.toBuilder()
            additionalHeaders = billApproveParams.additionalHeaders.toBuilder()
            additionalQueryParams = billApproveParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        /**
         * List of Account IDs to filter Bills. This allows you to approve Bills for specific
         * Accounts within the Organization.
         */
        fun accountIds(accountIds: String?) = apply { this.accountIds = accountIds }

        /**
         * List of Account IDs to filter Bills. This allows you to approve Bills for specific
         * Accounts within the Organization.
         */
        fun accountIds(accountIds: Optional<String>) = accountIds(accountIds.orElse(null))

        /**
         * End date for filtering Bills by external invoice date. Includes Bills with dates earlier
         * than this date.
         */
        fun externalInvoiceDateEnd(externalInvoiceDateEnd: String?) = apply {
            this.externalInvoiceDateEnd = externalInvoiceDateEnd
        }

        /**
         * End date for filtering Bills by external invoice date. Includes Bills with dates earlier
         * than this date.
         */
        fun externalInvoiceDateEnd(externalInvoiceDateEnd: Optional<String>) =
            externalInvoiceDateEnd(externalInvoiceDateEnd.orElse(null))

        /**
         * Start date for filtering Bills by external invoice date. Includes Bills with dates equal
         * to or later than this date.
         */
        fun externalInvoiceDateStart(externalInvoiceDateStart: String?) = apply {
            this.externalInvoiceDateStart = externalInvoiceDateStart
        }

        /**
         * Start date for filtering Bills by external invoice date. Includes Bills with dates equal
         * to or later than this date.
         */
        fun externalInvoiceDateStart(externalInvoiceDateStart: Optional<String>) =
            externalInvoiceDateStart(externalInvoiceDateStart.orElse(null))

        /** Use to specify a collection of Bills by their IDs for batch approval */
        fun billIds(billIds: List<String>) = apply { body.billIds(billIds) }

        /** Use to specify a collection of Bills by their IDs for batch approval */
        fun billIds(billIds: JsonField<List<String>>) = apply { body.billIds(billIds) }

        /** Use to specify a collection of Bills by their IDs for batch approval */
        fun addBillId(billId: String) = apply { body.addBillId(billId) }

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

        fun build(): BillApproveParams =
            BillApproveParams(
                checkRequired("orgId", orgId),
                accountIds,
                externalInvoiceDateEnd,
                externalInvoiceDateStart,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BillApproveParams && orgId == other.orgId && accountIds == other.accountIds && externalInvoiceDateEnd == other.externalInvoiceDateEnd && externalInvoiceDateStart == other.externalInvoiceDateStart && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, accountIds, externalInvoiceDateEnd, externalInvoiceDateStart, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "BillApproveParams{orgId=$orgId, accountIds=$accountIds, externalInvoiceDateEnd=$externalInvoiceDateEnd, externalInvoiceDateStart=$externalInvoiceDateStart, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
