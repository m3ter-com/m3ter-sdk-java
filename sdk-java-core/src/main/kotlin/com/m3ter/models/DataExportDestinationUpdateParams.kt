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
 * Update an Export Destination for the given UUID.
 *
 * Currently, two options for setting up Data Export Destinations are available:
 * - S3 buckets on your AWS account.
 * - Buckets in your Google Cloud Storage account.
 *
 * Request and Response schema:
 * - Use the selector under the `destinationType` parameter to expose the relevant request and
 *   response schema for the type of Destination.
 *
 * Request and Response samples:
 * - Use the **Example** selector to show the relevant request and response samples for the type of
 *   Destination.
 */
class DataExportDestinationUpdateParams
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

    fun body(): Body = body

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DataExportDestinationUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .body()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExportDestinationUpdateParams]. */
    class Builder internal constructor() {

        private var orgId: String? = null
        private var id: String? = null
        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dataExportDestinationUpdateParams: DataExportDestinationUpdateParams) =
            apply {
                orgId = dataExportDestinationUpdateParams.orgId
                id = dataExportDestinationUpdateParams.id
                body = dataExportDestinationUpdateParams.body
                additionalHeaders = dataExportDestinationUpdateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    dataExportDestinationUpdateParams.additionalQueryParams.toBuilder()
            }

        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: String?) = apply { this.orgId = orgId }

        /** Alias for calling [Builder.orgId] with `orgId.orElse(null)`. */
        @Deprecated("the org id should be set at the client level instead")
        fun orgId(orgId: Optional<String>) = orgId(orgId.getOrNull())

        fun id(id: String?) = apply { this.id = id }

        /** Alias for calling [Builder.id] with `id.orElse(null)`. */
        fun id(id: Optional<String>) = id(id.getOrNull())

        fun body(body: Body) = apply { this.body = body }

        /**
         * Alias for calling [body] with
         * `Body.ofDataExportDestinationS3Request(dataExportDestinationS3Request)`.
         */
        fun body(dataExportDestinationS3Request: DataExportDestinationS3Request) =
            body(Body.ofDataExportDestinationS3Request(dataExportDestinationS3Request))

        /**
         * Alias for calling [body] with
         * `Body.ofDataExportDestinationGoogleCloudStorageRequest(dataExportDestinationGoogleCloudStorageRequest)`.
         */
        fun body(
            dataExportDestinationGoogleCloudStorageRequest:
                DataExportDestinationGoogleCloudStorageRequest
        ) =
            body(
                Body.ofDataExportDestinationGoogleCloudStorageRequest(
                    dataExportDestinationGoogleCloudStorageRequest
                )
            )

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
         * Returns an immutable instance of [DataExportDestinationUpdateParams].
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
        fun build(): DataExportDestinationUpdateParams =
            DataExportDestinationUpdateParams(
                orgId,
                id,
                checkRequired("body", body),
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

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val dataExportDestinationS3Request: DataExportDestinationS3Request? = null,
        private val dataExportDestinationGoogleCloudStorageRequest:
            DataExportDestinationGoogleCloudStorageRequest? =
            null,
        private val _json: JsonValue? = null,
    ) {

        fun dataExportDestinationS3Request(): Optional<DataExportDestinationS3Request> =
            Optional.ofNullable(dataExportDestinationS3Request)

        fun dataExportDestinationGoogleCloudStorageRequest():
            Optional<DataExportDestinationGoogleCloudStorageRequest> =
            Optional.ofNullable(dataExportDestinationGoogleCloudStorageRequest)

        fun isDataExportDestinationS3Request(): Boolean = dataExportDestinationS3Request != null

        fun isDataExportDestinationGoogleCloudStorageRequest(): Boolean =
            dataExportDestinationGoogleCloudStorageRequest != null

        fun asDataExportDestinationS3Request(): DataExportDestinationS3Request =
            dataExportDestinationS3Request.getOrThrow("dataExportDestinationS3Request")

        fun asDataExportDestinationGoogleCloudStorageRequest():
            DataExportDestinationGoogleCloudStorageRequest =
            dataExportDestinationGoogleCloudStorageRequest.getOrThrow(
                "dataExportDestinationGoogleCloudStorageRequest"
            )

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                dataExportDestinationS3Request != null ->
                    visitor.visitDataExportDestinationS3Request(dataExportDestinationS3Request)
                dataExportDestinationGoogleCloudStorageRequest != null ->
                    visitor.visitDataExportDestinationGoogleCloudStorageRequest(
                        dataExportDestinationGoogleCloudStorageRequest
                    )
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitDataExportDestinationS3Request(
                        dataExportDestinationS3Request: DataExportDestinationS3Request
                    ) {
                        dataExportDestinationS3Request.validate()
                    }

                    override fun visitDataExportDestinationGoogleCloudStorageRequest(
                        dataExportDestinationGoogleCloudStorageRequest:
                            DataExportDestinationGoogleCloudStorageRequest
                    ) {
                        dataExportDestinationGoogleCloudStorageRequest.validate()
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
                    override fun visitDataExportDestinationS3Request(
                        dataExportDestinationS3Request: DataExportDestinationS3Request
                    ) = dataExportDestinationS3Request.validity()

                    override fun visitDataExportDestinationGoogleCloudStorageRequest(
                        dataExportDestinationGoogleCloudStorageRequest:
                            DataExportDestinationGoogleCloudStorageRequest
                    ) = dataExportDestinationGoogleCloudStorageRequest.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && dataExportDestinationS3Request == other.dataExportDestinationS3Request && dataExportDestinationGoogleCloudStorageRequest == other.dataExportDestinationGoogleCloudStorageRequest /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(dataExportDestinationS3Request, dataExportDestinationGoogleCloudStorageRequest) /* spotless:on */

        override fun toString(): String =
            when {
                dataExportDestinationS3Request != null ->
                    "Body{dataExportDestinationS3Request=$dataExportDestinationS3Request}"
                dataExportDestinationGoogleCloudStorageRequest != null ->
                    "Body{dataExportDestinationGoogleCloudStorageRequest=$dataExportDestinationGoogleCloudStorageRequest}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            @JvmStatic
            fun ofDataExportDestinationS3Request(
                dataExportDestinationS3Request: DataExportDestinationS3Request
            ) = Body(dataExportDestinationS3Request = dataExportDestinationS3Request)

            @JvmStatic
            fun ofDataExportDestinationGoogleCloudStorageRequest(
                dataExportDestinationGoogleCloudStorageRequest:
                    DataExportDestinationGoogleCloudStorageRequest
            ) =
                Body(
                    dataExportDestinationGoogleCloudStorageRequest =
                        dataExportDestinationGoogleCloudStorageRequest
                )
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitDataExportDestinationS3Request(
                dataExportDestinationS3Request: DataExportDestinationS3Request
            ): T

            fun visitDataExportDestinationGoogleCloudStorageRequest(
                dataExportDestinationGoogleCloudStorageRequest:
                    DataExportDestinationGoogleCloudStorageRequest
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
                val destinationType =
                    json.asObject().getOrNull()?.get("destinationType")?.asString()?.getOrNull()

                when (destinationType) {}

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<DataExportDestinationS3Request>())
                                ?.let { Body(dataExportDestinationS3Request = it, _json = json) },
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<DataExportDestinationGoogleCloudStorageRequest>(),
                                )
                                ?.let {
                                    Body(
                                        dataExportDestinationGoogleCloudStorageRequest = it,
                                        _json = json,
                                    )
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
                    value.dataExportDestinationS3Request != null ->
                        generator.writeObject(value.dataExportDestinationS3Request)
                    value.dataExportDestinationGoogleCloudStorageRequest != null ->
                        generator.writeObject(value.dataExportDestinationGoogleCloudStorageRequest)
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

        return /* spotless:off */ other is DataExportDestinationUpdateParams && orgId == other.orgId && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(orgId, id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DataExportDestinationUpdateParams{orgId=$orgId, id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
