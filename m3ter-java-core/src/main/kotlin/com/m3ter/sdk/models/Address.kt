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

/** Contact address. */
@NoAutoDetect
class Address
@JsonCreator
private constructor(
    @JsonProperty("addressLine1")
    @ExcludeMissing
    private val addressLine1: JsonField<String> = JsonMissing.of(),
    @JsonProperty("addressLine2")
    @ExcludeMissing
    private val addressLine2: JsonField<String> = JsonMissing.of(),
    @JsonProperty("addressLine3")
    @ExcludeMissing
    private val addressLine3: JsonField<String> = JsonMissing.of(),
    @JsonProperty("addressLine4")
    @ExcludeMissing
    private val addressLine4: JsonField<String> = JsonMissing.of(),
    @JsonProperty("country")
    @ExcludeMissing
    private val country: JsonField<String> = JsonMissing.of(),
    @JsonProperty("locality")
    @ExcludeMissing
    private val locality: JsonField<String> = JsonMissing.of(),
    @JsonProperty("postCode")
    @ExcludeMissing
    private val postCode: JsonField<String> = JsonMissing.of(),
    @JsonProperty("region")
    @ExcludeMissing
    private val region: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun addressLine1(): Optional<String> =
        Optional.ofNullable(addressLine1.getNullable("addressLine1"))

    fun addressLine2(): Optional<String> =
        Optional.ofNullable(addressLine2.getNullable("addressLine2"))

    fun addressLine3(): Optional<String> =
        Optional.ofNullable(addressLine3.getNullable("addressLine3"))

    fun addressLine4(): Optional<String> =
        Optional.ofNullable(addressLine4.getNullable("addressLine4"))

    fun country(): Optional<String> = Optional.ofNullable(country.getNullable("country"))

    fun locality(): Optional<String> = Optional.ofNullable(locality.getNullable("locality"))

    fun postCode(): Optional<String> = Optional.ofNullable(postCode.getNullable("postCode"))

    fun region(): Optional<String> = Optional.ofNullable(region.getNullable("region"))

    @JsonProperty("addressLine1")
    @ExcludeMissing
    fun _addressLine1(): JsonField<String> = addressLine1

    @JsonProperty("addressLine2")
    @ExcludeMissing
    fun _addressLine2(): JsonField<String> = addressLine2

    @JsonProperty("addressLine3")
    @ExcludeMissing
    fun _addressLine3(): JsonField<String> = addressLine3

    @JsonProperty("addressLine4")
    @ExcludeMissing
    fun _addressLine4(): JsonField<String> = addressLine4

    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

    @JsonProperty("postCode") @ExcludeMissing fun _postCode(): JsonField<String> = postCode

    @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Address = apply {
        if (validated) {
            return@apply
        }

        addressLine1()
        addressLine2()
        addressLine3()
        addressLine4()
        country()
        locality()
        postCode()
        region()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Address]. */
    class Builder internal constructor() {

        private var addressLine1: JsonField<String> = JsonMissing.of()
        private var addressLine2: JsonField<String> = JsonMissing.of()
        private var addressLine3: JsonField<String> = JsonMissing.of()
        private var addressLine4: JsonField<String> = JsonMissing.of()
        private var country: JsonField<String> = JsonMissing.of()
        private var locality: JsonField<String> = JsonMissing.of()
        private var postCode: JsonField<String> = JsonMissing.of()
        private var region: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(address: Address) = apply {
            addressLine1 = address.addressLine1
            addressLine2 = address.addressLine2
            addressLine3 = address.addressLine3
            addressLine4 = address.addressLine4
            country = address.country
            locality = address.locality
            postCode = address.postCode
            region = address.region
            additionalProperties = address.additionalProperties.toMutableMap()
        }

        fun addressLine1(addressLine1: String) = addressLine1(JsonField.of(addressLine1))

        fun addressLine1(addressLine1: JsonField<String>) = apply {
            this.addressLine1 = addressLine1
        }

        fun addressLine2(addressLine2: String) = addressLine2(JsonField.of(addressLine2))

        fun addressLine2(addressLine2: JsonField<String>) = apply {
            this.addressLine2 = addressLine2
        }

        fun addressLine3(addressLine3: String) = addressLine3(JsonField.of(addressLine3))

        fun addressLine3(addressLine3: JsonField<String>) = apply {
            this.addressLine3 = addressLine3
        }

        fun addressLine4(addressLine4: String) = addressLine4(JsonField.of(addressLine4))

        fun addressLine4(addressLine4: JsonField<String>) = apply {
            this.addressLine4 = addressLine4
        }

        fun country(country: String) = country(JsonField.of(country))

        fun country(country: JsonField<String>) = apply { this.country = country }

        fun locality(locality: String) = locality(JsonField.of(locality))

        fun locality(locality: JsonField<String>) = apply { this.locality = locality }

        fun postCode(postCode: String) = postCode(JsonField.of(postCode))

        fun postCode(postCode: JsonField<String>) = apply { this.postCode = postCode }

        fun region(region: String) = region(JsonField.of(region))

        fun region(region: JsonField<String>) = apply { this.region = region }

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

        fun build(): Address =
            Address(
                addressLine1,
                addressLine2,
                addressLine3,
                addressLine4,
                country,
                locality,
                postCode,
                region,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Address && addressLine1 == other.addressLine1 && addressLine2 == other.addressLine2 && addressLine3 == other.addressLine3 && addressLine4 == other.addressLine4 && country == other.country && locality == other.locality && postCode == other.postCode && region == other.region && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(addressLine1, addressLine2, addressLine3, addressLine4, country, locality, postCode, region, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Address{addressLine1=$addressLine1, addressLine2=$addressLine2, addressLine3=$addressLine3, addressLine4=$addressLine4, country=$country, locality=$locality, postCode=$postCode, region=$region, additionalProperties=$additionalProperties}"
}
