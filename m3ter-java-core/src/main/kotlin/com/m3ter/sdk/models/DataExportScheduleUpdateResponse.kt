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
@JsonDeserialize(using = DataExportScheduleUpdateResponse.Deserializer::class)
@JsonSerialize(using = DataExportScheduleUpdateResponse.Serializer::class)
class DataExportScheduleUpdateResponse
private constructor(
    private val operationalDataExportSchedule: OperationalDataExportScheduleResponse? = null,
    private val usageDataExportSchedule: UsageDataExportScheduleResponse? = null,
    private val _json: JsonValue? = null,
) {

    /** Response representing an operational data export configuration. */
    fun operationalDataExportSchedule(): Optional<OperationalDataExportScheduleResponse> =
        Optional.ofNullable(operationalDataExportSchedule)

    /** Response representing an usage data export configuration. */
    fun usageDataExportSchedule(): Optional<UsageDataExportScheduleResponse> =
        Optional.ofNullable(usageDataExportSchedule)

    fun isOperationalDataExportSchedule(): Boolean = operationalDataExportSchedule != null

    fun isUsageDataExportSchedule(): Boolean = usageDataExportSchedule != null

    /** Response representing an operational data export configuration. */
    fun asOperationalDataExportSchedule(): OperationalDataExportScheduleResponse =
        operationalDataExportSchedule.getOrThrow("operationalDataExportSchedule")

    /** Response representing an usage data export configuration. */
    fun asUsageDataExportSchedule(): UsageDataExportScheduleResponse =
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

    fun validate(): DataExportScheduleUpdateResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitOperationalDataExportSchedule(
                    operationalDataExportSchedule: OperationalDataExportScheduleResponse
                ) {
                    operationalDataExportSchedule.validate()
                }

                override fun visitUsageDataExportSchedule(
                    usageDataExportSchedule: UsageDataExportScheduleResponse
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

        return /* spotless:off */ other is DataExportScheduleUpdateResponse && operationalDataExportSchedule == other.operationalDataExportSchedule && usageDataExportSchedule == other.usageDataExportSchedule /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(operationalDataExportSchedule, usageDataExportSchedule) /* spotless:on */

    override fun toString(): String =
        when {
            operationalDataExportSchedule != null ->
                "DataExportScheduleUpdateResponse{operationalDataExportSchedule=$operationalDataExportSchedule}"
            usageDataExportSchedule != null ->
                "DataExportScheduleUpdateResponse{usageDataExportSchedule=$usageDataExportSchedule}"
            _json != null -> "DataExportScheduleUpdateResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid DataExportScheduleUpdateResponse")
        }

    companion object {

        /** Response representing an operational data export configuration. */
        @JvmStatic
        fun ofOperationalDataExportSchedule(
            operationalDataExportSchedule: OperationalDataExportScheduleResponse
        ) =
            DataExportScheduleUpdateResponse(
                operationalDataExportSchedule = operationalDataExportSchedule
            )

        /** Response representing an usage data export configuration. */
        @JvmStatic
        fun ofUsageDataExportSchedule(usageDataExportSchedule: UsageDataExportScheduleResponse) =
            DataExportScheduleUpdateResponse(usageDataExportSchedule = usageDataExportSchedule)
    }

    /**
     * An interface that defines how to map each variant of [DataExportScheduleUpdateResponse] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        /** Response representing an operational data export configuration. */
        fun visitOperationalDataExportSchedule(
            operationalDataExportSchedule: OperationalDataExportScheduleResponse
        ): T

        /** Response representing an usage data export configuration. */
        fun visitUsageDataExportSchedule(
            usageDataExportSchedule: UsageDataExportScheduleResponse
        ): T

        /**
         * Maps an unknown variant of [DataExportScheduleUpdateResponse] to a value of type [T].
         *
         * An instance of [DataExportScheduleUpdateResponse] can contain an unknown variant if it
         * was deserialized from data that doesn't match any known variant. For example, if the SDK
         * is on an older version than the API, then the API may respond with new variants that the
         * SDK is unaware of.
         *
         * @throws M3terInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw M3terInvalidDataException("Unknown DataExportScheduleUpdateResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<DataExportScheduleUpdateResponse>(
            DataExportScheduleUpdateResponse::class
        ) {

        override fun ObjectCodec.deserialize(node: JsonNode): DataExportScheduleUpdateResponse {
            val json = JsonValue.fromJsonNode(node)
            val sourceType = json.asObject().getOrNull()?.get("sourceType")?.asString()?.getOrNull()

            when (sourceType) {}

            tryDeserialize(node, jacksonTypeRef<OperationalDataExportScheduleResponse>()) {
                    it.validate()
                }
                ?.let {
                    return DataExportScheduleUpdateResponse(
                        operationalDataExportSchedule = it,
                        _json = json,
                    )
                }
            tryDeserialize(node, jacksonTypeRef<UsageDataExportScheduleResponse>()) {
                    it.validate()
                }
                ?.let {
                    return DataExportScheduleUpdateResponse(
                        usageDataExportSchedule = it,
                        _json = json,
                    )
                }

            return DataExportScheduleUpdateResponse(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<DataExportScheduleUpdateResponse>(DataExportScheduleUpdateResponse::class) {

        override fun serialize(
            value: DataExportScheduleUpdateResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.operationalDataExportSchedule != null ->
                    generator.writeObject(value.operationalDataExportSchedule)
                value.usageDataExportSchedule != null ->
                    generator.writeObject(value.usageDataExportSchedule)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid DataExportScheduleUpdateResponse")
            }
        }
    }
}
