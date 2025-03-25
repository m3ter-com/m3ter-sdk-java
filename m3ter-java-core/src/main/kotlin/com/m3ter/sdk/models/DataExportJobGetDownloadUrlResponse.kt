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
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** It contains details for downloading an export file */
class DataExportJobGetDownloadUrlResponse
private constructor(
    private val expirationTime: JsonField<OffsetDateTime>,
    private val url: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("expirationTime")
        @ExcludeMissing
        expirationTime: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
    ) : this(expirationTime, url, mutableMapOf())

    /**
     * The expiration time of the URL
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expirationTime(): Optional<OffsetDateTime> =
        Optional.ofNullable(expirationTime.getNullable("expirationTime"))

    /**
     * The presigned download URL
     *
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

    /**
     * Returns the raw JSON value of [expirationTime].
     *
     * Unlike [expirationTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expirationTime")
    @ExcludeMissing
    fun _expirationTime(): JsonField<OffsetDateTime> = expirationTime

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

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

        /**
         * Sets [Builder.expirationTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expirationTime] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expirationTime(expirationTime: JsonField<OffsetDateTime>) = apply {
            this.expirationTime = expirationTime
        }

        /** The presigned download URL */
        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [DataExportJobGetDownloadUrlResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): DataExportJobGetDownloadUrlResponse =
            DataExportJobGetDownloadUrlResponse(
                expirationTime,
                url,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DataExportJobGetDownloadUrlResponse = apply {
        if (validated) {
            return@apply
        }

        expirationTime()
        url()
        validated = true
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
