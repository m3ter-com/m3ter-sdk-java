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
import com.m3ter.sdk.core.getOrThrow
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response representing an operational data export configuration. */
@JsonDeserialize(using = DataExportScheduleRetrieveResponse.Deserializer::class)
@JsonSerialize(using = DataExportScheduleRetrieveResponse.Serializer::class)
class DataExportScheduleRetrieveResponse
private constructor(
    private val operationalDataExportSchedule: OperationalDataExportSchedule? = null,
    private val usageDataExportSchedule: UsageDataExportSchedule? = null,
    private val _json: JsonValue? = null,
) {

    /** Response representing an operational data export configuration. */
    fun operationalDataExportSchedule(): Optional<OperationalDataExportSchedule> =
        Optional.ofNullable(operationalDataExportSchedule)

    /** Response representing an usage data export configuration. */
    fun usageDataExportSchedule(): Optional<UsageDataExportSchedule> =
        Optional.ofNullable(usageDataExportSchedule)

    fun isOperationalDataExportSchedule(): Boolean = operationalDataExportSchedule != null

    fun isUsageDataExportSchedule(): Boolean = usageDataExportSchedule != null

    /** Response representing an operational data export configuration. */
    fun asOperationalDataExportSchedule(): OperationalDataExportSchedule =
        operationalDataExportSchedule.getOrThrow("operationalDataExportSchedule")

    /** Response representing an usage data export configuration. */
    fun asUsageDataExportSchedule(): UsageDataExportSchedule =
        usageDataExportSchedule.getOrThrow("usageDataExportSchedule")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            operationalDataExportSchedule != null ->
                visitor.visitOperationalDataExportSchedule(operationalDataExportSchedule)
            usageDataExportSchedule != null ->
                visitor.visitUsageDataExportSchedule(usageDataExportSchedule)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): DataExportScheduleRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitOperationalDataExportSchedule(
                    operationalDataExportSchedule: OperationalDataExportSchedule
                ) {
                    operationalDataExportSchedule.validate()
                }

                override fun visitUsageDataExportSchedule(
                    usageDataExportSchedule: UsageDataExportSchedule
                ) {
                    usageDataExportSchedule.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportScheduleRetrieveResponse && operationalDataExportSchedule == other.operationalDataExportSchedule && usageDataExportSchedule == other.usageDataExportSchedule /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(operationalDataExportSchedule, usageDataExportSchedule) /* spotless:on */

    override fun toString(): String =
        when {
            operationalDataExportSchedule != null ->
                "DataExportScheduleRetrieveResponse{operationalDataExportSchedule=$operationalDataExportSchedule}"
            usageDataExportSchedule != null ->
                "DataExportScheduleRetrieveResponse{usageDataExportSchedule=$usageDataExportSchedule}"
            _json != null -> "DataExportScheduleRetrieveResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid DataExportScheduleRetrieveResponse")
        }

    companion object {

        /** Response representing an operational data export configuration. */
        @JvmStatic
        fun ofOperationalDataExportSchedule(
            operationalDataExportSchedule: OperationalDataExportSchedule
        ) =
            DataExportScheduleRetrieveResponse(
                operationalDataExportSchedule = operationalDataExportSchedule
            )

        /** Response representing an usage data export configuration. */
        @JvmStatic
        fun ofUsageDataExportSchedule(usageDataExportSchedule: UsageDataExportSchedule) =
            DataExportScheduleRetrieveResponse(usageDataExportSchedule = usageDataExportSchedule)
    }

    /**
     * An interface that defines how to map each variant of [DataExportScheduleRetrieveResponse] to
     * a value of type [T].
     */
    interface Visitor<out T> {

        /** Response representing an operational data export configuration. */
        fun visitOperationalDataExportSchedule(
            operationalDataExportSchedule: OperationalDataExportSchedule
        ): T

        /** Response representing an usage data export configuration. */
        fun visitUsageDataExportSchedule(usageDataExportSchedule: UsageDataExportSchedule): T

        /**
         * Maps an unknown variant of [DataExportScheduleRetrieveResponse] to a value of type [T].
         *
         * An instance of [DataExportScheduleRetrieveResponse] can contain an unknown variant if it
         * was deserialized from data that doesn't match any known variant. For example, if the SDK
         * is on an older version than the API, then the API may respond with new variants that the
         * SDK is unaware of.
         *
         * @throws M3terInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw M3terInvalidDataException("Unknown DataExportScheduleRetrieveResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<DataExportScheduleRetrieveResponse>(
            DataExportScheduleRetrieveResponse::class
        ) {

        override fun ObjectCodec.deserialize(node: JsonNode): DataExportScheduleRetrieveResponse {
            val json = JsonValue.fromJsonNode(node)
            val sourceType = json.asObject().getOrNull()?.get("sourceType")?.asString()?.getOrNull()

            when (sourceType) {}

            tryDeserialize(node, jacksonTypeRef<OperationalDataExportSchedule>()) { it.validate() }
                ?.let {
                    return DataExportScheduleRetrieveResponse(
                        operationalDataExportSchedule = it,
                        _json = json,
                    )
                }
            tryDeserialize(node, jacksonTypeRef<UsageDataExportSchedule>()) { it.validate() }
                ?.let {
                    return DataExportScheduleRetrieveResponse(
                        usageDataExportSchedule = it,
                        _json = json,
                    )
                }

            return DataExportScheduleRetrieveResponse(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<DataExportScheduleRetrieveResponse>(
            DataExportScheduleRetrieveResponse::class
        ) {

        override fun serialize(
            value: DataExportScheduleRetrieveResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.operationalDataExportSchedule != null ->
                    generator.writeObject(value.operationalDataExportSchedule)
                value.usageDataExportSchedule != null ->
                    generator.writeObject(value.usageDataExportSchedule)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid DataExportScheduleRetrieveResponse")
            }
        }
    }
}
