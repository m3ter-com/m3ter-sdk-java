// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.BaseDeserializer
import com.m3ter.sdk.core.BaseSerializer
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.core.NoAutoDetect
import com.m3ter.sdk.core.Params
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.getOrThrow
import com.m3ter.sdk.core.http.Headers
import com.m3ter.sdk.core.http.QueryParams
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update a Data Export Schedule for the given UUID. Each Schedule can be configured for exporting
 * _only one_ of either Usage or Operational data:
 *
 * **Operational Data Exports**.
 * - Use the `operationalDataTypes` parameter to specify the entities whose operational data you
 *   want to include in the export each time the Export Schedule runs.
 * - For each of the entity types you select, each time the Export Schedule runs a separate file is
 *   compiled containing the operational data for all entities of that type that exist in your
 *   Organization
 *
 * **Usage Data Exports**.
 * - Select the Meters and Accounts whose usage data you want to include in the export each time the
 *   Export Schedule runs.
 * - If _don't want to aggregate_ the usage data collected by the selected Meters, use **ORIGINAL**
 *   for `aggregationFrequency`, which is the _default_. This means the raw usage data collected by
 *   any type of Data Fields and the values for any Derived Fields on the selected Meters will be
 *   included in the export.
 * - If you _do want to aggregate_ the usage data collected by the selected Meters, use one of the
 *   other options for `aggregationFrequency`: **HOUR**, **DAY**, **WEEK**, or **MONTH**. You _must_
 *   then also specified an `aggregation` method to be used on the usage data before export.
 *   Importantly, if you do aggregate usage data, only the usage data collected by any numeric Data
 *   Fields on the selected Meters - those of type **MEASURE**, **INCOME**, or **COST** - will be
 *   included in the export each time the Export Schedule runs.
 */
