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
import com.m3ter.core.allMaxBy
import com.m3ter.core.getOrThrow
import com.m3ter.errors.M3terInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response representing an operational data export configuration. */
@JsonDeserialize(using = DataExportScheduleCreateResponse.Deserializer::class)
@JsonSerialize(using = DataExportScheduleCreateResponse.Serializer::class)
class DataExportScheduleCreateResponse
private constructor(
    private val operationalDataExportSchedule: OperationalDataExportScheduleResponse? = null,
    private val usageDataExportSchedule: UsageDataExportScheduleResponse? = null,
    private val _json: JsonValue? = null,
) {

    /** Response representing an operational data export configuration. */
    fun operationalDataExportSchedule(): Optional<OperationalDataExportScheduleResponse> =
        Optional.ofNullable(operationalDataExportSchedule)

    /** Response representing an usage schedule configuration. */
    fun usageDataExportSchedule(): Optional<UsageDataExportScheduleResponse> =
        Optional.ofNullable(usageDataExportSchedule)

    fun isOperationalDataExportSchedule(): Boolean = operationalDataExportSchedule != null

    fun isUsageDataExportSchedule(): Boolean = usageDataExportSchedule != null

    /** Response representing an operational data export configuration. */
    fun asOperationalDataExportSchedule(): OperationalDataExportScheduleResponse =
        operationalDataExportSchedule.getOrThrow("operationalDataExportSchedule")

    /** Response representing an usage schedule configuration. */
    fun asUsageDataExportSchedule(): UsageDataExportScheduleResponse =
        usageDataExportSchedule.getOrThrow("usageDataExportSchedule")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            operationalDataExportSchedule != null ->
                visitor.visitOperationalDataExportSchedule(operationalDataExportSchedule)
            usageDataExportSchedule != null ->
                visitor.visitUsageDataExportSchedule(usageDataExportSchedule)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): DataExportScheduleCreateResponse = apply {
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

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: M3terInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitOperationalDataExportSchedule(
                    operationalDataExportSchedule: OperationalDataExportScheduleResponse
                ) = operationalDataExportSchedule.validity()

                override fun visitUsageDataExportSchedule(
                    usageDataExportSchedule: UsageDataExportScheduleResponse
                ) = usageDataExportSchedule.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DataExportScheduleCreateResponse &&
            operationalDataExportSchedule == other.operationalDataExportSchedule &&
            usageDataExportSchedule == other.usageDataExportSchedule
    }

    override fun hashCode(): Int =
        Objects.hash(operationalDataExportSchedule, usageDataExportSchedule)

    override fun toString(): String =
        when {
            operationalDataExportSchedule != null ->
                "DataExportScheduleCreateResponse{operationalDataExportSchedule=$operationalDataExportSchedule}"
            usageDataExportSchedule != null ->
                "DataExportScheduleCreateResponse{usageDataExportSchedule=$usageDataExportSchedule}"
            _json != null -> "DataExportScheduleCreateResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid DataExportScheduleCreateResponse")
        }

    companion object {

        /** Response representing an operational data export configuration. */
        @JvmStatic
        fun ofOperationalDataExportSchedule(
            operationalDataExportSchedule: OperationalDataExportScheduleResponse
        ) =
            DataExportScheduleCreateResponse(
                operationalDataExportSchedule = operationalDataExportSchedule
            )

        /** Response representing an usage schedule configuration. */
        @JvmStatic
        fun ofUsageDataExportSchedule(usageDataExportSchedule: UsageDataExportScheduleResponse) =
            DataExportScheduleCreateResponse(usageDataExportSchedule = usageDataExportSchedule)
    }

    /**
     * An interface that defines how to map each variant of [DataExportScheduleCreateResponse] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        /** Response representing an operational data export configuration. */
        fun visitOperationalDataExportSchedule(
            operationalDataExportSchedule: OperationalDataExportScheduleResponse
        ): T

        /** Response representing an usage schedule configuration. */
        fun visitUsageDataExportSchedule(
            usageDataExportSchedule: UsageDataExportScheduleResponse
        ): T

        /**
         * Maps an unknown variant of [DataExportScheduleCreateResponse] to a value of type [T].
         *
         * An instance of [DataExportScheduleCreateResponse] can contain an unknown variant if it
         * was deserialized from data that doesn't match any known variant. For example, if the SDK
         * is on an older version than the API, then the API may respond with new variants that the
         * SDK is unaware of.
         *
         * @throws M3terInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw M3terInvalidDataException("Unknown DataExportScheduleCreateResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<DataExportScheduleCreateResponse>(
            DataExportScheduleCreateResponse::class
        ) {

        override fun ObjectCodec.deserialize(node: JsonNode): DataExportScheduleCreateResponse {
            val json = JsonValue.fromJsonNode(node)
            val sourceType = json.asObject().getOrNull()?.get("sourceType")?.asString()?.getOrNull()

            when (sourceType) {}

            val bestMatches =
                sequenceOf(
                        tryDeserialize(
                                node,
                                jacksonTypeRef<OperationalDataExportScheduleResponse>(),
                            )
                            ?.let {
                                DataExportScheduleCreateResponse(
                                    operationalDataExportSchedule = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<UsageDataExportScheduleResponse>())
                            ?.let {
                                DataExportScheduleCreateResponse(
                                    usageDataExportSchedule = it,
                                    _json = json,
                                )
                            },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> DataExportScheduleCreateResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<DataExportScheduleCreateResponse>(DataExportScheduleCreateResponse::class) {

        override fun serialize(
            value: DataExportScheduleCreateResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.operationalDataExportSchedule != null ->
                    generator.writeObject(value.operationalDataExportSchedule)
                value.usageDataExportSchedule != null ->
                    generator.writeObject(value.usageDataExportSchedule)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid DataExportScheduleCreateResponse")
            }
        }
    }
}
