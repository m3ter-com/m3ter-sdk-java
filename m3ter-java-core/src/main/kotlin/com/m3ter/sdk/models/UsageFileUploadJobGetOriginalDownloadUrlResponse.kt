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
import java.util.Objects
import java.util.Optional

/** It contains details for downloading a file */
@NoAutoDetect
class UsageFileUploadJobGetOriginalDownloadUrlResponse
@JsonCreator
private constructor(
    @JsonProperty("headers")
    @ExcludeMissing
    private val headers: JsonField<Headers> = JsonMissing.of(),
    @JsonProperty("jobId") @ExcludeMissing private val jobId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The headers */
    fun headers(): Optional<Headers> = Optional.ofNullable(headers.getNullable("headers"))

    /** UUID of the download job */
    fun jobId(): Optional<String> = Optional.ofNullable(jobId.getNullable("jobId"))

    /** The URL */
    fun url(): Optional<String> = Optional.ofNullable(url.getNullable("url"))

    /** The headers */
    @JsonProperty("headers") @ExcludeMissing fun _headers(): JsonField<Headers> = headers

    /** UUID of the download job */
    @JsonProperty("jobId") @ExcludeMissing fun _jobId(): JsonField<String> = jobId

    /** The URL */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): UsageFileUploadJobGetOriginalDownloadUrlResponse = apply {
        if (validated) {
            return@apply
        }

        headers().ifPresent { it.validate() }
        jobId()
        url()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UsageFileUploadJobGetOriginalDownloadUrlResponse]. */
    class Builder internal constructor() {

        private var headers: JsonField<Headers> = JsonMissing.of()
        private var jobId: JsonField<String> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            usageFileUploadJobGetOriginalDownloadUrlResponse:
                UsageFileUploadJobGetOriginalDownloadUrlResponse
        ) = apply {
            headers = usageFileUploadJobGetOriginalDownloadUrlResponse.headers
            jobId = usageFileUploadJobGetOriginalDownloadUrlResponse.jobId
            url = usageFileUploadJobGetOriginalDownloadUrlResponse.url
            additionalProperties =
                usageFileUploadJobGetOriginalDownloadUrlResponse.additionalProperties.toMutableMap()
        }

        /** The headers */
        fun headers(headers: Headers) = headers(JsonField.of(headers))

        /** The headers */
        fun headers(headers: JsonField<Headers>) = apply { this.headers = headers }

        /** UUID of the download job */
        fun jobId(jobId: String) = jobId(JsonField.of(jobId))

        /** UUID of the download job */
        fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

        /** The URL */
        fun url(url: String) = url(JsonField.of(url))

        /** The URL */
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

        fun build(): UsageFileUploadJobGetOriginalDownloadUrlResponse =
            UsageFileUploadJobGetOriginalDownloadUrlResponse(
                headers,
                jobId,
                url,
                additionalProperties.toImmutable(),
            )
    }

    /** The headers */
    @NoAutoDetect
    class Headers
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Headers = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Headers]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(headers: Headers) = apply {
                additionalProperties = headers.additionalProperties.toMutableMap()
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

            fun build(): Headers = Headers(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Headers && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Headers{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is UsageFileUploadJobGetOriginalDownloadUrlResponse && headers == other.headers && jobId == other.jobId && url == other.url && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(headers, jobId, url, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsageFileUploadJobGetOriginalDownloadUrlResponse{headers=$headers, jobId=$jobId, url=$url, additionalProperties=$additionalProperties}"
}
