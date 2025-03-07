// File generated from our OpenAPI spec by Stainless.

package com.m3ter.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DataFieldResponseTest {

    @Test
    fun createDataFieldResponse() {
        val dataFieldResponse =
            DataFieldResponse.builder()
                .category(DataFieldResponse.Category.WHO)
                .code("{1{}}_")
                .name("x")
                .unit("x")
                .build()
        assertThat(dataFieldResponse).isNotNull
        assertThat(dataFieldResponse.category()).isEqualTo(DataFieldResponse.Category.WHO)
        assertThat(dataFieldResponse.code()).isEqualTo("{1{}}_")
        assertThat(dataFieldResponse.name()).isEqualTo("x")
        assertThat(dataFieldResponse.unit()).contains("x")
    }
}
