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
class AuthenticationGetBearerTokenResponse
@JsonCreator
private constructor(
    @JsonProperty("access_token")
    @ExcludeMissing
    private val accessToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("expires_in")
    @ExcludeMissing
    private val expiresIn: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("scope") @ExcludeMissing private val scope: JsonField<String> = JsonMissing.of(),
    @JsonProperty("token_type")
    @ExcludeMissing
    private val tokenType: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The access token. */
    fun accessToken(): String = accessToken.getRequired("access_token")

    /** Token expiry time in seconds. */
    fun expiresIn(): Long = expiresIn.getRequired("expires_in")

    /** Not used. */
    fun scope(): Optional<String> = Optional.ofNullable(scope.getNullable("scope"))

    /** The token type, which in this case is "bearer". */
    fun tokenType(): Optional<String> = Optional.ofNullable(tokenType.getNullable("token_type"))

    /** The access token. */
    @JsonProperty("access_token")
    @ExcludeMissing
    fun _accessToken(): JsonField<String> = accessToken

    /** Token expiry time in seconds. */
    @JsonProperty("expires_in") @ExcludeMissing fun _expiresIn(): JsonField<Long> = expiresIn

    /** Not used. */
    @JsonProperty("scope") @ExcludeMissing fun _scope(): JsonField<String> = scope

    /** The token type, which in this case is "bearer". */
    @JsonProperty("token_type") @ExcludeMissing fun _tokenType(): JsonField<String> = tokenType

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AuthenticationGetBearerTokenResponse = apply {
        if (validated) {
            return@apply
        }

        accessToken()
        expiresIn()
        scope()
        tokenType()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthenticationGetBearerTokenResponse]. */
    class Builder internal constructor() {

        private var accessToken: JsonField<String>? = null
        private var expiresIn: JsonField<Long>? = null
        private var scope: JsonField<String> = JsonMissing.of()
        private var tokenType: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            authenticationGetBearerTokenResponse: AuthenticationGetBearerTokenResponse
        ) = apply {
            accessToken = authenticationGetBearerTokenResponse.accessToken
            expiresIn = authenticationGetBearerTokenResponse.expiresIn
            scope = authenticationGetBearerTokenResponse.scope
            tokenType = authenticationGetBearerTokenResponse.tokenType
            additionalProperties =
                authenticationGetBearerTokenResponse.additionalProperties.toMutableMap()
        }

        /** The access token. */
        fun accessToken(accessToken: String) = accessToken(JsonField.of(accessToken))

        /** The access token. */
        fun accessToken(accessToken: JsonField<String>) = apply { this.accessToken = accessToken }

        /** Token expiry time in seconds. */
        fun expiresIn(expiresIn: Long) = expiresIn(JsonField.of(expiresIn))

        /** Token expiry time in seconds. */
        fun expiresIn(expiresIn: JsonField<Long>) = apply { this.expiresIn = expiresIn }

        /** Not used. */
        fun scope(scope: String) = scope(JsonField.of(scope))

        /** Not used. */
        fun scope(scope: JsonField<String>) = apply { this.scope = scope }

        /** The token type, which in this case is "bearer". */
        fun tokenType(tokenType: String) = tokenType(JsonField.of(tokenType))

        /** The token type, which in this case is "bearer". */
        fun tokenType(tokenType: JsonField<String>) = apply { this.tokenType = tokenType }

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

        fun build(): AuthenticationGetBearerTokenResponse =
            AuthenticationGetBearerTokenResponse(
                checkRequired("accessToken", accessToken),
                checkRequired("expiresIn", expiresIn),
                scope,
                tokenType,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthenticationGetBearerTokenResponse && accessToken == other.accessToken && expiresIn == other.expiresIn && scope == other.scope && tokenType == other.tokenType && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accessToken, expiresIn, scope, tokenType, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthenticationGetBearerTokenResponse{accessToken=$accessToken, expiresIn=$expiresIn, scope=$scope, tokenType=$tokenType, additionalProperties=$additionalProperties}"
}
