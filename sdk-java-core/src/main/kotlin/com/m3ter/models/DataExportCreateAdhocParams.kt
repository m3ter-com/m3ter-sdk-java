// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.BaseDeserializer
import com.m3ter.core.BaseSerializer
import com.m3ter.core.JsonValue
import com.m3ter.core.Params
import com.m3ter.core.allMaxBy
import com.m3ter.core.checkRequired
import com.m3ter.core.getOrThrow
import com.m3ter.core.http.Headers
import com.m3ter.core.http.QueryParams
import com.m3ter.errors.M3terInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Trigger an ad-hoc Data Export. Each ad-hoc Export can be configured for exporting _only one of_
 * either Usage or Operational data:
 *
 * **Operational Data Exports**.
 * - **Entity Types**. Use the `operationalDataTypes` parameter to specify the entities whose
 *   operational data you want to include in the ad-hoc export.
 * - **Export Files**. For each of the entity types you select, when the ad-hoc export runs a
 *   separate file is compiled containing the operational data for all entities of that type that
 *   exist in your Organization
 *
 * **Usage Data Exports**.
 * - Select the Meters and Accounts whose usage data you want to include in the ad-hoc export.
 * - You can use the `dimensionFilters` parameter to filter the usage data returned for export by
 *   adding specific values of non-numeric Dimension data fields on included Meters. Only the data
 *   collected for the values you've added for the selected Dimension fields will be included in the
 *   export.
 * - You can use the `aggregations` to apply aggregation methods the usage data returned for export.
 *   This restricts the range of usage data returned for export to only the data collected by
 *   aggregated fields on selected Meters. Nothing is returned for any non-aggregated fields on
 *   Meters. The usage data for Meter fields is returned as the values resulting from applying the
 *   selected aggregation method. See the
 *   [Aggregations for Queries - Options and Consequences](https://www.m3ter.com/docs/guides/data-explorer/usage-data-explorer-v2#aggregations-for-queries---understanding-options-and-consequences)
 *   for more details.
 * - If you've applied `aggregations` to the usage returned for export, you can then use the
 *   `groups` parameter to group the data by _Account_, _Dimension_, or _Time_.
 *
 * **Date Range for Operational Data Exports**. To restrict the operational data included in the
 * ad-hoc export by a date/time range, use the `startDate` date/time request parameter to specify
 * the start of the time period. The export will include all operational data from the specified
 * `startDate` up until the date/time the export job runs.
 *
 * **Date Range for Usage Data Exports**. To restrict the usage data included in the ad-hoc export
 * by date/time range, use the `startDate` and `endDate` date/time parameters:
 * - Both `startDate` and `endDate` are required.
 * - `endDate` must be after `startDate`.
 * - `endDate` cannot be after tomorrow at midnight UTC. For example if today is May 20th 2025, you
 *   can only choose `endDate` to be equal or before 2025-05-21T00:00:00.000Z.
 *
 * **NOTE:** You can use the ExportJob `id` returned to check the status of the triggered ad-hoc
 * export. See the [ExportJob](https://www.m3ter.com/docs/api#tag/ExportJob) section of this API
 * Reference.
 */
class DataExportCreateAdhocParams
private constructor(
    private val orgId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    @Deprecated("the org id should be set at the client level instead")
    fun orgId(): Optional<String> = Optional.ofNullable(orgId)

    /** Request representing an operational data export configuration. */
    fun body(): Body = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DataExportCreateAdhocParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExportCreateAdhocParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dataExportCreateAdhocParams: DataExportCreateAdhocParams) = apply {
            orgId = dataExportCreateAdhocParams.orgId
            body = dataExportCreateAdhocParams.body
            additionalHeaders = dataExportCreateAdhocParams.additionalHeaders.toBuilder()
            additionalQueryParams = dataExportCreateAdhocParams.additionalQueryParams.toBuilder()
        }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        /** Request representing an operational data export configuration. */
        fun body(body: Body) = apply { this.body = body }

        /**
         * Alias for calling [body] with
         * `Body.ofAdHocOperationalDataRequest(adHocOperationalDataRequest)`.
         */
        fun body(adHocOperationalDataRequest: AdHocOperationalDataRequest) =
            body(Body.ofAdHocOperationalDataRequest(adHocOperationalDataRequest))

        /** Alias for calling [body] with `Body.ofAdHocUsageDataRequest(adHocUsageDataRequest)`. */
        fun body(adHocUsageDataRequest: AdHocUsageDataRequest) =
            body(Body.ofAdHocUsageDataRequest(adHocUsageDataRequest))

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
         * Returns an immutable instance of [DataExportCreateAdhocParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DataExportCreateAdhocParams =
            DataExportCreateAdhocParams(
                orgId,
                checkRequired("body", body),
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

    /** Request representing an operational data export configuration. */
    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val adHocOperationalDataRequest: AdHocOperationalDataRequest? = null,
        private val adHocUsageDataRequest: AdHocUsageDataRequest? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Request representing an operational data export configuration. */
        fun adHocOperationalDataRequest(): Optional<AdHocOperationalDataRequest> =
            Optional.ofNullable(adHocOperationalDataRequest)

        /** Request representing a usage data export configuration. */
        fun adHocUsageDataRequest(): Optional<AdHocUsageDataRequest> =
            Optional.ofNullable(adHocUsageDataRequest)

        fun isAdHocOperationalDataRequest(): Boolean = adHocOperationalDataRequest != null

        fun isAdHocUsageDataRequest(): Boolean = adHocUsageDataRequest != null

        /** Request representing an operational data export configuration. */
        fun asAdHocOperationalDataRequest(): AdHocOperationalDataRequest =
            adHocOperationalDataRequest.getOrThrow("adHocOperationalDataRequest")

        /** Request representing a usage data export configuration. */
        fun asAdHocUsageDataRequest(): AdHocUsageDataRequest =
            adHocUsageDataRequest.getOrThrow("adHocUsageDataRequest")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                adHocOperationalDataRequest != null ->
                    visitor.visitAdHocOperationalDataRequest(adHocOperationalDataRequest)
                adHocUsageDataRequest != null ->
                    visitor.visitAdHocUsageDataRequest(adHocUsageDataRequest)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAdHocOperationalDataRequest(
                        adHocOperationalDataRequest: AdHocOperationalDataRequest
                    ) {
                        adHocOperationalDataRequest.validate()
                    }

                    override fun visitAdHocUsageDataRequest(
                        adHocUsageDataRequest: AdHocUsageDataRequest
                    ) {
                        adHocUsageDataRequest.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitAdHocOperationalDataRequest(
                        adHocOperationalDataRequest: AdHocOperationalDataRequest
                    ) = adHocOperationalDataRequest.validity()

                    override fun visitAdHocUsageDataRequest(
                        adHocUsageDataRequest: AdHocUsageDataRequest
                    ) = adHocUsageDataRequest.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                adHocOperationalDataRequest == other.adHocOperationalDataRequest &&
                adHocUsageDataRequest == other.adHocUsageDataRequest
        }

        override fun hashCode(): Int =
            Objects.hash(adHocOperationalDataRequest, adHocUsageDataRequest)

        override fun toString(): String =
            when {
                adHocOperationalDataRequest != null ->
                    "Body{adHocOperationalDataRequest=$adHocOperationalDataRequest}"
                adHocUsageDataRequest != null ->
                    "Body{adHocUsageDataRequest=$adHocUsageDataRequest}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            /** Request representing an operational data export configuration. */
            @JvmStatic
            fun ofAdHocOperationalDataRequest(
                adHocOperationalDataRequest: AdHocOperationalDataRequest
            ) = Body(adHocOperationalDataRequest = adHocOperationalDataRequest)

            /** Request representing a usage data export configuration. */
            @JvmStatic
            fun ofAdHocUsageDataRequest(adHocUsageDataRequest: AdHocUsageDataRequest) =
                Body(adHocUsageDataRequest = adHocUsageDataRequest)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            /** Request representing an operational data export configuration. */
            fun visitAdHocOperationalDataRequest(
                adHocOperationalDataRequest: AdHocOperationalDataRequest
            ): T

            /** Request representing a usage data export configuration. */
            fun visitAdHocUsageDataRequest(adHocUsageDataRequest: AdHocUsageDataRequest): T

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

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<AdHocOperationalDataRequest>())
                                ?.let { Body(adHocOperationalDataRequest = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<AdHocUsageDataRequest>())?.let {
                                Body(adHocUsageDataRequest = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Body(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.adHocOperationalDataRequest != null ->
                        generator.writeObject(value.adHocOperationalDataRequest)
                    value.adHocUsageDataRequest != null ->
                        generator.writeObject(value.adHocUsageDataRequest)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataExportCreateAdhocParams &&
            orgId == other.orgId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(orgId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DataExportCreateAdhocParams{orgId=$orgId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
