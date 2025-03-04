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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class M3terSignedCredentialsResp
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("destination")
    @ExcludeMissing
    private val destination: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<String> = JsonMissing.of(),
    @JsonProperty("version")
    @ExcludeMissing
    private val version: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("apiKey")
    @ExcludeMissing
    private val apiKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("createdBy")
    @ExcludeMissing
    private val createdBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("destinationId")
    @ExcludeMissing
    private val destinationId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("dtCreated")
    @ExcludeMissing
    private val dtCreated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    private val dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    private val lastModifiedBy: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("secret")
    @ExcludeMissing
    private val secret: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The UUID of the entity. */
    fun id(): String = id.getRequired("id")

    /** the system the integration is for */
    fun destination(): String = destination.getRequired("destination")

    /** the type of credentials */
    fun type(): String = type.getRequired("type")

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    fun version(): Long = version.getRequired("version")

    /**
     * The API key provided by m3ter. This key is part of the credential set required for signing
     * requests and authenticating with m3ter services.
     */
    fun apiKey(): Optional<String> = Optional.ofNullable(apiKey.getNullable("apiKey"))

    /** The ID of the user who created this item. */
    fun createdBy(): Optional<String> = Optional.ofNullable(createdBy.getNullable("createdBy"))

    /** the destinationId the integration is for */
    fun destinationId(): Optional<String> =
        Optional.ofNullable(destinationId.getNullable("destinationId"))

    /** The DateTime when this item was created _(in ISO-8601 format)_. */
    fun dtCreated(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtCreated.getNullable("dtCreated"))

    /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
    fun dtLastModified(): Optional<OffsetDateTime> =
        Optional.ofNullable(dtLastModified.getNullable("dtLastModified"))

    /** The ID of the user who last modified this item. */
    fun lastModifiedBy(): Optional<String> =
        Optional.ofNullable(lastModifiedBy.getNullable("lastModifiedBy"))

    /** the name of the credentials */
    fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

    /**
     * The secret associated with the API key. This secret is used in conjunction with the API key
     * to generate a signature for secure authentication.
     */
    fun secret(): Optional<String> = Optional.ofNullable(secret.getNullable("secret"))

    /** The UUID of the entity. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** the system the integration is for */
    @JsonProperty("destination") @ExcludeMissing fun _destination(): JsonField<String> = destination

    /** the type of credentials */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * The version number:
     * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
     *   response.
     * - **Update:** On successful Update, the version is incremented by 1 in the response.
     */
    @JsonProperty("version") @ExcludeMissing fun _version(): JsonField<Long> = version

    /**
     * The API key provided by m3ter. This key is part of the credential set required for signing
     * requests and authenticating with m3ter services.
     */
    @JsonProperty("apiKey") @ExcludeMissing fun _apiKey(): JsonField<String> = apiKey

    /** The ID of the user who created this item. */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /** the destinationId the integration is for */
    @JsonProperty("destinationId")
    @ExcludeMissing
    fun _destinationId(): JsonField<String> = destinationId

    /** The DateTime when this item was created _(in ISO-8601 format)_. */
    @JsonProperty("dtCreated")
    @ExcludeMissing
    fun _dtCreated(): JsonField<OffsetDateTime> = dtCreated

    /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
    @JsonProperty("dtLastModified")
    @ExcludeMissing
    fun _dtLastModified(): JsonField<OffsetDateTime> = dtLastModified

    /** The ID of the user who last modified this item. */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /** the name of the credentials */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * The secret associated with the API key. This secret is used in conjunction with the API key
     * to generate a signature for secure authentication.
     */
    @JsonProperty("secret") @ExcludeMissing fun _secret(): JsonField<String> = secret

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): M3terSignedCredentialsResp = apply {
        if (validated) {
            return@apply
        }

        id()
        destination()
        type()
        version()
        apiKey()
        createdBy()
        destinationId()
        dtCreated()
        dtLastModified()
        lastModifiedBy()
        name()
        secret()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [M3terSignedCredentialsResp].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .destination()
         * .type()
         * .version()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [M3terSignedCredentialsResp]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var destination: JsonField<String>? = null
        private var type: JsonField<String>? = null
        private var version: JsonField<Long>? = null
        private var apiKey: JsonField<String> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var destinationId: JsonField<String> = JsonMissing.of()
        private var dtCreated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var dtLastModified: JsonField<OffsetDateTime> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var secret: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(m3terSignedCredentialsResp: M3terSignedCredentialsResp) = apply {
            id = m3terSignedCredentialsResp.id
            destination = m3terSignedCredentialsResp.destination
            type = m3terSignedCredentialsResp.type
            version = m3terSignedCredentialsResp.version
            apiKey = m3terSignedCredentialsResp.apiKey
            createdBy = m3terSignedCredentialsResp.createdBy
            destinationId = m3terSignedCredentialsResp.destinationId
            dtCreated = m3terSignedCredentialsResp.dtCreated
            dtLastModified = m3terSignedCredentialsResp.dtLastModified
            lastModifiedBy = m3terSignedCredentialsResp.lastModifiedBy
            name = m3terSignedCredentialsResp.name
            secret = m3terSignedCredentialsResp.secret
            additionalProperties = m3terSignedCredentialsResp.additionalProperties.toMutableMap()
        }

        /** The UUID of the entity. */
        fun id(id: String) = id(JsonField.of(id))

        /** The UUID of the entity. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** the system the integration is for */
        fun destination(destination: String) = destination(JsonField.of(destination))

        /** the system the integration is for */
        fun destination(destination: JsonField<String>) = apply { this.destination = destination }

        /** the type of credentials */
        fun type(type: String) = type(JsonField.of(type))

        /** the type of credentials */
        fun type(type: JsonField<String>) = apply { this.type = type }

        /**
         * The version number:
         * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
         *   response.
         * - **Update:** On successful Update, the version is incremented by 1 in the response.
         */
        fun version(version: Long) = version(JsonField.of(version))

        /**
         * The version number:
         * - **Create:** On initial Create to insert a new entity, the version is set at 1 in the
         *   response.
         * - **Update:** On successful Update, the version is incremented by 1 in the response.
         */
        fun version(version: JsonField<Long>) = apply { this.version = version }

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

        /** The ID of the user who created this item. */
        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /** The ID of the user who created this item. */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        /** the destinationId the integration is for */
        fun destinationId(destinationId: String) = destinationId(JsonField.of(destinationId))

        /** the destinationId the integration is for */
        fun destinationId(destinationId: JsonField<String>) = apply {
            this.destinationId = destinationId
        }

        /** The DateTime when this item was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: OffsetDateTime) = dtCreated(JsonField.of(dtCreated))

        /** The DateTime when this item was created _(in ISO-8601 format)_. */
        fun dtCreated(dtCreated: JsonField<OffsetDateTime>) = apply { this.dtCreated = dtCreated }

        /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
        fun dtLastModified(dtLastModified: OffsetDateTime) =
            dtLastModified(JsonField.of(dtLastModified))

        /** The DateTime when this item was last modified _(in ISO-8601 format)_. */
        fun dtLastModified(dtLastModified: JsonField<OffsetDateTime>) = apply {
            this.dtLastModified = dtLastModified
        }

        /** The ID of the user who last modified this item. */
        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /** The ID of the user who last modified this item. */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        /** the name of the credentials */
        fun name(name: String) = name(JsonField.of(name))

        /** the name of the credentials */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun build(): M3terSignedCredentialsResp =
            M3terSignedCredentialsResp(
                checkRequired("id", id),
                checkRequired("destination", destination),
                checkRequired("type", type),
                checkRequired("version", version),
                apiKey,
                createdBy,
                destinationId,
                dtCreated,
                dtLastModified,
                lastModifiedBy,
                name,
                secret,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is M3terSignedCredentialsResp && id == other.id && destination == other.destination && type == other.type && version == other.version && apiKey == other.apiKey && createdBy == other.createdBy && destinationId == other.destinationId && dtCreated == other.dtCreated && dtLastModified == other.dtLastModified && lastModifiedBy == other.lastModifiedBy && name == other.name && secret == other.secret && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, destination, type, version, apiKey, createdBy, destinationId, dtCreated, dtLastModified, lastModifiedBy, name, secret, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "M3terSignedCredentialsResp{id=$id, destination=$destination, type=$type, version=$version, apiKey=$apiKey, createdBy=$createdBy, destinationId=$destinationId, dtCreated=$dtCreated, dtLastModified=$dtLastModified, lastModifiedBy=$lastModifiedBy, name=$name, secret=$secret, additionalProperties=$additionalProperties}"
}
