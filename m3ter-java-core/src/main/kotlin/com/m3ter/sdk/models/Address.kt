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
import com.m3ter.sdk.errors.M3terInvalidDataException
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

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addressLine1(): Optional<String> =
        Optional.ofNullable(addressLine1.getNullable("addressLine1"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addressLine2(): Optional<String> =
        Optional.ofNullable(addressLine2.getNullable("addressLine2"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addressLine3(): Optional<String> =
        Optional.ofNullable(addressLine3.getNullable("addressLine3"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addressLine4(): Optional<String> =
        Optional.ofNullable(addressLine4.getNullable("addressLine4"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun country(): Optional<String> = Optional.ofNullable(country.getNullable("country"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locality(): Optional<String> = Optional.ofNullable(locality.getNullable("locality"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun postCode(): Optional<String> = Optional.ofNullable(postCode.getNullable("postCode"))

    /**
     * @throws M3terInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun region(): Optional<String> = Optional.ofNullable(region.getNullable("region"))

    /**
     * Returns the raw JSON value of [addressLine1].
     *
     * Unlike [addressLine1], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addressLine1")
    @ExcludeMissing
    fun _addressLine1(): JsonField<String> = addressLine1

    /**
     * Returns the raw JSON value of [addressLine2].
     *
     * Unlike [addressLine2], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addressLine2")
    @ExcludeMissing
    fun _addressLine2(): JsonField<String> = addressLine2

    /**
     * Returns the raw JSON value of [addressLine3].
     *
     * Unlike [addressLine3], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addressLine3")
    @ExcludeMissing
    fun _addressLine3(): JsonField<String> = addressLine3

    /**
     * Returns the raw JSON value of [addressLine4].
     *
     * Unlike [addressLine4], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addressLine4")
    @ExcludeMissing
    fun _addressLine4(): JsonField<String> = addressLine4

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [locality].
     *
     * Unlike [locality], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locality") @ExcludeMissing fun _locality(): JsonField<String> = locality

    /**
     * Returns the raw JSON value of [postCode].
     *
     * Unlike [postCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postCode") @ExcludeMissing fun _postCode(): JsonField<String> = postCode

    /**
     * Returns the raw JSON value of [region].
     *
     * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
     */
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

        /** Returns a mutable builder for constructing an instance of [Address]. */
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

        /**
         * Sets [Builder.addressLine1] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addressLine1] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun addressLine1(addressLine1: JsonField<String>) = apply {
            this.addressLine1 = addressLine1
        }

        fun addressLine2(addressLine2: String) = addressLine2(JsonField.of(addressLine2))

        /**
         * Sets [Builder.addressLine2] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addressLine2] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun addressLine2(addressLine2: JsonField<String>) = apply {
            this.addressLine2 = addressLine2
        }

        fun addressLine3(addressLine3: String) = addressLine3(JsonField.of(addressLine3))

        /**
         * Sets [Builder.addressLine3] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addressLine3] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun addressLine3(addressLine3: JsonField<String>) = apply {
            this.addressLine3 = addressLine3
        }

        fun addressLine4(addressLine4: String) = addressLine4(JsonField.of(addressLine4))

        /**
         * Sets [Builder.addressLine4] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addressLine4] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun addressLine4(addressLine4: JsonField<String>) = apply {
            this.addressLine4 = addressLine4
        }

        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        fun locality(locality: String) = locality(JsonField.of(locality))

        /**
         * Sets [Builder.locality] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locality] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locality(locality: JsonField<String>) = apply { this.locality = locality }

        fun postCode(postCode: String) = postCode(JsonField.of(postCode))

        /**
         * Sets [Builder.postCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postCode] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun postCode(postCode: JsonField<String>) = apply { this.postCode = postCode }

        fun region(region: String) = region(JsonField.of(region))

        /**
         * Sets [Builder.region] to an arbitrary JSON value.
         *
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
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

        /**
         * Returns an immutable instance of [Address].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
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
