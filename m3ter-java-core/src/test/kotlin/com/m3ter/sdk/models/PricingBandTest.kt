// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PricingBandTest {

    @Test
    fun createPricingBand() {
        val pricingBand =
            PricingBand.builder()
                .fixedPrice(0.0)
                .lowerLimit(0.0)
                .unitPrice(0.0)
                .id("id")
                .creditTypeId("creditTypeId")
                .build()
        assertThat(pricingBand).isNotNull
        assertThat(pricingBand.fixedPrice()).isEqualTo(0.0)
        assertThat(pricingBand.lowerLimit()).isEqualTo(0.0)
        assertThat(pricingBand.unitPrice()).isEqualTo(0.0)
        assertThat(pricingBand.id()).contains("id")
        assertThat(pricingBand.creditTypeId()).contains("creditTypeId")
    }
}
