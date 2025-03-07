// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.m3ter.sdk.core.Enum
import com.m3ter.sdk.core.ExcludeMissing
import com.m3ter.sdk.core.JsonField
import com.m3ter.sdk.core.JsonMissing
import com.m3ter.sdk.core.JsonValue
import com.m3ter.sdk.core.NoAutoDetect
import com.m3ter.sdk.core.checkRequired
import com.m3ter.sdk.core.immutableEmptyMap
import com.m3ter.sdk.core.toImmutable
import com.m3ter.sdk.errors.M3terInvalidDataException
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class M3terSignedCredentialsRequest
@JsonCreator
private constructor(
    @JsonProperty("apiKey")
    @ExcludeMissing
    private val apiKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("secret")
    @ExcludeMissing
    private val secret: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonProperty("empty") @ExcludeMissing private val empty: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * The API key provided by m3ter. This key is part of the credential set required for signing
     * requests and authenticating with m3ter services.
     */
    fun apiKey(): String = apiKey.getRequired("apiKey")

    /**
     * The secret associated with the API key. This secret is used in conjunction with the API key
     * to generate a signature for secure authentication.
     */
    fun secret(): String = secret.getRequired("secret")

    /**
     * Specifies the authorization type. For this schema, it is exclusively set to
     * M3TER_SIGNED_REQUEST.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * A flag to indicate whether the credentials are empty.
     * - TRUE - empty credentials.
     * - FALSE - credential details required.
     */
    fun empty(): Optional<Boolean> = Optional.ofNullable(empty.getNullable("empty"))

    /**
     * The version number of the entity:
     * - **Create entity:** Not valid for initial insertion of new entity - _do not use for Create_.
     *   On initial Create, version is set at 1 and listed in the response.
     * - **Update Entity:** On Update, version is required and must match the existing version
     *   because a check is performed to ensure sequential versioning is preserved. Version is
     *   incremented by 1 and listed in the response.
     */
    fun version(): Optional<Long> = Optional.ofNullable(version.getNullable("version"))

    /**
     * The API key provided by m3ter. This key is part of the credential set required for signing
     * requests and authenticating with m3ter services.
     */
    @JsonProperty("apiKey") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

    /**
     * The secret associated with the API key. This secret is used in conjunction with the API key
     * to generate a signature for secure authentication.
     */
    @JsonProperty("secret") @ExcludeMissing fun _secret(): JsonField<String> = secret

    /**
     * Specifies the authorization type. For this schema, it is exclusively set to
     * M3TER_SIGNED_REQUEST.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * A flag to indicate whether the credentials are empty.
     * - TRUE - empty credentials.
     * - FALSE - credential details required.
     */
    @JsonProperty("empty") @ExcludeMissing fun _empty(): JsonField<Boolean> = empty

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

    fun validate(): M3terSignedCredentialsRequest = apply {
        if (validated) {
            return@apply
        }

        apiKey()
        secret()
        type()
        empty()
        version()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [M3terSignedCredentialsRequest].
         *
         * The following fields are required:
         * ```java
         * .apiKey()
         * .secret()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [M3terSignedCredentialsRequest]. */
    class Builder internal constructor() {

        private var apiKey: JsonField<String>? = null
        private var secret: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var empty: JsonField<Boolean> = JsonMissing.of()
        private var version: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(m3terSignedCredentialsRequest: M3terSignedCredentialsRequest) = apply {
            apiKey = m3terSignedCredentialsRequest.apiKey
            secret = m3terSignedCredentialsRequest.secret
            type = m3terSignedCredentialsRequest.type
            empty = m3terSignedCredentialsRequest.empty
            version = m3terSignedCredentialsRequest.version
            additionalProperties = m3terSignedCredentialsRequest.additionalProperties.toMutableMap()
        }

        /**
         * The API key provided by m3ter. This key is part of the credential set required for
         * signing requests and authenticating with m3ter services.
         */
        fun apiKey(apiKey: String) = apiKey(JsonField.of(apiKey))

        /**
         * The API key provided by m3ter. This key is part of the credential set required for
         * signing requests and authenticating with m3ter services.
         */
        fun apiKey(apiKey: JsonField<String>) = apply { this.apiKey = apiKey }

        /**
         * The secret associated with the API key. This secret is used in conjunction with the API
         * key to generate a signature for secure authentication.
         */
        fun secret(secret: String) = secret(JsonField.of(secret))

        /**
         * The secret associated with the API key. This secret is used in conjunction with the API
         * key to generate a signature for secure authentication.
         */
        fun secret(secret: JsonField<String>) = apply { this.secret = secret }

        /**
         * Specifies the authorization type. For this schema, it is exclusively set to
         * M3TER_SIGNED_REQUEST.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Specifies the authorization type. For this schema, it is exclusively set to
         * M3TER_SIGNED_REQUEST.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * A flag to indicate whether the credentials are empty.
         * - TRUE - empty credentials.
         * - FALSE - credential details required.
         */
        fun empty(empty: Boolean) = empty(JsonField.of(empty))

        /**
         * A flag to indicate whether the credentials are empty.
         * - TRUE - empty credentials.
         * - FALSE - credential details required.
         */
        fun empty(empty: JsonField<Boolean>) = apply { this.empty = empty }

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

        fun build(): M3terSignedCredentialsRequest =
            M3terSignedCredentialsRequest(
                checkRequired("apiKey", apiKey),
                checkRequired("secret", secret),
                checkRequired("type", type),
                empty,
                version,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * Specifies the authorization type. For this schema, it is exclusively set to
     * M3TER_SIGNED_REQUEST.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val M3_TER_SIGNED_REQUEST = of("M3TER_SIGNED_REQUEST")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            M3_TER_SIGNED_REQUEST
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            M3_TER_SIGNED_REQUEST,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                M3_TER_SIGNED_REQUEST -> Value.M3_TER_SIGNED_REQUEST
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws M3terInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                M3_TER_SIGNED_REQUEST -> Known.M3_TER_SIGNED_REQUEST
                else -> throw M3terInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws M3terInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { M3terInvalidDataException("Value is not a String") }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is M3terSignedCredentialsRequest && apiKey == other.apiKey && secret == other.secret && type == other.type && empty == other.empty && version == other.version && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(apiKey, secret, type, empty, version, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "M3terSignedCredentialsRequest{apiKey=$apiKey, secret=$secret, type=$type, empty=$empty, version=$version, additionalProperties=$additionalProperties}"
}
