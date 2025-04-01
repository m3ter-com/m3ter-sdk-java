// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.m3ter.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PricingBandTest {

    @Test
    fun create() {
        val pricingBand =
            PricingBand.builder()
                .fixedPrice(0.0)
                .lowerLimit(0.0)
                .unitPrice(0.0)
                .id("id")
                .creditTypeId("creditTypeId")
                .build()

        assertThat(pricingBand.fixedPrice()).isEqualTo(0.0)
        assertThat(pricingBand.lowerLimit()).isEqualTo(0.0)
        assertThat(pricingBand.unitPrice()).isEqualTo(0.0)
        assertThat(pricingBand.id()).contains("id")
        assertThat(pricingBand.creditTypeId()).contains("creditTypeId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pricingBand =
            PricingBand.builder()
                .fixedPrice(0.0)
                .lowerLimit(0.0)
                .unitPrice(0.0)
                .id("id")
                .creditTypeId("creditTypeId")
                .build()

        val roundtrippedPricingBand =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pricingBand),
                jacksonTypeRef<PricingBand>(),
            )

        assertThat(roundtrippedPricingBand).isEqualTo(pricingBand)
    }
}