class DataExportScheduleUpdateParams
private constructor(
    private val orgId: String,
    private val id: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun orgId(): String = orgId

    fun id(): String = id

    /** Request representing an operational schedule configuration. */
    fun body(): Body = body

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> orgId
            1 -> id
            else -> ""
        }
    }

    /** Request representing an operational schedule configuration. */
    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val operationalDataExportScheduleRequest: OperationalDataExportScheduleRequest? =
            null,
        private val usageDataExportScheduleRequest: UsageDataExportScheduleRequest? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Request representing an operational schedule configuration. */
        fun operationalDataExportScheduleRequest(): Optional<OperationalDataExportScheduleRequest> =
            Optional.ofNullable(operationalDataExportScheduleRequest)

        /** Request representing an usage schedule configuration. */
        fun usageDataExportScheduleRequest(): Optional<UsageDataExportScheduleRequest> =
            Optional.ofNullable(usageDataExportScheduleRequest)

        fun isOperationalDataExportScheduleRequest(): Boolean =
            operationalDataExportScheduleRequest != null

        fun isUsageDataExportScheduleRequest(): Boolean = usageDataExportScheduleRequest != null

        /** Request representing an operational schedule configuration. */
        fun asOperationalDataExportScheduleRequest(): OperationalDataExportScheduleRequest =
            operationalDataExportScheduleRequest.getOrThrow("operationalDataExportScheduleRequest")

        /** Request representing an usage schedule configuration. */
        fun asUsageDataExportScheduleRequest(): UsageDataExportScheduleRequest =
            usageDataExportScheduleRequest.getOrThrow("usageDataExportScheduleRequest")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                operationalDataExportScheduleRequest != null ->
                    visitor.visitOperationalDataExportScheduleRequest(
                        operationalDataExportScheduleRequest
                    )
                usageDataExportScheduleRequest != null ->
                    visitor.visitUsageDataExportScheduleRequest(usageDataExportScheduleRequest)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitOperationalDataExportScheduleRequest(
                        operationalDataExportScheduleRequest: OperationalDataExportScheduleRequest
                    ) {
                        operationalDataExportScheduleRequest.validate()
                    }

                    override fun visitUsageDataExportScheduleRequest(
                        usageDataExportScheduleRequest: UsageDataExportScheduleRequest
                    ) {
                        usageDataExportScheduleRequest.validate()
                    }
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && operationalDataExportScheduleRequest == other.operationalDataExportScheduleRequest && usageDataExportScheduleRequest == other.usageDataExportScheduleRequest /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(operationalDataExportScheduleRequest, usageDataExportScheduleRequest) /* spotless:on */

        override fun toString(): String =
            when {
                operationalDataExportScheduleRequest != null ->
                    "Body{operationalDataExportScheduleRequest=$operationalDataExportScheduleRequest}"
                usageDataExportScheduleRequest != null ->
                    "Body{usageDataExportScheduleRequest=$usageDataExportScheduleRequest}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            /** Request representing an operational schedule configuration. */
            @JvmStatic
            fun ofOperationalDataExportScheduleRequest(
                operationalDataExportScheduleRequest: OperationalDataExportScheduleRequest
            ) = Body(operationalDataExportScheduleRequest = operationalDataExportScheduleRequest)

            /** Request representing an usage schedule configuration. */
            @JvmStatic
            fun ofUsageDataExportScheduleRequest(
                usageDataExportScheduleRequest: UsageDataExportScheduleRequest
            ) = Body(usageDataExportScheduleRequest = usageDataExportScheduleRequest)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            /** Request representing an operational schedule configuration. */
            fun visitOperationalDataExportScheduleRequest(
                operationalDataExportScheduleRequest: OperationalDataExportScheduleRequest
            ): T

            /** Request representing an usage schedule configuration. */
            fun visitUsageDataExportScheduleRequest(
                usageDataExportScheduleRequest: UsageDataExportScheduleRequest
            ): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws M3terInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw M3terInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)
                val sourceType =
                    json.asObject().getOrNull()?.get("sourceType")?.asString()?.getOrNull()

                when (sourceType) {}

                tryDeserialize(node, jacksonTypeRef<OperationalDataExportScheduleRequest>()) {
                        it.validate()
                    }
                    ?.let {
                        return Body(operationalDataExportScheduleRequest = it, _json = json)
                    }
                tryDeserialize(node, jacksonTypeRef<UsageDataExportScheduleRequest>()) {
                        it.validate()
                    }
                    ?.let {
                        return Body(usageDataExportScheduleRequest = it, _json = json)
                    }

                return Body(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.operationalDataExportScheduleRequest != null ->
                        generator.writeObject(value.operationalDataExportScheduleRequest)
                    value.usageDataExportScheduleRequest != null ->
                        generator.writeObject(value.usageDataExportScheduleRequest)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DataExportScheduleUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .orgId()
         * .id()
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExportScheduleUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var orgId: String? = null
        private var id: String? = null
        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dataExportScheduleUpdateParams: DataExportScheduleUpdateParams) = apply {
            orgId = dataExportScheduleUpdateParams.orgId
            id = dataExportScheduleUpdateParams.id
            body = dataExportScheduleUpdateParams.body
            additionalHeaders = dataExportScheduleUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = dataExportScheduleUpdateParams.additionalQueryParams.toBuilder()
        }

        fun orgId(orgId: String) = apply { this.orgId = orgId }

        fun id(id: String) = apply { this.id = id }

        /** Request representing an operational schedule configuration. */
        fun body(body: Body) = apply { this.body = body }

        /** Request representing an operational schedule configuration. */
        fun body(operationalDataExportScheduleRequest: OperationalDataExportScheduleRequest) =
            body(Body.ofOperationalDataExportScheduleRequest(operationalDataExportScheduleRequest))

        /** Request representing an usage schedule configuration. */
        fun body(usageDataExportScheduleRequest: UsageDataExportScheduleRequest) =
            body(Body.ofUsageDataExportScheduleRequest(usageDataExportScheduleRequest))

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

        fun build(): DataExportScheduleUpdateParams =
            DataExportScheduleUpdateParams(
                checkRequired("orgId", orgId),
                checkRequired("id", id),
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportScheduleUpdateParams && orgId == other.orgId && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DataExportScheduleUpdateParams{orgId=$orgId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
