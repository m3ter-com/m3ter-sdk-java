// File generated from our OpenAPI spec by Stainless.

package com.m3ter.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressTest {

    @Test
    fun create() {
        val address =
            Address.builder()
                .addressLine1("addressLine1")
                .addressLine2("addressLine2")
                .addressLine3("addressLine3")
                .addressLine4("addressLine4")
                .country("country")
                .locality("locality")
                .postCode("postCode")
                .region("region")
                .build()

        assertThat(address.addressLine1()).contains("addressLine1")
        assertThat(address.addressLine2()).contains("addressLine2")
        assertThat(address.addressLine3()).contains("addressLine3")
        assertThat(address.addressLine4()).contains("addressLine4")
        assertThat(address.country()).contains("country")
        assertThat(address.locality()).contains("locality")
        assertThat(address.postCode()).contains("postCode")
        assertThat(address.region()).contains("region")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val address =
            Address.builder()
                .addressLine1("addressLine1")
                .addressLine2("addressLine2")
                .addressLine3("addressLine3")
                .addressLine4("addressLine4")
                .country("country")
                .locality("locality")
                .postCode("postCode")
                .region("region")
                .build()

        val roundtrippedAddress =
            jsonMapper.readValue(jsonMapper.writeValueAsString(address), jacksonTypeRef<Address>())

        assertThat(roundtrippedAddress).isEqualTo(address)
    }
}
