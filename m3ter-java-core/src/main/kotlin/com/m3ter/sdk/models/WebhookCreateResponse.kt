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
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class WebhookCreateResponse
@JsonCreator
private constructor(
    @JsonProperty("credentials")
    @ExcludeMissing
    private val credentials: JsonField<M3terSignedCredentialsReq> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("url") @ExcludeMissing private val url: JsonField<String> = JsonMissing.of(),
    @JsonProperty("active")
    @ExcludeMissing
    private val active: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("code") @ExcludeMissing private val code: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** This schema defines the credentials required for m3ter request signing. */
    fun credentials(): M3terSignedCredentialsReq = credentials.getRequired("credentials")

    fun description(): String = description.getRequired("description")

    fun name(): String = name.getRequired("name")

    /** The URL to which the webhook requests will be sent. */
    fun url(): String = url.getRequired("url")

    fun active(): Optional<Boolean> = Optional.ofNullable(active.getNullable("active"))

    fun code(): Optional<String> = Optional.ofNullable(code.getNullable("code"))

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

    /** This schema defines the credentials required for m3ter request signing. */
    @JsonProperty("credentials")
    @ExcludeMissing
    fun _credentials(): JsonField<M3terSignedCredentialsReq> = credentials

    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /** The URL to which the webhook requests will be sent. */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    @JsonProperty("active") @ExcludeMissing fun _active(): JsonField<Boolean> = active

    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): WebhookCreateResponse = apply {
        if (validated) {
            return@apply
        }

        credentials().validate()
        description()
        name()
        url()
        active()
        code()
        version()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookCreateResponse]. */
    class Builder internal constructor() {

        private var credentials: JsonField<M3terSignedCredentialsReq>? = null
        private var description: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var url: JsonField<String>? = null
        private var active: JsonField<Boolean> = JsonMissing.of()
        private var code: JsonField<String> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(webhookCreateResponse: WebhookCreateResponse) = apply {
            credentials = webhookCreateResponse.credentials
            description = webhookCreateResponse.description
            name = webhookCreateResponse.name
            url = webhookCreateResponse.url
            active = webhookCreateResponse.active
            code = webhookCreateResponse.code
            version = webhookCreateResponse.version
            additionalProperties = webhookCreateResponse.additionalProperties.toMutableMap()
        }

        /** This schema defines the credentials required for m3ter request signing. */
        fun credentials(credentials: M3terSignedCredentialsReq) =
            credentials(JsonField.of(credentials))

        /** This schema defines the credentials required for m3ter request signing. */
        fun credentials(credentials: JsonField<M3terSignedCredentialsReq>) = apply {
            this.credentials = credentials
        }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The URL to which the webhook requests will be sent. */
        fun url(url: String) = url(JsonField.of(url))

        /** The URL to which the webhook requests will be sent. */
        fun url(url: JsonField<String>) = apply { this.url = url }

        fun active(active: Boolean) = active(JsonField.of(active))

        fun active(active: JsonField<Boolean>) = apply { this.active = active }

        fun code(code: String) = code(JsonField.of(code))

        fun code(code: JsonField<String>) = apply { this.code = code }

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(version: Long) = version(JsonField.of(version))

        /**
         * The version number of the entity:
         * - **Create entity:** Not valid for initial insertion of new entity - _do not use for
         *   Create_. On initial Create, version is set at 1 and listed in the response.
         * - **Update Entity:** On Update, version is required and must match the existing version
         *   because a check is performed to ensure sequential versioning is preserved. Version is
         *   incremented by 1 and listed in the response.
         */
        fun version(version: JsonField<Long>) = apply { this.version = version }

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

        fun build(): WebhookCreateResponse =
            WebhookCreateResponse(
                checkRequired("credentials", credentials),
                checkRequired("description", description),
                checkRequired("name", name),
                checkRequired("url", url),
                active,
                code,
                version,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WebhookCreateResponse && credentials == other.credentials && description == other.description && name == other.name && url == other.url && active == other.active && code == other.code && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(credentials, description, name, url, active, code, version, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WebhookCreateResponse{credentials=$credentials, description=$description, name=$name, url=$url, active=$active, code=$code, version=$version, additionalProperties=$additionalProperties}"
}
