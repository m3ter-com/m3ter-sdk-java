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
@JsonDeserialize(using = DataExportScheduleDeleteResponse.Deserializer::class)
@JsonSerialize(using = DataExportScheduleDeleteResponse.Serializer::class)
class DataExportScheduleDeleteResponse
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

    fun validate(): DataExportScheduleDeleteResponse = apply {
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

        return /* spotless:off */ other is DataExportScheduleDeleteResponse && operationalDataExportSchedule == other.operationalDataExportSchedule && usageDataExportSchedule == other.usageDataExportSchedule /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(operationalDataExportSchedule, usageDataExportSchedule) /* spotless:on */

    override fun toString(): String =
        when {
            operationalDataExportSchedule != null ->
                "DataExportScheduleDeleteResponse{operationalDataExportSchedule=$operationalDataExportSchedule}"
            usageDataExportSchedule != null ->
                "DataExportScheduleDeleteResponse{usageDataExportSchedule=$usageDataExportSchedule}"
            _json != null -> "DataExportScheduleDeleteResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid DataExportScheduleDeleteResponse")
        }

    companion object {

        /** Response representing an operational data export configuration. */
        @JvmStatic
        fun ofOperationalDataExportSchedule(
            operationalDataExportSchedule: OperationalDataExportSchedule
        ) =
            DataExportScheduleDeleteResponse(
                operationalDataExportSchedule = operationalDataExportSchedule
            )

        /** Response representing an usage data export configuration. */
        @JvmStatic
        fun ofUsageDataExportSchedule(usageDataExportSchedule: UsageDataExportSchedule) =
            DataExportScheduleDeleteResponse(usageDataExportSchedule = usageDataExportSchedule)
    }

    /**
     * An interface that defines how to map each variant of [DataExportScheduleDeleteResponse] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        /** Response representing an operational data export configuration. */
        fun visitOperationalDataExportSchedule(
            operationalDataExportSchedule: OperationalDataExportSchedule
        ): T

        /** Response representing an usage data export configuration. */
        fun visitUsageDataExportSchedule(usageDataExportSchedule: UsageDataExportSchedule): T

        /**
         * Maps an unknown variant of [DataExportScheduleDeleteResponse] to a value of type [T].
         *
         * An instance of [DataExportScheduleDeleteResponse] can contain an unknown variant if it
         * was deserialized from data that doesn't match any known variant. For example, if the SDK
         * is on an older version than the API, then the API may respond with new variants that the
         * SDK is unaware of.
         *
         * @throws M3terInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw M3terInvalidDataException("Unknown DataExportScheduleDeleteResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<DataExportScheduleDeleteResponse>(
            DataExportScheduleDeleteResponse::class
        ) {

        override fun ObjectCodec.deserialize(node: JsonNode): DataExportScheduleDeleteResponse {
            val json = JsonValue.fromJsonNode(node)
            val sourceType = json.asObject().getOrNull()?.get("sourceType")?.asString()?.getOrNull()

            when (sourceType) {}

            tryDeserialize(node, jacksonTypeRef<OperationalDataExportSchedule>()) { it.validate() }
                ?.let {
                    return DataExportScheduleDeleteResponse(
                        operationalDataExportSchedule = it,
                        _json = json,
                    )
                }
            tryDeserialize(node, jacksonTypeRef<UsageDataExportSchedule>()) { it.validate() }
                ?.let {
                    return DataExportScheduleDeleteResponse(
                        usageDataExportSchedule = it,
                        _json = json,
                    )
                }

            return DataExportScheduleDeleteResponse(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<DataExportScheduleDeleteResponse>(DataExportScheduleDeleteResponse::class) {

        override fun serialize(
            value: DataExportScheduleDeleteResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.operationalDataExportSchedule != null ->
                    generator.writeObject(value.operationalDataExportSchedule)
                value.usageDataExportSchedule != null ->
                    generator.writeObject(value.usageDataExportSchedule)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid DataExportScheduleDeleteResponse")
            }
        }
    }
}
