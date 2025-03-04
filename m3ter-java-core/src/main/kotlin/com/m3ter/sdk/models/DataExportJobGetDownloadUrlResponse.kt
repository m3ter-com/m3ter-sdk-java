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
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/** It contains details for downloading an export file */
@NoAutoDetect
class DataExportJobGetDownloadUrlResponse
@JsonCreator
private constructor(
    @JsonProperty("expirationTime")
    @ExcludeMissing
    private val expirationTime: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The expiration time of the URL */
    fun expirationTime(): Optional<OffsetDateTime> =
        Optional.ofNullable(expirationTime.getNullable("expirationTime"))

    /** The presigned download URL */
    fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

    /** The expiration time of the URL */
    @JsonProperty("expirationTime")
    @ExcludeMissing
    fun _expirationTime(): JsonField<OffsetDateTime> = expirationTime

    /** The presigned download URL */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): DataExportJobGetDownloadUrlResponse = apply {
        if (validated) {
            return@apply
        }

        expirationTime()
        url()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DataExportJobGetDownloadUrlResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DataExportJobGetDownloadUrlResponse]. */
    class Builder internal constructor() {

        private var expirationTime: JsonField<OffsetDateTime> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            dataExportJobGetDownloadUrlResponse: DataExportJobGetDownloadUrlResponse
        ) = apply {
            expirationTime = dataExportJobGetDownloadUrlResponse.expirationTime
            url = dataExportJobGetDownloadUrlResponse.url
            additionalProperties =
                dataExportJobGetDownloadUrlResponse.additionalProperties.toMutableMap()
        }

        /** The expiration time of the URL */
        fun expirationTime(expirationTime: OffsetDateTime) =
            expirationTime(JsonField.of(expirationTime))

        /** The expiration time of the URL */
        fun expirationTime(expirationTime: JsonField<OffsetDateTime>) = apply {
            this.expirationTime = expirationTime
        }

        /** The presigned download URL */
        fun url(url: String) = url(JsonField.of(url))

        /** The presigned download URL */
        fun url(url: JsonField<String>) = apply { this.url = url }

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

        fun build(): DataExportJobGetDownloadUrlResponse =
            DataExportJobGetDownloadUrlResponse(
                expirationTime,
                url,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DataExportJobGetDownloadUrlResponse && expirationTime == other.expirationTime && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(expirationTime, url, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DataExportJobGetDownloadUrlResponse{expirationTime=$expirationTime, url=$url, additionalProperties=$additionalProperties}"
}
